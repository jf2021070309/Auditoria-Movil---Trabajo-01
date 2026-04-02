package com.ellation.crunchyroll.ui.labels;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.c2.a0;
import com.amazon.aps.iva.ff0.b;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: Labels.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LabelsKt$Labels$2 extends l implements p<i, Integer, q> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $addLanguageTag;
    final /* synthetic */ boolean $addMatureLabel;
    final /* synthetic */ boolean $addMaturityRatingLabel;
    final /* synthetic */ boolean $addMaturityRatingSeparator;
    final /* synthetic */ boolean $addTypeOfContentLabel;
    final /* synthetic */ long $languageTagTextColor;
    final /* synthetic */ float $maturityRatingIconSize;
    final /* synthetic */ f $modifier;
    final /* synthetic */ a0 $textStyle;
    final /* synthetic */ LabelUiModel $uiModel;
    final /* synthetic */ boolean $useSeriesOverEpisode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelsKt$Labels$2(LabelUiModel labelUiModel, f fVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, long j, a0 a0Var, float f, int i, int i2, int i3) {
        super(2);
        this.$uiModel = labelUiModel;
        this.$modifier = fVar;
        this.$addMatureLabel = z;
        this.$addMaturityRatingLabel = z2;
        this.$addMaturityRatingSeparator = z3;
        this.$addTypeOfContentLabel = z4;
        this.$useSeriesOverEpisode = z5;
        this.$addLanguageTag = z6;
        this.$languageTagTextColor = j;
        this.$textStyle = a0Var;
        this.$maturityRatingIconSize = f;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public /* bridge */ /* synthetic */ q invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return q.a;
    }

    public final void invoke(i iVar, int i) {
        LabelsKt.m32Labels0OtIIsQ(this.$uiModel, this.$modifier, this.$addMatureLabel, this.$addMaturityRatingLabel, this.$addMaturityRatingSeparator, this.$addTypeOfContentLabel, this.$useSeriesOverEpisode, this.$addLanguageTag, this.$languageTagTextColor, this.$textStyle, this.$maturityRatingIconSize, iVar, b.I(this.$$changed | 1), b.I(this.$$changed1), this.$$default);
    }
}
