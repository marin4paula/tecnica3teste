package controle;
import java.io.BufferedReader;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;


public class Import {
	private String rockk;
	private String reggaee;
	private String eletronicaa;
	
	public String getReggae() {
		return reggaee;
	}
	public String getRock() {
		return rockk;
	}
	public String getEletronica() {
		return eletronicaa;
	}
	

	public Import() {
			importarrock(documentos\rock);
			importarreggae(documentos\reggae);
			importeletronica("/AF/src/documentos/eletronica");
		}
	
		public void importarrock(File file) {
			
			try {
				BufferedReader arquivo = new BufferedReader(new FileReader(file));
				while (arquivo.ready()) {
					String linha = arquivo.readLine();
					String[] aux=linha.split(";");
					rockk+=aux[0];
					rockk+=aux[1];
					rockk+=aux[2];
					rockk+=aux[3];
					rockk+=aux[4];
					rockk+=aux[5];
				    
	            }
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
    public void importarreggae(File file) {
			
			try {
				BufferedReader arquivo = new BufferedReader(new FileReader(file));
				while (arquivo.ready()) {
					String linha = arquivo.readLine();
					String[] aux=linha.split(";");
					reggaee+=aux[0];
					reggaee+=aux[1];
					reggaee+=aux[2];
					reggaee+=aux[3];
					reggaee+=aux[4];
					reggaee+=aux[5];
				
	            }
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		
	public void importareletronica(File file) {
		
		try {
			BufferedReader arquivo = new BufferedReader(new FileReader(file));
			while (arquivo.ready()) {
				String linha = arquivo.readLine();
				String[] aux=linha.split(";");
				eletronicaa+=aux[0];
				eletronicaa+=aux[1];
				eletronicaa+=aux[2];
				eletronicaa+=aux[3];
				eletronicaa+=aux[4];
				eletronicaa+=aux[5];
			
            }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}






}