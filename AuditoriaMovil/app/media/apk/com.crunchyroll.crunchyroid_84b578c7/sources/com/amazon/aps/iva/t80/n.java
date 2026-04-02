package com.amazon.aps.iva.t80;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.function.Function;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ n(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Double lambda$tertiaryPaletteKeyColor$5;
        TonalPalette tonalPalette;
        TonalPalette tonalPalette2;
        TonalPalette tonalPalette3;
        Double lambda$inversePrimary$62;
        TonalPalette tonalPalette4;
        TonalPalette tonalPalette5;
        Double lambda$surfaceContainer$28;
        TonalPalette tonalPalette6;
        Double lambda$tertiaryFixedDim$123;
        Double lambda$tertiaryFixed$121;
        TonalPalette tonalPalette7;
        TonalPalette tonalPalette8;
        Double lambda$surfaceDim$22;
        TonalPalette tonalPalette9;
        Double lambda$onTertiaryFixedVariant$128;
        switch (this.a) {
            case 0:
                tonalPalette = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette;
            case 1:
                tonalPalette2 = ((DynamicScheme) obj).secondaryPalette;
                return tonalPalette2;
            case 2:
                tonalPalette3 = ((DynamicScheme) obj).errorPalette;
                return tonalPalette3;
            case 3:
                lambda$inversePrimary$62 = MaterialDynamicColors.lambda$inversePrimary$62((DynamicScheme) obj);
                return lambda$inversePrimary$62;
            case 4:
                tonalPalette4 = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette4;
            case 5:
                tonalPalette5 = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette5;
            case 6:
                lambda$surfaceContainer$28 = MaterialDynamicColors.lambda$surfaceContainer$28((DynamicScheme) obj);
                return lambda$surfaceContainer$28;
            case 7:
                tonalPalette6 = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette6;
            case 8:
                lambda$tertiaryFixedDim$123 = MaterialDynamicColors.lambda$tertiaryFixedDim$123((DynamicScheme) obj);
                return lambda$tertiaryFixedDim$123;
            case 9:
                lambda$tertiaryFixed$121 = MaterialDynamicColors.lambda$tertiaryFixed$121((DynamicScheme) obj);
                return lambda$tertiaryFixed$121;
            case 10:
                tonalPalette7 = ((DynamicScheme) obj).neutralVariantPalette;
                return tonalPalette7;
            case 11:
                tonalPalette8 = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette8;
            case 12:
                lambda$surfaceDim$22 = MaterialDynamicColors.lambda$surfaceDim$22((DynamicScheme) obj);
                return lambda$surfaceDim$22;
            case 13:
                tonalPalette9 = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette9;
            case 14:
                lambda$onTertiaryFixedVariant$128 = MaterialDynamicColors.lambda$onTertiaryFixedVariant$128((DynamicScheme) obj);
                return lambda$onTertiaryFixedVariant$128;
            default:
                lambda$tertiaryPaletteKeyColor$5 = MaterialDynamicColors.lambda$tertiaryPaletteKeyColor$5((DynamicScheme) obj);
                return lambda$tertiaryPaletteKeyColor$5;
        }
    }
}
