public class operadoreslogica {
    public static void main(String[] arg) {
        boolean condicao1=true;

        boolean condicao2=true;

        if(condicao1 && ( 7 > 4 )){ //and 
            System.out.println("as duas condicoes sao verdadeiras");
        }

        if(condicao1 || condicao2){ //or
            System.out.println("uma das condicoes sao verdadeiras");
        }

        System.out.println("fim");
    }
}
