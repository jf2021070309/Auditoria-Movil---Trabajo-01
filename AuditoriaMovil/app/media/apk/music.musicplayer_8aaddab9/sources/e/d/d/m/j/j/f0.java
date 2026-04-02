package e.d.d.m.j.j;
/* loaded from: classes2.dex */
public enum f0 {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    
    private final int id;

    f0(int i2) {
        this.id = i2;
    }

    public static f0 determineFrom(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int getId() {
        return this.id;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.id);
    }
}
