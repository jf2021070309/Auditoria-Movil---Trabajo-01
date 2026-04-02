package com.amazon.aps.iva.ib;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.ib.a;
import com.amazon.aps.iva.ib.o;
import com.amazon.aps.iva.ib.r;
import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager;
/* compiled from: LTRRowsCreator.java */
/* loaded from: classes.dex */
public final class p implements i {
    public final RecyclerView.p a;

    public p(ChipsLayoutManager chipsLayoutManager) {
        this.a = chipsLayoutManager;
    }

    @Override // com.amazon.aps.iva.ib.i
    public final Rect a(com.amazon.aps.iva.fb.b bVar) {
        int i;
        int i2;
        int i3;
        Rect rect = bVar.c;
        if (rect == null) {
            i = 0;
        } else {
            i = rect.top;
        }
        if (rect == null) {
            i2 = 0;
        } else {
            i2 = rect.left;
        }
        if (rect == null) {
            i3 = 0;
        } else {
            i3 = rect.bottom;
        }
        return new Rect(0, i, i2, i3);
    }

    @Override // com.amazon.aps.iva.ib.i
    public final a.AbstractC0356a b() {
        return new o.a();
    }

    @Override // com.amazon.aps.iva.ib.i
    public final a.AbstractC0356a c() {
        return new r.a();
    }

    @Override // com.amazon.aps.iva.ib.i
    public final Rect d(com.amazon.aps.iva.fb.b bVar) {
        int i;
        int i2;
        int i3;
        Rect rect = bVar.c;
        RecyclerView.p pVar = this.a;
        if (rect == null) {
            i = pVar.getPaddingLeft();
        } else {
            i = rect.left;
        }
        if (rect == null) {
            if (bVar.b.intValue() == 0) {
                i2 = pVar.getPaddingTop();
            } else {
                i2 = 0;
            }
        } else {
            i2 = rect.top;
        }
        if (rect == null) {
            if (bVar.b.intValue() == 0) {
                i3 = pVar.getPaddingBottom();
            } else {
                i3 = 0;
            }
        } else {
            i3 = rect.bottom;
        }
        return new Rect(i, i2, 0, i3);
    }
}
