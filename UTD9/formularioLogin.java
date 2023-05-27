import java.awt.*;
import java.awt.event.*;

public class formularioLogin extends Frame {
    private TextField usernameField;
    private TextField passwordField;

    public formularioLogin() {
        setTitle("Pantalla de Login");
        setSize(300, 200);
        setLayout(new FlowLayout());

        Label usernameLabel = new Label("Name: ");
        usernameField = new TextField(20);

        Label passwordLabel = new Label("password: ");
        passwordField = new TextField(20);
        passwordField.setEchoChar('*');

        Button loginButton = new Button("submit");
        Button cancelButton = new Button("cancel");

        // Para asegurar que los componentes se muestren en la ventana en el orden que queremos

        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
        add(cancelButton);

        // APara que podamos hacer clic en el botón de ingresar
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Ingresar");
            }
        });

        // Para que podamos hacer clic en el botón de cancelar
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Cancelar");
                // Para Cerrar la ventana
                dispose();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new formularioLogin();
    }
}
