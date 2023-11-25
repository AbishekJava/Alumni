import { Component } from '@angular/core';
import { AlumniService } from '../services/alumni.service';

@Component({
  selector: 'app-jobs',
  templateUrl: './jobs.component.html',
  styleUrls: ['./jobs.component.css']
})
export class JobsComponent {
  jobs: any=[]
  service: any;
  total: number = 0;


  constructor(private alumniService:AlumniService){}

  ngOnInit()
  {
    this.listjobs();
  }


  listjobs()
  {
    this.alumniService.getJobs().subscribe((res)=>{
      console.log(res)
      this.jobs=res;
      this.total = this.jobs.length;
    })
  }

  deleteJobs(sno:any)
  {
    //console.log(id)
    this.alumniService.deleteJobs(sno).subscribe((res: any)=>{
      console.log(res)
      this.listjobs();
    })
  }
  getTotalList(): number {
    return this.total;
  }

}
