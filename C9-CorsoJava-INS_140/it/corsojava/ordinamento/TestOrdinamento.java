package it.corsojava.ordinamento;

import it.corsojava.insiemi.Comune;

import java.util.List;

public class TestOrdinamento {

    public static void main(String[] args) {
        Archivio a = new Archivio();
        a.load(it.corsojava.datasources.StringDataSources.getComuni());
        List<Comune> elenco = a.getComuni();
        // ------------------------------------


        printOutList(elenco);
    }

    public static void printOutList(List<?> elenco){
        for(int i=0;i<elenco.size();i++){
            System.out.println(elenco.get(i).toString());
        }
    }
}
