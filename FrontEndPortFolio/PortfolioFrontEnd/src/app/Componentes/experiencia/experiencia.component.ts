import { Component, OnInit } from '@angular/core';
import { ExperienciaLaboral } from 'src/app/modelos/ExperienciaLaboral.model';
import { ExperienciaLaboralServService } from 'src/app/servicios/ExperienciaLaboralServ.service';

@Component({
  selector: 'app-experiencia',
  templateUrl: './experiencia.component.html',
  styleUrls: ['./experiencia.component.css']
})
export class ExperienciaComponent implements OnInit {


  constructor(private ELServ : ExperienciaLaboralServService) {};
  
  ngOnInit(): void {
    this.ELServ.getELab('http://localhost:8080/experiencia/verdatosExp').subscribe((edu : any)=>{
            console.log(edu)} );
  }
}
