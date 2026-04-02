package com.fyber.inneractive.sdk.player.c.d.f;

import android.util.Log;
import com.fyber.inneractive.sdk.player.c.d.f.v;
/* loaded from: classes.dex */
public final class l implements h {
    private final com.fyber.inneractive.sdk.player.c.k.k a = new com.fyber.inneractive.sdk.player.c.k.k(10);
    private com.fyber.inneractive.sdk.player.c.d.n b;
    private boolean c;
    private long d;
    private int e;
    private int f;

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void a() {
        this.c = false;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void a(com.fyber.inneractive.sdk.player.c.d.h hVar, v.d dVar) {
        dVar.a();
        com.fyber.inneractive.sdk.player.c.d.n a = hVar.a(dVar.b());
        this.b = a;
        a.a(com.fyber.inneractive.sdk.player.c.h.a(dVar.c(), "application/id3", (com.fyber.inneractive.sdk.player.c.c.a) null));
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void a(long j, boolean z) {
        if (z) {
            this.c = true;
            this.d = j;
            this.e = 0;
            this.f = 0;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void a(com.fyber.inneractive.sdk.player.c.k.k kVar) {
        if (this.c) {
            int b = kVar.b();
            int i = this.f;
            if (i < 10) {
                int min = Math.min(b, 10 - i);
                System.arraycopy(kVar.a, kVar.b, this.a.a, this.f, min);
                if (this.f + min == 10) {
                    this.a.c(0);
                    if (73 != this.a.d() || 68 != this.a.d() || 51 != this.a.d()) {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.c = false;
                        return;
                    }
                    this.a.d(3);
                    this.e = this.a.m() + 10;
                }
            }
            int min2 = Math.min(b, this.e - this.f);
            this.b.a(kVar, min2);
            this.f += min2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void b() {
        int i;
        if (this.c && (i = this.e) != 0 && this.f == i) {
            this.b.a(this.d, 1, i, 0, null);
            this.c = false;
        }
    }
}
