package com.amazon.aps.iva.y30;

import android.content.res.Resources;
import androidx.preference.Preference;
import androidx.preference.SwitchPreferenceCompat;
import com.amazon.aps.iva.ee0.f1;
import com.ellation.crunchyroll.api.etp.account.model.AccountApiModel;
import com.ellation.crunchyroll.api.etp.account.model.ProfileApiModel;
import com.ellation.crunchyroll.api.etp.subscription.model.Benefit;
import java.util.List;
/* compiled from: SettingsListPresenter.kt */
/* loaded from: classes2.dex */
public final class w extends com.amazon.aps.iva.wy.b<d0> implements v {
    public final com.amazon.aps.iva.qd.a A;
    public Integer B;
    public final Resources b;
    public final com.amazon.aps.iva.y30.k c;
    public final com.amazon.aps.iva.sv.k d;
    public final com.amazon.aps.iva.bo.f e;
    public final com.amazon.aps.iva.x50.a f;
    public final com.amazon.aps.iva.y30.h g;
    public final com.amazon.aps.iva.k40.b h;
    public final l0 i;
    public final com.amazon.aps.iva.wg.a j;
    public final com.amazon.aps.iva.j40.a k;
    public final com.amazon.aps.iva.lh.a l;
    public final com.amazon.aps.iva.kh.e m;
    public final com.amazon.aps.iva.xb0.a<String> n;
    public final com.amazon.aps.iva.xb0.l<String, String> o;
    public final com.amazon.aps.iva.xb0.a<Boolean> p;
    public final boolean q;
    public final List<Benefit> r;
    public final com.amazon.aps.iva.me.j s;
    public final boolean t;
    public final com.amazon.aps.iva.y30.d u;
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.th.a> v;
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.jf.a> w;
    public final com.amazon.aps.iva.xb0.a<Boolean> x;
    public final boolean y;
    public final com.amazon.aps.iva.d40.f z;

    /* compiled from: SettingsListPresenter.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.y30.c.values().length];
            try {
                iArr[com.amazon.aps.iva.y30.c.SIGN_OUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.amazon.aps.iva.y30.c.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.amazon.aps.iva.y30.c.SYNC_OVER_CELLULAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.amazon.aps.iva.y30.c.STREAM_OVER_CELLULAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.amazon.aps.iva.y30.c.SHOW_CLOSED_CAPTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[com.amazon.aps.iva.y30.c.SHOW_MATURE_CONTENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[com.amazon.aps.iva.y30.c.SWITCH_PROFILE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[com.amazon.aps.iva.y30.c.CHANGE_PHONE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[com.amazon.aps.iva.y30.c.CHANGE_EMAIL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[com.amazon.aps.iva.y30.c.NEED_HELP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[com.amazon.aps.iva.y30.c.REDEEM_PROMO_CODE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[com.amazon.aps.iva.y30.c.MEMBERSHIP_CARD.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[com.amazon.aps.iva.y30.c.WHATSAPP_HELP.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            a = iArr;
        }
    }

    /* compiled from: SettingsListPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Boolean, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Boolean bool) {
            Boolean bool2 = bool;
            d0 q6 = w.q6(w.this);
            com.amazon.aps.iva.yb0.j.e(bool2, "isChecked");
            q6.gb(bool2.booleanValue());
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SettingsListPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.wg.b, com.amazon.aps.iva.kb0.q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.wg.b bVar) {
            com.amazon.aps.iva.wg.b bVar2 = bVar;
            w wVar = w.this;
            d0 q6 = w.q6(wVar);
            com.amazon.aps.iva.y30.c cVar = com.amazon.aps.iva.y30.c.SYNC_QUALITY;
            com.amazon.aps.iva.yb0.j.e(bVar2, "option");
            q6.Ha(cVar, wVar.k.a(bVar2));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SettingsListPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Boolean, com.amazon.aps.iva.kb0.q> {
        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Boolean bool) {
            Boolean bool2 = bool;
            com.amazon.aps.iva.yb0.j.e(bool2, "isInGrace");
            boolean booleanValue = bool2.booleanValue();
            w wVar = w.this;
            if (booleanValue) {
                w.q6(wVar).y9();
            } else {
                w.q6(wVar).j6();
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SettingsListPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends ProfileApiModel>, com.amazon.aps.iva.kb0.q> {
        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends ProfileApiModel> gVar) {
            gVar.e(new z(w.this));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SettingsListPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends AccountApiModel>, com.amazon.aps.iva.kb0.q> {
        public f() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends AccountApiModel> gVar) {
            gVar.e(new a0(w.this));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SettingsListPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<String, com.amazon.aps.iva.kb0.q> {
        public g() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(String str) {
            w.q6(w.this).m9(str);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SettingsListPresenter.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class h extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y30.c, com.amazon.aps.iva.kb0.q> {
        public h(Object obj) {
            super(1, obj, w.class, "selectPreferenceHeader", "selectPreferenceHeader(Lcom/ellation/crunchyroll/presentation/settings/PreferenceHeader;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.y30.c cVar) {
            com.amazon.aps.iva.y30.c cVar2 = cVar;
            com.amazon.aps.iva.yb0.j.f(cVar2, "p0");
            w wVar = (w) this.receiver;
            Integer num = wVar.B;
            if (num != null) {
                wVar.getView().xf(num.intValue(), false);
            }
            if (!com.amazon.aps.iva.aq.k.r(cVar2)) {
                wVar.getView().xf(cVar2.getKeyId(), true);
                wVar.B = Integer.valueOf(cVar2.getKeyId());
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SettingsListPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<String, com.amazon.aps.iva.kb0.q> {
        public i() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(String str) {
            String str2 = str;
            w wVar = w.this;
            d0 q6 = w.q6(wVar);
            com.amazon.aps.iva.y30.c cVar = com.amazon.aps.iva.y30.c.PREFERRED_SUBTITLE_CC_LANGUAGE;
            com.amazon.aps.iva.yb0.j.e(str2, "language");
            q6.Ha(cVar, wVar.l.getTitleForLanguage(str2));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SettingsListPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<String, com.amazon.aps.iva.kb0.q> {
        public j() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(String str) {
            String str2 = str;
            w wVar = w.this;
            d0 q6 = w.q6(wVar);
            com.amazon.aps.iva.y30.c cVar = com.amazon.aps.iva.y30.c.PREFERRED_AUDIO_LANGUAGE;
            com.amazon.aps.iva.yb0.j.e(str2, "language");
            q6.Ha(cVar, wVar.m.getTitleForLanguage(str2));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SettingsListPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Boolean, com.amazon.aps.iva.kb0.q> {
        public k() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Boolean bool) {
            Boolean bool2 = bool;
            d0 q6 = w.q6(w.this);
            com.amazon.aps.iva.yb0.j.e(bool2, "enabled");
            q6.O2(bool2.booleanValue());
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SettingsListPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends Boolean>, com.amazon.aps.iva.kb0.q> {
        public l() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends Boolean> gVar) {
            com.amazon.aps.iva.ez.g<? extends Boolean> gVar2 = gVar;
            w wVar = w.this;
            gVar2.c(new b0(wVar));
            gVar2.e(new c0(wVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SettingsListPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.kb0.q, com.amazon.aps.iva.kb0.q> {
        public m() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.kb0.q qVar) {
            com.amazon.aps.iva.yb0.j.f(qVar, "$this$observeEvent");
            w.q6(w.this).showSnackbar(com.amazon.aps.iva.bt.c.b);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SettingsListPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class n implements com.amazon.aps.iva.i5.w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public n(com.amazon.aps.iva.xb0.l lVar) {
            this.a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof com.amazon.aps.iva.i5.w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
                return false;
            }
            return com.amazon.aps.iva.yb0.j.a(this.a, ((com.amazon.aps.iva.yb0.f) obj).getFunctionDelegate());
        }

        @Override // com.amazon.aps.iva.yb0.f
        public final com.amazon.aps.iva.kb0.a<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // com.amazon.aps.iva.i5.w
        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    public w(t tVar, Resources resources, com.amazon.aps.iva.y30.l lVar, com.amazon.aps.iva.sv.k kVar, com.amazon.aps.iva.bo.f fVar, com.amazon.aps.iva.x50.a aVar, com.amazon.aps.iva.y30.i iVar, com.amazon.aps.iva.k40.b bVar, l0 l0Var, com.amazon.aps.iva.wg.a aVar2, com.amazon.aps.iva.j40.b bVar2, com.amazon.aps.iva.lh.b bVar3, com.amazon.aps.iva.kh.e eVar, o oVar, p pVar, com.amazon.aps.iva.xb0.a aVar3, boolean z, List list, com.amazon.aps.iva.me.j jVar, boolean z2, com.amazon.aps.iva.y30.e eVar2, q qVar, r rVar, s sVar, boolean z3, com.amazon.aps.iva.d40.f fVar2, com.amazon.aps.iva.qd.c cVar) {
        super(tVar, lVar);
        this.b = resources;
        this.c = lVar;
        this.d = kVar;
        this.e = fVar;
        this.f = aVar;
        this.g = iVar;
        this.h = bVar;
        this.i = l0Var;
        this.j = aVar2;
        this.k = bVar2;
        this.l = bVar3;
        this.m = eVar;
        this.n = oVar;
        this.o = pVar;
        this.p = aVar3;
        this.q = z;
        this.r = list;
        this.s = jVar;
        this.t = z2;
        this.u = eVar2;
        this.v = qVar;
        this.w = rVar;
        this.x = sVar;
        this.y = z3;
        this.z = fVar2;
        this.A = cVar;
    }

    public static final /* synthetic */ d0 q6(w wVar) {
        return wVar.getView();
    }

    @Override // com.amazon.aps.iva.y30.v
    public final void I2(Preference preference, com.amazon.aps.iva.y30.c cVar) {
        int i2 = a.a[cVar.ordinal()];
        if (i2 != 3) {
            l0 l0Var = this.i;
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6 && (preference instanceof SwitchPreferenceCompat)) {
                        l0Var.v2(((SwitchPreferenceCompat) preference).O);
                        return;
                    }
                    return;
                } else if (preference instanceof SwitchPreferenceCompat) {
                    l0Var.y5(((SwitchPreferenceCompat) preference).O);
                    return;
                } else {
                    return;
                }
            } else if (preference instanceof SwitchPreferenceCompat) {
                l0Var.b8(((SwitchPreferenceCompat) preference).O);
                return;
            } else {
                return;
            }
        }
        com.amazon.aps.iva.x50.a aVar = this.f;
        if (!aVar.a()) {
            this.d.A4();
        }
        this.g.i(aVar.a());
    }

    @Override // com.amazon.aps.iva.y30.v
    public final void a1(String str) {
        getView().wf(str);
        r6();
    }

    @Override // com.amazon.aps.iva.y30.v
    public final void m5(com.amazon.aps.iva.y30.c cVar) {
        int i2 = a.a[cVar.ordinal()];
        com.amazon.aps.iva.y30.h hVar = this.g;
        com.amazon.aps.iva.y30.d dVar = this.u;
        com.amazon.aps.iva.k40.b bVar = this.h;
        switch (i2) {
            case 1:
                this.c.d();
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return;
            case 7:
                getView().rb();
                return;
            case 8:
                getView().D4();
                return;
            case 9:
                getView().d();
                bVar.U2(cVar);
                return;
            case 10:
                getView().ae(this.n.invoke());
                return;
            case 11:
                getView().d9();
                hVar.J(dVar.a(cVar));
                return;
            case 12:
                getView().s3();
                return;
            case 13:
                this.A.a();
                hVar.k(dVar.a(cVar));
                return;
            default:
                getView().d();
                bVar.U2(cVar);
                return;
        }
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        l0 l0Var = this.i;
        l0Var.j0().e(getView(), new n(new e()));
        l0Var.getAccount().e(getView(), new n(new f()));
        if (this.y) {
            getView().I2();
        } else {
            getView().F3();
        }
        if (this.A.isEnabled()) {
            getView().Gd();
        } else {
            getView().v7();
        }
        l0Var.p8().e(getView(), new n(new g()));
        h hVar = new h(this);
        this.h.S3(getView(), hVar);
        l0Var.C5().e(getView(), new n(new i()));
        if (this.q) {
            com.amazon.aps.iva.y30.c cVar = com.amazon.aps.iva.y30.c.MEMBERSHIP_PLAN;
            String string = this.b.getString(f1.D(this.r));
            com.amazon.aps.iva.yb0.j.e(string, "resources.getString(\n   …      )\n                )");
            getView().Ha(cVar, string);
        }
        l0Var.d4().e(getView(), new n(new j()));
        l0Var.N4().e(getView(), new n(new k()));
        l0Var.S6().e(getView(), new n(new l()));
        com.amazon.aps.iva.ez.e.a(l0Var.r3(), getView(), new m());
        l0Var.l5().e(getView(), new n(new b()));
        this.j.T().e(getView(), new n(new c()));
        if (this.s.B()) {
            l0Var.r2().e(getView(), new n(new d()));
        }
        if (this.v.invoke().isEnabled()) {
            getView().X2();
        } else {
            getView().Vg();
        }
        if (this.w.invoke().isEnabled()) {
            getView().N2();
        } else {
            getView().Ne();
        }
        if (this.x.invoke().booleanValue()) {
            getView().Vd();
            getView().Nd();
            com.amazon.aps.iva.d40.f fVar = this.z;
            fVar.getExtendedMaturityRating().e(getView(), new n(new x(this)));
            com.amazon.aps.iva.ez.e.a(fVar.y8(), getView(), new y(this));
            return;
        }
        getView().L2();
        getView().Kf();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onPause() {
        getView().c0();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onResume() {
        getView().d0();
        r6();
        this.i.t5();
    }

    public final void r6() {
        if (this.p.invoke().booleanValue()) {
            getView().Q9();
            getView().Z3(this.f.a());
            return;
        }
        getView().C2();
    }

    @Override // com.amazon.aps.iva.y30.v
    public final void t() {
        AccountApiModel m0 = this.e.m0();
        getView().ae(this.o.invoke((m0 == null || (r0 = m0.getEmail()) == null) ? "" : ""));
    }
}
