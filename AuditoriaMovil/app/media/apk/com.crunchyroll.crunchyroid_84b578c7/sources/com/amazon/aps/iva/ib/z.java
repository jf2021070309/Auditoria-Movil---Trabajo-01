package com.amazon.aps.iva.ib;

import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import com.amazon.aps.iva.ib.a;
import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager;
import java.util.LinkedList;
/* compiled from: RTLUpLayouter.java */
/* loaded from: classes.dex */
public final class z extends com.amazon.aps.iva.ib.a {

    /* compiled from: RTLUpLayouter.java */
    /* loaded from: classes.dex */
    public static final class a extends a.AbstractC0356a {
        @Override // com.amazon.aps.iva.ib.a.AbstractC0356a
        public final com.amazon.aps.iva.ib.a b() {
            return new z(this);
        }
    }

    public z(a aVar) {
        super(aVar);
    }

    @Override // com.amazon.aps.iva.ib.a
    public final Rect e() {
        int i = this.h + this.a;
        Rect rect = new Rect(this.h, this.e - this.b, i, this.e);
        this.h = rect.right;
        return rect;
    }

    @Override // com.amazon.aps.iva.ib.a
    public final int f() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.ib.a
    public final int g() {
        return d() - this.h;
    }

    @Override // com.amazon.aps.iva.ib.a
    public final int h() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.ib.a
    public final boolean i(View view) {
        ChipsLayoutManager chipsLayoutManager = this.k;
        int decoratedBottom = chipsLayoutManager.getDecoratedBottom(view);
        int decoratedLeft = chipsLayoutManager.getDecoratedLeft(view);
        if (this.f >= decoratedBottom && decoratedLeft < this.h) {
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
        this.h = a();
        this.e = this.f;
    }

    @Override // com.amazon.aps.iva.ib.a
    public final void m(View view) {
        int i = this.h;
        int a2 = a();
        ChipsLayoutManager chipsLayoutManager = this.k;
        if (i != a2 && this.h + this.a > d()) {
            this.h = a();
            this.e = this.f;
        } else {
            this.h = chipsLayoutManager.getDecoratedRight(view);
        }
        this.f = Math.min(this.f, chipsLayoutManager.getDecoratedTop(view));
    }

    @Override // com.amazon.aps.iva.ib.a
    public final void n() {
        int i;
        int i2 = -(d() - this.h);
        LinkedList<Pair> linkedList = this.d;
        if (linkedList.size() > 0) {
            i = Integer.MAX_VALUE;
        } else {
            i = 0;
        }
        this.h = i;
        for (Pair pair : linkedList) {
            Rect rect = (Rect) pair.first;
            int i3 = rect.left - i2;
            rect.left = i3;
            rect.right -= i2;
            this.h = Math.min(this.h, i3);
            this.f = Math.min(this.f, rect.top);
            this.e = Math.max(this.e, rect.bottom);
        }
    }
}
