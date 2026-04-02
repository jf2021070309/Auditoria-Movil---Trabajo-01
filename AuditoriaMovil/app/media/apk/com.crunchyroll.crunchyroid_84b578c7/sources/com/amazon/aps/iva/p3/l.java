package com.amazon.aps.iva.p3;

import android.annotation.SuppressLint;
import androidx.lifecycle.g;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: MenuHostHelper.java */
/* loaded from: classes.dex */
public final class l {
    public final Runnable a;
    public final CopyOnWriteArrayList<n> b = new CopyOnWriteArrayList<>();
    public final HashMap c = new HashMap();

    /* compiled from: MenuHostHelper.java */
    /* loaded from: classes.dex */
    public static class a {
        public final androidx.lifecycle.g a;
        public androidx.lifecycle.j b;

        public a(androidx.lifecycle.g gVar, androidx.lifecycle.j jVar) {
            this.a = gVar;
            this.b = jVar;
            gVar.addObserver(jVar);
        }
    }

    public l(Runnable runnable) {
        this.a = runnable;
    }

    public final void a(final n nVar, com.amazon.aps.iva.i5.o oVar) {
        this.b.add(nVar);
        this.a.run();
        androidx.lifecycle.g lifecycle = oVar.getLifecycle();
        HashMap hashMap = this.c;
        a aVar = (a) hashMap.remove(nVar);
        if (aVar != null) {
            aVar.a.removeObserver(aVar.b);
            aVar.b = null;
        }
        hashMap.put(nVar, new a(lifecycle, new androidx.lifecycle.j() { // from class: com.amazon.aps.iva.p3.j
            @Override // androidx.lifecycle.j
            public final void U2(com.amazon.aps.iva.i5.o oVar2, g.a aVar2) {
                l lVar = l.this;
                lVar.getClass();
                if (aVar2 == g.a.ON_DESTROY) {
                    lVar.c(nVar);
                }
            }
        }));
    }

    @SuppressLint({"LambdaLast"})
    public final void b(final n nVar, com.amazon.aps.iva.i5.o oVar, final g.b bVar) {
        androidx.lifecycle.g lifecycle = oVar.getLifecycle();
        HashMap hashMap = this.c;
        a aVar = (a) hashMap.remove(nVar);
        if (aVar != null) {
            aVar.a.removeObserver(aVar.b);
            aVar.b = null;
        }
        hashMap.put(nVar, new a(lifecycle, new androidx.lifecycle.j() { // from class: com.amazon.aps.iva.p3.k
            @Override // androidx.lifecycle.j
            public final void U2(com.amazon.aps.iva.i5.o oVar2, g.a aVar2) {
                l lVar = l.this;
                lVar.getClass();
                g.b bVar2 = bVar;
                g.a upTo = g.a.upTo(bVar2);
                Runnable runnable = lVar.a;
                CopyOnWriteArrayList<n> copyOnWriteArrayList = lVar.b;
                n nVar2 = nVar;
                if (aVar2 == upTo) {
                    copyOnWriteArrayList.add(nVar2);
                    runnable.run();
                } else if (aVar2 == g.a.ON_DESTROY) {
                    lVar.c(nVar2);
                } else if (aVar2 == g.a.downFrom(bVar2)) {
                    copyOnWriteArrayList.remove(nVar2);
                    runnable.run();
                }
            }
        }));
    }

    public final void c(n nVar) {
        this.b.remove(nVar);
        a aVar = (a) this.c.remove(nVar);
        if (aVar != null) {
            aVar.a.removeObserver(aVar.b);
            aVar.b = null;
        }
        this.a.run();
    }
}
