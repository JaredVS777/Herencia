public class persona {
    private int CI;
    private String Nombre;
     private String Apellido;
     private String Direccion;
     private int Telefono;

     public persona(){
     }

    public persona(int CI, String nombre, String apellido, String direccion, int telefono) {
        this.CI = CI;
        Nombre = nombre;
        Apellido = apellido;
        Direccion = direccion;
        Telefono = telefono;
    }

    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    public void caminar(){
        System.out.println("Este es el metodo para caminar que pertenece a persona");
    }

    public void trabajar(){
        System.out.println("Este es el metodo trabajar que pertence a person");
    }
}
