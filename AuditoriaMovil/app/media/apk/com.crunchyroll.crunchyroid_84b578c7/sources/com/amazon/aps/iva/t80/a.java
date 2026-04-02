package com.amazon.aps.iva.t80;

import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import java.util.function.Function;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Double lambda$getTone$9;
        Double lambda$fromPalette$5;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                lambda$fromPalette$5 = DynamicColor.lambda$fromPalette$5((Function) obj2, (DynamicScheme) obj);
                return lambda$fromPalette$5;
            default:
                lambda$getTone$9 = DynamicColor.lambda$getTone$9((DynamicScheme) obj2, (DynamicColor) obj);
                return lambda$getTone$9;
        }
    }
}
