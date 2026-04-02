package com.amazon.aps.iva.ib;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.ib.a;
import com.amazon.aps.iva.ib.a0;
import com.amazon.aps.iva.ib.t;
import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager;
/* compiled from: ColumnsCreator.java */
/* loaded from: classes.dex */
public final class d implements i {
    public final RecyclerView.p a;

    public d(ChipsLayoutManager chipsLayoutManager) {
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
            i = rect.left;
        }
        if (rect == null) {
            i2 = 0;
        } else {
            i2 = rect.right;
        }
        if (rect == null) {
            i3 = 0;
        } else {
            i3 = rect.top;
        }
        return new Rect(i, 0, i2, i3);
    }

    @Override // com.amazon.aps.iva.ib.i
    public final a.AbstractC0356a b() {
        return new a0.a();
    }

    @Override // com.amazon.aps.iva.ib.i
    public final a.AbstractC0356a c() {
        return new t.a();
    }

    @Override // com.amazon.aps.iva.ib.i
    public final Rect d(com.amazon.aps.iva.fb.b bVar) {
        int i;
        int i2;
        int i3;
        Rect rect = bVar.c;
        RecyclerView.p pVar = this.a;
        if (rect == null) {
            if (bVar.b.intValue() == 0) {
                i = pVar.getPaddingLeft();
            } else {
                i = 0;
            }
        } else {
            i = rect.left;
        }
        if (rect == null) {
            i2 = pVar.getPaddingTop();
        } else {
            i2 = rect.top;
        }
        if (rect == null) {
            if (bVar.b.intValue() == 0) {
                i3 = pVar.getPaddingRight();
            } else {
                i3 = 0;
            }
        } else {
            i3 = rect.right;
        }
        return new Rect(i, i2, i3, 0);
    }
}
