
// Creación de Array o Arreglos:
// let autos = new Array('Ferrari', 'Renault', 'BMW'); esta es la sintaxis vieja.
const autos = ['Ferrari', 'Renault', 'BMW'];
console.log(autos);

// Recorremos los elementos de un Arreglo:
console.log(autos[0]);
console.log(autos[2]);

for(let i = 0; i < autos.length; i++){
    console.log(i+' : '+autos[i]);
}

// Modificamos los elementos del Arreglo.
autos[1] = 'Volvo';
console.log(autos[1]);

// Agregamos nuevos valores al Arreglo.
autos.push('Audi'); // Agregamos el elemento al final del Arreglo.
console.log(autos);

// Otras formas de agregar elementos al Arreglo.
autos[autos.length] = 'Porche';
console.log(autos);

// Tercera forma de agrgar elementos teniendo CUIDADO!
autos[6] = 'Toyota';
console.log(autos);

// Como preguntar si es una Array o un Arreglo.
console.log(Array.isArray(autos)); // Devuelve un resultado booleano.

console.log(autos instanceof Array); // Preguntamos si la variables es una instancia de la clase Array. 