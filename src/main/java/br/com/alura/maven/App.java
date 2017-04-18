package br.com.alura.maven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Produto produto = new Produto("PlayStation", 1599.0);
        
    	System.out.println( "Produto: " + produto.getNome() + " Preço: " + produto.getPreco());
    }
}
