package com.amazon.aps.iva.t80;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.function.Function;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ x(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Double lambda$controlHighlight$138;
        TonalPalette tonalPalette;
        TonalPalette tonalPalette2;
        Double lambda$primaryPaletteKeyColor$1;
        TonalPalette tonalPalette3;
        TonalPalette tonalPalette4;
        TonalPalette tonalPalette5;
        Double lambda$controlHighlight$135;
        Double lambda$tertiaryContainer$79;
        Double lambda$textHintInverse$151;
        Double lambda$background$11;
        TonalPalette tonalPalette6;
        Double lambda$onSecondaryFixedVariant$118;
        switch (this.a) {
            case 0:
                tonalPalette = ((DynamicScheme) obj).neutralVariantPalette;
                return tonalPalette;
            case 1:
                tonalPalette2 = ((DynamicScheme) obj).secondaryPalette;
                return tonalPalette2;
            case 2:
                lambda$primaryPaletteKeyColor$1 = MaterialDynamicColors.lambda$primaryPaletteKeyColor$1((DynamicScheme) obj);
                return lambda$primaryPaletteKeyColor$1;
            case 3:
                tonalPalette3 = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette3;
            case 4:
                tonalPalette4 = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette4;
            case 5:
                tonalPalette5 = ((DynamicScheme) obj).neutralVariantPalette;
                return tonalPalette5;
            case 6:
                lambda$controlHighlight$135 = MaterialDynamicColors.lambda$controlHighlight$135((DynamicScheme) obj);
                return lambda$controlHighlight$135;
            case 7:
                lambda$tertiaryContainer$79 = MaterialDynamicColors.lambda$tertiaryContainer$79((DynamicScheme) obj);
                return lambda$tertiaryContainer$79;
            case 8:
                lambda$textHintInverse$151 = MaterialDynamicColors.lambda$textHintInverse$151((DynamicScheme) obj);
                return lambda$textHintInverse$151;
            case 9:
                lambda$background$11 = MaterialDynamicColors.lambda$background$11((DynamicScheme) obj);
                return lambda$background$11;
            case 10:
                tonalPalette6 = ((DynamicScheme) obj).neutralVariantPalette;
                return tonalPalette6;
            case 11:
                lambda$onSecondaryFixedVariant$118 = MaterialDynamicColors.lambda$onSecondaryFixedVariant$118((DynamicScheme) obj);
                return lambda$onSecondaryFixedVariant$118;
            default:
                lambda$controlHighlight$138 = MaterialDynamicColors.lambda$controlHighlight$138((DynamicScheme) obj);
                return lambda$controlHighlight$138;
        }
    }
}
