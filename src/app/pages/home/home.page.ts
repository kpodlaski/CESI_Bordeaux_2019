import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  constructor(public router: Router) {}

  login(info){
    console.log(info);
    this.router.navigateByUrl("profile/"+info.login+"/"+info.pass);
  }

}
