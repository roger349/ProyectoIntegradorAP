import { Component,OnInit } from '@angular/core';
import { DatosPersonales } from 'src/app/modelos/DatosPersonales.model';
import { DatosPersonalesServService } from 'src/app/servicios/DatosPersonalesServ.service';

@Component({
  selector: 'app-acercade',
  templateUrl: './acercade.component.html',
  styleUrls: ['./acercade.component.css']
})

export class AcercadeComponent implements OnInit{

 DatosPer: DatosPersonales[]=[];
  /*DatosPer: DatosPersonales = new DatosPersonales("","","","","");*/
  
  constructor(public DPServ: DatosPersonalesServService) {}

  ngOnInit(): void {
  this.DPServ.DatPer().subscribe( data => {this.DatosPer = data});
  }  
}
