package structural.flyweight;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame{
    private static final long serialVersionUID = 1L;
    public JButton startDrawing;
    public int windowWidth = 1750;
    public int windowHeight = 1750;
    Color[] shapeColor = {Color.orange, Color.red, Color.yellow,
        Color.blue, Color.pink, Color.cyan, Color.magenta,Color.black, Color.gray};
    public static void main (String[] args) {
        new Main();
    }
    public Main(){
        this.setSize(windowWidth,windowHeight);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Flyweight Test");

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());
        final JPanel drawingPanel = new JPanel();

        startDrawing = new JButton("Draw stuff");

        contentPane.add(drawingPanel,BorderLayout.CENTER);
        contentPane.add(startDrawing,BorderLayout.SOUTH);

        startDrawing.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                Graphics g = drawingPanel.getGraphics();
                long startTime = System.currentTimeMillis();

                for(int i=0; i <100000000; i++){
                    //Rectangle rect = new Rectangle(getRandomColor());
                    Rectangle rect = RectangleFactory.getRectangle(getRandomColor());
                    rect.draw(g,getRandX(), getRandY(), getRandX(), getRandY());
                }
                long endTime = System.currentTimeMillis();
                System.out.println("That took " + (endTime -startTime));
            }
        });
        this.add(contentPane);
        this.setVisible(true);
    }
    private int getRandX() {return (int)(Math.random()*windowHeight);}
    private int getRandY() {return (int)(Math.random()*windowWidth);}

    private Color getRandomColor(){
        Random randomGenerator = new Random();
        int randInt = randomGenerator.nextInt(9);
        return shapeColor[randInt];
    }
}
