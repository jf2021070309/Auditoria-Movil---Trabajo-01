package com.amazon.aps.iva.jm;

import com.amazon.aps.iva.lb0.z;
import java.util.List;
/* compiled from: AvatarSelectionPresenter.kt */
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends d>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ i h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar) {
        super(1);
        this.h = iVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(List<? extends d> list) {
        List<? extends d> list2 = list;
        i iVar = this.h;
        i.q6(iVar).v();
        o q6 = i.q6(iVar);
        if (list2 == null) {
            list2 = z.b;
        }
        q6.X8(list2);
        i.q6(iVar).He();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
