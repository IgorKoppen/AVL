package arvores;

public class AVLint {

    private class ARVORE {
        int dado;
        ARVORE dir;
        ARVORE esq;
        int hEsq;
        int hDir;

    }

    public ARVORE root = null;

    public void mostra(ARVORE p){
        if(p!=null){
            mostra(p.esq);
            System.out.println(" "+ p.dado);
            mostra(p.dir);
        }
    }
    public  void mostraFB(ARVORE p){
        if(p!=null){
            mostraFB(p.esq);
            mostraFB(p.dir);
            System.out.println(" Dados: " + p.dado+ " \t FB=" + (p.hDir- p.hEsq));
        }
    }


}
