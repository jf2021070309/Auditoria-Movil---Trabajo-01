package bo.app;

import com.braze.support.DateTimeUtils;
/* loaded from: classes.dex */
public final class t5 {
    private final double a;
    private final double b;
    private long c;
    private double d;

    public t5(int i, int i2) {
        int i3;
        if (i < 1) {
            i3 = 1;
        } else {
            i3 = i;
        }
        this.a = i3;
        this.b = i2 < 1 ? 1 : i2;
        this.c = DateTimeUtils.nowInMilliseconds();
        this.d = i;
    }

    public final boolean a() {
        long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        double min = Math.min((((nowInMilliseconds - this.c) / this.b) / 1000) + this.d, this.a);
        this.d = min;
        this.c = nowInMilliseconds;
        if (min < 1.0d) {
            return false;
        }
        this.d = min - 1;
        return true;
    }

    public String toString() {
        return "(capacity=" + this.a + ", refillRate=" + this.b + ", lastCallAtMs=" + this.c + ", currentTokenCount=" + this.d + ')';
    }
}
