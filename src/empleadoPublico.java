public class empleadoPublico extends persona{
    private String puesto;
    private String cargo;
    private int cod_empleado;

    //Setters and getters
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getCod_empleado() {
        return cod_empleado;
    }

    public void setCod_empleado(int cod_empleado) {
        this.cod_empleado = cod_empleado;
    }

    //Colocar vacio las herencias
    public empleadoPublico(){
        super();
    }

    //Metodo Super para herencia
    public empleadoPublico(int CI,
                           String nombre,
                           String apellido,
                           String direccion,
                           int telefono,
                           String puesto,
                           String cargo,
                           int cod_empleado
                           ) {
        super(CI, nombre, apellido, direccion, telefono);
        //Atributos propios de la clase empleadoPublico
        this.puesto=puesto;
        this.cargo=cargo;
        this.cod_empleado=cod_empleado;

    }

    //Metodos de la clase
    public void tramitar(){
        System.out.println("Este es el metodo tramitar");
    }
}
