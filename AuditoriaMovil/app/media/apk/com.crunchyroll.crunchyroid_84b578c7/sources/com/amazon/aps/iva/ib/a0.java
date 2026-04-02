package com.amazon.aps.iva.ib;

import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import com.amazon.aps.iva.ib.a;
import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager;
import java.util.LinkedList;
/* compiled from: RightLayouter.java */
/* loaded from: classes.dex */
public final class a0 extends com.amazon.aps.iva.ib.a {
    public boolean v;

    /* compiled from: RightLayouter.java */
    /* loaded from: classes.dex */
    public static final class a extends a.AbstractC0356a {
        @Override // com.amazon.aps.iva.ib.a.AbstractC0356a
        public final com.amazon.aps.iva.ib.a b() {
            return new a0(this);
        }
    }

    public a0(a aVar) {
        super(aVar);
    }

    @Override // com.amazon.aps.iva.ib.a
    public final Rect e() {
        int i = this.h;
        int i2 = this.f;
        Rect rect = new Rect(i, i2, this.a + i, this.b + i2);
        int i3 = rect.bottom;
        this.e = i3;
        this.f = i3;
        this.g = Math.max(this.g, rect.right);
        return rect;
    }

    @Override // com.amazon.aps.iva.ib.a
    public final int f() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.ib.a
    public final int g() {
        return this.f - b();
    }

    @Override // com.amazon.aps.iva.ib.a
    public final int h() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.ib.a
    public final boolean i(View view) {
        ChipsLayoutManager chipsLayoutManager = this.k;
        int decoratedLeft = chipsLayoutManager.getDecoratedLeft(view);
        int decoratedTop = chipsLayoutManager.getDecoratedTop(view);
        if (this.g <= decoratedLeft && decoratedTop < this.f) {
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
        this.h = this.g;
        this.f = b();
    }

    @Override // com.amazon.aps.iva.ib.a
    public final void m(View view) {
        ChipsLayoutManager chipsLayoutManager = this.k;
        this.f = chipsLayoutManager.getDecoratedBottom(view);
        this.h = chipsLayoutManager.getDecoratedLeft(view);
        this.g = Math.max(this.g, chipsLayoutManager.getDecoratedRight(view));
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
