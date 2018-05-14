
import estudiantes.Estudiantes;



public class principal {
        public static void main(String[] args) {
        
        Estudiantes[] estudiantess = new Estudiantes[5];
        // 2 materias
        estudiantess [0] =new Estudiantes("Maury","Perez","1725169864");
        //String[] m = new String [2];
        //m[0]="m1";
        //m[0]="m2";
        Estudiantes estudiantess1 = new Estudiantes("Maury","Rodriguez","m1,m2");
        System.out.println("Estudiante Nº 1");
        System.out.println();
        System.out.println("Nombre: "+estudiantess1.getNombre());
        System.out.println("Apellido: "+estudiantess1.getApellido());
        //System.out.println(estudiantess1.getCedula());
        System.out.println("Materias: ");
        String []m= {"m1","m2"};
        estudiantess[0].setMaterias(m);
        String [] materiasEstudiantes = estudiantess[0].getMaterias();
        for(int i=0; i<materiasEstudiantes.length; i++){
            System.out.println(materiasEstudiantes[i]);
        }

        // 3 materias
        estudiantess [1] =new Estudiantes("Naty","Guallochico","1625169864");
        // 4 materias
        estudiantess [2] =new Estudiantes("Andrea","Quishpe","1597169864");
        // 3 materias
        estudiantess [3] =new Estudiantes("Dany","Pepito","1725169789");
        // 2 materias
        estudiantess [4] =new Estudiantes("Mesias","Pumisacho","1722689864");
        
    }
        
}
