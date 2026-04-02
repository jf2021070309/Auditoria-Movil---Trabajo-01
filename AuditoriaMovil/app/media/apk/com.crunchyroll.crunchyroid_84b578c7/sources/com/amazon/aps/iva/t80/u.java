package com.amazon.aps.iva.t80;

import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ MaterialDynamicColors b;

    public /* synthetic */ u(MaterialDynamicColors materialDynamicColors, int i) {
        this.a = i;
        this.b = materialDynamicColors;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        DynamicColor lambda$onPrimaryContainer$57;
        DynamicColor lambda$onTertiaryContainer$82;
        DynamicColor lambda$onSecondaryFixedVariant$119;
        int i = this.a;
        MaterialDynamicColors materialDynamicColors = this.b;
        switch (i) {
            case 0:
                return materialDynamicColors.highestSurface((DynamicScheme) obj);
            case 1:
                lambda$onTertiaryContainer$82 = materialDynamicColors.lambda$onTertiaryContainer$82((DynamicScheme) obj);
                return lambda$onTertiaryContainer$82;
            case 2:
                lambda$onSecondaryFixedVariant$119 = materialDynamicColors.lambda$onSecondaryFixedVariant$119((DynamicScheme) obj);
                return lambda$onSecondaryFixedVariant$119;
            default:
                lambda$onPrimaryContainer$57 = materialDynamicColors.lambda$onPrimaryContainer$57((DynamicScheme) obj);
                return lambda$onPrimaryContainer$57;
        }
    }
}
