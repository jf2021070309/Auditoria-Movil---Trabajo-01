package com.amazon.aps.iva.wx;

import androidx.recyclerview.widget.n;
import com.amazon.aps.iva.xx.g;
import com.amazon.aps.iva.xx.l;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: HomeFeedItemDiffCallback.kt */
/* loaded from: classes2.dex */
public final class b extends n.e<l> {
    public static final b a = new b();

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areContentsTheSame(l lVar, l lVar2) {
        l lVar3 = lVar;
        l lVar4 = lVar2;
        j.f(lVar3, "oldItem");
        j.f(lVar4, "newItem");
        return j.a(lVar3, lVar4);
    }

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areItemsTheSame(l lVar, l lVar2) {
        l lVar3 = lVar;
        l lVar4 = lVar2;
        j.f(lVar3, "oldItem");
        j.f(lVar4, "newItem");
        if (j.a(lVar3.a(), lVar4.a()) && lVar3.getClass() == lVar4.getClass()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.n.e
    public final Object getChangePayload(l lVar, l lVar2) {
        l lVar3 = lVar;
        l lVar4 = lVar2;
        j.f(lVar3, "oldItem");
        j.f(lVar4, "newItem");
        boolean z = true;
        if ((lVar4 instanceof com.amazon.aps.iva.xx.c) && (lVar3 instanceof com.amazon.aps.iva.xx.c)) {
            Panel b = ((com.amazon.aps.iva.xx.c) lVar4).b();
            if (b.getWatchlistStatus() == ((com.amazon.aps.iva.xx.c) lVar3).b().getWatchlistStatus()) {
                z = false;
            }
            if (z) {
                return b;
            }
        } else if ((lVar4 instanceof g) && (lVar3 instanceof g) && (!j.a((g) lVar4, lVar3))) {
            return lVar4;
        }
        return null;
    }
}
