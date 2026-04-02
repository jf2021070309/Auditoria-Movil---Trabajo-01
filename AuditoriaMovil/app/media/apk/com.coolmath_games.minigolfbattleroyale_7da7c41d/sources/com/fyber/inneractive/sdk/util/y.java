package com.fyber.inneractive.sdk.util;
/* loaded from: classes.dex */
final class y {
    private transient a[] a;
    private transient int b;
    private int c;
    private float d;

    /* loaded from: classes.dex */
    private static class a {
        int a;
        int b;
        Object c;
        a d;

        protected a(int i, int i2, Object obj, a aVar) {
            this.a = i;
            this.b = i2;
            this.c = obj;
            this.d = aVar;
        }
    }

    public y() {
        this((byte) 0);
    }

    private y(byte b) {
        this.d = 0.75f;
        this.a = new a[20];
        this.c = 15;
    }

    public final Object a(int i, Object obj) {
        a[] aVarArr = this.a;
        int i2 = i & Integer.MAX_VALUE;
        int length = i2 % aVarArr.length;
        for (a aVar = aVarArr[length]; aVar != null; aVar = aVar.d) {
            if (aVar.a == i) {
                Object obj2 = aVar.c;
                aVar.c = obj;
                return obj2;
            }
        }
        if (this.b >= this.c) {
            a[] aVarArr2 = this.a;
            int length2 = aVarArr2.length;
            int i3 = (length2 * 2) + 1;
            a[] aVarArr3 = new a[i3];
            this.c = (int) (i3 * this.d);
            this.a = aVarArr3;
            while (true) {
                int i4 = length2 - 1;
                if (length2 <= 0) {
                    break;
                }
                a aVar2 = aVarArr2[i4];
                while (aVar2 != null) {
                    a aVar3 = aVar2.d;
                    int i5 = (aVar2.a & Integer.MAX_VALUE) % i3;
                    aVar2.d = aVarArr3[i5];
                    aVarArr3[i5] = aVar2;
                    aVar2 = aVar3;
                }
                length2 = i4;
            }
            aVarArr = this.a;
            length = i2 % aVarArr.length;
        }
        aVarArr[length] = new a(i, i, obj, aVarArr[length]);
        this.b++;
        return null;
    }
}
