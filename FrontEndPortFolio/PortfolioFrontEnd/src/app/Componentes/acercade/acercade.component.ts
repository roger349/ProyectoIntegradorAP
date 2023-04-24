import { Component,OnInit } from '@angular/core';
import { DatosPersonales } from 'src/app/modelos/DatosPersonales.model';
import { DatosPersonalesServService } from 'src/app/servicios/DatosPersonalesServ.service';

@Component({
  selector: 'app-acercade',
  templateUrl: './acercade.component.html',
  styleUrls: ['./acercade.component.css']
})

export class AcercadeComponent implements OnInit{
 
 DatosPer: DatosPersonales = new DatosPersonales("","","","","");

  constructor(public DPServ: DatosPersonalesServService) {}

  ngOnInit(): void {
   this.persona();
  }
  persona(){
    this.DPServ.getDP().subscribe(dper => {this.DatosPer = dper;   
    console.log(dper) } );
  }  
}
