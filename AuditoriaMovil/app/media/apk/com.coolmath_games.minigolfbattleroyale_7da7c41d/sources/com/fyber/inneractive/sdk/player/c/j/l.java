package com.fyber.inneractive.sdk.player.c.j;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
/* loaded from: classes.dex */
public final class l implements g {
    private final g a;
    private final g b;
    private final g c;
    private final g d;
    private g e;

    public l(Context context, u<? super g> uVar, g gVar) {
        this.a = (g) com.fyber.inneractive.sdk.player.c.k.a.a(gVar);
        this.b = new p(uVar);
        this.c = new c(context, uVar);
        this.d = new e(context, uVar);
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.g
    public final long a(i iVar) throws IOException {
        com.fyber.inneractive.sdk.player.c.k.a.b(this.e == null);
        String scheme = iVar.a.getScheme();
        if (com.fyber.inneractive.sdk.player.c.k.t.a(iVar.a)) {
            if (iVar.a.getPath().startsWith("/android_asset/")) {
                this.e = this.c;
            } else {
                this.e = this.b;
            }
        } else if ("asset".equals(scheme)) {
            this.e = this.c;
        } else if ("content".equals(scheme)) {
            this.e = this.d;
        } else {
            this.e = this.a;
        }
        return this.e.a(iVar);
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.g
    public final int a(byte[] bArr, int i, int i2) throws IOException {
        return this.e.a(bArr, i, i2);
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.g
    public final Uri a() {
        g gVar = this.e;
        if (gVar == null) {
            return null;
        }
        return gVar.a();
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.g
    public final void b() throws IOException {
        g gVar = this.e;
        if (gVar != null) {
            try {
                gVar.b();
            } finally {
                this.e = null;
            }
        }
    }
}
