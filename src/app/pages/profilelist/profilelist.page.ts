import { Component, OnInit } from '@angular/core';
import { profiles } 
from '../profile/profile.page';

@Component({
  selector: 'app-profilelist',
  templateUrl: './profilelist.page.html',
  styleUrls: ['./profilelist.page.scss'],
})
export class ProfilelistPage implements OnInit {

  constructor() { }
  _profiles = profiles;
  ngOnInit() {
  }

}
