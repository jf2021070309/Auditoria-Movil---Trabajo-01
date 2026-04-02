package com.amazon.aps.iva.c60;

import com.amazon.aps.iva.b60.s;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.ui.pagination.PaginationDiffCallback;
/* compiled from: WatchlistPaginationDiffCallback.kt */
/* loaded from: classes2.dex */
public final class f extends PaginationDiffCallback<s> {
    public static final f a = new f();

    @Override // com.ellation.crunchyroll.ui.pagination.PaginationDiffCallback, androidx.recyclerview.widget.n.e
    /* renamed from: a */
    public final boolean areContentsTheSame(s sVar, s sVar2) {
        String str;
        j.f(sVar, "first");
        j.f(sVar2, "second");
        com.amazon.aps.iva.e60.a A = f1.A(sVar);
        String str2 = null;
        if (A != null) {
            str = A.b;
        } else {
            str = null;
        }
        com.amazon.aps.iva.e60.a A2 = f1.A(sVar2);
        if (A2 != null) {
            str2 = A2.b;
        }
        boolean a2 = j.a(str, str2);
        if (super.areContentsTheSame(sVar, sVar2) && a2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.n.e
    public final Object getChangePayload(Object obj, Object obj2) {
        s sVar = (s) obj;
        s sVar2 = (s) obj2;
        j.f(sVar, "oldItem");
        j.f(sVar2, "newItem");
        com.amazon.aps.iva.e60.a A = f1.A(sVar2);
        if (!(!j.a(A, f1.A(sVar)))) {
            return null;
        }
        return A;
    }
}
