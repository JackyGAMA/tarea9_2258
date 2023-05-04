package org.example.iu;

public class Principal extends Frame {
      private Label lblNombre;
      private TextField txtNombre;
      private Button btbBoton1;

  public Principal (String title) throws HeadLessException{
    super(title);
    this.setSize(800,600);
    this.setLayout(new FlowLayout());
    lblNombre = new Label("Nombre:");
    this.add(lblNombre);
    txtNombre = new TextField (30);
    this.add(txtNombre);
    btnBoton1 = new Button("saludar");
    //btnBoton1.addMouseListener(new EventosRaton());
    btnBoton1.addMouseListener(new MouseAdapter(){
     @Override
     public void mouseClicked(MouseEvent e){
        System.out.println(txtNombre.getText());
        JOptionPane.showMessageDialog(null,"Hola"+ txtNombre.getText());
      }
   });

 
    this.add(btnBoton1);
    this.addWindowListener(new WindowAdapter(){
    @Override
    public void windowClosing(WindowEvent e){
      System.exit(0);
     }
    });
    this.setVisible(true);

}
}