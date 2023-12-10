import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {
  isStatus: boolean=false;
  constructor(private route:Router){
  this.isStatus=true;
  }

  logout(){
    sessionStorage.clear();
    this.route.navigate([""]);
  }
}
