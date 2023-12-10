import { Component } from '@angular/core';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'myapp';
  name:string="uday";
  age:number=20;
  constructor(private route:Router){

  }
  onClick(){
     this.route.navigate(["about"]);
  }
}
