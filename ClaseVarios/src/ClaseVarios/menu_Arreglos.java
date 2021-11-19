package ClaseVarios;

public class menu_Arreglos {

    static int TAm = 5, POS = 0;
    static int d[] = new int[TAm];
    static Varios v = new Varios();

    public static void main(String[] args) {

        int opi;

        do {
            String menu = "Menu de arreglos \n "
                    + "1. Adicionar \n "
                    + "2.Listar \n "
                    + "3.Buscar \n "
                    + "4.Invertir \n "
                    + "5. Eliminar \n "
                    + "7. Ordenar \n"
                    + "8. Seleccion \n"
                    + "0. salir \n ";

            opi = (int) v.leerEntero(menu);

            switch (opi) {

                case 1:
                    Adicionar();
                    break;
                case 2:
                    Listar();
                    break;
                case 3:
                    Buscar();
                    break;
                case 4:
                    Invertir();
                    break;
                case 5:
                    Eliminar();
                    break;
                case 7:
                    Ordenar();
                    break;
                case 8:
                    Seleccion();
                    break;
            }

        } while (opi != 0);
    }

    public static void Adicionar() {
        if (POS == TAm) {
            v.Mensaje(" Arreglo lleno ");
        } else {
            d[POS++] = (int) v.leerEntero("Ingrese numero[" + POS + "]= ");
        }
    }

    public static void Listar() {
        if (POS == 0) {
            v.Mensaje("No hay elementos");
        } else {
            String cad = "Elementos \n ";
            for (int i = 0; i < POS; i++) {
                cad = cad + "a[" + i + "]= " + d[i] + " \n";
            }
            v.Mensaje(cad);
        }
    }

    public static void Buscar() {
        if (POS == 0) {
            v.Mensaje("No hay elementos ");
        } else {
            int i, n = (int) v.leerEntero("Numero a buscar ");

            for (i = 0; i < POS; i++) {
                if (d[i] == n) {
                    break;
                }
                if (i < POS) {
                    v.Mensaje("lo encontro en la posicion " + i);
                } else {
                    v.Mensaje("No existe " + n);
                }
            }

        }
    }

    public static void Invertir() {
        if (POS == 0) {
            v.Mensaje("No hay elementos ");
        } else {
            int i = 0;
            int j = POS - 1;
            while (i < j) {
                int aux = d[i];
                d[i] = d[j];
                d[j] = aux;
                i++;
                j--;
            }
            v.Mensaje("Invertido ");
        }

    }

    public static void Eliminar() {
        if (POS == 0) {
            v.Mensaje("No hay elementos ");
        } else {
            int i, n = (int) v.leerEntero("Numero a eliminar ");

            for (i = 0; i < POS; i++) {
                if (d[i] == n) {
                    break;
                }
                if (i < POS) {
                    for (; i < POS - 1; i++) {
                        d[i] = d[i + 1];
                    }

                    POS--;
                    v.Mensaje("Eliminado " + n);
                } else {
                    v.Mensaje("No existe " + n);
                }

            }
        }
    }

    public static void Ordenar() {
        int i, j;
        for (i = 0; i < POS - 1; i++) {
            for (j = i + 1; j < POS; j++) {
                if (d[i] > d[j]) {
                    int aux = d[i];
                    d[i] = d[j];
                    d[j] = aux;
                }
            }
            v.Mensaje(" arreglo ordenado ");
        }

    }
    public static void Seleccion() {
        int i, j, menor;
        for (i = 0; i < POS - 1; i++) {      
            menor = i;                             
            for (j = i + 1; j < POS; j++) { 
                if (d[menor] > d[j]) {                 
                    menor = j;
                }
            }
            if (i != menor) {                                             
                int aux = d[i];
                d[i] = d[menor];
                d[menor] = aux;
            }
        }
        v.Mensaje("Arreglo Ordenado");
    
    }

}
   
// public static void     binaria() {
  //     j = POS - 1;
    //    n = v.leerEntero("Numero a buscar: ");
   //     while (i <= j) {
     //       m = (i + j) / 2;
       //     if (a[m] == n) {
      //          break;
       //     } else if (a[m] < n) {
        //        i = m + 1;
       //     } else {
    //            j = m - 1;
      //      }

      //  }
     //   if (i <= j) {
     //       v.Mensaje("Se encontro posicion " + m);
      //  } else {
      //      v.Mensaje("No Se encontro");
     //   }
  //  }


