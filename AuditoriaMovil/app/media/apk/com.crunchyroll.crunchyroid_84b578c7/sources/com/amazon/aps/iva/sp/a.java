package com.amazon.aps.iva.sp;

import com.amazon.aps.iva.yb0.j;
import java.util.Arrays;
/* compiled from: Batch.kt */
/* loaded from: classes2.dex */
public final class a {
    public final String a;
    public final byte[] b;

    public a(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.a, aVar.a) && j.a(this.b, aVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return com.amazon.aps.iva.ab.f.a(new StringBuilder("Batch(id="), this.a, ", data=", Arrays.toString(this.b), ")");
    }
}
