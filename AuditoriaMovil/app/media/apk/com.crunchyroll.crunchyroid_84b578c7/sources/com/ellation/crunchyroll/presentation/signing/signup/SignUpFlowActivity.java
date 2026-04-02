package com.ellation.crunchyroll.presentation.signing.signup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.gy.t;
import com.amazon.aps.iva.jh.h;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.p60.f;
import com.amazon.aps.iva.us.n;
import com.amazon.aps.iva.v40.k;
import com.amazon.aps.iva.v40.m;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.xw.g;
import com.amazon.aps.iva.xw.m0;
import com.amazon.aps.iva.xw.r0;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yw.d0;
import com.crunchyroll.auth.c;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.AccountStateProvider;
import com.ellation.crunchyroll.api.GsonHolder;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.auth.CountryCodeProvider;
import com.ellation.crunchyroll.api.etp.auth.EtpAccountAuthService;
import com.ellation.crunchyroll.api.etp.auth.UserTokenInteractor;
import com.ellation.crunchyroll.api.notifications.NotificationSettingsInteractor;
import com.ellation.crunchyroll.application.a;
import com.ellation.crunchyroll.presentation.signing.signin.SignInActivity;
import com.ellation.crunchyroll.ui.animation.AnimationUtil;
import com.ellation.widgets.input.datainputbutton.DataInputButton;
import com.ellation.widgets.switcher.SwitcherLayout;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: SignUpFlowActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/ellation/crunchyroll/presentation/signing/signup/SignUpFlowActivity;", "Lcom/amazon/aps/iva/t40/c;", "Lcom/amazon/aps/iva/v40/k;", "<init>", "()V", "a", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SignUpFlowActivity extends com.amazon.aps.iva.t40.c implements k {
    public static final /* synthetic */ l<Object>[] J = {q.a(SignUpFlowActivity.class, "signUpContentContainer", "getSignUpContentContainer()Landroid/view/ViewGroup;", 0), q.a(SignUpFlowActivity.class, "signUpButton", "getSignUpButton()Lcom/ellation/widgets/input/datainputbutton/DataInputButton;", 0), q.a(SignUpFlowActivity.class, "signIn", "getSignIn()Landroid/view/View;", 0), q.a(SignUpFlowActivity.class, "optInMarketingNotificationsCheckbox", "getOptInMarketingNotificationsCheckbox()Landroid/widget/CheckBox;", 0), q.a(SignUpFlowActivity.class, "progressOverlay", "getProgressOverlay()Landroid/view/ViewGroup;", 0), q.a(SignUpFlowActivity.class, "phoneAndEmailSwitcher", "getPhoneAndEmailSwitcher()Lcom/ellation/widgets/switcher/SwitcherLayout;", 0), q.a(SignUpFlowActivity.class, "signUpViewModel", "getSignUpViewModel()Lcom/ellation/crunchyroll/presentation/signing/signup/SignUpViewModelImpl;", 0)};
    public static final a I = new a();
    public final v x = g.b(this, R.id.sign_up_content_container);
    public final v y = g.d(this, R.id.sign_up_button);
    public final v z = g.d(this, R.id.sign_in);
    public final v A = g.d(this, R.id.sign_up_opt_in_marketing_notifications_checkbox);
    public final v B = g.d(this, R.id.progress_overlay);
    public final v C = g.d(this, R.id.phone_and_email_switcher);
    public final com.amazon.aps.iva.v70.d D = new com.amazon.aps.iva.v70.d(new com.amazon.aps.iva.v70.b(R.string.phone), new com.amazon.aps.iva.v70.b(R.string.email));
    public final com.amazon.aps.iva.ez.a E = new com.amazon.aps.iva.ez.a(m.class, new f(this), new e());
    public final com.amazon.aps.iva.kb0.m F = com.amazon.aps.iva.kb0.f.b(new d());
    public final int G = R.layout.activity_sign_up;
    public final int H = R.string.create_account;

    /* compiled from: SignUpFlowActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: SignUpFlowActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements p<View, String, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(View view, String str) {
            View view2 = view;
            String str2 = str;
            j.f(view2, "view");
            j.f(str2, "text");
            a aVar = SignUpFlowActivity.I;
            SignUpFlowActivity.this.ni().C1(r.p(view2, str2));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SignUpFlowActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements p<View, String, com.amazon.aps.iva.kb0.q> {
        public c() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(View view, String str) {
            View view2 = view;
            String str2 = str;
            j.f(view2, "view");
            j.f(str2, "text");
            a aVar = SignUpFlowActivity.I;
            SignUpFlowActivity.this.ni().w5(r.p(view2, str2));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SignUpFlowActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.v40.c> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.v40.c invoke() {
            SignUpFlowActivity signUpFlowActivity = SignUpFlowActivity.this;
            j.f(signUpFlowActivity, "context");
            com.amazon.aps.iva.h70.d dVar = new com.amazon.aps.iva.h70.d(signUpFlowActivity);
            com.amazon.aps.iva.h70.f fVar = new com.amazon.aps.iva.h70.f(signUpFlowActivity);
            Intent intent = signUpFlowActivity.getIntent();
            j.e(intent, "intent");
            com.crunchyroll.auth.c a = c.a.a(intent);
            m mVar = (m) signUpFlowActivity.E.getValue(signUpFlowActivity, SignUpFlowActivity.J[6]);
            boolean m = ((d0) com.ellation.crunchyroll.application.e.a()).x.m();
            com.amazon.aps.iva.ee.e l = ((d0) com.ellation.crunchyroll.application.e.a()).x.l(signUpFlowActivity);
            n oi = signUpFlowActivity.oi();
            com.amazon.aps.iva.us.p pVar = (com.amazon.aps.iva.us.p) signUpFlowActivity.t.getValue();
            com.ellation.crunchyroll.presentation.signing.signup.b bVar = new com.ellation.crunchyroll.presentation.signing.signup.b(signUpFlowActivity);
            CountryCodeProvider countryCodeProvider = com.ellation.crunchyroll.application.e.c().getCountryCodeProvider();
            AccountStateProvider accountStateProvider = com.ellation.crunchyroll.application.e.c().getAccountStateProvider();
            com.amazon.aps.iva.yd.v k = ((d0) com.ellation.crunchyroll.application.e.a()).x.k(signUpFlowActivity);
            UserTokenInteractor userTokenInteractor = com.ellation.crunchyroll.application.e.c().getUserTokenInteractor();
            com.amazon.aps.iva.ys.p f = com.ellation.crunchyroll.application.e.b().f();
            j.f(oi, "loginAnalytics");
            j.f(pVar, "registrationAnalytics");
            com.amazon.aps.iva.v70.d dVar2 = signUpFlowActivity.D;
            j.f(dVar2, "switcherUiModel");
            j.f(countryCodeProvider, "countryCodeProvider");
            j.f(accountStateProvider, "accountStateProvider");
            j.f(userTokenInteractor, "userTokenInteractor");
            return new com.amazon.aps.iva.v40.d(signUpFlowActivity, dVar, fVar, a, mVar, m, l, oi, pVar, dVar2, bVar, countryCodeProvider, accountStateProvider, k, userTokenInteractor, f);
        }
    }

    /* compiled from: SignUpFlowActivity.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, m> {
        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final m invoke(androidx.lifecycle.p pVar) {
            j.f(pVar, "it");
            SignUpFlowActivity signUpFlowActivity = SignUpFlowActivity.this;
            j.f(signUpFlowActivity, "context");
            com.amazon.aps.iva.lh.c cVar = com.amazon.aps.iva.lh.f.a;
            if (cVar != null) {
                com.amazon.aps.iva.lh.b bVar = new com.amazon.aps.iva.lh.b(cVar, new h(com.amazon.aps.iva.o60.e.a(signUpFlowActivity)), f.a.a(signUpFlowActivity, GsonHolder.getInstance()));
                com.amazon.aps.iva.kh.d dVar = t.a;
                if (dVar != null) {
                    com.amazon.aps.iva.kh.f a = dVar.a(signUpFlowActivity);
                    com.amazon.aps.iva.p60.g a2 = f.a.a(signUpFlowActivity, GsonHolder.getInstance());
                    NotificationSettingsInteractor create = NotificationSettingsInteractor.Companion.create(com.ellation.crunchyroll.application.e.c().getAccountService(), com.ellation.crunchyroll.application.e.c().getEtpIndexProvider());
                    com.amazon.aps.iva.bo.f b = com.ellation.crunchyroll.application.e.b().b();
                    a aVar = SignUpFlowActivity.I;
                    com.ellation.crunchyroll.presentation.signing.signin.f fVar = (com.ellation.crunchyroll.presentation.signing.signin.f) signUpFlowActivity.v.getValue();
                    EtpAccountService accountService = com.ellation.crunchyroll.application.e.c().getAccountService();
                    com.amazon.aps.iva.us.p pVar2 = (com.amazon.aps.iva.us.p) signUpFlowActivity.t.getValue();
                    com.ellation.crunchyroll.application.a aVar2 = a.C0959a.a;
                    if (aVar2 != null) {
                        com.amazon.aps.iva.ys.c b2 = aVar2.b();
                        com.amazon.aps.iva.zg.d i = ((d0) com.ellation.crunchyroll.application.e.a()).e.i();
                        j.f(fVar, "signInInteractor");
                        j.f(create, "notificationSettingsInteractor");
                        j.f(accountService, "accountService");
                        j.f(b2, "appConfigUpdater");
                        j.f(pVar2, "registrationAnalytics");
                        j.f(i, "tokenActionsHandler");
                        com.amazon.aps.iva.v40.b bVar2 = new com.amazon.aps.iva.v40.b(i, a, bVar, b, pVar2, accountService, create, b2, fVar, a2);
                        EtpAccountAuthService accountAuthService = com.ellation.crunchyroll.application.e.c().getAccountAuthService();
                        EtpAccountService accountService2 = com.ellation.crunchyroll.application.e.c().getAccountService();
                        j.f(accountAuthService, "accountAuthService");
                        j.f(accountService2, "accountService");
                        return new m(bVar2, create, new com.amazon.aps.iva.fe.g(accountAuthService, accountService2, bVar, a, a2));
                    }
                    j.m("instance");
                    throw null;
                }
                j.m("instance");
                throw null;
            }
            j.m("store");
            throw null;
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> {
        public final /* synthetic */ androidx.fragment.app.h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(androidx.fragment.app.h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.fragment.app.h invoke() {
            return this.h;
        }
    }

    @Override // com.amazon.aps.iva.v40.k
    public final void A0() {
        wi().G(mi(), pi());
    }

    @Override // com.amazon.aps.iva.v40.k
    public final void A4() {
        vi().setVisibility(8);
        t0.h(ti(), null, Integer.valueOf(getResources().getDimensionPixelSize(R.dimen.sign_up_tos_phone_margin_top)), null, null, 13);
    }

    @Override // com.amazon.aps.iva.v40.k
    public final void B0() {
        ((SwitcherLayout) this.C.getValue(this, J[5])).setVisibility(0);
    }

    @Override // com.amazon.aps.iva.v40.k
    public final void Y1(com.amazon.aps.iva.v70.d dVar) {
        j.f(dVar, "switcherUiModel");
        ((SwitcherLayout) this.C.getValue(this, J[5])).U2(dVar, (com.amazon.aps.iva.v40.c) this.F.getValue());
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.ni.q
    public final void a() {
        AnimationUtil.fadeIn$default((ViewGroup) this.B.getValue(this, J[4]), 0L, null, null, 14, null);
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.ni.q
    public final void b() {
        AnimationUtil.fadeOut$default((ViewGroup) this.B.getValue(this, J[4]), 0L, 2, null);
    }

    @Override // com.amazon.aps.iva.v40.k
    public final void f0() {
        setResult(40);
    }

    @Override // com.amazon.aps.iva.v40.k
    public final void j2(boolean z) {
        vi().setChecked(z);
    }

    @Override // com.amazon.aps.iva.wy.c
    public final Integer ji() {
        return Integer.valueOf(this.G);
    }

    @Override // com.amazon.aps.iva.v40.k
    public final void n() {
        ViewGroup viewGroup = (ViewGroup) this.x.getValue(this, J[0]);
        if (viewGroup != null) {
            t0.h(viewGroup, null, Integer.valueOf(getResources().getDimensionPixelSize(R.dimen.sign_in_sign_up_container_margin_top)), null, null, 13);
        }
    }

    @Override // com.amazon.aps.iva.v40.k
    public final void n1() {
        wi().G(qi());
    }

    @Override // com.amazon.aps.iva.t40.c, com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((View) this.z.getValue(this, J[2])).setOnClickListener(new com.amazon.aps.iva.c8.h(this, 21));
        wi().setOnClickListener(new com.amazon.aps.iva.fe.a(this, 20));
        pi().getEditText().setImeOptions(6);
    }

    @Override // com.amazon.aps.iva.v40.k
    public final void q2() {
        ui(R.string.sign_up_tos);
    }

    @Override // com.amazon.aps.iva.v40.k
    public final void qc(com.crunchyroll.auth.c cVar) {
        j.f(cVar, "authFlowInput");
        SignInActivity.O.getClass();
        Intent intent = new Intent(this, SignInActivity.class);
        intent.addFlags(131072);
        intent.addFlags(33554432);
        w.o(cVar, intent);
        startActivity(intent);
    }

    @Override // com.amazon.aps.iva.v40.k
    public final void r2() {
        ui(R.string.sign_up_tos_phone);
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.I((com.amazon.aps.iva.v40.c) this.F.getValue(), ni());
    }

    @Override // com.amazon.aps.iva.t40.c
    public final int si() {
        return this.H;
    }

    public final void ui(int i) {
        ti().setVisibility(0);
        TextView ti = ti();
        String string = getString(i, getString(R.string.legal_clause_replacement_terms), getString(R.string.legal_clause_replacement_privacy_policy));
        j.e(string, "getString(\n             …acy_policy)\n            )");
        String string2 = getString(R.string.legal_clause_replacement_terms);
        j.e(string2, "getString(R.string.legal_clause_replacement_terms)");
        com.amazon.aps.iva.xw.p pVar = new com.amazon.aps.iva.xw.p(string2, new b(), false);
        String string3 = getString(R.string.legal_clause_replacement_privacy_policy);
        j.e(string3, "getString(R.string.legal…placement_privacy_policy)");
        r0.b(ti, m0.g(string, pVar, new com.amazon.aps.iva.xw.p(string3, new c(), false)));
        TextView ti2 = ti();
        j.f(ti2, "<this>");
        ti2.setPaintFlags(ti2.getPaintFlags() | 128);
    }

    public final CheckBox vi() {
        return (CheckBox) this.A.getValue(this, J[3]);
    }

    public final DataInputButton wi() {
        return (DataInputButton) this.y.getValue(this, J[1]);
    }

    @Override // com.amazon.aps.iva.v40.k
    public final void x1() {
        wi().d.clear();
    }

    @Override // com.amazon.aps.iva.v40.k
    public final void y3() {
        vi().setVisibility(0);
        t0.h(ti(), null, Integer.valueOf(getResources().getDimensionPixelSize(R.dimen.sign_up_tos_email_margin_top)), null, null, 13);
    }
}
