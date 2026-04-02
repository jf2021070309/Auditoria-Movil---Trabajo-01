package com.amazon.aps.iva.nc;

import java.security.MessageDigest;
import java.util.Map;
/* compiled from: EngineKey.java */
/* loaded from: classes.dex */
public final class p implements com.amazon.aps.iva.kc.f {
    public final Object b;
    public final int c;
    public final int d;
    public final Class<?> e;
    public final Class<?> f;
    public final com.amazon.aps.iva.kc.f g;
    public final Map<Class<?>, com.amazon.aps.iva.kc.l<?>> h;
    public final com.amazon.aps.iva.kc.h i;
    public int j;

    public p(Object obj, com.amazon.aps.iva.kc.f fVar, int i, int i2, com.amazon.aps.iva.hd.b bVar, Class cls, Class cls2, com.amazon.aps.iva.kc.h hVar) {
        defpackage.i.l(obj);
        this.b = obj;
        if (fVar != null) {
            this.g = fVar;
            this.c = i;
            this.d = i2;
            defpackage.i.l(bVar);
            this.h = bVar;
            if (cls != null) {
                this.e = cls;
                if (cls2 != null) {
                    this.f = cls2;
                    defpackage.i.l(hVar);
                    this.i = hVar;
                    return;
                }
                throw new NullPointerException("Transcode class must not be null");
            }
            throw new NullPointerException("Resource class must not be null");
        }
        throw new NullPointerException("Signature must not be null");
    }

    @Override // com.amazon.aps.iva.kc.f
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // com.amazon.aps.iva.kc.f
    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (!this.b.equals(pVar.b) || !this.g.equals(pVar.g) || this.d != pVar.d || this.c != pVar.c || !this.h.equals(pVar.h) || !this.e.equals(pVar.e) || !this.f.equals(pVar.f) || !this.i.equals(pVar.i)) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.kc.f
    public final int hashCode() {
        if (this.j == 0) {
            int hashCode = this.b.hashCode();
            this.j = hashCode;
            int hashCode2 = ((((this.g.hashCode() + (hashCode * 31)) * 31) + this.c) * 31) + this.d;
            this.j = hashCode2;
            int hashCode3 = this.h.hashCode() + (hashCode2 * 31);
            this.j = hashCode3;
            int hashCode4 = this.e.hashCode() + (hashCode3 * 31);
            this.j = hashCode4;
            int hashCode5 = this.f.hashCode() + (hashCode4 * 31);
            this.j = hashCode5;
            this.j = this.i.hashCode() + (hashCode5 * 31);
        }
        return this.j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.b + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + this.e + ", transcodeClass=" + this.f + ", signature=" + this.g + ", hashCode=" + this.j + ", transformations=" + this.h + ", options=" + this.i + '}';
    }
}
