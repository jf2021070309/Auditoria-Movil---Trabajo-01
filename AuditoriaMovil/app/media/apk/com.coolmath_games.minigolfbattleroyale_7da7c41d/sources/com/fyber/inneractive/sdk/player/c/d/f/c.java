package com.fyber.inneractive.sdk.player.c.d.f;

import androidx.work.impl.Scheduler;
import com.fyber.inneractive.sdk.player.c.d.f.v;
import com.fyber.inneractive.sdk.player.c.d.m;
import java.io.IOException;
/* loaded from: classes.dex */
public final class c implements com.fyber.inneractive.sdk.player.c.d.f {
    public static final com.fyber.inneractive.sdk.player.c.d.i a = new com.fyber.inneractive.sdk.player.c.d.i() { // from class: com.fyber.inneractive.sdk.player.c.d.f.c.1
        @Override // com.fyber.inneractive.sdk.player.c.d.i
        public final com.fyber.inneractive.sdk.player.c.d.f[] a() {
            return new com.fyber.inneractive.sdk.player.c.d.f[]{new c()};
        }
    };
    private static final int b = com.fyber.inneractive.sdk.player.c.k.t.e("ID3");
    private final long c;
    private final com.fyber.inneractive.sdk.player.c.k.k d;
    private d e;
    private boolean f;

    public c() {
        this((byte) 0);
    }

    private c(byte b2) {
        this.c = 0L;
        this.d = new com.fyber.inneractive.sdk.player.c.k.k((int) Scheduler.MAX_GREEDY_SCHEDULER_LIMIT);
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final boolean a(com.fyber.inneractive.sdk.player.c.d.g gVar) throws IOException, InterruptedException {
        com.fyber.inneractive.sdk.player.c.k.k kVar = new com.fyber.inneractive.sdk.player.c.k.k(10);
        com.fyber.inneractive.sdk.player.c.k.j jVar = new com.fyber.inneractive.sdk.player.c.k.j(kVar.a);
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
        int i3 = 0;
        int i4 = i;
        while (true) {
            gVar.c(kVar.a, 0, 2);
            kVar.c(0);
            if ((kVar.e() & 65526) != 65520) {
                gVar.a();
                i4++;
                if (i4 - i >= 8192) {
                    return false;
                }
                gVar.c(i4);
                i2 = 0;
                i3 = 0;
            } else {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                gVar.c(kVar.a, 0, 4);
                jVar.a(14);
                int c = jVar.c(13);
                if (c <= 6) {
                    return false;
                }
                gVar.c(c - 6);
                i3 += c;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final void a(com.fyber.inneractive.sdk.player.c.d.h hVar) {
        d dVar = new d();
        this.e = dVar;
        dVar.a(hVar, new v.d(0, 1));
        hVar.b();
        hVar.a(new m.a(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final void a(long j, long j2) {
        this.f = false;
        this.e.c();
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final int a(com.fyber.inneractive.sdk.player.c.d.g gVar, com.fyber.inneractive.sdk.player.c.d.l lVar) throws IOException, InterruptedException {
        int a2 = gVar.a(this.d.a, 0, Scheduler.MAX_GREEDY_SCHEDULER_LIMIT);
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
