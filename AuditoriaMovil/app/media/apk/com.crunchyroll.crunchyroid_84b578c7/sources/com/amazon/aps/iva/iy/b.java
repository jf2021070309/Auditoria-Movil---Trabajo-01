package com.amazon.aps.iva.iy;

import androidx.recyclerview.widget.n;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: SmoothCarouselDiffCallback.kt */
/* loaded from: classes2.dex */
public final class b extends n.e<Panel> {
    public static final b a = new b();

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areContentsTheSame(Panel panel, Panel panel2) {
        Panel panel3 = panel;
        Panel panel4 = panel2;
        j.f(panel3, "oldItem");
        j.f(panel4, "newItem");
        return j.a(panel3, panel4);
    }

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areItemsTheSame(Panel panel, Panel panel2) {
        Panel panel3 = panel;
        Panel panel4 = panel2;
        j.f(panel3, "oldItem");
        j.f(panel4, "newItem");
        return j.a(panel3.getId(), panel4.getId());
    }

    @Override // androidx.recyclerview.widget.n.e
    public final Object getChangePayload(Panel panel, Panel panel2) {
        boolean z;
        Panel panel3 = panel;
        Panel panel4 = panel2;
        j.f(panel3, "oldItem");
        j.f(panel4, "newItem");
        if (panel4.getWatchlistStatus() != panel3.getWatchlistStatus()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        return panel4;
    }
}
