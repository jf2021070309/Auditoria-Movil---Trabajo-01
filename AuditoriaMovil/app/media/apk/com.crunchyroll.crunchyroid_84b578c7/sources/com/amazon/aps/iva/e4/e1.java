package com.amazon.aps.iva.e4;
/* compiled from: RawMessageInfo.java */
/* loaded from: classes.dex */
public final class e1 implements o0 {
    public final q0 a;
    public final String b;
    public final Object[] c;
    public final int d;

    public e1(x xVar, String str, Object[] objArr) {
        this.a = xVar;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            } else {
                this.d = i | (charAt2 << i3);
                return;
            }
        }
    }

    public final Object[] a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.e4.o0
    public final q0 getDefaultInstance() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.e4.o0
    public final b1 getSyntax() {
        if ((this.d & 1) == 1) {
            return b1.PROTO2;
        }
        return b1.PROTO3;
    }

    @Override // com.amazon.aps.iva.e4.o0
    public final boolean isMessageSetWireFormat() {
        if ((this.d & 2) == 2) {
            return true;
        }
        return false;
    }
}
