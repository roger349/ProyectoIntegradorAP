import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './Componentes/home/home.component';
import { LoginuserComponent } from './Componentes/loginuser/loginuser.component';

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'loginuser', component: LoginuserComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
