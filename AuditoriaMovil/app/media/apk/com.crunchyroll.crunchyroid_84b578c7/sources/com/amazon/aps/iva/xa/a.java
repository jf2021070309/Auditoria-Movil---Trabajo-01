package com.amazon.aps.iva.xa;

import com.amazon.aps.iva.m6.e;
import com.amazon.aps.iva.metrics.types.Event;
import com.amazon.aps.iva.metrics.types.MetricEvent;
import com.amazon.aps.iva.types.EnvironmentData;
import com.amazon.aps.iva.u1.n;
import com.amazon.aps.iva.util.LogUtils;
import com.amazon.aps.iva.wa.g;
import com.amazon.aps.iva.wa.h;
import java.util.LinkedList;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import lombok.NonNull;
/* compiled from: BufferedMetricsLogger.java */
/* loaded from: classes.dex */
public final class a implements b {
    public final e b;
    public final g c;
    public final n d;
    public final EnvironmentData e;
    public final LinkedList<Event> f;
    public final com.amazon.aps.iva.ta.a g;
    public final C0848a h;

    /* compiled from: BufferedMetricsLogger.java */
    /* renamed from: com.amazon.aps.iva.xa.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0848a extends Thread {
        public C0848a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                a aVar = a.this;
                g gVar = aVar.c;
                ((h) gVar).a.execute(aVar.b);
            } catch (RuntimeException unused) {
            }
        }
    }

    public a(@NonNull g gVar, @NonNull n nVar, @NonNull EnvironmentData environmentData, @NonNull com.amazon.aps.iva.ta.a aVar) {
        if (gVar != null) {
            if (environmentData != null) {
                this.c = gVar;
                this.d = nVar;
                this.e = environmentData;
                this.g = aVar;
                this.f = new LinkedList<>();
                e eVar = new e(this, 3);
                this.b = eVar;
                ((h) gVar).a.scheduleAtFixedRate(eVar, 10L, 10L, TimeUnit.SECONDS);
                C0848a c0848a = new C0848a();
                this.h = c0848a;
                Runtime.getRuntime().addShutdownHook(c0848a);
                return;
            }
            throw new NullPointerException("environmentData is marked non-null but is null");
        }
        throw new NullPointerException("apsIvaExecutorService is marked non-null but is null");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[RETURN] */
    @Override // com.amazon.aps.iva.xa.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.amazon.aps.iva.metrics.types.MetricEvent r7) {
        /*
            r6 = this;
            r0 = 0
            com.amazon.aps.iva.ta.a r1 = r6.g     // Catch: java.lang.RuntimeException -> L5d
            if (r1 == 0) goto L51
            com.amazon.aps.iva.metrics.types.Severity r2 = r7.getSeverity()     // Catch: java.lang.RuntimeException -> L5d
            com.google.gson.JsonObject r3 = r1.i     // Catch: java.lang.RuntimeException -> L5d
            if (r3 == 0) goto L30
            java.lang.String r4 = r2.name()     // Catch: java.lang.RuntimeException -> L5d
            java.util.Locale r5 = java.util.Locale.ENGLISH     // Catch: java.lang.RuntimeException -> L5d
            java.lang.String r4 = r4.toLowerCase(r5)     // Catch: java.lang.RuntimeException -> L5d
            boolean r3 = r3.has(r4)     // Catch: java.lang.RuntimeException -> L5d
            if (r3 == 0) goto L30
            com.google.gson.JsonObject r1 = r1.i     // Catch: java.lang.RuntimeException -> L5d
            java.lang.String r2 = r2.name()     // Catch: java.lang.RuntimeException -> L5d
            java.lang.String r2 = r2.toLowerCase(r5)     // Catch: java.lang.RuntimeException -> L5d
            com.google.gson.JsonElement r1 = r1.get(r2)     // Catch: java.lang.RuntimeException -> L5d
            double r1 = r1.getAsDouble()     // Catch: java.lang.RuntimeException -> L5d
            goto L32
        L30:
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L32:
            java.lang.Double r1 = java.lang.Double.valueOf(r1)     // Catch: java.lang.RuntimeException -> L5d
            double r2 = java.lang.Math.random()     // Catch: java.lang.RuntimeException -> L5d
            double r4 = r1.doubleValue()     // Catch: java.lang.RuntimeException -> L5d
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r2 = 1
            if (r1 >= 0) goto L45
            r1 = r2
            goto L46
        L45:
            r1 = r0
        L46:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.RuntimeException -> L5d
            boolean r1 = r1.booleanValue()     // Catch: java.lang.RuntimeException -> L5d
            if (r1 != 0) goto L51
            return r2
        L51:
            com.amazon.aps.iva.types.EnvironmentData r1 = r6.e     // Catch: java.lang.RuntimeException -> L5d
            if (r1 == 0) goto L58
            r7.decorateEvent(r1)     // Catch: java.lang.RuntimeException -> L5d
        L58:
            boolean r7 = r6.b(r7)     // Catch: java.lang.RuntimeException -> L5d
            return r7
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.xa.a.a(com.amazon.aps.iva.metrics.types.MetricEvent):boolean");
    }

    public final boolean b(MetricEvent metricEvent) {
        if (((h) this.c).a.isShutdown()) {
            return false;
        }
        synchronized (this.f) {
            if (this.f.size() >= 500) {
                this.f.removeFirst();
            }
            this.f.add(metricEvent);
        }
        return true;
    }

    @Override // com.amazon.aps.iva.xa.b
    public final void a() {
        C0848a c0848a = this.h;
        try {
            try {
                g gVar = this.c;
                ((h) gVar).a.execute(this.b);
            } catch (RejectedExecutionException e) {
                LogUtils.w("a", e.getMessage());
            }
        } finally {
            Runtime.getRuntime().removeShutdownHook(c0848a);
        }
    }
}
