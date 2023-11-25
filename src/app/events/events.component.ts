import { Component } from '@angular/core';
import { AlumniService } from '../services/alumni.service';

@Component({
  selector: 'app-events',
  templateUrl: './events.component.html',
  styleUrls: ['./events.component.css']
})
export class EventsComponent {

  event: any=[]

  constructor(private alumniService:AlumniService){}


  ngOnInit()
  {
    this.listevent();
  }


  listevent()
  {
    this.alumniService.geteventList().subscribe((res)=>{
      console.log(res)
      this.event=res;
    })
  }
}
