package pacote3;

public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private String cpf;
    private int idade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    @Override
    public int compareTo(Pessoa outroPessoa) {
        return getNome().compareTo(outroPessoa.getNome());
    }
}
