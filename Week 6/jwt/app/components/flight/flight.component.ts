import { Component } from '@angular/core';
import { FlightOwnerDTO } from 'src/app/model/FlightOwnerDTO';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-flight',
  templateUrl: './flight.component.html',
  styleUrls: ['./flight.component.css']
})
export class FlightComponent {
  flightOwnerDTO: FlightOwnerDTO=new FlightOwnerDTO();
  constructor(private service:LoginService){}
  addFlightOwner(data:any){
    this.service.addFlightOwner(data.form.value).subscribe((response)=>{
        this.flightOwnerDTO=response;
        console.log(this.flightOwnerDTO);
    })
  }
}
