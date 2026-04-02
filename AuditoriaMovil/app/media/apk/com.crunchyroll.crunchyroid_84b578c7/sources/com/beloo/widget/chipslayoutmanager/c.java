package com.beloo.widget.chipslayoutmanager;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.eb.h;
import com.amazon.aps.iva.ib.d0;
import com.amazon.aps.iva.ib.g;
import com.amazon.aps.iva.ib.l;
/* compiled from: VerticalScrollingController.java */
/* loaded from: classes.dex */
public final class c extends b {
    public final ChipsLayoutManager e;

    public c(ChipsLayoutManager chipsLayoutManager, l lVar, ChipsLayoutManager chipsLayoutManager2) {
        super(chipsLayoutManager, lVar, chipsLayoutManager2);
        this.e = chipsLayoutManager;
    }

    @Override // com.amazon.aps.iva.eb.f
    public final boolean a() {
        g gVar = this.d;
        ((d0) gVar).e();
        ChipsLayoutManager chipsLayoutManager = this.e;
        if (chipsLayoutManager.getChildCount() <= 0) {
            return false;
        }
        int decoratedTop = chipsLayoutManager.getDecoratedTop(((d0) gVar).c);
        int decoratedBottom = chipsLayoutManager.getDecoratedBottom(((d0) gVar).d);
        if (((d0) gVar).g.intValue() == 0 && ((d0) gVar).h.intValue() == chipsLayoutManager.getItemCount() - 1 && decoratedTop >= chipsLayoutManager.getPaddingTop() && decoratedBottom <= chipsLayoutManager.getHeight() - chipsLayoutManager.getPaddingBottom()) {
            return false;
        }
        return chipsLayoutManager.f;
    }

    @Override // com.amazon.aps.iva.eb.f
    public final RecyclerView.a0 b(Context context, int i, com.amazon.aps.iva.fb.b bVar) {
        return new h(this, context, bVar, i);
    }

    @Override // com.amazon.aps.iva.eb.f
    public final boolean c() {
        return false;
    }

    @Override // com.beloo.widget.chipslayoutmanager.b
    public final void f(int i) {
        this.e.offsetChildrenVertical(i);
    }
}
