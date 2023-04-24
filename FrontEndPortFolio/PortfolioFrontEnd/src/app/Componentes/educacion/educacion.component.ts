import { Component, OnInit } from '@angular/core';
import { Educacion } from 'src/app/modelos/Educacion.model';
import { EducacionService } from '../../servicios/Educacion.service'

@Component({
  selector: 'app-educacion',
  templateUrl: './educacion.component.html',
  styleUrls: ['./educacion.component.css']
})
export class EducacionComponent implements OnInit {
  
  
  constructor(public eduservice : EducacionService) {}
  
  ngOnInit(): void {
       this.eduservice.getEducacion('http://localhost:8080/educacion/verdatosEdu').subscribe((edu : any)=>{
            console.log(edu)} );
  }
}
