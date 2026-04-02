package com.amazon.aps.iva.ab0;

import java.io.Serializable;
/* compiled from: Phonenumber.java */
/* loaded from: classes4.dex */
public final class h implements Serializable {
    public boolean d;
    public boolean f;
    public boolean h;
    public int b = 0;
    public long c = 0;
    public String e = "";
    public boolean g = false;
    public int i = 1;
    public String j = "";
    public String l = "";
    public a k = a.UNSPECIFIED;

    /* compiled from: Phonenumber.java */
    /* loaded from: classes4.dex */
    public enum a {
        FROM_NUMBER_WITH_PLUS_SIGN,
        FROM_NUMBER_WITH_IDD,
        FROM_NUMBER_WITHOUT_PLUS_SIGN,
        FROM_DEFAULT_COUNTRY,
        UNSPECIFIED
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (hVar != null && (this == hVar || (this.b == hVar.b && this.c == hVar.c && this.e.equals(hVar.e) && this.g == hVar.g && this.i == hVar.i && this.j.equals(hVar.j) && this.k == hVar.k && this.l.equals(hVar.l)))) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int b = com.amazon.aps.iva.c80.a.b(this.e, (Long.valueOf(this.c).hashCode() + ((this.b + 2173) * 53)) * 53, 53);
        if (this.g) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((this.l.hashCode() + ((this.k.hashCode() + com.amazon.aps.iva.c80.a.b(this.j, (((b + i) * 53) + this.i) * 53, 53)) * 53)) * 53) + 1237;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Country Code: ");
        sb.append(this.b);
        sb.append(" National Number: ");
        sb.append(this.c);
        if (this.f && this.g) {
            sb.append(" Leading Zero(s): true");
        }
        if (this.h) {
            sb.append(" Number of leading zeros: ");
            sb.append(this.i);
        }
        if (this.d) {
            sb.append(" Extension: ");
            sb.append(this.e);
        }
        return sb.toString();
    }
}
