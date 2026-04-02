package com.amazon.aps.iva.fh;

import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.t50.c;
import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: AppLaunchesStore.kt */
/* loaded from: classes.dex */
public final class d implements c {
    public final com.amazon.aps.iva.xe.c<a> a;
    public final com.amazon.aps.iva.t50.c b;
    public final com.amazon.aps.iva.ch.a c;

    public d(f fVar, com.amazon.aps.iva.ch.a aVar) {
        c.b bVar = c.b.a;
        j.f(aVar, "config");
        this.a = fVar;
        this.b = bVar;
        this.c = aVar;
    }

    @Override // com.amazon.aps.iva.fh.c
    public final void clear() {
        this.a.clear();
    }

    @Override // com.amazon.aps.iva.fh.c
    public final List<a> q() {
        return this.a.q();
    }

    @Override // com.amazon.aps.iva.fh.c
    public final void r() {
        com.amazon.aps.iva.t50.c cVar;
        boolean z;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = q().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            cVar = this.b;
            if (!hasNext) {
                break;
            }
            Object next = it.next();
            long b = ((a) next).b();
            long a = cVar.a();
            com.amazon.aps.iva.ch.a aVar = this.c;
            j.f(aVar, "<this>");
            if (b < a - TimeUnit.MINUTES.toMillis(aVar.c())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(r.Y(arrayList));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((a) it2.next()).a());
        }
        com.amazon.aps.iva.xe.c<a> cVar2 = this.a;
        cVar2.X0(arrayList2);
        cVar2.m1(new a(cVar.a()));
    }
}
