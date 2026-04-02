package com.amazon.aps.iva.e6;

import com.google.common.base.Objects;
/* compiled from: BaseUrl.java */
/* loaded from: classes.dex */
public final class b {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public b(int i, int i2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.c == bVar.c && this.d == bVar.d && Objects.equal(this.a, bVar.a) && Objects.equal(this.b, bVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
    }
}
