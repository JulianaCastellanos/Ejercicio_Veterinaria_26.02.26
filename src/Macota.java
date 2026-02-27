public class Macota {


    //atributos

    private String nombre;
    private String especie;
    private int edad;
    private double peso;
    private boolean saludable;


    public Macota() {
    }

    public Macota(String nombre, String especie, int edad, double peso, boolean saludable) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.saludable = saludable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isSaludable() {
        return saludable;
    }

    public void setSaludable(boolean saludable) {
        this.saludable = saludable;
    }

    @Override
    public String toString() {
        return "Macota{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", saludable=" + saludable +
                '}';
    }

    // metodos propios

    public int cumplirAnios() {
        edad += 1;
        return edad;
    }

    public double engordar (double masPeso){
        peso += masPeso;
        return peso;
    }

    public double adelgazar (double menosPeso){
        peso -= menosPeso;
        return peso;
    }

    public boolean enfermar (boolean enfermo){
        if (enfermo == true){
            saludable = false;
        }
        return saludable;
    }

    public boolean recuperarSalud (boolean curar){
        if (curar == true){
            saludable = true;
        }
        return saludable;
    }

    public void mostrarFicha() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad + " años");
            System.out.println("Peso: " + peso + " kg");
            if (saludable == true){
                System.out.println("Estado: saludable");
            } else {
                System.out.println("Estado: enfermo");
            }
        }
}
