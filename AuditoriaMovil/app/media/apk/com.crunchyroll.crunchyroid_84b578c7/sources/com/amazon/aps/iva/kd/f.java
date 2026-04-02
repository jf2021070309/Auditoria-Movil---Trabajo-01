package com.amazon.aps.iva.kd;

import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.b;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.c2.a0;
import com.amazon.aps.iva.d0.a;
import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.d0.v1;
import com.amazon.aps.iva.f1.p0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.m0.a4;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.o0.x0;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.s1.d0;
import com.amazon.aps.iva.s1.u;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.u1.e;
import com.amazon.aps.iva.ve0.l0;
import com.crunchyroll.crunchyroid.R;
import com.google.android.gms.cast.MediaError;
/* compiled from: ChangeEmailScreen.kt */
/* loaded from: classes.dex */
public final class f {

    /* compiled from: ChangeEmailScreen.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.account.changeemail.ChangeEmailScreenKt$ChangeEmailScreen$1", f = "ChangeEmailScreen.kt", l = {67}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public final /* synthetic */ Context i;
        public final /* synthetic */ o j;

        /* compiled from: ChangeEmailScreen.kt */
        /* renamed from: com.amazon.aps.iva.kd.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0441a implements com.amazon.aps.iva.ve0.g<String> {
            public final /* synthetic */ com.amazon.aps.iva.k50.b b;
            public final /* synthetic */ Context c;

            public C0441a(com.amazon.aps.iva.k50.c cVar, Context context) {
                this.b = cVar;
                this.c = context;
            }

            @Override // com.amazon.aps.iva.ve0.g
            public final Object a(String str, com.amazon.aps.iva.ob0.d dVar) {
                Context context = this.c;
                String string = context.getString(R.string.customer_support_url, str);
                com.amazon.aps.iva.yb0.j.e(string, "context.getString(Featur…tomer_support_url, email)");
                String string2 = context.getString(R.string.help_page_open_fallback_dialog_message);
                com.amazon.aps.iva.yb0.j.e(string2, "context.getString(\n     …message\n                )");
                String string3 = context.getString(R.string.need_help);
                com.amazon.aps.iva.yb0.j.e(string3, "context.getString(Featur…sources.string.need_help)");
                this.b.s1(string, string2, string3);
                return q.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, o oVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.i = context;
            this.j = oVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.i, this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.i0(obj);
            } else {
                x.i0(obj);
                Context context = this.i;
                com.amazon.aps.iva.yb0.j.f(context, "context");
                com.amazon.aps.iva.k50.c cVar = new com.amazon.aps.iva.k50.c(context, "");
                l0 C6 = this.j.C6();
                C0441a c0441a = new C0441a(cVar, context);
                this.h = 1;
                C6.getClass();
                if (l0.l(C6, c0441a, this) == aVar) {
                    return aVar;
                }
            }
            throw new com.amazon.aps.iva.la.a();
        }
    }

    /* compiled from: ChangeEmailScreen.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.account.changeemail.ChangeEmailScreenKt$ChangeEmailScreen$2", f = "ChangeEmailScreen.kt", l = {79}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public final /* synthetic */ o i;
        public final /* synthetic */ Context j;

        /* compiled from: ChangeEmailScreen.kt */
        /* loaded from: classes.dex */
        public static final class a implements com.amazon.aps.iva.ve0.g<com.amazon.aps.iva.bt.b> {
            public final /* synthetic */ Context b;

            public a(Context context) {
                this.b = context;
            }

            @Override // com.amazon.aps.iva.ve0.g
            public final Object a(com.amazon.aps.iva.bt.b bVar, com.amazon.aps.iva.ob0.d dVar) {
                com.amazon.aps.iva.u70.j jVar;
                com.amazon.aps.iva.bt.b bVar2 = bVar;
                Activity a = com.amazon.aps.iva.xw.q.a(this.b);
                if (a instanceof com.amazon.aps.iva.u70.j) {
                    jVar = (com.amazon.aps.iva.u70.j) a;
                } else {
                    jVar = null;
                }
                if (jVar != null) {
                    jVar.showSnackbar(bVar2);
                }
                return q.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, o oVar, com.amazon.aps.iva.ob0.d dVar) {
            super(2, dVar);
            this.i = oVar;
            this.j = context;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(this.j, this.i, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.i0(obj);
            } else {
                x.i0(obj);
                l0 b4 = this.i.b4();
                a aVar2 = new a(this.j);
                this.h = 1;
                b4.getClass();
                if (l0.l(b4, aVar2, this) == aVar) {
                    return aVar;
                }
            }
            throw new com.amazon.aps.iva.la.a();
        }
    }

    /* compiled from: ChangeEmailScreen.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<n, com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ com.amazon.aps.iva.a1.f h;
        public final /* synthetic */ o i;
        public final /* synthetic */ p3<com.amazon.aps.iva.ld.b> j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.a1.f fVar, o oVar, q1 q1Var) {
            super(3);
            this.h = fVar;
            this.i = oVar;
            this.j = q1Var;
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final q invoke(n nVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.a1.f b;
            int i;
            n nVar2 = nVar;
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            int intValue = num.intValue();
            com.amazon.aps.iva.yb0.j.f(nVar2, "data");
            if ((intValue & 14) == 0) {
                if (iVar2.H(nVar2)) {
                    i = 4;
                } else {
                    i = 2;
                }
                intValue |= i;
            }
            if ((intValue & 91) == 18 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                f.a aVar = f.a.c;
                b = androidx.compose.foundation.c.b(androidx.compose.foundation.layout.e.d(aVar), com.amazon.aps.iva.ao.a.u, p0.a);
                com.amazon.aps.iva.a1.b bVar2 = a.C0097a.e;
                iVar2.s(733328855);
                d0 c = com.amazon.aps.iva.d0.f.c(bVar2, false, iVar2);
                iVar2.s(-1323940314);
                int S = com.amazon.aps.iva.cq.b.S(iVar2);
                c2 l = iVar2.l();
                com.amazon.aps.iva.u1.e.o0.getClass();
                e.a aVar2 = e.a.b;
                com.amazon.aps.iva.v0.a a = u.a(b);
                if (iVar2.j() instanceof com.amazon.aps.iva.o0.d) {
                    iVar2.z();
                    if (iVar2.e()) {
                        iVar2.w(aVar2);
                    } else {
                        iVar2.m();
                    }
                    e.a.b bVar3 = e.a.e;
                    com.amazon.aps.iva.cq.b.k0(iVar2, c, bVar3);
                    e.a.d dVar = e.a.d;
                    com.amazon.aps.iva.cq.b.k0(iVar2, l, dVar);
                    e.a.C0752a c0752a = e.a.f;
                    if (iVar2.e() || !com.amazon.aps.iva.yb0.j.a(iVar2.t(), Integer.valueOf(S))) {
                        b2.c(S, iVar2, S, c0752a);
                    }
                    com.amazon.aps.iva.b8.i.c(0, a, new x2(iVar2), iVar2, 2058660585);
                    com.amazon.aps.iva.a1.f r = com.amazon.aps.iva.n1.c.r(androidx.compose.foundation.layout.e.m(androidx.compose.foundation.layout.d.e(this.h, 16), 0.0f, (float) MediaError.DetailedErrorCode.DASH_MANIFEST_UNKNOWN, 1), com.amazon.aps.iva.n1.c.l(iVar2));
                    b.a aVar3 = a.C0097a.n;
                    a.b bVar4 = com.amazon.aps.iva.d0.a.e;
                    iVar2.s(-483455358);
                    d0 a2 = com.amazon.aps.iva.d0.m.a(bVar4, aVar3, iVar2);
                    iVar2.s(-1323940314);
                    int S2 = com.amazon.aps.iva.cq.b.S(iVar2);
                    c2 l2 = iVar2.l();
                    com.amazon.aps.iva.v0.a a3 = u.a(r);
                    if (iVar2.j() instanceof com.amazon.aps.iva.o0.d) {
                        iVar2.z();
                        if (iVar2.e()) {
                            iVar2.w(aVar2);
                        } else {
                            iVar2.m();
                        }
                        com.amazon.aps.iva.cq.b.k0(iVar2, a2, bVar3);
                        com.amazon.aps.iva.cq.b.k0(iVar2, l2, dVar);
                        if (iVar2.e() || !com.amazon.aps.iva.yb0.j.a(iVar2.t(), Integer.valueOf(S2))) {
                            b2.c(S2, iVar2, S2, c0752a);
                        }
                        com.amazon.aps.iva.b8.i.c(0, a3, new x2(iVar2), iVar2, 2058660585);
                        com.amazon.aps.iva.a1.f a4 = com.amazon.aps.iva.a2.o.a(aVar, false, g.h);
                        a0 a0Var = com.amazon.aps.iva.ao.b.k;
                        long j = com.amazon.aps.iva.ao.a.j;
                        m mVar = nVar2.a;
                        a4.b(defpackage.i.E(mVar.getEmailLabelResId(), iVar2), a4, j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, a0Var, iVar2, 0, 0, 65528);
                        com.amazon.aps.iva.a1.f i2 = androidx.compose.foundation.layout.d.i(com.amazon.aps.iva.a2.o.a(aVar, false, h.h), 0.0f, 4, 0.0f, 0.0f, 13);
                        a0 a0Var2 = com.amazon.aps.iva.ao.b.e;
                        long j2 = com.amazon.aps.iva.ao.a.r;
                        a4.b(nVar2.b, i2, j2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, a0Var2, iVar2, 0, 0, 65528);
                        float f = 24;
                        com.amazon.aps.iva.a0.p0.a(com.amazon.aps.iva.z1.b.a(mVar.getImageResId(), iVar2), null, androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.e.j(aVar, (float) MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN), 0.0f, f, 1), null, null, 0.0f, null, iVar2, 440, 120);
                        a4.b(defpackage.i.E(mVar.getTitleResId(), iVar2), null, j2, 0L, null, null, null, 0L, null, new com.amazon.aps.iva.n2.h(3), 0L, 0, false, 0, 0, null, a0Var2, iVar2, 0, 0, 65018);
                        a4.b(defpackage.i.E(mVar.getSubTitleResId(), iVar2), androidx.compose.foundation.layout.d.i(aVar, 0.0f, 8, 0.0f, 0.0f, 13), j, 0L, null, null, null, 0L, null, new com.amazon.aps.iva.n2.h(3), 0L, 0, false, 0, 0, null, a0Var, iVar2, 48, 0, 65016);
                        com.amazon.aps.iva.a1.f g = androidx.compose.foundation.layout.d.g(aVar, 0.0f, f, 1);
                        com.amazon.aps.iva.ld.b value = this.j.getValue();
                        int ctaTextResId = mVar.getCtaTextResId();
                        int confirmationTextResId = mVar.getConfirmationTextResId();
                        o oVar = this.i;
                        com.amazon.aps.iva.ld.a.a(value, g, ctaTextResId, confirmationTextResId, new i(oVar), new j(oVar), iVar2, 48, 0);
                        iVar2.s(693286680);
                        d0 a5 = v1.a(com.amazon.aps.iva.d0.a.a, a.C0097a.j, iVar2);
                        iVar2.s(-1323940314);
                        int S3 = com.amazon.aps.iva.cq.b.S(iVar2);
                        c2 l3 = iVar2.l();
                        com.amazon.aps.iva.v0.a a6 = u.a(aVar);
                        if (iVar2.j() instanceof com.amazon.aps.iva.o0.d) {
                            iVar2.z();
                            if (iVar2.e()) {
                                iVar2.w(aVar2);
                            } else {
                                iVar2.m();
                            }
                            com.amazon.aps.iva.cq.b.k0(iVar2, a5, bVar3);
                            com.amazon.aps.iva.cq.b.k0(iVar2, l3, dVar);
                            if (iVar2.e() || !com.amazon.aps.iva.yb0.j.a(iVar2.t(), Integer.valueOf(S3))) {
                                b2.c(S3, iVar2, S3, c0752a);
                            }
                            com.amazon.aps.iva.b8.i.c(0, a6, new x2(iVar2), iVar2, 2058660585);
                            a0 a0Var3 = com.amazon.aps.iva.ao.b.l;
                            a4.b(defpackage.i.E(R.string.change_email_having_trouble, iVar2).concat(" "), null, j2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, a0Var3, iVar2, 0, 0, 65530);
                            a4.b(defpackage.i.E(R.string.change_email_contact_customer_support, iVar2), androidx.compose.foundation.f.c(com.amazon.aps.iva.a2.o.a(aVar, false, k.h), new l(oVar)), com.amazon.aps.iva.ao.a.a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, a0Var3, iVar2, 0, 0, 65528);
                            iVar2.G();
                            iVar2.o();
                            iVar2.G();
                            iVar2.G();
                            iVar2.G();
                            iVar2.o();
                            iVar2.G();
                            iVar2.G();
                            iVar2.G();
                            iVar2.o();
                            iVar2.G();
                            iVar2.G();
                        } else {
                            com.amazon.aps.iva.cq.b.W();
                            throw null;
                        }
                    } else {
                        com.amazon.aps.iva.cq.b.W();
                        throw null;
                    }
                } else {
                    com.amazon.aps.iva.cq.b.W();
                    throw null;
                }
            }
            return q.a;
        }
    }

    /* compiled from: ChangeEmailScreen.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<n, com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ com.amazon.aps.iva.a1.f h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.amazon.aps.iva.a1.f fVar) {
            super(3);
            this.h = fVar;
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final q invoke(n nVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.a1.f b;
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 81) == 16 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                b = androidx.compose.foundation.c.b(androidx.compose.foundation.layout.e.d(this.h), com.amazon.aps.iva.ao.a.u, p0.a);
                com.amazon.aps.iva.a1.b bVar2 = a.C0097a.e;
                iVar2.s(733328855);
                d0 c = com.amazon.aps.iva.d0.f.c(bVar2, false, iVar2);
                iVar2.s(-1323940314);
                int S = com.amazon.aps.iva.cq.b.S(iVar2);
                c2 l = iVar2.l();
                com.amazon.aps.iva.u1.e.o0.getClass();
                e.a aVar = e.a.b;
                com.amazon.aps.iva.v0.a a = u.a(b);
                if (iVar2.j() instanceof com.amazon.aps.iva.o0.d) {
                    iVar2.z();
                    if (iVar2.e()) {
                        iVar2.w(aVar);
                    } else {
                        iVar2.m();
                    }
                    com.amazon.aps.iva.cq.b.k0(iVar2, c, e.a.e);
                    com.amazon.aps.iva.cq.b.k0(iVar2, l, e.a.d);
                    e.a.C0752a c0752a = e.a.f;
                    if (iVar2.e() || !com.amazon.aps.iva.yb0.j.a(iVar2.t(), Integer.valueOf(S))) {
                        b2.c(S, iVar2, S, c0752a);
                    }
                    com.amazon.aps.iva.b8.i.c(0, a, new x2(iVar2), iVar2, 2058660585);
                    com.amazon.aps.iva.zn.f.a(null, iVar2, 0, 1);
                    iVar2.G();
                    iVar2.o();
                    iVar2.G();
                    iVar2.G();
                } else {
                    com.amazon.aps.iva.cq.b.W();
                    throw null;
                }
            }
            return q.a;
        }
    }

    /* compiled from: ChangeEmailScreen.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ o h;
        public final /* synthetic */ com.amazon.aps.iva.a1.f i;
        public final /* synthetic */ int j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(o oVar, com.amazon.aps.iva.a1.f fVar, int i, int i2) {
            super(2);
            this.h = oVar;
            this.i = fVar;
            this.j = i;
            this.k = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.j | 1);
            f.a(this.h, this.i, iVar, I, this.k);
            return q.a;
        }
    }

    public static final void a(o oVar, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        com.amazon.aps.iva.yb0.j.f(oVar, "viewModel");
        com.amazon.aps.iva.o0.j g = iVar.g(-2116083734);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (g.H(oVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (g.H(fVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 91) == 18 && g.h()) {
            g.A();
        } else {
            if (i6 != 0) {
                fVar = f.a.c;
            }
            e0.b bVar = e0.a;
            q1 I = com.amazon.aps.iva.cq.b.I(oVar.getState(), g);
            q1 I2 = com.amazon.aps.iva.cq.b.I(oVar.y4(), g);
            Context context = (Context) g.i(androidx.compose.ui.platform.d.b);
            q qVar = q.a;
            x0.c(qVar, new a(context, oVar, null), g);
            x0.c(qVar, new b(context, oVar, null), g);
            com.amazon.aps.iva.ez.h.a((com.amazon.aps.iva.ez.g) I.getValue(), com.amazon.aps.iva.v0.b.b(g, 332835882, new c(fVar, oVar, I2)), null, com.amazon.aps.iva.v0.b.b(g, 68188392, new d(fVar)), g, 3120, 4);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new e(oVar, fVar, i, i2);
        }
    }
}
