package pl.p.lodz.zzpj2020.generics.pierwsze;

public class StepService extends GenericService<Step>{

    public StepService(MyGenericList<Step> genericStepList) {
        super(genericStepList);
    }
}
