export class persona{
    update(id: any, persona: persona) {
      throw new Error('Method not implemented.');
    }
    id?: number;
    nombre: string;
    apellido: string;
    descripcion:string;
    img: string;

    constructor(nombre: string,descripcion:string, apellido: string, img: string){
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.img = img;
    }
}