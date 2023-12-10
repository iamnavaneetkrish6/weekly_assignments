import { Component, OnInit } from '@angular/core';
import { UserRegistrationDTO } from 'src/app/model/UserRegistrationDTO';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-viewuser',
  templateUrl: './viewuser.component.html',
  styleUrls: ['./viewuser.component.css']
})
export class ViewuserComponent implements OnInit {



  userDetails!: UserRegistrationDTO[];

  constructor(private service:LoginService){}
  ngOnInit(): void {
      
     this.service.getUserDetails().subscribe((data)=>{

      this.userDetails=data;

     })
  }
    
   

   

}
