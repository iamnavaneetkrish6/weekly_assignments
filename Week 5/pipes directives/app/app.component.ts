import { Component, OnInit } from '@angular/core';
import { AppService } from './app.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'myapp';
  salary=99000;
  mydate:Date=new Date();

  productList :any=[];
 constructor(private service:AppService){

 }

ngOnInit():void{
}
  getAllProducts(){
    this.productList= this.service.getAllData();
  }
}
