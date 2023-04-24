import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { ExperienciaLaboral } from '../modelos/ExperienciaLaboral.model';

@Injectable({
  providedIn: 'root'
})
export class ExperienciaLaboralServService {

  private URL1= "http://localhost:8080/experiencia"; 
  
  constructor(private http : HttpClient) { }
  getELab(url : string){
    return this.http.get(url);
  }
}
