public class futbolista extends persona{
    private String equipo;
    private String posicion;
    private String camiseta;
    private String representante;
    private int horas_entrenadas;

    //Setters and Getters
    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getCamiseta() {
        return camiseta;
    }

    public void setCamiseta(String camiseta) {
        this.camiseta = camiseta;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public int getHoras_entrenadas() {
        return horas_entrenadas;
    }

    public void setHoras_entrenadas(int horas_entrenadas) {
        this.horas_entrenadas = horas_entrenadas;
    }

    //Colocar vacio las herencias
    public futbolista(){
        super();
    }

    public futbolista(int CI,
                      String nombre,
                      String apellido,
                      String direccion,
                      int telefono, String posicion, String camiseta, String representante) {
        super(CI, nombre, apellido, direccion, telefono);
        //atributos propiops de la clase futbolista
        this.equipo=equipo;
        this.posicion=posicion;
        this.camiseta=camiseta;
        this.representante=representante;

    }

    //Metodos de la clase
    public void correr(){
        System.out.println("Este es el metodo correr");
    }
}
