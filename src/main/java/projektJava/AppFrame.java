package projektJava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.InputVerifier;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AppFrame extends javax.swing.JFrame {

    /**
     * Utworzenie ramki
     */
    public AppFrame() {
        initComponents();
    }

    /**
     * Inicjalizacja komponentów
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        albumNumberL = new JLabel();
        activeL = new JLabel();
        albumNumberTF = new JTextField();
        activeTF = new JTextField();
        groupL = new JLabel();
        projectL = new JLabel();
        groupTF = new JTextField();
        projectTF = new JTextField();
        personL = new JLabel();
        kolokwium1L = new JLabel();
        personTF = new JTextField();
        kolokwium1TF = new JTextField();
        homeworkL = new JLabel();
        kolokwium2L = new JLabel();
        homeworkTF = new JTextField();
        kolokwium2TF = new JTextField();
        examL = new JLabel();
        examTF = new JTextField();
        addB = new JButton();
        jScrollPane1 = new JScrollPane();
        tab = new JTable();
        saveTable = new JButton();
        importFile = new JButton();

        //operacja zamkniecia okna
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        albumNumberL.setText("Numer albumu");

        activeL.setText("Aktywnoœæ");

        albumNumberTF.setInputVerifier(new InputVerifier() {
            @Override
            public boolean verify(JComponent input) {
                try {
                    Integer.parseInt(((JTextField)input).getText());
                } catch (NumberFormatException e) {
                    return false;
                }
                return true;
            }
        });

        activeTF.setInputVerifier(new InputVerifier() {
            @Override
            public boolean verify(JComponent input) {
                try {
                    Integer.parseInt(((JTextField)input).getText());
                } catch (NumberFormatException e) {
                    return false;
                }
                return true;
            }
        });

        groupL.setText("Grupa");

        projectL.setText("Projekt");

        groupTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupTFActionPerformed(evt);
            }
        });

        projectTF.setInputVerifier(new InputVerifier() {
            @Override
            public boolean verify(JComponent input) {
                try {
                    Integer.parseInt(((JTextField)input).getText());
                } catch (NumberFormatException e) {
                    return false;
                }
                return true;
            }
        });

        personL.setText("Osoba");

        kolokwium1L.setText("Kolokwium 1");

        kolokwium1TF.setInputVerifier(new InputVerifier() {
            @Override
            public boolean verify(JComponent input) {
                try {
                    Integer.parseInt(((JTextField)input).getText());
                } catch (NumberFormatException e) {
                    return false;
                }
                return true;
            }
        });

        homeworkL.setText("Praca domowa");

        kolokwium2L.setText("Kolokwium 2");

        homeworkTF.setInputVerifier(new InputVerifier() {
            @Override
            public boolean verify(JComponent input) {
                try {
                    Integer.parseInt(((JTextField)input).getText());
                } catch (NumberFormatException e) {
                    return false;
                }
                return true;
            }
        });

        kolokwium2TF.setInputVerifier(new InputVerifier() {
            @Override
            public boolean verify(JComponent input) {
                try {
                    Integer.parseInt(((JTextField)input).getText());
                } catch (NumberFormatException e) {
                    return false;
                }
                return true;
            }
        });

        examL.setText("Egzamin");

        examTF.setInputVerifier(new InputVerifier() {
            @Override
            public boolean verify(JComponent input) {
                try {
                    Integer.parseInt(((JTextField)input).getText());
                } catch (NumberFormatException e) {
                    return false;
                }
                return true;
            }
        });

        addB.setText("Dodaj");
        addB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBActionPerformed(evt);
            }
        });

        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numer albumu", "Osoba", "Grupa", "Praca domowa", "Aktywnoœæ", "Projekt", "Kolokwium1", "Kolokwium 2", "Egzamin", "SUMA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tab);

        saveTable.setText("Zapis do pliku");
        saveTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveTableActionPerformed(evt);
            }
        });

        importFile.setText("Wczytaj");
        importFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(examL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(albumNumberL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(activeL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(examTF, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                            .addComponent(albumNumberTF)
                            .addComponent(activeTF))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(groupL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(projectL, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(projectTF, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(groupTF, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(addB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(kolokwium1L, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(kolokwium1TF, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(personL, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(personTF, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(homeworkL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(homeworkTF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(kolokwium2L, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(kolokwium2TF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(saveTable)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(importFile)
                                .addGap(74, 74, 74)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(albumNumberL, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(albumNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(groupL)
                    .addComponent(groupTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personL)
                    .addComponent(personTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeworkL)
                    .addComponent(homeworkTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(activeL)
                    .addComponent(projectL)
                    .addComponent(activeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projectTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kolokwium1L)
                    .addComponent(kolokwium1TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kolokwium2L)
                    .addComponent(kolokwium2TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examL)
                    .addComponent(examTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addB)
                    .addComponent(saveTable)
                    .addComponent(importFile))
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }

    private void groupTFActionPerformed(java.awt.event.ActionEvent evt) {
    }

    /**
     * Dodanie rekortu do JTable
     * @param evt
     */
    private void addBActionPerformed(java.awt.event.ActionEvent evt) {
         //walidacja zeby nie bylo pustych danych
        if(personTF.getText().isEmpty() || albumNumberTF.getText().isEmpty() || groupTF.getText().isEmpty()){
	        //jesli ktores puste to pokaz wiadomoœc
	        JOptionPane.showMessageDialog(this, "WprowadŸ wszystkie dane!");
        }else{
        	//pocz¹tkowa wartoœæ jest prawdziwa - dodanie danych do tabeli
            boolean isOK = true;
            //sprawdza poprawnoœæ wartoœci pracy donowej
            if(Integer.valueOf(homeworkTF.getText()) <0 || Integer.valueOf(homeworkTF.getText())> 5){
                isOK = false;
                JOptionPane.showMessageDialog(this, "Niepoprawne dane! Praca domowa - dopuszczalne wartoœci ca³kowite od 0 do 5");
            }
            
            //sprawdza poprawnoœæ wartoœci aktywnoœci
            if(Integer.valueOf(activeTF.getText()) <0 || Integer.valueOf(activeTF.getText())> 5){
                isOK = false;
                JOptionPane.showMessageDialog(this, "Niepoprawne dane! Aktywnoœæ - dopuszczalne wartoœci ca³kowite od 0 do 5");
            }
            
          //sprawdza poprawnoœæ wartoœci projektu
            if(Integer.valueOf(projectTF.getText()) <0 || Integer.valueOf(projectTF.getText())> 10){
                isOK = false;
                JOptionPane.showMessageDialog(this, "Niepoprawne dane! Projekt - dopuszczalne wartoœci ca³kowite od 0 do 10");
            }
            
          //sprawdza poprawnoœæ wartoœci kolokwium 1
            if(Integer.valueOf(kolokwium1TF.getText()) <0 || Integer.valueOf(kolokwium1TF.getText())> 20){
                isOK = false;
                JOptionPane.showMessageDialog(this, "Niepoprawne dane! Kolokwium 1 - dopuszczalne wartoœci ca³kowite od 0 do 20");
            }
            
          //sprawdza poprawnoœæ wartoœci kolokwium 2
            if(Integer.valueOf(kolokwium2TF.getText()) <0 || Integer.valueOf(kolokwium2TF.getText())> 20){
                isOK = false;
                JOptionPane.showMessageDialog(this, "Niepoprawne dane! Kolokwium 2 - dopuszczalne wartoœci ca³kowite od 0 do 20");
            }
            
          //sprawdza poprawnoœæ wartoœci egzaminu
            if(Integer.valueOf(examTF.getText()) <0 || Integer.valueOf(examTF.getText())> 40){
                isOK = false;
                JOptionPane.showMessageDialog(this, "Niepoprawne dane! Egzamin - dopuszczalne wartoœci ca³kowite od 0 do 40");
            }
            
          //sprawdza poprawnoœæ wartoœci numeru albumu
            if(albumNumberTF == null){
                isOK = false;
                JOptionPane.showMessageDialog(this, "Niepoprawne dane! Numer albumu nie mo¿e byæ pusty");
            }
            
          //sprawdza poprawnoœæ wartoœci osoby - czy jest imie i nazwisko - przynajmniej dwa cz³ony
            if((personTF.getText() == null ) || (personTF.getText().isEmpty())){
                isOK = false;
                JOptionPane.showMessageDialog(this, "Niepoprawne dane! Osoba - imiê i nazwisko nie mog¹ byæ puste");
            }else{
                if(!personTF.getText().trim().contains(" ")){
                    isOK = false;
                    JOptionPane.showMessageDialog(this, "Niepoprawne dane! Osoba - musi zawieraæ przynajmniej dwa cz³ony");
                }; 
            }
          //sprawdza poprawnoœæ wartoœci grupy
            if((groupTF == null ) || (groupTF.getText().isEmpty())){
                isOK = false;
                JOptionPane.showMessageDialog(this, "Niepoprawne dane! Grupa - nie mo¿e byæ pusta");
            }
       
            if(isOK){
            	//wylicza sume pól punktowych
                Integer suma = suma = Integer.parseInt(homeworkTF.getText())
                        + Integer.parseInt(activeTF.getText())
                        + Integer.parseInt(projectTF.getText())
                        + Integer.parseInt(kolokwium1TF.getText())
                        + Integer.parseInt(kolokwium2TF.getText())
                        +Integer.parseInt(examTF.getText());
                
                //przygotowanie danych do zapisu
                String data[] = {albumNumberTF.getText(), personTF.getText(), groupTF.getText(), homeworkTF.getText(),
                activeTF.getText(), projectTF.getText(), kolokwium1TF.getText(), kolokwium2TF.getText(), examTF.getText(), suma.toString()};
                
                DefaultTableModel tblModel = (DefaultTableModel)tab.getModel();
                //dodanie wiersza do tabeli
                tblModel.addRow(data); 
                //uda³o sie, wiersz dodany
                JOptionPane.showMessageDialog(this, "Dane poprawnie dodane!");
                //wczyszczenie wartoœci pól
                albumNumberTF.setText("");
                personTF.setText("");
                groupTF.setText("");
                homeworkTF.setText("");
                activeTF.setText("");
                projectTF.setText("");
                kolokwium1TF.setText("");
                kolokwium2TF.setText("");
                examTF.setText("");
            }
       
        }
    }

    /**
     * Zapis danych z JTable do pliku
     * @param evt
     */
    private void saveTableActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Zapis do pliku");
        int result = fileChooser.showSaveDialog(tab);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);

                for(int i = 0; i < tab.getRowCount(); i++){//rows
                    for(int j = 0; j < tab.getColumnCount(); j++){//columns
                        bw.write(tab.getValueAt(i, j).toString().replace(" ", "_")+" ");
                    }
                    bw.newLine();
                }

                bw.close();
                fw.close();

            } catch (IOException ex) {
            } 
        }
    }

    /**
     * Import danych z pliku do JTable
     * @param evt
     */
    private void importFileActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Zapis do pliku");
        int result = fileChooser.showOpenDialog(tab);
        //otwarcie okna dialogowego
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);

                DefaultTableModel model = (DefaultTableModel)tab.getModel();
                Object[] lines = br.lines().toArray();

                for(int i = 0; i < lines.length; i++){
                    String[] row = lines[i].toString().split(" ");
                    row[1] = row[1].toString().replace("_", " ");
                    model.addRow(row);
                }

            } catch (FileNotFoundException ex) {
            }
        
        }
    }

    /**
     * Funkcja inicjalizuj¹ca - main
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppFrame().setVisible(true);
            }
        });
    }
   
    /**
     * Zmienne dla okna aplikacji
     */
    
    /**
     * Etykieta aktywnoœci
     */
    private JLabel activeL;
    /**
     * Pole danych aktywnoœæ
     */
    private JTextField activeTF;
    /**
     * Przycisk dodawania rekordu
     */
    private JButton addB;
    /**
     * Etykieta numeru albumu
     */
    private JLabel albumNumberL;
    /**
     * Pole danych numer albumu
     */
    private JTextField albumNumberTF;
    /**
     * Etykieta egzaminu
     */
    private JLabel examL;
    /**
     * Pole danych egzamin
     */
    private JTextField examTF;
    /**
     * Etykieta grupy
     */
    private JLabel groupL;
    /**
     * Pole danych grupa
     */
    private JTextField groupTF;
    /**
     * Etykieta praca domowa
     */
    private JLabel homeworkL;
    /**
     * Pole danych praca domowa
     */
    private JTextField homeworkTF;
    /**
     * Przycisk wczytywania danych z pliku
     */
    private JButton importFile;
    /**
     * Pasek przewijania
     */
    private JScrollPane jScrollPane1;
    /**
     * Etykieta kolokwium 1
     */
    private JLabel kolokwium1L;
    /**
     * Pole danych kolokwium 1
     */
    private JTextField kolokwium1TF;
    /**
     * Etykieta kolokwium 2
     */
    private JLabel kolokwium2L;
    /**
     * Pole danych kolokwium 2
     */
    private JTextField kolokwium2TF;
    /**
     * Etykieta osoba- imie i nazwisko
     */
    private JLabel personL;
    /**
     * Pole danych osoby - imie i nazwisko
     */
    private JTextField personTF;
    /**
     * Etykieta projekt
     */
    private JLabel projectL;
    /**
     * Pole danych projekt
     */
    private JTextField projectTF;
    /**
     * Przycisk do zapisu pliku
     */
    private JButton saveTable;
    /**
     * Tabela
     */
    private JTable tab;
}
