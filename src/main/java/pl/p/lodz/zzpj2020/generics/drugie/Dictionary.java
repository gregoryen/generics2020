package pl.p.lodz.zzpj2020.generics.drugie;


import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Dictionary<K extends Term,V extends Description> {

    private Map<K, V> entries;

    public Dictionary() {
        this.entries = new TreeMap<>();
    }

    public void add(K term, V description ) {
        entries.put(term, description);
        //this.sortEntries();
    }

    public void addAll(Dictionary<K, V> inputs) {
        entries.putAll(inputs.entries);
        //this.sortEntries();
    }

    public Set<K> getAllTerms(){
        return this.entries.keySet();
    }

    public V getDescription(String term){
        Set<K> terms = getAllTerms();

        for (K it: terms) {
            if (it.getTerm().equals(term)){
                return getDescription(it);
            }
        }
        return null;
    }

    public V getDescription(K term){
        return entries.get(term);
    }

    public void remove (K term) {
        entries.remove(term);
    }

    public void delete (K term) {
        entries.remove(term);
    }

    public boolean isAlreadyExists (K term) {
        return entries.containsKey(term);
    }

    public int size(){
        return entries.size();
    }

    private void sortEntries(){
        entries = new TreeMap<K, V>(entries);
    }

}
