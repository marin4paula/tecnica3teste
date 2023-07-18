package view;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class PainelBotao extends JPanel{
PainelBotao(){
	this.setLayout(new GridLayout(1, 6));
    BotaoAzul azul = new BotaoAzul();
    BotaoVermelho vermelho = new BotaoVermelho();
    BotaoVerde verde = new BotaoVerde();
    BotaoRosa rosa = new BotaoRosa();
    BotaoRoxo roxo = new BotaoRoxo();
    BotaoAmarelo amarelo = new BotaoAmarelo();
    add(azul);
    add(vermelho);
    add(verde);
    add(rosa);
    add(roxo);
    add(amarelo);
}
}
