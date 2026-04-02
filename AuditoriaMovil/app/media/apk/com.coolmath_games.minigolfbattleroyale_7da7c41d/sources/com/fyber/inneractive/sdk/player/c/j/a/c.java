package com.fyber.inneractive.sdk.player.c.j.a;

import com.fyber.inneractive.sdk.player.c.j.f;
/* loaded from: classes.dex */
public final class c implements f.a {
    private final a a;
    private final long b;
    private final int c;

    public c(a aVar) {
        this(aVar, (byte) 0);
    }

    private c(a aVar, byte b) {
        this.a = aVar;
        this.b = 10485760L;
        this.c = 20480;
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.f.a
    public final com.fyber.inneractive.sdk.player.c.j.f a() {
        return new b(this.a, this.b, this.c);
    }
}
