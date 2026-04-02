package com.amazon.aps.iva.t80;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.function.Function;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ o(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        TonalPalette tonalPalette;
        Double lambda$onErrorContainer$92;
        Double lambda$inverseSurface$18;
        TonalPalette tonalPalette2;
        Double lambda$controlActivated$131;
        Double lambda$onPrimary$65;
        Double lambda$scrim$50;
        TonalPalette tonalPalette3;
        Double lambda$onSecondary$76;
        Double lambda$shadow$48;
        TonalPalette tonalPalette4;
        TonalPalette tonalPalette5;
        Double lambda$surfaceBright$20;
        TonalPalette tonalPalette6;
        TonalPalette tonalPalette7;
        switch (this.a) {
            case 0:
                lambda$onErrorContainer$92 = MaterialDynamicColors.lambda$onErrorContainer$92((DynamicScheme) obj);
                return lambda$onErrorContainer$92;
            case 1:
                lambda$inverseSurface$18 = MaterialDynamicColors.lambda$inverseSurface$18((DynamicScheme) obj);
                return lambda$inverseSurface$18;
            case 2:
                tonalPalette2 = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette2;
            case 3:
                lambda$controlActivated$131 = MaterialDynamicColors.lambda$controlActivated$131((DynamicScheme) obj);
                return lambda$controlActivated$131;
            case 4:
                lambda$onPrimary$65 = MaterialDynamicColors.lambda$onPrimary$65((DynamicScheme) obj);
                return lambda$onPrimary$65;
            case 5:
                lambda$scrim$50 = MaterialDynamicColors.lambda$scrim$50((DynamicScheme) obj);
                return lambda$scrim$50;
            case 6:
                tonalPalette3 = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette3;
            case 7:
                lambda$onSecondary$76 = MaterialDynamicColors.lambda$onSecondary$76((DynamicScheme) obj);
                return lambda$onSecondary$76;
            case 8:
                lambda$shadow$48 = MaterialDynamicColors.lambda$shadow$48((DynamicScheme) obj);
                return lambda$shadow$48;
            case 9:
                tonalPalette4 = ((DynamicScheme) obj).tertiaryPalette;
                return tonalPalette4;
            case 10:
                tonalPalette5 = ((DynamicScheme) obj).tertiaryPalette;
                return tonalPalette5;
            case 11:
                lambda$surfaceBright$20 = MaterialDynamicColors.lambda$surfaceBright$20((DynamicScheme) obj);
                return lambda$surfaceBright$20;
            case 12:
                tonalPalette6 = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette6;
            case 13:
                tonalPalette7 = ((DynamicScheme) obj).tertiaryPalette;
                return tonalPalette7;
            default:
                tonalPalette = ((DynamicScheme) obj).tertiaryPalette;
                return tonalPalette;
        }
    }
}
