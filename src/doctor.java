public class doctor extends persona{
    private String especialidad;
    private int codigo_doctor;
    private String horario;
    private int anios;

    private String signo;

    //Setters and Getters
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getCodigo_doctor() {
        return codigo_doctor;
    }

    public void setCodigo_doctor(int codigo_doctor) {
        this.codigo_doctor = codigo_doctor;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    //Colocar vacio las herencias
    public doctor(){
        super();
    }

    //Herencia
    public doctor(int CI,
                  String nombre,
                  String apellido,
                  String direccion,
                  int telefono,
                  String especialidad,
                  int codigo_doctor,
                  String horario ) {

        super(CI, nombre, apellido, direccion, telefono);
        //Atributos propios de la clase doctor
        this.especialidad=especialidad;
        this.codigo_doctor=codigo_doctor;
        this.horario=horario;


    }

    public void examinar(){
        System.out.println("Este es el metodo examinar");
    }

}
