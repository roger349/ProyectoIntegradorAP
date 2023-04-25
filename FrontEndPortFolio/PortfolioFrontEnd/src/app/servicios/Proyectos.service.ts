import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Proyectos } from '../modelos/Proyectos.model';

@Injectable({
  providedIn: 'root'
})
export class ProyectosService {

  URL = 'http://localhost:8080/proyecto/verdatosPro';

  constructor(private http : HttpClient) { }

  public ProList(): Observable<Proyectos[]>{
    return this.http.get<Proyectos[]>(this.URL);
  }
}
