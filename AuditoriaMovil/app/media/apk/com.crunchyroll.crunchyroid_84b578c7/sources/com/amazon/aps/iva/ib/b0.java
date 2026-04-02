package com.amazon.aps.iva.ib;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: RowSquare.java */
/* loaded from: classes.dex */
public final class b0 extends d0 {
    @Override // com.amazon.aps.iva.eb.d
    public final int a() {
        return this.a.getPaddingLeft();
    }

    @Override // com.amazon.aps.iva.eb.d
    public final int b() {
        return 0;
    }

    @Override // com.amazon.aps.iva.eb.d
    public final int c() {
        return this.a.getHeight();
    }

    @Override // com.amazon.aps.iva.eb.d
    public final int d() {
        RecyclerView.p pVar = this.a;
        return pVar.getWidth() - pVar.getPaddingRight();
    }
}
