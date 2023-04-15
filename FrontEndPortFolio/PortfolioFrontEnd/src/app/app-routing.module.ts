import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './ComponentesMaquetacion/home/home.component';
import { LoginuserComponent } from './ComponentesMaquetacion/loginuser/loginuser.component';

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'loginuser', component: LoginuserComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
