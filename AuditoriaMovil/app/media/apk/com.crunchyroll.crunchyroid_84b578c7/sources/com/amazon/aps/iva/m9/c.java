package com.amazon.aps.iva.m9;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.amazon.aps.iva.k9.m;
import com.amazon.aps.iva.k9.t;
import com.amazon.aps.iva.l9.e;
import com.amazon.aps.iva.l9.k;
import com.amazon.aps.iva.p9.d;
import com.amazon.aps.iva.t9.p;
import com.amazon.aps.iva.u9.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: GreedyScheduler.java */
/* loaded from: classes.dex */
public final class c implements e, com.amazon.aps.iva.p9.c, com.amazon.aps.iva.l9.b {
    public final Context b;
    public final k c;
    public final d d;
    public final b f;
    public boolean g;
    public Boolean i;
    public final HashSet e = new HashSet();
    public final Object h = new Object();

    static {
        m.e("GreedyScheduler");
    }

    public c(Context context, androidx.work.a aVar, com.amazon.aps.iva.w9.b bVar, k kVar) {
        this.b = context;
        this.c = kVar;
        this.d = new d(context, bVar, this);
        this.f = new b(this, aVar.e);
    }

    @Override // com.amazon.aps.iva.l9.e
    public final void b(String str) {
        Runnable runnable;
        Boolean bool = this.i;
        k kVar = this.c;
        if (bool == null) {
            this.i = Boolean.valueOf(i.a(this.b, kVar.b));
        }
        if (!this.i.booleanValue()) {
            m.c().d(new Throwable[0]);
            return;
        }
        if (!this.g) {
            kVar.f.a(this);
            this.g = true;
        }
        m c = m.c();
        String.format("Cancelling work ID %s", str);
        c.a(new Throwable[0]);
        b bVar = this.f;
        if (bVar != null && (runnable = (Runnable) bVar.c.remove(str)) != null) {
            ((Handler) bVar.b.a).removeCallbacks(runnable);
        }
        kVar.h(str);
    }

    @Override // com.amazon.aps.iva.p9.c
    public final void c(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            m c = m.c();
            String.format("Constraints not met: Cancelling work ID %s", str);
            c.a(new Throwable[0]);
            this.c.h(str);
        }
    }

    @Override // com.amazon.aps.iva.l9.e
    public final boolean d() {
        return false;
    }

    @Override // com.amazon.aps.iva.l9.e
    public final void e(p... pVarArr) {
        boolean z;
        if (this.i == null) {
            this.i = Boolean.valueOf(i.a(this.b, this.c.b));
        }
        if (!this.i.booleanValue()) {
            m.c().d(new Throwable[0]);
            return;
        }
        if (!this.g) {
            this.c.f.a(this);
            this.g = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p pVar : pVarArr) {
            long a = pVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (pVar.b == t.ENQUEUED) {
                if (currentTimeMillis < a) {
                    b bVar = this.f;
                    if (bVar != null) {
                        HashMap hashMap = bVar.c;
                        Runnable runnable = (Runnable) hashMap.remove(pVar.a);
                        com.amazon.aps.iva.l9.a aVar = bVar.b;
                        if (runnable != null) {
                            ((Handler) aVar.a).removeCallbacks(runnable);
                        }
                        a aVar2 = new a(bVar, pVar);
                        hashMap.put(pVar.a, aVar2);
                        ((Handler) aVar.a).postDelayed(aVar2, pVar.a() - System.currentTimeMillis());
                    }
                } else if (pVar.b()) {
                    com.amazon.aps.iva.k9.c cVar = pVar.j;
                    if (cVar.c) {
                        m c = m.c();
                        String.format("Ignoring WorkSpec %s, Requires device idle.", pVar);
                        c.a(new Throwable[0]);
                    } else {
                        if (cVar.h.a.size() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            m c2 = m.c();
                            String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", pVar);
                            c2.a(new Throwable[0]);
                        } else {
                            hashSet.add(pVar);
                            hashSet2.add(pVar.a);
                        }
                    }
                } else {
                    m c3 = m.c();
                    String.format("Starting work for %s", pVar.a);
                    c3.a(new Throwable[0]);
                    this.c.g(pVar.a, null);
                }
            }
        }
        synchronized (this.h) {
            if (!hashSet.isEmpty()) {
                m c4 = m.c();
                String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2));
                c4.a(new Throwable[0]);
                this.e.addAll(hashSet);
                this.d.b(this.e);
            }
        }
    }

    @Override // com.amazon.aps.iva.l9.b
    public final void f(String str, boolean z) {
        synchronized (this.h) {
            Iterator it = this.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p pVar = (p) it.next();
                if (pVar.a.equals(str)) {
                    m c = m.c();
                    String.format("Stopping tracking for %s", str);
                    c.a(new Throwable[0]);
                    this.e.remove(pVar);
                    this.d.b(this.e);
                    break;
                }
            }
        }
    }

    @Override // com.amazon.aps.iva.p9.c
    public final void g(List<String> list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            m c = m.c();
            String.format("Constraints met: Scheduling work ID %s", str);
            c.a(new Throwable[0]);
            this.c.g(str, null);
        }
    }
}
