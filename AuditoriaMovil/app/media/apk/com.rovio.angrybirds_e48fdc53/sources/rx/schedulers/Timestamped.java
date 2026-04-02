package rx.schedulers;
/* loaded from: classes4.dex */
public final class Timestamped<T> {
    private final long a;
    private final T b;

    public Timestamped(long j, T t) {
        this.b = t;
        this.a = j;
    }

    public long getTimestampMillis() {
        return this.a;
    }

    public T getValue() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof Timestamped)) {
            Timestamped timestamped = (Timestamped) obj;
            if (this.a == timestamped.a) {
                if (this.b == timestamped.b) {
                    return true;
                }
                if (this.b != null && this.b.equals(timestamped.b)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (this.b == null ? 0 : this.b.hashCode()) + ((((int) (this.a ^ (this.a >>> 32))) + 31) * 31);
    }

    public String toString() {
        return String.format("Timestamped(timestampMillis = %d, value = %s)", Long.valueOf(this.a), this.b.toString());
    }
}
