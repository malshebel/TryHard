
package DS;

public class DYArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //dimention array;
        int[] number = new int[5];
        number[0] = 11;
        number[1] = 5;
        number[2]= 10;
        number[3] = 22;
        number[4] = 55;
        
        System.out.println("simple array : ");
        for(int i = 0 ; i < 5 ;i++)
            System.out.println(number[i] + "\t");    
            
        Student[] stu = new Student[3];
        stu[0] = new Student("A" , 10);
        stu[1] = new Student("B" , 20);
        stu[2] = new Student("C" , 30);
        
        System.out.println("\nObject array : ");
        for(Student Student : stu)
            System.out.println("Name : " + Student.name + "\tid : " + Student.id );
        
        
        System.out.println("\nDynamic Array : ");
        //Dynamic Array. 
        DynamicArray<Integer> Ar = new DynamicArray<Integer>();
        Ar.insert(45);
        System.out.println("Size : " + Ar.getsize());
        Ar.insert(60);
        System.out.println("Size : " + Ar.getsize());//size++..u can see it in the output_Screen.
        Ar.insert(10);
        System.out.println("Size : " + Ar.getsize());//size++..u can see it in the output_Screen.
        Ar.insert(20);
        System.out.println("Size : " + Ar.getsize());
        Ar.insert(360);
        System.out.println("Size : " + Ar.getsize());//size++..u can see it in the output_Screen.
        
        
        System.out.println("\nDynamic Array : ");
        //Dynamic Array. 
        DynamicArray<Student> AR_1 = new DynamicArray<Student>();
        AR_1.insert(20);
        System.out.println("Size : " + Ar.getsize());
        AR_1.insert(60);
        System.out.println("Size : " + Ar.getsize());//size++..u can see it in the output_Screen.
        AR_1.insert(10);
        System.out.println("Size : " + Ar.getsize());//size++..u can see it in the output_Screen.
        AR_1.insert(20);
        System.out.println("Size : " + Ar.getsize());
        AR_1.insert(360);
        System.out.println("Size : " + Ar.getsize());//size++..u can see it in the output_Screen.
    }
    
}
