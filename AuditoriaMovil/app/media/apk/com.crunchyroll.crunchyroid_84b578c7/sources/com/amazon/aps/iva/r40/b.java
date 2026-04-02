package com.amazon.aps.iva.r40;

import com.amazon.aps.iva.c2.a0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.n2.h;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import com.ellation.crunchyroll.ui.labels.LabelsKt;
/* compiled from: ShowSummaryView.kt */
/* loaded from: classes2.dex */
public final class b extends l implements p<i, Integer, q> {
    public final /* synthetic */ a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar) {
        super(2);
        this.h = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(i iVar, Integer num) {
        i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            LabelsKt.m32Labels0OtIIsQ(this.h.c, null, true, true, false, true, false, true, com.amazon.aps.iva.ao.a.i, a0.a(16744447, 0L, 0L, 0L, null, com.amazon.aps.iva.ao.b.l, null, null, new h(3)), 0.0f, iVar2, 12782976 | LabelUiModel.$stable, 0, 1106);
        }
        return q.a;
    }
}
