package bo.app;
/* loaded from: classes.dex */
public final class w {
    private final long a;
    private final int b;

    public w(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final long a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.a == wVar.a && this.b == wVar.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ContentCardRetryEvent(timeInMs=");
        sb.append(this.a);
        sb.append(", retryCount=");
        return com.amazon.aps.iva.d0.b2.b(sb, this.b, ')');
    }
}
