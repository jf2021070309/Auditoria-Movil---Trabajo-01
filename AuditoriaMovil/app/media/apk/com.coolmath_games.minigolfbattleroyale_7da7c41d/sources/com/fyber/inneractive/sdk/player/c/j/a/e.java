package com.fyber.inneractive.sdk.player.c.j.a;

import com.fyber.inneractive.sdk.player.c.j.a.d;
import com.fyber.inneractive.sdk.player.c.j.f;
import com.fyber.inneractive.sdk.player.c.j.g;
import com.fyber.inneractive.sdk.player.c.j.q;
/* loaded from: classes.dex */
public final class e implements g.a {
    private final a a;
    private final g.a b;
    private final g.a c;
    private final f.a d;
    private final int e;
    private final d.a f;

    public e(a aVar, g.a aVar2) {
        this(aVar, aVar2, new q(), new c(aVar));
    }

    private e(a aVar, g.a aVar2, g.a aVar3, f.a aVar4) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
        this.e = 2;
        this.f = null;
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.g.a
    public final /* synthetic */ com.fyber.inneractive.sdk.player.c.j.g a() {
        a aVar = this.a;
        com.fyber.inneractive.sdk.player.c.j.g a = this.b.a();
        com.fyber.inneractive.sdk.player.c.j.g a2 = this.c.a();
        f.a aVar2 = this.d;
        return new d(aVar, a, a2, aVar2 != null ? aVar2.a() : null, this.e, this.f);
    }
}
