package pl.p.lodz.zzpj2020.generics.drugie;

public class Main {

    public static void main(String[] args) {
        Dictionary<Term, Description> dictionary = new Dictionary<>();
        Dictionary<Term, Description> dictionary_2 = new Dictionary<>();


        dictionary.add(new MusicTerm("Gitara"), new Description("Instrument, najczęściej 6 strun, gryf i pudło"));
        dictionary.add(new MusicTerm("Perkusja"), new Description("Instrument, Kilka bembenkow i talerzy"));
        dictionary.add(new MusicTerm("Akordeon"), new Description("Instrument, Takie cos do niczego nie podobne"));
        dictionary_2.add(new LawTerm("Wykroczenie"), new Description("Czynnosc karana mandatem ale nie jakos bardzo powazna sprawa ..."));
        dictionary_2.add(new LawTerm("Kara"), new Description("No jak cos zrobisz nie tak to konsekwencje byc musza"));
        dictionary_2.add(new LiteratureTerm("Onomatopeja"), new Description("Wyraz nasladujacy dziwek"));

        

        DictionarySerivce dictionarySerivce = new DictionarySerivce(dictionary);
        System.out.println(dictionarySerivce.getAllTerms());
        System.out.println(dictionarySerivce.getDescription("Gitara"));
        dictionarySerivce.mergeDictionaries(dictionary_2);
        System.out.println(dictionarySerivce.getAllTerms());



    }

}
