package com.amazon.aps.iva.qj;
/* compiled from: VideoSkipEvents.kt */
/* loaded from: classes.dex */
public final class t {
    public final r a;
    public final r b;
    public final r c;
    public final r d;

    public t() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, tVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, tVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, tVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, tVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = 0;
        r rVar = this.a;
        if (rVar == null) {
            hashCode = 0;
        } else {
            hashCode = rVar.hashCode();
        }
        int i2 = hashCode * 31;
        r rVar2 = this.b;
        if (rVar2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = rVar2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        r rVar3 = this.c;
        if (rVar3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = rVar3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        r rVar4 = this.d;
        if (rVar4 != null) {
            i = rVar4.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        return "VideoSkipEvents(intro=" + this.a + ", credits=" + this.b + ", recap=" + this.c + ", preview=" + this.d + ')';
    }

    public t(r rVar, r rVar2, r rVar3, r rVar4) {
        this.a = rVar;
        this.b = rVar2;
        this.c = rVar3;
        this.d = rVar4;
    }
}
