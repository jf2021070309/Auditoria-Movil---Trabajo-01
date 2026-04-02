package com.amazon.aps.iva.er;

import android.view.Choreographer;
import java.util.concurrent.TimeUnit;
/* compiled from: VitalFrameCallback.kt */
/* loaded from: classes2.dex */
public final class d implements Choreographer.FrameCallback {
    public static final double e = TimeUnit.SECONDS.toNanos(1);
    public static final com.amazon.aps.iva.ec0.d f = new com.amazon.aps.iva.ec0.d();
    public final h b;
    public final com.amazon.aps.iva.xb0.a<Boolean> c;
    public long d;

    public d(g gVar, com.amazon.aps.iva.tq.b bVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "observer");
        com.amazon.aps.iva.yb0.j.f(bVar, "keepRunning");
        this.b = gVar;
        this.c = bVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        boolean z;
        long j2 = this.d;
        if (j2 != 0) {
            double d = j - j2;
            if (d > 0.0d) {
                double d2 = e / d;
                Double valueOf = Double.valueOf(d2);
                com.amazon.aps.iva.ec0.d dVar = f;
                dVar.getClass();
                double doubleValue = valueOf.doubleValue();
                if (doubleValue >= dVar.b && doubleValue <= dVar.c) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.b.b(d2);
                }
            }
        }
        this.d = j;
        if (this.c.invoke().booleanValue()) {
            try {
                Choreographer.getInstance().postFrameCallback(this);
            } catch (IllegalStateException e2) {
                com.amazon.aps.iva.iq.a.a(com.amazon.aps.iva.dq.c.a, "Unable to post VitalFrameCallback, thread doesn't have looper", e2, 4);
            }
        }
    }
}
