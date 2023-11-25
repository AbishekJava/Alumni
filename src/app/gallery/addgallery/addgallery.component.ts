import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AlumniService } from 'src/app/services/alumni.service';

@Component({
  selector: 'app-addgallery',
  templateUrl: './addgallery.component.html',
  styleUrls: ['./addgallery.component.css']
})
export class AddgalleryComponent {

  galleryupdateform!:FormGroup
  constructor(private alumniService:AlumniService,private fb:FormBuilder,private route:Router){}

  ngOnInit()
  {
    this.galleryupdateform=this.fb.group({
      imageurl:['',Validators.required]
    })
  }

  updategallery()
  {
    this.alumniService.updategallery(this.galleryupdateform.value).subscribe((res)=>{
      alert("updated successfully");
      console.log(res);
      this.route.navigateByUrl("/gallery");
    })
  }
}
