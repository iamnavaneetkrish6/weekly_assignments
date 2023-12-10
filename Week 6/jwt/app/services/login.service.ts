import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Authrequest } from '../model/AuthRequest';
import { Observable } from 'rxjs';
import { UserRegistrationDTO } from '../model/UserRegistrationDTO';
import { FlightOwnerDTO } from '../model/FlightOwnerDTO';
import { AdminDTO } from '../model/AdminDTO';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  ROOT_URL:String="http://localhost:8080";

  constructor(private http:HttpClient) { }
  token:any=sessionStorage.getItem("jwttoken");
  tokenString = "Bearer "+this.token;

  getToken(data:Authrequest):Observable<String>{
   return  this.http.post(this.ROOT_URL+"/api/v1/login/userlogin",data,{ responseType: 'text' });
  }

  getRole(name:string){
    return this.http.get(this.ROOT_URL+`/api/v1/login/getrole/${name}`,{ responseType: 'text' });
  }
  getId(name:String){
    return this.http.get(this.ROOT_URL+`/api/v1/login/getid/${name}`);
  }
  
  getUserDetails():Observable<UserRegistrationDTO []>{
     
      let token:any=sessionStorage.getItem("jwttoken");
      let tokenString = "Bearer "+token;
      const headers =  new HttpHeaders().set("Authorization",tokenString);
      console.log(headers);
       return this.http.get<UserRegistrationDTO []>(this.ROOT_URL+"/api/v1/user/getallusers",{headers});
  }
  addFlightOwner(data:FlightOwnerDTO):Observable<FlightOwnerDTO>{
     let token:any=sessionStorage.getItem("jwttoken");
      let tokenString = "Bearer "+token;
      const headers =  new HttpHeaders().set("Authorization",tokenString);
      return this.http.post<FlightOwnerDTO>(this.ROOT_URL+"/api/v1/flightowner/addflightowner",data,{headers})
  }

  getFlightOwner():Observable<FlightOwnerDTO[]>{
    let token:any=sessionStorage.getItem("jwttoken");
      let tokenString = "Bearer "+token;
      const headers =  new HttpHeaders().set("Authorization",tokenString);
      return this.http.get<FlightOwnerDTO []>(this.ROOT_URL+"/api/v1/flightowner/getallflightowner",{headers});
  }

  getAdminDetailsById(adminId:number):Observable <AdminDTO>{
    let token:any=sessionStorage.getItem("jwttoken");
    let tokenString = "Bearer "+token;
    const headers =  new HttpHeaders().set("Authorization",tokenString);
    console.log(headers);
    return this.http.get<AdminDTO>(this.ROOT_URL+`/api/v1/admin/getadminbyid/${adminId}`,{headers});
  }
}
