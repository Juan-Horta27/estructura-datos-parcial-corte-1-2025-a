import java.util.Scanner;
public class PARCIAL {
        public static void main(String[] args) {
            calcularCompra();
        }
        public static void calcularCompra() {
            // Crear un objeto Scanner para leer la entrada del usuario
            Scanner scanner = new Scanner(System.in);
            // Solicitar datos al usuario
            System.out.print("Ingrese el nombre del cliente: ");
            String nombreCliente = scanner.nextLine();

            System.out.print("Ingrese el nombre del producto: ");
            String nombreProducto = scanner.nextLine();

            System.out.print("Ingrese el valor unitario del producto (mayor a 0): ");
            double valorUnitario = scanner.nextDouble();

            System.out.print("Ingrese la cantidad a comprar (mayor a 0): ");
            int cantidad = scanner.nextInt();

            // Validar entradas
            if (valorUnitario <= 0 || cantidad <= 0) {
                System.out.println("Error en la entrada de datos");
                return;
            }

            // Calcular valor bruto
            double valorBruto = valorUnitario * cantidad;

            // Aplicar descuentos
            double descuento = 0;
            if (cantidad >= 10 && cantidad < 20) {
                descuento = valorBruto * 0.05; // 5% de descuento
            } else if (cantidad >= 20) {
                descuento = valorBruto * 0.07; // 7% de descuento
            }

            // Calcular valor neto
            double valorNeto = valorBruto - descuento;

            // Mostrar resultados
            System.out.println("\nResumen de la compra:");
            System.out.println("Nombre del Cliente: " + nombreCliente);
            System.out.println("Nombre del Producto: " + nombreProducto);
            System.out.println("Valor Unitario: " + valorUnitario);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Valor Bruto: " + valorBruto);
            System.out.println("Descuento: " + descuento);
            System.out.println("Valor Neto: " + valorNeto);

            // Cerrar el Scanner
            scanner.close();
        }
    }
