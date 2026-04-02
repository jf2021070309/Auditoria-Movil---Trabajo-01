package com.fyber.inneractive.sdk.player.c.d.g;

import android.util.Log;
import com.fyber.inneractive.sdk.player.c.d.g;
import com.fyber.inneractive.sdk.player.c.k.k;
import com.fyber.inneractive.sdk.player.c.k.t;
import com.fyber.inneractive.sdk.player.c.l;
import java.io.IOException;
/* loaded from: classes.dex */
final class c {
    public static b a(g gVar) throws IOException, InterruptedException {
        a a2;
        com.fyber.inneractive.sdk.player.c.k.a.a(gVar);
        k kVar = new k(16);
        if (a.a(gVar, kVar).a != t.e("RIFF")) {
            return null;
        }
        gVar.c(kVar.a, 0, 4);
        kVar.c(0);
        int j = kVar.j();
        if (j != t.e("WAVE")) {
            Log.e("WavHeaderReader", "Unsupported RIFF format: " + j);
            return null;
        }
        while (true) {
            a2 = a.a(gVar, kVar);
            if (a2.a == t.e("fmt ")) {
                break;
            }
            gVar.c((int) a2.b);
        }
        com.fyber.inneractive.sdk.player.c.k.a.b(a2.b >= 16);
        gVar.c(kVar.a, 0, 16);
        kVar.c(0);
        int f = kVar.f();
        int f2 = kVar.f();
        int o = kVar.o();
        int o2 = kVar.o();
        int f3 = kVar.f();
        int f4 = kVar.f();
        int i = (f2 * f4) / 8;
        if (f3 != i) {
            throw new l("Expected block alignment: " + i + "; got: " + f3);
        }
        int a3 = t.a(f4);
        if (a3 == 0) {
            Log.e("WavHeaderReader", "Unsupported WAV bit depth: " + f4);
            return null;
        } else if (f != 1 && f != 65534) {
            Log.e("WavHeaderReader", "Unsupported WAV format type: " + f);
            return null;
        } else {
            gVar.c(((int) a2.b) - 16);
            return new b(f2, o, o2, f3, f4, a3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public final long b;

        private a(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public static a a(g gVar, k kVar) throws IOException, InterruptedException {
            gVar.c(kVar.a, 0, 8);
            kVar.c(0);
            return new a(kVar.j(), kVar.i());
        }
    }
}
