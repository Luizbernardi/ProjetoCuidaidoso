package br.com.cuidaidoso.cuidaidososb.service;

import br.com.cuidaidoso.cuidaidososb.enumCuidaidoso.Estado;
import br.com.cuidaidoso.cuidaidososb.model.Cidade;
import java.util.*;

public class EstadoCidadeService {
        private static final Map<Estado, List<Cidade>> estadoCidadesMap = new HashMap<>();

        static {
                estadoCidadesMap.put(Estado.ACRE, Arrays.asList(
                                new Cidade("Rio Branco"), new Cidade("Cruzeiro do Sul"), new Cidade("Sena Madureira")));
                estadoCidadesMap.put(Estado.ALAGOAS, Arrays.asList(
                                new Cidade("Maceió"), new Cidade("Arapiraca"), new Cidade("Palmeira dos Índios")));
                estadoCidadesMap.put(Estado.AMAPA, Arrays.asList(
                                new Cidade("Macapá"), new Cidade("Santana"), new Cidade("Laranjal do Jari")));
                estadoCidadesMap.put(Estado.AMAZONAS, Arrays.asList(
                                new Cidade("Manaus"), new Cidade("Parintins"), new Cidade("Itacoatiara")));
                estadoCidadesMap.put(Estado.BAHIA, Arrays.asList(
                                new Cidade("Salvador"), new Cidade("Feira de Santana"),
                                new Cidade("Vitória da Conquista")));
                estadoCidadesMap.put(Estado.CEARA, Arrays.asList(
                                new Cidade("Fortaleza"), new Cidade("Caucaia"), new Cidade("Juazeiro do Norte")));
                estadoCidadesMap.put(Estado.DISTRITO_FEDERAL, Arrays.asList(
                                new Cidade("Brasília")));
                estadoCidadesMap.put(Estado.ESPIRITO_SANTO, Arrays.asList(
                                new Cidade("Vitória"), new Cidade("Vila Velha"), new Cidade("Serra")));
                estadoCidadesMap.put(Estado.GOIAS, Arrays.asList(
                                new Cidade("Goiânia"), new Cidade("Aparecida de Goiânia"), new Cidade("Anápolis")));
                estadoCidadesMap.put(Estado.MARANHAO, Arrays.asList(
                                new Cidade("São Luís"), new Cidade("Imperatriz"), new Cidade("Caxias")));
                estadoCidadesMap.put(Estado.MATO_GROSSO, Arrays.asList(
                                new Cidade("Cuiabá"), new Cidade("Várzea Grande"), new Cidade("Rondonópolis")));
                estadoCidadesMap.put(Estado.MATO_GROSSO_DO_SUL, Arrays.asList(
                                new Cidade("Campo Grande"), new Cidade("Dourados"), new Cidade("Três Lagoas")));
                estadoCidadesMap.put(Estado.MINAS_GERAIS, Arrays.asList(
                                new Cidade("Belo Horizonte"), new Cidade("Uberlândia"), new Cidade("Contagem")));
                estadoCidadesMap.put(Estado.PARA, Arrays.asList(
                                new Cidade("Belém"), new Cidade("Ananindeua"), new Cidade("Santarém")));
                estadoCidadesMap.put(Estado.PARAIBA, Arrays.asList(
                                new Cidade("João Pessoa"), new Cidade("Campina Grande"), new Cidade("Santa Rita")));
                estadoCidadesMap.put(Estado.PARANA, Arrays.asList(
                                new Cidade("Curitiba"), new Cidade("Londrina"), new Cidade("Maringá")));
                estadoCidadesMap.put(Estado.PERNAMBUCO, Arrays.asList(
                                new Cidade("Recife"), new Cidade("Jaboatão dos Guararapes"), new Cidade("Olinda")));
                estadoCidadesMap.put(Estado.PIAUI, Arrays.asList(
                                new Cidade("Teresina"), new Cidade("Parnaíba"), new Cidade("Picos")));
                estadoCidadesMap.put(Estado.RIO_DE_JANEIRO, Arrays.asList(
                                new Cidade("Rio de Janeiro"), new Cidade("São Gonçalo"),
                                new Cidade("Duque de Caxias")));
                estadoCidadesMap.put(Estado.RIO_GRANDE_DO_NORTE, Arrays.asList(
                                new Cidade("Natal"), new Cidade("Mossoró"), new Cidade("Parnamirim")));
                estadoCidadesMap.put(Estado.RIO_GRANDE_DO_SUL, Arrays.asList(
                                new Cidade("Porto Alegre"), new Cidade("Caxias do Sul"), new Cidade("Pelotas")));
                estadoCidadesMap.put(Estado.RONDONIA, Arrays.asList(
                                new Cidade("Porto Velho"), new Cidade("Ji-Paraná"), new Cidade("Ariquemes")));
                estadoCidadesMap.put(Estado.RORAIMA, Arrays.asList(
                                new Cidade("Boa Vista"), new Cidade("Rorainópolis"), new Cidade("Caracaraí")));
                estadoCidadesMap.put(Estado.SANTA_CATARINA, Arrays.asList(
                                new Cidade("Florianópolis"), new Cidade("Joinville"), new Cidade("Blumenau")));
                estadoCidadesMap.put(Estado.SAO_PAULO, Arrays.asList(
                                new Cidade("São Paulo"), new Cidade("Guarulhos"), new Cidade("Campinas")));
                estadoCidadesMap.put(Estado.SERGIPE, Arrays.asList(
                                new Cidade("Aracaju"), new Cidade("Nossa Senhora do Socorro"), new Cidade("Lagarto")));
                estadoCidadesMap.put(Estado.TOCANTINS, Arrays.asList(
                                new Cidade("Palmas"), new Cidade("Araguaína"), new Cidade("Gurupi")));
        }

        public List<Cidade> getCidadesPorEstado(Estado estado) {
                return estadoCidadesMap.getOrDefault(estado, Collections.emptyList());
        }
}