package controle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Controlador {
public static String ritmo;
public static String velocidade;
public static String intensidade;
private File endarquivo;
private JPanel botoes;
public static String aluno;

public Controlador() {
	
	
}
public void festa(File file) {
	if(ritmo=="rock")
		endarquivo= src//documentos//rock;
	if(ritmo=="reggae")
		endarquivo= src//documentos//rock;	
	if(ritmo=="eletro")
		endarquivo= ("/documentos/eletronica");
	try {
		BufferedReader arquivo = new BufferedReader(new FileReader(endarquivo));
		while (arquivo.ready()) {
			String linha = arquivo.readLine();
			String[] aux=linha.split(";");
			
		
        }
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
