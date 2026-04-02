package com.amazon.aps.iva.ib;

import android.view.View;
import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager;
/* compiled from: RowsStateFactory.java */
/* loaded from: classes.dex */
public final class c0 implements l {
    public final ChipsLayoutManager a;

    public c0(ChipsLayoutManager chipsLayoutManager) {
        this.a = chipsLayoutManager;
    }

    @Override // com.amazon.aps.iva.ib.l
    public final com.amazon.aps.iva.fb.d a() {
        ChipsLayoutManager chipsLayoutManager = this.a;
        return new com.amazon.aps.iva.fb.e(chipsLayoutManager, chipsLayoutManager.a);
    }

    @Override // com.amazon.aps.iva.ib.l
    public final s b(com.amazon.aps.iva.kb.a aVar, com.amazon.aps.iva.lb.f fVar) {
        k qVar;
        ChipsLayoutManager chipsLayoutManager = this.a;
        boolean z = true;
        if (chipsLayoutManager.getLayoutDirection() != 1) {
            z = false;
        }
        if (z) {
            qVar = new y();
        } else {
            qVar = new q();
        }
        ChipsLayoutManager chipsLayoutManager2 = this.a;
        return new s(chipsLayoutManager2, qVar.b(chipsLayoutManager2), new com.amazon.aps.iva.jb.c(chipsLayoutManager.k, chipsLayoutManager.g, qVar.c()), aVar, fVar, new com.amazon.aps.iva.k.w(5), qVar.a().e(chipsLayoutManager.i));
    }

    @Override // com.amazon.aps.iva.ib.l
    public final int c(View view) {
        return this.a.getDecoratedBottom(view);
    }

    @Override // com.amazon.aps.iva.ib.l
    public final int d() {
        return l(((d0) this.a.a).c);
    }

    @Override // com.amazon.aps.iva.ib.l
    public final int e() {
        ChipsLayoutManager chipsLayoutManager = this.a;
        return chipsLayoutManager.getHeight() - chipsLayoutManager.getPaddingBottom();
    }

    @Override // com.amazon.aps.iva.ib.l
    public final int f() {
        return c(((d0) this.a.a).d);
    }

    @Override // com.amazon.aps.iva.ib.l
    public final com.amazon.aps.iva.eb.f g() {
        ChipsLayoutManager chipsLayoutManager = this.a;
        return new com.beloo.widget.chipslayoutmanager.c(chipsLayoutManager, chipsLayoutManager.s, chipsLayoutManager);
    }

    @Override // com.amazon.aps.iva.ib.l
    public final int h(com.amazon.aps.iva.fb.b bVar) {
        return bVar.c.top;
    }

    @Override // com.amazon.aps.iva.ib.l
    public final int i() {
        return this.a.getPaddingTop();
    }

    @Override // com.amazon.aps.iva.ib.l
    public final g j() {
        return new b0(this.a);
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
        return new com.amazon.aps.iva.kb.k();
    }

    @Override // com.amazon.aps.iva.ib.l
    public final int l(View view) {
        return this.a.getDecoratedTop(view);
    }

    public final int m() {
        return this.a.getHeight();
    }

    public final int n() {
        return this.a.getHeightMode();
    }
}
