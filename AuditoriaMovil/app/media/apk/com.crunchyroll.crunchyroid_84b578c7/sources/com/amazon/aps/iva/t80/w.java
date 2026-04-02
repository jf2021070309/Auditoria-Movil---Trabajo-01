package com.amazon.aps.iva.t80;

import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ MaterialDynamicColors b;

    public /* synthetic */ w(MaterialDynamicColors materialDynamicColors, int i) {
        this.a = i;
        this.b = materialDynamicColors;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        DynamicColor lambda$onPrimaryFixed$106;
        int i = this.a;
        MaterialDynamicColors materialDynamicColors = this.b;
        switch (i) {
            case 0:
                return materialDynamicColors.highestSurface((DynamicScheme) obj);
            case 1:
                return materialDynamicColors.highestSurface((DynamicScheme) obj);
            case 2:
                return materialDynamicColors.highestSurface((DynamicScheme) obj);
            case 3:
                return materialDynamicColors.highestSurface((DynamicScheme) obj);
            default:
                lambda$onPrimaryFixed$106 = materialDynamicColors.lambda$onPrimaryFixed$106((DynamicScheme) obj);
                return lambda$onPrimaryFixed$106;
        }
    }
}
