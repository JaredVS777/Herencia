public class estudiante extends persona{
    private int codigo;
    private String  correo;
    private String semestre;
    private String carrera;



    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    //Colocar vacio las herencias
    public estudiante(){
        super();
    }

    public estudiante (int CI,
                      String nombre,
                      String apellido,
                      String direccion,
                      int telefono,
                       int codigo,
                       String  correo,
                       String carrera) {
        super(CI, nombre, apellido, direccion, telefono);//atribtuos heredados
        //atributos propios de la calsde estudiante
        this.codigo=codigo;
        this.carrera=carrera;
        this.semestre=semestre;
        this.carrera=carrera;

    }

    //Metodos de la clase
    public void estudiar(){
        System.out.println("Este es el metodo estudiar de la clase estudiante");
    }

    public void memorizar(){
        System.out.println("Este es el metodo memorizar de la clase estudiante");

    }

    public void leer(){
        System.out.println("Este es el metodo leer ");

    }

}
