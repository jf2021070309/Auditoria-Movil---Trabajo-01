package com.fyber.inneractive.sdk.player.c.d.f;

import com.fyber.inneractive.sdk.player.c.d.f.v;
import kotlin.jvm.internal.LongCompanionObject;
/* loaded from: classes.dex */
public final class t implements q {
    private com.fyber.inneractive.sdk.player.c.k.r a;
    private com.fyber.inneractive.sdk.player.c.d.n b;
    private boolean c;

    @Override // com.fyber.inneractive.sdk.player.c.d.f.q
    public final void a(com.fyber.inneractive.sdk.player.c.k.r rVar, com.fyber.inneractive.sdk.player.c.d.h hVar, v.d dVar) {
        this.a = rVar;
        dVar.a();
        com.fyber.inneractive.sdk.player.c.d.n a = hVar.a(dVar.b());
        this.b = a;
        a.a(com.fyber.inneractive.sdk.player.c.h.a(dVar.c(), "application/x-scte35", (com.fyber.inneractive.sdk.player.c.c.a) null));
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.q
    public final void a(com.fyber.inneractive.sdk.player.c.k.k kVar) {
        long j = -9223372036854775807L;
        if (!this.c) {
            if (this.a.a() == -9223372036854775807L) {
                return;
            }
            this.b.a(com.fyber.inneractive.sdk.player.c.h.a("application/x-scte35", this.a.a()));
            this.c = true;
        }
        int b = kVar.b();
        this.b.a(kVar, b);
        com.fyber.inneractive.sdk.player.c.d.n nVar = this.b;
        com.fyber.inneractive.sdk.player.c.k.r rVar = this.a;
        if (rVar.b != -9223372036854775807L) {
            j = rVar.b;
        } else if (rVar.a != LongCompanionObject.MAX_VALUE) {
            j = rVar.a;
        }
        nVar.a(j, 1, b, 0, null);
    }
}
