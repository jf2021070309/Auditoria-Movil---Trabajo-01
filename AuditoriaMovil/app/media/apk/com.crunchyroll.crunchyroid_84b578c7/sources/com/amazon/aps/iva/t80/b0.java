package com.amazon.aps.iva.t80;

import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.ToneDeltaConstraint;
import java.util.function.Function;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ MaterialDynamicColors b;

    public /* synthetic */ b0(MaterialDynamicColors materialDynamicColors, int i) {
        this.a = i;
        this.b = materialDynamicColors;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        DynamicColor lambda$inverseOnSurface$37;
        ToneDeltaConstraint lambda$secondary$74;
        ToneDeltaConstraint lambda$tertiary$85;
        int i = this.a;
        MaterialDynamicColors materialDynamicColors = this.b;
        switch (i) {
            case 0:
                lambda$secondary$74 = materialDynamicColors.lambda$secondary$74((DynamicScheme) obj);
                return lambda$secondary$74;
            case 1:
                lambda$tertiary$85 = materialDynamicColors.lambda$tertiary$85((DynamicScheme) obj);
                return lambda$tertiary$85;
            default:
                lambda$inverseOnSurface$37 = materialDynamicColors.lambda$inverseOnSurface$37((DynamicScheme) obj);
                return lambda$inverseOnSurface$37;
        }
    }
}
