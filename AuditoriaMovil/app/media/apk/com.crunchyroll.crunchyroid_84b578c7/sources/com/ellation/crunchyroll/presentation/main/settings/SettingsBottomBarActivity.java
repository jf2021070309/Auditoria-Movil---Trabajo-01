package com.ellation.crunchyroll.presentation.main.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import com.amazon.aps.iva.cg.d0;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.gr.n;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.lb0.m0;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.y30.h;
import com.amazon.aps.iva.y30.i;
import com.amazon.aps.iva.y30.j;
import com.amazon.aps.iva.y30.t;
import com.amazon.aps.iva.ys.p;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.auth.RefreshTokenProvider;
import com.ellation.crunchyroll.application.a;
import com.ellation.crunchyroll.presentation.search.result.summary.SearchResultSummaryActivity;
import com.ellation.crunchyroll.ui.KeyboardAwareLayoutListener;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: SettingsBottomBarActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/ellation/crunchyroll/presentation/main/settings/SettingsBottomBarActivity;", "Lcom/amazon/aps/iva/v10/a;", "Lcom/amazon/aps/iva/a20/d;", "<init>", "()V", "a", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SettingsBottomBarActivity extends com.amazon.aps.iva.v10.a implements com.amazon.aps.iva.a20.d {
    public final com.amazon.aps.iva.ls.a A;
    public boolean v;
    public final j y;
    public Menu z;
    public static final /* synthetic */ l<Object>[] C = {q.a(SettingsBottomBarActivity.class, "contentView", "getContentView()Landroid/view/View;", 0), q.a(SettingsBottomBarActivity.class, "toolbar", "getToolbar()Landroid/view/View;", 0)};
    public static final a B = new a();
    public final int r = 4;
    public final int s = R.layout.activity_settings_bottom_navigation;
    public final v t = com.amazon.aps.iva.xw.g.d(this, 16908290);
    public final v u = com.amazon.aps.iva.xw.g.d(this, R.id.toolbar);
    public final com.amazon.aps.iva.xw.a w = com.amazon.aps.iva.xw.b.b(this, new d());
    public final m x = com.amazon.aps.iva.kb0.f.b(new f());

    /* compiled from: SettingsBottomBarActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static Intent a(Context context, d0 d0Var) {
            com.amazon.aps.iva.yb0.j.f(context, "context");
            Intent intent = new Intent(context, SettingsBottomBarActivity.class);
            intent.addFlags(131072);
            if (d0Var != null) {
                intent.putExtra("settings_deeplink_destination", d0Var);
            }
            intent.putExtra("should_animate", true);
            return intent;
        }
    }

    /* compiled from: SettingsBottomBarActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Boolean> {
        public static final c h = new c();

        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Boolean invoke() {
            return Boolean.valueOf(((com.amazon.aps.iva.yw.d0) com.ellation.crunchyroll.application.e.a()).p.c.a3());
        }
    }

    /* compiled from: SettingsBottomBarActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e.m, com.amazon.aps.iva.kb0.q> {
        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.e.m mVar) {
            com.amazon.aps.iva.yb0.j.f(mVar, "$this$onBackPressedCallback");
            SettingsBottomBarActivity settingsBottomBarActivity = SettingsBottomBarActivity.this;
            ((com.amazon.aps.iva.v10.d) settingsBottomBarActivity.n.getValue()).a();
            if (n.w(settingsBottomBarActivity.getIntent())) {
                settingsBottomBarActivity.overridePendingTransition(0, 0);
            }
            ((com.amazon.aps.iva.a20.b) settingsBottomBarActivity.x.getValue()).a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SettingsBottomBarActivity.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xa0.f, com.amazon.aps.iva.kb0.q> {
        public static final e h = new e();

        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.xa0.f fVar) {
            com.amazon.aps.iva.xa0.f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(fVar2, "$this$applyInsetter");
            com.amazon.aps.iva.xa0.f.a(fVar2, false, false, true, false, com.ellation.crunchyroll.presentation.main.settings.a.h, 251);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SettingsBottomBarActivity.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.a20.b> {
        public f() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.a20.b invoke() {
            d0 d0Var;
            Object obj;
            RefreshTokenProvider refreshTokenProvider = com.ellation.crunchyroll.application.e.c().getRefreshTokenProvider();
            p f = com.ellation.crunchyroll.application.e.b().f();
            com.amazon.aps.iva.yb0.j.f(refreshTokenProvider, "refreshTokenProvider");
            com.amazon.aps.iva.y30.l lVar = new com.amazon.aps.iva.y30.l(refreshTokenProvider, f);
            SettingsBottomBarActivity settingsBottomBarActivity = SettingsBottomBarActivity.this;
            com.amazon.aps.iva.k40.d a = settingsBottomBarActivity.mh().a();
            com.amazon.aps.iva.ct.d userBenefitsChangeMonitor = com.ellation.crunchyroll.application.e.c().getUserBenefitsChangeMonitor();
            Bundle extras = settingsBottomBarActivity.getIntent().getExtras();
            if (extras != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    obj = extras.getSerializable("settings_deeplink_destination", d0.class);
                } else {
                    obj = (d0) extras.getSerializable("settings_deeplink_destination");
                }
                d0Var = (d0) obj;
            } else {
                d0Var = null;
            }
            d0 d0Var2 = d0Var;
            settingsBottomBarActivity.getIntent().removeExtra("settings_deeplink_destination");
            i a2 = h.a.a(com.amazon.aps.iva.ds.c.b, 6);
            com.amazon.aps.iva.yb0.j.f(a, "selectedHeaderViewModel");
            com.amazon.aps.iva.yb0.j.f(userBenefitsChangeMonitor, "userBenefitsChangeMonitor");
            return new com.amazon.aps.iva.a20.c(settingsBottomBarActivity, lVar, a, userBenefitsChangeMonitor, d0Var2, a2);
        }
    }

    /* compiled from: SettingsBottomBarActivity.kt */
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Fragment> {
        public static final g h = new g();

        public g() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Fragment invoke() {
            return new t();
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.ellation.crunchyroll.presentation.main.settings.SettingsBottomBarActivity$b] */
    public SettingsBottomBarActivity() {
        ?? r0 = new com.amazon.aps.iva.yb0.t(com.ellation.crunchyroll.application.f.a(null, 3)) { // from class: com.ellation.crunchyroll.presentation.main.settings.SettingsBottomBarActivity.b
            @Override // com.amazon.aps.iva.yb0.t, com.amazon.aps.iva.fc0.m
            public final Object get() {
                return Boolean.valueOf(((com.amazon.aps.iva.ct.j) this.receiver).getHasPremiumBenefit());
            }
        };
        com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
        if (aVar != null) {
            Object c2 = aVar.c().c(com.amazon.aps.iva.cx.d.class, "billing_notifications");
            if (c2 != null) {
                c cVar = c.h;
                com.amazon.aps.iva.yb0.j.f(cVar, "isUserOnHold");
                this.y = new j(r0, cVar, (com.amazon.aps.iva.cx.d) c2);
                this.A = com.amazon.aps.iva.ls.a.SETTINGS;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.BillingNotificationsConfigImpl");
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.a20.d
    public final boolean E() {
        return getResources().getBoolean(R.bool.isDualPane);
    }

    @Override // com.amazon.aps.iva.a20.d
    public final void Pc() {
        Menu menu = this.z;
        if (menu != null) {
            menu.setGroupVisible(R.id.menu_settings_group, true);
        }
    }

    @Override // com.amazon.aps.iva.a20.d
    public final void R0() {
        overridePendingTransition(0, 0);
    }

    @Override // com.amazon.aps.iva.v10.a, com.amazon.aps.iva.v10.f
    public final void R8() {
        super.R8();
        ((com.amazon.aps.iva.a20.b) this.x.getValue()).a4();
    }

    @Override // com.amazon.aps.iva.a20.d
    public final void T9() {
        getSupportFragmentManager().O();
    }

    @Override // com.amazon.aps.iva.us.a
    public final com.amazon.aps.iva.ls.a b1() {
        return this.A;
    }

    @Override // com.amazon.aps.iva.a20.d
    public final void b8() {
        ri().setVisibility(8);
        ((View) this.m.getValue(this, com.amazon.aps.iva.v10.a.q[3])).setVisibility(0);
    }

    @Override // com.amazon.aps.iva.a20.d
    public final String df(int i) {
        return getSupportFragmentManager().d.get(i).getName();
    }

    @Override // com.amazon.aps.iva.a20.d
    public final void i2() {
        if (this.f != null) {
            com.amazon.aps.iva.k.a supportActionBar = getSupportActionBar();
            com.amazon.aps.iva.yb0.j.c(supportActionBar);
            supportActionBar.p(R.drawable.ic_back);
        }
        com.amazon.aps.iva.k.a supportActionBar2 = getSupportActionBar();
        com.amazon.aps.iva.yb0.j.c(supportActionBar2);
        supportActionBar2.m(true);
        com.amazon.aps.iva.k.a supportActionBar3 = getSupportActionBar();
        com.amazon.aps.iva.yb0.j.c(supportActionBar3);
        supportActionBar3.n(true);
    }

    @Override // com.amazon.aps.iva.a20.d
    public final void ig() {
        mi(g.h);
    }

    @Override // com.amazon.aps.iva.a20.d
    public final void j0() {
        com.amazon.aps.iva.k.a supportActionBar = getSupportActionBar();
        com.amazon.aps.iva.yb0.j.c(supportActionBar);
        supportActionBar.m(false);
        com.amazon.aps.iva.k.a supportActionBar2 = getSupportActionBar();
        com.amazon.aps.iva.yb0.j.c(supportActionBar2);
        supportActionBar2.n(false);
    }

    @Override // com.amazon.aps.iva.v10.a, com.amazon.aps.iva.wy.c
    public final Integer ji() {
        return Integer.valueOf(this.s);
    }

    @Override // com.amazon.aps.iva.a20.d
    public final void la() {
        finish();
        com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        overridePendingTransition(0, 0);
    }

    @Override // com.amazon.aps.iva.a20.d
    public final void mf() {
        Menu menu = this.z;
        if (menu != null) {
            menu.setGroupVisible(R.id.menu_settings_group, false);
        }
    }

    @Override // com.amazon.aps.iva.a20.d
    public final void na(com.amazon.aps.iva.y30.c cVar) {
        Fragment fragment;
        boolean z;
        com.amazon.aps.iva.yb0.j.f(cVar, "preferenceHeader");
        com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
        Fragment fragment2 = null;
        if (aVar != null) {
            Object c2 = aVar.c().c(com.amazon.aps.iva.ox.a.class, "lupin");
            if (c2 != null) {
                if (((com.amazon.aps.iva.ox.a) c2).isEnabled()) {
                    if (ti().getVisibility() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.v = z;
                    if (cVar != com.amazon.aps.iva.y30.c.DEFAULT) {
                        ti().setVisibility(0);
                    }
                }
                j jVar = this.y;
                jVar.getClass();
                switch (j.a.a[cVar.ordinal()]) {
                    case 1:
                        ((com.amazon.aps.iva.yw.d0) com.ellation.crunchyroll.application.e.a()).z.getClass();
                        fragment2 = new com.amazon.aps.iva.kd.c();
                        break;
                    case 2:
                        com.amazon.aps.iva.a40.a.j.getClass();
                        fragment2 = new com.amazon.aps.iva.a40.a();
                        break;
                    case 3:
                        com.amazon.aps.iva.xb0.a<Boolean> aVar2 = jVar.a;
                        com.amazon.aps.iva.yb0.j.f(aVar2, "isUserPremium");
                        com.amazon.aps.iva.xb0.a<Boolean> aVar3 = jVar.b;
                        com.amazon.aps.iva.yb0.j.f(aVar3, "isUserOnHold");
                        com.amazon.aps.iva.me.j jVar2 = jVar.c;
                        com.amazon.aps.iva.yb0.j.f(jVar2, "billingNotificationsConfig");
                        com.amazon.aps.iva.l30.b bVar = com.amazon.aps.iva.l30.b.h;
                        com.amazon.aps.iva.yb0.j.f(bVar, "createOnHoldFragment");
                        com.amazon.aps.iva.l30.c cVar2 = com.amazon.aps.iva.l30.c.h;
                        com.amazon.aps.iva.yb0.j.f(cVar2, "createPremiumMembershipFragment");
                        com.amazon.aps.iva.l30.d dVar = com.amazon.aps.iva.l30.d.h;
                        com.amazon.aps.iva.yb0.j.f(dVar, "createFreeMembershipPlanFragment");
                        if (aVar2.invoke().booleanValue()) {
                            fragment = (Fragment) cVar2.invoke();
                        } else if (aVar3.invoke().booleanValue() && jVar2.a0()) {
                            fragment = (Fragment) bVar.invoke();
                        } else {
                            fragment = (Fragment) dVar.invoke();
                        }
                        fragment2 = fragment;
                        break;
                    case 4:
                        com.amazon.aps.iva.h40.b.m.getClass();
                        fragment2 = new com.amazon.aps.iva.h40.b();
                        break;
                    case 5:
                        ((com.amazon.aps.iva.yw.d0) com.ellation.crunchyroll.application.e.a()).r.getClass();
                        fragment2 = new com.amazon.aps.iva.kf.g();
                        break;
                    case 6:
                        com.amazon.aps.iva.i40.a.f.getClass();
                        fragment2 = new com.amazon.aps.iva.i40.a();
                        break;
                    case 7:
                        com.amazon.aps.iva.z30.a.f.getClass();
                        fragment2 = new com.amazon.aps.iva.z30.a();
                        break;
                    case 8:
                        com.amazon.aps.iva.b40.f.f.getClass();
                        fragment2 = new com.amazon.aps.iva.b40.f();
                        break;
                    case 9:
                        com.amazon.aps.iva.yw.d0 d0Var = (com.amazon.aps.iva.yw.d0) com.ellation.crunchyroll.application.e.a();
                        com.ellation.crunchyroll.application.a aVar4 = a.C0959a.a;
                        if (aVar4 != null) {
                            Object c3 = aVar4.c().c(com.amazon.aps.iva.cx.a.class, "account_deletion");
                            if (c3 != null) {
                                fragment2 = d0Var.z.x(((com.amazon.aps.iva.cx.a) c3).a());
                                break;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.AccountDeletionConfigImpl");
                            }
                        } else {
                            com.amazon.aps.iva.yb0.j.m("instance");
                            throw null;
                        }
                    case 10:
                        fragment2 = new com.amazon.aps.iva.j40.c();
                        break;
                    case 11:
                        ((com.amazon.aps.iva.yw.d0) com.ellation.crunchyroll.application.e.a()).z.getClass();
                        fragment2 = new com.amazon.aps.iva.nd.c();
                        break;
                    case 12:
                        fragment2 = new com.amazon.aps.iva.d40.b();
                        break;
                }
                if (fragment2 != null) {
                    ni(fragment2, cVar.name());
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.profiles.LupinConfigImpl");
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.v10.a, com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewTreeObserver viewTreeObserver = ((View) this.t.getValue(this, C[0])).getViewTreeObserver();
        View findViewById = findViewById(R.id.errors_layout);
        com.amazon.aps.iva.yb0.j.e(findViewById, "findViewById(R.id.errors_layout)");
        viewTreeObserver.addOnGlobalLayoutListener(new KeyboardAwareLayoutListener(findViewById, false, null, 4, null));
        f1.i(ti(), e.h);
        getOnBackPressedDispatcher().a(this, this.w);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        com.amazon.aps.iva.yb0.j.f(menu, "menu");
        getMenuInflater().inflate(R.menu.menu_settings, menu);
        this.z = menu;
        ((com.amazon.aps.iva.a20.b) this.x.getValue()).c5();
        ((com.amazon.aps.iva.yw.d0) com.ellation.crunchyroll.application.e.a()).j.addCastButton(this, menu);
        return true;
    }

    @Override // com.amazon.aps.iva.i60.b, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        com.amazon.aps.iva.yb0.j.f(menuItem, "item");
        if (menuItem.getItemId() == R.id.menu_item_search) {
            SearchResultSummaryActivity.r.getClass();
            SearchResultSummaryActivity.a.a(this);
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.amazon.aps.iva.v10.a
    public final int pi() {
        return this.r;
    }

    @Override // com.amazon.aps.iva.v10.a, com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return m0.R(super.setupPresenters(), (com.amazon.aps.iva.a20.b) this.x.getValue());
    }

    public final View ti() {
        return (View) this.u.getValue(this, C[1]);
    }

    @Override // com.amazon.aps.iva.a20.d
    public final void x() {
        com.amazon.aps.iva.xw.a aVar = this.w;
        com.amazon.aps.iva.yb0.j.f(aVar, "callback");
        aVar.setEnabled(false);
        getOnBackPressedDispatcher().c();
        aVar.setEnabled(true);
        com.ellation.crunchyroll.application.a aVar2 = a.C0959a.a;
        if (aVar2 != null) {
            Object c2 = aVar2.c().c(com.amazon.aps.iva.ox.a.class, "lupin");
            if (c2 != null) {
                if (((com.amazon.aps.iva.ox.a) c2).isEnabled()) {
                    if (this.v) {
                        ti().setVisibility(0);
                        return;
                    } else {
                        ti().setVisibility(8);
                        return;
                    }
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.profiles.LupinConfigImpl");
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }
}
