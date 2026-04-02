package com.fyber.inneractive.sdk.player.c.d.f;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.fyber.inneractive.sdk.player.c.d.f.v;
import com.fyber.inneractive.sdk.player.c.d.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class u implements com.fyber.inneractive.sdk.player.c.d.f {
    public static final com.fyber.inneractive.sdk.player.c.d.i a = new com.fyber.inneractive.sdk.player.c.d.i() { // from class: com.fyber.inneractive.sdk.player.c.d.f.u.1
        @Override // com.fyber.inneractive.sdk.player.c.d.i
        public final com.fyber.inneractive.sdk.player.c.d.f[] a() {
            return new com.fyber.inneractive.sdk.player.c.d.f[]{new u()};
        }
    };
    private static final long b = com.fyber.inneractive.sdk.player.c.k.t.e("AC-3");
    private static final long c = com.fyber.inneractive.sdk.player.c.k.t.e("EAC3");
    private static final long d = com.fyber.inneractive.sdk.player.c.k.t.e("HEVC");
    private final int e;
    private final List<com.fyber.inneractive.sdk.player.c.k.r> f;
    private final com.fyber.inneractive.sdk.player.c.k.k g;
    private final SparseIntArray h;
    private final v.c i;
    private final SparseArray<v> j;
    private final SparseBooleanArray k;
    private com.fyber.inneractive.sdk.player.c.d.h l;
    private int m;
    private boolean n;
    private v o;

    static /* synthetic */ int b(u uVar) {
        int i = uVar.m;
        uVar.m = i + 1;
        return i;
    }

    static /* synthetic */ boolean k(u uVar) {
        uVar.n = true;
        return true;
    }

    public u() {
        this((byte) 0);
    }

    private u(byte b2) {
        this(1, 0);
    }

    public u(int i, int i2) {
        this(i, new com.fyber.inneractive.sdk.player.c.k.r(0L), new e(i2));
    }

    private u(int i, com.fyber.inneractive.sdk.player.c.k.r rVar, v.c cVar) {
        this.i = (v.c) com.fyber.inneractive.sdk.player.c.k.a.a(cVar);
        this.e = i;
        if (i == 1 || i == 2) {
            this.f = Collections.singletonList(rVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f = arrayList;
            arrayList.add(rVar);
        }
        this.g = new com.fyber.inneractive.sdk.player.c.k.k(940);
        this.k = new SparseBooleanArray();
        this.j = new SparseArray<>();
        this.h = new SparseIntArray();
        d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
        r2 = r2 + 1;
     */
    @Override // com.fyber.inneractive.sdk.player.c.d.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.fyber.inneractive.sdk.player.c.d.g r7) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r6 = this;
            com.fyber.inneractive.sdk.player.c.k.k r0 = r6.g
            byte[] r0 = r0.a
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.c(r0, r1, r2)
            r2 = r1
        Lb:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L27
            r3 = r1
        L10:
            r4 = 5
            if (r3 != r4) goto L18
            r7.b(r2)
            r7 = 1
            return r7
        L18:
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 != r5) goto L24
            int r3 = r3 + 1
            goto L10
        L24:
            int r2 = r2 + 1
            goto Lb
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.d.f.u.a(com.fyber.inneractive.sdk.player.c.d.g):boolean");
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final void a(com.fyber.inneractive.sdk.player.c.d.h hVar) {
        this.l = hVar;
        hVar.a(new m.a(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.f
    public final void a(long j, long j2) {
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            this.f.get(i).b = -9223372036854775807L;
        }
        this.g.a();
        this.h.clear();
        d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ab, code lost:
        if (r11 != ((r7 + 1) & 15)) goto L48;
     */
    @Override // com.fyber.inneractive.sdk.player.c.d.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.fyber.inneractive.sdk.player.c.d.g r10, com.fyber.inneractive.sdk.player.c.d.l r11) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.d.f.u.a(com.fyber.inneractive.sdk.player.c.d.g, com.fyber.inneractive.sdk.player.c.d.l):int");
    }

    private void d() {
        this.k.clear();
        this.j.clear();
        SparseArray<v> a2 = this.i.a();
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            this.j.put(a2.keyAt(i), a2.valueAt(i));
        }
        this.j.put(0, new r(new a()));
        this.o = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements q {
        private final com.fyber.inneractive.sdk.player.c.k.j b = new com.fyber.inneractive.sdk.player.c.k.j(new byte[4]);

        @Override // com.fyber.inneractive.sdk.player.c.d.f.q
        public final void a(com.fyber.inneractive.sdk.player.c.k.r rVar, com.fyber.inneractive.sdk.player.c.d.h hVar, v.d dVar) {
        }

        public a() {
        }

        @Override // com.fyber.inneractive.sdk.player.c.d.f.q
        public final void a(com.fyber.inneractive.sdk.player.c.k.k kVar) {
            if (kVar.d() != 0) {
                return;
            }
            kVar.d(7);
            int b = kVar.b() / 4;
            for (int i = 0; i < b; i++) {
                kVar.a(this.b, 4);
                int c = this.b.c(16);
                this.b.b(3);
                if (c == 0) {
                    this.b.b(13);
                } else {
                    int c2 = this.b.c(13);
                    u.this.j.put(c2, new r(new b(c2)));
                    u.b(u.this);
                }
            }
            if (u.this.e != 2) {
                u.this.j.remove(0);
            }
        }
    }

    /* loaded from: classes.dex */
    private class b implements q {
        private final com.fyber.inneractive.sdk.player.c.k.j b = new com.fyber.inneractive.sdk.player.c.k.j(new byte[5]);
        private final SparseArray<v> c = new SparseArray<>();
        private final SparseIntArray d = new SparseIntArray();
        private final int e;

        @Override // com.fyber.inneractive.sdk.player.c.d.f.q
        public final void a(com.fyber.inneractive.sdk.player.c.k.r rVar, com.fyber.inneractive.sdk.player.c.d.h hVar, v.d dVar) {
        }

        public b(int i) {
            this.e = i;
        }

        @Override // com.fyber.inneractive.sdk.player.c.d.f.q
        public final void a(com.fyber.inneractive.sdk.player.c.k.k kVar) {
            com.fyber.inneractive.sdk.player.c.k.r rVar;
            com.fyber.inneractive.sdk.player.c.k.r rVar2;
            int i;
            char c;
            v a;
            com.fyber.inneractive.sdk.player.c.k.r rVar3;
            int i2;
            int i3;
            if (kVar.d() != 2) {
                return;
            }
            if (u.this.e == 1 || u.this.e == 2 || u.this.m == 1) {
                rVar = (com.fyber.inneractive.sdk.player.c.k.r) u.this.f.get(0);
            } else {
                rVar = new com.fyber.inneractive.sdk.player.c.k.r(((com.fyber.inneractive.sdk.player.c.k.r) u.this.f.get(0)).a);
                u.this.f.add(rVar);
            }
            kVar.d(2);
            int e = kVar.e();
            int i4 = 5;
            kVar.d(5);
            kVar.a(this.b, 2);
            int i5 = 4;
            this.b.b(4);
            int i6 = 12;
            kVar.d(this.b.c(12));
            if (u.this.e == 2 && u.this.o == null) {
                v.b bVar = new v.b(21, null, null, new byte[0]);
                u uVar = u.this;
                uVar.o = uVar.i.a(21, bVar);
                u.this.o.a(rVar, u.this.l, new v.d(e, 21, 8192));
            }
            this.c.clear();
            this.d.clear();
            int b = kVar.b();
            while (b > 0) {
                kVar.a(this.b, i4);
                int c2 = this.b.c(8);
                this.b.b(3);
                int c3 = this.b.c(13);
                this.b.b(i5);
                int c4 = this.b.c(i6);
                int i7 = kVar.b;
                int i8 = i7 + c4;
                int i9 = -1;
                String str = null;
                ArrayList arrayList = null;
                while (kVar.b < i8) {
                    int d = kVar.d();
                    int d2 = kVar.b + kVar.d();
                    if (d == i4) {
                        long h = kVar.h();
                        if (h != u.b) {
                            if (h != u.c) {
                                if (h == u.d) {
                                    i9 = 36;
                                }
                                rVar3 = rVar;
                                i2 = e;
                                i3 = 4;
                                kVar.d(d2 - kVar.b);
                                i5 = i3;
                                rVar = rVar3;
                                e = i2;
                                i4 = 5;
                            }
                            rVar3 = rVar;
                            i2 = e;
                            i9 = 135;
                            i3 = 4;
                            kVar.d(d2 - kVar.b);
                            i5 = i3;
                            rVar = rVar3;
                            e = i2;
                            i4 = 5;
                        }
                        rVar3 = rVar;
                        i9 = 129;
                        i3 = 4;
                        i2 = e;
                        kVar.d(d2 - kVar.b);
                        i5 = i3;
                        rVar = rVar3;
                        e = i2;
                        i4 = 5;
                    } else {
                        if (d != 106) {
                            if (d != 122) {
                                if (d == 123) {
                                    rVar3 = rVar;
                                    i9 = 138;
                                    i2 = e;
                                    i3 = 4;
                                    kVar.d(d2 - kVar.b);
                                    i5 = i3;
                                    rVar = rVar3;
                                    e = i2;
                                    i4 = 5;
                                } else {
                                    if (d == 10) {
                                        str = kVar.e(3).trim();
                                    } else {
                                        int i10 = 3;
                                        if (d == 89) {
                                            ArrayList arrayList2 = new ArrayList();
                                            while (kVar.b < d2) {
                                                String trim = kVar.e(i10).trim();
                                                int d3 = kVar.d();
                                                com.fyber.inneractive.sdk.player.c.k.r rVar4 = rVar;
                                                byte[] bArr = new byte[4];
                                                kVar.a(bArr, 0, 4);
                                                arrayList2.add(new v.a(trim, d3, bArr));
                                                rVar = rVar4;
                                                e = e;
                                                i10 = 3;
                                            }
                                            rVar3 = rVar;
                                            i2 = e;
                                            i3 = 4;
                                            arrayList = arrayList2;
                                            i9 = 89;
                                            kVar.d(d2 - kVar.b);
                                            i5 = i3;
                                            rVar = rVar3;
                                            e = i2;
                                            i4 = 5;
                                        }
                                    }
                                    rVar3 = rVar;
                                    i2 = e;
                                    i3 = 4;
                                    kVar.d(d2 - kVar.b);
                                    i5 = i3;
                                    rVar = rVar3;
                                    e = i2;
                                    i4 = 5;
                                }
                            }
                            rVar3 = rVar;
                            i2 = e;
                            i9 = 135;
                            i3 = 4;
                            kVar.d(d2 - kVar.b);
                            i5 = i3;
                            rVar = rVar3;
                            e = i2;
                            i4 = 5;
                        }
                        rVar3 = rVar;
                        i9 = 129;
                        i3 = 4;
                        i2 = e;
                        kVar.d(d2 - kVar.b);
                        i5 = i3;
                        rVar = rVar3;
                        e = i2;
                        i4 = 5;
                    }
                }
                com.fyber.inneractive.sdk.player.c.k.r rVar5 = rVar;
                int i11 = e;
                int i12 = i5;
                kVar.c(i8);
                v.b bVar2 = new v.b(i9, str, arrayList, Arrays.copyOfRange(kVar.a, i7, i8));
                if (c2 == 6) {
                    c2 = bVar2.a;
                }
                b -= c4 + 5;
                int i13 = u.this.e == 2 ? c2 : c3;
                if (u.this.k.get(i13)) {
                    c = 21;
                } else {
                    if (u.this.e == 2) {
                        c = 21;
                        if (c2 == 21) {
                            a = u.this.o;
                            if (u.this.e == 2 || c3 < this.d.get(i13, 8192)) {
                                this.d.put(i13, c3);
                                this.c.put(i13, a);
                            }
                        }
                    } else {
                        c = 21;
                    }
                    a = u.this.i.a(c2, bVar2);
                    if (u.this.e == 2) {
                    }
                    this.d.put(i13, c3);
                    this.c.put(i13, a);
                }
                i5 = i12;
                rVar = rVar5;
                e = i11;
                i4 = 5;
                i6 = 12;
            }
            com.fyber.inneractive.sdk.player.c.k.r rVar6 = rVar;
            int i14 = e;
            int size = this.d.size();
            int i15 = 0;
            while (i15 < size) {
                int keyAt = this.d.keyAt(i15);
                u.this.k.put(keyAt, true);
                v valueAt = this.c.valueAt(i15);
                if (valueAt != null) {
                    if (valueAt != u.this.o) {
                        com.fyber.inneractive.sdk.player.c.d.h hVar = u.this.l;
                        i = i14;
                        v.d dVar = new v.d(i, keyAt, 8192);
                        rVar2 = rVar6;
                        valueAt.a(rVar2, hVar, dVar);
                    } else {
                        rVar2 = rVar6;
                        i = i14;
                    }
                    u.this.j.put(this.d.valueAt(i15), valueAt);
                } else {
                    rVar2 = rVar6;
                    i = i14;
                }
                i15++;
                rVar6 = rVar2;
                i14 = i;
            }
            if (u.this.e == 2) {
                if (u.this.n) {
                    return;
                }
                u.this.l.b();
                u.this.m = 0;
                u.k(u.this);
                return;
            }
            u.this.j.remove(this.e);
            u uVar2 = u.this;
            uVar2.m = uVar2.e == 1 ? 0 : u.this.m - 1;
            if (u.this.m == 0) {
                u.this.l.b();
                u.k(u.this);
            }
        }
    }
}
