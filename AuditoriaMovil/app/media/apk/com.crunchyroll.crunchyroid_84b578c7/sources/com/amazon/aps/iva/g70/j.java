package com.amazon.aps.iva.g70;

import java.io.Serializable;
/* compiled from: MaterialAlertDialogFragment.kt */
/* loaded from: classes2.dex */
public final class j implements Serializable {
    public final com.amazon.aps.iva.fs.b b;
    public final Serializable c;

    public j(com.amazon.aps.iva.fs.b bVar, Serializable serializable) {
        this.b = bVar;
        this.c = serializable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, jVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, jVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        com.amazon.aps.iva.fs.b bVar = this.b;
        if (bVar == null) {
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
        }
        int i2 = hashCode * 31;
        Serializable serializable = this.c;
        if (serializable != null) {
            i = serializable.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "MaterialAlertDialogFragmentResult(analyticsView=" + this.b + ", input=" + this.c + ")";
    }
}
