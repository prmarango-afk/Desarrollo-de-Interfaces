//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("Cuántas ventas se van a registrar?")
    var numVentasStr =  readln()
    var numVentas = numVentasStr.toInt()

    if (numVentas > 0) {
        repeat(numVentas) {

            println("Nombre producto :")
            var nombre = readln()

            println("Precio unitario :")
            var precioUnitarioStr = readln()
            var precioUnitario = precioUnitarioStr.toInt()

            println("Número de unidades :")
            var numeroUnidadesStr = readln()
            var numeroUnidades = numeroUnidadesStr.toInt()

            println("Es cliente habitual? (S/N):")
            var clienteHabitual = readln()

            var  importeVenta = precioUnitario * numeroUnidades
        }


    } else{
            println("No pueden haber ventas inferiores a 1")
        }
    }

fun calcularSubtotal(precio: Double , unidades: Int){
    var subtotal = precio * unidades
}

fun calcularDescuento (precio: Double , esHabitual:Boolean, porcentaje : Double){

}
