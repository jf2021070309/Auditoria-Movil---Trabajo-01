package e.c.a.s;

import android.os.SystemClock;
/* loaded from: classes.dex */
public final class f {
    public static final double a = 1.0d / Math.pow(10.0d, 6.0d);

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f6026b = 0;

    public static double a(long j2) {
        double elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() - j2;
        double d2 = a;
        Double.isNaN(elapsedRealtimeNanos);
        return elapsedRealtimeNanos * d2;
    }
}
