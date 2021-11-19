package taller;
public class Password {
     
    private  int  longitud;
    private String  password;
    
    int nummayusculas=0,numminusculas=0;
    
    public Password(){ 
      this.longitud = 10;}
    
    public Password(int longitud){ 
        this.longitud = longitud; password=generar();}
    
    public int getLongitud() {
        return longitud;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String generar() {
         for(int i = 1 ; i <= longitud ; i++) {
            switch((int) Math.floor(Math.random() * (3 - 1 + 1) + 1)) {
                case 1:
                    password += mayuscula();
                break;
                case 2:
                    password += minuscula();
                break;
                case 3:
                    password += numero();
                break;
            }
        }
 
         
        System.out.println(password);
        return null;
    }
 
    public static char mayuscula() {
        return (char) Math.floor(Math.random() * (90 - 65 + 1) + 65);
    }
 
    public static char minuscula() {
        return (char) Math.floor(Math.random() * (122 - 97 + 1) + 97);
    }
 
    public static int numero() {
        return (char) Math.floor(Math.random() * (9 + 1));
    }
 
    
     public String validar() {
        int contadorminusculas = 0;
        int contadormayusculas= 0;
        int contadornumumeros = 0;
        for (int i = 0; i < longitud; i++) {
            if (password.charAt(i) >= 97 && password.charAt(i) <= 122) {
                contadorminusculas++;
            } else {
                if (password.charAt(i) >= 65 && password.charAt(i) <= 90) {
                    contadormayusculas++;
                } else {
                    contadornumumeros++;
                }
            }
        }
        if (contadormayusculas>=2 && contadorminusculas>=1 && contadornumumeros>=5){
            System.out.println("La contraseña es segura");
        }else{
            System.out.println("La contraseña NO es segura");
        }
        return null;
    }
}

    

    
    
