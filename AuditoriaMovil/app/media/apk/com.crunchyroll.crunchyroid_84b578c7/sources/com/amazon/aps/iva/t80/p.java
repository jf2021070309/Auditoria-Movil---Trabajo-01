package com.amazon.aps.iva.t80;

import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return MaterialDynamicColors.d((MaterialDynamicColors) obj2, (DynamicScheme) obj);
            case 1:
                return MaterialDynamicColors.O0((MaterialDynamicColors) obj2, (DynamicScheme) obj);
            case 2:
                return MaterialDynamicColors.t((MaterialDynamicColors) obj2, (DynamicScheme) obj);
            default:
                return DynamicColor.a((Function) obj2, (DynamicScheme) obj);
        }
    }
}
