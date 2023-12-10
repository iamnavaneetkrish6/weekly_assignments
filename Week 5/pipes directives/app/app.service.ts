import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AppService {

  data=[
    {"pid":101,"pname":"mobile","price":1000},
    {"pid":102,"pname":"tab","price":1000}
  ]
  
  
  
  constructor() { }


  getAllData(){
    return this.data;
  }
}
