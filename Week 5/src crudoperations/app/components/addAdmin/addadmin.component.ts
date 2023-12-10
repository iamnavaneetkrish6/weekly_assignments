import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Admin } from 'src/app/model/Admin';
import { AdminService } from 'src/app/services/Admin.service';

@Component({
  selector: 'app-addAdmin',
  templateUrl: './addAdmin.component.html',
  styleUrls: ['./addAdmin.component.css']
})
export class AddAdminComponent {

   constructor(private  adminService:AdminService){}

  insertAdmin(data:Admin){
    
        this.adminService.insert(data)
        .subscribe(
          (admin)=>{console.log('Added Admin is: '+admin);}
          );


       

  }

}
