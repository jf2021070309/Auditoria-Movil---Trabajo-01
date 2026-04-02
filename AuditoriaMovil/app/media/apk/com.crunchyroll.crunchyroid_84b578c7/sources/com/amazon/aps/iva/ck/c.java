package com.amazon.aps.iva.ck;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import com.amazon.aps.iva.a6.l;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.nk.j;
import com.amazon.aps.iva.t6.j;
import com.amazon.aps.iva.tj.y;
import com.amazon.aps.iva.tj.z;
import com.amazon.aps.iva.ve0.u0;
import com.amazon.aps.iva.ve0.v0;
import com.amazon.aps.iva.w5.p;
import com.amazon.aps.iva.w5.r;
import com.amazon.aps.iva.yb0.e0;
import java.io.IOException;
/* compiled from: PlaybackExceptionHandler.kt */
@SuppressLint({"UnsafeOptInUsageError"})
/* loaded from: classes.dex */
public final class c implements b {
    public final f b;
    public final d c;
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.bk.c> d;
    public final g e;
    public final u0<j> f;
    public final com.amazon.aps.iva.xb0.a<q> g;
    public Long h;

    public c(f fVar, d dVar, y yVar, g gVar, v0 v0Var, z zVar) {
        this.b = fVar;
        this.c = dVar;
        this.d = yVar;
        this.e = gVar;
        this.f = v0Var;
        this.g = zVar;
    }

    public final void G(l lVar, r rVar) {
        com.amazon.aps.iva.dk.c bVar;
        if (rVar == null) {
            bVar = new com.amazon.aps.iva.dk.d(lVar);
        } else {
            bVar = new com.amazon.aps.iva.dk.b(Integer.valueOf(rVar.f), false, String.valueOf(rVar.d), this.f.getValue().v, 2);
        }
        this.c.b(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.q5.l0.c
    public final void Z(l lVar) {
        com.amazon.aps.iva.bk.c invoke;
        IOException iOException;
        r rVar;
        r rVar2;
        boolean z;
        long j;
        com.amazon.aps.iva.yb0.j.f(lVar, "error");
        int i = lVar.b;
        if ((i == 4001 || i == 4003) && (invoke = this.d.invoke()) != null && !invoke.c()) {
            invoke.b();
            return;
        }
        j.c cVar = this.b.b;
        if (cVar != null) {
            iOException = cVar.b;
        } else {
            iOException = null;
        }
        if (iOException instanceof r) {
            rVar = (r) iOException;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            rVar = (r) com.amazon.aps.iva.dg.b.p(lVar, e0.a(r.class));
        }
        if (rVar != null) {
            rVar2 = rVar;
        } else {
            rVar2 = lVar;
        }
        if (this.e.a(rVar2)) {
            G(lVar, rVar);
            return;
        }
        boolean z2 = true;
        if (com.amazon.aps.iva.dg.b.p(lVar, e0.a(p.class)) != null) {
            z = true;
        } else {
            z = false;
        }
        if (com.amazon.aps.iva.dg.b.p(lVar, e0.a(MediaCodec.CryptoException.class)) == null) {
            z2 = false;
        }
        if (z || z2) {
            long currentTimeMillis = System.currentTimeMillis();
            Long l = this.h;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            if (j < currentTimeMillis) {
                if (this.h == null) {
                    this.h = Long.valueOf(currentTimeMillis + 15000);
                }
                this.g.invoke();
                return;
            }
        }
        this.h = null;
        G(lVar, rVar);
    }
}
