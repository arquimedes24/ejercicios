
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;
import org.math.plot.Plot2DPanel;
import org.nfunk.jep.JEP;


public class Secante extends javax.swing.JFrame {

    DefaultTableModel tabla;

    private boolean punto = true;
    String valor1, valor2, signo, contenido;
    Double resultado;

    public Secante() {
        initComponents();
        grafica.setBounds(770, 350, 460, 350);
        grafica.setBackground(Color.ORANGE);
        add(grafica);
        String Titulo[] = {"Iteracion", "X1", "X0", "F(x1)", "F(x0)", "Aproximacion", "Error"};
        tabla = new DefaultTableModel();
        tabla.setColumnIdentifiers(Titulo);
        TablaResultados.setEnabled(false);
        TablaResultados.setModel(tabla);
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/icon.png")));
         

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btn5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        calcular = new javax.swing.JButton();
        btnx = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btne = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        f = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnborrar = new javax.swing.JButton();
        btnc = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        x1 = new javax.swing.JTextField();
        BotonSalir2 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        raiz = new javax.swing.JTextField();
        e = new javax.swing.JTextField();
        x0 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        n = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btn3 = new javax.swing.JButton();
        btnelevado = new javax.swing.JButton();
        btnparesis1 = new javax.swing.JButton();
        btncos = new javax.swing.JButton();
        btntan = new javax.swing.JButton();
        btnsen = new javax.swing.JButton();
        btnparesis2 = new javax.swing.JButton();
        btnpor = new javax.swing.JButton();
        btnmenos = new javax.swing.JButton();
        btnmas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaResultados = new javax.swing.JTable();
        txterror = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.darkGray);

        jPanel1.setBackground(java.awt.Color.darkGray);
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn2.setBackground(new java.awt.Color(102, 0, 102));
        btn2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 50, 51));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setText("Tabla ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 409, -1));

        btn5.setBackground(new java.awt.Color(102, 0, 102));
        btn5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 50, 51));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 0));
        jLabel8.setText("Grafico");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 310, 150, -1));

        calcular.setBackground(new java.awt.Color(102, 0, 102));
        calcular.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        calcular.setForeground(new java.awt.Color(255, 255, 255));
        calcular.setText("CALCULAR");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });
        jPanel1.add(calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, 120, 51));

        btnx.setBackground(new java.awt.Color(102, 0, 102));
        btnx.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnx.setForeground(new java.awt.Color(255, 255, 255));
        btnx.setText("x");
        btnx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxActionPerformed(evt);
            }
        });
        jPanel1.add(btnx, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 50, 51));

        btn9.setBackground(new java.awt.Color(102, 0, 102));
        btn9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 50, 51));

        btn6.setBackground(new java.awt.Color(102, 0, 102));
        btn6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 50, 51));

        btne.setBackground(new java.awt.Color(102, 0, 102));
        btne.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btne.setForeground(new java.awt.Color(255, 255, 255));
        btne.setText("e");
        btne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneActionPerformed(evt);
            }
        });
        jPanel1.add(btne, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 50, 51));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Raíz");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 290, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("X0");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 40, -1));

        f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fActionPerformed(evt);
            }
        });
        jPanel1.add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 370, 60));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("El Método De La Secante");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 36, 409, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Error %");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 70, 20));

        btnborrar.setBackground(new java.awt.Color(102, 0, 102));
        btnborrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnborrar.setForeground(new java.awt.Color(255, 255, 255));
        btnborrar.setText("Delete");
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnborrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 370, 50));

        btnc.setBackground(new java.awt.Color(102, 0, 102));
        btnc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnc.setForeground(new java.awt.Color(255, 255, 255));
        btnc.setText("Reset");
        btnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncActionPerformed(evt);
            }
        });
        jPanel1.add(btnc, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 70, 170));

        btn1.setBackground(new java.awt.Color(102, 0, 102));
        btn1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 50, 51));

        btn4.setBackground(new java.awt.Color(102, 0, 102));
        btn4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 50, 51));

        btn7.setBackground(new java.awt.Color(102, 0, 102));
        btn7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 50, 51));

        btn0.setBackground(new java.awt.Color(102, 0, 102));
        btn0.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel1.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 50, 51));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ingrese La Función");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 409, -1));

        x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x1ActionPerformed(evt);
            }
        });
        jPanel1.add(x1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 60, 30));

        BotonSalir2.setBackground(new java.awt.Color(204, 0, 0));
        BotonSalir2.setForeground(new java.awt.Color(255, 255, 255));
        BotonSalir2.setText("Exit");
        BotonSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalir2ActionPerformed(evt);
            }
        });
        jPanel1.add(BotonSalir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 48));

        btn8.setBackground(new java.awt.Color(102, 0, 102));
        btn8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 50, 51));

        raiz.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        raiz.setDisabledTextColor(new java.awt.Color(153, 0, 0));
        raiz.setEnabled(false);
        raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raizActionPerformed(evt);
            }
        });
        jPanel1.add(raiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 210, 30));

        e.setForeground(new java.awt.Color(255, 255, 255));
        e.setText("1e-6");
        jPanel1.add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 100, 30));

        x0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x0ActionPerformed(evt);
            }
        });
        jPanel1.add(x0, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 60, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ingrese Los Valores Iniciales");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 290, -1));

        n.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        n.setText("100");
        n.setDisabledTextColor(new java.awt.Color(153, 0, 51));
        n.setEnabled(false);
        n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nActionPerformed(evt);
            }
        });
        jPanel1.add(n, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 60, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Max. Iteraciones");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 160, -1));

        btn3.setBackground(new java.awt.Color(102, 0, 102));
        btn3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 50, 51));

        btnelevado.setBackground(new java.awt.Color(102, 0, 102));
        btnelevado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnelevado.setForeground(new java.awt.Color(255, 255, 255));
        btnelevado.setText("^");
        btnelevado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnelevadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnelevado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 50, 51));

        btnparesis1.setBackground(new java.awt.Color(102, 0, 102));
        btnparesis1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnparesis1.setForeground(new java.awt.Color(255, 255, 255));
        btnparesis1.setText("(");
        btnparesis1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnparesis1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnparesis1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 50, 51));

        btncos.setBackground(new java.awt.Color(102, 0, 102));
        btncos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btncos.setForeground(new java.awt.Color(255, 255, 255));
        btncos.setText("cos");
        btncos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncosActionPerformed(evt);
            }
        });
        jPanel1.add(btncos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, 51));

        btntan.setBackground(new java.awt.Color(102, 0, 102));
        btntan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btntan.setForeground(new java.awt.Color(255, 255, 255));
        btntan.setText("tan");
        btntan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntanActionPerformed(evt);
            }
        });
        jPanel1.add(btntan, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 70, 51));

        btnsen.setBackground(new java.awt.Color(102, 0, 102));
        btnsen.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnsen.setForeground(new java.awt.Color(255, 255, 255));
        btnsen.setText("sen");
        btnsen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsenActionPerformed(evt);
            }
        });
        jPanel1.add(btnsen, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, 51));

        btnparesis2.setBackground(new java.awt.Color(102, 0, 102));
        btnparesis2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnparesis2.setForeground(new java.awt.Color(255, 255, 255));
        btnparesis2.setText(")");
        btnparesis2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnparesis2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnparesis2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 50, 51));

        btnpor.setBackground(new java.awt.Color(102, 0, 102));
        btnpor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnpor.setForeground(new java.awt.Color(255, 255, 255));
        btnpor.setText("*");
        btnpor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnporActionPerformed(evt);
            }
        });
        jPanel1.add(btnpor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 50, 51));

        btnmenos.setBackground(new java.awt.Color(102, 0, 102));
        btnmenos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnmenos.setForeground(new java.awt.Color(255, 255, 255));
        btnmenos.setText("-");
        btnmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenosActionPerformed(evt);
            }
        });
        jPanel1.add(btnmenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 50, 51));

        btnmas.setBackground(new java.awt.Color(102, 0, 102));
        btnmas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnmas.setForeground(new java.awt.Color(255, 255, 255));
        btnmas.setText("+");
        btnmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmasActionPerformed(evt);
            }
        });
        jPanel1.add(btnmas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 50, 51));

        TablaResultados.setBackground(new java.awt.Color(102, 0, 0));
        TablaResultados.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        TablaResultados.setForeground(new java.awt.Color(255, 255, 255));
        TablaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaResultados.setEnabled(false);
        TablaResultados.setGridColor(new java.awt.Color(0, 0, 51));
        TablaResultados.setMaximumSize(new java.awt.Dimension(2147483647, 64333331));
        TablaResultados.setPreferredSize(new java.awt.Dimension(500000, 500000));
        TablaResultados.setSelectionBackground(new java.awt.Color(0, 0, 0));
        TablaResultados.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(TablaResultados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 670, 100));

        txterror.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txterror.setText("0");
        txterror.setDisabledTextColor(new java.awt.Color(153, 0, 0));
        txterror.setEnabled(false);
        txterror.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txterrorActionPerformed(evt);
            }
        });
        jPanel1.add(txterror, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 60, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("X1");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 40, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        f.setText(f.getText() + "2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        f.setText(f.getText() + "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        // TODO add your handling code here:
        String def = f.getText();
        double lx0 = Double.parseDouble(x0.getText());
        double lx1 = Double.parseDouble(x1.getText());
        double le = Double.parseDouble(e.getText());
        int ln = Integer.parseInt(n.getText());
        int error= Integer.parseInt(txterror.getText());
        Funcion ff = new Funcion(def);
        Secant s = new Secant();
        double r = s.raiz(ff, lx0, lx1, ln, le);
        int iteracion = 1;
        double X1 = 0, X0 = 0, Fx1 = 0, Fx0 = 0, aproximacion = 0, Ear = 100;
        double X0Anterior = 0;

        raiz.setText("" + r);

        double[] x = new double[200];
        double[] y = new double[200];
        double xi = lx0 - 10;

        X1 = lx1;
        X0 = lx0;
        while (!(Ear == error)) {

            Fx1 = evaluarf(X1);
            Fx0 = evaluarf(X0);

            aproximacion = X0 - (((Fx0) * (X1 - X0) / ((Fx1) - (Fx0))));

            if (X1 >= 0) {
                //Datos de la tabla

                String datoIteracion = String.valueOf(iteracion);
                String datoX1 = String.valueOf(X1);
                String datoX0 = String.valueOf(X0);
                String datoFx1 = String.valueOf(Fx1);
                String datoFx0 = String.valueOf(Fx0);
                String datoAproximacion = String.valueOf(aproximacion);
                String datoError = String.valueOf(Ear);

                String datos[] = {datoIteracion, datoX1, datoX0, datoFx1, datoFx0, datoAproximacion, datoError};
                tabla.addRow(datos);
                X0Anterior = aproximacion;

                Ear = Math.abs(((X0Anterior - X0) / X0Anterior) * 100);

                X1 = X0;
                X0 = aproximacion;

            }

            iteracion++;
        }

        for (int i = 0; i < 200; i++) {
            x[i] = xi + i * 0.1;
            y[i] = ff.eval(x[i]);

        }
        grafica.addLegend("SOUTH");
        grafica.removeAllPlots();
        grafica.addLinePlot(def, Color.RED, x, y);


    }//GEN-LAST:event_calcularActionPerformed

    private double evaluarf(double x) {
        double e = 2.718281;
        double f_x;

        JEP jpfuncion = new JEP();
        jpfuncion.addStandardFunctions();
        jpfuncion.addStandardConstants();
        jpfuncion.addConstant("x", x);
        jpfuncion.parseExpression(f.getText());
        f_x = jpfuncion.getValue();
        return f_x;

    }


    private void btnxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxActionPerformed
        // TODO add your handling code here:
        f.setText(f.getText() + "x");
    }//GEN-LAST:event_btnxActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        f.setText(f.getText() + "9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        f.setText(f.getText() + "6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneActionPerformed
        // TODO add your handling code here:
        f.setText(f.getText() + "e");
    }//GEN-LAST:event_btneActionPerformed

    private void fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fActionPerformed

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed
        // TODO add your handling code here:

        contenido = f.getText();
        if (contenido.length() > 0) {
            contenido = contenido.substring(0, contenido.length() - 1);;
            f.setText(contenido);
        }
    }//GEN-LAST:event_btnborrarActionPerformed

    private void btncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncActionPerformed
        // TODO add your handling code here:
        f.setText(" ");
        x1.setText("");
        x0.setText("");
        raiz.setText("");
        tabla.getDataVector().removeAllElements();
        TablaResultados.updateUI();

    }//GEN-LAST:event_btncActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
     f.setText(f.getText()+"1");    }//GEN-LAST:event_btn1ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        f.setText(f.getText() + "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        f.setText(f.getText() + "7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        f.setText(f.getText() + "0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x1ActionPerformed

    private void BotonSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalir2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotonSalir2ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:

        f.setText(f.getText() + "8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_raizActionPerformed

    private void x0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x0ActionPerformed

    private void nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        f.setText(f.getText() + "3");

    }//GEN-LAST:event_btn3ActionPerformed

    private void btnelevadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnelevadoActionPerformed
        // TODO add your handling code here:}

        f.setText(f.getText() + "^");

    }//GEN-LAST:event_btnelevadoActionPerformed

    private void btnparesis1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnparesis1ActionPerformed
        // TODO add your handling code here:

        f.setText(f.getText() + "(");
    }//GEN-LAST:event_btnparesis1ActionPerformed

    private void btncosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncosActionPerformed
        // TODO add your handling code here:
        f.setText(f.getText() + "cos");
    }//GEN-LAST:event_btncosActionPerformed

    private void btntanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntanActionPerformed
        // TODO add your handling code here:
        f.setText(f.getText() + "tan");
    }//GEN-LAST:event_btntanActionPerformed

    private void btnsenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsenActionPerformed
        // TODO add your handling code here:
        f.setText(f.getText() + "sin");
    }//GEN-LAST:event_btnsenActionPerformed

    private void btnparesis2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnparesis2ActionPerformed
        // TODO add your handling code here:
        f.setText(f.getText() + ")");
    }//GEN-LAST:event_btnparesis2ActionPerformed

    private void btnporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnporActionPerformed
        // TODO add your handling code here:
        f.setText(f.getText() + "*");
    }//GEN-LAST:event_btnporActionPerformed

    private void btnmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenosActionPerformed
        // TODO add your handling code here:
        f.setText(f.getText() + "-");
    }//GEN-LAST:event_btnmenosActionPerformed

    private void btnmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmasActionPerformed
        // TODO add your handling code here:
        f.setText(f.getText() + "+");

    }//GEN-LAST:event_btnmasActionPerformed

    private void txterrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txterrorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txterrorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Secante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Secante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Secante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Secante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Secante().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSalir2;
    public javax.swing.JTable TablaResultados;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnborrar;
    private javax.swing.JButton btnc;
    private javax.swing.JButton btncos;
    private javax.swing.JButton btne;
    private javax.swing.JButton btnelevado;
    private javax.swing.JButton btnmas;
    private javax.swing.JButton btnmenos;
    private javax.swing.JButton btnparesis1;
    private javax.swing.JButton btnparesis2;
    private javax.swing.JButton btnpor;
    private javax.swing.JButton btnsen;
    private javax.swing.JButton btntan;
    private javax.swing.JButton btnx;
    private javax.swing.JButton calcular;
    private javax.swing.JTextField e;
    private javax.swing.JTextField f;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField n;
    private javax.swing.JTextField raiz;
    private javax.swing.JTextField txterror;
    private javax.swing.JTextField x0;
    private javax.swing.JTextField x1;
    // End of variables declaration//GEN-END:variables

    Plot2DPanel grafica = new Plot2DPanel();

}
