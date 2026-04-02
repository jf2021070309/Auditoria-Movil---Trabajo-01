package com.amazon.aps.iva.b60;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: WatchlistCarouselView.kt */
/* loaded from: classes2.dex */
public final class b extends RecyclerView.j {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final void onItemRangeInserted(int i, int i2) {
        d presenter;
        presenter = this.a.getPresenter();
        presenter.b5(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final void onItemRangeMoved(int i, int i2, int i3) {
        d presenter;
        presenter = this.a.getPresenter();
        presenter.g4();
    }
}
