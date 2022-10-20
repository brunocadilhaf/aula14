package pacote3;

public class Motorista extends Pessoa implements Acelerador, Autenticavel {
    private String nome;
    private int matricula;
    private Carro veiculoAtual;

    public Motorista(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public Motorista(String nome, String cpf, int idade){
        setNome(nome);
        setCpf(cpf);
        setIdade(idade);
    }

    @Override
    public int acelerar() {
        this.veiculoAtual.acelerar();
        return this.veiculoAtual.getVelocidadeAtual();
    }

    @Override
    public int acelerar(int limite) {
        this.veiculoAtual.acelerar(limite);

        return this.veiculoAtual.getVelocidadeAtual();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public Carro getVeiculoAtual() {
        return veiculoAtual;
    }

    public void setVeiculoAtual(Carro veiculoAtual) {
        this.veiculoAtual = veiculoAtual;
    }

    @Override
    public String obterCredenciais() {
        
        return String.format("%s-%d", getNome(), getMatricula());
    }
}
