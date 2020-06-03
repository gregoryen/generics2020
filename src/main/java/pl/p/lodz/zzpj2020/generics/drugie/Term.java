package pl.p.lodz.zzpj2020.generics.drugie;

public class Term implements Comparable<Term> {

    private String term;

    public Term(String term) {
        this.term = term;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    @Override
    public int compareTo(Term o) {
        return term.compareTo(o.getTerm());
    }
}
