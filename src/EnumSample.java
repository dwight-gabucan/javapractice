
public enum EnumSample {
    S("small"),
    M("medium"),
    L("large");

    private String description;

    EnumSample(String desription) {
        this.description = desription;
    }

    @Override
    public String toString() {
        return description;
    }

}