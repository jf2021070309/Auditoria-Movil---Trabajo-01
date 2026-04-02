package com.amazon.aps.iva.q40;

import androidx.recyclerview.widget.n;
import com.amazon.aps.iva.uz.h;
import com.amazon.aps.iva.yb0.j;
/* compiled from: SimilarDiffCallback.kt */
/* loaded from: classes2.dex */
public final class e extends n.e<h> {
    public static final e a = new e();

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areContentsTheSame(h hVar, h hVar2) {
        h hVar3 = hVar;
        h hVar4 = hVar2;
        j.f(hVar3, "oldItem");
        j.f(hVar4, "newItem");
        return j.a(hVar3, hVar4);
    }

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areItemsTheSame(h hVar, h hVar2) {
        h hVar3 = hVar;
        h hVar4 = hVar2;
        j.f(hVar3, "oldItem");
        j.f(hVar4, "newItem");
        if ((hVar3 instanceof h.c) && (hVar4 instanceof h.c)) {
            return j.a(((h.c) hVar3).a().getId(), ((h.c) hVar4).a().getId());
        }
        if ((hVar3 instanceof h.a) && (hVar4 instanceof h.a)) {
            return true;
        }
        return false;
    }
}
