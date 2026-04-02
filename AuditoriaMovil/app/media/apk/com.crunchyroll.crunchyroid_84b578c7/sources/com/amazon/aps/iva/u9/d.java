package com.amazon.aps.iva.u9;

import androidx.work.impl.WorkDatabase;
import com.amazon.aps.iva.k9.p;
import com.amazon.aps.iva.k9.t;
import java.util.LinkedList;
/* compiled from: CancelWorkRunnable.java */
/* loaded from: classes.dex */
public abstract class d implements Runnable {
    public final com.amazon.aps.iva.l9.c b = new com.amazon.aps.iva.l9.c();

    public static void a(com.amazon.aps.iva.l9.k kVar, String str) {
        WorkDatabase workDatabase = kVar.c;
        com.amazon.aps.iva.t9.q n = workDatabase.n();
        com.amazon.aps.iva.t9.b i = workDatabase.i();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            com.amazon.aps.iva.t9.r rVar = (com.amazon.aps.iva.t9.r) n;
            t f = rVar.f(str2);
            if (f != t.SUCCEEDED && f != t.FAILED) {
                rVar.n(t.CANCELLED, str2);
            }
            linkedList.addAll(((com.amazon.aps.iva.t9.c) i).a(str2));
        }
        com.amazon.aps.iva.l9.d dVar = kVar.f;
        synchronized (dVar.l) {
            com.amazon.aps.iva.k9.m c = com.amazon.aps.iva.k9.m.c();
            int i2 = com.amazon.aps.iva.l9.d.m;
            String.format("Processor cancelling %s", str);
            boolean z = false;
            c.a(new Throwable[0]);
            dVar.j.add(str);
            com.amazon.aps.iva.l9.n nVar = (com.amazon.aps.iva.l9.n) dVar.g.remove(str);
            if (nVar != null) {
                z = true;
            }
            if (nVar == null) {
                nVar = (com.amazon.aps.iva.l9.n) dVar.h.remove(str);
            }
            com.amazon.aps.iva.l9.d.b(str, nVar);
            if (z) {
                dVar.g();
            }
        }
        for (com.amazon.aps.iva.l9.e eVar : kVar.e) {
            eVar.b(str);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        com.amazon.aps.iva.l9.c cVar = this.b;
        try {
            b();
            cVar.a(com.amazon.aps.iva.k9.p.a);
        } catch (Throwable th) {
            cVar.a(new p.a.C0438a(th));
        }
    }
}
