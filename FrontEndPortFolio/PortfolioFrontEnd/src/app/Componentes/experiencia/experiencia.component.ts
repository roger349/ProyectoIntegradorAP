import { Component, OnInit } from '@angular/core';
import { ExperienciaLaboral } from 'src/app/modelos/ExperienciaLaboral.model';
import { ExperienciaLaboralServService } from 'src/app/servicios/ExperienciaLaboralServ.service';

@Component({
  selector: 'app-experiencia',
  templateUrl: './experiencia.component.html',
  styleUrls: ['./experiencia.component.css']
})
export class ExperienciaComponent implements OnInit {
  ExpLab: ExperienciaLaboral[] = []

  constructor(private ExperienciaLaboralServicio : ExperienciaLaboralServService) {};
  
  ngOnInit(): void {

    this.getExpLab();
  }
  private getExpLab(){
    this.ExperienciaLaboralServicio.getList().subscribe(data => {
      this.ExpLab = data;
    });

}
