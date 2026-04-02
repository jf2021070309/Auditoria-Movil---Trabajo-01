package com.amazon.aps.iva.ib;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: ColumnSquare.java */
/* loaded from: classes.dex */
public final class c extends d0 {
    @Override // com.amazon.aps.iva.eb.d
    public final int a() {
        return 0;
    }

    @Override // com.amazon.aps.iva.eb.d
    public final int b() {
        return this.a.getPaddingTop();
    }

    @Override // com.amazon.aps.iva.eb.d
    public final int c() {
        RecyclerView.p pVar = this.a;
        return pVar.getHeight() - pVar.getPaddingBottom();
    }

    @Override // com.amazon.aps.iva.eb.d
    public final int d() {
        return this.a.getWidth();
    }
}
