package it.adm.calcolomedia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TestStudente2 {

    public static void main(String args[]) {
        Studente2 studente2 = new Studente2(10);

        studente2.setNome("Mario");
        studente2.setCognome("Rossi");
        
        Esame analisi1 = new Esame("Analisi Matematica 1", 25);
        Esame analisi2 = new Esame("Analisi Matematica 2", 26);
        Esame fisica1 = new Esame("Fisica 1", 30);

        List<Esame> list2 = new ArrayList<Esame>();
        list2.add(analisi1);
        list2.add(analisi2);
        list2.add(fisica1);

        for (int i = 0; i<list2.size(); ++i) {
            Esame oggetto = list2.get(i);
            System.out.println(oggetto.getNome());
        }

        Map<Esame, Integer> map = new HashMap<>();
        map.put(analisi1, 22);
        map.put(analisi2, 23);
        map.put(fisica1, 24);
        System.out.println("-----");
        for(Entry<Esame, Integer> oggetto: map.entrySet()) {
            System.out.println(oggetto.getKey().getNome());
            System.out.println(oggetto.getValue());
        }
        System.out.println("======");
        for(Esame e: map.keySet()) {
            System.out.println(e.getNome());
        }

    }
}