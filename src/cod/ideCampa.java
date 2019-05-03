package cod;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Ivanilson
 */
public class ideCampa extends javax.swing.JFrame{

    //Variáveis Globais  
    Date date;
    Calendar c;
    Path copia, local, dir;
    int h, m, s;
    DateFormat f;
    boolean ativo;
    Random i = new Random();
    String data, jS1, jS2, path, aux;
    boolean noTray, pmusic = false;
    boolean ocultar = true;
    boolean tem;
    ArrayList<File> musicas = new ArrayList<>();
    Path diretorio = Paths.get(System.getProperty("user.dir") + "\\Músicas"); 
    tocaMusica MC = new tocaMusica();
    
    
    public ideCampa() throws Exception {
        diretorio = Paths.get(diretorio.toString().replaceAll("\\\\", "\\\\\\\\"));
        dir = Paths.get(diretorio.toString());
        initComponents();
        setLook();
        setIcon();
        t.start();
        a.start();
        testaDiretorio();
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowIconified(WindowEvent e) {
                segundoPlano();
            }
        });
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                segundoPlano();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPData = new javax.swing.JPanel();
        jVisor = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelDia_semana = new javax.swing.JLabel();
        jLabelDia_mes = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        botao_stop = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        menu_editar = new javax.swing.JMenu();
        jItemAdicionar = new javax.swing.JMenuItem();
        jItemMusica = new javax.swing.JMenuItem();
        jItemOcultar = new javax.swing.JMenuItem();
        menu_ajuda = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sistema de Campa da EEEP Marta Maria Giffoni de Sousa                                                            ");
        setResizable(false);

        jPanel.setBackground(new java.awt.Color(255, 255, 255));
        jPanel.setForeground(new java.awt.Color(255, 255, 255));

        jVisor.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 92)); // NOI18N
        jVisor.setText("14:28");

        jLabelDia_semana.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 38)); // NOI18N
        jLabelDia_semana.setText("quarta-feira");
        jLabelDia_semana.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabelDia_mes.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 38)); // NOI18N
        jLabelDia_mes.setText("6 de agosto");
        jLabelDia_mes.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDia_semana)
                    .addComponent(jLabelDia_mes))
                .addGap(0, 25, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabelDia_mes, jLabelDia_semana});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabelDia_semana)
                .addGap(0, 0, 0)
                .addComponent(jLabelDia_mes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabelDia_mes, jLabelDia_semana});

        javax.swing.GroupLayout jPDataLayout = new javax.swing.GroupLayout(jPData);
        jPData.setLayout(jPDataLayout);
        jPDataLayout.setHorizontalGroup(
            jPDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDataLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jVisor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPDataLayout.setVerticalGroup(
            jPDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPDataLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 98, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/brasao.png"))); // NOI18N

        botao_stop.setText("Stop");
        botao_stop.setToolTipText("Parar Música");
        botao_stop.setFocusable(false);
        botao_stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_stopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botao_stop, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLogo)
                .addGap(37, 37, 37))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelLogo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botao_stop)))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menu_editar.setText("Editar");

        jItemAdicionar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jItemAdicionar.setText("Adicionar músicas");
        jItemAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemAdicionarActionPerformed(evt);
            }
        });
        menu_editar.add(jItemAdicionar);

        jItemMusica.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jItemMusica.setText("Selecionar Música");
        jItemMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemMusicaActionPerformed(evt);
            }
        });
        menu_editar.add(jItemMusica);

        jItemOcultar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jItemOcultar.setText("Ocultar");
        jItemOcultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemOcultarActionPerformed(evt);
            }
        });
        menu_editar.add(jItemOcultar);

        jMenuBar.add(menu_editar);

        menu_ajuda.setText("Ajuda");
        menu_ajuda.setToolTipText("Disponivél apenas nas proximas verssões");
        menu_ajuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_ajudaMouseClicked(evt);
            }
        });
        jMenuBar.add(menu_ajuda);

        jMenu1.setText("Sair");
        jMenu1.setToolTipText("Fechar");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar.add(jMenu1);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jItemOcultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemOcultarActionPerformed
        if (noTray == false) {
            segundoPlano();
        }    
    }//GEN-LAST:event_jItemOcultarActionPerformed

    private void menu_ajudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_ajudaMouseClicked
        JOptionPane.showMessageDialog(null, "Desenvolvido por Ivanilson Sousa", "Ajuda", WIDTH);
    }//GEN-LAST:event_menu_ajudaMouseClicked

    private void botao_stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_stopActionPerformed
        MC.Stop();
        pmusic = false;
    }//GEN-LAST:event_botao_stopActionPerformed

    private void jItemMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemMusicaActionPerformed
        JFileChooser j = new JFileChooser(diretorio.toString());
        j.setAcceptAllFileFilterUsed(false);        
        j.setFileFilter(new FileNameExtensionFilter("Arquivos MP3", "mp3"));
        try {
            j.showOpenDialog(j);
            adicionaMusica(j);
            if(j.getSelectedFile().getParent().equals(diretorio.toString()) == false){
                Files.copy(local, copia, StandardCopyOption.REPLACE_EXISTING);
            }
            pmusic  = true;
        } catch (Exception e){
            pmusic = false;
        }
    }//GEN-LAST:event_jItemMusicaActionPerformed

    private void jItemAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemAdicionarActionPerformed
        try {
            JFileChooser j = new JFileChooser(diretorio.toString());
            j.setAcceptAllFileFilterUsed(false);
            j.setFileFilter(new FileNameExtensionFilter("Arquivos MP3", "mp3"));
            j.showOpenDialog(j);
            path = j.getSelectedFile().getAbsolutePath();
            copia  = Paths.get(path);
            local = Paths.get(copia.toString());
            copia = Paths.get(diretorio.toString() + copia.toString().replace(copia.getParent().toString(), ""));
            Files.copy(local, copia, StandardCopyOption.REPLACE_EXISTING);
            JOptionPane.showMessageDialog(null, "Sua música foi adicionada com êxito!!!");
        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(null, "Desculpe não foi possível adicionar sua música");
        }
    }//GEN-LAST:event_jItemAdicionarActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu1MouseClicked

    public static void main(String args[]) {
        
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ideCampa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            try {
                new ideCampa().setVisible(true);
            } catch (Exception e) {}
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_stop;
    private javax.swing.JMenuItem jItemAdicionar;
    private javax.swing.JMenuItem jItemMusica;
    private javax.swing.JMenuItem jItemOcultar;
    private javax.swing.JLabel jLabelDia_mes;
    private javax.swing.JLabel jLabelDia_semana;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JPanel jPData;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jVisor;
    private javax.swing.JMenu menu_ajuda;
    private javax.swing.JMenu menu_editar;
    // End of variables declaration//GEN-END:variables
    
    boolean temMusica() throws IOException{
        DirectoryStream<Path> files = Files.newDirectoryStream(dir);    
            tem = false;
            for (Path file : files) {
                if (file.getFileName().toString().endsWith(".mp3")) {
                    tem = true;
                    break;
                }              
            }
        return tem;
    }
    
    public void testaDiretorio() throws Exception{
        
        if((Files.exists(diretorio) == false) || (Files.exists(diretorio) && temMusica() == false)){
            try {
                Files.createDirectories(diretorio);
                JFileChooser j  = new JFileChooser(diretorio.toString());
                j.setAcceptAllFileFilterUsed(false);
                j.setFileFilter(new FileNameExtensionFilter("Arquivos MP3", "mp3"));
                setVisible(true);
                JOptionPane.showMessageDialog(null, "Você deve adicionar músicas a lista");
                j.showOpenDialog(j);
                adicionaMusica(j);
                Files.copy(local, copia, StandardCopyOption.REPLACE_EXISTING);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Desculpe não foi possível adicionar sua música");
                testaDiretorio();
            }
        }
    }

    public void adicionaMusica(JFileChooser j) {
        path = j.getSelectedFile().getAbsolutePath();
        copia  = Paths.get(path);
        local = Paths.get(copia.toString());
        copia = Paths.get(diretorio.toString() + copia.toString().replace(copia.getParent().toString(), ""));
    }
    
    public String geraMusica() {
     
        try {
            DirectoryStream<Path> files = Files.newDirectoryStream(dir);
            
            for (Path file : files) {
                if (file.getFileName().toString().endsWith(".mp3")) {
                    musicas.add(file.toFile());
                }              
            }
            
        } catch (Exception e){}
        
        return musicas.get(i.nextInt(musicas.size() - 1)).getAbsoluteFile().toString();
    }
    
    public void tocaMusica() {
        if(pmusic){
            MC.Play(path);
            pmusic = false;
        }else{
            MC.Play(geraMusica());
        }
    }
    
    public void segundoPlano() {

    Image img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens/tray.jpg"));
    TrayIcon trayIcon = new TrayIcon(img, "Sistema de Campa");
    SystemTray tray = SystemTray.getSystemTray();
 
    try {
        tray.add(trayIcon);
    } catch (AWTException e) {}
 
        if(isVisible()){
            setVisible(false);
        }else{
            setVisible(true);
            tray.remove(trayIcon);
            noTray = false;
        }
        
        trayIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {              
                    
                    if(isVisible()){
                        setVisible(false);
                    }else{
                        setVisible(true);
                        tray.remove(trayIcon);
                        noTray = false;
                    }
                
            }
        });        
         
        setVisible(false);
        noTray = true;
}

    public void testaHora() {
        try{
            h = c.get(Calendar.HOUR_OF_DAY);
            m = c.get(Calendar.MINUTE);
            s = c.get(Calendar.SECOND);

            if((h == 7 || h == 13) && (m == 10 || m == 20) &&  s == 0){
                tocaMusica();
                ativo = true;
            }else if((h == 9 || h == 15) && (m == 0 || m == 10 || m == 20) &&  s == 0){
                tocaMusica();
                ativo = true;
            }else if(h == 11 && m == 50 && s == 0){
                tocaMusica();
                ativo = true;
            }else if(h == 17 && m == 0 && s == 0){
                tocaMusica();
                ativo = true;
            }
            if(ocultar){
                segundoPlano();
                ocultar = false;
            }
            if(ativo) {
                try {
                    Thread.sleep(60000);
                    ativo  = false;
                    MC.Stop();
                    a.start();
                    pmusic = false;
                } catch (InterruptedException e) {}

            }
        } catch (Exception e){}
        
    }
    
    Thread t = new Thread() {

        @Override
        public void run() {
            while(true){
                exibir();
            }
        }
      
    };
    
    Thread a = new Thread() {

        @Override
        public void run() {
            while(true) {
                testaHora();
            }
        }
      
    };
    
    public void exibir() {
        c = Calendar.getInstance();
        date = c.getTime();
        f = DateFormat.getDateInstance(DateFormat.FULL);    
        data = f.format(date).substring(0, f.format(date).length()-8);
        data = data.toLowerCase();
        jS1 = data.substring(0, data.indexOf(","));
        jLabelDia_semana.setText(jS1);
        jS2 = data.substring(data.indexOf(" ") +1);
        jLabelDia_mes.setText(jS2);
        f = DateFormat.getTimeInstance();
        jVisor.setText(f.format(date).substring(0, f.format(date).lastIndexOf(":")));
    } 
    
    private void setLook() {
        this.setLocationRelativeTo(null);
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {}
    }
    
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens/caixa.png")));
    }

}