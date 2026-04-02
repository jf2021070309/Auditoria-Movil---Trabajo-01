package com.amazon.aps.iva.d0;

import android.os.Parcel;
import com.amazon.aps.iva.u1.e;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b2 {
    public static IObjectWrapper a(Parcel parcel) {
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        parcel.recycle();
        return asInterface;
    }

    public static String b(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static void c(int i, com.amazon.aps.iva.o0.i iVar, int i2, e.a.C0752a c0752a) {
        iVar.n(Integer.valueOf(i));
        iVar.B(Integer.valueOf(i2), c0752a);
    }
}
