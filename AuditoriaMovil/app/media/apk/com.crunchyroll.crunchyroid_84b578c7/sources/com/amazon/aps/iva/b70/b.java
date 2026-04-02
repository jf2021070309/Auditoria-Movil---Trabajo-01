package com.amazon.aps.iva.b70;

import androidx.recyclerview.widget.RecyclerView;
import com.ellation.widgets.alphabet.AlphabetSelectorView;
/* compiled from: AlphabetSelectorView.kt */
/* loaded from: classes2.dex */
public final class b extends RecyclerView.j {
    public final /* synthetic */ AlphabetSelectorView a;

    public b(AlphabetSelectorView alphabetSelectorView) {
        this.a = alphabetSelectorView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final void onItemRangeInserted(int i, int i2) {
        super.onItemRangeInserted(i, i2);
        this.a.b();
    }
}
