import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { PlayerDTO } from '../model/player-dto';

@Injectable({
  providedIn: 'root'
})
export class CricketServiceService {

  constructor(private http:HttpClient) { }


  baseURL:string = 'http://localhost:8485/api/v1/playerinfo/';

  getAll(): Observable<string[]> {
    return this.http.get<string[]>(this.baseURL + "getall");
  }
  
}
