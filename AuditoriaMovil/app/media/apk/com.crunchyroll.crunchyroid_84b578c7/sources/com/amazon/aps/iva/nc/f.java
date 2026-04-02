package com.amazon.aps.iva.nc;

import java.security.MessageDigest;
/* compiled from: DataCacheKey.java */
/* loaded from: classes.dex */
public final class f implements com.amazon.aps.iva.kc.f {
    public final com.amazon.aps.iva.kc.f b;
    public final com.amazon.aps.iva.kc.f c;

    public f(com.amazon.aps.iva.kc.f fVar, com.amazon.aps.iva.kc.f fVar2) {
        this.b = fVar;
        this.c = fVar2;
    }

    @Override // com.amazon.aps.iva.kc.f
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }

    @Override // com.amazon.aps.iva.kc.f
    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!this.b.equals(fVar.b) || !this.c.equals(fVar.c)) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.kc.f
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.b + ", signature=" + this.c + '}';
    }
}
