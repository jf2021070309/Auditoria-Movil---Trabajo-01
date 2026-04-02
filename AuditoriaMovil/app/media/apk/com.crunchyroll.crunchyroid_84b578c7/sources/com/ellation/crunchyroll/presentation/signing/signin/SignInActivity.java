package com.ellation.crunchyroll.presentation.signing.signin;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.cx.h;
import com.amazon.aps.iva.cx.s;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.u40.l;
import com.amazon.aps.iva.u40.n;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.xw.m0;
import com.amazon.aps.iva.xw.r0;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yw.d0;
import com.crunchyroll.auth.c;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.AccountStateProvider;
import com.ellation.crunchyroll.api.etp.auth.CountryCodeProvider;
import com.ellation.crunchyroll.api.etp.auth.UserTokenInteractor;
import com.ellation.crunchyroll.application.a;
import com.ellation.crunchyroll.presentation.forgotpassword.ForgotPasswordActivity;
import com.ellation.crunchyroll.presentation.signing.signup.SignUpFlowActivity;
import com.ellation.crunchyroll.ui.animation.AnimationUtil;
import com.ellation.widgets.input.datainputbutton.DataInputButton;
import com.ellation.widgets.input.email.EmailInputView;
import com.ellation.widgets.switcher.SwitcherLayout;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: SignInActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/ellation/crunchyroll/presentation/signing/signin/SignInActivity;", "Lcom/amazon/aps/iva/t40/c;", "Lcom/amazon/aps/iva/u40/l;", "<init>", "()V", "a", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public class SignInActivity extends com.amazon.aps.iva.t40.c implements l {
    public final com.amazon.aps.iva.h.c<Intent> J;
    public final com.amazon.aps.iva.v70.d K;
    public final m L;
    public final int M;
    public final int N;
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] P = {q.a(SignInActivity.class, "signInContentContainer", "getSignInContentContainer()Landroid/view/ViewGroup;", 0), q.a(SignInActivity.class, "logo", "getLogo()Landroid/widget/ImageView;", 0), q.a(SignInActivity.class, "topContainer", "getTopContainer()Landroid/view/ViewGroup;", 0), q.a(SignInActivity.class, "amazonSignupText", "getAmazonSignupText()Landroid/view/View;", 0), q.a(SignInActivity.class, "sessionExpiredTitle", "getSessionExpiredTitle()Landroid/widget/TextView;", 0), q.a(SignInActivity.class, "signInButton", "getSignInButton()Lcom/ellation/widgets/input/datainputbutton/DataInputButton;", 0), q.a(SignInActivity.class, "signUp", "getSignUp()Landroid/view/View;", 0), q.a(SignInActivity.class, "bottomContainer", "getBottomContainer()Landroid/view/ViewGroup;", 0), q.a(SignInActivity.class, "forgotPassword", "getForgotPassword()Landroid/view/View;", 0), q.a(SignInActivity.class, "progressOverlay", "getProgressOverlay()Landroid/view/View;", 0), q.a(SignInActivity.class, "loginWelcomeTitle", "getLoginWelcomeTitle()Landroid/widget/TextView;", 0), q.a(SignInActivity.class, "phoneAndEmailSwitcher", "getPhoneAndEmailSwitcher()Lcom/ellation/widgets/switcher/SwitcherLayout;", 0)};
    public static final a O = new a();
    public final v x = com.amazon.aps.iva.xw.g.b(this, R.id.sign_in_content_container);
    public final v y = com.amazon.aps.iva.xw.g.d(this, R.id.logo);
    public final v z = com.amazon.aps.iva.xw.g.d(this, R.id.sign_in_top_container);
    public final v A = com.amazon.aps.iva.xw.g.b(this, R.id.sign_in_to_create_account_text);
    public final v B = com.amazon.aps.iva.xw.g.d(this, R.id.session_expired_title);
    public final v C = com.amazon.aps.iva.xw.g.d(this, R.id.sign_in_button);
    public final v D = com.amazon.aps.iva.xw.g.b(this, R.id.sign_up);
    public final v E = com.amazon.aps.iva.xw.g.d(this, R.id.sign_in_bottom_container);
    public final v F = com.amazon.aps.iva.xw.g.d(this, R.id.forgot_password);
    public final v G = com.amazon.aps.iva.xw.g.d(this, R.id.progress_overlay);
    public final v H = com.amazon.aps.iva.xw.g.d(this, R.id.login_welcome_title);
    public final v I = com.amazon.aps.iva.xw.g.d(this, R.id.phone_and_email_switcher);

    /* compiled from: SignInActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: SignInActivity.kt */
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
            a aVar = SignInActivity.O;
            SignInActivity.this.ni().C1(r.p(view2, str2));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SignInActivity.kt */
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
            a aVar = SignInActivity.O;
            SignInActivity.this.ni().w5(r.p(view2, str2));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SignInActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            a aVar = SignInActivity.O;
            SignInActivity signInActivity = SignInActivity.this;
            r0.d(signInActivity.pi().getEditText(), 2, new com.ellation.crunchyroll.presentation.signing.signin.a(signInActivity));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SignInActivity.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class e extends i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public e(EditText editText) {
            super(0, editText, r0.class, "clearKeyboardActionListener", "clearKeyboardActionListener(Landroid/widget/EditText;)V", 1);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            r0.a((EditText) this.receiver);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SignInActivity.kt */
    /* loaded from: classes2.dex */
    public static final class f implements com.amazon.aps.iva.h.b<com.amazon.aps.iva.h.a> {
        public f() {
        }

        @Override // com.amazon.aps.iva.h.b
        public final void a(com.amazon.aps.iva.h.a aVar) {
            com.amazon.aps.iva.h.a aVar2 = aVar;
            j.f(aVar2, "result");
            if (aVar2.b == -1) {
                a aVar3 = SignInActivity.O;
                SignInActivity.this.vi().p2();
            }
        }
    }

    /* compiled from: SignInActivity.kt */
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.u40.c> {
        public g() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.u40.c invoke() {
            SignInActivity signInActivity = SignInActivity.this;
            j.f(signInActivity, "context");
            com.amazon.aps.iva.h70.d dVar = new com.amazon.aps.iva.h70.d(signInActivity);
            com.amazon.aps.iva.h70.f fVar = new com.amazon.aps.iva.h70.f(signInActivity);
            boolean z = k.n(signInActivity).b;
            Intent intent = signInActivity.getIntent();
            j.e(intent, "intent");
            com.crunchyroll.auth.c a = c.a.a(intent);
            com.amazon.aps.iva.u40.m mVar = (com.amazon.aps.iva.u40.m) com.amazon.aps.iva.ez.l.a(signInActivity, n.class, new com.ellation.crunchyroll.presentation.signing.signin.d(signInActivity));
            a aVar = SignInActivity.O;
            com.amazon.aps.iva.us.p pVar = (com.amazon.aps.iva.us.p) signInActivity.t.getValue();
            com.amazon.aps.iva.us.n oi = signInActivity.oi();
            com.ellation.crunchyroll.application.a aVar2 = a.C0959a.a;
            if (aVar2 != null) {
                Object c = aVar2.c().c(s.class, "user_account_migration");
                if (c != null) {
                    s sVar = (s) c;
                    boolean m = ((d0) com.ellation.crunchyroll.application.e.a()).x.m();
                    com.amazon.aps.iva.ee.e l = ((d0) com.ellation.crunchyroll.application.e.a()).x.l(signInActivity);
                    com.ellation.crunchyroll.presentation.signing.signin.e eVar = new com.ellation.crunchyroll.presentation.signing.signin.e(signInActivity);
                    CountryCodeProvider countryCodeProvider = com.ellation.crunchyroll.application.e.c().getCountryCodeProvider();
                    AccountStateProvider accountStateProvider = com.ellation.crunchyroll.application.e.c().getAccountStateProvider();
                    com.amazon.aps.iva.yd.v k = ((d0) com.ellation.crunchyroll.application.e.a()).x.k(signInActivity);
                    UserTokenInteractor userTokenInteractor = com.ellation.crunchyroll.application.e.c().getUserTokenInteractor();
                    com.amazon.aps.iva.ys.p f = com.ellation.crunchyroll.application.e.b().f();
                    com.ellation.crunchyroll.application.a aVar3 = a.C0959a.a;
                    if (aVar3 != null) {
                        Object c2 = aVar3.c().c(h.class, "disable_username_login");
                        if (c2 != null) {
                            h hVar = (h) c2;
                            j.f(pVar, "registrationAnalytics");
                            j.f(oi, "loginAnalytics");
                            com.amazon.aps.iva.v70.d dVar2 = signInActivity.K;
                            j.f(dVar2, "switcherUiModel");
                            j.f(countryCodeProvider, "countryCodeProvider");
                            j.f(accountStateProvider, "accountStateProvider");
                            j.f(userTokenInteractor, "userTokenInteractor");
                            return new com.amazon.aps.iva.u40.g(signInActivity, dVar, fVar, z, a, mVar, pVar, oi, sVar, m, l, dVar2, eVar, countryCodeProvider, accountStateProvider, k, userTokenInteractor, f, hVar);
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.DisableUsernameLoginConfigImpl");
                    }
                    j.m("instance");
                    throw null;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.UserAccountMigrationConfigImpl");
            }
            j.m("instance");
            throw null;
        }
    }

    public SignInActivity() {
        com.amazon.aps.iva.h.c<Intent> registerForActivityResult = registerForActivityResult(new com.amazon.aps.iva.i.d(), new f());
        j.e(registerForActivityResult, "registerForActivityResul…nResult()\n        }\n    }");
        this.J = registerForActivityResult;
        this.K = new com.amazon.aps.iva.v70.d(new com.amazon.aps.iva.v70.b(R.string.phone), new com.amazon.aps.iva.v70.b(R.string.email));
        this.L = com.amazon.aps.iva.kb0.f.b(new g());
        this.M = R.string.sign_in_title;
        this.N = R.layout.activity_sign_in;
    }

    @Override // com.amazon.aps.iva.u40.l
    public final void A0() {
        wi().G(mi(), pi());
    }

    @Override // com.amazon.aps.iva.u40.l
    public final void A1(String str) {
        ForgotPasswordActivity.t.getClass();
        ForgotPasswordActivity.a.a(this, str, false);
    }

    @Override // com.amazon.aps.iva.u40.l
    public final void B0() {
        ui().setVisibility(0);
    }

    @Override // com.amazon.aps.iva.u40.l
    public final void Ee() {
        LayoutInflater from = LayoutInflater.from(this);
        com.amazon.aps.iva.fc0.l<?>[] lVarArr = P;
        from.inflate(R.layout.layout_sign_in_top, (ViewGroup) this.z.getValue(this, lVarArr[2]), true);
        LayoutInflater.from(this).inflate(R.layout.layout_sign_in_bottom, (ViewGroup) this.E.getValue(this, lVarArr[7]), true);
    }

    @Override // com.amazon.aps.iva.u40.l
    public final void R7(com.crunchyroll.auth.c cVar) {
        j.f(cVar, "authFlowInput");
        SignUpFlowActivity.I.getClass();
        Intent intent = new Intent(this, SignUpFlowActivity.class);
        intent.addFlags(131072);
        intent.addFlags(33554432);
        w.o(cVar, intent);
        startActivity(intent);
    }

    @Override // com.amazon.aps.iva.u40.l
    public final void Rh() {
        LayoutInflater from = LayoutInflater.from(this);
        com.amazon.aps.iva.fc0.l<?>[] lVarArr = P;
        from.inflate(R.layout.layout_sign_in_top_amazon, (ViewGroup) this.z.getValue(this, lVarArr[2]), true);
        LayoutInflater.from(this).inflate(R.layout.layout_sign_in_bottom_amazon, (ViewGroup) this.E.getValue(this, lVarArr[7]), true);
    }

    @Override // com.amazon.aps.iva.u40.l
    public final void Y1(com.amazon.aps.iva.v70.d dVar) {
        j.f(dVar, "switcherUiModel");
        ui().U2(dVar, vi());
    }

    @Override // com.amazon.aps.iva.u40.l
    public final void Yd() {
        com.amazon.aps.iva.fc0.l<?>[] lVarArr = P;
        ((TextView) this.H.getValue(this, lVarArr[10])).setVisibility(8);
        ((ImageView) this.y.getValue(this, lVarArr[1])).setImageDrawable(com.amazon.aps.iva.l.a.a(this, R.drawable.cr_logo));
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.ni.q
    public final void a() {
        AnimationUtil.fadeIn$default((View) this.G.getValue(this, P[9]), 0L, null, null, 14, null);
    }

    @Override // com.amazon.aps.iva.u40.l
    public final void ad() {
        com.amazon.aps.iva.fc0.l<?>[] lVarArr = P;
        ((TextView) this.H.getValue(this, lVarArr[10])).setVisibility(0);
        ((ImageView) this.y.getValue(this, lVarArr[1])).setImageDrawable(com.amazon.aps.iva.l.a.a(this, R.drawable.migration_logo));
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.ni.q
    public final void b() {
        AnimationUtil.fadeOut$default((View) this.G.getValue(this, P[9]), 0L, 2, null);
    }

    @Override // com.amazon.aps.iva.u40.l
    public final void f0() {
        setResult(20, new Intent().putExtras(getIntent()));
    }

    @Override // com.amazon.aps.iva.wy.c
    public final Integer ji() {
        return Integer.valueOf(this.N);
    }

    @Override // com.amazon.aps.iva.u40.l
    public final void n() {
        ViewGroup viewGroup = (ViewGroup) this.x.getValue(this, P[0]);
        if (viewGroup != null) {
            t0.h(viewGroup, null, Integer.valueOf(getResources().getDimensionPixelSize(R.dimen.sign_in_sign_up_container_margin_top)), null, null, 13);
        }
    }

    @Override // com.amazon.aps.iva.u40.l
    public final void n1() {
        wi().G(qi());
    }

    @Override // com.amazon.aps.iva.t40.c, com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        vi().onCreate(bundle);
        wi().setOnEnabled(new d());
        wi().setOnDisabled(new e(pi().getEditText()));
        pi().getEditText().setImeOptions(2);
        wi().setOnClickListener(new com.amazon.aps.iva.c8.e(this, 21));
        com.amazon.aps.iva.fc0.l<?>[] lVarArr = P;
        View view = (View) this.D.getValue(this, lVarArr[6]);
        if (view != null) {
            view.setOnClickListener(new com.amazon.aps.iva.c8.f(this, 17));
        }
        ((View) this.F.getValue(this, lVarArr[8])).setOnClickListener(new com.amazon.aps.iva.ne.a(this, 20));
    }

    @Override // com.amazon.aps.iva.u40.l
    public final void q2() {
        TextView ti = ti();
        String string = getString(R.string.sign_in_tos, getString(R.string.sign_in_legal_clause_replacement_terms), getString(R.string.sign_in_legal_clause_replacement_privacy_policy));
        j.e(string, "getString(\n             …acy_policy)\n            )");
        String string2 = getString(R.string.sign_in_legal_clause_replacement_terms);
        j.e(string2, "getString(R.string.sign_…clause_replacement_terms)");
        com.amazon.aps.iva.xw.p pVar = new com.amazon.aps.iva.xw.p(string2, new b(), false);
        String string3 = getString(R.string.sign_in_legal_clause_replacement_privacy_policy);
        j.e(string3, "getString(R.string.sign_…placement_privacy_policy)");
        r0.b(ti, m0.g(string, pVar, new com.amazon.aps.iva.xw.p(string3, new c(), false)));
        TextView ti2 = ti();
        j.f(ti2, "<this>");
        ti2.setPaintFlags(ti2.getPaintFlags() | 128);
    }

    @Override // com.amazon.aps.iva.u40.l
    public final void r2() {
        ti().setText(getString(R.string.sign_in_tos_phone));
    }

    @Override // com.amazon.aps.iva.u40.l
    public final void setPhoneNumber(String str) {
        qi().setPhoneNumber(str);
        qi().setSelection(str.length());
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H(vi());
    }

    @Override // com.amazon.aps.iva.t40.c
    public final int si() {
        return this.M;
    }

    @Override // com.amazon.aps.iva.u40.l
    public final void te() {
        EmailInputView mi = mi();
        String string = getString(R.string.sign_in_user_hint_email);
        j.e(string, "getString(R.string.sign_in_user_hint_email)");
        mi.setHintText(string);
    }

    public final SwitcherLayout ui() {
        return (SwitcherLayout) this.I.getValue(this, P[11]);
    }

    public final com.amazon.aps.iva.u40.c vi() {
        return (com.amazon.aps.iva.u40.c) this.L.getValue();
    }

    public final DataInputButton wi() {
        return (DataInputButton) this.C.getValue(this, P[5]);
    }

    @Override // com.amazon.aps.iva.u40.l
    public final void x1() {
        wi().d.clear();
    }

    @Override // com.amazon.aps.iva.u40.l
    public final void ye() {
        View view = (View) this.A.getValue(this, P[3]);
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // com.amazon.aps.iva.u40.l
    public final void z5(String str) {
        ForgotPasswordActivity.t.getClass();
        ForgotPasswordActivity.a.a(this, str, true);
    }

    @Override // com.amazon.aps.iva.u40.l
    public final void zb() {
        ((TextView) this.B.getValue(this, P[4])).setVisibility(0);
    }
}
