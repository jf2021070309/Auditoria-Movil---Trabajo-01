package com.amazon.aps.iva.ib;

import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import com.amazon.aps.iva.ib.a;
import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager;
/* compiled from: LTRUpLayouter.java */
/* loaded from: classes.dex */
public final class r extends com.amazon.aps.iva.ib.a {

    /* compiled from: LTRUpLayouter.java */
    /* loaded from: classes.dex */
    public static final class a extends a.AbstractC0356a {
        @Override // com.amazon.aps.iva.ib.a.AbstractC0356a
        public final com.amazon.aps.iva.ib.a b() {
            return new r(this);
        }
    }

    public r(a aVar) {
        super(aVar);
    }

    @Override // com.amazon.aps.iva.ib.a
    public final Rect e() {
        Rect rect = new Rect(this.g - this.a, this.e - this.b, this.g, this.e);
        this.g = rect.left;
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
        int decoratedBottom = chipsLayoutManager.getDecoratedBottom(view);
        int decoratedRight = chipsLayoutManager.getDecoratedRight(view);
        if (this.f >= decoratedBottom && decoratedRight > this.g) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.ib.a
    public final boolean j() {
        return true;
    }

    @Override // com.amazon.aps.iva.ib.a
    public final void l() {
        this.g = d();
        this.e = this.f;
    }

    @Override // com.amazon.aps.iva.ib.a
    public final void m(View view) {
        int i = this.g;
        int d = d();
        ChipsLayoutManager chipsLayoutManager = this.k;
        if (i != d && this.g - this.a < a()) {
            this.g = d();
            this.e = this.f;
        } else {
            this.g = chipsLayoutManager.getDecoratedLeft(view);
        }
        this.f = Math.min(this.f, chipsLayoutManager.getDecoratedTop(view));
    }

    @Override // com.amazon.aps.iva.ib.a
    public final void n() {
        int a2 = this.g - a();
        this.h = 0;
        for (Pair pair : this.d) {
            Rect rect = (Rect) pair.first;
            rect.left -= a2;
            int i = rect.right - a2;
            rect.right = i;
            this.h = Math.max(i, this.h);
            this.f = Math.min(this.f, rect.top);
            this.e = Math.max(this.e, rect.bottom);
        }
    }
}
