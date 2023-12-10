import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'myapp';
  parent:string='i am parent';
  parentObj={'id':10,'name':'javeed'};
  recievedata(data:any){
        console.log(data);
  }
}
