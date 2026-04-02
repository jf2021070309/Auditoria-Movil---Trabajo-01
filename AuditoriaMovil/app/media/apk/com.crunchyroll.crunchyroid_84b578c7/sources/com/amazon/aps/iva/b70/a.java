package com.amazon.aps.iva.b70;

import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.yb0.j;
import com.ellation.widgets.alphabet.AlphabetSelectorView;
/* compiled from: AlphabetSelectorView.kt */
/* loaded from: classes2.dex */
public final class a extends RecyclerView.u {
    public final /* synthetic */ AlphabetSelectorView b;

    public a(AlphabetSelectorView alphabetSelectorView) {
        this.b = alphabetSelectorView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        j.f(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        this.b.b();
    }
}
