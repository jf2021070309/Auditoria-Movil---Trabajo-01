package com.amazon.aps.iva.a20;

import android.content.Intent;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.cg.d0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.kf.a0;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.y30.h;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.presentation.main.settings.SettingsBottomBarActivity;
/* compiled from: SettingsBottomBarPresenter.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.wy.b<d> implements com.amazon.aps.iva.a20.b {
    public final com.amazon.aps.iva.k40.b b;
    public final com.amazon.aps.iva.ct.d c;
    public d0 d;
    public final h e;

    /* compiled from: SettingsBottomBarPresenter.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d0.values().length];
            try {
                iArr[d0.NOTIFICATIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d0.CONNECTED_APPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d0.CONNECTED_APPS_SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d0.CONNECTED_APPS_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d0.MEMBERSHIP_PLAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[d0.PERSISTENT_MESSAGE_CENTER_NOTIFICATIONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[d0.CHANGE_EMAIL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr;
        }
    }

    /* compiled from: SettingsBottomBarPresenter.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b extends i implements l<com.amazon.aps.iva.y30.c, q> {
        public b(Object obj) {
            super(1, obj, c.class, "onHeaderSelected", "onHeaderSelected(Lcom/ellation/crunchyroll/presentation/settings/PreferenceHeader;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.y30.c cVar) {
            boolean z;
            boolean z2;
            com.amazon.aps.iva.y30.c cVar2 = cVar;
            j.f(cVar2, "p0");
            c cVar3 = (c) this.receiver;
            boolean z3 = true;
            if (cVar2 != cVar3.b.k6()) {
                z = true;
            } else {
                z = false;
            }
            if (cVar3.getView().z1() > 0 && cVar2 != com.amazon.aps.iva.y30.c.DEFAULT && cVar3.getView().E() && z) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                cVar3.getView().T9();
            }
            if (cVar3.getView().z1() != 0 && j.a(cVar3.getView().df(cVar3.getView().z1() - 1), cVar2.name())) {
                z3 = false;
            }
            if (z3) {
                cVar3.getView().na(cVar2);
                cVar3.r6(cVar2);
            } else {
                cVar3.getView().b8();
            }
            if (cVar3.getView().E()) {
                cVar3.getView().Rb();
            }
            return q.a;
        }
    }

    /* compiled from: SettingsBottomBarPresenter.kt */
    /* renamed from: com.amazon.aps.iva.a20.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0099c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public C0099c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            c cVar = c.this;
            if (cVar.b.k6() == com.amazon.aps.iva.y30.c.MEMBERSHIP_PLAN) {
                cVar.getView().T9();
                com.amazon.aps.iva.k40.b bVar = cVar.b;
                cVar.getView().na(bVar.k6());
                cVar.r6(bVar.k6());
                if (cVar.getView().E()) {
                    cVar.getView().Rb();
                }
            }
            return q.a;
        }
    }

    public c(SettingsBottomBarActivity settingsBottomBarActivity, com.amazon.aps.iva.y30.l lVar, com.amazon.aps.iva.k40.b bVar, com.amazon.aps.iva.ct.d dVar, d0 d0Var, h hVar) {
        super(settingsBottomBarActivity, lVar);
        this.b = bVar;
        this.c = dVar;
        this.d = d0Var;
        this.e = hVar;
    }

    @Override // com.amazon.aps.iva.a20.b
    public final void a() {
        getView().d();
        if (getView().E()) {
            getView().la();
            return;
        }
        getView().x();
        q6();
    }

    @Override // com.amazon.aps.iva.a20.b
    public final void a4() {
        q6();
    }

    @Override // com.amazon.aps.iva.a20.b
    public final void c5() {
        if (!getView().E() && !k.r(this.b.k6())) {
            getView().mf();
        } else {
            getView().Pc();
        }
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        com.amazon.aps.iva.k40.b bVar = this.b;
        r6(bVar.k6());
        getView().ig();
        bVar.R5(getView(), new b(this));
        d0 d0Var = this.d;
        if (d0Var != null) {
            switch (a.a[d0Var.ordinal()]) {
                case 1:
                    bVar.U2(com.amazon.aps.iva.y30.c.NOTIFICATIONS);
                    this.d = null;
                    break;
                case 2:
                    bVar.U2(com.amazon.aps.iva.y30.c.CONNECTED_APPS);
                    this.d = null;
                    break;
                case 3:
                    bVar.U2(com.amazon.aps.iva.y30.c.CONNECTED_APPS);
                    getView().showSnackbar(a0.b);
                    this.d = null;
                    break;
                case 4:
                    bVar.U2(com.amazon.aps.iva.y30.c.CONNECTED_APPS);
                    getView().showSnackbar(com.amazon.aps.iva.bt.c.b);
                    this.d = null;
                    break;
                case 5:
                    bVar.U2(com.amazon.aps.iva.y30.c.MEMBERSHIP_PLAN);
                    this.d = null;
                    break;
                case 6:
                    bVar.U2(com.amazon.aps.iva.y30.c.PERSISTENT_MESSAGE_CENTER);
                    this.d = null;
                    break;
                case 7:
                    bVar.U2(com.amazon.aps.iva.y30.c.CHANGE_EMAIL);
                    this.d = null;
                    break;
            }
            getView().R0();
        } else if (k.r(bVar.k6())) {
            q6();
        }
        this.e.c();
        C0099c c0099c = new C0099c();
        this.c.a(getView(), c0099c);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onNewIntent(Intent intent) {
        j.f(intent, "intent");
        this.e.onNewIntent(intent);
    }

    public final void q6() {
        boolean E = getView().E();
        com.amazon.aps.iva.k40.b bVar = this.b;
        if (E) {
            bVar.U2(com.amazon.aps.iva.y30.c.MEMBERSHIP_PLAN);
        } else {
            bVar.U2(com.amazon.aps.iva.y30.c.DEFAULT);
        }
    }

    public final void r6(com.amazon.aps.iva.y30.c cVar) {
        if (cVar.getPrefNameResId() != 0 && !getView().E()) {
            getView().Xf(cVar.getPrefNameResId());
        }
        if (!getView().E() && !k.r(cVar)) {
            getView().i2();
            getView().mf();
            return;
        }
        getView().j0();
        getView().Pc();
    }
}
