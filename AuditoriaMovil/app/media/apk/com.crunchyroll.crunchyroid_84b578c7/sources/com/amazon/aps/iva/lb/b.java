package com.amazon.aps.iva.lb;

import androidx.recyclerview.widget.RecyclerView;
import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager;
/* compiled from: DisappearingPlacerFactory.java */
/* loaded from: classes.dex */
public final class b implements f {
    public final RecyclerView.p a;

    public b(ChipsLayoutManager chipsLayoutManager) {
        this.a = chipsLayoutManager;
    }

    @Override // com.amazon.aps.iva.lb.f
    public final e a() {
        return new c(this.a);
    }

    @Override // com.amazon.aps.iva.lb.f
    public final e b() {
        return new d(this.a);
    }
}
