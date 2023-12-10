import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, catchError} from 'rxjs';
import { Employee } from './employee';




@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
// HttpClient service
  constructor(private http:HttpClient) { }

  url:string = "http://localhost:3000/employees"

  getAll():Observable<Employee[]>{

   return   this.http.get<Employee[]>(this.url);  // all http methods return Observables


  }


  insert(empObj:Employee){

    console.log(empObj)
    return  this.http.post<Employee>(this.url,empObj).subscribe( (data:Employee) => {console.log('data from post '+data)});


  }
  get(id:number):Observable<Employee>{
    return this.http.get<Employee>(this.url+id);
  }

  update(empObj:Employee){

      

    console.log(empObj)
    this.http.put<Employee>(this.url+empObj.id,empObj)
    .subscribe( (data:Employee) => {console.log('data from put '+data)});
    }



}



