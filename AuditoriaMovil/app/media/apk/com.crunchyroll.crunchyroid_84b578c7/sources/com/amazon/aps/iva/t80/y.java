package com.amazon.aps.iva.t80;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.function.Function;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ y(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        TonalPalette tonalPalette;
        Double lambda$textSecondaryAndTertiaryInverse$145;
        Double lambda$onSecondaryFixed$115;
        TonalPalette tonalPalette2;
        TonalPalette tonalPalette3;
        TonalPalette tonalPalette4;
        Double lambda$primary$59;
        Double lambda$textPrimaryInverse$143;
        Double lambda$outlineVariant$46;
        TonalPalette tonalPalette5;
        TonalPalette tonalPalette6;
        Double lambda$controlHighlight$136;
        TonalPalette tonalPalette7;
        TonalPalette tonalPalette8;
        Double lambda$outline$44;
        switch (this.a) {
            case 0:
                lambda$textSecondaryAndTertiaryInverse$145 = MaterialDynamicColors.lambda$textSecondaryAndTertiaryInverse$145((DynamicScheme) obj);
                return lambda$textSecondaryAndTertiaryInverse$145;
            case 1:
                lambda$onSecondaryFixed$115 = MaterialDynamicColors.lambda$onSecondaryFixed$115((DynamicScheme) obj);
                return lambda$onSecondaryFixed$115;
            case 2:
                tonalPalette2 = ((DynamicScheme) obj).secondaryPalette;
                return tonalPalette2;
            case 3:
                tonalPalette3 = ((DynamicScheme) obj).secondaryPalette;
                return tonalPalette3;
            case 4:
                tonalPalette4 = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette4;
            case 5:
                lambda$primary$59 = MaterialDynamicColors.lambda$primary$59((DynamicScheme) obj);
                return lambda$primary$59;
            case 6:
                lambda$textPrimaryInverse$143 = MaterialDynamicColors.lambda$textPrimaryInverse$143((DynamicScheme) obj);
                return lambda$textPrimaryInverse$143;
            case 7:
                lambda$outlineVariant$46 = MaterialDynamicColors.lambda$outlineVariant$46((DynamicScheme) obj);
                return lambda$outlineVariant$46;
            case 8:
                tonalPalette5 = ((DynamicScheme) obj).neutralVariantPalette;
                return tonalPalette5;
            case 9:
                tonalPalette6 = ((DynamicScheme) obj).tertiaryPalette;
                return tonalPalette6;
            case 10:
                lambda$controlHighlight$136 = MaterialDynamicColors.lambda$controlHighlight$136((DynamicScheme) obj);
                return lambda$controlHighlight$136;
            case 11:
                tonalPalette7 = ((DynamicScheme) obj).secondaryPalette;
                return tonalPalette7;
            case 12:
                tonalPalette8 = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette8;
            case 13:
                lambda$outline$44 = MaterialDynamicColors.lambda$outline$44((DynamicScheme) obj);
                return lambda$outline$44;
            default:
                tonalPalette = ((DynamicScheme) obj).secondaryPalette;
                return tonalPalette;
        }
    }
}
