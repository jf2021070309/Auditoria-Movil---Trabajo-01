package com.amazon.aps.iva.lb0;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: _ArraysJvm.kt */
/* loaded from: classes4.dex */
public class m extends com.amazon.aps.iva.a60.b {
    public static final <T> List<T> B(T[] tArr) {
        com.amazon.aps.iva.yb0.j.f(tArr, "<this>");
        List<T> asList = Arrays.asList(tArr);
        com.amazon.aps.iva.yb0.j.e(asList, "asList(this)");
        return asList;
    }

    public static final void C(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        com.amazon.aps.iva.yb0.j.f(iArr, "<this>");
        com.amazon.aps.iva.yb0.j.f(iArr2, FirebaseAnalytics.Param.DESTINATION);
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static final void D(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        com.amazon.aps.iva.yb0.j.f(bArr, "<this>");
        com.amazon.aps.iva.yb0.j.f(bArr2, FirebaseAnalytics.Param.DESTINATION);
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static final void E(char[] cArr, char[] cArr2, int i, int i2, int i3) {
        com.amazon.aps.iva.yb0.j.f(cArr, "<this>");
        com.amazon.aps.iva.yb0.j.f(cArr2, FirebaseAnalytics.Param.DESTINATION);
        System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
    }

    public static final void F(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        com.amazon.aps.iva.yb0.j.f(objArr, "<this>");
        com.amazon.aps.iva.yb0.j.f(objArr2, FirebaseAnalytics.Param.DESTINATION);
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static /* synthetic */ void G(int[] iArr, int[] iArr2, int i, int i2) {
        if ((i2 & 8) != 0) {
            i = iArr.length;
        }
        C(0, 0, iArr, iArr2, i);
    }

    public static /* synthetic */ void H(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        F(objArr, i, objArr2, i2, i3);
    }

    public static final Object[] I(int i, int i2, Object[] objArr) {
        com.amazon.aps.iva.yb0.j.f(objArr, "<this>");
        com.amazon.aps.iva.a60.b.m(i2, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
        com.amazon.aps.iva.yb0.j.e(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static final void J(int i, int i2, Object[] objArr) {
        com.amazon.aps.iva.yb0.j.f(objArr, "<this>");
        Arrays.fill(objArr, i, i2, (Object) null);
    }

    public static void K(Object[] objArr, com.amazon.aps.iva.xe0.s sVar) {
        int length = objArr.length;
        com.amazon.aps.iva.yb0.j.f(objArr, "<this>");
        Arrays.fill(objArr, 0, length, sVar);
    }

    public static final ArrayList L(Object[] objArr, Class cls) {
        com.amazon.aps.iva.yb0.j.f(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (cls.isInstance(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
