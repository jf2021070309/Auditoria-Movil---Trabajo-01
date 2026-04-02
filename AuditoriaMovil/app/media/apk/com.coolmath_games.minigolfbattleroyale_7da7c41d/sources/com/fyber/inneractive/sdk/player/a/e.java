package com.fyber.inneractive.sdk.player.a;

import com.fyber.inneractive.sdk.config.a.s;
import com.fyber.inneractive.sdk.player.a.d;
import com.fyber.inneractive.sdk.player.c.j.g;
/* loaded from: classes.dex */
public final class e implements g.a {
    private final d.b a;
    private d.a b;
    private final int c;
    private final s d;

    public e(d.a aVar, d.b bVar, int i, s sVar) {
        this.b = aVar;
        this.c = i;
        this.a = bVar;
        this.d = sVar;
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.g.a
    public final com.fyber.inneractive.sdk.player.c.j.g a() {
        d dVar = new d();
        dVar.c = this.b;
        dVar.e = this.c;
        dVar.f = this.d;
        dVar.d = this.a;
        return dVar;
    }
}
