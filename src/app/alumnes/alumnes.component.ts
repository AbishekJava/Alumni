import { Component } from '@angular/core';
import { AlumniService } from '../services/alumni.service';

@Component({
  selector: 'app-alumnes',
  templateUrl: './alumnes.component.html',
  styleUrls: ['./alumnes.component.css']
})
export class AlumnesComponent {
  alumni: any[] = [];
  total: number = 0; 

  constructor(private alumniService: AlumniService) {}

  ngOnInit() {
    this.listAlumni();
  }

  listAlumni() {
    this.alumniService.getalumniList().subscribe((res) => {
      console.log(res);
      this.alumni = res;
      this.total = this.alumni.length;
    });
  }

  
  getTotalAlumni(): number {
    return this.total;
  }
}