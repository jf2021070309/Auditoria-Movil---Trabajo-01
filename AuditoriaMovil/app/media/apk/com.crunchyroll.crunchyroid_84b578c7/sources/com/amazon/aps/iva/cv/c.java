package com.amazon.aps.iva.cv;

import java.io.Serializable;
/* compiled from: CrunchylistInput.kt */
/* loaded from: classes2.dex */
public final class c implements Serializable {
    public final com.amazon.aps.iva.nv.e b;
    public final com.amazon.aps.iva.qv.a c;

    public c(com.amazon.aps.iva.nv.e eVar, com.amazon.aps.iva.qv.a aVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "crunchylistItemUiModel");
        this.b = eVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, cVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, cVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.b.hashCode() * 31;
        com.amazon.aps.iva.qv.a aVar = this.c;
        if (aVar == null) {
            hashCode = 0;
        } else {
            hashCode = aVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "CrunchylistInput(crunchylistItemUiModel=" + this.b + ", createCrunchylistSuccessMessage=" + this.c + ")";
    }
}
