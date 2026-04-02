package com.amazon.aps.iva.c60;

import androidx.recyclerview.widget.n;
import com.amazon.aps.iva.b60.s;
import com.amazon.aps.iva.yb0.j;
/* compiled from: WatchlistFeedDiffCallback.kt */
/* loaded from: classes2.dex */
public final class e extends n.e<s> {
    public static final e a = new e();

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areContentsTheSame(s sVar, s sVar2) {
        s sVar3 = sVar;
        s sVar4 = sVar2;
        j.f(sVar3, "oldItem");
        j.f(sVar4, "newItem");
        return j.a(sVar3, sVar4);
    }

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areItemsTheSame(s sVar, s sVar2) {
        s sVar3 = sVar;
        s sVar4 = sVar2;
        j.f(sVar3, "oldItem");
        j.f(sVar4, "newItem");
        return j.a(sVar3.getContentId(), sVar4.getContentId());
    }
}
