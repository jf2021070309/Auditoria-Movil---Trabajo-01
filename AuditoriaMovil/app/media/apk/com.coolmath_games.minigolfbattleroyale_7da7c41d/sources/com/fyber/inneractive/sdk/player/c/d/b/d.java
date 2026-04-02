package com.fyber.inneractive.sdk.player.c.d.b;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.work.impl.Scheduler;
import com.fyber.inneractive.sdk.player.c.d.g;
import com.fyber.inneractive.sdk.player.c.d.h;
import com.fyber.inneractive.sdk.player.c.d.i;
import com.fyber.inneractive.sdk.player.c.d.m;
import com.fyber.inneractive.sdk.player.c.d.n;
import com.fyber.inneractive.sdk.player.c.k.k;
import com.fyber.inneractive.sdk.player.c.k.t;
import com.fyber.inneractive.sdk.player.c.l;
import com.google.firebase.FirebaseError;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.time.DurationKt;
/* loaded from: classes.dex */
public final class d implements com.fyber.inneractive.sdk.player.c.d.f {
    int[] A;
    int B;
    int C;
    int D;
    boolean E;
    h F;
    private final com.fyber.inneractive.sdk.player.c.d.b.b J;
    private final k K;
    private final k L;
    private final k M;
    private final k N;
    private final k O;
    private final k P;
    private final k Q;
    private ByteBuffer R;
    private long S;
    private int T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private byte Y;
    private int Z;
    private int aa;
    private int ab;
    private boolean ac;
    final f b;
    final SparseArray<b> c;
    final boolean d;
    final k e;
    final k f;
    long g;
    long h;
    long i;
    long j;
    long k;
    b l;
    boolean m;
    int n;
    long o;
    boolean p;
    long q;
    long r;
    com.fyber.inneractive.sdk.player.c.k.f s;
    com.fyber.inneractive.sdk.player.c.k.f t;
    boolean u;
    int v;
    long w;
    long x;
    int y;
    int z;
    public static final i a = new i() { // from class: com.fyber.inneractive.sdk.player.c.d.b.d.1
        @Override // com.fyber.inneractive.sdk.player.c.d.i
        public final com.fyber.inneractive.sdk.player.c.d.f[] a() {
            return new com.fyber.inneractive.sdk.player.c.d.f[]{new d()};
        }
    };
    private static final byte[] G = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] H = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    private static final UUID I = new UUID(72057594037932032L, -9223371306706625679L);

    static int a(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    static boolean b(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    public d() {
        this(0);
    }

    public d(int i) {
        this(new com.fyber.inneractive.sdk.player.c.d.b.a(), i);
    }

    private d(com.fyber.inneractive.sdk.player.c.d.b.b bVar, int i) {
        this.h = -1L;
        this.i = -9223372036854775807L;
        this.j = -9223372036854775807L;
        this.k = -9223372036854775807L;
        this.q = -1L;
        this.S = -1L;
        this.r = -9223372036854775807L;
        this.J = bVar;
        bVar.a(new a(this, (byte) 0));
        this.d = (i & 1) == 0;
        this.b = new f();
        this.c = new SparseArray<>();
        this.e = new k(4);
        this.M = new k(ByteBuffer.allocate(4).putInt(-1).array());
        this.f = new k(4);
        this.K = new k(com.fyber.inneractive.sdk.player.c.k.i.a);
        this.L = new k(4);
        this.N = new k();
        this.O = new k();
        this.P = new k(8);
        this.Q = new k();
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final boolean a(g gVar) throws IOException, InterruptedException {
        long a2;
        int i;
        e eVar = new e();
        long d = gVar.d();
        int i2 = (d > (-1L) ? 1 : (d == (-1L) ? 0 : -1));
        long j = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        if (i2 != 0 && d <= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j = d;
        }
        int i3 = (int) j;
        gVar.c(eVar.a.a, 0, 4);
        long h = eVar.a.h();
        eVar.b = 4;
        while (true) {
            if (h != 440786851) {
                int i4 = eVar.b + 1;
                eVar.b = i4;
                if (i4 == i3) {
                    break;
                }
                gVar.c(eVar.a.a, 0, 1);
                h = (eVar.a.a[0] & UByte.MAX_VALUE) | ((h << 8) & (-256));
            } else {
                long a3 = eVar.a(gVar);
                long j2 = eVar.b;
                if (a3 != Long.MIN_VALUE && (i2 == 0 || j2 + a3 < d)) {
                    while (true) {
                        long j3 = j2 + a3;
                        if (eVar.b < j3) {
                            if (eVar.a(gVar) == Long.MIN_VALUE || (a2 = eVar.a(gVar)) < 0 || a2 > 2147483647L) {
                                break;
                            } else if (i != 0) {
                                gVar.c((int) a2);
                                eVar.b = (int) (eVar.b + a2);
                            }
                        } else if (eVar.b == j3) {
                            return true;
                        }
                    }
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final void a(h hVar) {
        this.F = hVar;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final void a(long j, long j2) {
        this.r = -9223372036854775807L;
        this.v = 0;
        this.J.a();
        this.b.a();
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0039 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0005 A[SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.player.c.d.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.fyber.inneractive.sdk.player.c.d.g r9, com.fyber.inneractive.sdk.player.c.d.l r10) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r8 = this;
            r0 = 0
            r8.ac = r0
            r1 = 1
            r2 = r1
        L5:
            if (r2 == 0) goto L3a
            boolean r3 = r8.ac
            if (r3 != 0) goto L3a
            com.fyber.inneractive.sdk.player.c.d.b.b r2 = r8.J
            boolean r2 = r2.a(r9)
            if (r2 == 0) goto L5
            long r3 = r9.c()
            boolean r5 = r8.p
            if (r5 == 0) goto L25
            r8.S = r3
            long r3 = r8.q
            r10.a = r3
            r8.p = r0
        L23:
            r3 = r1
            goto L37
        L25:
            boolean r3 = r8.m
            if (r3 == 0) goto L36
            long r3 = r8.S
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L36
            r10.a = r3
            r8.S = r5
            goto L23
        L36:
            r3 = r0
        L37:
            if (r3 == 0) goto L5
            return r1
        L3a:
            if (r2 == 0) goto L3d
            return r0
        L3d:
            r9 = -1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.d.b.d.a(com.fyber.inneractive.sdk.player.c.d.g, com.fyber.inneractive.sdk.player.c.d.l):int");
    }

    final void a(b bVar, long j) {
        int i;
        byte[] c;
        if ("S_TEXT/UTF8".equals(bVar.a)) {
            byte[] bArr = this.O.a;
            long j2 = this.x;
            if (j2 == -9223372036854775807L) {
                c = H;
            } else {
                int i2 = (int) (j2 / 3600000000L);
                long j3 = j2 - (i2 * 3600000000L);
                int i3 = (int) (j3 / 60000000);
                long j4 = j3 - (60000000 * i3);
                c = t.c(String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) (j4 / 1000000)), Integer.valueOf((int) ((j4 - (DurationKt.NANOS_IN_MILLIS * i)) / 1000))));
            }
            System.arraycopy(c, 0, bArr, 19, 12);
            n nVar = bVar.O;
            k kVar = this.O;
            nVar.a(kVar, kVar.c);
            this.ab += this.O.c;
        }
        bVar.O.a(j, this.D, this.ab, 0, bVar.g);
        this.ac = true;
        b();
    }

    private void b() {
        this.T = 0;
        this.ab = 0;
        this.aa = 0;
        this.U = false;
        this.V = false;
        this.X = false;
        this.Z = 0;
        this.Y = (byte) 0;
        this.W = false;
        this.N.a();
    }

    final void a(g gVar, int i) throws IOException, InterruptedException {
        if (this.e.c >= i) {
            return;
        }
        if (this.e.c() < i) {
            k kVar = this.e;
            kVar.a(Arrays.copyOf(kVar.a, Math.max(this.e.a.length * 2, i)), this.e.c);
        }
        gVar.b(this.e.a, this.e.c, i - this.e.c);
        this.e.b(i);
    }

    final void a(g gVar, b bVar, int i) throws IOException, InterruptedException {
        int i2;
        if ("S_TEXT/UTF8".equals(bVar.a)) {
            int length = G.length + i;
            if (this.O.c() < length) {
                this.O.a = Arrays.copyOf(G, length + i);
            }
            gVar.b(this.O.a, G.length, i);
            this.O.c(0);
            this.O.b(length);
            return;
        }
        n nVar = bVar.O;
        if (!this.U) {
            if (bVar.e) {
                this.D &= -1073741825;
                if (!this.V) {
                    gVar.b(this.e.a, 0, 1);
                    this.T++;
                    if ((this.e.a[0] & ByteCompanionObject.MIN_VALUE) == 128) {
                        throw new l("Extension bit is set in signal byte");
                    }
                    this.Y = this.e.a[0];
                    this.V = true;
                }
                if ((this.Y & 1) == 1) {
                    boolean z = (this.Y & 2) == 2;
                    this.D |= 1073741824;
                    if (!this.W) {
                        gVar.b(this.P.a, 0, 8);
                        this.T += 8;
                        this.W = true;
                        this.e.a[0] = (byte) ((z ? 128 : 0) | 8);
                        this.e.c(0);
                        nVar.a(this.e, 1);
                        this.ab++;
                        this.P.c(0);
                        nVar.a(this.P, 8);
                        this.ab += 8;
                    }
                    if (z) {
                        if (!this.X) {
                            gVar.b(this.e.a, 0, 1);
                            this.T++;
                            this.e.c(0);
                            this.Z = this.e.d();
                            this.X = true;
                        }
                        int i3 = this.Z * 4;
                        this.e.a(i3);
                        gVar.b(this.e.a, 0, i3);
                        this.T += i3;
                        short s = (short) ((this.Z / 2) + 1);
                        int i4 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.R;
                        if (byteBuffer == null || byteBuffer.capacity() < i4) {
                            this.R = ByteBuffer.allocate(i4);
                        }
                        this.R.position(0);
                        this.R.putShort(s);
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            i2 = this.Z;
                            if (i5 >= i2) {
                                break;
                            }
                            int n = this.e.n();
                            if (i5 % 2 == 0) {
                                this.R.putShort((short) (n - i6));
                            } else {
                                this.R.putInt(n - i6);
                            }
                            i5++;
                            i6 = n;
                        }
                        int i7 = (i - this.T) - i6;
                        if (i2 % 2 == 1) {
                            this.R.putInt(i7);
                        } else {
                            this.R.putShort((short) i7);
                            this.R.putInt(0);
                        }
                        this.Q.a(this.R.array(), i4);
                        nVar.a(this.Q, i4);
                        this.ab += i4;
                    }
                }
            } else if (bVar.f != null) {
                this.N.a(bVar.f, bVar.f.length);
            }
            this.U = true;
        }
        int i8 = i + this.N.c;
        if (!"V_MPEG4/ISO/AVC".equals(bVar.a) && !"V_MPEGH/ISO/HEVC".equals(bVar.a)) {
            while (true) {
                int i9 = this.T;
                if (i9 >= i8) {
                    break;
                }
                a(gVar, nVar, i8 - i9);
            }
        } else {
            byte[] bArr = this.L.a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i10 = bVar.P;
            int i11 = 4 - bVar.P;
            while (this.T < i8) {
                int i12 = this.aa;
                if (i12 != 0) {
                    this.aa = i12 - a(gVar, nVar, i12);
                } else {
                    int min = Math.min(i10, this.N.b());
                    gVar.b(bArr, i11 + min, i10 - min);
                    if (min > 0) {
                        this.N.a(bArr, i11, min);
                    }
                    this.T += i10;
                    this.L.c(0);
                    this.aa = this.L.n();
                    this.K.c(0);
                    nVar.a(this.K, 4);
                    this.ab += 4;
                }
            }
        }
        if ("A_VORBIS".equals(bVar.a)) {
            this.M.c(0);
            nVar.a(this.M, 4);
            this.ab += 4;
        }
    }

    private int a(g gVar, n nVar, int i) throws IOException, InterruptedException {
        int a2;
        int b2 = this.N.b();
        if (b2 > 0) {
            a2 = Math.min(i, b2);
            nVar.a(this.N, a2);
        } else {
            a2 = nVar.a(gVar, i, false);
        }
        this.T += a2;
        this.ab += a2;
        return a2;
    }

    final long a(long j) throws l {
        long j2 = this.i;
        if (j2 == -9223372036854775807L) {
            throw new l("Can't scale timecode prior to timecodeScale being set.");
        }
        return t.a(j, j2, 1000L);
    }

    static int[] a(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        return iArr.length >= i ? iArr : new int[Math.max(iArr.length * 2, i)];
    }

    /* loaded from: classes.dex */
    private final class a implements c {
        private a() {
        }

        /* synthetic */ a(d dVar, byte b) {
            this();
        }

        @Override // com.fyber.inneractive.sdk.player.c.d.b.c
        public final int a(int i) {
            return d.a(i);
        }

        @Override // com.fyber.inneractive.sdk.player.c.d.b.c
        public final boolean b(int i) {
            return d.b(i);
        }

        @Override // com.fyber.inneractive.sdk.player.c.d.b.c
        public final void a(int i, long j, long j2) throws l {
            d dVar = d.this;
            if (i == 160) {
                dVar.E = false;
            } else if (i == 174) {
                dVar.l = new b((byte) 0);
            } else if (i == 187) {
                dVar.u = false;
            } else if (i == 19899) {
                dVar.n = -1;
                dVar.o = -1L;
            } else if (i == 20533) {
                dVar.l.e = true;
            } else if (i == 21968) {
                dVar.l.q = true;
            } else if (i == 408125543) {
                if (dVar.h != -1 && dVar.h != j) {
                    throw new l("Multiple Segment elements not supported");
                }
                dVar.h = j;
                dVar.g = j2;
            } else if (i == 475249515) {
                dVar.s = new com.fyber.inneractive.sdk.player.c.k.f();
                dVar.t = new com.fyber.inneractive.sdk.player.c.k.f();
            } else if (i == 524531317 && !dVar.m) {
                if (dVar.d && dVar.q != -1) {
                    dVar.p = true;
                    return;
                }
                dVar.F.a(new m.a(dVar.k));
                dVar.m = true;
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:281:0x052f  */
        /* JADX WARN: Removed duplicated region for block: B:282:0x0532  */
        /* JADX WARN: Removed duplicated region for block: B:285:0x053c  */
        /* JADX WARN: Removed duplicated region for block: B:286:0x0560  */
        @Override // com.fyber.inneractive.sdk.player.c.d.b.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void c(int r32) throws com.fyber.inneractive.sdk.player.c.l {
            /*
                Method dump skipped, instructions count: 1978
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.d.b.d.a.c(int):void");
        }

        @Override // com.fyber.inneractive.sdk.player.c.d.b.c
        public final void a(int i, long j) throws l {
            d dVar = d.this;
            if (i == 20529) {
                if (j == 0) {
                    return;
                }
                throw new l("ContentEncodingOrder " + j + " not supported");
            } else if (i == 20530) {
                if (j == 1) {
                    return;
                }
                throw new l("ContentEncodingScope " + j + " not supported");
            } else {
                switch (i) {
                    case 131:
                        dVar.l.c = (int) j;
                        return;
                    case 136:
                        dVar.l.L = j == 1;
                        return;
                    case 155:
                        dVar.x = dVar.a(j);
                        return;
                    case 159:
                        dVar.l.G = (int) j;
                        return;
                    case 176:
                        dVar.l.j = (int) j;
                        return;
                    case 179:
                        dVar.s.a(dVar.a(j));
                        return;
                    case 186:
                        dVar.l.k = (int) j;
                        return;
                    case 215:
                        dVar.l.b = (int) j;
                        return;
                    case 231:
                        dVar.r = dVar.a(j);
                        return;
                    case 241:
                        if (dVar.u) {
                            return;
                        }
                        dVar.t.a(j);
                        dVar.u = true;
                        return;
                    case 251:
                        dVar.E = true;
                        return;
                    case 16980:
                        if (j == 3) {
                            return;
                        }
                        throw new l("ContentCompAlgo " + j + " not supported");
                    case 17029:
                        if (j < 1 || j > 2) {
                            throw new l("DocTypeReadVersion " + j + " not supported");
                        }
                        return;
                    case 17143:
                        if (j == 1) {
                            return;
                        }
                        throw new l("EBMLReadVersion " + j + " not supported");
                    case 18401:
                        if (j == 5) {
                            return;
                        }
                        throw new l("ContentEncAlgo " + j + " not supported");
                    case 18408:
                        if (j == 1) {
                            return;
                        }
                        throw new l("AESSettingsCipherMode " + j + " not supported");
                    case 21420:
                        dVar.o = j + dVar.h;
                        return;
                    case 21432:
                        int i2 = (int) j;
                        if (i2 == 0) {
                            dVar.l.p = 0;
                            return;
                        } else if (i2 == 1) {
                            dVar.l.p = 2;
                            return;
                        } else if (i2 == 3) {
                            dVar.l.p = 1;
                            return;
                        } else if (i2 != 15) {
                            return;
                        } else {
                            dVar.l.p = 3;
                            return;
                        }
                    case 21680:
                        dVar.l.l = (int) j;
                        return;
                    case 21682:
                        dVar.l.n = (int) j;
                        return;
                    case 21690:
                        dVar.l.m = (int) j;
                        return;
                    case 21930:
                        dVar.l.M = j == 1;
                        return;
                    case 22186:
                        dVar.l.J = j;
                        return;
                    case 22203:
                        dVar.l.K = j;
                        return;
                    case 25188:
                        dVar.l.H = (int) j;
                        return;
                    case 2352003:
                        dVar.l.d = (int) j;
                        return;
                    case 2807729:
                        dVar.i = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                int i3 = (int) j;
                                if (i3 == 1) {
                                    dVar.l.t = 2;
                                    return;
                                } else if (i3 != 2) {
                                    return;
                                } else {
                                    dVar.l.t = 1;
                                    return;
                                }
                            case 21946:
                                int i4 = (int) j;
                                if (i4 != 1) {
                                    if (i4 == 16) {
                                        dVar.l.s = 6;
                                        return;
                                    } else if (i4 == 18) {
                                        dVar.l.s = 7;
                                        return;
                                    } else if (i4 != 6 && i4 != 7) {
                                        return;
                                    }
                                }
                                dVar.l.s = 3;
                                return;
                            case 21947:
                                dVar.l.q = true;
                                int i5 = (int) j;
                                if (i5 == 1) {
                                    dVar.l.r = 1;
                                    return;
                                } else if (i5 == 9) {
                                    dVar.l.r = 6;
                                    return;
                                } else if (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) {
                                    dVar.l.r = 2;
                                    return;
                                } else {
                                    return;
                                }
                            case 21948:
                                dVar.l.u = (int) j;
                                return;
                            case 21949:
                                dVar.l.v = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            }
        }

        @Override // com.fyber.inneractive.sdk.player.c.d.b.c
        public final void a(int i, double d) throws l {
            d dVar = d.this;
            if (i == 181) {
                dVar.l.I = (int) d;
            } else if (i == 17545) {
                dVar.j = (long) d;
            } else {
                switch (i) {
                    case 21969:
                        dVar.l.w = (float) d;
                        return;
                    case 21970:
                        dVar.l.x = (float) d;
                        return;
                    case 21971:
                        dVar.l.y = (float) d;
                        return;
                    case 21972:
                        dVar.l.z = (float) d;
                        return;
                    case 21973:
                        dVar.l.A = (float) d;
                        return;
                    case 21974:
                        dVar.l.B = (float) d;
                        return;
                    case 21975:
                        dVar.l.C = (float) d;
                        return;
                    case 21976:
                        dVar.l.D = (float) d;
                        return;
                    case 21977:
                        dVar.l.E = (float) d;
                        return;
                    case 21978:
                        dVar.l.F = (float) d;
                        return;
                    default:
                        return;
                }
            }
        }

        @Override // com.fyber.inneractive.sdk.player.c.d.b.c
        public final void a(int i, String str) throws l {
            d dVar = d.this;
            if (i == 134) {
                dVar.l.a = str;
            } else if (i != 17026) {
                if (i != 2274716) {
                    return;
                }
                dVar.l.N = str;
            } else if ("webm".equals(str) || "matroska".equals(str)) {
            } else {
                throw new l("DocType " + str + " not supported");
            }
        }

        @Override // com.fyber.inneractive.sdk.player.c.d.b.c
        public final void a(int i, int i2, g gVar) throws IOException, InterruptedException {
            int i3;
            int i4;
            int i5;
            d dVar = d.this;
            int i6 = 4;
            int i7 = 0;
            if (i != 161 && i != 163) {
                if (i == 16981) {
                    dVar.l.f = new byte[i2];
                    gVar.b(dVar.l.f, 0, i2);
                    return;
                } else if (i == 18402) {
                    dVar.l.g = new byte[i2];
                    gVar.b(dVar.l.g, 0, i2);
                    return;
                } else if (i == 21419) {
                    Arrays.fill(dVar.f.a, (byte) 0);
                    gVar.b(dVar.f.a, 4 - i2, i2);
                    dVar.f.c(0);
                    dVar.n = (int) dVar.f.h();
                    return;
                } else if (i == 25506) {
                    dVar.l.h = new byte[i2];
                    gVar.b(dVar.l.h, 0, i2);
                    return;
                } else if (i == 30322) {
                    dVar.l.o = new byte[i2];
                    gVar.b(dVar.l.o, 0, i2);
                    return;
                } else {
                    throw new l("Unexpected id: " + i);
                }
            }
            int i8 = 1;
            if (dVar.v == 0) {
                dVar.B = (int) dVar.b.a(gVar, false, true, 8);
                dVar.C = dVar.b.a;
                dVar.x = -9223372036854775807L;
                dVar.v = 1;
                dVar.e.a();
            }
            b bVar = dVar.c.get(dVar.B);
            if (bVar == null) {
                gVar.b(i2 - dVar.C);
                dVar.v = 0;
                return;
            }
            if (dVar.v == 1) {
                dVar.a(gVar, 3);
                int i9 = (dVar.e.a[2] & 6) >> 1;
                byte b = UByte.MAX_VALUE;
                if (i9 == 0) {
                    dVar.z = 1;
                    dVar.A = d.a(dVar.A, 1);
                    dVar.A[0] = (i2 - dVar.C) - 3;
                } else if (i != 163) {
                    throw new l("Lacing only supported in SimpleBlocks.");
                } else {
                    dVar.a(gVar, 4);
                    dVar.z = (dVar.e.a[3] & UByte.MAX_VALUE) + 1;
                    dVar.A = d.a(dVar.A, dVar.z);
                    if (i9 == 2) {
                        Arrays.fill(dVar.A, 0, dVar.z, ((i2 - dVar.C) - 4) / dVar.z);
                    } else if (i9 == 1) {
                        int i10 = 0;
                        for (int i11 = 0; i11 < dVar.z - 1; i11++) {
                            dVar.A[i11] = 0;
                            do {
                                i6++;
                                dVar.a(gVar, i6);
                                i5 = dVar.e.a[i6 - 1] & UByte.MAX_VALUE;
                                int[] iArr = dVar.A;
                                iArr[i11] = iArr[i11] + i5;
                            } while (i5 == 255);
                            i10 += dVar.A[i11];
                        }
                        dVar.A[dVar.z - 1] = ((i2 - dVar.C) - i6) - i10;
                    } else if (i9 == 3) {
                        int i12 = 0;
                        int i13 = 0;
                        while (i12 < dVar.z - i8) {
                            dVar.A[i12] = i7;
                            i6++;
                            dVar.a(gVar, i6);
                            int i14 = i6 - 1;
                            if (dVar.e.a[i14] == 0) {
                                throw new l("No valid varint length mask found");
                            }
                            long j = 0;
                            int i15 = i7;
                            while (true) {
                                if (i15 >= 8) {
                                    i4 = i13;
                                    break;
                                }
                                int i16 = i8 << (7 - i15);
                                if ((dVar.e.a[i14] & i16) != 0) {
                                    i6 += i15;
                                    dVar.a(gVar, i6);
                                    i4 = i13;
                                    long j2 = dVar.e.a[i14] & b & (~i16);
                                    int i17 = i14 + 1;
                                    while (true) {
                                        j = j2;
                                        if (i17 >= i6) {
                                            break;
                                        }
                                        j2 = (j << 8) | (dVar.e.a[i17] & b);
                                        i17++;
                                        b = UByte.MAX_VALUE;
                                    }
                                    if (i12 > 0) {
                                        j -= (1 << ((i15 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i15++;
                                    i8 = 1;
                                    b = UByte.MAX_VALUE;
                                }
                            }
                            long j3 = j;
                            if (j3 < -2147483648L || j3 > 2147483647L) {
                                throw new l("EBML lacing sample size out of range.");
                            }
                            int i18 = (int) j3;
                            int[] iArr2 = dVar.A;
                            if (i12 != 0) {
                                i18 += dVar.A[i12 - 1];
                            }
                            iArr2[i12] = i18;
                            i13 = i4 + dVar.A[i12];
                            i12++;
                            i7 = 0;
                            i8 = 1;
                            b = UByte.MAX_VALUE;
                        }
                        dVar.A[dVar.z - 1] = ((i2 - dVar.C) - i6) - i13;
                    } else {
                        throw new l("Unexpected lacing value: " + i9);
                    }
                }
                dVar.w = dVar.r + dVar.a((dVar.e.a[0] << 8) | (dVar.e.a[1] & UByte.MAX_VALUE));
                dVar.D = ((dVar.e.a[2] & 8) == 8 ? Integer.MIN_VALUE : 0) | ((bVar.c == 2 || (i == 163 && (dVar.e.a[2] & ByteCompanionObject.MIN_VALUE) == 128)) ? 1 : 0);
                dVar.v = 2;
                dVar.y = 0;
                i3 = 163;
            } else {
                i3 = 163;
            }
            if (i == i3) {
                while (dVar.y < dVar.z) {
                    dVar.a(gVar, bVar, dVar.A[dVar.y]);
                    dVar.a(bVar, dVar.w + ((dVar.y * bVar.d) / 1000));
                    dVar.y++;
                }
                dVar.v = 0;
                return;
            }
            dVar.a(gVar, bVar, dVar.A[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {
        public float A;
        public float B;
        public float C;
        public float D;
        public float E;
        public float F;
        public int G;
        public int H;
        public int I;
        public long J;
        public long K;
        public boolean L;
        public boolean M;
        String N;
        public n O;
        public int P;
        public String a;
        public int b;
        public int c;
        public int d;
        public boolean e;
        public byte[] f;
        public byte[] g;
        public byte[] h;
        public com.fyber.inneractive.sdk.player.c.c.a i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public byte[] o;
        public int p;
        public boolean q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;
        public float w;
        public float x;
        public float y;
        public float z;

        private b() {
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = null;
            this.p = -1;
            this.q = false;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = 1000;
            this.v = Scheduler.MAX_GREEDY_SCHEDULER_LIMIT;
            this.w = -1.0f;
            this.x = -1.0f;
            this.y = -1.0f;
            this.z = -1.0f;
            this.A = -1.0f;
            this.B = -1.0f;
            this.C = -1.0f;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 1;
            this.H = -1;
            this.I = 8000;
            this.J = 0L;
            this.K = 0L;
            this.M = true;
            this.N = "eng";
        }

        /* synthetic */ b(byte b) {
            this();
        }

        static List<byte[]> a(k kVar) throws l {
            try {
                kVar.d(16);
                if (kVar.i() != 826496599) {
                    return null;
                }
                byte[] bArr = kVar.a;
                for (int i = kVar.b + 20; i < bArr.length - 4; i++) {
                    if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 1 && bArr[i + 3] == 15) {
                        return Collections.singletonList(Arrays.copyOfRange(bArr, i, bArr.length));
                    }
                }
                throw new l("Failed to find FourCC VC1 initialization data");
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new l("Error parsing FourCC VC1 codec private");
            }
        }

        static List<byte[]> a(byte[] bArr) throws l {
            try {
                if (bArr[0] != 2) {
                    throw new l("Error parsing vorbis codec private");
                }
                int i = 0;
                int i2 = 1;
                while (bArr[i2] == -1) {
                    i += 255;
                    i2++;
                }
                int i3 = i2 + 1;
                int i4 = i + bArr[i2];
                int i5 = 0;
                while (bArr[i3] == -1) {
                    i5 += 255;
                    i3++;
                }
                int i6 = i3 + 1;
                int i7 = i5 + bArr[i3];
                if (bArr[i6] != 1) {
                    throw new l("Error parsing vorbis codec private");
                }
                byte[] bArr2 = new byte[i4];
                System.arraycopy(bArr, i6, bArr2, 0, i4);
                int i8 = i6 + i4;
                if (bArr[i8] != 3) {
                    throw new l("Error parsing vorbis codec private");
                }
                int i9 = i8 + i7;
                if (bArr[i9] != 5) {
                    throw new l("Error parsing vorbis codec private");
                }
                byte[] bArr3 = new byte[bArr.length - i9];
                System.arraycopy(bArr, i9, bArr3, 0, bArr.length - i9);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new l("Error parsing vorbis codec private");
            }
        }

        static boolean b(k kVar) throws l {
            try {
                int f = kVar.f();
                if (f == 1) {
                    return true;
                }
                if (f == 65534) {
                    kVar.c(24);
                    if (kVar.l() == d.I.getMostSignificantBits()) {
                        if (kVar.l() == d.I.getLeastSignificantBits()) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new l("Error parsing MS/ACM codec private");
            }
        }
    }
}
