package com.amazon.aps.iva.xa0;

import com.amazon.aps.iva.yb0.j;
/* compiled from: ViewState.kt */
/* loaded from: classes4.dex */
public final class i {
    public final h a;
    public final h b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i() {
        /*
            r1 = this;
            com.amazon.aps.iva.xa0.h r0 = com.amazon.aps.iva.xa0.h.e
            r1.<init>(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.xa0.i.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i) {
                i iVar = (i) obj;
                if (!j.a(this.a, iVar.a) || !j.a(this.b, iVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        h hVar = this.a;
        if (hVar != null) {
            i = hVar.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        h hVar2 = this.b;
        if (hVar2 != null) {
            i2 = hVar2.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return "ViewState(paddings=" + this.a + ", margins=" + this.b + ")";
    }

    public i(h hVar, h hVar2) {
        j.f(hVar, "paddings");
        j.f(hVar2, "margins");
        this.a = hVar;
        this.b = hVar2;
    }
}
