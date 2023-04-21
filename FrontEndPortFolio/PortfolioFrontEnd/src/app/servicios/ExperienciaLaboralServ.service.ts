import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { ExperienciaLaboral } from '../modelos/ExperienciaLaboral.model';

@Injectable({
  providedIn: 'root'
})
export class ExperienciaLaboralServService {

  private URL1= "http://localhost:8080/experiencia"; 
  
  constructor(private http1 : HttpClient) { }

  getList(): Observable<ExperienciaLaboral[]>{
    return this.http1.get<ExperienciaLaboral[]>(`${this.URL1 +'/verdatosExp'}`);
  }
}
