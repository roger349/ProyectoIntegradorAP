import { Component,OnInit } from '@angular/core';
import { DatosPersonales } from 'src/app/modelos/DatosPersonales.model';
import { DatosPersonalesServService } from 'src/app/servicios/DatosPersonalesServ.service';

@Component({
  selector: 'app-acercade',
  templateUrl: './acercade.component.html',
  styleUrls: ['./acercade.component.css']
})

export class AcercadeComponent implements OnInit{


  DatosPersonales = new DatosPersonales("","","","","");

  constructor(public DatosPersonalesServicio:DatosPersonalesServService) {}

  ngOnInit(): void {

  this.DatosPersonalesServicio.getDatosPersonales().subscribe(datospersonales => {
       this.DatosPersonales=datospersonales;
    });
  }
}
