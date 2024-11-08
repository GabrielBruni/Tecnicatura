let x = 10; // Variable de tipo primitiva.
console.log(x.length);
console.log('Tipos primitivos');
// Objeto:
let persona = {
    nombre: 'Gabriel',
    apellido: 'Bruni',
    email: 'gabybruni15@gmail.com',
    edad: 24,
    idioma: 'es',
    get lang(){ // Convierte las minúsculas a mayúsculas.
        return this.idioma.toUpperCase();
    },
    set lang(lang){  
        this.idioma = lang.toUpperCase();
    },
    nombreCompleto: function(){ // Método o función en JavaScript.
        return this.nombre+' '+this.apellido;
    },
    get nombreEdad (){ // Este es el método get.
        return this.nombre+', Edad: '+this.edad;
    }
}

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);
console.log(persona.nombreCompleto());
console.log('Ejecutando con un objeto');
let persona2 = new Object(); // Debe crear un nuevo objeto en memoria.
persona2.nombre = 'Juan';
persona2.direccion = 'Salasa 14';
persona2.telefono = '5492542951615';
console.log(persona2.telefono);
console.log('Creamos un nuevo objeto');
console.log(persona['apellido']); // Accedemos como si fuera un arreglo.
console.log('Usamos el ciclo for in');
// for in y accedemos al objeto como si fuera un arreglo.
for(propiedad in persona){
    console.log(propiedad)
    console.log(persona[propiedad]);
}
console.log('Cambiamos y eliminamos un error');
persona.apellida = 'Betancud'; // Cambiamos dinámicamente un valor del objeto.
delete persona.apellida; // Eliminamos el error.
console.log(persona);

// Distintas formas de imprimir un objeto:
// Número 1: La mas sencilla: concatenar cada valor de cada propiedad.
console.log('Distintas formas de imprimir un objeto: forma 1.');
console.log(persona.nombre+', '+persona.apellido);

// Número 2: A través del ciclo for in.
console.log('Distintas formas de imprimir un objeto: forma 2.');
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}

// Número 3: La función Object.values()
console.log('Distintas formas de imprimir un objeto: forma 3.');
let personaArray = Object.values(persona);
console.log(personaArray);

// Número 4: Utilizaremos el método de JSON.stringify
console.log('Distintas formas de imprimir un objeto: forma 4.');
let personaString = JSON.stringify(persona);
console.log(personaString);

console.log('Comenzamos a utilizar el método get.');
console.log(persona.nombreEdad);

console.log('Comenzamos con el método get y set para idiomas.');
persona.lang = 'en';
console.log(persona.lang);

function Persona3(nombre, apellido, email){ // Constructor de mi funcion.
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombreCompleto = function(){
        return this.nombre+' '+this.apellido;
    }
}
let padre = new Persona3('Leo', 'López', 'lopezl@gmail.com');
padre.nombre = 'Luis'; // Modificamos el nombre.
padre.telefono = '2604-400867'; // Una propiedad exclusiva del objeto padre.
console.log(padre);
console.log(padre.nombreCompleto()); // Utilizamos la función.
let madre = new Persona3('Laura', 'Contrera', 'contreral@gmail.com');
console.log(madre);
console.log(madre.telefono); // La propiedad no está definida.
console.log(madre.nombreCompleto());

// Diferentes formas de crear Objetos:

// Caso Objeto 1:
let miObjeto1 = new Object(); // Esta es una opción formal.
// Caso Objeto 2:
let miObjeto2 = {}; // Esta opción es breve y recomendada.

// Caso String 1:
let miCadena1 = new String('Hola'); // Sintaxis formal.
// Caso String 2:
let miCadena2 = 'Hola'; // Esta es la sintaxis simplificada y recomendada.

// Caso con números 1:
let miNumero1 = new Number(1); // Es formal no recomdable.
// Caso con números 2:
let miNumero2 = 1; // Sintaxis recomendada.

// Caso Boolean 1:
let miBoolean1 = new Boolean(false); // Formal.
// Caso Boolean 2:
let miBoolean2 = false; // Sintaxis recomendada.

// Caso Arreglos 1:
let miArreglo1 = new Array(); // Formal.
// Caso Arreglos 2:
let miArreglo2 = []; // Sintaxis recomendada.

// Caso Funciones 1:
let miFuncion1 = new function(){}; // Todo después de new es considerado objeto.
// Caso Funciones 2:
let miFuncion2 = function(){}; // Notación simplificada y recomendada.

// Uso de Prototype.
Persona3.prototype.telefono = '2604-400867'
console.log(padre);
console.log(madre.telefono);
madre.telefono = '+54 9 2604-400867';
console.log(madre.telefono);

// Uso de Call.
let persona4 = {
    nombre: 'Juan',
    apellido: 'Pérez',
    nombreCompleto2: function(titulo, telefono){
        return titulo+': '+this.nombre+' '+this.apellido+' '+telefono;
        //return this.nombre+' '+this.apellido;
    }
}

let persona5 = {
    nombre: 'Carlos',
    apellido: 'Lara'
}

console.log(persona4.nombreCompleto2('Lic.', '5420316102'));
console.log(persona4.nombreCompleto2.call(persona5, 'Ing.', '54165841531'));

// Método Aplly.
let arreglo = ['Ing.', '546511864165'];
console.log(persona4.nombreCompleto2.apply(persona5, arreglo));