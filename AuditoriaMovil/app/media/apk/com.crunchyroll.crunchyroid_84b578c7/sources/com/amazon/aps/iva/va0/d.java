package com.amazon.aps.iva.va0;
/* loaded from: classes4.dex */
public final /* synthetic */ class d {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[b.values().length];
        a = iArr;
        iArr[b.START_OBJECT.ordinal()] = 1;
        iArr[b.START_ARRAY.ordinal()] = 2;
        iArr[b.TEXT.ordinal()] = 3;
        iArr[b.NUMBER.ordinal()] = 4;
        iArr[b.TRUE.ordinal()] = 5;
        iArr[b.FALSE.ordinal()] = 6;
        iArr[b.NULL.ordinal()] = 7;
        int[] iArr2 = new int[b.values().length];
        b = iArr2;
        iArr2[b.END_OBJECT.ordinal()] = 1;
        b bVar = b.COMMA;
        iArr2[bVar.ordinal()] = 2;
        int[] iArr3 = new int[b.values().length];
        c = iArr3;
        iArr3[b.END_ARRAY.ordinal()] = 1;
        iArr3[bVar.ordinal()] = 2;
    }
}
