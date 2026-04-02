package com.amazon.aps.iva.lb0;

import java.util.RandomAccess;
/* compiled from: _ArraysJvm.kt */
/* loaded from: classes4.dex */
public final class l extends c<Integer> implements RandomAccess {
    public final /* synthetic */ int[] b;

    public l(int[] iArr) {
        this.b = iArr;
    }

    @Override // com.amazon.aps.iva.lb0.a
    public final int b() {
        return this.b.length;
    }

    @Override // com.amazon.aps.iva.lb0.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.b;
        com.amazon.aps.iva.yb0.j.f(iArr, "<this>");
        int length = iArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (intValue == iArr[i]) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return Integer.valueOf(this.b[i]);
    }

    @Override // com.amazon.aps.iva.lb0.c, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.b;
        com.amazon.aps.iva.yb0.j.f(iArr, "<this>");
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (intValue == iArr[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.amazon.aps.iva.lb0.a, java.util.Collection
    public final boolean isEmpty() {
        if (this.b.length == 0) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.lb0.c, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.b;
        com.amazon.aps.iva.yb0.j.f(iArr, "<this>");
        int length = iArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i = length - 1;
            if (intValue == iArr[length]) {
                return length;
            }
            if (i < 0) {
                return -1;
            }
            length = i;
        }
    }
}
