package com.beloo.widget.chipslayoutmanager;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.ib.d0;
import com.amazon.aps.iva.ib.g;
import com.amazon.aps.iva.ib.l;
/* compiled from: HorizontalScrollingController.java */
/* loaded from: classes.dex */
public final class a extends b {
    public final ChipsLayoutManager e;

    public a(ChipsLayoutManager chipsLayoutManager, l lVar, ChipsLayoutManager chipsLayoutManager2) {
        super(chipsLayoutManager, lVar, chipsLayoutManager2);
        this.e = chipsLayoutManager;
    }

    @Override // com.amazon.aps.iva.eb.f
    public final boolean a() {
        return false;
    }

    @Override // com.amazon.aps.iva.eb.f
    public final RecyclerView.a0 b(Context context, int i, com.amazon.aps.iva.fb.b bVar) {
        return new com.amazon.aps.iva.eb.c(this, context, bVar, i);
    }

    @Override // com.amazon.aps.iva.eb.f
    public final boolean c() {
        g gVar = this.d;
        ((d0) gVar).e();
        ChipsLayoutManager chipsLayoutManager = this.e;
        if (chipsLayoutManager.getChildCount() <= 0) {
            return false;
        }
        int decoratedLeft = chipsLayoutManager.getDecoratedLeft(((d0) gVar).e);
        int decoratedRight = chipsLayoutManager.getDecoratedRight(((d0) gVar).f);
        if (((d0) gVar).g.intValue() == 0 && ((d0) gVar).h.intValue() == chipsLayoutManager.getItemCount() - 1 && decoratedLeft >= chipsLayoutManager.getPaddingLeft() && decoratedRight <= chipsLayoutManager.getWidth() - chipsLayoutManager.getPaddingRight()) {
            return false;
        }
        return chipsLayoutManager.f;
    }

    @Override // com.beloo.widget.chipslayoutmanager.b
    public final void f(int i) {
        this.e.offsetChildrenHorizontal(i);
    }
}
