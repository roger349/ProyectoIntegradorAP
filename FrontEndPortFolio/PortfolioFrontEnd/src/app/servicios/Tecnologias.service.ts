import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Tecnologias } from '../modelos/Tecnologias.model';

@Injectable({
  providedIn: 'root'
})
export class TecnologiasService {

  URL = 'http://localhost:8080/tecnologia';

  constructor(private http : HttpClient) { }

  public verDatos(): Observable<Tecnologias[]>{
    return this.http.get<Tecnologias[]>(this.URL + '/verdatos');
  }

  public agregarDatos(tec: Tecnologias): Observable<any>{
    return this.http.post<any>(this.URL + '/agregardatos', tec);
  }

  public updatedatos(id: number, tec: Tecnologias): Observable<any>{
    return this.http.put<any>(this.URL + `/updatedatos/${id}`, tec);
  }

  public deleteTec(id: number): Observable<any>{
    return this.http.delete(this.URL + `/delete/${id}`);
  }
}
