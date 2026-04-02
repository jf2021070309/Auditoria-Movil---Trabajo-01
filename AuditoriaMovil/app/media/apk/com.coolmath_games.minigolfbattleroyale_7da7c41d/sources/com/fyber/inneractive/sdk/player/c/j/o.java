package com.fyber.inneractive.sdk.player.c.j;

import com.fyber.inneractive.sdk.player.c.j.r;
/* loaded from: classes.dex */
public final class o extends r.a {
    private final String a;
    private final u<? super g> b;
    private final int c = 2000;
    private final int d = 2000;
    private final boolean e = true;

    public o(String str, u<? super g> uVar) {
        this.a = str;
        this.b = uVar;
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.r.a
    protected final /* synthetic */ r a(r.f fVar) {
        return new n(this.a, this.b, this.c, this.d, this.e, fVar);
    }
}
