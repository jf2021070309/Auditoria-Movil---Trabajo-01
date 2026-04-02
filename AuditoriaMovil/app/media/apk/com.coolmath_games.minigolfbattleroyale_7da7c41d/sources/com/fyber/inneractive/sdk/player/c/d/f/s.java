package com.fyber.inneractive.sdk.player.c.d.f;

import com.fyber.inneractive.sdk.player.c.d.f.v;
import java.util.List;
/* loaded from: classes.dex */
final class s {
    private final List<com.fyber.inneractive.sdk.player.c.h> a;
    private final com.fyber.inneractive.sdk.player.c.d.n[] b;

    public s(List<com.fyber.inneractive.sdk.player.c.h> list) {
        this.a = list;
        this.b = new com.fyber.inneractive.sdk.player.c.d.n[list.size()];
    }

    public final void a(com.fyber.inneractive.sdk.player.c.d.h hVar, v.d dVar) {
        for (int i = 0; i < this.b.length; i++) {
            dVar.a();
            com.fyber.inneractive.sdk.player.c.d.n a = hVar.a(dVar.b());
            com.fyber.inneractive.sdk.player.c.h hVar2 = this.a.get(i);
            String str = hVar2.f;
            com.fyber.inneractive.sdk.player.c.k.a.a("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            a.a(com.fyber.inneractive.sdk.player.c.h.a(hVar2.a != null ? hVar2.a : dVar.c(), str, hVar2.x, hVar2.y, hVar2.z));
            this.b[i] = a;
        }
    }

    public final void a(long j, com.fyber.inneractive.sdk.player.c.k.k kVar) {
        com.fyber.inneractive.sdk.player.c.h.a.a.a(j, kVar, this.b);
    }
}
