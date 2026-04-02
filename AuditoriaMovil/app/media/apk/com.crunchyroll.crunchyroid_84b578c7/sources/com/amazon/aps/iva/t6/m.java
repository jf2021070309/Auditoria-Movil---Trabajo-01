package com.amazon.aps.iva.t6;

import android.net.Uri;
import com.amazon.aps.iva.o6.q;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t6.k;
import com.amazon.aps.iva.w5.w;
import java.io.IOException;
/* compiled from: ParsingLoadable.java */
/* loaded from: classes.dex */
public final class m<T> implements k.d {
    public final long a;
    public final com.amazon.aps.iva.w5.i b;
    public final int c;
    public final w d;
    public final a<? extends T> e;
    public volatile T f;

    /* compiled from: ParsingLoadable.java */
    /* loaded from: classes.dex */
    public interface a<T> {
        Object a(Uri uri, com.amazon.aps.iva.w5.h hVar) throws IOException;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m(int r16, android.net.Uri r17, com.amazon.aps.iva.w5.f r18, com.amazon.aps.iva.t6.m.a r19) {
        /*
            r15 = this;
            r13 = 0
            r11 = 0
            r7 = 0
            r5 = 0
            r2 = 0
            r4 = 1
            java.util.Map r6 = java.util.Collections.emptyMap()
            r9 = -1
            r12 = 1
            java.lang.String r0 = "The uri must be set."
            r1 = r17
            com.amazon.aps.iva.cq.b.E(r1, r0)
            com.amazon.aps.iva.w5.i r14 = new com.amazon.aps.iva.w5.i
            r0 = r14
            r0.<init>(r1, r2, r4, r5, r6, r7, r9, r11, r12, r13)
            r0 = r15
            r1 = r16
            r2 = r18
            r3 = r19
            r15.<init>(r1, r2, r14, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.t6.m.<init>(int, android.net.Uri, com.amazon.aps.iva.w5.f, com.amazon.aps.iva.t6.m$a):void");
    }

    @Override // com.amazon.aps.iva.t6.k.d
    public final void a() throws IOException {
        this.d.b = 0L;
        com.amazon.aps.iva.w5.h hVar = new com.amazon.aps.iva.w5.h(this.d, this.b);
        try {
            hVar.a();
            Uri uri = this.d.getUri();
            uri.getClass();
            this.f = (T) this.e.a(uri, hVar);
        } finally {
            g0.g(hVar);
        }
    }

    public m(int i, com.amazon.aps.iva.w5.f fVar, com.amazon.aps.iva.w5.i iVar, a aVar) {
        this.d = new w(fVar);
        this.b = iVar;
        this.c = i;
        this.e = aVar;
        this.a = q.a();
    }

    @Override // com.amazon.aps.iva.t6.k.d
    public final void b() {
    }
}
