package serializacao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.util.ArrayList;


public class Principal {
	public static void main(String[] args ){
		ArrayList<Tenis> listaTenis = new ArrayList<Tenis>();
		listaTenis.add(new Tenis(38, "Mizuno", "Wave"));
		listaTenis.add(new Tenis(44, "Nike", "Air"));
		listaTenis.add(new Tenis(42,"Adidas", "Advantage"));
	//	serializaListaTenis(listaTenis, "TenisSerializados.dat");
	//	ArrayList<Tenis> listaRecuperada = deserializaListaTenis("TenisSerializados.dat");
	//	for(Tenis t : listaRecuperada){
		//	System.out.println(t);
	//	}
		
		ArrayList<livros> listaLivros = new ArrayList<livros>();
		listaLivros.add(new livros(38, "The Call of Cthulhu", "H. P. Lovecraft"));
		listaLivros.add(new livros(341, "A Desobediência Civil Seguido de Walden", "Henry David Thoreau"));
		listaLivros.add(new livros(252, "Paraíso Perdido", "John Milton"));
		serializaListaLivros(listaLivros, "biblio.dat");
		ArrayList<livros> listaRecuo = deserializaListLivros("biblio.dat");
		for(livros l : listaRecuo){
			System.out.println(l);
		}
		
	}

	private static ArrayList<livros> deserializaListLivros(String arch){
		FileInputStream arqLe = null;
		ObjectInputStream in = null;
		ArrayList<livros> li = null;
		try{
			arqLe = new FileInputStream(arch);
			in = new ObjectInputStream(arqLe);
			li = (ArrayList<livros>) in.readObject();
		}catch(ClassNotFoundException ex){
			ex.printStackTrace();
		}catch(IOException ex){
			ex.printStackTrace();
		}finally {
			try{
				arqLe.close();
				in.close();
			}catch(IOException ex){
				ex.printStackTrace();
			}
		}
		return li;
	}
	private static void serializaListaLivros(ArrayList<livros> listaLivros, String arch){
		FileOutputStream ar = null;
		ObjectOutputStream out = null;
		
		try{
			ar = new FileOutputStream(arch); 
			out = new ObjectOutputStream(ar);
			out.writeObject(listaLivros);
		}catch(IOException ex){
			ex.printStackTrace();
		}finally{
			try{
				ar.close();
				out.close();
			}catch(IOException ex){
				ex.printStackTrace();
			}
		}
	}
	
	
	
}
