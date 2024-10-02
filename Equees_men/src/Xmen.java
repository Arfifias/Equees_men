import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

public class Xmen extends JFrame implements MouseListener {


    public Clip clip;
    public ImageIcon x_men;
    public ImageIcon wolverine;
    public ImageIcon cyclope;
    public ImageIcon beast;
    public ImageIcon jane;
    public ImageIcon jubilo;
    public ImageIcon gambito;
    public ImageIcon titania;
    public ImageIcon tormenta;
    public ImageIcon professor_Eques;
    public ImageIcon flipped_x_men;
    public ImageIcon flipped_wolverine;
    public ImageIcon flipped_cyclope;
    public ImageIcon flipped_beast;
    public ImageIcon flipped_jane;
    public ImageIcon flipped_jubilo;
    public ImageIcon flipped_gambito;
    public ImageIcon flipped_titania;
    public ImageIcon flipped_tormenta;
    public ImageIcon flipped_professor_Eques;
    public JLabel logo;
    public JLabel wol;
    public JLabel cyclops;
    public JLabel beastia;
    public JLabel jaane;
    public JLabel jubli;
    public JLabel gambit;
    public JLabel titan;
    public JLabel storm;
    public JLabel professorX;

    Xmen() {


        //The default image icons below

        x_men = new ImageIcon("pictures\\X-MEN-LOGO-PNG-PHOTO.png");
        cyclope = new ImageIcon("pictures\\Cyclope.png");
        wolverine = new ImageIcon("pictures\\Wolverine.png");
        beast = new ImageIcon("pictures\\Beast.png");
        jane = new ImageIcon("pictures\\Jean Gray.png");
        titania = new ImageIcon("pictures\\Rogue.png");
        tormenta = new ImageIcon("pictures\\Storm.png");
        professor_Eques = new ImageIcon("pictures\\Professor X.png");
        jubilo = new ImageIcon("pictures\\Jubilee.png");
        gambito = new ImageIcon("pictures\\Gambit.png");


        //The flipped image icons below


        flipped_x_men = new ImageIcon("flipped\\flippedlogo.png");
        flipped_cyclope = new ImageIcon("flipped\\flippedcyclope.png");
        flipped_wolverine = new ImageIcon("flipped\\flippedwol.png");
        flipped_beast = new ImageIcon("flipped\\flippedbeast.png");
        flipped_jane = new ImageIcon("flipped\\flippedJeanGray.png");
        flipped_titania = new ImageIcon("flipped\\flippedrogue.png");
        flipped_tormenta = new ImageIcon("flipped\\flippedstorm.png");
        flipped_professor_Eques = new ImageIcon("flipped\\flippedProfessorX.png");
        flipped_jubilo = new ImageIcon("flipped\\flippedjubilee.png");
        flipped_gambito = new ImageIcon("flipped\\flippedgambit.png");

        //Creating and inserting the image icons to labels below

        logo = new JLabel(x_men);
        logo.setBounds(500, 40, 200, 126);
        logo.addMouseListener(this);

        wol = new JLabel(wolverine);
        cyclops = new JLabel(cyclope);
        beastia = new JLabel(beast);
        jaane = new JLabel(jane);
        jubli = new JLabel(jubilo);
        gambit = new JLabel(gambito);
        storm = new JLabel(tormenta);
        titan = new JLabel(titania);
        professorX = new JLabel(professor_Eques);

        //More label customization below


        wol.setBounds(215,200,175,240);
        wol.setOpaque(true);
        wol.addMouseListener(this);

        cyclops.setBounds(515,200,175,240);
        cyclops.setOpaque(true);
        cyclops.addMouseListener(this);

        beastia.setBounds(815,200,175,240);
        beastia.setOpaque(true);
        beastia.addMouseListener(this);

        jaane.setBounds(215,445,175,240);
        jaane.setOpaque(true);
        jaane.addMouseListener(this);

        jubli.setBounds(515,445,175,240);
        jubli.setOpaque(true);
        jubli.addMouseListener(this);

        gambit.setBounds(815,445,175,240);
        gambit.setOpaque(true);
        gambit.addMouseListener(this);

        storm.setBounds(215,690,175,240);
        storm.setOpaque(true);
        storm.addMouseListener(this);

        titan.setBounds(515,690,175,240);
        titan.setOpaque(true);
        titan.addMouseListener(this);

        professorX.setBounds(815,690,175,240);
        professorX.setOpaque(true);
        professorX.addMouseListener(this);


        //In every label it is necessary to add the mouse listener
        //Every other customization is very basic



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Eques men");
        this.setLayout(null);
        this.setLocation(500, 100);
        this.setSize(1200, 1000);
        this.setIconImage(x_men.getImage());
        this.getContentPane().setBackground(new Color(0, 0, 0));
        this.setLocationRelativeTo(null);
        this.add(logo);
        this.add(wol);
        this.add(cyclops);
        this.add(titan);
        this.add(jubli);
        this.add(storm);
        this.add(jaane);
        this.add(gambit);
        this.add(professorX);
        this.add(beastia);
        this.setVisible(true);

        //Very straight-forward structure of a frame whereas the class JFrame is extended to the public class Xmen

    }


    public void audio() throws Exception {

        File file = new File("wav\\Xmen.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);//As said below we need to create a stream in order to insert to the clip
        clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.loop(Clip.LOOP_CONTINUOUSLY);//It is also put to loop continuously in order to perfect the loop effect of the GUI


        while (loop()) {

            clip.start();

        }

        //Soundtrack code stream where the program gets the wav file as an input
        //Also another while loop which contains the start of the Clip
        //The Clip belongs to the Thread class, so it loops infinitely using the boolean loop method

    }

    public boolean loop() {

        return true;

    }


    /*
    *Useful method above used in the infinite soundtrack loop of the GUI
    * Without this method the loop can not be implemented in the first place
     */

    @Override
    public void mouseClicked(MouseEvent e) {



    }

    @Override
    public void mousePressed(MouseEvent e) {

        logo.setIcon(flipped_x_men);
        wol.setIcon(flipped_wolverine);
        cyclops.setIcon(flipped_cyclope);
        beastia.setIcon(flipped_beast);
        jaane.setIcon(flipped_jane);
        jubli.setIcon(flipped_jubilo);
        gambit.setIcon(flipped_gambito);
        storm.setIcon(flipped_tormenta);
        titan.setIcon(flipped_titania);
        professorX.setIcon(flipped_professor_Eques);

        //Here we flip the image icon of the label by pressing left click


    }

    @Override
    public void mouseReleased(MouseEvent e) {

        logo.setIcon(x_men);
        wol.setIcon(wolverine);
        cyclops.setIcon(cyclope);
        beastia.setIcon(beast);
        jaane.setIcon(jane);
        jubli.setIcon(jubilo);
        gambit.setIcon(gambito);
        storm.setIcon(tormenta);
        titan.setIcon(titania);
        professorX.setIcon(professor_Eques);

        //When the left click releases it returns the label in its initial form


    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}



