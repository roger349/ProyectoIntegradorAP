import { Component, OnInit} from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-logos-ap-redes-sociales-login',
  templateUrl: './logos-ap-redes-sociales-login.component.html',
  styleUrls: ['./logos-ap-redes-sociales-login.component.css']
})
export class LogosApRedesSocialesLoginComponent implements OnInit  {
    constructor(private router:Router) {}
  
    ngOnInit(): void {
    }
  
  loginuser(){
    this.router.navigate(["/loginuser"])
  }
}
