package com.amazon.aps.iva.cg;

import com.amazon.aps.iva.cg.u;
/* compiled from: DeepLinkInput.kt */
/* loaded from: classes.dex */
public final class z extends e0 {
    public final com.amazon.aps.iva.dg.a c;
    public final y d;

    public z(com.amazon.aps.iva.dg.a aVar, y yVar) {
        super(u.a.HOME, aVar);
        this.c = aVar;
        this.d = yVar;
    }

    @Override // com.amazon.aps.iva.cg.e0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.c, zVar.c) && this.d == zVar.d) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.cg.e0, com.amazon.aps.iva.cg.u
    public final com.amazon.aps.iva.dg.a getUri() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.cg.e0
    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.c.hashCode() * 31;
        y yVar = this.d;
        if (yVar == null) {
            hashCode = 0;
        } else {
            hashCode = yVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "HomeDeeplinkRawInput(uri=" + this.c + ", carousel=" + this.d + ")";
    }
}
