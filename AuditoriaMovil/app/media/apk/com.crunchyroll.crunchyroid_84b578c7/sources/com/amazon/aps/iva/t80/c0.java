package com.amazon.aps.iva.t80;

import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.function.Function;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        TonalPalette lambda$fromArgb$0;
        DynamicColor lambda$onSecondaryFixed$116;
        Double lambda$onSecondaryContainer$70;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                lambda$onSecondaryFixed$116 = ((MaterialDynamicColors) obj2).lambda$onSecondaryFixed$116((DynamicScheme) obj);
                return lambda$onSecondaryFixed$116;
            case 1:
                return ((MaterialDynamicColors) obj2).highestSurface((DynamicScheme) obj);
            case 2:
                return ((MaterialDynamicColors) obj2).highestSurface((DynamicScheme) obj);
            case 3:
                return ((MaterialDynamicColors) obj2).highestSurface((DynamicScheme) obj);
            case 4:
                lambda$onSecondaryContainer$70 = ((MaterialDynamicColors) obj2).lambda$onSecondaryContainer$70((DynamicScheme) obj);
                return lambda$onSecondaryContainer$70;
            default:
                lambda$fromArgb$0 = DynamicColor.lambda$fromArgb$0((TonalPalette) obj2, (DynamicScheme) obj);
                return lambda$fromArgb$0;
        }
    }
}
