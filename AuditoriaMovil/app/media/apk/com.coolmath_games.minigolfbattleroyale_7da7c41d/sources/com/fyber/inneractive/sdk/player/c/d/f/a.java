package com.fyber.inneractive.sdk.player.c.d.f;

import com.fyber.inneractive.sdk.player.c.d.f.v;
import com.fyber.inneractive.sdk.player.c.d.m;
import java.io.IOException;
/* loaded from: classes.dex */
public final class a implements com.fyber.inneractive.sdk.player.c.d.f {
    public static final com.fyber.inneractive.sdk.player.c.d.i a = new com.fyber.inneractive.sdk.player.c.d.i() { // from class: com.fyber.inneractive.sdk.player.c.d.f.a.1
        @Override // com.fyber.inneractive.sdk.player.c.d.i
        public final com.fyber.inneractive.sdk.player.c.d.f[] a() {
            return new com.fyber.inneractive.sdk.player.c.d.f[]{new a()};
        }
    };
    private static final int b = com.fyber.inneractive.sdk.player.c.k.t.e("ID3");
    private final long c;
    private final com.fyber.inneractive.sdk.player.c.k.k d;
    private b e;
    private boolean f;

    public a() {
        this((byte) 0);
    }

    private a(byte b2) {
        this.c = 0L;
        this.d = new com.fyber.inneractive.sdk.player.c.k.k(2786);
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final boolean a(com.fyber.inneractive.sdk.player.c.d.g gVar) throws IOException, InterruptedException {
        com.fyber.inneractive.sdk.player.c.k.k kVar = new com.fyber.inneractive.sdk.player.c.k.k(10);
        int i = 0;
        while (true) {
            gVar.c(kVar.a, 0, 10);
            kVar.c(0);
            if (kVar.g() != b) {
                break;
            }
            kVar.d(3);
            int m = kVar.m();
            i += m + 10;
            gVar.c(m);
        }
        gVar.a();
        gVar.c(i);
        int i2 = 0;
        int i3 = i;
        while (true) {
            gVar.c(kVar.a, 0, 5);
            kVar.c(0);
            if (kVar.e() != 2935) {
                gVar.a();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                gVar.c(i3);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int a2 = com.fyber.inneractive.sdk.player.c.a.a.a(kVar.a);
                if (a2 == -1) {
                    return false;
                }
                gVar.c(a2 - 5);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final void a(com.fyber.inneractive.sdk.player.c.d.h hVar) {
        b bVar = new b();
        this.e = bVar;
        bVar.a(hVar, new v.d(0, 1));
        hVar.b();
        hVar.a(new m.a(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final void a(long j, long j2) {
        this.f = false;
        this.e.a();
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final int a(com.fyber.inneractive.sdk.player.c.d.g gVar, com.fyber.inneractive.sdk.player.c.d.l lVar) throws IOException, InterruptedException {
        int a2 = gVar.a(this.d.a, 0, 2786);
        if (a2 == -1) {
            return -1;
        }
        this.d.c(0);
        this.d.b(a2);
        if (!this.f) {
            this.e.a = this.c;
            this.f = true;
        }
        this.e.a(this.d);
        return 0;
    }
}
