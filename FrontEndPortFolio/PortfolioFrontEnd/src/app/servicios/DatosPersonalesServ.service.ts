import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { DatosPersonales } from '../modelos/DatosPersonales.model';

@Injectable({

  providedIn: 'root'
})

export class DatosPersonalesServService {

  URL= 'http://localhost:8080/persona/verdatos';
  
  constructor(private http:HttpClient) { }
    
  public getDP(): Observable<DatosPersonales> {
    return this.http.get<DatosPersonales>(this.URL);
  } 
}
