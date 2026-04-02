package com.amazon.aps.iva.ib;

import android.view.View;
import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager;
/* compiled from: ColumnsStateFactory.java */
/* loaded from: classes.dex */
public final class e implements l {
    public final ChipsLayoutManager a;
    public final com.amazon.aps.iva.da0.a b = new com.amazon.aps.iva.da0.a();

    public e(ChipsLayoutManager chipsLayoutManager) {
        this.a = chipsLayoutManager;
    }

    @Override // com.amazon.aps.iva.ib.l
    public final com.amazon.aps.iva.fb.d a() {
        ChipsLayoutManager chipsLayoutManager = this.a;
        return new com.amazon.aps.iva.fb.c(chipsLayoutManager, chipsLayoutManager.a);
    }

    @Override // com.amazon.aps.iva.ib.l
    public final s b(com.amazon.aps.iva.kb.a aVar, com.amazon.aps.iva.lb.f fVar) {
        ChipsLayoutManager chipsLayoutManager = this.a;
        com.amazon.aps.iva.gb.c cVar = chipsLayoutManager.k;
        return new s(chipsLayoutManager, new d(chipsLayoutManager), new com.amazon.aps.iva.jb.c(cVar, chipsLayoutManager.g, new com.amazon.aps.iva.hb.d(3)), aVar, fVar, new com.amazon.aps.iva.a9.w(2), this.b.e(chipsLayoutManager.i));
    }

    @Override // com.amazon.aps.iva.ib.l
    public final int c(View view) {
        return this.a.getDecoratedRight(view);
    }

    @Override // com.amazon.aps.iva.ib.l
    public final int d() {
        return l(((d0) this.a.a).e);
    }

    @Override // com.amazon.aps.iva.ib.l
    public final int e() {
        ChipsLayoutManager chipsLayoutManager = this.a;
        return chipsLayoutManager.getWidth() - chipsLayoutManager.getPaddingRight();
    }

    @Override // com.amazon.aps.iva.ib.l
    public final int f() {
        return c(((d0) this.a.a).f);
    }

    @Override // com.amazon.aps.iva.ib.l
    public final com.amazon.aps.iva.eb.f g() {
        ChipsLayoutManager chipsLayoutManager = this.a;
        return new com.beloo.widget.chipslayoutmanager.a(chipsLayoutManager, chipsLayoutManager.s, chipsLayoutManager);
    }

    @Override // com.amazon.aps.iva.ib.l
    public final int h(com.amazon.aps.iva.fb.b bVar) {
        return bVar.c.left;
    }

    @Override // com.amazon.aps.iva.ib.l
    public final int i() {
        return this.a.getPaddingLeft();
    }

    @Override // com.amazon.aps.iva.ib.l
    public final g j() {
        return new c(this.a);
    }

    @Override // com.amazon.aps.iva.ib.l
    public final com.amazon.aps.iva.kb.a k() {
        boolean z;
        if (n() == 0 && m() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new com.amazon.aps.iva.kb.j();
        }
        return new com.amazon.aps.iva.kb.b();
    }

    @Override // com.amazon.aps.iva.ib.l
    public final int l(View view) {
        return this.a.getDecoratedLeft(view);
    }

    public final int m() {
        return this.a.getWidth();
    }

    public final int n() {
        return this.a.getWidthMode();
    }
}
