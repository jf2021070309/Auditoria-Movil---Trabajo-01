package com.amazon.aps.iva.t80;

import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.function.Function;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ h(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        TonalPalette tonalPalette;
        Double lambda$toneMinContrastDefault$16;
        TonalPalette tonalPalette2;
        Double lambda$secondaryFixedDim$113;
        Double lambda$secondaryPaletteKeyColor$3;
        Double lambda$onSurface$34;
        TonalPalette tonalPalette3;
        Double lambda$onSurfaceVariant$41;
        Double lambda$onTertiary$87;
        Double lambda$controlHighlight$137;
        TonalPalette tonalPalette4;
        TonalPalette tonalPalette5;
        Double lambda$secondaryContainer$68;
        Double lambda$surfaceContainerHighest$32;
        TonalPalette tonalPalette6;
        switch (this.a) {
            case 0:
                lambda$toneMinContrastDefault$16 = DynamicColor.lambda$toneMinContrastDefault$16((Double) obj);
                return lambda$toneMinContrastDefault$16;
            case 1:
                tonalPalette2 = ((DynamicScheme) obj).secondaryPalette;
                return tonalPalette2;
            case 2:
                lambda$secondaryFixedDim$113 = MaterialDynamicColors.lambda$secondaryFixedDim$113((DynamicScheme) obj);
                return lambda$secondaryFixedDim$113;
            case 3:
                lambda$secondaryPaletteKeyColor$3 = MaterialDynamicColors.lambda$secondaryPaletteKeyColor$3((DynamicScheme) obj);
                return lambda$secondaryPaletteKeyColor$3;
            case 4:
                lambda$onSurface$34 = MaterialDynamicColors.lambda$onSurface$34((DynamicScheme) obj);
                return lambda$onSurface$34;
            case 5:
                tonalPalette3 = ((DynamicScheme) obj).neutralVariantPalette;
                return tonalPalette3;
            case 6:
                lambda$onSurfaceVariant$41 = MaterialDynamicColors.lambda$onSurfaceVariant$41((DynamicScheme) obj);
                return lambda$onSurfaceVariant$41;
            case 7:
                lambda$onTertiary$87 = MaterialDynamicColors.lambda$onTertiary$87((DynamicScheme) obj);
                return lambda$onTertiary$87;
            case 8:
                lambda$controlHighlight$137 = MaterialDynamicColors.lambda$controlHighlight$137((DynamicScheme) obj);
                return lambda$controlHighlight$137;
            case 9:
                tonalPalette4 = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette4;
            case 10:
                tonalPalette5 = ((DynamicScheme) obj).tertiaryPalette;
                return tonalPalette5;
            case 11:
                lambda$secondaryContainer$68 = MaterialDynamicColors.lambda$secondaryContainer$68((DynamicScheme) obj);
                return lambda$secondaryContainer$68;
            case 12:
                lambda$surfaceContainerHighest$32 = MaterialDynamicColors.lambda$surfaceContainerHighest$32((DynamicScheme) obj);
                return lambda$surfaceContainerHighest$32;
            case 13:
                tonalPalette6 = ((DynamicScheme) obj).errorPalette;
                return tonalPalette6;
            default:
                tonalPalette = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette;
        }
    }
}
