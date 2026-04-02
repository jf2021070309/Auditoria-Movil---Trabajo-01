package com.beloo.widget.chipslayoutmanager;

import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.eb.f;
import com.amazon.aps.iva.ib.d0;
import com.amazon.aps.iva.ib.g;
import com.amazon.aps.iva.ib.l;
import com.amazon.aps.iva.ib.s;
import com.amazon.aps.iva.lb.j;
/* compiled from: ScrollingController.java */
/* loaded from: classes.dex */
public abstract class b implements f {
    public final ChipsLayoutManager a;
    public final a b;
    public final l c;
    public final g d;

    /* compiled from: ScrollingController.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public b(ChipsLayoutManager chipsLayoutManager, l lVar, ChipsLayoutManager chipsLayoutManager2) {
        this.a = chipsLayoutManager;
        this.b = chipsLayoutManager2;
        this.c = lVar;
        this.d = chipsLayoutManager.a;
    }

    public final int d(RecyclerView.b0 b0Var) {
        int intValue;
        ChipsLayoutManager chipsLayoutManager = this.a;
        if (chipsLayoutManager.getChildCount() != 0 && b0Var.b() != 0) {
            int i = -1;
            if (chipsLayoutManager.getChildCount() == 0) {
                intValue = -1;
            } else {
                intValue = ((d0) chipsLayoutManager.a).g.intValue();
            }
            if (chipsLayoutManager.getChildCount() != 0) {
                i = ((d0) chipsLayoutManager.a).h.intValue();
            }
            return Math.abs(i - intValue) + 1;
        }
        return 0;
    }

    public final int e(RecyclerView.b0 b0Var) {
        int intValue;
        ChipsLayoutManager chipsLayoutManager = this.a;
        if (chipsLayoutManager.getChildCount() == 0 || b0Var.b() == 0) {
            return 0;
        }
        if (chipsLayoutManager.getChildCount() == 0) {
            intValue = -1;
        } else {
            intValue = ((d0) chipsLayoutManager.a).g.intValue();
        }
        if (chipsLayoutManager.getChildCount() != 0) {
            ((d0) chipsLayoutManager.a).h.intValue();
        }
        return Math.max(0, intValue);
    }

    public abstract void f(int i);

    public final int g(int i, RecyclerView.w wVar) {
        ChipsLayoutManager chipsLayoutManager;
        int position;
        ChipsLayoutManager chipsLayoutManager2 = this.a;
        if (chipsLayoutManager2.getChildCount() != 0) {
            l lVar = this.c;
            if (i < 0) {
                com.amazon.aps.iva.fb.b bVar = chipsLayoutManager2.r;
                if (bVar.c != null) {
                    if (bVar.b.intValue() == 0) {
                        int h = lVar.h(bVar) - lVar.i();
                        if (h >= 0) {
                            i = h;
                        } else {
                            i = Math.max(h, i);
                        }
                    }
                }
            } else if (i > 0) {
                if (chipsLayoutManager2.getPosition(chipsLayoutManager2.getChildAt(chipsLayoutManager2.getChildCount() - 1)) >= chipsLayoutManager2.getItemCount() - 1) {
                    i = Math.min(lVar.f() - lVar.e(), i);
                }
            }
            f(-i);
            chipsLayoutManager = (ChipsLayoutManager) this.b;
            if (chipsLayoutManager.l != null && chipsLayoutManager.getChildCount() > 0 && ((position = chipsLayoutManager.getPosition(chipsLayoutManager.getChildAt(0))) < chipsLayoutManager.l.intValue() || (chipsLayoutManager.l.intValue() == 0 && chipsLayoutManager.l.intValue() == position))) {
                com.amazon.aps.iva.nb.b.a();
                com.amazon.aps.iva.nb.b.a();
                chipsLayoutManager.k.b(position);
                chipsLayoutManager.l = null;
                chipsLayoutManager.postOnAnimation(new com.amazon.aps.iva.mb.a(chipsLayoutManager));
            }
            chipsLayoutManager.r = chipsLayoutManager.u.a();
            com.amazon.aps.iva.kb.a k = chipsLayoutManager.s.k();
            k.b = 1;
            s b = chipsLayoutManager.s.b(k, new j(chipsLayoutManager.w.a));
            chipsLayoutManager.a(wVar, b.a(chipsLayoutManager.r), b.b(chipsLayoutManager.r));
            return i;
        }
        i = 0;
        f(-i);
        chipsLayoutManager = (ChipsLayoutManager) this.b;
        if (chipsLayoutManager.l != null) {
            com.amazon.aps.iva.nb.b.a();
            com.amazon.aps.iva.nb.b.a();
            chipsLayoutManager.k.b(position);
            chipsLayoutManager.l = null;
            chipsLayoutManager.postOnAnimation(new com.amazon.aps.iva.mb.a(chipsLayoutManager));
        }
        chipsLayoutManager.r = chipsLayoutManager.u.a();
        com.amazon.aps.iva.kb.a k2 = chipsLayoutManager.s.k();
        k2.b = 1;
        s b2 = chipsLayoutManager.s.b(k2, new j(chipsLayoutManager.w.a));
        chipsLayoutManager.a(wVar, b2.a(chipsLayoutManager.r), b2.b(chipsLayoutManager.r));
        return i;
    }
}
