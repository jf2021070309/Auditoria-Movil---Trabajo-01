package com.fyber.inneractive.sdk.player.c.d.f;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.core.view.InputDeviceCompat;
import com.fyber.inneractive.sdk.player.c.d.f.v;
import com.fyber.inneractive.sdk.player.c.d.m;
import java.io.IOException;
import kotlin.UByte;
/* loaded from: classes.dex */
public final class p implements com.fyber.inneractive.sdk.player.c.d.f {
    public static final com.fyber.inneractive.sdk.player.c.d.i a = new com.fyber.inneractive.sdk.player.c.d.i() { // from class: com.fyber.inneractive.sdk.player.c.d.f.p.1
        @Override // com.fyber.inneractive.sdk.player.c.d.i
        public final com.fyber.inneractive.sdk.player.c.d.f[] a() {
            return new com.fyber.inneractive.sdk.player.c.d.f[]{new p()};
        }
    };
    private final com.fyber.inneractive.sdk.player.c.k.r b;
    private final SparseArray<a> c;
    private final com.fyber.inneractive.sdk.player.c.k.k d;
    private boolean e;
    private boolean f;
    private boolean g;
    private com.fyber.inneractive.sdk.player.c.d.h h;

    public p() {
        this(new com.fyber.inneractive.sdk.player.c.k.r(0L));
    }

    private p(com.fyber.inneractive.sdk.player.c.k.r rVar) {
        this.b = rVar;
        this.d = new com.fyber.inneractive.sdk.player.c.k.k(4096);
        this.c = new SparseArray<>();
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final boolean a(com.fyber.inneractive.sdk.player.c.d.g gVar) throws IOException, InterruptedException {
        byte[] bArr = new byte[14];
        gVar.c(bArr, 0, 14);
        if (442 == (((bArr[0] & UByte.MAX_VALUE) << 24) | ((bArr[1] & UByte.MAX_VALUE) << 16) | ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            gVar.c(bArr[13] & 7);
            gVar.c(bArr, 0, 3);
            return 1 == ((((bArr[0] & UByte.MAX_VALUE) << 16) | ((bArr[1] & UByte.MAX_VALUE) << 8)) | (bArr[2] & UByte.MAX_VALUE));
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final void a(com.fyber.inneractive.sdk.player.c.d.h hVar) {
        this.h = hVar;
        hVar.a(new m.a(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final void a(long j, long j2) {
        this.b.b = -9223372036854775807L;
        for (int i = 0; i < this.c.size(); i++) {
            a valueAt = this.c.valueAt(i);
            valueAt.f = false;
            valueAt.a.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final int a(com.fyber.inneractive.sdk.player.c.d.g gVar, com.fyber.inneractive.sdk.player.c.d.l lVar) throws IOException, InterruptedException {
        if (gVar.b(this.d.a, 0, 4, true)) {
            this.d.c(0);
            int j = this.d.j();
            if (j == 441) {
                return -1;
            }
            if (j == 442) {
                gVar.c(this.d.a, 0, 10);
                this.d.c(9);
                gVar.b((this.d.d() & 7) + 14);
                return 0;
            } else if (j == 443) {
                gVar.c(this.d.a, 0, 2);
                this.d.c(0);
                gVar.b(this.d.e() + 6);
                return 0;
            } else if (((j & InputDeviceCompat.SOURCE_ANY) >> 8) != 1) {
                gVar.b(1);
                return 0;
            } else {
                int i = j & 255;
                a aVar = this.c.get(i);
                if (!this.e) {
                    if (aVar == null) {
                        h hVar = null;
                        if (!this.f && i == 189) {
                            hVar = new b();
                            this.f = true;
                        } else if (!this.f && (i & 224) == 192) {
                            hVar = new m();
                            this.f = true;
                        } else if (!this.g && (i & 240) == 224) {
                            hVar = new i();
                            this.g = true;
                        }
                        if (hVar != null) {
                            hVar.a(this.h, new v.d(i, 256));
                            aVar = new a(hVar, this.b);
                            this.c.put(i, aVar);
                        }
                    }
                    if ((this.f && this.g) || gVar.c() > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                        this.e = true;
                        this.h.b();
                    }
                }
                gVar.c(this.d.a, 0, 2);
                this.d.c(0);
                int e = this.d.e() + 6;
                if (aVar == null) {
                    gVar.b(e);
                } else {
                    this.d.a(e);
                    gVar.b(this.d.a, 0, e);
                    this.d.c(6);
                    com.fyber.inneractive.sdk.player.c.k.k kVar = this.d;
                    kVar.a(aVar.c.a, 0, 3);
                    aVar.c.a(0);
                    aVar.c.b(8);
                    aVar.d = aVar.c.a();
                    aVar.e = aVar.c.a();
                    aVar.c.b(6);
                    aVar.g = aVar.c.c(8);
                    kVar.a(aVar.c.a, 0, aVar.g);
                    aVar.c.a(0);
                    aVar.h = 0L;
                    if (aVar.d) {
                        aVar.c.b(4);
                        aVar.c.b(1);
                        aVar.c.b(1);
                        long c = (aVar.c.c(3) << 30) | (aVar.c.c(15) << 15) | aVar.c.c(15);
                        aVar.c.b(1);
                        if (!aVar.f && aVar.e) {
                            aVar.c.b(4);
                            aVar.c.b(1);
                            aVar.c.b(1);
                            long c2 = aVar.c.c(15);
                            aVar.c.b(1);
                            aVar.b.a(c2 | (aVar.c.c(3) << 30) | (aVar.c.c(15) << 15));
                            aVar.f = true;
                        }
                        aVar.h = aVar.b.a(c);
                    }
                    aVar.a.a(aVar.h, true);
                    aVar.a.a(kVar);
                    aVar.a.b();
                    com.fyber.inneractive.sdk.player.c.k.k kVar2 = this.d;
                    kVar2.b(kVar2.c());
                }
                return 0;
            }
        }
        return -1;
    }

    /* loaded from: classes.dex */
    private static final class a {
        final h a;
        final com.fyber.inneractive.sdk.player.c.k.r b;
        final com.fyber.inneractive.sdk.player.c.k.j c = new com.fyber.inneractive.sdk.player.c.k.j(new byte[64]);
        boolean d;
        boolean e;
        boolean f;
        int g;
        long h;

        public a(h hVar, com.fyber.inneractive.sdk.player.c.k.r rVar) {
            this.a = hVar;
            this.b = rVar;
        }
    }
}
