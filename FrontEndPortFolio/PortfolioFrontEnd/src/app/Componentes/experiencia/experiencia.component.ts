import { Component, OnInit } from '@angular/core';
import { ExperienciaLaboral } from 'src/app/modelos/ExperienciaLaboral.model';
import { ExperienciaLaboralServService } from 'src/app/servicios/ExperienciaLaboralServ.service';

@Component({
  selector: 'app-experiencia',
  templateUrl: './experiencia.component.html',
  styleUrls: ['./experiencia.component.css']
})
export class ExperienciaComponent implements OnInit {

  exper: ExperienciaLaboral[] = [];
  
  constructor(private ELServ : ExperienciaLaboralServService) {};
  
  ngOnInit(): void {
    this.ELServ.ExpList().subscribe(exp => { this.exper=exp;
      console.log(exp);} )  
  }
}
