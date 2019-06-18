import { Component, OnInit } from '@angular/core';
import { WeatherService } 
from '../../services/weather.service';

@Component({
  selector: 'app-weather',
  templateUrl: './weather.page.html',
  styleUrls: ['./weather.page.scss'],
})
export class WeatherPage implements OnInit {

  constructor(public wS: WeatherService) { }

  temp :String = ""

  ngOnInit() {
    let weather = this.wS.getTheWeather();
    weather.subscribe(
      data => this.temp = data.main.temp
    );

  }

}
