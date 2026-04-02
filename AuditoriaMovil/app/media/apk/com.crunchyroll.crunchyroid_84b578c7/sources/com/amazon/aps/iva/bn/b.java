package com.amazon.aps.iva.bn;

import com.amazon.aps.iva.a2.c0;
import com.amazon.aps.iva.a2.y;
import com.amazon.aps.iva.d1.w;
import com.amazon.aps.iva.f1.x;
import com.amazon.aps.iva.i2.e0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lm.g;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: ManageProfileInputField.kt */
/* loaded from: classes2.dex */
public final class b {

    /* compiled from: ManageProfileInputField.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.lm.g, q> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.lm.g gVar) {
            j.f(gVar, "it");
            return q.a;
        }
    }

    /* compiled from: ManageProfileInputField.kt */
    /* renamed from: com.amazon.aps.iva.bn.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0149b extends l implements com.amazon.aps.iva.xb0.a<q> {
        public static final C0149b h = new C0149b();

        public C0149b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final /* bridge */ /* synthetic */ q invoke() {
            return q.a;
        }
    }

    /* compiled from: ManageProfileInputField.kt */
    /* loaded from: classes2.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "manage_profile_input");
            return q.a;
        }
    }

    /* compiled from: ManageProfileInputField.kt */
    /* loaded from: classes2.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.l<w, q> {
        public final /* synthetic */ boolean h;
        public final /* synthetic */ q1<x> i;
        public final /* synthetic */ q1<Boolean> j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z, q1<x> q1Var, q1<Boolean> q1Var2) {
            super(1);
            this.h = z;
            this.i = q1Var;
            this.j = q1Var2;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(w wVar) {
            long j;
            w wVar2 = wVar;
            j.f(wVar2, "state");
            if (this.h) {
                if (wVar2.isFocused()) {
                    j = com.amazon.aps.iva.ao.a.a;
                } else {
                    j = com.amazon.aps.iva.ao.a.j;
                }
                this.i.setValue(new x(j));
            }
            this.j.setValue(Boolean.valueOf(wVar2.isFocused()));
            return q.a;
        }
    }

    /* compiled from: ManageProfileInputField.kt */
    /* loaded from: classes2.dex */
    public static final class e extends l implements com.amazon.aps.iva.xb0.l<e0, q> {
        public final /* synthetic */ int h;
        public final /* synthetic */ q1<e0> i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<String, q> j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(int i, q1<e0> q1Var, com.amazon.aps.iva.xb0.l<? super String, q> lVar) {
            super(1);
            this.h = i;
            this.i = q1Var;
            this.j = lVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(e0 e0Var) {
            e0 e0Var2 = e0Var;
            j.f(e0Var2, "it");
            com.amazon.aps.iva.c2.b bVar = e0Var2.a;
            if (bVar.b.length() <= this.h) {
                this.i.setValue(e0Var2);
                this.j.invoke(bVar.b);
            }
            return q.a;
        }
    }

    /* compiled from: ManageProfileInputField.kt */
    /* loaded from: classes2.dex */
    public static final class f extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.lm.g, q> h;
        public final /* synthetic */ q1<e0> i;
        public final /* synthetic */ String j;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.lm.g, q> lVar, q1<e0> q1Var, String str, com.amazon.aps.iva.xb0.a<q> aVar) {
            super(0);
            this.h = lVar;
            this.i = q1Var;
            this.j = str;
            this.k = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            this.h.invoke(g.d.a);
            String str = this.j;
            int length = str.length();
            this.i.setValue(new e0(str, com.amazon.aps.iva.ab.x.f(length, length), 4));
            this.k.invoke();
            return q.a;
        }
    }

    /* compiled from: ManageProfileInputField.kt */
    /* loaded from: classes2.dex */
    public static final class g extends l implements p<i, Integer, q> {
        public final /* synthetic */ String h;
        public final /* synthetic */ int i;
        public final /* synthetic */ int j;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<String, q> k;
        public final /* synthetic */ com.amazon.aps.iva.a1.f l;
        public final /* synthetic */ String m;
        public final /* synthetic */ boolean n;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.lm.g, q> o;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> p;
        public final /* synthetic */ int q;
        public final /* synthetic */ int r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(String str, int i, int i2, com.amazon.aps.iva.xb0.l<? super String, q> lVar, com.amazon.aps.iva.a1.f fVar, String str2, boolean z, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.lm.g, q> lVar2, com.amazon.aps.iva.xb0.a<q> aVar, int i3, int i4) {
            super(2);
            this.h = str;
            this.i = i;
            this.j = i2;
            this.k = lVar;
            this.l = fVar;
            this.m = str2;
            this.n = z;
            this.o = lVar2;
            this.p = aVar;
            this.q = i3;
            this.r = i4;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            num.intValue();
            b.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, iVar, com.amazon.aps.iva.ff0.b.I(this.q | 1), this.r);
            return q.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r39, int r40, int r41, com.amazon.aps.iva.xb0.l<? super java.lang.String, com.amazon.aps.iva.kb0.q> r42, com.amazon.aps.iva.a1.f r43, java.lang.String r44, boolean r45, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.lm.g, com.amazon.aps.iva.kb0.q> r46, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> r47, com.amazon.aps.iva.o0.i r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.bn.b.a(java.lang.String, int, int, com.amazon.aps.iva.xb0.l, com.amazon.aps.iva.a1.f, java.lang.String, boolean, com.amazon.aps.iva.xb0.l, com.amazon.aps.iva.xb0.a, com.amazon.aps.iva.o0.i, int, int):void");
    }
}
