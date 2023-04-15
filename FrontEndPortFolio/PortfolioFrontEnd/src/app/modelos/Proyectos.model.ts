export class Proyectos{

    id_proyecto:number;
    nombre_proyecto:String;
    descripcion_proyecto:String;

    constructor(id_proyecto:number, nombre_proyecto:String, descripcion_proyecto:String) {

    this.id_proyecto = id_proyecto;
    this.nombre_proyecto = nombre_proyecto;
    this.descripcion_proyecto = descripcion_proyecto;
    
    }   
}