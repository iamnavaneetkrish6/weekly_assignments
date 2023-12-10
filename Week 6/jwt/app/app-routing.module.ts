import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { FlightComponent } from './components/flight/flight.component';
import { ViewuserComponent } from './components/viewuser/viewuser.component';
import { HomeComponent } from './components/home/home.component';
import { SignupComponent } from './components/signup/signup.component';
import { LoginComponent } from './components/login/login.component';
import { ViewflightownerComponent } from './components/viewflightowner/viewflightowner.component';
import { EditadminComponent } from './components/editadmin/editadmin.component';

const routes: Routes = [
 {path:'',component:HomeComponent},
 { path: 'dashboard',
  component: DashboardComponent,
  children: [
    { path: 'flight', component: FlightComponent },
    { path: 'user', component: ViewuserComponent },
    {path:'flightowner',component:ViewflightownerComponent},
    {path:'editadmin',component:EditadminComponent}
  ]
},
  {path:'signup',component:SignupComponent},
  {path:'login',component:LoginComponent},
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
