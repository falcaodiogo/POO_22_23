package aula05;

import java.util.*;

import aula06.DateYMD;

public class RealEstate {

    private ArrayList<Property> properties;

    public RealEstate() {
        this.properties = new ArrayList<>();
    }

    public void newProperty(String localidade, int numQuartos, int preco) {
        Property property = new Property();
        property.setLocalidade(localidade);
        property.setNumQuartos(numQuartos);
        property.setPreco(preco);
        property.setDisponibilidade(true);
        property.setId(this.properties.size() + 1);
        this.properties.add(property);
    }

    public void sell(int id) {
        for (Property property : this.properties) {
            if (property.getId() == id) {
                property.setDisponibilidade(false);
            }
        }
    }

    public void setAuction(int id, DateYMD dataInicio, int duracao) {
        for (Property property : this.properties) {
            if (property.getId() == id) {
                property.setDataInicio(dataInicio);
                for (int i = 0; i < duracao; i++) {
                    dataInicio.incrementData();
                }
            }
        }
    }

    public String toString() {
        String result = "";
        for (Property property : this.properties) {
            result += property.toString() + "";
        }
        return result;
    }

}
