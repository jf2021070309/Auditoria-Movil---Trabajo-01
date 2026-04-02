package com.fyber.inneractive.sdk.player.c.d.e;

import androidx.work.WorkRequest;
import com.fyber.inneractive.sdk.player.c.d.m;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a implements f {
    final long a;
    final long b;
    final h c;
    long d;
    private final e e = new e();
    private int f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;

    public a(long j, long j2, h hVar, int i, long j3) {
        com.fyber.inneractive.sdk.player.c.k.a.a(j >= 0 && j2 > j);
        this.c = hVar;
        this.a = j;
        this.b = j2;
        if (i == j2 - j) {
            this.d = j3;
            this.f = 3;
            return;
        }
        this.f = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e8  */
    @Override // com.fyber.inneractive.sdk.player.c.d.e.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(com.fyber.inneractive.sdk.player.c.d.g r20) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.d.e.a.a(com.fyber.inneractive.sdk.player.c.d.g):long");
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.e.f
    public final long a_(long j) {
        int i = this.f;
        com.fyber.inneractive.sdk.player.c.k.a.a(i == 3 || i == 2);
        long b = j == 0 ? 0L : this.c.b(j);
        this.h = b;
        this.f = 2;
        this.i = this.a;
        this.j = this.b;
        this.k = 0L;
        this.l = this.d;
        return b;
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.e.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private class C0057a implements m {
        @Override // com.fyber.inneractive.sdk.player.c.d.m
        public final boolean b_() {
            return true;
        }

        private C0057a() {
        }

        /* synthetic */ C0057a(a aVar, byte b) {
            this();
        }

        @Override // com.fyber.inneractive.sdk.player.c.d.m
        public final long a(long j) {
            if (j != 0) {
                long b = a.this.c.b(j);
                a aVar = a.this;
                long j2 = aVar.a + (((b * (aVar.b - aVar.a)) / aVar.d) - WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
                if (j2 < aVar.a) {
                    j2 = aVar.a;
                }
                return j2 >= aVar.b ? aVar.b - 1 : j2;
            }
            return a.this.a;
        }

        @Override // com.fyber.inneractive.sdk.player.c.d.m
        public final long b() {
            return a.this.c.a(a.this.d);
        }
    }

    private boolean a(com.fyber.inneractive.sdk.player.c.d.g gVar, long j) throws IOException, InterruptedException {
        int i;
        long min = Math.min(j + 3, this.b);
        int i2 = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            int i3 = 0;
            if (gVar.c() + i2 > min && (i2 = (int) (min - gVar.c())) < 4) {
                return false;
            }
            gVar.b(bArr, 0, i2, false);
            while (true) {
                i = i2 - 3;
                if (i3 < i) {
                    if (bArr[i3] == 79 && bArr[i3 + 1] == 103 && bArr[i3 + 2] == 103 && bArr[i3 + 3] == 83) {
                        gVar.b(i3);
                        return true;
                    }
                    i3++;
                }
            }
            gVar.b(i);
        }
    }

    private long a(com.fyber.inneractive.sdk.player.c.d.g gVar, long j, long j2) throws IOException, InterruptedException {
        this.e.a(gVar, false);
        while (this.e.c < j) {
            gVar.b(this.e.h + this.e.i);
            j2 = this.e.c;
            this.e.a(gVar, false);
        }
        gVar.a();
        return j2;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.e.f
    public final /* synthetic */ m a() {
        if (this.d != 0) {
            return new C0057a(this, (byte) 0);
        }
        return null;
    }
}
