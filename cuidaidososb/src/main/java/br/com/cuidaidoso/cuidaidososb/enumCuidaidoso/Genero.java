package br.com.cuidaidoso.cuidaidososb.enumCuidaidoso;

public enum Genero {
    MASCULINO("Masculino"), FEMININO("Feminino"), OUTRO("Outro");

    private String genero;

    private Genero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}