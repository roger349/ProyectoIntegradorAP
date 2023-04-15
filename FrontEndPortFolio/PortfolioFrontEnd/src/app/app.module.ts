import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './ComponentesMaquetacion/header/header.component';
import { AcercadeComponent } from './ComponentesMaquetacion/acercade/acercade.component';
import { ExperienciaComponent } from './ComponentesMaquetacion/experiencia/experiencia.component';
import { EducacionComponent } from './ComponentesMaquetacion/educacion/educacion.component';
import { HsskillsComponent } from './ComponentesMaquetacion/hsskills/hsskills.component';
import { ProyectosComponent } from './ComponentesMaquetacion/proyectos/proyectos.component';
import { LoginuserComponent } from './ComponentesMaquetacion/loginuser/loginuser.component';
import { BannerComponent } from './ComponentesMaquetacion/banner/banner.component';
import { HomeComponent } from './ComponentesMaquetacion/home/home.component';
import { LogosApRedesSocialesLoginComponent } from './ComponentesMaquetacion/logos-ap-redes-sociales-login/logos-ap-redes-sociales-login.component';
import { NgCircleProgressModule } from 'ng-circle-progress';
import { HttpClientModule } from '@angular/common/http'
 
@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AcercadeComponent,
    ExperienciaComponent,
    EducacionComponent,
    HsskillsComponent,
    ProyectosComponent,
    LoginuserComponent,
    BannerComponent,
    HomeComponent,
    LogosApRedesSocialesLoginComponent
  ],

  imports: [
    BrowserModule,
    AppRoutingModule,
    NgCircleProgressModule.forRoot({}),
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
