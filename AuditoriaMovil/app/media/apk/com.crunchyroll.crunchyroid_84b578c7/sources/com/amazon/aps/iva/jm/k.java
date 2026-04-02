package com.amazon.aps.iva.jm;

import java.util.List;
/* compiled from: AvatarSelectionPresenter.kt */
/* loaded from: classes2.dex */
public final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends d>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ i h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar) {
        super(1);
        this.h = iVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(List<? extends d> list) {
        List<? extends d> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, "avatars");
        i iVar = this.h;
        i.q6(iVar).H();
        i.q6(iVar).X8(list2);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
