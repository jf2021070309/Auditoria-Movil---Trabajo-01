package com.fyber.inneractive.sdk.player.c.d.e;

import com.fyber.inneractive.sdk.player.c.d.e.k;
import com.fyber.inneractive.sdk.player.c.l;
/* loaded from: classes.dex */
final class j extends h {
    private a a;
    private int d;
    private boolean e;
    private k.d f;
    private k.b g;

    public static boolean b(com.fyber.inneractive.sdk.player.c.k.k kVar) {
        try {
            return k.a(1, kVar, true);
        } catch (l unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.c.d.e.h
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            this.a = null;
            this.f = null;
            this.g = null;
        }
        this.d = 0;
        this.e = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.c.d.e.h
    public final void c(long j) {
        super.c(j);
        this.e = j != 0;
        k.d dVar = this.f;
        this.d = dVar != null ? dVar.g : 0;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.e.h
    protected final long a(com.fyber.inneractive.sdk.player.c.k.k kVar) {
        int i;
        if ((kVar.a[0] & 1) == 1) {
            return -1L;
        }
        byte b = kVar.a[0];
        a aVar = this.a;
        if (!aVar.d[(b >> 1) & (255 >>> (8 - aVar.e))].a) {
            i = aVar.a.g;
        } else {
            i = aVar.a.h;
        }
        long j = this.e ? (this.d + i) / 4 : 0;
        kVar.b(kVar.c + 4);
        kVar.a[kVar.c - 4] = (byte) (j & 255);
        kVar.a[kVar.c - 3] = (byte) ((j >>> 8) & 255);
        kVar.a[kVar.c - 2] = (byte) ((j >>> 16) & 255);
        kVar.a[kVar.c - 1] = (byte) ((j >>> 24) & 255);
        this.e = true;
        this.d = i;
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0226 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0228  */
    @Override // com.fyber.inneractive.sdk.player.c.d.e.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean a(com.fyber.inneractive.sdk.player.c.k.k r21, long r22, com.fyber.inneractive.sdk.player.c.d.e.h.a r24) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.d.e.j.a(com.fyber.inneractive.sdk.player.c.k.k, long, com.fyber.inneractive.sdk.player.c.d.e.h$a):boolean");
    }

    /* loaded from: classes.dex */
    static final class a {
        public final k.d a;
        public final k.b b;
        public final byte[] c;
        public final k.c[] d;
        public final int e;

        public a(k.d dVar, k.b bVar, byte[] bArr, k.c[] cVarArr, int i) {
            this.a = dVar;
            this.b = bVar;
            this.c = bArr;
            this.d = cVarArr;
            this.e = i;
        }
    }
}
