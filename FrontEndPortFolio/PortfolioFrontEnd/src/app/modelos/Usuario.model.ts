export class Usuario {

    id_dni:number;
    nombre_usuario:string;
    password_usuario:string;

    constructor(id_dni:number, nombre_usuario:string, password_usuario:string) {

        this.id_dni = id_dni;
        this.nombre_usuario = nombre_usuario;
        this.password_usuario = password_usuario; 
          
    }
}