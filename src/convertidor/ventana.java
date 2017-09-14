
package convertidor;

/**
 *
 * @author Omar Ramirez
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class ventana extends JFrame implements ActionListener{
    JLabel titulo;
    JTextField cantidad;
    JButton num0,num1,num2,num3,num4,num5,num6,num7,num8,num9,punto,convertir,borrar;
    
    
    public ventana (){
        configVentana();
        iniciarComp();
    }
    
    public void configVentana(){
        setSize(410,500);
        setTitle("Convertidor de pesos a dólares");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
    }
    
    public void iniciarComp(){
        titulo = new JLabel("Convertidor");
        titulo.setBounds(10, 0, 100, 50);
       
        
        cantidad = new JTextField("");
        cantidad.setBounds(10,55,300,50);
        cantidad.setEditable(false);
        cantidad.setBackground(Color.WHITE);
        
        num1 = new JButton("1");
        num1.setBounds(10,120 ,70 ,70 );
        num1.addActionListener(this);
        
        num2 = new JButton("2");
        num2.setBounds(80,120 ,70 ,70 );
        num2.addActionListener(this);
        
        num3 = new JButton("3");
        num3.setBounds(150,120 ,70 ,70 );
        num3.addActionListener(this);
        
        num4 = new JButton("4");
        num4.setBounds(10,190 ,70 ,70 );
        num4.addActionListener(this);
        
        num5 = new JButton("5");
        num5.setBounds(80,190 ,70 ,70 );
        num5.addActionListener(this);
        
        num6 = new JButton("6");
        num6.setBounds(150,190 ,70 ,70 );
        num6.addActionListener(this);
        
        num7 = new JButton("7");
        num7.setBounds(10,260 ,70 ,70 );
        num7.addActionListener(this);
        
        num8 = new JButton("8");
        num8.setBounds(80,260 ,70 ,70 );
        num8.addActionListener(this);
        
        num9 = new JButton("9");
        num9.setBounds(150,260 ,70 ,70 );
        num9.addActionListener(this);
        
        punto = new JButton(".");
        punto.setBounds(80,330 ,70 ,70 );
        punto.addActionListener(this);
        
        num0 = new JButton("0");
        num0.setBounds(10,330 ,70 ,70 );
        num0.addActionListener(this);
        
        convertir = new JButton("Convertir");
        convertir.setBounds(250,120 ,100 ,50 );
        convertir.addActionListener(this);
        
        borrar = new JButton("Borrar");
        borrar.setBounds(250,200 ,100 ,50 );
        borrar.addActionListener(this);
        
        setLayout(null);
        add(titulo);
        add(cantidad);
        add(num1);
        add(num2);
        add(num3);
        add(num4);
        add(num5);
        add(num6);
        add(num7);
        add(num8);
        add(num9);
        add(num0);
        add(punto);
        add(convertir);
        add(borrar);
       
    }
   

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == num1){
            cantidad.setText(cantidad.getText()+"1");
        }
        if(e.getSource() == num2){
            cantidad.setText(cantidad.getText()+"2");
        }
        if(e.getSource() == num3){
            cantidad.setText(cantidad.getText()+"3");
        }
        if(e.getSource() == num4){
            cantidad.setText(cantidad.getText()+"4");
        }
        if(e.getSource() == num5){
            cantidad.setText(cantidad.getText()+"5");
        }
        if(e.getSource() == num6){
            cantidad.setText(cantidad.getText()+"6");
        }
        if(e.getSource() == num7){
            cantidad.setText(cantidad.getText()+"7");
        }
        if(e.getSource() == num8){
            cantidad.setText(cantidad.getText()+"8");
        }
        if(e.getSource() == num9){
            cantidad.setText(cantidad.getText()+"9");
        }
        if(e.getSource() == num0){
            cantidad.setText(cantidad.getText()+"0");
        }
        if(e.getSource() == punto){
            cantidad.setText(cantidad.getText()+".");
        }
        if(e.getSource() == convertir){
            double operador = Double.parseDouble(cantidad.getText());
            double result;
            
            result = operador/19; 
            
            cantidad.setText(String.valueOf(result));
        }
        if(e.getSource() == borrar){
            cantidad.setText("");
        }
        
    }
}
