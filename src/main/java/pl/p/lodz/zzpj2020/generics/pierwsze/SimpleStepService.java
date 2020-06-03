package pl.p.lodz.zzpj2020.generics.pierwsze;

public class SimpleStepService extends GenericService<SimpleStep> {

    public SimpleStepService(MyGenericList<SimpleStep> genericStepList) {
        super(genericStepList);
    }
}
