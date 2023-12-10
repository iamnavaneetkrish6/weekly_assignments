import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Admin } from '../model/Admin';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  constructor(private http:HttpClient) { }


    baseURL:string = 'http://localhost:8080/api/admin/';

    getAll():Observable<Admin[]>{

        return this.http.get<Admin[]>(this.baseURL+"getalladmin");


    }

    insert(body:Admin):Observable<Admin>{

      console.log(body);

        return this.http.post<Admin>(this.baseURL+"addadmin",body);

    }

    delete(adminId:number):Observable<string>{

      return  this.http.delete<string>(this.baseURL+`deleteadmin/${adminId}`);

    }


    // find(data:string):Observable<Admin[]>{


    //   console.log(data)
    //  return this.http.get<Admin[]>(this.baseURL+`get/salary/${data}`);

    // }


}
