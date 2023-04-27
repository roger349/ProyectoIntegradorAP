import { Injectable } from '@angular/core'
import { Observable } from 'rxjs';
import { JWTModelo } from '../modelos/JWTModelo';
import { HttpClientModule } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AutentificadorService {

  LoginURL = 'http://localhost:8080/auth/';

  constructor(private http: HttpClient) { }

  public login(UserLogin: UserLogin): Observable<JWTModelo> {
    return this.http.post<JWTModelo>(this.LoginURL + 'login', UserLogin);
  }
}