import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './Componentes/header/header.component';
import { AcercadeComponent } from './Componentes/acercade/acercade.component';
import { ExperienciaComponent } from './Componentes/experiencia/experiencia.component';
import { EducacionComponent } from './Componentes/educacion/educacion.component';
import { HsskillsComponent } from './Componentes/hsskills/hsskills.component';
import { ProyectosComponent } from './Componentes/proyectos/proyectos.component';
import { LoginuserComponent } from './Componentes/loginuser/loginuser.component';
import { BannerComponent } from './Componentes/banner/banner.component';
import { HomeComponent } from './Componentes/home/home.component';
import { LogosApRedesSocialesLoginComponent } from './Componentes/logos-ap-redes-sociales-login/logos-ap-redes-sociales-login.component';
import { NgCircleProgressModule } from 'ng-circle-progress';
import { HttpClientModule } from '@angular/common/http';
import { FooterComponent } from './componentes/footer/footer.component';
import { EdicionHsskillsComponent } from './Componentes/hsskills/edicion-hsskills.component';
import { NuevoHsskillsComponent } from './Componentes/hsskills/nuevo-hsskills.component'
 
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
    LogosApRedesSocialesLoginComponent,
    FooterComponent,
    EdicionHsskillsComponent,
    NuevoHsskillsComponent
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
