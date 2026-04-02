package com.amazon.aps.iva.cn;

import com.amazon.aps.iva.a0.k;
import com.amazon.aps.iva.f1.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: AvatarIcon.kt */
/* loaded from: classes2.dex */
public final class a {

    /* compiled from: AvatarIcon.kt */
    /* renamed from: com.amazon.aps.iva.cn.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0181a extends l implements com.amazon.aps.iva.xb0.a<q> {
        public static final C0181a h = new C0181a();

        public C0181a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final /* bridge */ /* synthetic */ q invoke() {
            return q.a;
        }
    }

    /* compiled from: AvatarIcon.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.xb0.a<q> aVar) {
            super(0);
            this.h = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            this.h.invoke();
            return q.a;
        }
    }

    /* compiled from: AvatarIcon.kt */
    /* loaded from: classes2.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.xb0.a<q> aVar) {
            super(0);
            this.h = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            this.h.invoke();
            return q.a;
        }
    }

    /* JADX WARN: Incorrect field signature: TT; */
    /* compiled from: AvatarIcon.kt */
    /* loaded from: classes2.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.a1.f, i, Integer, q> {
        public final /* synthetic */ com.amazon.aps.iva.cn.e h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (TT;)V */
        public d(com.amazon.aps.iva.cn.e eVar) {
            super(3);
            this.h = eVar;
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final q invoke(com.amazon.aps.iva.a1.f fVar, i iVar, Integer num) {
            int i;
            int i2;
            com.amazon.aps.iva.a1.f fVar2 = fVar;
            i iVar2 = iVar;
            int intValue = num.intValue();
            j.f(fVar2, "it");
            if ((intValue & 14) == 0) {
                if (iVar2.H(fVar2)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                intValue |= i2;
            }
            if ((intValue & 91) == 18 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                Integer imageFailureSize = this.h.getImageFailureSize();
                if (imageFailureSize != null) {
                    i = imageFailureSize.intValue();
                } else {
                    i = 40;
                }
                a.b(i, fVar2, iVar2, (intValue << 3) & 112, 0);
            }
            return q.a;
        }
    }

    /* compiled from: AvatarIcon.kt */
    /* loaded from: classes2.dex */
    public static final class e extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.amazon.aps.iva.xb0.a<q> aVar) {
            super(0);
            this.h = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            this.h.invoke();
            return q.a;
        }
    }

    /* compiled from: AvatarIcon.kt */
    /* loaded from: classes2.dex */
    public static final class f extends l implements p<com.amazon.aps.iva.a1.f, x, com.amazon.aps.iva.a1.f> {
        public static final f h = new f();

        public f() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.a1.f invoke(com.amazon.aps.iva.a1.f fVar, x xVar) {
            com.amazon.aps.iva.a1.f fVar2 = fVar;
            long j = xVar.a;
            j.f(fVar2, "$this$ifNotNull");
            return k.g(fVar2, 2, j, com.amazon.aps.iva.i0.g.a);
        }
    }

    /* JADX WARN: Incorrect field signature: TT; */
    /* compiled from: AvatarIcon.kt */
    /* loaded from: classes2.dex */
    public static final class g extends l implements p<i, Integer, q> {
        public final /* synthetic */ String h;
        public final /* synthetic */ com.amazon.aps.iva.cn.e i;
        public final /* synthetic */ com.amazon.aps.iva.a1.f j;
        public final /* synthetic */ com.amazon.aps.iva.cn.c k;
        public final /* synthetic */ String l;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> m;
        public final /* synthetic */ int n;
        public final /* synthetic */ int o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;TT;Lcom/amazon/aps/iva/a1/f;Lcom/amazon/aps/iva/cn/c;Ljava/lang/String;Lcom/amazon/aps/iva/xb0/a<Lcom/amazon/aps/iva/kb0/q;>;II)V */
        public g(String str, com.amazon.aps.iva.cn.e eVar, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.cn.c cVar, String str2, com.amazon.aps.iva.xb0.a aVar, int i, int i2) {
            super(2);
            this.h = str;
            this.i = eVar;
            this.j = fVar;
            this.k = cVar;
            this.l = str2;
            this.m = aVar;
            this.n = i;
            this.o = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            num.intValue();
            a.a(this.h, this.i, this.j, this.k, this.l, this.m, iVar, com.amazon.aps.iva.ff0.b.I(this.n | 1), this.o);
            return q.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x017a, code lost:
        if (com.amazon.aps.iva.yb0.j.a(r15.e0(), java.lang.Integer.valueOf(r3)) == false) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends com.amazon.aps.iva.cn.e> void a(java.lang.String r35, T r36, com.amazon.aps.iva.a1.f r37, com.amazon.aps.iva.cn.c r38, java.lang.String r39, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> r40, com.amazon.aps.iva.o0.i r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 1162
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.cn.a.a(java.lang.String, com.amazon.aps.iva.cn.e, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.cn.c, java.lang.String, com.amazon.aps.iva.xb0.a, com.amazon.aps.iva.o0.i, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(int r16, com.amazon.aps.iva.a1.f r17, com.amazon.aps.iva.o0.i r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.cn.a.b(int, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, int, int):void");
    }
}
