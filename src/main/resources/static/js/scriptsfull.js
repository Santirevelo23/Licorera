$(document).ready(function () {
    $.ajax({
        url: "/producto/contarProductos",
        method: "GET",
        success: function (data) {
            console.log("conteo de productos")
            console.log(data)
            // Seleccionar el elemento con el id "conteoProductos"
            const navLink = $("#conteoProductos");
            // Actualizar el contenido HTML dentro del <a>
            const spanElement = navLink.find("span");
            // Actualizar solo el nodo de texto después del <span>
            spanElement[0].nextSibling.nodeValue = `[${data}]`;
        },
        error: function (error) {
            console.error("Error al obtener el conteo del carrito", error);
        }
    });
});
