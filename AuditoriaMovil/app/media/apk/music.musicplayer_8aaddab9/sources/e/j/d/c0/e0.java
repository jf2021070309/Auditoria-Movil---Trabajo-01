package e.j.d.c0;
/* loaded from: classes2.dex */
public enum e0 {
    UNKNOWN(""),
    TRIAL("trial"),
    TRIAL_CANCELLED("trial_cancelled"),
    SUBSCRIPTION_CANCELLED("subscription_cancelled"),
    PAID("paid");
    
    private final String value;

    e0(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
