package com.amazon.aps.iva.q30;

import java.util.List;
/* compiled from: RecentSearchesPresenter.kt */
/* loaded from: classes2.dex */
public final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends b>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ r h;
    public final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(r rVar, boolean z) {
        super(1);
        this.h = rVar;
        this.i = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(List<? extends b> list) {
        List<? extends b> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, "recentSearches");
        boolean isEmpty = list2.isEmpty();
        boolean z = this.i;
        r rVar = this.h;
        if (isEmpty) {
            rVar.q6(z);
        } else {
            rVar.getView().setRecentSearches(list2);
            if (z) {
                if (!rVar.getView().isVisible()) {
                    rVar.getView().hd();
                }
            } else {
                rVar.getView().Pg();
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
