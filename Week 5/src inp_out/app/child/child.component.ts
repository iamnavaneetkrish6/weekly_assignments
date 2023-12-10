import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit{
  @Input()
  parentInput:string="";
 
 @Output()
 childoutput:EventEmitter<String>=new EventEmitter();

 childdata:string='i am child';

 senddata(){
   this.childoutput.emit(this.childdata)
 }

  ngOnInit(): void {
     console.log(this.parentInput)
  }
 
}
