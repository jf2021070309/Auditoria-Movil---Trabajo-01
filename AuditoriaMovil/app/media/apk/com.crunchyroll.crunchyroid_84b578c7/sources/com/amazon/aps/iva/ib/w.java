package com.amazon.aps.iva.ib;

import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import com.amazon.aps.iva.ib.a;
import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager;
import java.util.LinkedList;
/* compiled from: RTLDownLayouter.java */
/* loaded from: classes.dex */
public final class w extends com.amazon.aps.iva.ib.a {
    public boolean v;

    /* compiled from: RTLDownLayouter.java */
    /* loaded from: classes.dex */
    public static final class a extends a.AbstractC0356a {
        @Override // com.amazon.aps.iva.ib.a.AbstractC0356a
        public final com.amazon.aps.iva.ib.a b() {
            return new w(this);
        }
    }

    public w(a aVar) {
        super(aVar);
    }

    @Override // com.amazon.aps.iva.ib.a
    public final Rect e() {
        int i = this.g;
        int i2 = this.f;
        Rect rect = new Rect(i - this.a, i2, i, this.b + i2);
        this.g = rect.left;
        this.e = Math.max(this.e, rect.bottom);
        return rect;
    }

    @Override // com.amazon.aps.iva.ib.a
    public final int f() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.ib.a
    public final int g() {
        return d() - this.g;
    }

    @Override // com.amazon.aps.iva.ib.a
    public final int h() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.ib.a
    public final boolean i(View view) {
        ChipsLayoutManager chipsLayoutManager = this.k;
        int decoratedTop = chipsLayoutManager.getDecoratedTop(view);
        int decoratedRight = chipsLayoutManager.getDecoratedRight(view);
        if (this.e <= decoratedTop && decoratedRight > this.g) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.ib.a
    public final boolean j() {
        return false;
    }

    @Override // com.amazon.aps.iva.ib.a
    public final void l() {
        this.g = d();
        this.f = this.e;
    }

    @Override // com.amazon.aps.iva.ib.a
    public final void m(View view) {
        ChipsLayoutManager chipsLayoutManager = this.k;
        this.f = chipsLayoutManager.getDecoratedTop(view);
        this.g = chipsLayoutManager.getDecoratedLeft(view);
        this.e = Math.max(this.e, chipsLayoutManager.getDecoratedBottom(view));
    }

    @Override // com.amazon.aps.iva.ib.a
    public final void n() {
        LinkedList linkedList = this.d;
        if (!linkedList.isEmpty()) {
            boolean z = this.v;
            com.amazon.aps.iva.gb.b bVar = this.l;
            if (!z) {
                this.v = true;
                ((com.amazon.aps.iva.gb.c) bVar).b(this.k.getPosition((View) ((Pair) linkedList.get(0)).second));
            }
            ((com.amazon.aps.iva.gb.c) bVar).c(linkedList);
        }
    }
}
