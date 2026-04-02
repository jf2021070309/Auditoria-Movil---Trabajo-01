package com.fyber.inneractive.sdk.player.c.d.a;

import android.util.Pair;
import com.fyber.inneractive.sdk.player.c.d.a.d;
import com.fyber.inneractive.sdk.player.c.d.n;
import com.fyber.inneractive.sdk.player.c.h;
import com.fyber.inneractive.sdk.player.c.k.k;
import java.util.Collections;
/* loaded from: classes.dex */
final class a extends d {
    private static final int[] a = {5512, 11025, 22050, 44100};
    private boolean c;
    private boolean d;
    private int e;

    public a(n nVar) {
        super(nVar);
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.a.d
    protected final boolean a(k kVar) throws d.a {
        if (!this.c) {
            int d = kVar.d();
            int i = (d >> 4) & 15;
            this.e = i;
            if (i == 2) {
                this.b.a(h.a(null, "audio/mpeg", -1, -1, 1, a[(d >> 2) & 3], null, null, null));
                this.d = true;
            } else if (i == 7 || i == 8) {
                this.b.a(h.a(null, this.e == 7 ? "audio/g711-alaw" : "audio/g711-mlaw", -1, -1, 1, 8000, (d & 1) == 1 ? 2 : 3, null, null, 0, null));
                this.d = true;
            } else if (i != 10) {
                throw new d.a("Audio format not supported: " + this.e);
            }
            this.c = true;
        } else {
            kVar.d(1);
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.a.d
    protected final void a(k kVar, long j) {
        if (this.e == 2) {
            int b = kVar.b();
            this.b.a(kVar, b);
            this.b.a(j, 1, b, 0, null);
            return;
        }
        int d = kVar.d();
        if (d == 0 && !this.d) {
            int b2 = kVar.b();
            byte[] bArr = new byte[b2];
            kVar.a(bArr, 0, b2);
            Pair<Integer, Integer> a2 = com.fyber.inneractive.sdk.player.c.k.c.a(bArr);
            this.b.a(h.a(null, "audio/mp4a-latm", -1, -1, ((Integer) a2.second).intValue(), ((Integer) a2.first).intValue(), Collections.singletonList(bArr), null, null));
            this.d = true;
        } else if (this.e != 10 || d == 1) {
            int b3 = kVar.b();
            this.b.a(kVar, b3);
            this.b.a(j, 1, b3, 0, null);
        }
    }
}
