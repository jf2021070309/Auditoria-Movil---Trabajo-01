package com.amazon.aps.iva.gd;

import com.amazon.aps.iva.kc.f;
import java.security.MessageDigest;
/* compiled from: ObjectKey.java */
/* loaded from: classes.dex */
public final class b implements f {
    public final Object b;

    public b(Object obj) {
        i.l(obj);
        this.b = obj;
    }

    @Override // com.amazon.aps.iva.kc.f
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(f.a));
    }

    @Override // com.amazon.aps.iva.kc.f
    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.b.equals(((b) obj).b);
        }
        return false;
    }

    @Override // com.amazon.aps.iva.kc.f
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return defpackage.b.b(new StringBuilder("ObjectKey{object="), this.b, '}');
    }
}
