import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { AlumniService } from '../services/alumni.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {

  registerform!:FormGroup
  constructor(private alumniService:AlumniService,private fb:FormBuilder,private route:Router){}

  ngOnInit()
  {
    this.registerform=this.fb.group({
      registerId:[null,Validators.required],
      username:[null,Validators.required],
      password:[null,Validators.required],
      emailId:[null,Validators.required],
      mobilenumber:[null,Validators.required],
      city:[null,Validators.required],
      currentposition:[null,Validators.required],
      graduationyear:[null,Validators.required],
      imageurl:[null,Validators.required]
    })
  }

  Registeration()
  {
    this.alumniService.registerpage(this.registerform.value).subscribe((res)=>{
      alert("Registered in successfully");
      console.log(res);
      this.route.navigateByUrl("");
    })
  }
}
