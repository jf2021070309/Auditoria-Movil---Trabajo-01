package com.amazon.aps.iva.a8;

import com.amazon.aps.iva.q5.h0;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t5.v;
import com.amazon.aps.iva.x6.f0;
import com.amazon.aps.iva.x6.i;
import com.amazon.aps.iva.x6.n;
import com.amazon.aps.iva.x6.o;
import com.amazon.aps.iva.x6.p;
import java.io.IOException;
import okhttp3.internal.http.StatusLine;
/* compiled from: WavExtractor.java */
/* loaded from: classes.dex */
public final class a implements n {
    public p a;
    public f0 b;
    public b e;
    public int c = 0;
    public long d = -1;
    public int f = -1;
    public long g = -1;

    /* compiled from: WavExtractor.java */
    /* renamed from: com.amazon.aps.iva.a8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0107a implements b {
        public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, StatusLine.HTTP_TEMP_REDIRECT, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
        public final p a;
        public final f0 b;
        public final com.amazon.aps.iva.a8.b c;
        public final int d;
        public final byte[] e;
        public final v f;
        public final int g;
        public final com.amazon.aps.iva.q5.v h;
        public int i;
        public long j;
        public int k;
        public long l;

        public C0107a(p pVar, f0 f0Var, com.amazon.aps.iva.a8.b bVar) throws h0 {
            this.a = pVar;
            this.b = f0Var;
            this.c = bVar;
            int i = bVar.b;
            int max = Math.max(1, i / 10);
            this.g = max;
            v vVar = new v(bVar.e);
            vVar.m();
            int m2 = vVar.m();
            this.d = m2;
            int i2 = bVar.a;
            int i3 = bVar.c;
            int i4 = (((i3 - (i2 * 4)) * 8) / (bVar.d * i2)) + 1;
            if (m2 == i4) {
                int i5 = g0.a;
                int i6 = ((max + m2) - 1) / m2;
                this.e = new byte[i6 * i3];
                this.f = new v(m2 * 2 * i2 * i6);
                int i7 = ((i3 * i) * 8) / m2;
                v.a aVar = new v.a();
                aVar.k = "audio/raw";
                aVar.f = i7;
                aVar.g = i7;
                aVar.l = max * 2 * i2;
                aVar.x = i2;
                aVar.y = i;
                aVar.z = 2;
                this.h = new com.amazon.aps.iva.q5.v(aVar);
                return;
            }
            throw h0.a("Expected frames per block: " + i4 + "; got: " + m2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0166  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0049 -> B:12:0x004b). Please submit an issue!!! */
        @Override // com.amazon.aps.iva.a8.a.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean a(com.amazon.aps.iva.x6.i r25, long r26) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 375
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.a8.a.C0107a.a(com.amazon.aps.iva.x6.i, long):boolean");
        }

        @Override // com.amazon.aps.iva.a8.a.b
        public final void b(int i, long j) {
            this.a.m(new d(this.c, this.d, i, j));
            this.b.c(this.h);
        }

        @Override // com.amazon.aps.iva.a8.a.b
        public final void c(long j) {
            this.i = 0;
            this.j = j;
            this.k = 0;
            this.l = 0L;
        }

        public final void d(int i) {
            long j = this.j;
            long j2 = this.l;
            com.amazon.aps.iva.a8.b bVar = this.c;
            long X = j + g0.X(j2, 1000000L, bVar.b);
            int i2 = i * 2 * bVar.a;
            this.b.d(X, 1, i2, this.k - i2, null);
            this.l += i;
            this.k -= i2;
        }
    }

    /* compiled from: WavExtractor.java */
    /* loaded from: classes.dex */
    public interface b {
        boolean a(i iVar, long j) throws IOException;

        void b(int i, long j) throws h0;

        void c(long j);
    }

    /* compiled from: WavExtractor.java */
    /* loaded from: classes.dex */
    public static final class c implements b {
        public final p a;
        public final f0 b;
        public final com.amazon.aps.iva.a8.b c;
        public final com.amazon.aps.iva.q5.v d;
        public final int e;
        public long f;
        public int g;
        public long h;

        public c(p pVar, f0 f0Var, com.amazon.aps.iva.a8.b bVar, String str, int i) throws h0 {
            this.a = pVar;
            this.b = f0Var;
            this.c = bVar;
            int i2 = bVar.d;
            int i3 = bVar.a;
            int i4 = (i2 * i3) / 8;
            int i5 = bVar.c;
            if (i5 == i4) {
                int i6 = bVar.b;
                int i7 = i6 * i4;
                int i8 = i7 * 8;
                int max = Math.max(i4, i7 / 10);
                this.e = max;
                v.a aVar = new v.a();
                aVar.k = str;
                aVar.f = i8;
                aVar.g = i8;
                aVar.l = max;
                aVar.x = i3;
                aVar.y = i6;
                aVar.z = i;
                this.d = new com.amazon.aps.iva.q5.v(aVar);
                return;
            }
            throw h0.a("Expected block size: " + i4 + "; got: " + i5, null);
        }

        @Override // com.amazon.aps.iva.a8.a.b
        public final boolean a(i iVar, long j) throws IOException {
            int i;
            com.amazon.aps.iva.a8.b bVar;
            int i2;
            int i3;
            long j2 = j;
            while (true) {
                i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                if (i <= 0 || (i2 = this.g) >= (i3 = this.e)) {
                    break;
                }
                int b = this.b.b(iVar, (int) Math.min(i3 - i2, j2), true);
                if (b == -1) {
                    j2 = 0;
                } else {
                    this.g += b;
                    j2 -= b;
                }
            }
            int i4 = this.c.c;
            int i5 = this.g / i4;
            if (i5 > 0) {
                int i6 = i5 * i4;
                int i7 = this.g - i6;
                this.b.d(this.f + g0.X(this.h, 1000000L, bVar.b), 1, i6, i7, null);
                this.h += i5;
                this.g = i7;
            }
            if (i <= 0) {
                return true;
            }
            return false;
        }

        @Override // com.amazon.aps.iva.a8.a.b
        public final void b(int i, long j) {
            this.a.m(new d(this.c, 1, i, j));
            this.b.c(this.d);
        }

        @Override // com.amazon.aps.iva.a8.a.b
        public final void c(long j) {
            this.f = j;
            this.g = 0;
            this.h = 0L;
        }
    }

    @Override // com.amazon.aps.iva.x6.n
    public final boolean b(o oVar) throws IOException {
        return com.amazon.aps.iva.a8.c.a((i) oVar);
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void c(long j, long j2) {
        int i;
        if (j == 0) {
            i = 0;
        } else {
            i = 4;
        }
        this.c = i;
        b bVar = this.e;
        if (bVar != null) {
            bVar.c(j2);
        }
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void g(p pVar) {
        this.a = pVar;
        this.b = pVar.r(0, 1);
        pVar.o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0162, code lost:
        if (r9 != 65534) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0167, code lost:
        if (r1 == 32) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018e  */
    @Override // com.amazon.aps.iva.x6.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.amazon.aps.iva.x6.o r24, com.amazon.aps.iva.x6.c0 r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.a8.a.h(com.amazon.aps.iva.x6.o, com.amazon.aps.iva.x6.c0):int");
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void release() {
    }
}
