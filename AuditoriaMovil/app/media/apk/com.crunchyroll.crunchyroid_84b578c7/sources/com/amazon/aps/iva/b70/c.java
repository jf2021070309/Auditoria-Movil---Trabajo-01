package com.amazon.aps.iva.b70;

import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.yb0.l;
import com.ellation.widgets.alphabet.AlphabetSelectorView;
/* compiled from: AlphabetSelectorView.kt */
/* loaded from: classes2.dex */
public final class c extends l implements com.amazon.aps.iva.xb0.a<RecyclerView.j> {
    public final /* synthetic */ AlphabetSelectorView h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AlphabetSelectorView alphabetSelectorView) {
        super(0);
        this.h = alphabetSelectorView;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final RecyclerView.j invoke() {
        int i = AlphabetSelectorView.F;
        AlphabetSelectorView alphabetSelectorView = this.h;
        alphabetSelectorView.getClass();
        return new b(alphabetSelectorView);
    }
}
