package com.amazon.aps.iva.e6;

import com.amazon.aps.iva.t5.g0;
/* compiled from: Descriptor.java */
/* loaded from: classes.dex */
public final class e {
    public final String a;
    public final String b;
    public final String c;

    public e(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (g0.a(this.a, eVar.a) && g0.a(this.b, eVar.b) && g0.a(this.c, eVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        int i2 = 0;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }
}
