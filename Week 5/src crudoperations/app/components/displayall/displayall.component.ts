import { Component } from '@angular/core';
import { Admin } from 'src/app/model/Admin';
import { AdminService } from 'src/app/services/Admin.service';

@Component({
  selector: 'app-displayall',
  templateUrl: './displayall.component.html',
  styleUrls: ['./displayall.component.css']
})
export class DisplayallComponent {

    adminList:Admin[] = [];

    constructor(private admin:AdminService){}

  getAllEmployees(){
    
      this.admin.getAll().subscribe( 
                                (list)=>{ this.adminList = list;  console.log(list)}
                                
                                  );

          

 }

  deleteById(adminId:number){

        this.admin.delete(adminId).subscribe( (msg)=>{ console.log("Deleted "+msg);});

      
        // this.getAllEmployees(); // to refresh list again

  }


}