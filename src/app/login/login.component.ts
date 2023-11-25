import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AlumniService } from '../services/alumni.service';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent implements OnInit {
  loginForm!: FormGroup;
  formAlert = false;
  loginError!:string;


  constructor(
    private formBuilder: FormBuilder,
    private router: Router,
    private loginService: AlumniService
  ) { }

  ngOnInit(): void {
    this.loginForm = this.formBuilder.group({
      emailId: [' ', [Validators.required, Validators.email]],
      password: [' ', Validators.required]
    });
  }

  login() {
    if (this.loginForm.valid) {
      this.loginService.userAuth(this.loginForm.value.emailId).subscribe((res) => {
        console.log(res.password);
        console.log(res.emailId);
        console.log(this.loginForm.value.emailId);
        console.log(this.loginForm.value.password);
        console.log(res)

        if (res) {

          if (
            this.loginForm.value.emailId === res.emailId &&
            this.loginForm.value.password === res.password
          )
            //sessionStorage.setItem('emailId', JSON.stringify(res));

           this.router.navigateByUrl("/home");
           else{
            this.loginError = 'Invalid email or password';
           }
        }
      })
    } else {
      this.formAlert = true;
  }
    
}
} 