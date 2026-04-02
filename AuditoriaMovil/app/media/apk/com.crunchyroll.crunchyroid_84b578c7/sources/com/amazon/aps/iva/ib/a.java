package com.amazon.aps.iva.ib;

import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: AbstractLayouter.java */
/* loaded from: classes.dex */
public abstract class a implements h, com.amazon.aps.iva.eb.d {
    public int a;
    public int b;
    public int c;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean j;
    public final ChipsLayoutManager k;
    public final com.amazon.aps.iva.gb.b l;
    public final com.amazon.aps.iva.eb.d m;
    public final com.amazon.aps.iva.hb.g n;
    public com.amazon.aps.iva.kb.i o;
    public com.amazon.aps.iva.lb.e p;
    public final com.amazon.aps.iva.jb.f q;
    public final com.amazon.aps.iva.hb.j r;
    public final HashSet s;
    public final com.amazon.aps.iva.hb.i t;
    public final b u;
    public final LinkedList d = new LinkedList();
    public int i = 0;

    /* compiled from: AbstractLayouter.java */
    /* renamed from: com.amazon.aps.iva.ib.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0356a {
        public ChipsLayoutManager a;
        public com.amazon.aps.iva.gb.b b;
        public com.amazon.aps.iva.eb.d c;
        public com.amazon.aps.iva.hb.g d;
        public com.amazon.aps.iva.kb.i e;
        public com.amazon.aps.iva.lb.e f;
        public com.amazon.aps.iva.jb.f g;
        public Rect h;
        public final HashSet<j> i = new HashSet<>();
        public com.amazon.aps.iva.hb.i j;
        public com.amazon.aps.iva.hb.j k;
        public b l;

        public final a a() {
            if (this.a != null) {
                if (this.g != null) {
                    if (this.c != null) {
                        if (this.b != null) {
                            if (this.k != null) {
                                if (this.h != null) {
                                    if (this.e != null) {
                                        if (this.f != null) {
                                            if (this.j != null) {
                                                if (this.d != null) {
                                                    if (this.l != null) {
                                                        return b();
                                                    }
                                                    throw new IllegalStateException("positionIterator can't be null, call #positionIterator()");
                                                }
                                                throw new IllegalStateException("childGravityResolver can't be null, call #childGravityResolver()");
                                            }
                                            throw new IllegalStateException("gravityModifiersFactory can't be null, call #gravityModifiersFactory()");
                                        }
                                        throw new IllegalStateException("placer can't be null, call #placer()");
                                    }
                                    throw new IllegalStateException("finishingCriteria can't be null, call #finishingCriteria()");
                                }
                                throw new IllegalStateException("offsetRect can't be null, call #offsetRect()");
                            }
                            throw new IllegalStateException("rowStrategy can't be null, call #rowStrategy()");
                        }
                        throw new IllegalStateException("cacheStorage can't be null, call #cacheStorage()");
                    }
                    throw new IllegalStateException("border can't be null, call #border()");
                }
                throw new IllegalStateException("breaker can't be null, call #breaker()");
            }
            throw new IllegalStateException("layoutManager can't be null, call #layoutManager()");
        }

        public abstract a b();
    }

    public a(AbstractC0356a abstractC0356a) {
        this.s = new HashSet();
        this.k = abstractC0356a.a;
        this.l = abstractC0356a.b;
        this.m = abstractC0356a.c;
        this.n = abstractC0356a.d;
        this.o = abstractC0356a.e;
        this.p = abstractC0356a.f;
        Rect rect = abstractC0356a.h;
        this.f = rect.top;
        this.e = rect.bottom;
        this.g = rect.right;
        this.h = rect.left;
        this.s = abstractC0356a.i;
        this.q = abstractC0356a.g;
        this.t = abstractC0356a.j;
        this.r = abstractC0356a.k;
        this.u = abstractC0356a.l;
    }

    @Override // com.amazon.aps.iva.eb.d
    public final int a() {
        return this.m.a();
    }

    @Override // com.amazon.aps.iva.eb.d
    public final int b() {
        return this.m.b();
    }

    @Override // com.amazon.aps.iva.eb.d
    public final int c() {
        return this.m.c();
    }

    @Override // com.amazon.aps.iva.eb.d
    public final int d() {
        return this.m.d();
    }

    public abstract Rect e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract boolean i(View view);

    public abstract boolean j();

    public final void k() {
        n();
        LinkedList<Pair> linkedList = this.d;
        int size = linkedList.size();
        ChipsLayoutManager chipsLayoutManager = this.k;
        if (size > 0) {
            LinkedList linkedList2 = new LinkedList();
            LinkedList<Pair> linkedList3 = new LinkedList(linkedList);
            if (j()) {
                Collections.reverse(linkedList3);
            }
            for (Pair pair : linkedList3) {
                linkedList2.add(new n(chipsLayoutManager.getPosition((View) pair.second), (Rect) pair.first));
            }
            this.r.b(this, linkedList2);
        }
        for (Pair pair2 : linkedList) {
            View view = (View) pair2.second;
            chipsLayoutManager.getPosition(view);
            Rect a = this.t.a(this.n.g()).a(h(), f(), (Rect) pair2.first);
            this.p.a(view);
            this.k.layoutDecorated(view, a.left, a.top, a.right, a.bottom);
        }
        l();
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            ((j) it.next()).a(this);
        }
        this.i = 0;
        linkedList.clear();
        this.j = false;
    }

    public abstract void l();

    public abstract void m(View view);

    public abstract void n();

    public final boolean o(View view) {
        ChipsLayoutManager chipsLayoutManager = this.k;
        chipsLayoutManager.measureChildWithMargins(view, 0, 0);
        this.b = chipsLayoutManager.getDecoratedMeasuredHeight(view);
        this.a = chipsLayoutManager.getDecoratedMeasuredWidth(view);
        this.c = chipsLayoutManager.getPosition(view);
        if (this.q.h(this)) {
            this.j = true;
            k();
        }
        if (this.o.c(this)) {
            return false;
        }
        this.i++;
        this.d.add(new Pair(e(), view));
        return true;
    }
}
