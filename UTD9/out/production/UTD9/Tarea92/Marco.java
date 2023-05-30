package Tarea92;

import java.awt.*;

public class Marco extends Frame {
    public Marco(){
        setTitle("Flow Layout");
        setBounds(600, 350, 600, 300);
        setLayout(new FlowLayout());
        Panel lamina = new Panel();
        add(lamina);
    }
}
