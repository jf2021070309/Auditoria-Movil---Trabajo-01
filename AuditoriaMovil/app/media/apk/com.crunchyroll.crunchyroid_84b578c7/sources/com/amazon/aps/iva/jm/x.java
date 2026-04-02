package com.amazon.aps.iva.jm;

import androidx.recyclerview.widget.n;
import com.amazon.aps.iva.jm.r;
/* compiled from: AvatarsAdapter.kt */
/* loaded from: classes2.dex */
public final class x extends n.e<r> {
    public static final x a = new x();

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areContentsTheSame(r rVar, r rVar2) {
        r rVar3 = rVar;
        r rVar4 = rVar2;
        com.amazon.aps.iva.yb0.j.f(rVar3, "oldItem");
        com.amazon.aps.iva.yb0.j.f(rVar4, "newItem");
        return com.amazon.aps.iva.yb0.j.a(rVar3, rVar4);
    }

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areItemsTheSame(r rVar, r rVar2) {
        r rVar3 = rVar;
        r rVar4 = rVar2;
        com.amazon.aps.iva.yb0.j.f(rVar3, "oldItem");
        com.amazon.aps.iva.yb0.j.f(rVar4, "newItem");
        return com.amazon.aps.iva.yb0.j.a(rVar3.a(), rVar4.a());
    }

    @Override // androidx.recyclerview.widget.n.e
    public final Object getChangePayload(r rVar, r rVar2) {
        r rVar3 = rVar;
        r rVar4 = rVar2;
        com.amazon.aps.iva.yb0.j.f(rVar3, "oldItem");
        com.amazon.aps.iva.yb0.j.f(rVar4, "newItem");
        if ((rVar3 instanceof r.b) && (rVar4 instanceof r.b)) {
            boolean z = ((r.b) rVar3).d;
            boolean z2 = ((r.b) rVar4).d;
            if (z2 != z) {
                return Boolean.valueOf(z2);
            }
        }
        return null;
    }
}
