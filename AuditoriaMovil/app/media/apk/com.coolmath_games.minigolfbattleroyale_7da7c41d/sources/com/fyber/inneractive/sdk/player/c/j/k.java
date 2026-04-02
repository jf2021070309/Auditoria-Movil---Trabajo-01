package com.fyber.inneractive.sdk.player.c.j;

import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import com.fyber.inneractive.sdk.player.c.j.d;
import com.fyber.inneractive.sdk.player.c.k.p;
import com.vungle.warren.AdLoader;
import java.util.Collections;
/* loaded from: classes.dex */
public final class k implements d, u<Object> {
    private final Handler a;
    private final d.a b;
    private final com.fyber.inneractive.sdk.player.c.k.p c;
    private int d;
    private long e;
    private long f;
    private long g;
    private long h;
    private long i;

    public k() {
        this((byte) 0);
    }

    private k(byte b) {
        this((char) 0);
    }

    private k(char c) {
        this.a = null;
        this.b = null;
        this.c = new com.fyber.inneractive.sdk.player.c.k.p();
        this.i = -1L;
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.u
    public final synchronized void a() {
        if (this.d == 0) {
            this.e = SystemClock.elapsedRealtime();
        }
        this.d++;
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.u
    public final synchronized void a(int i) {
        this.f += i;
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.u
    public final synchronized void b() {
        p.a aVar;
        float f;
        int i = 0;
        com.fyber.inneractive.sdk.player.c.k.a.b(this.d > 0);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        final int i2 = (int) (elapsedRealtime - this.e);
        long j = i2;
        this.g += j;
        this.h += this.f;
        if (i2 > 0) {
            float f2 = (float) ((this.f * 8000) / j);
            com.fyber.inneractive.sdk.player.c.k.p pVar = this.c;
            int sqrt = (int) Math.sqrt(this.f);
            if (pVar.f != 1) {
                Collections.sort(pVar.d, com.fyber.inneractive.sdk.player.c.k.p.a);
                pVar.f = 1;
            }
            if (pVar.i > 0) {
                p.a[] aVarArr = pVar.e;
                int i3 = pVar.i - 1;
                pVar.i = i3;
                aVar = aVarArr[i3];
            } else {
                aVar = new p.a((byte) 0);
            }
            int i4 = pVar.g;
            pVar.g = i4 + 1;
            aVar.a = i4;
            aVar.b = sqrt;
            aVar.c = f2;
            pVar.d.add(aVar);
            pVar.h += sqrt;
            while (pVar.h > pVar.c) {
                int i5 = pVar.h - pVar.c;
                p.a aVar2 = pVar.d.get(0);
                if (aVar2.b <= i5) {
                    pVar.h -= aVar2.b;
                    pVar.d.remove(0);
                    if (pVar.i < 5) {
                        p.a[] aVarArr2 = pVar.e;
                        int i6 = pVar.i;
                        pVar.i = i6 + 1;
                        aVarArr2[i6] = aVar2;
                    }
                } else {
                    aVar2.b -= i5;
                    pVar.h -= i5;
                }
            }
            if (this.g >= AdLoader.RETRY_DELAY || this.h >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                com.fyber.inneractive.sdk.player.c.k.p pVar2 = this.c;
                if (pVar2.f != 0) {
                    Collections.sort(pVar2.d, com.fyber.inneractive.sdk.player.c.k.p.b);
                    pVar2.f = 0;
                }
                float f3 = pVar2.h * 0.5f;
                int i7 = 0;
                while (true) {
                    if (i < pVar2.d.size()) {
                        p.a aVar3 = pVar2.d.get(i);
                        i7 += aVar3.b;
                        if (i7 >= f3) {
                            f = aVar3.c;
                            break;
                        }
                        i++;
                    } else {
                        f = pVar2.d.isEmpty() ? Float.NaN : pVar2.d.get(pVar2.d.size() - 1).c;
                    }
                }
                this.i = Float.isNaN(f) ? -1L : f;
            }
        }
        final long j2 = this.f;
        final long j3 = this.i;
        if (this.a != null && this.b != null) {
            this.a.post(new Runnable() { // from class: com.fyber.inneractive.sdk.player.c.j.k.1
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
        int i8 = this.d - 1;
        this.d = i8;
        if (i8 > 0) {
            this.e = elapsedRealtime;
        }
        this.f = 0L;
    }
}
