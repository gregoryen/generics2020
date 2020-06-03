package pl.p.lodz.zzpj2020.generics.drugie;

public class DictionarySerivce {

    private Dictionary<Term, Description> dictionary;

    public DictionarySerivce(Dictionary<Term, Description> dictionary) {
        this.dictionary = dictionary;
    }

    public String getAllTerms(){
        StringBuilder result = new StringBuilder();
        for (Term term : dictionary.getAllTerms()) {
            result.append(term.getTerm());
            result.append("\n");
        }

        return result.toString();
    }

    public String getDescription(String term) {
        Description result = dictionary.getDescription(term);
        if (result == null) {
            return "Response not found";
        } else {
            return result.getDescription();
        }

    }

    public void mergeDictionaries(Dictionary<Term, Description> dictionary_2) {
        dictionary.addAll(dictionary_2);
    }

}
