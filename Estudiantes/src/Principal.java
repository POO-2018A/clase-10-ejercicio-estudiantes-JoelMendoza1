import estudiantes.Estudiantes;
public class Principal {
    public static void main(String[] args){
    Estudiantes[] estudiantes= new Estudiantes[5];
    //2 materias
    estudiantes[0]=new Estudiantes("Juan","Perez","12334567890"); 
    
   // String[] m=new String[2]
     //       m[0]="m1";
       //     m[1]="m2";
       Estudiantes estudiante1=new Estudiantes("Juan","Perez","m1,m2");
       System.out.println("##Estudiante N°1");
        System.out.println();
        System.out.println("Nombre: "+estudiante1.getNombre());
        System.out.println("Apellido"+estudiante1.getApellidos());
        
        System.out.println("Materias: ");
       String[] m1={"m1","m2"};
       estudiantes[0].setMaterias(m1);
       
        String [] materiasEstudiante1 =estudiantes[5].getMaterias();
       for(int i=0; i<materiasEstudiante1.length;i++){
       System.out.println(materiasEstudiante1[i]);
       }
    //3 materias
    estudiantes[1]=new Estudiantes("Maria","Castro","0987654321");
Estudiantes estudiante2 = new Estudiantes("Maria","Castro","m2,m3,m4");
        System.out.println("##Estudiante No 2");
        System.out.println();
        System.out.println("Nombre: "+estudiante2.getNombre());
        System.out.println("Apellido"+estudiante2.getApellidos());
        
        System.out.println("Materias: ");
        String[] m2={"m2","m2","m4"};
        estudiantes[1].setMaterias(m2);
        
        String [] materiasEstudiante2 =estudiantes[1].getMaterias();
       for(int i=0; i<materiasEstudiante2.length;i++){
       System.out.println(materiasEstudiante2[i]);
       }

    
    //4 materias
    estudiantes[2]=new Estudiantes("Pedro","Benitez","5678654323");
    Estudiantes estudiante3 = new Estudiantes("Pedro","Benitez","m2,m3,m4,m5");
        System.out.println("##Estudiante No 3");
        System.out.println();
        System.out.println("Nombre: "+estudiante3.getNombre());
        System.out.println("Apellido"+estudiante3.getApellidos());
        
        
        System.out.println("Materias: ");
        String[] m3={"m2","m3","m4","m5"};
        estudiantes[1].setMaterias(m3);
        
        String [] materiasEstudiante3 =estudiantes[0].getMaterias();
       for(int i=0; i<materiasEstudiante3.length;i++){
       System.out.println(materiasEstudiante3[i]);
       }
    System.out.println("######## RESUMEN MATERIAS########");
    System.out.println("m1: 1");
    System.out.println("m2: 3");
    System.out.println("m3: 2");
    System.out.println("m4: 2");
    System.out.println("m5: 1");
    
    
       
       
       
       
    }
}
