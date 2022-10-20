package pacote3;

public class Autenticador {
    
private String[] autorizados = {"ABC1234", "12343", "Def5678"};

public boolean autenticar(Autenticavel autenticavel){

    String token = autenticavel.obterCredenciais();

    return estaAutorizado(token);

}

private boolean estaAutorizado(String token){

    boolean achou = false;

    for (int i = 0; i < autorizados.length && !achou; i++){

        achou = autorizados[i].equals(token);

    }

    return achou;

}

}
