package me.nik.alice.api.custom;

public class CheckData {

    private final String check, type, fullCheckName;

    private final int violations;

    public CheckData(String check, String type, String fullCheckName, int violations) {

        this.check = check;

        this.type = type;

        this.violations = violations;

        this.fullCheckName = fullCheckName;
    }

    public String getFullCheckName() {
        return fullCheckName;
    }

    public String getCheck() {
        return check;
    }

    public String getType() {
        return type;
    }

    public int getViolations() {
        return violations;
    }
}