package com.amazon.aps.iva.t80;

import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.ToneDeltaConstraint;
import java.util.function.Function;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Double lambda$toneMinContrastDefault$14;
        ToneDeltaConstraint lambda$error$96;
        DynamicColor lambda$onError$99;
        DynamicColor lambda$onTertiaryFixed$126;
        Double lambda$onTertiaryContainer$81;
        Double lambda$onPrimaryContainer$56;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((MaterialDynamicColors) obj2).highestSurface((DynamicScheme) obj);
            case 1:
                lambda$error$96 = ((MaterialDynamicColors) obj2).lambda$error$96((DynamicScheme) obj);
                return lambda$error$96;
            case 2:
                lambda$onError$99 = ((MaterialDynamicColors) obj2).lambda$onError$99((DynamicScheme) obj);
                return lambda$onError$99;
            case 3:
                lambda$onTertiaryFixed$126 = ((MaterialDynamicColors) obj2).lambda$onTertiaryFixed$126((DynamicScheme) obj);
                return lambda$onTertiaryFixed$126;
            case 4:
                lambda$onTertiaryContainer$81 = ((MaterialDynamicColors) obj2).lambda$onTertiaryContainer$81((DynamicScheme) obj);
                return lambda$onTertiaryContainer$81;
            case 5:
                lambda$onPrimaryContainer$56 = ((MaterialDynamicColors) obj2).lambda$onPrimaryContainer$56((DynamicScheme) obj);
                return lambda$onPrimaryContainer$56;
            default:
                lambda$toneMinContrastDefault$14 = DynamicColor.lambda$toneMinContrastDefault$14((DynamicScheme) obj2, (DynamicColor) obj);
                return lambda$toneMinContrastDefault$14;
        }
    }
}
