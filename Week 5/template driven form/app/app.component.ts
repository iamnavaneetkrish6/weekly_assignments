import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'myapp';
  email:string='';
  password:string='';
  flightid:number=0;
  flightname:string='';
  fare:number=0;
  status=false;
  readFormData(data:any){
    console.log(data.form.value);

  }
  readFlightData(info:any){
    console.log(info.form.value);
  }
}
