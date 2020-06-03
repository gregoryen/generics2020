package pl.p.lodz.zzpj2020.generics.pierwsze;

public class Main {

    public static void main (String[] args) {

        MyGenericList<Step> stepList = new MyGenericList<Step>();
        MyGenericList<Step> stepList2 = new MyGenericList<Step>();
        MyGenericList<SimpleStep> simpleStepList = new MyGenericList<SimpleStep>();
        MyGenericList<ComplexStep> complexStepList = new MyGenericList<ComplexStep>();

        stepList.add(new Step("Step 1"));
        stepList.add(new Step("Step 2"));
        stepList.add(new Step("Step 3"));

        stepList2.add(new Step("Step 4"));
        stepList2.add(new Step("Step 5"));
        stepList2.add(new Step("Step 6"));

        simpleStepList.add(new SimpleStep("Simple Step 1"));
        simpleStepList.add(new SimpleStep("Simple Step 2"));
        simpleStepList.add(new SimpleStep("Simple Step 3"));

        complexStepList.add(new ComplexStep("Complex Step 1"));
        complexStepList.add(new ComplexStep("Complex Step 2"));
        complexStepList.add(new ComplexStep("Complex Step 3"));

        StepService stepService = new StepService(stepList);
        System.out.println(stepService.getAllDescription());
        System.out.println(stepService.getDescription(2) + "\n");
        stepService.mergeLists(stepList2);
        System.out.println(stepService.getAllDescription());

        SimpleStepService simpleStepService = new SimpleStepService(simpleStepList);
        System.out.println(simpleStepService.getAllDescription());

        ComplexStepService complexStepService = new ComplexStepService(complexStepList);
        System.out.println(complexStepService.getAllDescription());

    }

}
