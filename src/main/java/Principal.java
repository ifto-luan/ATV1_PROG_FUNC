import exercicios.Cidade;
import exercicios.CidadeRecord;
import exercicios.PessoaRecord;
import exercicios.PessoaRecordShallow;

/**
 * Classe para você testar suas implementações.
 * Veja o README para mais detalhes.
 */
public class Principal {
    public static void main(final String[] args) {

        // CIDADE É MUTÁVEL

        System.out.println("USANDO CIDADE\n");
        
        Cidade cidade =  new Cidade("Palmas");
        
        System.out.println(cidade.getNome());
        
        cidade.setNome("Gurupi");
        
        System.out.println(cidade.getNome());
        
        // CIDADE RECORD É IMUTÁVEL
        
        System.out.println("\nUSANDO CIDADERECORD \n");
        
        CidadeRecord cidadeR = new CidadeRecord("Palmas");
        
        System.out.println(cidadeR.nome());
        
        // PESSOA RECORD SHALLOW É MUTÁVEL
        
        System.out.println("\nUSANDO PESSOA RECORD SHALLOW \n");
        
        PessoaRecordShallow pessoaRS = new PessoaRecordShallow("Luan", new Cidade("Conceicao do Araguaia"));
        
        System.out.println(pessoaRS.nome());
        System.out.println(pessoaRS.cidade().getNome());
        
        pessoaRS.cidade().setNome("Cariri");
        
        System.out.println(pessoaRS.cidade().getNome());
        
        
        // PESSOA RECORD É IMUTÁVEL
        
        System.out.println("\nUSANDO PESSOA RECORD \n");

        PessoaRecord pessoaR = new PessoaRecord("Rayssa", new CidadeRecord("Gurupi"));

        System.out.println(pessoaR.nome());
        System.out.println(pessoaR.cidade().nome());
    }
}
