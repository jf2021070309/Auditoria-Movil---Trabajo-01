package com.amazon.aps.iva.a6;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Pair;
import com.amazon.aps.iva.b8.p1;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.b8.y1;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.o6.z;
import com.amazon.aps.iva.q5.l0;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.common.collect.ImmutableList;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c1 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.e = obj;
        this.f = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i2) {
            case 0:
                Pair pair = (Pair) obj3;
                j1.this.h.T(((Integer) pair.first).intValue(), (v.b) pair.second, (com.amazon.aps.iva.o6.q) obj2, (com.amazon.aps.iva.o6.t) obj);
                return;
            case 1:
                z.a aVar = (z.a) obj4;
                ((com.amazon.aps.iva.o6.z) obj3).U(aVar.a, aVar.b, (com.amazon.aps.iva.o6.q) obj2, (com.amazon.aps.iva.o6.t) obj);
                return;
            case 2:
                com.amazon.aps.iva.b8.p1 p1Var = (com.amazon.aps.iva.b8.p1) obj4;
                q.d dVar = (q.d) obj3;
                com.amazon.aps.iva.b8.t tVar = (com.amazon.aps.iva.b8.t) obj2;
                com.amazon.aps.iva.b8.h hVar = (com.amazon.aps.iva.b8.h) obj;
                com.amazon.aps.iva.b8.e<IBinder> eVar = p1Var.e;
                boolean z = false;
                try {
                    p1Var.f.remove(dVar);
                    if (!tVar.g()) {
                        p1.a aVar2 = (p1.a) dVar.d;
                        com.amazon.aps.iva.cq.b.D(aVar2);
                        IBinder asBinder = aVar2.a.asBinder();
                        q.b g = tVar.c.g(tVar.i, dVar);
                        com.amazon.aps.iva.cq.b.B(g, "Callback.onConnect must return non-null future");
                        boolean z2 = g.a;
                        if (z2 || dVar.c) {
                            if (!z2) {
                                g = new q.b(y1.c, l0.a.c);
                            }
                            if (eVar.g(dVar)) {
                                dVar.toString();
                                com.amazon.aps.iva.t5.p.g();
                            }
                            eVar.a(asBinder, dVar, g.b, g.c);
                            com.amazon.aps.iva.b8.w1 f = eVar.f(dVar);
                            com.amazon.aps.iva.cq.b.D(f);
                            com.amazon.aps.iva.b8.v1 v1Var = tVar.o;
                            com.amazon.aps.iva.b8.r1 r0 = p1Var.r0(v1Var.Y0());
                            PendingIntent pendingIntent = tVar.p;
                            ImmutableList<com.amazon.aps.iva.b8.b> immutableList = g.d;
                            if (immutableList == null) {
                                immutableList = tVar.t;
                            }
                            com.amazon.aps.iva.b8.g gVar = new com.amazon.aps.iva.b8.g(1001001300, 2, p1Var, pendingIntent, immutableList, g.b, g.c, v1Var.j0(), tVar.h.b.getExtras(), r0);
                            if (!tVar.g()) {
                                try {
                                    synchronized (f.a) {
                                        i = f.b;
                                        f.b = i + 1;
                                    }
                                    hVar.f(i, gVar.toBundle());
                                    z = true;
                                } catch (RemoteException unused) {
                                }
                                tVar.c.getClass();
                                if (z) {
                                    return;
                                }
                            }
                        }
                    }
                    try {
                        hVar.d();
                        return;
                    } catch (RemoteException unused2) {
                        return;
                    }
                } catch (Throwable th) {
                    if (0 == 0) {
                        try {
                            hVar.d();
                        } catch (RemoteException unused3) {
                        }
                    }
                    throw th;
                }
            default:
                ((DefaultScheduler) obj4).lambda$schedule$1((TransportContext) obj3, (TransportScheduleCallback) obj2, (EventInternal) obj);
                return;
        }
    }
}
