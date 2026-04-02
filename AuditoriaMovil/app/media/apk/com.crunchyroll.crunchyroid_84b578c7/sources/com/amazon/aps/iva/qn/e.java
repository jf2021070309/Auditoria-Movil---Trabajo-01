package com.amazon.aps.iva.qn;

import androidx.recyclerview.widget.n;
import com.amazon.aps.iva.yb0.j;
/* compiled from: FiltersDiffCallback.kt */
/* loaded from: classes2.dex */
public final class e extends n.e<com.amazon.aps.iva.mn.b> {
    public static final e a = new e();

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areContentsTheSame(com.amazon.aps.iva.mn.b bVar, com.amazon.aps.iva.mn.b bVar2) {
        com.amazon.aps.iva.mn.b bVar3 = bVar;
        com.amazon.aps.iva.mn.b bVar4 = bVar2;
        j.f(bVar3, "oldItem");
        j.f(bVar4, "newItem");
        if (j.a(bVar3.getDescription(), bVar4.getDescription()) && j.a(bVar3.getUrlParams(), bVar4.getUrlParams())) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areItemsTheSame(com.amazon.aps.iva.mn.b bVar, com.amazon.aps.iva.mn.b bVar2) {
        com.amazon.aps.iva.mn.b bVar3 = bVar;
        com.amazon.aps.iva.mn.b bVar4 = bVar2;
        j.f(bVar3, "oldItem");
        j.f(bVar4, "newItem");
        if (bVar3.getTitle() == bVar4.getTitle()) {
            return true;
        }
        return false;
    }
}
