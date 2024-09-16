package br.com.cuidaidoso.cuidaidososb.enumCuidaidoso;

public enum Perfil {
    CUIDADOR("Cuidador"), ADMIN("Admin");

    private String Perfil;

    private Perfil(String perfil) {
        this.Perfil = perfil;
    }

    public String getPerfil() {
        return Perfil;
    }

    public void setPerfil(String perfil) {
        Perfil = perfil;
    }

}
