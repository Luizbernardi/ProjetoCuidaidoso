package br.com.cuidaidoso.cuidaidososb.enumCuidaidoso;

public enum Estado {

    AMAZONAS("Amazonas", "AM"),
    ALAGOAS("Alagoas", "AL"),
    ACRE("Acre", "AC"),
    AMAPA("Amapá", "AP"),
    BAHIA("Bahia", "BA"),
    PARA("Pará", "PA"),
    MATO_GROSSO("Mato Grosso", "MT"),
    MINAS_GERAIS("Minas Gerais", "MG"),
    MATO_GROSSO_DO_SUL("Mato Grosso do Sul", "MS"),
    GOIAS("Goiás", "GO"),
    MARANHAO("Maranhão", "MA"),
    RIO_GRANDE_DO_SUL("Rio Grande do Sul", "RS"),
    TOCANTINS("Tocantins", "TO"),
    PIAUI("Piauí", "PI"),
    SAO_PAULO("São Paulo", "SP"),
    RONDONIA("Rondônia", "RO"),
    RORAIMA("Roraima", "RR"),
    PARANA("Paraná", "PR"),
    CEARA("Ceará", "CE"),
    PERNAMBUCO("Pernambuco", "PE"),
    SANTA_CATARINA("Santa Catarina", "SC"),
    PARAIBA("Paraíba", "PB"),
    RIO_GRANDE_DO_NORTE("Rio Grande do Norte", "RN"),
    ESPIRITO_SANTO("Espírito Santo", "ES"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ"),
    SERGIPE("Sergipe", "SE"),
    DISTRITO_FEDERAL("Distrito Federal", "DF");

    private final String nome;
    private final String sigla;

    /**
     * Construtor do enum
     *
     * @param nome  nome da unidade da federação completo
     * @param sigla sigla da unidade da federação
     */
    Estado(final String nome, final String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    /**
     * Converte a partir do nome da Unidade da Federacao, para o respectivo enum.
     *
     * @param nomeUf o nome da Unidade da Federação. Exemplo: "São Paulo"
     * @return o enum da Unidade da Federação
     * @throws IllegalArgumentException caso não ache o enum pelo nome da UF
     */
    public static Estado fromUF(String uf) {
        for (Estado estado : values()) {
            if (estado.nome.equalsIgnoreCase(uf) || estado.sigla.equalsIgnoreCase(uf)) {
                return estado;
            }
        }
        throw new IllegalArgumentException(uf);
    }

    public static Estado fromNome(final String nome) {
        for (final Estado estado : Estado.values()) {
            if (estado.nome.equalsIgnoreCase(nome)) {
                return estado;
            }
        }
        throw new IllegalArgumentException("Estado não encontrado: " + nome);
    }

    /**
     * Converte a partir da Sigla da UF no parâmetro, para o enum da Unidade da
     * Federação.
     *
     * @param sigla da Unidade da Federação. Exemplo: "MG"
     * @return a Unidade da Federação
     * @throws IllegalArgumentException caso a sigla da UF não exista
     */
    public static Estado fromSigla(final String sigla) {
        for (final Estado estado : Estado.values()) {
            if (estado.sigla.equalsIgnoreCase(sigla)) {
                return estado;
            }
        }
        throw new IllegalArgumentException("sigla de estado invalida: " + sigla);
    }

    /**
     * Obtém a sigla da UF
     *
     * @return a sigla da UF
     */
    public String sigla() {
        return this.sigla;
    }

    /**
     * Nome completo da UF
     *
     * @return nome completo da UF
     */
    public String nome() {
        return this.nome;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Estado{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", sigla='").append(sigla).append('\'');
        sb.append('}');
        return sb.toString();
    }
}