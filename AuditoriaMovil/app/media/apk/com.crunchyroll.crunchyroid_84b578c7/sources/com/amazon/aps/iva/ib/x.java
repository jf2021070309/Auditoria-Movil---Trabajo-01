package com.amazon.aps.iva.ib;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.ib.a;
import com.amazon.aps.iva.ib.w;
import com.amazon.aps.iva.ib.z;
import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager;
/* compiled from: RTLRowsCreator.java */
/* loaded from: classes.dex */
public final class x implements i {
    public final RecyclerView.p a;

    public x(ChipsLayoutManager chipsLayoutManager) {
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
            i = rect.right;
        }
        if (rect == null) {
            i2 = 0;
        } else {
            i2 = rect.top;
        }
        if (rect == null) {
            i3 = 0;
        } else {
            i3 = rect.bottom;
        }
        return new Rect(i, i2, 0, i3);
    }

    @Override // com.amazon.aps.iva.ib.i
    public final a.AbstractC0356a b() {
        return new w.a();
    }

    @Override // com.amazon.aps.iva.ib.i
    public final a.AbstractC0356a c() {
        return new z.a();
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
                i = pVar.getPaddingTop();
            } else {
                i = 0;
            }
        } else {
            i = rect.top;
        }
        if (rect == null) {
            i2 = pVar.getPaddingRight();
        } else {
            i2 = rect.right;
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
        return new Rect(0, i, i2, i3);
    }
}
