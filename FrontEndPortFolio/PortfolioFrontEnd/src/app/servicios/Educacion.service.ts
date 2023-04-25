import { Injectable } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Educacion } from '../modelos/Educacion.model';

@Injectable({
  providedIn: 'root'
})
export class EducacionService {
  
  url='http://localhost:8080/educacion/verdatosEdu';

  constructor(private http: HttpClient) { }

  public EduList(): Observable<Educacion[]>{
    return this.http.get<Educacion[]>(this.url);
  }

}
