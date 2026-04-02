package com.amazon.aps.iva.a0;

import com.amazon.aps.iva.ia0.c;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class r {
    public static int a(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int b(boolean z, int i, int i2) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static com.amazon.aps.iva.kb0.j c(int i, com.amazon.aps.iva.r4.v1 v1Var) {
        return com.amazon.aps.iva.aq.k.J(v1Var, new com.amazon.aps.iva.r4.q0(i));
    }

    public static ImmutableMap.Builder d(Class cls, String str, ImmutableMap.Builder builder, String str2) {
        return builder.put(str2, new c.a(cls, str));
    }

    public static void e(ArrayList arrayList, String str, String str2, String str3, String str4) {
        arrayList.add(str);
        arrayList.add(str2);
        arrayList.add(str3);
        arrayList.add(str4);
    }
}
