import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Usuario } from '../modelos/Usuario.model';

@Injectable({
  providedIn: 'root'
})
export class UsuarioServService {

  URL = 'http://localhost:8080/';
  
  constructor(private http:HttpClient) { }

      public getUsuario() : Observable<Usuario>{
        return this.http.get<Usuario>(this.URL+'ver/datosUsuario');
      }
}
