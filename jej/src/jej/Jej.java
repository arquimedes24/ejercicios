package jej;
public class Jej {

    public static void main(String[] args) {
       
        int i = 0;
    
        while (i++<5)
            System.out.println("ciclo1: "+i);
        i=1;
        while(true){
        if(i>5)
            break;
            System.out.println("ciclo2: "+i);
            i++;
        }
        for(i=1;i<=5;i++)
            System.out.println("ciclo3: "+i);
        i=1;
        for(;;){
            if(i>5)
                break;
            System.out.println("   ciclo4:"+i);
                    
        }
        
    
    }
    
}
