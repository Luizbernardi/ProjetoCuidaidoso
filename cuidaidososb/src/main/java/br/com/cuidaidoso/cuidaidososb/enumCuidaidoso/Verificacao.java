package br.com.cuidaidoso.cuidaidososb.enumCuidaidoso;

public enum Verificacao {

    VERIFICADO("Verificado"), NAO_VERIFICADO("Não verificado");

    private String verificacao;

    private Verificacao(String verificacao) {
        this.verificacao = verificacao;
    }

    public String getVerificacao() {
        return verificacao;
    }

    public void setVerificacao(String verificacao) {
        this.verificacao = verificacao;
    }

}
