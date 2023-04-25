export  class DatosPersonales {

       id_datos_Personales?:number;
       nombre: string;
       apellido: string;
       fecha_nacimiento: string;
       estado_civil: string;
       correo_electronico: string;

       constructor(nombre: string, apellido: string, fecha_nacimiento: string,estado_civil: string, correo_electronico: string) {
                        
       this.nombre = nombre;
       this.apellido = apellido;
       this.fecha_nacimiento = fecha_nacimiento;
       this.estado_civil = estado_civil;
       this.correo_electronico = correo_electronico;
       } 
} 