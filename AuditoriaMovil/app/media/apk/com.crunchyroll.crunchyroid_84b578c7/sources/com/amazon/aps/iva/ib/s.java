package com.amazon.aps.iva.ib;

import com.amazon.aps.iva.ib.a;
import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager;
import java.util.ArrayList;
/* compiled from: LayouterFactory.java */
/* loaded from: classes.dex */
public final class s {
    public final ChipsLayoutManager a;
    public final com.amazon.aps.iva.gb.c b;
    public final ArrayList c = new ArrayList();
    public final com.amazon.aps.iva.jb.e d;
    public final com.amazon.aps.iva.kb.a e;
    public final com.amazon.aps.iva.lb.f f;
    public final com.amazon.aps.iva.hb.i g;
    public final com.amazon.aps.iva.hb.j h;
    public final i i;

    public s(ChipsLayoutManager chipsLayoutManager, i iVar, com.amazon.aps.iva.jb.c cVar, com.amazon.aps.iva.kb.a aVar, com.amazon.aps.iva.lb.f fVar, com.amazon.aps.iva.hb.i iVar2, com.amazon.aps.iva.hb.j jVar) {
        this.i = iVar;
        this.b = chipsLayoutManager.k;
        this.a = chipsLayoutManager;
        this.d = cVar;
        this.e = aVar;
        this.f = fVar;
        this.g = iVar2;
        this.h = jVar;
    }

    public final a a(com.amazon.aps.iva.fb.b bVar) {
        i iVar = this.i;
        a.AbstractC0356a c = iVar.c();
        ChipsLayoutManager chipsLayoutManager = this.a;
        c.a = chipsLayoutManager;
        c.c = chipsLayoutManager.a;
        c.d = chipsLayoutManager.e;
        c.b = this.b;
        c.j = this.g;
        c.i.addAll(this.c);
        c.h = iVar.a(bVar);
        com.amazon.aps.iva.jb.f a = this.d.a();
        if (a != null) {
            c.g = a;
            c.e = this.e.a();
            c.k = this.h;
            c.f = this.f.b();
            c.l = new f(chipsLayoutManager.getItemCount());
            return c.a();
        }
        throw new AssertionError("breaker shouldn't be null".concat(" can't be null."));
    }

    public final a b(com.amazon.aps.iva.fb.b bVar) {
        i iVar = this.i;
        a.AbstractC0356a b = iVar.b();
        ChipsLayoutManager chipsLayoutManager = this.a;
        b.a = chipsLayoutManager;
        b.c = chipsLayoutManager.a;
        b.d = chipsLayoutManager.e;
        b.b = this.b;
        b.j = this.g;
        b.i.addAll(this.c);
        b.h = iVar.d(bVar);
        com.amazon.aps.iva.jb.f f = this.d.f();
        if (f != null) {
            b.g = f;
            b.e = this.e.b();
            b.k = new com.amazon.aps.iva.hb.n(this.h, !chipsLayoutManager.j);
            b.f = this.f.a();
            b.l = new m(chipsLayoutManager.getItemCount());
            return b.a();
        }
        throw new AssertionError("breaker shouldn't be null".concat(" can't be null."));
    }
}
