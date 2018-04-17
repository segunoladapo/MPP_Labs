package mum.mpp_lab.lab7;

public final class ImmutableClass {
    private final String property1;
    private final String property2;
    private final String property3;

    public ImmutableClass(String property1, String property2, String property3){
        this.property1 = property1;
        this.property2 = property2;
        this.property3 = property3;
    }


    public String getProperty2() {
        return property2;
    }

    public String getProperty1() {
        return property1;
    }

    public String getProperty3() {
        return property3;
    }
}
