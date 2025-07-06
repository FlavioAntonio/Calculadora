package br.com.cod3r.calc.visao;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Botao extends JButton{
    public Botao(String texto, Color cor) {
        setText(texto);
        setFont(new Font("courier", Font.PLAIN, 24));
        setOpaque(true);
        setBackground(cor);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}
