let numero, Array = [];
const numeroSecreto = Math.floor(Math.random() * 100) + 1; // Genera un número aleatorio entre 1 y 100.
let adivinado = false; // Variable que indica si el número se ha adivinado.

function ingresaNumero() {
    do {
        numero = parseInt(prompt("Ingresa un número (del 1 - 100): "));
        if (isNaN(numero) || numero > 100 || numero < 1) {
            alert("Valor inválido"); // Si no es un número válido, se muestra una alerta al usuario.
        } else {
            Array.push(numero); // Se agrega el número ingresado al arreglo "Array".
            break; // Si es un número válido, se sale del bucle.
        }
    } while (isNaN(numero) || numero > 100 || numero < 1); // El bucle se repite mientras el número no sea válido.
}

do {
    if (adivinado) {
        // Si el número ingresado no es el número secreto, se muestra una alerta.
        alert("Ups, el número secreto es incorrecto, vuelve a intentarlo.");
    }
    console.log(`El número secreto es: ${numeroSecreto}`); // Se muestra el número secreto en la consola.
    ingresaNumero();
    adivinado = true; // Cambia el valor a 'true' después de la primera iteración.
} while (numero != numeroSecreto); // Se repite hasta que el número ingresado sea igual al número secreto.

alert("Felicidades, adivinaste el número secreto.");
alert(`Los números anteriores ingresados fueron: ${Array}`); // Se muestra una alerta con los números ingresados previamente.
