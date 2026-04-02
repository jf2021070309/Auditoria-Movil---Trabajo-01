package com.amazon.aps.iva.kc;

import com.amazon.aps.iva.kc.g;
import java.security.MessageDigest;
/* compiled from: Options.java */
/* loaded from: classes.dex */
public final class h implements f {
    public final com.amazon.aps.iva.hd.b b = new com.amazon.aps.iva.hd.b();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.kc.f
    public final void a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            com.amazon.aps.iva.hd.b bVar = this.b;
            if (i < bVar.d) {
                g gVar = (g) bVar.j(i);
                V n = this.b.n(i);
                g.b<T> bVar2 = gVar.b;
                if (gVar.d == null) {
                    gVar.d = gVar.c.getBytes(f.a);
                }
                bVar2.a(gVar.d, n, messageDigest);
                i++;
            } else {
                return;
            }
        }
    }

    public final <T> T c(g<T> gVar) {
        com.amazon.aps.iva.hd.b bVar = this.b;
        if (bVar.containsKey(gVar)) {
            return (T) bVar.getOrDefault(gVar, null);
        }
        return gVar.a;
    }

    @Override // com.amazon.aps.iva.kc.f
    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.b.equals(((h) obj).b);
        }
        return false;
    }

    @Override // com.amazon.aps.iva.kc.f
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.b + '}';
    }
}
