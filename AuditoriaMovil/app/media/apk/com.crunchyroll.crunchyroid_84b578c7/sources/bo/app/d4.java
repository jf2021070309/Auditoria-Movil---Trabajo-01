package bo.app;
/* loaded from: classes.dex */
public final class d4 {
    private final long a;

    public d4(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d4) && this.a == ((d4) obj).a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Long.hashCode(this.a);
    }

    public String toString() {
        return "PushMaxRequestSuccessEvent(lastUpdateTime=" + this.a + ')';
    }
}
