import { Component, OnInit } from '@angular/core';
import { Proyectos } from 'src/app/modelos/Proyectos.model';
import { ProyectosService } from 'src/app/servicios/Proyectos.service';

@Component({
  selector: 'app-proyectos',
  templateUrl: './proyectos.component.html',
  styleUrls: ['./proyectos.component.css']
})
export class ProyectosComponent implements OnInit {

  proy: Proyectos[]=[];
  
  constructor(public ProyServ:ProyectosService) {};

  ngOnInit(): void {
    this.ProyServ.ProList().subscribe(pro=>{this.proy=pro});
  }

}
