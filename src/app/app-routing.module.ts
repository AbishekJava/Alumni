import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { GalleryComponent } from './gallery/gallery.component';
import { JobsComponent } from './jobs/jobs.component';
import { LogoutComponent } from './logout/logout.component';
import { RegisterComponent } from './register/register.component';
import { NavbarComponent } from './navbar/navbar.component';
import { LoginComponent } from './login/login.component';
import { AlumnesComponent } from './alumnes/alumnes.component';
import { AddjobComponent } from './jobs/addjob/addjob.component';
import { AddgalleryComponent } from './gallery/addgallery/addgallery.component';
import { AddeventComponent } from './events/addevent/addevent.component';
import { EventsComponent } from './events/events.component';

const routes: Routes = [
  {path:"home",component:HomeComponent},
  {path:"gallery",component:GalleryComponent},
  {path:"jobs",component:JobsComponent},
  {path:"events",component:EventsComponent},  
  {path:"register",component:RegisterComponent},
  {path:"navbar",component:NavbarComponent},
  {path:"",component:LoginComponent},
  {path:"alumns",component:AlumnesComponent},
  {path:"addjob",component:AddjobComponent},
  {path:"addgallery",component:AddgalleryComponent},
  {path:"addevent",component:AddeventComponent},
  

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
