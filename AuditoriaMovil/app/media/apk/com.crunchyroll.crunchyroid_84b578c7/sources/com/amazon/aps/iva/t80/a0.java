package com.amazon.aps.iva.t80;

import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ MaterialDynamicColors b;

    public /* synthetic */ a0(MaterialDynamicColors materialDynamicColors, int i) {
        this.a = i;
        this.b = materialDynamicColors;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        DynamicColor lambda$onBackground$14;
        DynamicColor lambda$onPrimaryFixedVariant$109;
        int i = this.a;
        MaterialDynamicColors materialDynamicColors = this.b;
        switch (i) {
            case 0:
                return materialDynamicColors.highestSurface((DynamicScheme) obj);
            case 1:
                lambda$onPrimaryFixedVariant$109 = materialDynamicColors.lambda$onPrimaryFixedVariant$109((DynamicScheme) obj);
                return lambda$onPrimaryFixedVariant$109;
            case 2:
                return materialDynamicColors.highestSurface((DynamicScheme) obj);
            case 3:
                return materialDynamicColors.highestSurface((DynamicScheme) obj);
            default:
                lambda$onBackground$14 = materialDynamicColors.lambda$onBackground$14((DynamicScheme) obj);
                return lambda$onBackground$14;
        }
    }
}
