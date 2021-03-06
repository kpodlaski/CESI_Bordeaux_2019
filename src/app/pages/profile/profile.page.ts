import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, ActivationEnd } from '@angular/router';

export const profiles = [
  {name:'Alice', pass:'Alice', desc: "Rabbit in the hole"},
  {name:'Jimmie', pass:'Jimmie', desc: "Some oher info"},
]

@Component({
  selector: 'app-profile',
  templateUrl: './profile.page.html',
  styleUrls: ['./profile.page.scss'],
})
export class ProfilePage implements OnInit {

  constructor(public route:ActivatedRoute) { }

  user ={name:"", pass:""};
  

  ngOnInit() {
    console.log(this.route.snapshot.paramMap.get("name"));
    this.user.name=this.route.snapshot.paramMap.get("name");
  }

}
