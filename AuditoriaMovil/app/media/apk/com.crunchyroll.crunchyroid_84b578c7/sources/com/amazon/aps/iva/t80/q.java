package com.amazon.aps.iva.t80;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.function.Function;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ q(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Double lambda$surfaceVariant$39;
        Double lambda$primaryFixed$101;
        TonalPalette tonalPalette;
        Double lambda$surfaceContainerLowest$24;
        Double lambda$onError$98;
        Double lambda$onTertiaryFixed$125;
        Double lambda$controlHighlight$134;
        TonalPalette tonalPalette2;
        TonalPalette tonalPalette3;
        TonalPalette tonalPalette4;
        TonalPalette tonalPalette5;
        Double lambda$neutralPaletteKeyColor$7;
        TonalPalette tonalPalette6;
        TonalPalette tonalPalette7;
        switch (this.a) {
            case 0:
                lambda$primaryFixed$101 = MaterialDynamicColors.lambda$primaryFixed$101((DynamicScheme) obj);
                return lambda$primaryFixed$101;
            case 1:
                tonalPalette = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette;
            case 2:
                lambda$surfaceContainerLowest$24 = MaterialDynamicColors.lambda$surfaceContainerLowest$24((DynamicScheme) obj);
                return lambda$surfaceContainerLowest$24;
            case 3:
                lambda$onError$98 = MaterialDynamicColors.lambda$onError$98((DynamicScheme) obj);
                return lambda$onError$98;
            case 4:
                lambda$onTertiaryFixed$125 = MaterialDynamicColors.lambda$onTertiaryFixed$125((DynamicScheme) obj);
                return lambda$onTertiaryFixed$125;
            case 5:
                lambda$controlHighlight$134 = MaterialDynamicColors.lambda$controlHighlight$134((DynamicScheme) obj);
                return lambda$controlHighlight$134;
            case 6:
                tonalPalette2 = ((DynamicScheme) obj).tertiaryPalette;
                return tonalPalette2;
            case 7:
                tonalPalette3 = ((DynamicScheme) obj).tertiaryPalette;
                return tonalPalette3;
            case 8:
                tonalPalette4 = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette4;
            case 9:
                tonalPalette5 = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette5;
            case 10:
                lambda$neutralPaletteKeyColor$7 = MaterialDynamicColors.lambda$neutralPaletteKeyColor$7((DynamicScheme) obj);
                return lambda$neutralPaletteKeyColor$7;
            case 11:
                tonalPalette6 = ((DynamicScheme) obj).secondaryPalette;
                return tonalPalette6;
            case 12:
                tonalPalette7 = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette7;
            default:
                lambda$surfaceVariant$39 = MaterialDynamicColors.lambda$surfaceVariant$39((DynamicScheme) obj);
                return lambda$surfaceVariant$39;
        }
    }
}
