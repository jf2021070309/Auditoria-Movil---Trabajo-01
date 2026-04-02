package com.amazon.aps.iva.he;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.i2.e0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: AuthInputText.kt */
/* loaded from: classes.dex */
public final class a {

    /* compiled from: AuthInputText.kt */
    /* renamed from: com.amazon.aps.iva.he.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0337a extends l implements com.amazon.aps.iva.xb0.l<e0, q> {
        public static final C0337a h = new C0337a();

        public C0337a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(e0 e0Var) {
            j.f(e0Var, "it");
            return q.a;
        }
    }

    /* compiled from: AuthInputText.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<e0, q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<e0, q> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(com.amazon.aps.iva.xb0.l<? super e0, q> lVar) {
            super(1);
            this.h = lVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(e0 e0Var) {
            e0 e0Var2 = e0Var;
            j.f(e0Var2, "it");
            this.h.invoke(e0Var2);
            return q.a;
        }
    }

    /* compiled from: AuthInputText.kt */
    /* loaded from: classes.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ q1<Boolean> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(q1<Boolean> q1Var) {
            super(0);
            this.h = q1Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            q1<Boolean> q1Var = this.h;
            q1Var.setValue(Boolean.valueOf(!q1Var.getValue().booleanValue()));
            return q.a;
        }
    }

    /* compiled from: AuthInputText.kt */
    /* loaded from: classes.dex */
    public static final class d extends l implements p<i, Integer, q> {
        public final /* synthetic */ e0 h;
        public final /* synthetic */ f i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<e0, q> j;
        public final /* synthetic */ String k;
        public final /* synthetic */ int l;
        public final /* synthetic */ int m;
        public final /* synthetic */ int n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(e0 e0Var, f fVar, com.amazon.aps.iva.xb0.l<? super e0, q> lVar, String str, int i, int i2, int i3) {
            super(2);
            this.h = e0Var;
            this.i = fVar;
            this.j = lVar;
            this.k = str;
            this.l = i;
            this.m = i2;
            this.n = i3;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            num.intValue();
            a.a(this.h, this.i, this.j, this.k, this.l, iVar, com.amazon.aps.iva.ff0.b.I(this.m | 1), this.n);
            return q.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0190 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.amazon.aps.iva.i2.e0 r40, com.amazon.aps.iva.a1.f r41, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.i2.e0, com.amazon.aps.iva.kb0.q> r42, java.lang.String r43, int r44, com.amazon.aps.iva.o0.i r45, int r46, int r47) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.he.a.a(com.amazon.aps.iva.i2.e0, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.xb0.l, java.lang.String, int, com.amazon.aps.iva.o0.i, int, int):void");
    }
}
