import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { ExperienciaLaboral } from '../modelos/ExperienciaLaboral.model';

@Injectable({
  providedIn: 'root'
})
export class ExperienciaLaboralServService {

  URL= "http://localhost:8080/experiencia/verdatosExp"; 
  
  constructor(private http : HttpClient) { }
  
  public ExpList(): Observable<ExperienciaLaboral[]>{
    return this.http.get<ExperienciaLaboral[]>(this.URL);         
  }

}
