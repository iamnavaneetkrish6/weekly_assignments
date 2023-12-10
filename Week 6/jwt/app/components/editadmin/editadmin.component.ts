import { Component, OnInit } from '@angular/core';
import { LoginComponent } from '../login/login.component';
import { LoginService } from 'src/app/services/login.service';
import { AdminDTO } from 'src/app/model/AdminDTO';

@Component({
  selector: 'app-editadmin',
  templateUrl: './editadmin.component.html',
  styleUrls: ['./editadmin.component.css']
})
export class EditadminComponent implements OnInit {
  constructor(private service:LoginService){}
  admin!:AdminDTO;
  ngOnInit(): void {
    let adminId=sessionStorage.getItem("adminid");
    this.service.getAdminDetailsById(Number(adminId)).subscribe((data)=>{
    this.admin=data;
    console.log(this.admin);
   })


  }
    

   

}
