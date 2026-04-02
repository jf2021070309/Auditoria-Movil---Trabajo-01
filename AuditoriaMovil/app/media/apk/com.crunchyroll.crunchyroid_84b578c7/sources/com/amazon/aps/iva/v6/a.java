package com.amazon.aps.iva.v6;

import java.util.Arrays;
/* compiled from: FixedFrameRateEstimator.java */
/* loaded from: classes.dex */
public final class a {
    public boolean c;
    public int e;
    public C0785a a = new C0785a();
    public C0785a b = new C0785a();
    public long d = -9223372036854775807L;

    /* compiled from: FixedFrameRateEstimator.java */
    /* renamed from: com.amazon.aps.iva.v6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0785a {
        public long a;
        public long b;
        public long c;
        public long d;
        public long e;
        public long f;
        public final boolean[] g = new boolean[15];
        public int h;

        public final boolean a() {
            if (this.d > 15 && this.h == 0) {
                return true;
            }
            return false;
        }

        public final void b(long j) {
            long j2 = this.d;
            if (j2 == 0) {
                this.a = j;
            } else if (j2 == 1) {
                long j3 = j - this.a;
                this.b = j3;
                this.f = j3;
                this.e = 1L;
            } else {
                long j4 = j - this.c;
                int i = (int) (j2 % 15);
                int i2 = (Math.abs(j4 - this.b) > 1000000L ? 1 : (Math.abs(j4 - this.b) == 1000000L ? 0 : -1));
                boolean[] zArr = this.g;
                if (i2 <= 0) {
                    this.e++;
                    this.f += j4;
                    if (zArr[i]) {
                        zArr[i] = false;
                        this.h--;
                    }
                } else if (!zArr[i]) {
                    zArr[i] = true;
                    this.h++;
                }
            }
            this.d++;
            this.c = j;
        }

        public final void c() {
            this.d = 0L;
            this.e = 0L;
            this.f = 0L;
            this.h = 0;
            Arrays.fill(this.g, false);
        }
    }

    public final boolean a() {
        return this.a.a();
    }
}
