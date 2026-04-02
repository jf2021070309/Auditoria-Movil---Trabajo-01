package com.amazon.aps.iva.ib;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager;
/* compiled from: Square.java */
/* loaded from: classes.dex */
public abstract class d0 implements g {
    public final RecyclerView.p a;
    public final com.amazon.aps.iva.eb.a b;
    public View c;
    public View d;
    public View e;
    public View f;
    public Integer g;
    public Integer h;

    public d0(ChipsLayoutManager chipsLayoutManager) {
        this.a = chipsLayoutManager;
        this.b = new com.amazon.aps.iva.eb.a(chipsLayoutManager);
    }

    public final void e() {
        boolean z;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = -1;
        this.h = -1;
        RecyclerView.p pVar = this.a;
        if (pVar.getChildCount() > 0) {
            View childAt = pVar.getChildAt(0);
            this.c = childAt;
            this.d = childAt;
            this.e = childAt;
            this.f = childAt;
            com.amazon.aps.iva.eb.a aVar = this.b;
            aVar.getClass();
            int i = 0;
            while (true) {
                RecyclerView.p pVar2 = aVar.b;
                if (i < pVar2.getChildCount()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int i2 = i + 1;
                    View childAt2 = pVar2.getChildAt(i);
                    int position = pVar.getPosition(childAt2);
                    if (g(f(childAt2))) {
                        if (pVar.getDecoratedTop(childAt2) < pVar.getDecoratedTop(this.c)) {
                            this.c = childAt2;
                        }
                        if (pVar.getDecoratedBottom(childAt2) > pVar.getDecoratedBottom(this.d)) {
                            this.d = childAt2;
                        }
                        if (pVar.getDecoratedLeft(childAt2) < pVar.getDecoratedLeft(this.e)) {
                            this.e = childAt2;
                        }
                        if (pVar.getDecoratedRight(childAt2) > pVar.getDecoratedRight(this.f)) {
                            this.f = childAt2;
                        }
                        if (this.g.intValue() == -1 || position < this.g.intValue()) {
                            this.g = Integer.valueOf(position);
                        }
                        if (this.h.intValue() == -1 || position > this.h.intValue()) {
                            this.h = Integer.valueOf(position);
                        }
                    }
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    public final Rect f(View view) {
        RecyclerView.p pVar = this.a;
        return new Rect(pVar.getDecoratedLeft(view), pVar.getDecoratedTop(view), pVar.getDecoratedRight(view), pVar.getDecoratedBottom(view));
    }

    public final boolean g(Rect rect) {
        return new Rect(a(), b(), d(), c()).intersect(new Rect(rect));
    }
}
