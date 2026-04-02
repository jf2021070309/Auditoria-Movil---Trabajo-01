package com.amazon.aps.iva.j0;

import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.c2.b;
import com.amazon.aps.iva.h2.k;
import java.util.List;
import java.util.Map;
/* compiled from: BasicText.kt */
/* loaded from: classes.dex */
public final class g {

    /* compiled from: BasicText.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ String h;
        public final /* synthetic */ com.amazon.aps.iva.a1.f i;
        public final /* synthetic */ com.amazon.aps.iva.c2.a0 j;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.c2.y, com.amazon.aps.iva.kb0.q> k;
        public final /* synthetic */ int l;
        public final /* synthetic */ boolean m;
        public final /* synthetic */ int n;
        public final /* synthetic */ int o;
        public final /* synthetic */ com.amazon.aps.iva.f1.z p;
        public final /* synthetic */ int q;
        public final /* synthetic */ int r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.c2.a0 a0Var, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.c2.y, com.amazon.aps.iva.kb0.q> lVar, int i, boolean z, int i2, int i3, com.amazon.aps.iva.f1.z zVar, int i4, int i5) {
            super(2);
            this.h = str;
            this.i = fVar;
            this.j = a0Var;
            this.k = lVar;
            this.l = i;
            this.m = z;
            this.n = i2;
            this.o = i3;
            this.p = zVar;
            this.q = i4;
            this.r = i5;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            g.b(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, iVar, com.amazon.aps.iva.ff0.b.I(this.q | 1), this.r);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: BasicText.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.e1.e>, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.o0.q1<List<com.amazon.aps.iva.e1.e>> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.o0.q1<List<com.amazon.aps.iva.e1.e>> q1Var) {
            super(1);
            this.h = q1Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(List<? extends com.amazon.aps.iva.e1.e> list) {
            List<? extends com.amazon.aps.iva.e1.e> list2 = list;
            com.amazon.aps.iva.yb0.j.f(list2, "it");
            this.h.setValue(list2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: BasicText.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends com.amazon.aps.iva.e1.e>> {
        public final /* synthetic */ com.amazon.aps.iva.o0.q1<List<com.amazon.aps.iva.e1.e>> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.o0.q1<List<com.amazon.aps.iva.e1.e>> q1Var) {
            super(0);
            this.h = q1Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final List<? extends com.amazon.aps.iva.e1.e> invoke() {
            return this.h.getValue();
        }
    }

    /* compiled from: BasicText.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.c2.b h;
        public final /* synthetic */ com.amazon.aps.iva.a1.f i;
        public final /* synthetic */ com.amazon.aps.iva.c2.a0 j;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.c2.y, com.amazon.aps.iva.kb0.q> k;
        public final /* synthetic */ int l;
        public final /* synthetic */ boolean m;
        public final /* synthetic */ int n;
        public final /* synthetic */ int o;
        public final /* synthetic */ Map<String, m0> p;
        public final /* synthetic */ com.amazon.aps.iva.f1.z q;
        public final /* synthetic */ int r;
        public final /* synthetic */ int s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(com.amazon.aps.iva.c2.b bVar, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.c2.a0 a0Var, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.c2.y, com.amazon.aps.iva.kb0.q> lVar, int i, boolean z, int i2, int i3, Map<String, m0> map, com.amazon.aps.iva.f1.z zVar, int i4, int i5) {
            super(2);
            this.h = bVar;
            this.i = fVar;
            this.j = a0Var;
            this.k = lVar;
            this.l = i;
            this.m = z;
            this.n = i2;
            this.o = i3;
            this.p = map;
            this.q = zVar;
            this.r = i4;
            this.s = i5;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            g.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, iVar, com.amazon.aps.iva.ff0.b.I(this.r | 1), this.s);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Composables.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.u1.e> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.a h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e.a aVar) {
            super(0);
            this.h = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.amazon.aps.iva.u1.e, java.lang.Object] */
        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.u1.e invoke() {
            return this.h.invoke();
        }
    }

    /* compiled from: Composables.kt */
    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.u1.e> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.a h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e.a aVar) {
            super(0);
            this.h = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.amazon.aps.iva.u1.e, java.lang.Object] */
        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.u1.e invoke() {
            return this.h.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0219 A[LOOP:0: B:140:0x01ec->B:152:0x0219, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0217 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0113  */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.amazon.aps.iva.lb0.z] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.amazon.aps.iva.c2.b r32, com.amazon.aps.iva.a1.f r33, com.amazon.aps.iva.c2.a0 r34, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.c2.y, com.amazon.aps.iva.kb0.q> r35, int r36, boolean r37, int r38, int r39, java.util.Map<java.lang.String, com.amazon.aps.iva.j0.m0> r40, com.amazon.aps.iva.f1.z r41, com.amazon.aps.iva.o0.i r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 1236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.j0.g.a(com.amazon.aps.iva.c2.b, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.c2.a0, com.amazon.aps.iva.xb0.l, int, boolean, int, int, java.util.Map, com.amazon.aps.iva.f1.z, com.amazon.aps.iva.o0.i, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.lang.String r30, com.amazon.aps.iva.a1.f r31, com.amazon.aps.iva.c2.a0 r32, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.c2.y, com.amazon.aps.iva.kb0.q> r33, int r34, boolean r35, int r36, int r37, com.amazon.aps.iva.f1.z r38, com.amazon.aps.iva.o0.i r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.j0.g.b(java.lang.String, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.c2.a0, com.amazon.aps.iva.xb0.l, int, boolean, int, int, com.amazon.aps.iva.f1.z, com.amazon.aps.iva.o0.i, int, int):void");
    }

    public static final com.amazon.aps.iva.a1.f c(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.c2.b bVar, com.amazon.aps.iva.c2.a0 a0Var, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.c2.y, com.amazon.aps.iva.kb0.q> lVar, int i, boolean z, int i2, int i3, k.a aVar, List<b.C0158b<com.amazon.aps.iva.c2.p>> list, com.amazon.aps.iva.xb0.l<? super List<com.amazon.aps.iva.e1.e>, com.amazon.aps.iva.kb0.q> lVar2, com.amazon.aps.iva.k0.i iVar, com.amazon.aps.iva.f1.z zVar) {
        if (iVar == null) {
            return fVar.o(f.a.c).o(new TextAnnotatedStringElement(bVar, a0Var, aVar, lVar, i, z, i2, i3, list, lVar2, zVar));
        }
        return fVar.o(iVar.e).o(new SelectableTextAnnotatedStringElement(bVar, a0Var, aVar, lVar, i, z, i2, i3, list, lVar2, iVar, zVar));
    }
}
