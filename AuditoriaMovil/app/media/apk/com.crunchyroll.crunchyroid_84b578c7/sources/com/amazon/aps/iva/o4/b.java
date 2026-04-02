package com.amazon.aps.iva.o4;

import android.os.ResultReceiver;
import android.util.Pair;
import com.amazon.aps.iva.a6.j1;
import com.amazon.aps.iva.b8.a2;
import com.amazon.aps.iva.b8.m0;
import com.amazon.aps.iva.g6.e;
import com.amazon.aps.iva.metrics.types.MetricEvent;
import com.amazon.aps.iva.metrics.types.Severity;
import com.amazon.aps.iva.o6.e0;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.p6.b;
import com.amazon.aps.iva.t5.p;
import com.amazon.aps.iva.util.LogUtils;
import com.amazon.aps.iva.x6.d0;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import javax.net.ssl.HttpsURLConnection;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d0 bVar;
        a2 a2Var;
        boolean z = false;
        int i = 1;
        switch (this.b) {
            case 1:
                Pair pair = (Pair) this.d;
                j1.this.h.Q(((Integer) pair.first).intValue(), (v.b) pair.second);
                return;
            case 2:
                e.a aVar = (e.a) this.c;
                ((com.amazon.aps.iva.g6.e) this.d).f0(aVar.a, aVar.b);
                return;
            case 3:
                com.amazon.aps.iva.o6.d0 d0Var = (com.amazon.aps.iva.o6.d0) this.c;
                d0 d0Var2 = (d0) this.d;
                if (d0Var.s == null) {
                    bVar = d0Var2;
                } else {
                    bVar = new d0.b(-9223372036854775807L);
                }
                d0Var.z = bVar;
                d0Var.A = d0Var2.i();
                if (!d0Var.G && d0Var2.i() == -9223372036854775807L) {
                    z = true;
                }
                d0Var.B = z;
                if (z) {
                    i = 7;
                }
                d0Var.C = i;
                ((e0) d0Var.h).v(d0Var2.f(), d0Var.B, d0Var.A);
                if (!d0Var.w) {
                    d0Var.z();
                    return;
                }
                return;
            case 4:
                b.d dVar = (b.d) this.c;
                com.amazon.aps.iva.q5.c cVar = (com.amazon.aps.iva.q5.c) this.d;
                if (!dVar.b) {
                    com.amazon.aps.iva.p6.b bVar2 = com.amazon.aps.iva.p6.b.this;
                    com.amazon.aps.iva.q5.c cVar2 = bVar2.v;
                    if (cVar2 == null) {
                        b.C0605b[][] c0605bArr = new b.C0605b[cVar.c];
                        bVar2.w = c0605bArr;
                        Arrays.fill(c0605bArr, new b.C0605b[0]);
                    } else {
                        if (cVar.c == cVar2.c) {
                            z = true;
                        }
                        com.amazon.aps.iva.cq.b.C(z);
                    }
                    bVar2.v = cVar;
                    bVar2.z();
                    bVar2.A();
                    return;
                }
                return;
            case 5:
                ListenableFuture listenableFuture = (ListenableFuture) this.c;
                ResultReceiver resultReceiver = (ResultReceiver) this.d;
                int i2 = m0.n;
                try {
                    a2Var = (a2) listenableFuture.get();
                    com.amazon.aps.iva.cq.b.B(a2Var, "SessionResult must not be null");
                } catch (InterruptedException e) {
                    e = e;
                    p.h("Custom command failed", e);
                    a2Var = new a2(-1);
                } catch (CancellationException e2) {
                    p.h("Custom command cancelled", e2);
                    a2Var = new a2(1);
                } catch (ExecutionException e3) {
                    e = e3;
                    p.h("Custom command failed", e);
                    a2Var = new a2(-1);
                }
                resultReceiver.send(a2Var.b, a2Var.c);
                return;
            default:
                com.amazon.aps.iva.wa.m mVar = (com.amazon.aps.iva.wa.m) this.c;
                mVar.getClass();
                for (URL url : (List) this.d) {
                    try {
                        mVar.d((HttpsURLConnection) ((URL) new com.amazon.aps.iva.l9.a(url).a).openConnection());
                    } catch (IOException | ClassCastException e4) {
                        LogUtils.e("j", String.format("ApsIvaTrackingUrlReporter: Exception opening trackingUrl connection: %s", e4));
                        mVar.b.a(new MetricEvent("apsIva-trackingUrlReportRunnableExceptionCounter", Severity.ERROR));
                    }
                }
                return;
        }
    }
}
