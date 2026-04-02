package com.amazon.aps.iva.t80;

import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.ToneDeltaConstraint;
import java.util.function.Function;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Double lambda$fromArgb$1;
        ToneDeltaConstraint lambda$primary$60;
        DynamicColor lambda$onSurfaceVariant$42;
        DynamicColor lambda$onTertiary$88;
        DynamicColor lambda$onSecondaryContainer$71;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((MaterialDynamicColors) obj2).highestSurface((DynamicScheme) obj);
            case 1:
                return ((MaterialDynamicColors) obj2).highestSurface((DynamicScheme) obj);
            case 2:
                lambda$primary$60 = ((MaterialDynamicColors) obj2).lambda$primary$60((DynamicScheme) obj);
                return lambda$primary$60;
            case 3:
                lambda$onSurfaceVariant$42 = ((MaterialDynamicColors) obj2).lambda$onSurfaceVariant$42((DynamicScheme) obj);
                return lambda$onSurfaceVariant$42;
            case 4:
                lambda$onTertiary$88 = ((MaterialDynamicColors) obj2).lambda$onTertiary$88((DynamicScheme) obj);
                return lambda$onTertiary$88;
            case 5:
                return ((MaterialDynamicColors) obj2).highestSurface((DynamicScheme) obj);
            case 6:
                lambda$onSecondaryContainer$71 = ((MaterialDynamicColors) obj2).lambda$onSecondaryContainer$71((DynamicScheme) obj);
                return lambda$onSecondaryContainer$71;
            default:
                lambda$fromArgb$1 = DynamicColor.lambda$fromArgb$1((Hct) obj2, (DynamicScheme) obj);
                return lambda$fromArgb$1;
        }
    }
}
