package com.amazon.aps.iva.t80;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.function.Function;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ d0(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Double lambda$inverseOnSurface$36;
        TonalPalette tonalPalette;
        TonalPalette tonalPalette2;
        Double lambda$surfaceTint$52;
        TonalPalette tonalPalette3;
        TonalPalette tonalPalette4;
        TonalPalette tonalPalette5;
        Double lambda$surfaceContainerLow$26;
        TonalPalette tonalPalette6;
        TonalPalette tonalPalette7;
        Double lambda$controlHighlight$141;
        TonalPalette tonalPalette8;
        Double lambda$surface$16;
        switch (this.a) {
            case 0:
                tonalPalette = ((DynamicScheme) obj).errorPalette;
                return tonalPalette;
            case 1:
                tonalPalette2 = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette2;
            case 2:
                lambda$surfaceTint$52 = MaterialDynamicColors.lambda$surfaceTint$52((DynamicScheme) obj);
                return lambda$surfaceTint$52;
            case 3:
                tonalPalette3 = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette3;
            case 4:
                tonalPalette4 = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette4;
            case 5:
                tonalPalette5 = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette5;
            case 6:
                lambda$surfaceContainerLow$26 = MaterialDynamicColors.lambda$surfaceContainerLow$26((DynamicScheme) obj);
                return lambda$surfaceContainerLow$26;
            case 7:
                tonalPalette6 = ((DynamicScheme) obj).secondaryPalette;
                return tonalPalette6;
            case 8:
                tonalPalette7 = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette7;
            case 9:
                lambda$controlHighlight$141 = MaterialDynamicColors.lambda$controlHighlight$141((DynamicScheme) obj);
                return lambda$controlHighlight$141;
            case 10:
                tonalPalette8 = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette8;
            case 11:
                lambda$surface$16 = MaterialDynamicColors.lambda$surface$16((DynamicScheme) obj);
                return lambda$surface$16;
            default:
                lambda$inverseOnSurface$36 = MaterialDynamicColors.lambda$inverseOnSurface$36((DynamicScheme) obj);
                return lambda$inverseOnSurface$36;
        }
    }
}
