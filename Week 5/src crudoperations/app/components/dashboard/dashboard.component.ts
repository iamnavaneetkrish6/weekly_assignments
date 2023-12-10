import { Component } from '@angular/core';
import { ActivatedRoute, Route, Router } from '@angular/router';
import { Admin } from 'src/app/model/Admin';
import { AdminService } from 'src/app/services/Admin.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent {

   

    data:string = '';

    constructor(private empService:AdminService,private router:Router){}
   
      find(searchData:any){

          this.router.navigate(['/search/'+searchData.form.value.data])

          console.log(searchData.form.value.data);
          

      }




}
