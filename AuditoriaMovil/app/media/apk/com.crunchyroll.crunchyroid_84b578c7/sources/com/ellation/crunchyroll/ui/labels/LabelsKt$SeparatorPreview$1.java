package com.ellation.crunchyroll.ui.labels;

import com.amazon.aps.iva.ff0.b;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: Labels.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LabelsKt$SeparatorPreview$1 extends l implements p<i, Integer, q> {
    final /* synthetic */ int $$changed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelsKt$SeparatorPreview$1(int i) {
        super(2);
        this.$$changed = i;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public /* bridge */ /* synthetic */ q invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return q.a;
    }

    public final void invoke(i iVar, int i) {
        LabelsKt.SeparatorPreview(iVar, b.I(this.$$changed | 1));
    }
}
