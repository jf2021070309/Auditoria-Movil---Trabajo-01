package com.amazon.aps.iva.t40;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.amazon.aps.iva.cx.s;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.mh.i;
import com.amazon.aps.iva.mh.j;
import com.amazon.aps.iva.mh.k;
import com.amazon.aps.iva.u70.h;
import com.amazon.aps.iva.us.n;
import com.amazon.aps.iva.us.o;
import com.amazon.aps.iva.us.p;
import com.amazon.aps.iva.us.w;
import com.amazon.aps.iva.us.z;
import com.amazon.aps.iva.xw.g;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yw.d0;
import com.crunchyroll.auth.c;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.application.a;
import com.ellation.crunchyroll.presentation.signing.signin.f;
import com.ellation.crunchyroll.ui.KeyboardAwareLayoutListener;
import com.ellation.widgets.input.email.EmailInputView;
import com.ellation.widgets.input.password.PasswordInputView;
import com.ellation.widgets.input.phonenumber.PhoneNumberInputView;
/* compiled from: EmailAndPasswordActivity.kt */
/* loaded from: classes2.dex */
public abstract class c extends com.amazon.aps.iva.i60.b implements e {
    public static final /* synthetic */ l<Object>[] w = {q.a(c.class, "contentView", "getContentView()Landroid/view/ViewGroup;", 0), q.a(c.class, "toolbar", "getToolbar()Landroid/view/ViewGroup;", 0), q.a(c.class, "billingTitleContainer", "getBillingTitleContainer()Landroid/view/ViewGroup;", 0), q.a(c.class, "billingTitle", "getBillingTitle()Landroid/widget/TextView;", 0), q.a(c.class, "emailInput", "getEmailInput()Lcom/ellation/widgets/input/email/EmailInputView;", 0), q.a(c.class, "passwordInput", "getPasswordInput()Lcom/ellation/widgets/input/password/PasswordInputView;", 0), q.a(c.class, "phoneNumberInput", "getPhoneNumberInput()Lcom/ellation/widgets/input/phonenumber/PhoneNumberInputView;", 0), q.a(c.class, "tos", "getTos()Landroid/widget/TextView;", 0)};
    public final v k = g.d(this, 16908290);
    public final v l = g.b(this, R.id.centralized_toolbar);
    public final v m = g.d(this, R.id.billing_title_container);
    public final v n = g.d(this, R.id.billing_header_title);
    public final v o = g.d(this, R.id.email);
    public final v p = g.d(this, R.id.password);
    public final v q = g.d(this, R.id.phone_number);
    public final v r = g.d(this, R.id.tos);
    public final m s = f.b(new a());
    public final m t = f.b(new C0730c());
    public final m u = f.b(new b());
    public final m v = f.b(new d());

    /* compiled from: EmailAndPasswordActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<j> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final j invoke() {
            com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
            if (aVar != null) {
                Object c = aVar.c().c(com.amazon.aps.iva.cx.b.class, "app_legal_links");
                if (c != null) {
                    c cVar = c.this;
                    com.amazon.aps.iva.yb0.j.f(cVar, "context");
                    com.amazon.aps.iva.mh.f fVar = new com.amazon.aps.iva.mh.f(cVar, (com.amazon.aps.iva.cx.b) c);
                    com.amazon.aps.iva.ls.a aVar2 = com.amazon.aps.iva.ls.a.TERMS_OF_USE;
                    com.amazon.aps.iva.ds.c cVar2 = com.amazon.aps.iva.ds.c.b;
                    com.amazon.aps.iva.yb0.j.f(aVar2, "screen");
                    return new k(fVar, new i(cVar2, aVar2), cVar);
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.AppLegalLinksConfigImpl");
            }
            com.amazon.aps.iva.yb0.j.m("instance");
            throw null;
        }
    }

    /* compiled from: EmailAndPasswordActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<n> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final n invoke() {
            Intent intent = c.this.getIntent();
            com.amazon.aps.iva.yb0.j.e(intent, "intent");
            com.crunchyroll.auth.c a = c.a.a(intent);
            com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
            com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
            if (aVar != null) {
                Object c = aVar.c().c(s.class, "user_account_migration");
                if (c != null) {
                    com.amazon.aps.iva.eo.c cVar2 = ((d0) com.ellation.crunchyroll.application.e.a()).q.e;
                    com.amazon.aps.iva.yb0.j.f(cVar2, "funUserProvider");
                    return new o(cVar, (s) c, cVar2, a.d);
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.UserAccountMigrationConfigImpl");
            }
            com.amazon.aps.iva.yb0.j.m("instance");
            throw null;
        }
    }

    /* compiled from: EmailAndPasswordActivity.kt */
    /* renamed from: com.amazon.aps.iva.t40.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0730c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<p> {
        public C0730c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final p invoke() {
            Intent intent = c.this.getIntent();
            com.amazon.aps.iva.yb0.j.e(intent, "intent");
            com.crunchyroll.auth.c a = c.a.a(intent);
            z zVar = w.a.a;
            com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
            com.amazon.aps.iva.yb0.j.f(zVar, "userSessionAnalytics");
            return new com.amazon.aps.iva.us.q(zVar, cVar, a.d);
        }
    }

    /* compiled from: EmailAndPasswordActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.ellation.crunchyroll.presentation.signing.signin.f> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.ellation.crunchyroll.presentation.signing.signin.f invoke() {
            return f.a.a(com.amazon.aps.iva.bo.e.c(((d0) com.ellation.crunchyroll.application.e.a()).m, com.ellation.crunchyroll.application.e.c().getUserBenefitsSynchronizer(), ((d0) com.ellation.crunchyroll.application.e.a()).c.a, ((d0) com.ellation.crunchyroll.application.e.a()).p.d, com.ellation.crunchyroll.application.e.d(), com.amazon.aps.iva.t40.d.h), com.ellation.crunchyroll.application.e.c().getEtpIndexProvider(), com.ellation.crunchyroll.application.e.c().getRefreshTokenProvider(), c.this.oi());
        }
    }

    @Override // com.amazon.aps.iva.t40.e
    public final void B5() {
        pi().setVisibility(0);
    }

    @Override // com.amazon.aps.iva.t40.e
    public final void Fa() {
        mi().setVisibility(0);
    }

    @Override // com.amazon.aps.iva.t40.e
    public final void G6() {
        this.d.c(mi().getEditText());
    }

    @Override // com.amazon.aps.iva.t40.e
    public final String Gb() {
        return pi().getPassword();
    }

    @Override // com.amazon.aps.iva.t40.e
    public final void N3() {
        pi().setVisibility(8);
    }

    @Override // com.amazon.aps.iva.t40.e
    public final void R3() {
        qi().setVisibility(8);
    }

    @Override // com.amazon.aps.iva.t40.e
    public final void T8() {
        this.d.c(qi().getEditText());
    }

    @Override // com.amazon.aps.iva.t40.e
    public final void U1() {
        ImageView imageView;
        ViewGroup ri = ri();
        if (ri != null && (imageView = (ImageView) ri.findViewById(R.id.navigation_icon)) != null) {
            imageView.setImageAlpha(255);
            imageView.setOnClickListener(new com.amazon.aps.iva.c8.s(this, 22));
        }
    }

    @Override // com.amazon.aps.iva.t40.e
    public final void Y2() {
        l<?>[] lVarArr = w;
        ((ViewGroup) this.m.getValue(this, lVarArr[2])).setVisibility(0);
        ((TextView) this.n.getValue(this, lVarArr[3])).setText(getString(R.string.billing_signing_header_title, getString(R.string.sign_up_header_title_premium)));
    }

    @Override // com.amazon.aps.iva.t40.e
    public final String Yf() {
        return qi().getPhoneNumber();
    }

    @Override // com.amazon.aps.iva.t40.e
    public final void Zg() {
        mi().setVisibility(8);
    }

    @Override // com.amazon.aps.iva.t40.e
    public final void g5() {
        qi().setVisibility(0);
    }

    @Override // com.amazon.aps.iva.t40.e
    public final void l0() {
        ImageView imageView;
        ViewGroup ri = ri();
        if (ri != null && (imageView = (ImageView) ri.findViewById(R.id.navigation_icon)) != null) {
            imageView.setImageAlpha(127);
            imageView.setOnClickListener(null);
        }
    }

    public final EmailInputView mi() {
        return (EmailInputView) this.o.getValue(this, w[4]);
    }

    public final j ni() {
        return (j) this.s.getValue();
    }

    public final n oi() {
        return (n) this.u.getValue();
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        TextView textView;
        View findViewById;
        super.onCreate(bundle);
        ViewTreeObserver viewTreeObserver = ((ViewGroup) this.k.getValue(this, w[0])).getViewTreeObserver();
        View findViewById2 = findViewById(R.id.errors_layout);
        com.amazon.aps.iva.yb0.j.e(findViewById2, "findViewById(R.id.errors_layout)");
        viewTreeObserver.addOnGlobalLayoutListener(new KeyboardAwareLayoutListener(findViewById2, false, null, 4, null));
        ViewGroup ri = ri();
        if (ri != null) {
            textView = (TextView) ri.findViewById(R.id.title);
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setText(getString(si()));
        }
        ViewGroup ri2 = ri();
        if (ri2 != null && (findViewById = ri2.findViewById(R.id.navigation_icon)) != null) {
            findViewById.setOnClickListener(new com.amazon.aps.iva.c8.k(this, 18));
        }
        ViewGroup ri3 = ri();
        if (ri3 != null) {
            ri3.setOnApplyWindowInsetsListener(new com.amazon.aps.iva.t40.b());
        }
    }

    public final PasswordInputView pi() {
        return (PasswordInputView) this.p.getValue(this, w[5]);
    }

    public final PhoneNumberInputView qi() {
        return (PhoneNumberInputView) this.q.getValue(this, w[6]);
    }

    public final ViewGroup ri() {
        return (ViewGroup) this.l.getValue(this, w[1]);
    }

    @Override // com.amazon.aps.iva.t40.e
    public final void setUserCountry(String str) {
        qi().setUserCountry(str);
    }

    @Override // com.amazon.aps.iva.u70.j
    public final void showSnackbar(com.amazon.aps.iva.u70.i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "message");
        int i = h.a;
        h.a.a((ViewGroup) this.k.getValue(this, w[0]), iVar);
    }

    public abstract int si();

    @Override // com.amazon.aps.iva.t40.e
    public final String t1() {
        return mi().getEmail();
    }

    public final TextView ti() {
        return (TextView) this.r.getValue(this, w[7]);
    }
}
