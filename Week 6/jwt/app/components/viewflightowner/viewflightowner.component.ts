import { Component, OnInit } from '@angular/core';
import { FlightOwnerDTO } from 'src/app/model/FlightOwnerDTO';
import { LoginService } from 'src/app/services/login.service';
import { __importDefault } from 'tslib';

@Component({
  selector: 'app-viewflightowner',
  templateUrl: './viewflightowner.component.html',
  styleUrls: ['./viewflightowner.component.css']
})
export class ViewflightownerComponent implements OnInit{
   flightOwner!:FlightOwnerDTO[];

   constructor(private service:LoginService){

   }
  ngOnInit(): void {
    this.service.getFlightOwner().subscribe((response)=>{
      this.flightOwner=response;
    })
  }
   




}
