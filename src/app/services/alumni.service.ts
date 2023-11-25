import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
const BASIC_PATH=["http://localhost:8080/"]
@Injectable({
  providedIn: 'root'
})
export class AlumniService {
  valid: any;


  constructor(private httpClient:HttpClient) { }


  loginPage(credentials:any): Observable<any>
 {
    return this.httpClient.post(BASIC_PATH + "alumni/login", credentials);
  }
  registerpage(alumni:any):Observable<any>
  {
    return this.httpClient.post(BASIC_PATH+"alumni/registration",alumni)
  }
  getalumniList():Observable<any>
  {
    return this.httpClient.get(BASIC_PATH+"alumni/all")
  }
  geteventList():Observable<any>
  {
    return this.httpClient.get(BASIC_PATH+"alumni/event")
  }
  updatedJobs(jobs:any): Observable<any>{
    return this.httpClient.post(BASIC_PATH+"alumni/jobs/add",jobs)
  }
  getJobs():Observable<any>
  {
    return this.httpClient.get(BASIC_PATH+"alumni/jobs")
  }
  deleteJobs(sno:any): Observable<any>{
    return this.httpClient.delete(BASIC_PATH+"alumni/jobs/del/"+sno)
  }
  getgallery():Observable<any>
  {
    return this.httpClient.get(BASIC_PATH+"alumni/gallery")
  }
  updategallery(gallery:any): Observable<any>{
    return this.httpClient.post(BASIC_PATH+"alumni/gallery/add",gallery)
  }
  userAuth(email:string):Observable<any>{
    return this.httpClient.get(BASIC_PATH+"alumni/user/"+email)
  }
}
