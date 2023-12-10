import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Admin } from 'src/app/model/Admin';
import { AdminService } from 'src/app/services/Admin.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit{

  empSearchList:Admin[] =[];

    constructor(private route:ActivatedRoute, private admin:AdminService){}
 
    ngOnInit(): void {
     
      //this.find();
  }
   
     searchInput:string = '';

    // find(){

    //       // Here we search Admins records , whose salary is greater than input = 15000 or input = 50000

    //     this.route.params.subscribe( (param)=>{ this.searchInput = param['input']});

    //     this.admin.find(this.searchInput).subscribe( (list)=> {this.empSearchList = list;console.log('list '+list)});
       
    //     console.log('serached data '+this.empSearchList);

    // }

    

}
