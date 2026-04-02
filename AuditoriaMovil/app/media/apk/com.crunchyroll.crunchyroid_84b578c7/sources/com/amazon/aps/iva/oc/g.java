package com.amazon.aps.iva.oc;
/* compiled from: IntegerArrayAdapter.java */
/* loaded from: classes.dex */
public final class g implements a<int[]> {
    @Override // com.amazon.aps.iva.oc.a
    public final int a() {
        return 4;
    }

    @Override // com.amazon.aps.iva.oc.a
    public final int b(int[] iArr) {
        return iArr.length;
    }

    @Override // com.amazon.aps.iva.oc.a
    public final String getTag() {
        return "IntegerArrayPool";
    }

    @Override // com.amazon.aps.iva.oc.a
    public final int[] newArray(int i) {
        return new int[i];
    }
}
