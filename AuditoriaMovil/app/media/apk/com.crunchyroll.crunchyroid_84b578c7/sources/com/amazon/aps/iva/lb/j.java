package com.amazon.aps.iva.lb;

import androidx.recyclerview.widget.RecyclerView;
import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager;
/* compiled from: RealPlacerFactory.java */
/* loaded from: classes.dex */
public final class j implements f {
    public final RecyclerView.p a;

    public j(ChipsLayoutManager chipsLayoutManager) {
        this.a = chipsLayoutManager;
    }

    @Override // com.amazon.aps.iva.lb.f
    public final e a() {
        return new h(this.a);
    }

    @Override // com.amazon.aps.iva.lb.f
    public final e b() {
        return new i(this.a);
    }
}
