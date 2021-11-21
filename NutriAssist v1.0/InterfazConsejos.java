package Nutri;

/**
 *
 * @author Elena Rodriguez
 */
public class InterfazConsejos extends javax.swing.JFrame {
    
    CalculadoraCantidades calcu = new CalculadoraCantidades();
    
    public InterfazConsejos() {
        initComponents();
    }

    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Peso1 = new javax.swing.JTextField();
        Altura1 = new javax.swing.JTextField();
        Edad1 = new javax.swing.JTextField();
        Sexo1 = new javax.swing.JTextField();
        Grasas1 = new javax.swing.JButton();
        Carbohidratos1 = new javax.swing.JButton();
        Agua1 = new javax.swing.JButton();
        FV1 = new javax.swing.JButton();
        Proteinas1 = new javax.swing.JButton();
        Azucares1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Resultado1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel1.setText("CALCULADORA CANTIDADES");

        jLabel2.setText("Peso en lbs:");

        jLabel3.setText("Altura en cm:");

        jLabel4.setText("Edad:");

        jLabel5.setText("Sexo:               1.F    2.M");

        Peso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Peso1ActionPerformed(evt);
            }
        });

        Grasas1.setText("Grasas");
        Grasas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Grasas1ActionPerformed(evt);
            }
        });

        Carbohidratos1.setText("Carbohidratos");
        Carbohidratos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carbohidratos1ActionPerformed(evt);
            }
        });

        Agua1.setText("Agua");
        Agua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agua1ActionPerformed(evt);
            }
        });

        FV1.setText("Frutas y Verduras");
        FV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FV1ActionPerformed(evt);
            }
        });

        Proteinas1.setText("Proteinas");
        Proteinas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Proteinas1ActionPerformed(evt);
            }
        });

        Azucares1.setText("Azucares");
        Azucares1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Azucares1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Resultado:");

        Resultado1.setBackground(new java.awt.Color(153, 153, 255));
        Resultado1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Resultado1.setForeground(new java.awt.Color(51, 0, 153));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(Peso1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Altura1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(Edad1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addComponent(Sexo1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Carbohidratos1))
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel6))
                            .addComponent(Grasas1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Azucares1)
                                        .addGap(176, 176, 176))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Agua1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(FV1)
                                        .addGap(49, 49, 49)))
                                .addComponent(Proteinas1))
                            .addComponent(Resultado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(Peso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Edad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(Altura1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sexo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Agua1)
                    .addComponent(FV1)
                    .addComponent(Grasas1)
                    .addComponent(Proteinas1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Carbohidratos1)
                    .addComponent(Azucares1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Resultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(68, 68, 68))
        );

        pack();
    }

    private void Peso1ActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void Agua1ActionPerformed(java.awt.event.ActionEvent evt) {
        //Se obtiene los valores que coloco el usuario
        int peso=0;
        int altura=0;
        int edad=0;
        int sexo=0;
        try{
            peso = Integer.parseInt(Peso1.getText());
            altura = Integer.parseInt(Altura1.getText());
            edad = Integer.parseInt(Edad1.getText());
            sexo = Integer.parseInt(Sexo1.getText());
        } catch(NumberFormatException ex){
            Resultado1.setText("Debe ingresar un numero entero");
        }
        
        //Se llama al metodo para calcular la porcion de agua
        calcu.CalcularAgua(peso, altura, edad, sexo);
        
        Resultado1.setText(calcu.result);
    }

    private void Grasas1ActionPerformed(java.awt.event.ActionEvent evt) {
    	//Se obtiene los valores que coloco el usuario
    	int peso=0;
        int altura=0;
        int edad=0;
        int sexo=0;
        try{
            peso = Integer.parseInt(Peso1.getText());
            altura = Integer.parseInt(Altura1.getText());
            edad = Integer.parseInt(Edad1.getText());
            sexo = Integer.parseInt(Sexo1.getText());
        } catch(NumberFormatException ex){
            Resultado1.setText("Debe ingresar un numero entero");
        }
        
      //Se llama al metodo para calcular la porcion de grasas
        calcu.CalcularGrasas(peso, altura, edad, sexo);
        
        //Se coloca el resultado en el label correspondiente
        Resultado1.setText(calcu.result);
    }

    private void FV1ActionPerformed(java.awt.event.ActionEvent evt) {
    	//Se obtienen los valores que coloco el usuario
        int peso=0;
        int altura=0;
        int edad=0;
        int sexo=0;
        try{
            peso = Integer.parseInt(Peso1.getText());
            altura = Integer.parseInt(Altura1.getText());
            edad = Integer.parseInt(Edad1.getText());
            sexo = Integer.parseInt(Sexo1.getText());
        } catch(NumberFormatException ex){
            Resultado1.setText("Debe ingresar un numero entero");
        }
        
      //Se llama al metodo para calcular la porcion de frutas y verduras
        calcu.CalcularFV(peso, altura, edad, sexo);
        
      //Se coloca el resultado en el label correspondiente
        Resultado1.setText(calcu.result);
    }

    private void Proteinas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Proteinas1ActionPerformed
    	//Se obtienen los valores que coloco el usuario
        int peso=0;
        int altura=0;
        int edad=0;
        int sexo=0;
        try{
            peso = Integer.parseInt(Peso1.getText());
            altura = Integer.parseInt(Altura1.getText());
            edad = Integer.parseInt(Edad1.getText());
            sexo = Integer.parseInt(Sexo1.getText());
        } catch(NumberFormatException ex){
            Resultado1.setText("Debe ingresar un numero entero");
        }
        
      //Se llama al metodo para calcular la porcion de proteinas
        calcu.CalcularProteinas(peso, altura, edad, sexo);
        
      //Se coloca el resultado en el label correspondiente
        Resultado1.setText(calcu.result);
    }

    private void Azucares1ActionPerformed(java.awt.event.ActionEvent evt) {
    	//Se obtienen los valores que coloco el usuario
        int peso=0;
        int altura=0;
        int edad=0;
        int sexo=0;
        try{
            peso = Integer.parseInt(Peso1.getText());
            altura = Integer.parseInt(Altura1.getText());
            edad = Integer.parseInt(Edad1.getText());
            sexo = Integer.parseInt(Sexo1.getText());
        } catch(NumberFormatException ex){
            Resultado1.setText("Debe ingresar un numero entero");
        }
        
      //Se llama al metodo para calcular la porcion de proteinas
        calcu.CalcularAzucares(peso, altura, edad, sexo);
        
      //Se coloca el resultado en el label correspondiente
        Resultado1.setText(calcu.result);
    }

    private void Carbohidratos1ActionPerformed(java.awt.event.ActionEvent evt) {
    	//Se obtienen los valores que coloco el usuario
        int peso=0;
        int altura=0;
        int edad=0;
        int sexo=0;
        try{
            peso = Integer.parseInt(Peso1.getText());
            altura = Integer.parseInt(Altura1.getText());
            edad = Integer.parseInt(Edad1.getText());
            sexo = Integer.parseInt(Sexo1.getText());
        } catch(NumberFormatException ex){
            Resultado1.setText("Debe ingresar un numero entero");
        }
        
      //Se llama al metodo para calcular la porcion de carbohidratos
        calcu.CalcularCarbs(peso, altura, edad, sexo);
        
      //Se coloca el resultado en el label correspondiente
        Resultado1.setText(calcu.result);
    }

  


    // Declaración de variables
    private javax.swing.JButton Agua1;
    private javax.swing.JTextField Altura1;
    private javax.swing.JButton Azucares1;
    private javax.swing.JButton Carbohidratos1;
    private javax.swing.JTextField Edad1;
    private javax.swing.JButton FV1;
    private javax.swing.JButton Grasas1;
    private javax.swing.JTextField Peso1;
    private javax.swing.JButton Proteinas1;
    private javax.swing.JLabel Resultado1;
    private javax.swing.JTextField Sexo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
}
