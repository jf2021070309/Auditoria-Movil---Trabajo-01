package rx.schedulers;
/* loaded from: classes4.dex */
public class TimeInterval<T> {
    private final long a;
    private final T b;

    public TimeInterval(long j, T t) {
        this.b = t;
        this.a = j;
    }

    public long getIntervalInMilliseconds() {
        return this.a;
    }

    public T getValue() {
        return this.b;
    }

    public int hashCode() {
        return (this.b == null ? 0 : this.b.hashCode()) + ((((int) (this.a ^ (this.a >>> 32))) + 31) * 31);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TimeInterval timeInterval = (TimeInterval) obj;
            if (this.a != timeInterval.a) {
                return false;
            }
            return this.b == null ? timeInterval.b == null : this.b.equals(timeInterval.b);
        }
        return false;
    }

    public String toString() {
        return "TimeInterval [intervalInMilliseconds=" + this.a + ", value=" + this.b + "]";
    }
}
