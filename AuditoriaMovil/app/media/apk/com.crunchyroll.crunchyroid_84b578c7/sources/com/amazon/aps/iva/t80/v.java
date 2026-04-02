package com.amazon.aps.iva.t80;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.function.Function;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ v(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        TonalPalette tonalPalette;
        Double lambda$primaryContainer$54;
        Double lambda$secondaryFixed$111;
        TonalPalette tonalPalette2;
        Double lambda$error$95;
        Double lambda$primaryFixedDim$103;
        TonalPalette tonalPalette3;
        Double lambda$onPrimaryFixed$105;
        TonalPalette tonalPalette4;
        TonalPalette tonalPalette5;
        Double lambda$textSecondaryAndTertiaryInverseDisabled$149;
        Double lambda$controlNormal$133;
        Double lambda$surfaceContainerHigh$30;
        TonalPalette tonalPalette6;
        Double lambda$textPrimaryInverseDisableOnly$147;
        switch (this.a) {
            case 0:
                lambda$primaryContainer$54 = MaterialDynamicColors.lambda$primaryContainer$54((DynamicScheme) obj);
                return lambda$primaryContainer$54;
            case 1:
                lambda$secondaryFixed$111 = MaterialDynamicColors.lambda$secondaryFixed$111((DynamicScheme) obj);
                return lambda$secondaryFixed$111;
            case 2:
                tonalPalette2 = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette2;
            case 3:
                lambda$error$95 = MaterialDynamicColors.lambda$error$95((DynamicScheme) obj);
                return lambda$error$95;
            case 4:
                lambda$primaryFixedDim$103 = MaterialDynamicColors.lambda$primaryFixedDim$103((DynamicScheme) obj);
                return lambda$primaryFixedDim$103;
            case 5:
                tonalPalette3 = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette3;
            case 6:
                lambda$onPrimaryFixed$105 = MaterialDynamicColors.lambda$onPrimaryFixed$105((DynamicScheme) obj);
                return lambda$onPrimaryFixed$105;
            case 7:
                tonalPalette4 = ((DynamicScheme) obj).errorPalette;
                return tonalPalette4;
            case 8:
                tonalPalette5 = ((DynamicScheme) obj).tertiaryPalette;
                return tonalPalette5;
            case 9:
                lambda$textSecondaryAndTertiaryInverseDisabled$149 = MaterialDynamicColors.lambda$textSecondaryAndTertiaryInverseDisabled$149((DynamicScheme) obj);
                return lambda$textSecondaryAndTertiaryInverseDisabled$149;
            case 10:
                lambda$controlNormal$133 = MaterialDynamicColors.lambda$controlNormal$133((DynamicScheme) obj);
                return lambda$controlNormal$133;
            case 11:
                lambda$surfaceContainerHigh$30 = MaterialDynamicColors.lambda$surfaceContainerHigh$30((DynamicScheme) obj);
                return lambda$surfaceContainerHigh$30;
            case 12:
                tonalPalette6 = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette6;
            case 13:
                lambda$textPrimaryInverseDisableOnly$147 = MaterialDynamicColors.lambda$textPrimaryInverseDisableOnly$147((DynamicScheme) obj);
                return lambda$textPrimaryInverseDisableOnly$147;
            default:
                tonalPalette = ((DynamicScheme) obj).neutralVariantPalette;
                return tonalPalette;
        }
    }
}
