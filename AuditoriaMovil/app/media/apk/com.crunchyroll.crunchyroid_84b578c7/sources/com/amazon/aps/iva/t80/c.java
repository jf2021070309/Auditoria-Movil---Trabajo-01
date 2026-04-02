package com.amazon.aps.iva.t80;

import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.TemperatureCache;
import java.util.function.Function;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Double lambda$toneMaxContrastDefault$17;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                lambda$toneMaxContrastDefault$17 = DynamicColor.lambda$toneMaxContrastDefault$17((DynamicScheme) obj2, (DynamicColor) obj);
                return lambda$toneMaxContrastDefault$17;
            default:
                return TemperatureCache.a((TemperatureCache) obj2, (Hct) obj);
        }
    }
}
