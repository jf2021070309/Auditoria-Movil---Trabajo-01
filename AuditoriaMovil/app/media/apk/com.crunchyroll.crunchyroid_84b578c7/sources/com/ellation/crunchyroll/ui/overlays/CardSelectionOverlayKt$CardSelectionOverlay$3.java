package com.ellation.crunchyroll.ui.overlays;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.ff0.b;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: CardSelectionOverlay.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CardSelectionOverlayKt$CardSelectionOverlay$3 extends l implements p<i, Integer, q> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ String $contentDescription;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ f $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardSelectionOverlayKt$CardSelectionOverlay$3(boolean z, String str, f fVar, int i, int i2) {
        super(2);
        this.$isSelected = z;
        this.$contentDescription = str;
        this.$modifier = fVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public /* bridge */ /* synthetic */ q invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return q.a;
    }

    public final void invoke(i iVar, int i) {
        CardSelectionOverlayKt.CardSelectionOverlay(this.$isSelected, this.$contentDescription, this.$modifier, iVar, b.I(this.$$changed | 1), this.$$default);
    }
}
