package com.amazon.aps.iva.e6;

import android.net.Uri;
import com.amazon.aps.iva.t5.c0;
/* compiled from: RangedUri.java */
/* loaded from: classes.dex */
public final class i {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public i(String str, long j, long j2) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public final i a(i iVar, String str) {
        String c = c0.c(str, this.c);
        if (iVar != null && c.equals(c0.c(str, iVar.c))) {
            long j = this.b;
            long j2 = -1;
            int i = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
            long j3 = iVar.b;
            if (i != 0) {
                long j4 = this.a;
                if (j4 + j == iVar.a) {
                    if (j3 != -1) {
                        j2 = j + j3;
                    }
                    return new i(c, j4, j2);
                }
            }
            if (j3 != -1) {
                long j5 = iVar.a;
                if (j5 + j3 == this.a) {
                    if (i != 0) {
                        j2 = j3 + j;
                    }
                    return new i(c, j5, j2);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final Uri b(String str) {
        return c0.d(str, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.a == iVar.a && this.b == iVar.b && this.c.equals(iVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.c.hashCode() + ((((527 + ((int) this.a)) * 31) + ((int) this.b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.c);
        sb.append(", start=");
        sb.append(this.a);
        sb.append(", length=");
        return com.amazon.aps.iva.c.b.b(sb, this.b, ")");
    }
}
