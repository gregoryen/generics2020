package pl.p.lodz.zzpj2020.generics.pierwsze;

public abstract class GenericService<T extends Step> {

    private MyGenericList<T> genericStepList;

    public GenericService(MyGenericList<T> genericStepList) {
        this.genericStepList = genericStepList;
    }

    public String getDescription(int index) {
        return genericStepList.getByIndex(index).getDescription();
    }

    public String getAllDescription() {

        StringBuilder response = new StringBuilder();
        for (T it: genericStepList) {
            response.append(it.getDescription());
            response.append("\n");
        }
        return response.toString();
    }

    public void mergeLists(MyGenericList<T> list){
        genericStepList.addAll(list);
    }

}
