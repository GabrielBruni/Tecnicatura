var nombre = 'José';
var apellido = ' Montés';
var nombreCompleto = nombre+' '+apellido; // Primera Concatenación.
console.log(nombreCompleto);
var nombreCompleto2 = 'Gabriel'+' '+'Bruni'; // Segunda Concatenación.
console.log(nombreCompleto2);
var juntos = nombre + 219; // Lee de izq a der siguinedo la cadena lee el número como str.
console.log(juntos);
juntos = nombre + (78 + 17); // Aquí se puede diferenciar a través de los paréntesis.
console.log(juntos);
juntos = 78 + 17 + nombre;
console.log(juntos)
// Primero se tratan como números y después como cadena.
// A esto se lo llama contexto streamg o contexto cadena.

nombre += apellido; // Tercera Concatenación usando el operador simplificado.
console.log(nombre); 