import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class WeatherService {

  constructor(public http:HttpClient) { }

  getTheWeather() : Observable<any>{
    console.log("Downoading the weather info:");
    let obs = this.http.get('http://api.openweathermap.org/data/2.5/weather?q=Bordeaux,fr&units=metric&appid=64c7b98c91f425ed4bd193334c0bd9d6');
    obs.subscribe( 
      data => console.log(data));
    return obs;
  }
}
