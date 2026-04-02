package com.amazon.aps.iva.q6;

import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.q6.f;
import com.amazon.aps.iva.w5.w;
import java.io.IOException;
/* compiled from: InitializationChunk.java */
/* loaded from: classes.dex */
public final class l extends e {
    public final f j;
    public f.a k;
    public long l;
    public volatile boolean m;

    public l(com.amazon.aps.iva.w5.f fVar, com.amazon.aps.iva.w5.i iVar, v vVar, int i, Object obj, f fVar2) {
        super(fVar, iVar, 2, vVar, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.j = fVar2;
    }

    @Override // com.amazon.aps.iva.t6.k.d
    public final void a() throws IOException {
        boolean z;
        if (this.l == 0) {
            ((d) this.j).a(this.k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            com.amazon.aps.iva.w5.i a = this.b.a(this.l);
            w wVar = this.i;
            com.amazon.aps.iva.x6.i iVar = new com.amazon.aps.iva.x6.i(wVar, a.f, wVar.b(a));
            while (!this.m) {
                int h = ((d) this.j).b.h(iVar, d.l);
                boolean z2 = false;
                if (h != 1) {
                    z = true;
                } else {
                    z = false;
                }
                com.amazon.aps.iva.cq.b.C(z);
                if (h == 0) {
                    z2 = true;
                    continue;
                }
                if (!z2) {
                    break;
                }
            }
            this.l = iVar.d - this.b.f;
        } finally {
            com.amazon.aps.iva.n1.c.g(this.i);
        }
    }

    @Override // com.amazon.aps.iva.t6.k.d
    public final void b() {
        this.m = true;
    }
}
