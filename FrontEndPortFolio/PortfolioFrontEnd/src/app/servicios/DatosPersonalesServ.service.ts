import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { DatosPersonales } from '../modelos/DatosPersonales.model';

@Injectable({

  providedIn: 'root'
})

export class DatosPersonalesServService {
  
  URL = 'http://localhost:8080/Persona/'; 
  
  constructor(private http:HttpClient) { }

      public getDatosPersonales() : Observable<DatosPersonales>{
        return this.http.get<DatosPersonales>(this.URL +'ver/datos');
      }
}
