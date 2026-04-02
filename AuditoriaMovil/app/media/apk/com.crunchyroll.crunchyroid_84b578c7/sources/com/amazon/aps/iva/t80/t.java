package com.amazon.aps.iva.t80;

import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        DynamicColor lambda$getTone$11;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((MaterialDynamicColors) obj2).lambda$inversePrimary$63((DynamicScheme) obj);
            case 1:
                return ((MaterialDynamicColors) obj2).highestSurface((DynamicScheme) obj);
            case 2:
                return ((MaterialDynamicColors) obj2).highestSurface((DynamicScheme) obj);
            case 3:
                return ((MaterialDynamicColors) obj2).lambda$onTertiaryFixedVariant$129((DynamicScheme) obj);
            default:
                lambda$getTone$11 = DynamicColor.lambda$getTone$11((DynamicColor) obj2, (DynamicScheme) obj);
                return lambda$getTone$11;
        }
    }
}
