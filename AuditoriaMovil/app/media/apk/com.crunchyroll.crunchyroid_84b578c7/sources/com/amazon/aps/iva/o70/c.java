package com.amazon.aps.iva.o70;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
/* compiled from: SnapRecyclerViewScrollListener.kt */
/* loaded from: classes2.dex */
public final class c extends RecyclerView.u implements b {
    public final RecyclerView b;
    public final b0 c;
    public final d d;
    public final d e;

    public c(RecyclerView recyclerView, b0 b0Var, boolean z) {
        j.f(recyclerView, "recyclerView");
        this.b = recyclerView;
        this.c = b0Var;
        d dVar = new d(this, z);
        this.d = dVar;
        this.e = dVar;
    }

    @Override // com.amazon.aps.iva.o70.b
    public final Integer Of() {
        RecyclerView.p layoutManager = this.b.getLayoutManager();
        j.d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        View findSnapView = this.c.findSnapView(linearLayoutManager);
        if (findSnapView != null) {
            return Integer.valueOf(linearLayoutManager.getPosition(findSnapView));
        }
        return null;
    }

    @Override // com.amazon.aps.iva.o70.b
    public final int X9() {
        return this.b.computeHorizontalScrollOffset();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int i2;
        j.f(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        d dVar = this.d;
        if (i == 0) {
            Integer Of = dVar.getView().Of();
            if (Of != null) {
                i2 = Of.intValue();
            } else {
                i2 = 0;
            }
            dVar.c = i2;
            l<? super Integer, q> lVar = dVar.d;
            if (lVar != null) {
                lVar.invoke(Integer.valueOf(i2));
                return;
            }
            return;
        }
        dVar.getClass();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3;
        j.f(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        d dVar = this.d;
        float abs = Math.abs((dVar.q6() / dVar.getView().sa()) * 100);
        com.amazon.aps.iva.xb0.q<? super Float, ? super Integer, ? super Integer, q> qVar = dVar.e;
        int i4 = 0;
        if (qVar != null) {
            Float valueOf = Float.valueOf(abs);
            Integer valueOf2 = Integer.valueOf(dVar.c);
            int i5 = 1;
            if (dVar.q6() > 0) {
                i3 = 1;
            } else if (dVar.q6() < 0) {
                i3 = -1;
            } else {
                i3 = 0;
            }
            boolean z = dVar.b;
            if (z) {
                i3 *= -1;
            }
            int r6 = (dVar.r6() * i3) + dVar.c;
            if (r6 < 0 && z) {
                int i6 = dVar.c;
                int r62 = dVar.r6();
                if (dVar.q6() <= 0) {
                    if (dVar.q6() < 0) {
                        i5 = -1;
                    } else {
                        i5 = 0;
                    }
                }
                r6 = (i5 * r62) + i6;
            }
            qVar.invoke(valueOf, valueOf2, Integer.valueOf(r6));
        }
        if (abs >= 100.0f) {
            Integer Of = dVar.getView().Of();
            if (Of != null) {
                i4 = Of.intValue();
            }
            dVar.c = i4;
        }
    }

    @Override // com.amazon.aps.iva.o70.b
    public final int sa() {
        return this.b.computeHorizontalScrollExtent();
    }
}
