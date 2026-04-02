package com.amazon.aps.iva.a5;

import com.amazon.aps.iva.o2.m;
import com.amazon.aps.iva.yb0.j;
/* compiled from: TextStyle.kt */
/* loaded from: classes.dex */
public final class e {
    public final com.amazon.aps.iva.b5.a a;
    public final m b;
    public final b c;
    public final c d;

    public e(com.amazon.aps.iva.b5.e eVar, m mVar, b bVar, c cVar, int i) {
        eVar = (i & 1) != 0 ? null : eVar;
        mVar = (i & 2) != 0 ? null : mVar;
        bVar = (i & 4) != 0 ? null : bVar;
        cVar = (i & 16) != 0 ? null : cVar;
        this.a = eVar;
        this.b = mVar;
        this.c = bVar;
        this.d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!j.a(this.a, eVar.a) || !j.a(this.b, eVar.b) || !j.a(this.c, eVar.c)) {
            return false;
        }
        eVar.getClass();
        if (!j.a(null, null)) {
            return false;
        }
        eVar.getClass();
        if (j.a(null, null) && j.a(this.d, eVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        com.amazon.aps.iva.b5.a aVar = this.a;
        if (aVar != null) {
            i = aVar.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        m mVar = this.b;
        if (mVar != null) {
            i2 = mVar.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        b bVar = this.c;
        if (bVar != null) {
            i3 = bVar.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (((((i6 + i3) * 31) + 0) * 31) + 0) * 31;
        c cVar = this.d;
        if (cVar != null) {
            i4 = cVar.hashCode();
        }
        return i7 + i4;
    }

    public final String toString() {
        return "TextStyle(color=" + this.a + ", fontSize=" + this.b + ", fontWeight=" + this.c + ", fontStyle=null, textDecoration=null, textAlign=" + this.d + ')';
    }
}
