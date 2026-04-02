package com.amazon.aps.iva.b8;

import android.os.Parcel;
import com.amazon.aps.iva.b8.h;
import com.amazon.aps.iva.o0.x2;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i {
    public static int a(long j, int i, int i2) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static h b(Parcel parcel, String str) {
        parcel.enforceInterface(str);
        return h.a.o0(parcel.readStrongBinder());
    }

    public static void c(int i, com.amazon.aps.iva.v0.a aVar, x2 x2Var, com.amazon.aps.iva.o0.i iVar, int i2) {
        aVar.invoke(x2Var, iVar, Integer.valueOf(i));
        iVar.s(i2);
    }

    public static void d(Class cls, StringBuilder sb, String str) {
        sb.append(cls.getName());
        sb.append(str);
    }
}
