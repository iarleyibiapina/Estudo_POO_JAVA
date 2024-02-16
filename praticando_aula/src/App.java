import java.util.Random;

public class App {
    
    /**
     * Gera numero aleatorio
     * 
     * @return numero inteiro gerado
     */
    static int geraNumeroAleatorio(){
        Random rand = new Random();
        return rand.nextInt(10);
    }

    /**
     * Verifica se numero passado é par
     * 
     * @param numero int
     * @return boolean se par
     */
    static boolean isPar(int numero){
        int par = numero % 2;
        if(par == 0) {
            return true;
        } else {
            return false;
        }        
    }

    /**
     * Gerar novos alunos com base no array passado
     * @param alunos array 
     * 
     */
    static void gerarAlunos(String[] alunos){
        for(int loop = 0; loop < alunos.length; loop++){
            Aluno novosAlunos = new Aluno("Josias allen", "975489345", "teste@teste.com");            
            alunos[loop] = novosAlunos.dados();
        }
    }

    /**
     * Trazer dados do array passado
     * @param alunos array
     */
    static void retornaDados(String[] alunos){
        for(int loop = 0; loop < alunos.length; loop++){
            System.out.println(alunos[loop]);
        }
    }


    public static void main(String[] args) throws Exception {

        System.out.println(isPar(geraNumeroAleatorio()));

        // Cria array de alunos de tamanho 5
        String[] alunos = new String[5];
        // gera 5 alunos novos
        gerarAlunos(alunos);
        // trazendo dados gerados
        retornaDados(alunos);


        Aluno josias = new Aluno("Saulo Rodrigo", "12345678", "saulin@gmail.com");
        System.out.println(josias.dados());

        // Criando conta no banco

        ContaBancaria conta = new ContaBancaria( "Kotaka", "0123912039", 0);
        System.out.println(conta.getNome());
        System.out.println(conta.getSaldo());
        conta.sacar(100);
        conta.depositar(100);
        System.out.println(conta.getSaldo());
    }
}
