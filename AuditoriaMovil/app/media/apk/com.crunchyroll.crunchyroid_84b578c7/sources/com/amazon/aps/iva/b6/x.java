package com.amazon.aps.iva.b6;

import com.amazon.aps.iva.b6.b;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.t5.o;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements o.a {
    public /* synthetic */ x(b.a aVar, long j) {
    }

    public static StringBuilder a(String str, int i, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static void c(int i, com.amazon.aps.iva.v0.a aVar, x2 x2Var, com.amazon.aps.iva.o0.j jVar, int i2, int i3) {
        aVar.invoke(x2Var, jVar, Integer.valueOf(i));
        jVar.s(i2);
        jVar.s(i3);
    }

    public static /* synthetic */ void d(Object obj) {
        if (obj == null) {
            return;
        }
        throw new ClassCastException();
    }

    @Override // com.amazon.aps.iva.t5.o.a
    public void invoke(Object obj) {
        ((b) obj).getClass();
    }
}
