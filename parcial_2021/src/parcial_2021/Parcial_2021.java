package parcial_2021;
public class Parcial_2021 {
    
        
        public static void main(String[] args) {
        System.out.println("Hora: " + args[0] + " Minuto: " + args[1] + " Segundo: " + args[2]);
        int Hora = Integer.parseInt(args[0]);
        int Min = Integer.parseInt(args[1]);
        int Seg = Integer.parseInt(args[2]);
        if (Hora >= 0 && Hora <= 24) {
            if (Min >= 0 && Min <= 59) {
                if (Seg >= 0 && Seg <= 59) {
                    System.out.println("La hora está bien");
                }else{
                    System.out.println("La hora está mal(segundos)");
                }
            } else {
                System.out.println("La hora está mal (minutos)");
            }

        } else {
            System.out.println("La hora está mal (hora)");
        }
    }
}
        
        
        
        
    
    

