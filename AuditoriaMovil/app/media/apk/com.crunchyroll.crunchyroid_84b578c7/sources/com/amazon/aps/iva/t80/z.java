package com.amazon.aps.iva.t80;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.function.Function;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ z(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Double lambda$onBackground$13;
        Double lambda$secondary$73;
        Double lambda$controlHighlight$140;
        TonalPalette tonalPalette;
        Double lambda$neutralVariantPaletteKeyColor$9;
        TonalPalette tonalPalette2;
        Double lambda$controlHighlight$139;
        Double lambda$onPrimaryFixedVariant$108;
        Double lambda$tertiary$84;
        TonalPalette tonalPalette3;
        TonalPalette tonalPalette4;
        Double lambda$errorContainer$90;
        switch (this.a) {
            case 0:
                lambda$secondary$73 = MaterialDynamicColors.lambda$secondary$73((DynamicScheme) obj);
                return lambda$secondary$73;
            case 1:
                lambda$controlHighlight$140 = MaterialDynamicColors.lambda$controlHighlight$140((DynamicScheme) obj);
                return lambda$controlHighlight$140;
            case 2:
                tonalPalette = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette;
            case 3:
                lambda$neutralVariantPaletteKeyColor$9 = MaterialDynamicColors.lambda$neutralVariantPaletteKeyColor$9((DynamicScheme) obj);
                return lambda$neutralVariantPaletteKeyColor$9;
            case 4:
                tonalPalette2 = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette2;
            case 5:
                lambda$controlHighlight$139 = MaterialDynamicColors.lambda$controlHighlight$139((DynamicScheme) obj);
                return lambda$controlHighlight$139;
            case 6:
                lambda$onPrimaryFixedVariant$108 = MaterialDynamicColors.lambda$onPrimaryFixedVariant$108((DynamicScheme) obj);
                return lambda$onPrimaryFixedVariant$108;
            case 7:
                lambda$tertiary$84 = MaterialDynamicColors.lambda$tertiary$84((DynamicScheme) obj);
                return lambda$tertiary$84;
            case 8:
                tonalPalette3 = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette3;
            case 9:
                tonalPalette4 = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette4;
            case 10:
                lambda$errorContainer$90 = MaterialDynamicColors.lambda$errorContainer$90((DynamicScheme) obj);
                return lambda$errorContainer$90;
            default:
                lambda$onBackground$13 = MaterialDynamicColors.lambda$onBackground$13((DynamicScheme) obj);
                return lambda$onBackground$13;
        }
    }
}
