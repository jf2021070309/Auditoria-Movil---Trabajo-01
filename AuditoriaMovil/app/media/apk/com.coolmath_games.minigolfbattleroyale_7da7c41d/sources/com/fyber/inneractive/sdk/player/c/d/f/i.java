package com.fyber.inneractive.sdk.player.c.d.f;

import com.fyber.inneractive.sdk.player.c.d.f.v;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class i implements h {
    private static final double[] c = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String a;
    private com.fyber.inneractive.sdk.player.c.d.n b;
    private boolean d;
    private long e;
    private final boolean[] f = new boolean[4];
    private final a g = new a();
    private boolean h;
    private long i;
    private long j;
    private boolean k;
    private boolean l;
    private long m;
    private long n;

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void a() {
        com.fyber.inneractive.sdk.player.c.k.i.a(this.f);
        a aVar = this.g;
        aVar.a = false;
        aVar.b = 0;
        aVar.c = 0;
        this.k = false;
        this.h = false;
        this.i = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void a(com.fyber.inneractive.sdk.player.c.d.h hVar, v.d dVar) {
        dVar.a();
        this.a = dVar.c();
        this.b = hVar.a(dVar.b());
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    public final void a(long j, boolean z) {
        boolean z2 = j != -9223372036854775807L;
        this.k = z2;
        if (z2) {
            this.j = j;
        }
    }

    /* loaded from: classes.dex */
    private static final class a {
        boolean a;
        public int b;
        public int c;
        public byte[] d = new byte[128];

        public final void a(byte[] bArr, int i, int i2) {
            if (this.a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.d;
                int length = bArr2.length;
                int i4 = this.b;
                if (length < i4 + i3) {
                    this.d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.d, this.b, i3);
                this.b += i3;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016e A[ADDED_TO_REGION, SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.player.c.d.f.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.fyber.inneractive.sdk.player.c.k.k r20) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.d.f.i.a(com.fyber.inneractive.sdk.player.c.k.k):void");
    }
}
