public class menu {
    public static void main(String[] args) {
        persona miPersona = new persona(1739372938,
                "Juan",
                "Perez",
                "El Recreo",
                32423423);
        persona Pedro= new persona();
        System.out.println(miPersona.getCI());
        System.out.println(Pedro.getCI());

        estudiante Jared=new estudiante(17173483, "Jared", "Valenzuela", "El Recreo",98777776,43345,"jared@gmail.com", "TSDS");
        estudiante David= new estudiante();
        System.out.println("Nombre: "+Jared.getNombre());
        Jared.caminar();
        Jared.estudiar();
        Jared.trabajar();
        Jared.leer();
        Jared.memorizar();

        David.setNombre("David");
        System.out.println("Nombre: "+David.getNombre());
        Jared.caminar();
        Jared.estudiar();
        Jared.trabajar();
        Jared.leer();
        Jared.memorizar();
        System.out.println("-----------------------------------------------------------");
        System.out.println("EJERCICIO EN CLASE ");
        System.out.println("-----------------------------------------------------------");
        doctor Ana=new doctor();
        Ana.setNombre("Ana");
        System.out.println("Nombre: " +Ana.getNombre());
        Ana.setAnios(33);
        System.out.println("Edad: " +Ana.getAnios());
        Ana.setSigno("Leo");
        System.out.println("Signo: " +Ana.getSigno());
        Ana.examinar();

        empleadoPublico Pablo=new empleadoPublico();
        Pablo.setNombre("Pablo");
        System.out.println("Nombre: " +Pablo.getNombre());
        Pablo.setTelefono(992049963);
        System.out.println("Teléfono: " +Pablo.getTelefono());
        Pablo.tramitar();

        futbolista Maritza=new futbolista();
        Maritza.setNombre("Maritza");
        System.out.println("Nombre: " +Maritza.getNombre());
        Maritza.setHoras_entrenadas(5);
        System.out.println("Entrena: " +Maritza.getHoras_entrenadas());
        Maritza.correr();

        estudiante Melani=new estudiante();
        Melani.setNombre("Melani");
        System.out.println("Nombre: " +Melani.getNombre());
        Melani.setSemestre("Tercer");
        System.out.println("Semestre: " +Melani.getSemestre());
        Melani.leer();


    }
}
