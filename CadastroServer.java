/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastroserver;

/**
 *
 * @author Cliente
 */
public class CadastroServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
public class CadastroThread implements Runnable {
private ProdutoJpaController ctrl;
private UsuarioJpaController ctrlUsu;
private ServerSocket s1;
}

Thread(ProdutoJpaController, UsuarioJpaController, s1; ctrl, ctrlUsu;
ServerSocket server = new ServerSocket(4321););

public void run() {
Scanner entrada = new Scanner(cliente.getInputStream(login, senha))
PrintStream saida = new PrintStream(cliente.getOutputStream())
ctrlUsu = entrada; entrada(L), saida(ctrl);
}
public class Server {
public static void main (String args[]){
EntityManagerFactory emf = Persistence.createEntityManagerFactory("CadastroThreadPU");
EntityManager em = emf.createEntityManager();
CadastroThread ctrl = new CadastroThread(ProdutoJpaController);
CadastroThread ctrlUsu = new CadastroThread(UsuarioJpaController);
try{
ServerSocket server = new ServerSocket(4321);
Socket cliente = server.accept();
getlocalhost());
Scanner entrada = new Scanner(cliente.getImputStream());
while(public class VariasThreads { Runnable r1 = new CadastroThread(ctrl, ctrlUsu,s1);
New Thread(r1).start();
}}
entrada.close
server.close
}

}
}
}

        }