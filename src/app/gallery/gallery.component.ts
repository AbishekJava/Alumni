import { Component } from '@angular/core';
import { AlumniService } from '../services/alumni.service';

@Component({
  selector: 'app-gallery',
  templateUrl: './gallery.component.html',
  styleUrls: ['./gallery.component.css']
})
export class GalleryComponent {
  gallery: any=[]

  constructor(private alumniService:AlumniService){}

  ngOnInit()
  {
    this. listgallery();
  }


  listgallery()
  {
    this.alumniService.getgallery().subscribe((res)=>{
      console.log(res)
      this.gallery=res;
    })
  }
}
