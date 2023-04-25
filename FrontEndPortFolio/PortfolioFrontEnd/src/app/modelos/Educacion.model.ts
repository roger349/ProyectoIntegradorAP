export class Educacion{

    id_educacion:number;
    titulo:String;
    condicion:String;
    institucion:String;

    constructor(id_educacion:number, titulo:String, condicion:String, institucion:String) {

    this.id_educacion = id_educacion;
    this.titulo = titulo;
    this.condicion = condicion;
    this.institucion = institucion;   
    }
}