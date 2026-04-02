package com.fyber.inneractive.sdk.player.c.d.g;

import android.util.Log;
import com.fyber.inneractive.sdk.player.c.d.f;
import com.fyber.inneractive.sdk.player.c.d.g;
import com.fyber.inneractive.sdk.player.c.d.g.c;
import com.fyber.inneractive.sdk.player.c.d.h;
import com.fyber.inneractive.sdk.player.c.d.i;
import com.fyber.inneractive.sdk.player.c.d.l;
import com.fyber.inneractive.sdk.player.c.d.m;
import com.fyber.inneractive.sdk.player.c.d.n;
import com.fyber.inneractive.sdk.player.c.k.k;
import com.fyber.inneractive.sdk.player.c.k.t;
import java.io.IOException;
/* loaded from: classes.dex */
public final class a implements f, m {
    public static final i a = new i() { // from class: com.fyber.inneractive.sdk.player.c.d.g.a.1
        @Override // com.fyber.inneractive.sdk.player.c.d.i
        public final f[] a() {
            return new f[]{new a()};
        }
    };
    private h b;
    private n c;
    private b d;
    private int e;
    private int f;

    @Override // com.fyber.inneractive.sdk.player.c.d.m
    public final boolean b_() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final boolean a(g gVar) throws IOException, InterruptedException {
        return c.a(gVar) != null;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final void a(h hVar) {
        this.b = hVar;
        this.c = hVar.a(0);
        this.d = null;
        hVar.b();
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final void a(long j, long j2) {
        this.f = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final int a(g gVar, l lVar) throws IOException, InterruptedException {
        if (this.d == null) {
            b a2 = c.a(gVar);
            this.d = a2;
            if (a2 == null) {
                throw new com.fyber.inneractive.sdk.player.c.l("Unsupported or unrecognized wav header.");
            }
            this.c.a(com.fyber.inneractive.sdk.player.c.h.a(null, "audio/raw", a2.b * a2.e * a2.a, 32768, this.d.a, this.d.b, this.d.f, null, null, 0, null));
            this.e = this.d.d;
        }
        b bVar = this.d;
        if (!((bVar.g == 0 || bVar.h == 0) ? false : true)) {
            b bVar2 = this.d;
            com.fyber.inneractive.sdk.player.c.k.a.a(gVar);
            com.fyber.inneractive.sdk.player.c.k.a.a(bVar2);
            gVar.a();
            k kVar = new k(8);
            c.a a3 = c.a.a(gVar, kVar);
            while (a3.a != t.e("data")) {
                Log.w("WavHeaderReader", "Ignoring unknown WAV chunk: " + a3.a);
                long j = a3.b + 8;
                if (a3.a == t.e("RIFF")) {
                    j = 12;
                }
                if (j > 2147483647L) {
                    throw new com.fyber.inneractive.sdk.player.c.l("Chunk is too large (~2GB+) to skip; id: " + a3.a);
                }
                gVar.b((int) j);
                a3 = c.a.a(gVar, kVar);
            }
            gVar.b(8);
            long c = gVar.c();
            long j2 = a3.b;
            bVar2.g = c;
            bVar2.h = j2;
            this.b.a(this);
        }
        int a4 = this.c.a(gVar, 32768 - this.f, true);
        if (a4 != -1) {
            this.f += a4;
        }
        int i = this.f / this.e;
        if (i > 0) {
            b bVar3 = this.d;
            int i2 = i * this.e;
            int i3 = this.f - i2;
            this.f = i3;
            this.c.a(((gVar.c() - this.f) * 1000000) / bVar3.c, 1, i2, i3, null);
        }
        return a4 == -1 ? -1 : 0;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.m
    public final long b() {
        b bVar = this.d;
        return ((bVar.h / bVar.d) * 1000000) / bVar.b;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.m
    public final long a(long j) {
        b bVar = this.d;
        return Math.min((((j * bVar.c) / 1000000) / bVar.d) * bVar.d, bVar.h - bVar.d) + bVar.g;
    }
}
