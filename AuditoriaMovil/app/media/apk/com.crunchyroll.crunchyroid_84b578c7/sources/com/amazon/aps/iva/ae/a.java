package com.amazon.aps.iva.ae;

import com.amazon.aps.iva.ae.i;
import com.amazon.aps.iva.i2.e0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: LogInScreenContent.kt */
/* loaded from: classes.dex */
public final class a {

    /* compiled from: LogInScreenContent.kt */
    /* renamed from: com.amazon.aps.iva.ae.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0114a extends l implements com.amazon.aps.iva.xb0.l<i, q> {
        public static final C0114a h = new C0114a();

        public C0114a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(i iVar) {
            j.f(iVar, "it");
            return q.a;
        }
    }

    /* compiled from: LogInScreenContent.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<i, q> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(com.amazon.aps.iva.xb0.l<? super i, q> lVar) {
            super(0);
            this.h = lVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            this.h.invoke(i.a.a);
            return q.a;
        }
    }

    /* compiled from: LogInScreenContent.kt */
    /* loaded from: classes.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.l<e0, q> {
        public final /* synthetic */ q1<e0> h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<i, q> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(q1<e0> q1Var, com.amazon.aps.iva.xb0.l<? super i, q> lVar) {
            super(1);
            this.h = q1Var;
            this.i = lVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(e0 e0Var) {
            e0 e0Var2 = e0Var;
            j.f(e0Var2, "it");
            this.h.setValue(e0Var2);
            this.i.invoke(new i.d(e0Var2.a.b));
            return q.a;
        }
    }

    /* compiled from: LogInScreenContent.kt */
    /* loaded from: classes.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fs.b, q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<i, q> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(com.amazon.aps.iva.xb0.l<? super i, q> lVar) {
            super(1);
            this.h = lVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.fs.b bVar) {
            j.f(bVar, "it");
            this.h.invoke(i.e.a);
            return q.a;
        }
    }

    /* compiled from: LogInScreenContent.kt */
    /* loaded from: classes.dex */
    public static final class e extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<i, q> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(com.amazon.aps.iva.xb0.l<? super i, q> lVar) {
            super(0);
            this.h = lVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            this.h.invoke(i.c.a);
            return q.a;
        }
    }

    /* compiled from: LogInScreenContent.kt */
    /* loaded from: classes.dex */
    public static final class f extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<i, q> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(com.amazon.aps.iva.xb0.l<? super i, q> lVar) {
            super(0);
            this.h = lVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            this.h.invoke(i.b.a);
            return q.a;
        }
    }

    /* compiled from: LogInScreenContent.kt */
    /* loaded from: classes.dex */
    public static final class g extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ h h;
        public final /* synthetic */ com.amazon.aps.iva.a1.f i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<i, q> j;
        public final /* synthetic */ int k;
        public final /* synthetic */ int l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(h hVar, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.xb0.l<? super i, q> lVar, int i, int i2) {
            super(2);
            this.h = hVar;
            this.i = fVar;
            this.j = lVar;
            this.k = i;
            this.l = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            a.a(this.h, this.i, this.j, iVar, com.amazon.aps.iva.ff0.b.I(this.k | 1), this.l);
            return q.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.amazon.aps.iva.ae.h r41, com.amazon.aps.iva.a1.f r42, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.ae.i, com.amazon.aps.iva.kb0.q> r43, com.amazon.aps.iva.o0.i r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ae.a.a(com.amazon.aps.iva.ae.h, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.xb0.l, com.amazon.aps.iva.o0.i, int, int):void");
    }
}
