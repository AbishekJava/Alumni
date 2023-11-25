import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AlumniService } from 'src/app/services/alumni.service';

@Component({
  selector: 'app-addjob',
  templateUrl: './addjob.component.html',
  styleUrls: ['./addjob.component.css']
})
export class AddjobComponent {

  jobupdateform!:FormGroup
  constructor(private alumniService:AlumniService,private fb:FormBuilder,private route:Router){}

  ngOnInit()
  {
    this.jobupdateform=this.fb.group({
      companyname:[null,Validators.required],
      vacant:[null,Validators.required],
      workmode:[null,Validators.required],
      edu:[null,Validators.required],
      experie:[null,Validators.required],
      skills:[null,Validators.required],
      salary:[null,Validators.required],
      location:[null,Validators.required],
      lastdate:[null,Validators.required],
      link:[null,Validators.required]
    })
  }

  updateJobs()
  {
    this.alumniService.updatedJobs(this.jobupdateform.value).subscribe((res)=>{
      alert("Job is Successfully Updated");
      console.log(res);
      this.route.navigateByUrl("/jobs");
    })
  }
}
