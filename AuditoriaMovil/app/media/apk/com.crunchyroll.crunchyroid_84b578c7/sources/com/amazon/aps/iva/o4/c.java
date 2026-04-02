package com.amazon.aps.iva.o4;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Pair;
import android.view.ViewGroup;
import com.amazon.aps.iva.a6.j1;
import com.amazon.aps.iva.b8.e;
import com.amazon.aps.iva.b8.m0;
import com.amazon.aps.iva.b8.p1;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.t5.p;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$open$2;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                m mVar = (m) this.d;
                com.amazon.aps.iva.yb0.j.f(mVar, "$violation");
                throw mVar;
            case 1:
                Pair pair = (Pair) this.d;
                j1.this.h.f0(((Integer) pair.first).intValue(), (v.b) pair.second);
                return;
            case 2:
                m0.g gVar = (m0.g) this.c;
                q.d dVar = (q.d) this.d;
                int i = m0.n;
                try {
                    gVar.b(dVar);
                    return;
                } catch (RemoteException e) {
                    p.h("Exception in " + dVar, e);
                    return;
                }
            case 3:
                p1 p1Var = (p1) this.c;
                int i2 = p1.i;
                p1Var.getClass();
                IBinder asBinder = ((com.amazon.aps.iva.b8.h) this.d).asBinder();
                com.amazon.aps.iva.b8.e<IBinder> eVar = p1Var.e;
                q.d e2 = eVar.e(asBinder);
                if (e2 != null) {
                    eVar.k(e2);
                    return;
                }
                return;
            case 4:
                q.d dVar2 = (q.d) this.d;
                com.amazon.aps.iva.b8.e<IBinder> eVar2 = ((p1) this.c).e;
                synchronized (eVar2.a) {
                    e.b<IBinder> orDefault = eVar2.c.getOrDefault(dVar2, null);
                    if (orDefault != null && !orDefault.f && !orDefault.c.isEmpty()) {
                        orDefault.f = true;
                        eVar2.b(orDefault);
                        return;
                    }
                    return;
                }
            default:
                DefaultInAppMessageViewWrapper$open$2.onLayoutChange$lambda$0((DefaultInAppMessageViewWrapper) this.c, (ViewGroup) this.d);
                return;
        }
    }
}
