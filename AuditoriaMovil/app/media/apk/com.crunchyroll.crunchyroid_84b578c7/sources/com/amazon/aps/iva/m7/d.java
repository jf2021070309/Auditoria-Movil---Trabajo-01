package com.amazon.aps.iva.m7;

import android.util.SparseArray;
import com.amazon.aps.iva.e4.t0;
import com.amazon.aps.iva.q5.h0;
import com.amazon.aps.iva.q5.r;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t5.q;
import com.amazon.aps.iva.t5.v;
import com.amazon.aps.iva.x6.f0;
import com.amazon.aps.iva.x6.i;
import com.amazon.aps.iva.x6.n;
import com.amazon.aps.iva.x6.o;
import com.amazon.aps.iva.x6.p;
import com.google.android.gms.cast.MediaError;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
/* compiled from: MatroskaExtractor.java */
/* loaded from: classes.dex */
public final class d implements n {
    public static final byte[] c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] d0 = g0.H("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    public static final byte[] e0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    public static final byte[] f0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    public static final UUID g0 = new UUID(72057594037932032L, -9223371306706625679L);
    public static final Map<String, Integer> h0;
    public long A;
    public long B;
    public q C;
    public q D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public long R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public byte Z;
    public final c a;
    public boolean a0;
    public final f b;
    public p b0;
    public final SparseArray<b> c;
    public final boolean d;
    public final v e;
    public final v f;
    public final v g;
    public final v h;
    public final v i;
    public final v j;
    public final v k;
    public final v l;
    public final v m;
    public final v n;
    public ByteBuffer o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public b u;
    public boolean v;
    public int w;
    public long x;
    public boolean y;
    public long z;

    /* compiled from: MatroskaExtractor.java */
    /* loaded from: classes.dex */
    public final class a implements com.amazon.aps.iva.m7.b {
        public a() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:487:0x0829, code lost:
            if (r0.n() == r1.getLeastSignificantBits()) goto L353;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:491:0x0830  */
        /* JADX WARN: Removed duplicated region for block: B:496:0x0844  */
        /* JADX WARN: Removed duplicated region for block: B:511:0x0874  */
        /* JADX WARN: Removed duplicated region for block: B:516:0x0890  */
        /* JADX WARN: Removed duplicated region for block: B:517:0x0892  */
        /* JADX WARN: Removed duplicated region for block: B:520:0x089f  */
        /* JADX WARN: Removed duplicated region for block: B:521:0x08ab  */
        /* JADX WARN: Removed duplicated region for block: B:580:0x09e1  */
        /* JADX WARN: Removed duplicated region for block: B:581:0x09e3  */
        /* JADX WARN: Removed duplicated region for block: B:613:0x0a6c  */
        /* JADX WARN: Type inference failed for: r0v109 */
        /* JADX WARN: Type inference failed for: r0v110, types: [java.lang.Exception] */
        /* JADX WARN: Type inference failed for: r3v18 */
        /* JADX WARN: Type inference failed for: r3v19 */
        /* JADX WARN: Type inference failed for: r3v28 */
        /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Exception] */
        /* JADX WARN: Type inference failed for: r3v31 */
        /* JADX WARN: Type inference failed for: r3v45 */
        /* JADX WARN: Type inference failed for: r3v47 */
        /* JADX WARN: Type inference failed for: r3v48 */
        /* JADX WARN: Type inference failed for: r4v12 */
        /* JADX WARN: Type inference failed for: r6v39 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(int r37) throws com.amazon.aps.iva.q5.h0 {
            /*
                Method dump skipped, instructions count: 3280
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.m7.d.a.a(int):void");
        }
    }

    /* compiled from: MatroskaExtractor.java */
    /* loaded from: classes.dex */
    public static final class b {
        public byte[] N;
        public com.amazon.aps.iva.x6.g0 T;
        public boolean U;
        public f0 X;
        public int Y;
        public String a;
        public String b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public byte[] i;
        public f0.a j;
        public byte[] k;
        public r l;
        public int m = -1;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = 0;
        public int r = -1;
        public float s = 0.0f;
        public float t = 0.0f;
        public float u = 0.0f;
        public byte[] v = null;
        public int w = -1;
        public boolean x = false;
        public int y = -1;
        public int z = -1;
        public int A = -1;
        public int B = 1000;
        public int C = MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN;
        public float D = -1.0f;
        public float E = -1.0f;
        public float F = -1.0f;
        public float G = -1.0f;
        public float H = -1.0f;
        public float I = -1.0f;
        public float J = -1.0f;
        public float K = -1.0f;
        public float L = -1.0f;
        public float M = -1.0f;
        public int O = 1;
        public int P = -1;
        public int Q = 8000;
        public long R = 0;
        public long S = 0;
        public boolean V = true;
        public String W = "eng";

        public final byte[] a(String str) throws h0 {
            byte[] bArr = this.k;
            if (bArr != null) {
                return bArr;
            }
            throw h0.a("Missing CodecPrivate for codec " + str, null);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        t0.d(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090", 180, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        h0 = Collections.unmodifiableMap(hashMap);
    }

    public d(int i) {
        boolean z;
        com.amazon.aps.iva.m7.a aVar = new com.amazon.aps.iva.m7.a();
        this.q = -1L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.a = aVar;
        aVar.d = new a();
        if ((i & 1) == 0) {
            z = true;
        } else {
            z = false;
        }
        this.d = z;
        this.b = new f();
        this.c = new SparseArray<>();
        this.g = new v(4);
        this.h = new v(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new v(4);
        this.e = new v(com.amazon.aps.iva.u5.d.a);
        this.f = new v(4);
        this.j = new v();
        this.k = new v();
        this.l = new v(8);
        this.m = new v();
        this.n = new v();
        this.L = new int[1];
    }

    public static byte[] f(long j, long j2, String str) {
        boolean z;
        if (j != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.t(z);
        int i = (int) (j / 3600000000L);
        long j3 = j - ((i * 3600) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - ((i2 * 60) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return g0.H(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2))));
    }

    public final void a(int i) throws h0 {
        if (this.C != null && this.D != null) {
            return;
        }
        throw h0.a("Element " + i + " must be in a Cues", null);
    }

    @Override // com.amazon.aps.iva.x6.n
    public final boolean b(o oVar) throws IOException {
        long a2;
        int i;
        e eVar = new e();
        i iVar = (i) oVar;
        long j = iVar.c;
        int i2 = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
        long j2 = 1024;
        if (i2 != 0 && j <= 1024) {
            j2 = j;
        }
        int i3 = (int) j2;
        v vVar = eVar.a;
        iVar.c(vVar.a, 0, 4, false);
        eVar.b = 4;
        for (long v = vVar.v(); v != 440786851; v = ((v << 8) & (-256)) | (vVar.a[0] & UnsignedBytes.MAX_VALUE)) {
            int i4 = eVar.b + 1;
            eVar.b = i4;
            if (i4 == i3) {
                return false;
            }
            iVar.c(vVar.a, 0, 1, false);
        }
        long a3 = eVar.a(iVar);
        long j3 = eVar.b;
        if (a3 == Long.MIN_VALUE) {
            return false;
        }
        if (i2 != 0 && j3 + a3 >= j) {
            return false;
        }
        while (true) {
            int i5 = (eVar.b > (j3 + a3) ? 1 : (eVar.b == (j3 + a3) ? 0 : -1));
            if (i5 < 0) {
                if (eVar.a(iVar) == Long.MIN_VALUE || (eVar.a(iVar)) < 0 || a2 > 2147483647L) {
                    return false;
                }
                if (i != 0) {
                    int i6 = (int) a2;
                    iVar.m(i6, false);
                    eVar.b += i6;
                }
            } else if (i5 != 0) {
                return false;
            } else {
                return true;
            }
        }
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void c(long j, long j2) {
        this.B = -9223372036854775807L;
        this.G = 0;
        com.amazon.aps.iva.m7.a aVar = (com.amazon.aps.iva.m7.a) this.a;
        aVar.e = 0;
        aVar.b.clear();
        f fVar = aVar.c;
        fVar.b = 0;
        fVar.c = 0;
        f fVar2 = this.b;
        fVar2.b = 0;
        fVar2.c = 0;
        j();
        int i = 0;
        while (true) {
            SparseArray<b> sparseArray = this.c;
            if (i < sparseArray.size()) {
                com.amazon.aps.iva.x6.g0 g0Var = sparseArray.valueAt(i).T;
                if (g0Var != null) {
                    g0Var.b = false;
                    g0Var.c = 0;
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void d(int i) throws h0 {
        if (this.u != null) {
            return;
        }
        throw h0.a("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cf A[EDGE_INSN: B:63:0x00cf->B:53:0x00cf ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.amazon.aps.iva.m7.d.b r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.m7.d.e(com.amazon.aps.iva.m7.d$b, long, int, int, int):void");
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void g(p pVar) {
        this.b0 = pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f6, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x04ae, code lost:
        throw com.amazon.aps.iva.q5.h0.a("EBML lacing sample size out of range.", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0788, code lost:
        throw com.amazon.aps.iva.q5.h0.a("DocTypeReadVersion " + r9 + " not supported", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x099c, code lost:
        if (r4 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x099e, code lost:
        r2 = ((com.amazon.aps.iva.x6.i) r37).d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x09a6, code lost:
        if (r36.y == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x09a8, code lost:
        r36.A = r2;
        r38.a = r36.z;
        r36.y = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x09b4, code lost:
        if (r36.v == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x09b6, code lost:
        r2 = r36.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x09bc, code lost:
        if (r2 == (-1)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x09be, code lost:
        r38.a = r2;
        r36.A = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x09c2, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x09c4, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x09c5, code lost:
        if (r3 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x09c7, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x09e4, code lost:
        if (r4 != false) goto L499;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x09e6, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x09e7, code lost:
        r1 = r36.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x09ed, code lost:
        if (r2 >= r1.size()) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x09ef, code lost:
        r1 = r1.valueAt(r2);
        r1.X.getClass();
        r3 = r1.T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x09fc, code lost:
        if (r3 == null) goto L496;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x09fe, code lost:
        r3.a(r1.X, r1.j);
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x0a05, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0a08, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x0a0a, code lost:
        return 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03ca  */
    @Override // com.amazon.aps.iva.x6.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.amazon.aps.iva.x6.o r37, com.amazon.aps.iva.x6.c0 r38) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.m7.d.h(com.amazon.aps.iva.x6.o, com.amazon.aps.iva.x6.c0):int");
    }

    public final void i(i iVar, int i) throws IOException {
        v vVar = this.g;
        if (vVar.c >= i) {
            return;
        }
        byte[] bArr = vVar.a;
        if (bArr.length < i) {
            vVar.a(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = vVar.a;
        int i2 = vVar.c;
        iVar.f(bArr2, i2, i - i2, false);
        vVar.E(i);
    }

    public final void j() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.a0 = false;
        this.j.C(0);
    }

    public final long k(long j) throws h0 {
        long j2 = this.r;
        if (j2 != -9223372036854775807L) {
            return g0.X(j, j2, 1000L);
        }
        throw h0.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public final int l(i iVar, b bVar, int i, boolean z) throws IOException {
        int b2;
        int b3;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        if ("S_TEXT/UTF8".equals(bVar.b)) {
            m(iVar, c0, i);
            int i3 = this.T;
            j();
            return i3;
        } else if ("S_TEXT/ASS".equals(bVar.b)) {
            m(iVar, e0, i);
            int i4 = this.T;
            j();
            return i4;
        } else if ("S_TEXT/WEBVTT".equals(bVar.b)) {
            m(iVar, f0, i);
            int i5 = this.T;
            j();
            return i5;
        } else {
            f0 f0Var = bVar.X;
            boolean z5 = this.V;
            boolean z6 = true;
            v vVar = this.j;
            if (!z5) {
                boolean z7 = bVar.h;
                v vVar2 = this.g;
                if (z7) {
                    this.O &= -1073741825;
                    int i6 = 128;
                    if (!this.W) {
                        iVar.f(vVar2.a, 0, 1, false);
                        this.S++;
                        byte b4 = vVar2.a[0];
                        if ((b4 & UnsignedBytes.MAX_POWER_OF_TWO) != 128) {
                            this.Z = b4;
                            this.W = true;
                        } else {
                            throw h0.a("Extension bit is set in signal byte", null);
                        }
                    }
                    byte b5 = this.Z;
                    if ((b5 & 1) == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        if ((b5 & 2) == 2) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        this.O |= Ints.MAX_POWER_OF_TWO;
                        if (!this.a0) {
                            v vVar3 = this.l;
                            iVar.f(vVar3.a, 0, 8, false);
                            this.S += 8;
                            this.a0 = true;
                            byte[] bArr = vVar2.a;
                            if (!z4) {
                                i6 = 0;
                            }
                            bArr[0] = (byte) (i6 | 8);
                            vVar2.F(0);
                            f0Var.f(1, vVar2);
                            this.T++;
                            vVar3.F(0);
                            f0Var.f(8, vVar3);
                            this.T += 8;
                        }
                        if (z4) {
                            if (!this.X) {
                                iVar.f(vVar2.a, 0, 1, false);
                                this.S++;
                                vVar2.F(0);
                                this.Y = vVar2.u();
                                this.X = true;
                            }
                            int i7 = this.Y * 4;
                            vVar2.C(i7);
                            iVar.f(vVar2.a, 0, i7, false);
                            this.S += i7;
                            short s = (short) ((this.Y / 2) + 1);
                            int i8 = (s * 6) + 2;
                            ByteBuffer byteBuffer = this.o;
                            if (byteBuffer == null || byteBuffer.capacity() < i8) {
                                this.o = ByteBuffer.allocate(i8);
                            }
                            this.o.position(0);
                            this.o.putShort(s);
                            int i9 = 0;
                            int i10 = 0;
                            while (true) {
                                i2 = this.Y;
                                if (i9 >= i2) {
                                    break;
                                }
                                int x = vVar2.x();
                                if (i9 % 2 == 0) {
                                    this.o.putShort((short) (x - i10));
                                } else {
                                    this.o.putInt(x - i10);
                                }
                                i9++;
                                i10 = x;
                            }
                            int i11 = (i - this.S) - i10;
                            if (i2 % 2 == 1) {
                                this.o.putInt(i11);
                            } else {
                                this.o.putShort((short) i11);
                                this.o.putInt(0);
                            }
                            byte[] array = this.o.array();
                            v vVar4 = this.m;
                            vVar4.D(i8, array);
                            f0Var.f(i8, vVar4);
                            this.T += i8;
                        }
                    }
                } else {
                    byte[] bArr2 = bVar.i;
                    if (bArr2 != null) {
                        vVar.D(bArr2.length, bArr2);
                    }
                }
                if ("A_OPUS".equals(bVar.b)) {
                    z2 = z;
                } else if (bVar.f > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    this.O |= 268435456;
                    this.n.C(0);
                    int i12 = (vVar.c + i) - this.S;
                    vVar2.C(4);
                    byte[] bArr3 = vVar2.a;
                    bArr3[0] = (byte) ((i12 >> 24) & 255);
                    bArr3[1] = (byte) ((i12 >> 16) & 255);
                    bArr3[2] = (byte) ((i12 >> 8) & 255);
                    bArr3[3] = (byte) (i12 & 255);
                    f0Var.f(4, vVar2);
                    this.T += 4;
                }
                this.V = true;
            }
            int i13 = i + vVar.c;
            if (!"V_MPEG4/ISO/AVC".equals(bVar.b) && !"V_MPEGH/ISO/HEVC".equals(bVar.b)) {
                if (bVar.T != null) {
                    if (vVar.c != 0) {
                        z6 = false;
                    }
                    com.amazon.aps.iva.cq.b.C(z6);
                    bVar.T.c(iVar);
                }
                while (true) {
                    int i14 = this.S;
                    if (i14 >= i13) {
                        break;
                    }
                    int i15 = i13 - i14;
                    int i16 = vVar.c - vVar.b;
                    if (i16 > 0) {
                        b3 = Math.min(i15, i16);
                        f0Var.a(b3, vVar);
                    } else {
                        b3 = f0Var.b(iVar, i15, false);
                    }
                    this.S += b3;
                    this.T += b3;
                }
            } else {
                v vVar5 = this.f;
                byte[] bArr4 = vVar5.a;
                bArr4[0] = 0;
                bArr4[1] = 0;
                bArr4[2] = 0;
                int i17 = bVar.Y;
                int i18 = 4 - i17;
                while (this.S < i13) {
                    int i19 = this.U;
                    if (i19 == 0) {
                        int min = Math.min(i17, vVar.c - vVar.b);
                        iVar.f(bArr4, i18 + min, i17 - min, false);
                        if (min > 0) {
                            vVar.d(i18, bArr4, min);
                        }
                        this.S += i17;
                        vVar5.F(0);
                        this.U = vVar5.x();
                        v vVar6 = this.e;
                        vVar6.F(0);
                        f0Var.a(4, vVar6);
                        this.T += 4;
                    } else {
                        int i20 = vVar.c - vVar.b;
                        if (i20 > 0) {
                            b2 = Math.min(i19, i20);
                            f0Var.a(b2, vVar);
                        } else {
                            b2 = f0Var.b(iVar, i19, false);
                        }
                        this.S += b2;
                        this.T += b2;
                        this.U -= b2;
                    }
                }
            }
            if ("A_VORBIS".equals(bVar.b)) {
                v vVar7 = this.h;
                vVar7.F(0);
                f0Var.a(4, vVar7);
                this.T += 4;
            }
            int i21 = this.T;
            j();
            return i21;
        }
    }

    public final void m(i iVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length + i;
        v vVar = this.k;
        byte[] bArr2 = vVar.a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i);
            vVar.D(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        iVar.f(vVar.a, bArr.length, i, false);
        vVar.F(0);
        vVar.E(length);
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void release() {
    }
}
