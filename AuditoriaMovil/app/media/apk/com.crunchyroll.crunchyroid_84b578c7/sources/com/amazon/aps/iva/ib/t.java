package com.amazon.aps.iva.ib;

import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import com.amazon.aps.iva.ib.a;
import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager;
/* compiled from: LeftLayouter.java */
/* loaded from: classes.dex */
public final class t extends com.amazon.aps.iva.ib.a {

    /* compiled from: LeftLayouter.java */
    /* loaded from: classes.dex */
    public static final class a extends a.AbstractC0356a {
        @Override // com.amazon.aps.iva.ib.a.AbstractC0356a
        public final com.amazon.aps.iva.ib.a b() {
            return new t(this);
        }
    }

    public t(a aVar) {
        super(aVar);
    }

    @Override // com.amazon.aps.iva.ib.a
    public final Rect e() {
        Rect rect = new Rect(this.g - this.a, this.e - this.b, this.g, this.e);
        this.e = rect.top;
        return rect;
    }

    @Override // com.amazon.aps.iva.ib.a
    public final int f() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.ib.a
    public final int g() {
        return this.e - b();
    }

    @Override // com.amazon.aps.iva.ib.a
    public final int h() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.ib.a
    public final boolean i(View view) {
        ChipsLayoutManager chipsLayoutManager = this.k;
        int decoratedBottom = chipsLayoutManager.getDecoratedBottom(view);
        if (this.h >= chipsLayoutManager.getDecoratedRight(view) && decoratedBottom > this.e) {
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
        this.e = c();
        this.g = this.h;
    }

    @Override // com.amazon.aps.iva.ib.a
    public final void m(View view) {
        int i = this.e;
        int c = c();
        ChipsLayoutManager chipsLayoutManager = this.k;
        if (i != c && this.e - this.b < b()) {
            this.e = c();
            this.g = this.h;
        } else {
            this.e = chipsLayoutManager.getDecoratedTop(view);
        }
        this.h = Math.min(this.h, chipsLayoutManager.getDecoratedLeft(view));
    }

    @Override // com.amazon.aps.iva.ib.a
    public final void n() {
        int b = this.e - b();
        this.e = 0;
        for (Pair pair : this.d) {
            Rect rect = (Rect) pair.first;
            rect.top -= b;
            int i = rect.bottom - b;
            rect.bottom = i;
            this.e = Math.max(this.e, i);
            this.h = Math.min(this.h, rect.left);
            this.g = Math.max(this.g, rect.right);
        }
    }
}
