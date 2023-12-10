import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
   
  constructor(private service:LoginService, private route:Router){}
  
  login(data:any){
    this.service.getToken(data.form.value).subscribe((token)=>{
     console.log(token);
     console.log(typeof token);
     if(token){
      this.service.getRole(data.form.value.username).subscribe((role)=>{
      sessionStorage.setItem("jwttoken", token.toString());
      sessionStorage.setItem("status", true.valueOf.toString());
      this.route.navigate(['dashboard']);
      });
      this.service.getId(data.form.value.username).subscribe((id)=>{
        console.log(id);
        sessionStorage.setItem("adminid",id.toString());
      })
     }
     else{
      console.log("error");
     }
    });
   }
}
