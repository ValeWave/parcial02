public class App {
    public static void main(String[] args)  {
        // Registrar comidas
        Comida comida1 = new Comida("Ensalada", "Vegetariana", 10);
        Comida comida2 = new Comida("Hamburguesa", "Estándar", 5);
        Comida comida3 = new Comida("Tacos Veganos", "Vegana", 8);

        // Seleccionar comida 

        Estudiante estudiante1 = new Estudiante("Juan Pérez", "12345");
        Estudiante estudiante2 = new Estudiante("María López", "67890");

        comedor.seleccionarComida(estudiante1, comida1);
        comedor.seleccionarComida(estudiante2, comida2);
        comedor.seleccionarComida(estudiante1, comida3);
    }

    public class Comida {
    
        //Atributos
    
        String nombre;
        String tipo;
        int disponibilidad;
    
        //Constructor
    
        public Comida(String nombre, String tipo, int disponibilidad) {
            this.nombre = nombre;
            this.tipo = tipo;
            this.disponibilidad = disponibilidad;
        }
    
        //Getters y setters
    
        public String getNombre() {
            return nombre;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public String getTipo() {
            return tipo;
        }
    
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
    
        public int getDisponibilidad() {
            return disponibilidad;
        }
    
        public void setDisponibilidad(int disponibilidad) {
            this.disponibilidad = disponibilidad;
        }
    
        //Métodos
    
        public void servir() {
            if (disponibilidad > 0) {
                disponibilidad--;
                System.out.println("Se ha servido una porción de " + nombre);
            } else {
                System.out.println("No hay disponibilidad de " + nombre);
            }
    
        }
    
        public void reponer (int cantidad) {
            if (cantidad > 0) {
                disponibilidad += cantidad;
                System.out.println("Se ha aumentado la disponibilidad de comida."); 
                System.out.println("Comida disponible: " + disponibilidad);
            } else {
                System.out.println("No se ha repuesto nada.");
            }
            
        }
    }
    public class Estudiante {

        //Atributos
    
        String nombre;
        int id;
    
        //Constructor
        public Estudiante(String nombre, int id) {
            this.nombre = nombre;
            this.id = id;
        }
    
        //Getters y setters
    
        public String getNombre() {
            return nombre;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
    
        // Métodos
        public void seleccionarComida (Comida comida) {
            if (comida.getDisponibilidad() > 0) {
                comida.servir();
                System.out.println("Has selecciona" + comida.getNombre());
            } else {
            System.out.println("No hay comida disponible.");
            }
            
        } 

    }
    
}
