package com.fyber.inneractive.sdk.player.c.d.f;

import com.fyber.inneractive.sdk.player.c.d.f.v;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class g implements h {
    private final List<v.a> a;
    private final com.fyber.inneractive.sdk.player.c.d.n[] b;
    private boolean c;
    private int d;
    private int e;
    private long f;

    public g(List<v.a> list) {
        this.a = list;
        this.b = new com.fyber.inneractive.sdk.player.c.d.n[list.size()];
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void a() {
        this.c = false;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void a(com.fyber.inneractive.sdk.player.c.d.h hVar, v.d dVar) {
        for (int i = 0; i < this.b.length; i++) {
            v.a aVar = this.a.get(i);
            dVar.a();
            com.fyber.inneractive.sdk.player.c.d.n a = hVar.a(dVar.b());
            a.a(com.fyber.inneractive.sdk.player.c.h.a(dVar.c(), "application/dvbsubs", Collections.singletonList(aVar.c), aVar.a, (com.fyber.inneractive.sdk.player.c.c.a) null));
            this.b[i] = a;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void a(long j, boolean z) {
        if (z) {
            this.c = true;
            this.f = j;
            this.e = 0;
            this.d = 2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void b() {
        if (this.c) {
            for (com.fyber.inneractive.sdk.player.c.d.n nVar : this.b) {
                nVar.a(this.f, 1, this.e, 0, null);
            }
            this.c = false;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void a(com.fyber.inneractive.sdk.player.c.k.k kVar) {
        com.fyber.inneractive.sdk.player.c.d.n[] nVarArr;
        if (this.c) {
            if (this.d != 2 || a(kVar, 32)) {
                if (this.d != 1 || a(kVar, 0)) {
                    int i = kVar.b;
                    int b = kVar.b();
                    for (com.fyber.inneractive.sdk.player.c.d.n nVar : this.b) {
                        kVar.c(i);
                        nVar.a(kVar, b);
                    }
                    this.e += b;
                }
            }
        }
    }

    private boolean a(com.fyber.inneractive.sdk.player.c.k.k kVar, int i) {
        if (kVar.b() == 0) {
            return false;
        }
        if (kVar.d() != i) {
            this.c = false;
        }
        this.d--;
        return this.c;
    }
}
