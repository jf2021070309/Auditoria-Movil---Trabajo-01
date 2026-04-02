package com.amazon.aps.iva.ib;

import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import com.amazon.aps.iva.ib.a;
import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager;
import java.util.LinkedList;
/* compiled from: LTRDownLayouter.java */
/* loaded from: classes.dex */
public final class o extends com.amazon.aps.iva.ib.a {
    public boolean v;

    /* compiled from: LTRDownLayouter.java */
    /* loaded from: classes.dex */
    public static final class a extends a.AbstractC0356a {
        @Override // com.amazon.aps.iva.ib.a.AbstractC0356a
        public final com.amazon.aps.iva.ib.a b() {
            return new o(this);
        }
    }

    public o(a aVar) {
        super(aVar);
    }

    @Override // com.amazon.aps.iva.ib.a
    public final Rect e() {
        int i = this.h;
        int i2 = this.f;
        Rect rect = new Rect(i, i2, this.a + i, this.b + i2);
        this.h = rect.right;
        this.e = Math.max(this.e, rect.bottom);
        return rect;
    }

    @Override // com.amazon.aps.iva.ib.a
    public final int f() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.ib.a
    public final int g() {
        return this.h - a();
    }

    @Override // com.amazon.aps.iva.ib.a
    public final int h() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.ib.a
    public final boolean i(View view) {
        ChipsLayoutManager chipsLayoutManager = this.k;
        int decoratedTop = chipsLayoutManager.getDecoratedTop(view);
        int decoratedLeft = chipsLayoutManager.getDecoratedLeft(view);
        if (this.e <= decoratedTop && decoratedLeft < this.h) {
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
        this.h = a();
        this.f = this.e;
    }

    @Override // com.amazon.aps.iva.ib.a
    public final void m(View view) {
        ChipsLayoutManager chipsLayoutManager = this.k;
        this.f = chipsLayoutManager.getDecoratedTop(view);
        this.h = chipsLayoutManager.getDecoratedRight(view);
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
