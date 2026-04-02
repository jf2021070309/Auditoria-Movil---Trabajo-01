package com.amazon.aps.iva.p7;

import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.x6.d0;
import com.amazon.aps.iva.x6.e0;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import java.math.BigInteger;
/* compiled from: DefaultOggSeeker.java */
/* loaded from: classes.dex */
public final class a implements f {
    public final e a;
    public final long b;
    public final long c;
    public final h d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;

    /* compiled from: DefaultOggSeeker.java */
    /* renamed from: com.amazon.aps.iva.p7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0606a implements d0 {
        public C0606a() {
        }

        @Override // com.amazon.aps.iva.x6.d0
        public final d0.a d(long j) {
            a aVar = a.this;
            BigInteger valueOf = BigInteger.valueOf((aVar.d.i * j) / 1000000);
            long j2 = aVar.c;
            long j3 = aVar.b;
            e0 e0Var = new e0(j, g0.j((valueOf.multiply(BigInteger.valueOf(j2 - j3)).divide(BigInteger.valueOf(aVar.f)).longValue() + j3) - NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS, aVar.b, j2 - 1));
            return new d0.a(e0Var, e0Var);
        }

        @Override // com.amazon.aps.iva.x6.d0
        public final boolean f() {
            return true;
        }

        @Override // com.amazon.aps.iva.x6.d0
        public final long i() {
            a aVar = a.this;
            return (aVar.f * 1000000) / aVar.d.i;
        }
    }

    public a(h hVar, long j, long j2, long j3, long j4, boolean z) {
        boolean z2;
        if (j >= 0 && j2 > j) {
            z2 = true;
        } else {
            z2 = false;
        }
        com.amazon.aps.iva.cq.b.t(z2);
        this.d = hVar;
        this.b = j;
        this.c = j2;
        if (j3 != j2 - j && !z) {
            this.e = 0;
        } else {
            this.f = j4;
            this.e = 4;
        }
        this.a = new e();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    @Override // com.amazon.aps.iva.p7.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(com.amazon.aps.iva.x6.i r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.p7.a.a(com.amazon.aps.iva.x6.i):long");
    }

    @Override // com.amazon.aps.iva.p7.f
    public final d0 b() {
        if (this.f != 0) {
            return new C0606a();
        }
        return null;
    }

    @Override // com.amazon.aps.iva.p7.f
    public final void c(long j) {
        this.h = g0.j(j, 0L, this.f - 1);
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }
}
