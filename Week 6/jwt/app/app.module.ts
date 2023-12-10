import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {FormsModule}   from '@angular/forms'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { HeaderComponent } from './components/header/header.component';
import { FlightComponent } from './components/flight/flight.component';
import { ViewuserComponent } from './components/viewuser/viewuser.component';
import { SignupComponent } from './components/signup/signup.component';
import { LoginComponent } from './components/login/login.component';
import{HttpClientModule} from '@angular/common/http';
import { ViewflightownerComponent } from './components/viewflightowner/viewflightowner.component';
import { EditadminComponent } from './components/editadmin/editadmin.component';
@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    DashboardComponent,
    HeaderComponent,
    FlightComponent,
    ViewuserComponent,
    SignupComponent,
    LoginComponent,
    ViewflightownerComponent,
    EditadminComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
