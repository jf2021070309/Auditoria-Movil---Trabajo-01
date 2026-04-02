package com.amazon.aps.iva.mb;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: LayoutManagerUtil.java */
/* loaded from: classes.dex */
public final class a implements Runnable {
    public final /* synthetic */ RecyclerView.p b;

    public a(RecyclerView.p pVar) {
        this.b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView.p pVar = this.b;
        pVar.requestLayout();
        pVar.requestSimpleAnimationsInNextLayout();
    }
}
