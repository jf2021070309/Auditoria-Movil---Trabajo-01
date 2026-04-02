package bo.app;
/* loaded from: classes.dex */
public final class s4 {
    private final long a;

    public s4(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof s4) && this.a == ((s4) obj).a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Long.hashCode(this.a);
    }

    public String toString() {
        return "SchedulePushDeliveryFlushEvent(sleepDurationMs=" + this.a + ')';
    }
}
