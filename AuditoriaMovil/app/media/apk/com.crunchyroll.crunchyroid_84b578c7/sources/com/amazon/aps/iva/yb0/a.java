package com.amazon.aps.iva.yb0;

import java.io.Serializable;
/* compiled from: AdaptedFunctionReference.java */
/* loaded from: classes4.dex */
public class a implements g, Serializable {
    public final Object b;
    public final Class c;
    public final String d;
    public final String e;
    public final boolean f;
    public final int g;
    public final int h;

    public a(int i, Object obj, Class cls, String str, String str2, int i2) {
        boolean z;
        this.b = obj;
        this.c = cls;
        this.d = str;
        this.e = str2;
        if ((i2 & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f = z;
        this.g = i;
        this.h = i2 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && j.a(this.b, aVar.b) && j.a(this.c, aVar.c) && this.d.equals(aVar.d) && this.e.equals(aVar.e)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.yb0.g
    public final int getArity() {
        return this.g;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        Object obj = this.b;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Class cls = this.c;
        if (cls != null) {
            i3 = cls.hashCode();
        }
        int b = com.amazon.aps.iva.c80.a.b(this.e, com.amazon.aps.iva.c80.a.b(this.d, (i4 + i3) * 31, 31), 31);
        if (this.f) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        return ((((b + i2) * 31) + this.g) * 31) + this.h;
    }

    public final String toString() {
        return e0.a.i(this);
    }
}
