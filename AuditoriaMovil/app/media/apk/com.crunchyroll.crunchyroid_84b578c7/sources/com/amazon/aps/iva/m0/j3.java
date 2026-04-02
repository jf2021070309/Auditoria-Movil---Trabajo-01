package com.amazon.aps.iva.m0;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.cast.Cast;
import okhttp3.internal.http2.Http2;
/* compiled from: TextFieldImpl.kt */
/* loaded from: classes.dex */
public final class j3 {
    public static final long a = com.amazon.aps.iva.o2.b.a(0, 0, 0, 0);
    public static final float b = 16;
    public static final float c = 12;
    public static final com.amazon.aps.iva.a1.f d;

    /* compiled from: TextFieldImpl.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.t<Float, com.amazon.aps.iva.f1.x, com.amazon.aps.iva.f1.x, Float, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> i;
        public final /* synthetic */ String j;
        public final /* synthetic */ boolean k;
        public final /* synthetic */ int l;
        public final /* synthetic */ e3 m;
        public final /* synthetic */ boolean n;
        public final /* synthetic */ com.amazon.aps.iva.c0.k o;
        public final /* synthetic */ int p;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> q;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> r;
        public final /* synthetic */ z3 s;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> t;
        public final /* synthetic */ boolean u;
        public final /* synthetic */ com.amazon.aps.iva.d0.o1 v;
        public final /* synthetic */ boolean w;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> x;

        /* compiled from: TextFieldImpl.kt */
        /* renamed from: com.amazon.aps.iva.m0.j3$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public /* synthetic */ class C0499a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[z3.values().length];
                try {
                    iArr[z3.Filled.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[z3.Outlined.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar2, String str, boolean z, int i, e3 e3Var, boolean z2, com.amazon.aps.iva.c0.k kVar, int i2, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar3, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar4, z3 z3Var, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar5, boolean z3, com.amazon.aps.iva.d0.o1 o1Var, boolean z4, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar6) {
            super(6);
            this.h = pVar;
            this.i = pVar2;
            this.j = str;
            this.k = z;
            this.l = i;
            this.m = e3Var;
            this.n = z2;
            this.o = kVar;
            this.p = i2;
            this.q = pVar3;
            this.r = pVar4;
            this.s = z3Var;
            this.t = pVar5;
            this.u = z3;
            this.v = o1Var;
            this.w = z4;
            this.x = pVar6;
        }

        /* JADX WARN: Removed duplicated region for block: B:58:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x015d  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x017b  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0189  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x018d  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x01c4  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x01dd  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x01fc  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0299  */
        @Override // com.amazon.aps.iva.xb0.t
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.amazon.aps.iva.kb0.q S(java.lang.Float r25, com.amazon.aps.iva.f1.x r26, com.amazon.aps.iva.f1.x r27, java.lang.Float r28, com.amazon.aps.iva.o0.i r29, java.lang.Integer r30) {
            /*
                Method dump skipped, instructions count: 720
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.m0.j3.a.S(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: TextFieldImpl.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ z3 h;
        public final /* synthetic */ String i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> j;
        public final /* synthetic */ com.amazon.aps.iva.i2.p0 k;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> l;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> m;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> n;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> o;
        public final /* synthetic */ boolean p;
        public final /* synthetic */ boolean q;
        public final /* synthetic */ boolean r;
        public final /* synthetic */ com.amazon.aps.iva.c0.k s;
        public final /* synthetic */ com.amazon.aps.iva.d0.o1 t;
        public final /* synthetic */ e3 u;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> v;
        public final /* synthetic */ int w;
        public final /* synthetic */ int x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(z3 z3Var, String str, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, com.amazon.aps.iva.i2.p0 p0Var, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar2, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar3, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar4, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar5, boolean z, boolean z2, boolean z3, com.amazon.aps.iva.c0.k kVar, com.amazon.aps.iva.d0.o1 o1Var, e3 e3Var, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar6, int i, int i2, int i3) {
            super(2);
            this.h = z3Var;
            this.i = str;
            this.j = pVar;
            this.k = p0Var;
            this.l = pVar2;
            this.m = pVar3;
            this.n = pVar4;
            this.o = pVar5;
            this.p = z;
            this.q = z2;
            this.r = z3;
            this.s = kVar;
            this.t = o1Var;
            this.u = e3Var;
            this.v = pVar6;
            this.w = i;
            this.x = i2;
            this.y = i3;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            j3.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, iVar, com.amazon.aps.iva.ff0.b.I(this.w | 1), com.amazon.aps.iva.ff0.b.I(this.x), this.y);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: TextFieldImpl.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<u0, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.f1.x> {
        public final /* synthetic */ e3 h;
        public final /* synthetic */ boolean i;
        public final /* synthetic */ boolean j;
        public final /* synthetic */ com.amazon.aps.iva.c0.k k;
        public final /* synthetic */ int l;
        public final /* synthetic */ int m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e3 e3Var, boolean z, boolean z2, com.amazon.aps.iva.c0.k kVar, int i, int i2) {
            super(3);
            this.h = e3Var;
            this.i = z;
            this.j = z2;
            this.k = kVar;
            this.l = i;
            this.m = i2;
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final com.amazon.aps.iva.f1.x invoke(u0 u0Var, com.amazon.aps.iva.o0.i iVar, Integer num) {
            boolean z;
            u0 u0Var2 = u0Var;
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            num.intValue();
            com.amazon.aps.iva.yb0.j.f(u0Var2, "it");
            iVar2.s(697243846);
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            e3 e3Var = this.h;
            boolean z2 = this.i;
            if (u0Var2 == u0.UnfocusedEmpty) {
                z = false;
            } else {
                z = this.j;
            }
            com.amazon.aps.iva.c0.k kVar = this.k;
            int i = this.m;
            long j = ((com.amazon.aps.iva.f1.x) e3Var.h(z2, z, kVar, iVar2, ((this.l >> 27) & 14) | ((i << 3) & 896) | (i & 7168)).getValue()).a;
            iVar2.G();
            return new com.amazon.aps.iva.f1.x(j);
        }
    }

    /* compiled from: TextFieldImpl.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ long h;
        public final /* synthetic */ com.amazon.aps.iva.c2.a0 i;
        public final /* synthetic */ Float j;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> k;
        public final /* synthetic */ int l;
        public final /* synthetic */ int m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(long j, com.amazon.aps.iva.c2.a0 a0Var, Float f, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, int i, int i2) {
            super(2);
            this.h = j;
            this.i = a0Var;
            this.j = f;
            this.k = pVar;
            this.l = i;
            this.m = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            j3.b(this.h, this.i, this.j, this.k, iVar, com.amazon.aps.iva.ff0.b.I(this.l | 1), this.m);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: TextFieldImpl.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ long h;
        public final /* synthetic */ Float i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i, long j, Float f, com.amazon.aps.iva.xb0.p pVar) {
            super(2);
            this.h = j;
            this.i = f;
            this.j = pVar;
            this.k = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = com.amazon.aps.iva.o0.e0.a;
                com.amazon.aps.iva.o0.l0.a(new com.amazon.aps.iva.o0.h2[]{f0.a.b(new com.amazon.aps.iva.f1.x(this.h))}, com.amazon.aps.iva.v0.b.b(iVar2, -1132188434, new q3(this.k, this.h, this.i, this.j)), iVar2, 56);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    static {
        int i = com.amazon.aps.iva.a1.f.a;
        float f = 48;
        d = androidx.compose.foundation.layout.e.a(f.a.c, f, f);
    }

    public static final void a(z3 z3Var, String str, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar, com.amazon.aps.iva.i2.p0 p0Var, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar2, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar3, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar4, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar5, boolean z, boolean z2, boolean z3, com.amazon.aps.iva.c0.k kVar, com.amazon.aps.iva.d0.o1 o1Var, e3 e3Var, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar6, com.amazon.aps.iva.o0.i iVar, int i, int i2, int i3) {
        int i4;
        int i5;
        u0 u0Var;
        com.amazon.aps.iva.o0.j jVar;
        com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar7;
        com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar8;
        com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar9;
        boolean z4;
        boolean z5;
        boolean z6;
        com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar10;
        com.amazon.aps.iva.yb0.j.f(z3Var, "type");
        com.amazon.aps.iva.yb0.j.f(str, "value");
        com.amazon.aps.iva.yb0.j.f(pVar, "innerTextField");
        com.amazon.aps.iva.yb0.j.f(p0Var, "visualTransformation");
        com.amazon.aps.iva.yb0.j.f(kVar, "interactionSource");
        com.amazon.aps.iva.yb0.j.f(o1Var, "contentPadding");
        com.amazon.aps.iva.yb0.j.f(e3Var, "colors");
        com.amazon.aps.iva.o0.j g = iVar.g(-712568069);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (g.H(z3Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= g.H(str) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= g.v(pVar) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 7168) == 0) {
            i4 |= g.H(p0Var) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 57344) == 0) {
            i4 |= g.v(pVar2) ? 16384 : 8192;
        }
        int i6 = i3 & 32;
        if (i6 != 0) {
            i4 |= 196608;
        } else if ((i & 458752) == 0) {
            i4 |= g.v(pVar3) ? 131072 : Cast.MAX_MESSAGE_LENGTH;
        }
        int i7 = i3 & 64;
        if (i7 != 0) {
            i4 |= 1572864;
        } else if ((i & 3670016) == 0) {
            i4 |= g.v(pVar4) ? 1048576 : 524288;
        }
        int i8 = i3 & 128;
        if (i8 != 0) {
            i4 |= 12582912;
        } else if ((i & 29360128) == 0) {
            i4 |= g.v(pVar5) ? 8388608 : 4194304;
        }
        int i9 = i3 & 256;
        if (i9 != 0) {
            i4 |= 100663296;
        } else if ((i & 234881024) == 0) {
            i4 |= g.a(z) ? 67108864 : 33554432;
        }
        int i10 = i3 & AdRequest.MAX_CONTENT_URL_LENGTH;
        if (i10 != 0) {
            i4 |= 805306368;
        } else if ((i & 1879048192) == 0) {
            i4 |= g.a(z2) ? 536870912 : 268435456;
        }
        int i11 = i4;
        int i12 = i3 & 1024;
        if (i12 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = i2 | (g.a(z3) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i3 & 2048) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= g.H(kVar) ? 32 : 16;
        }
        int i13 = i5;
        if ((i3 & 4096) != 0) {
            i13 |= 384;
        } else if ((i2 & 896) == 0) {
            i13 |= g.H(o1Var) ? 256 : 128;
        }
        if ((i3 & 8192) != 0) {
            i13 |= 3072;
        } else if ((i2 & 7168) == 0) {
            i13 |= g.H(e3Var) ? 2048 : 1024;
        }
        int i14 = i3 & Http2.INITIAL_MAX_FRAME_SIZE;
        if (i14 != 0) {
            i13 |= 24576;
        } else if ((i2 & 57344) == 0) {
            i13 |= g.v(pVar6) ? 16384 : 8192;
        }
        if ((i11 & 1533916891) == 306783378 && (46811 & i13) == 9362 && g.h()) {
            g.A();
            pVar7 = pVar3;
            pVar8 = pVar4;
            pVar9 = pVar5;
            z4 = z;
            z5 = z2;
            z6 = z3;
            pVar10 = pVar6;
            jVar = g;
        } else {
            com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar11 = i6 != 0 ? null : pVar3;
            com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar12 = i7 != 0 ? null : pVar4;
            com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar13 = i8 != 0 ? null : pVar5;
            boolean z7 = i9 != 0 ? false : z;
            boolean z8 = i10 != 0 ? true : z2;
            boolean z9 = i12 != 0 ? false : z3;
            com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar14 = i14 != 0 ? null : pVar6;
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            g.s(511388516);
            boolean H = g.H(str) | g.H(p0Var);
            Object e0 = g.e0();
            if (H || e0 == i.a.a) {
                e0 = p0Var.a(new com.amazon.aps.iva.c2.b(str, null, 6));
                g.K0(e0);
            }
            g.U(false);
            String str2 = ((com.amazon.aps.iva.i2.o0) e0).a.b;
            if (((Boolean) com.amazon.aps.iva.aq.j.m(kVar, g, (i13 >> 3) & 14).getValue()).booleanValue()) {
                u0Var = u0.Focused;
            } else {
                u0Var = str2.length() == 0 ? u0.UnfocusedEmpty : u0.UnfocusedNotEmpty;
            }
            u0 u0Var2 = u0Var;
            c cVar = new c(e3Var, z8, z9, kVar, i11, i13);
            com.amazon.aps.iva.o0.q3 q3Var = c4.b;
            b4 b4Var = (b4) g.i(q3Var);
            com.amazon.aps.iva.c2.a0 a0Var = b4Var.g;
            long b2 = a0Var.b();
            long j = com.amazon.aps.iva.f1.x.g;
            boolean c2 = com.amazon.aps.iva.f1.x.c(b2, j);
            com.amazon.aps.iva.c2.a0 a0Var2 = b4Var.l;
            boolean z10 = (c2 && !com.amazon.aps.iva.f1.x.c(a0Var2.b(), j)) || (!com.amazon.aps.iva.f1.x.c(a0Var.b(), j) && com.amazon.aps.iva.f1.x.c(a0Var2.b(), j));
            y3 y3Var = y3.a;
            g.s(2129141006);
            long b3 = ((b4) g.i(q3Var)).l.b();
            if (z10) {
                if (!(b3 != j)) {
                    b3 = ((com.amazon.aps.iva.f1.x) cVar.invoke(u0Var2, g, 0)).a;
                }
            }
            long j2 = b3;
            g.U(false);
            g.s(2129141197);
            long b4 = ((b4) g.i(q3Var)).g.b();
            if (z10) {
                if (!(b4 != j)) {
                    b4 = ((com.amazon.aps.iva.f1.x) cVar.invoke(u0Var2, g, 0)).a;
                }
            }
            long j3 = b4;
            g.U(false);
            jVar = g;
            y3Var.a(u0Var2, j2, j3, cVar, pVar2 != null, com.amazon.aps.iva.v0.b.b(jVar, 341865432, new a(pVar2, pVar11, str2, z9, i13, e3Var, z8, kVar, i11, pVar12, pVar13, z3Var, pVar, z7, o1Var, z10, pVar14)), jVar, 1769472);
            pVar7 = pVar11;
            pVar8 = pVar12;
            pVar9 = pVar13;
            z4 = z7;
            z5 = z8;
            z6 = z9;
            pVar10 = pVar14;
        }
        com.amazon.aps.iva.o0.j2 X = jVar.X();
        if (X == null) {
            return;
        }
        X.d = new b(z3Var, str, pVar, p0Var, pVar2, pVar7, pVar8, pVar9, z4, z5, z6, kVar, o1Var, e3Var, pVar10, i, i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(long r15, com.amazon.aps.iva.c2.a0 r17, java.lang.Float r18, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super java.lang.Integer, com.amazon.aps.iva.kb0.q> r19, com.amazon.aps.iva.o0.i r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.m0.j3.b(long, com.amazon.aps.iva.c2.a0, java.lang.Float, com.amazon.aps.iva.xb0.p, com.amazon.aps.iva.o0.i, int, int):void");
    }

    public static final Object c(com.amazon.aps.iva.s1.l lVar) {
        com.amazon.aps.iva.s1.s sVar;
        com.amazon.aps.iva.yb0.j.f(lVar, "<this>");
        Object b2 = lVar.b();
        if (b2 instanceof com.amazon.aps.iva.s1.s) {
            sVar = (com.amazon.aps.iva.s1.s) b2;
        } else {
            sVar = null;
        }
        if (sVar == null) {
            return null;
        }
        return sVar.x0();
    }

    public static final int d(com.amazon.aps.iva.s1.u0 u0Var) {
        if (u0Var != null) {
            return u0Var.c;
        }
        return 0;
    }

    public static final int e(com.amazon.aps.iva.s1.u0 u0Var) {
        if (u0Var != null) {
            return u0Var.b;
        }
        return 0;
    }
}
