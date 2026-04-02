package com.amazon.aps.iva.nc;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* compiled from: ResourceCacheKey.java */
/* loaded from: classes.dex */
public final class y implements com.amazon.aps.iva.kc.f {
    public static final com.amazon.aps.iva.hd.i<Class<?>, byte[]> j = new com.amazon.aps.iva.hd.i<>(50);
    public final com.amazon.aps.iva.oc.b b;
    public final com.amazon.aps.iva.kc.f c;
    public final com.amazon.aps.iva.kc.f d;
    public final int e;
    public final int f;
    public final Class<?> g;
    public final com.amazon.aps.iva.kc.h h;
    public final com.amazon.aps.iva.kc.l<?> i;

    public y(com.amazon.aps.iva.oc.b bVar, com.amazon.aps.iva.kc.f fVar, com.amazon.aps.iva.kc.f fVar2, int i, int i2, com.amazon.aps.iva.kc.l<?> lVar, Class<?> cls, com.amazon.aps.iva.kc.h hVar) {
        this.b = bVar;
        this.c = fVar;
        this.d = fVar2;
        this.e = i;
        this.f = i2;
        this.i = lVar;
        this.g = cls;
        this.h = hVar;
    }

    @Override // com.amazon.aps.iva.kc.f
    public final void a(MessageDigest messageDigest) {
        com.amazon.aps.iva.oc.b bVar = this.b;
        byte[] bArr = (byte[]) bVar.d();
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f).array();
        this.d.a(messageDigest);
        this.c.a(messageDigest);
        messageDigest.update(bArr);
        com.amazon.aps.iva.kc.l<?> lVar = this.i;
        if (lVar != null) {
            lVar.a(messageDigest);
        }
        this.h.a(messageDigest);
        com.amazon.aps.iva.hd.i<Class<?>, byte[]> iVar = j;
        Class<?> cls = this.g;
        byte[] a = iVar.a(cls);
        if (a == null) {
            a = cls.getName().getBytes(com.amazon.aps.iva.kc.f.a);
            iVar.d(cls, a);
        }
        messageDigest.update(a);
        bVar.put(bArr);
    }

    @Override // com.amazon.aps.iva.kc.f
    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f != yVar.f || this.e != yVar.e || !com.amazon.aps.iva.hd.l.b(this.i, yVar.i) || !this.g.equals(yVar.g) || !this.c.equals(yVar.c) || !this.d.equals(yVar.d) || !this.h.equals(yVar.h)) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.kc.f
    public final int hashCode() {
        int hashCode = ((((this.d.hashCode() + (this.c.hashCode() * 31)) * 31) + this.e) * 31) + this.f;
        com.amazon.aps.iva.kc.l<?> lVar = this.i;
        if (lVar != null) {
            hashCode = (hashCode * 31) + lVar.hashCode();
        }
        int hashCode2 = this.g.hashCode();
        return this.h.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.c + ", signature=" + this.d + ", width=" + this.e + ", height=" + this.f + ", decodedResourceClass=" + this.g + ", transformation='" + this.i + "', options=" + this.h + '}';
    }
}
