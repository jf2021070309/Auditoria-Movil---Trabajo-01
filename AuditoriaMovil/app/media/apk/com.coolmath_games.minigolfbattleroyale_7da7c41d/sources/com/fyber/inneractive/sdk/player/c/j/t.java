package com.fyber.inneractive.sdk.player.c.j;

import android.net.Uri;
import java.io.IOException;
/* loaded from: classes.dex */
public final class t implements g {
    private final g a;
    private final f b;

    public t(g gVar, f fVar) {
        this.a = (g) com.fyber.inneractive.sdk.player.c.k.a.a(gVar);
        this.b = (f) com.fyber.inneractive.sdk.player.c.k.a.a(fVar);
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.g
    public final long a(i iVar) throws IOException {
        long a = this.a.a(iVar);
        if (iVar.e == -1 && a != -1) {
            iVar = new i(iVar.a, iVar.c, iVar.d, a, iVar.f, iVar.g);
        }
        this.b.a(iVar);
        return a;
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.g
    public final int a(byte[] bArr, int i, int i2) throws IOException {
        int a = this.a.a(bArr, i, i2);
        if (a > 0) {
            this.b.a(bArr, i, a);
        }
        return a;
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.g
    public final Uri a() {
        return this.a.a();
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.g
    public final void b() throws IOException {
        try {
            this.a.b();
        } finally {
            this.b.a();
        }
    }
}
