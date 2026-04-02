package com.fyber.inneractive.sdk.player.c.g;

import android.net.Uri;
import android.os.Handler;
import com.fyber.inneractive.sdk.player.c.g.a;
import com.fyber.inneractive.sdk.player.c.g.d;
import com.fyber.inneractive.sdk.player.c.j.g;
import com.fyber.inneractive.sdk.player.c.j.s;
import com.fyber.inneractive.sdk.player.c.q;
import java.io.IOException;
/* loaded from: classes.dex */
public final class b implements d, d.a {
    private final Uri a;
    private final g.a b;
    private final com.fyber.inneractive.sdk.player.c.d.i c;
    private final int d;
    private final Handler e;
    private final a f;
    private final q.a g = new q.a();
    private final String h;
    private d.a i;
    private q j;
    private boolean k;

    /* loaded from: classes.dex */
    public interface a {
        void a(IOException iOException);
    }

    public b(Uri uri, g.a aVar, com.fyber.inneractive.sdk.player.c.d.i iVar, int i, Handler handler, a aVar2, String str) {
        this.a = uri;
        this.b = aVar;
        this.c = iVar;
        this.d = i;
        this.e = handler;
        this.f = aVar2;
        this.h = str;
    }

    @Override // com.fyber.inneractive.sdk.player.c.g.d
    public final void a(d.a aVar) {
        this.i = aVar;
        g gVar = new g(-9223372036854775807L, false);
        this.j = gVar;
        aVar.a(gVar);
    }

    @Override // com.fyber.inneractive.sdk.player.c.g.d
    public final c a(int i, com.fyber.inneractive.sdk.player.c.j.b bVar) {
        com.fyber.inneractive.sdk.player.c.k.a.a(i == 0);
        return new com.fyber.inneractive.sdk.player.c.g.a(this.a, this.b.a(), this.c.a(), this.d, this.e, this.f, this, bVar, this.h);
    }

    @Override // com.fyber.inneractive.sdk.player.c.g.d
    public final void a(c cVar) {
        final com.fyber.inneractive.sdk.player.c.g.a aVar = (com.fyber.inneractive.sdk.player.c.g.a) cVar;
        final a.b bVar = aVar.e;
        s sVar = aVar.d;
        Runnable runnable = new Runnable() { // from class: com.fyber.inneractive.sdk.player.c.g.a.3
            @Override // java.lang.Runnable
            public final void run() {
                b bVar2 = bVar;
                if (bVar2.a != null) {
                    bVar2.a = null;
                }
                int size = aVar.i.size();
                for (int i = 0; i < size; i++) {
                    aVar.i.valueAt(i).a();
                }
            }
        };
        if (sVar.b != null) {
            sVar.b.a(true);
        }
        sVar.a.execute(runnable);
        sVar.a.shutdown();
        aVar.h.removeCallbacksAndMessages(null);
        aVar.v = true;
    }

    @Override // com.fyber.inneractive.sdk.player.c.g.d
    public final void a() {
        this.i = null;
    }

    @Override // com.fyber.inneractive.sdk.player.c.g.d.a
    public final void a(q qVar) {
        boolean z = qVar.a(0, this.g, false).d != -9223372036854775807L;
        if (!this.k || z) {
            this.j = qVar;
            this.k = z;
            this.i.a(qVar);
        }
    }
}
