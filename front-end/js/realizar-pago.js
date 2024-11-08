
const botonComprar = document.getElementById("comprar")

botonComprar.addEventListener( "click", () => {
    const usuarioLogeado = localStorage.getItem('usuarioLogeado');
    if (usuarioLogeado) {
        window.location.href = 'compraexitosa.html';
    } else { // Mensaje de alerta y redirección
    Swal.fire({
        title: 'Redirigiendo...',
        text: 'Por favor inicia sesión para continuar con la compra.',
        icon: 'info',
        confirmButtonText: 'Aceptar',
        timer: 3000, 
        timerProgressBar: true
    }).then(() => {
        // Redirige después de que se cierre la alerta
        window.location.href = 'iniciar-sesion.html';
    });
    
        }
}
);



// document.addEventListener('DOMContentLoaded', () => {
//     const usuarioLogeado = localStorage.getItem('usuarioLogeado');
//     if (usuarioLogeado) {
        
//     } else {
        
//     } 
//   });