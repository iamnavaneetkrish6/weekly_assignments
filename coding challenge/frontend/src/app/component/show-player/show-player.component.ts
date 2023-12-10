import { ChangeDetectorRef, Component, NgZone } from '@angular/core';
import { PlayerDTO } from 'src/app/model/player-dto';
import { CricketServiceService } from 'src/app/service/cricket-service.service';

@Component({
  selector: 'app-show-player',
  templateUrl: './show-player.component.html',
  styleUrls: ['./show-player.component.css']
})
export class ShowPlayerComponent {

constructor(private cricket:CricketServiceService){}

ngOnInit(): void {
  }



playerList: string[] = [];


getAllPlayer() {
  this.cricket.getAll().subscribe(
    (list) => {
      this.playerList = list;
      
    },
    error => {
      console.error('Error fetching player data:', error);
    }
  );
}


}
 


