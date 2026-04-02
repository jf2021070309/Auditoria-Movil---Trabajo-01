package com.crunchyroll.usermigration.verification;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.h;
import androidx.lifecycle.p;
import com.amazon.aps.iva.co.f;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.jo.i;
import com.amazon.aps.iva.jo.j;
import com.amazon.aps.iva.jo.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.u70.h;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.xw.g;
import com.amazon.aps.iva.xw.v;
import com.crunchyroll.crunchyroid.R;
import com.ellation.widgets.input.datainputbutton.DataInputButton;
import com.ellation.widgets.input.email.EmailInputView;
import com.ellation.widgets.input.password.PasswordInputView;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: CrOwnershipVerificationActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/crunchyroll/usermigration/verification/CrOwnershipVerificationActivity;", "Lcom/amazon/aps/iva/i60/b;", "Lcom/amazon/aps/iva/jo/j;", "<init>", "()V", "a", "user-migration_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CrOwnershipVerificationActivity extends com.amazon.aps.iva.i60.b implements j {
    public final v k = g.d(this, 16908290);
    public final com.amazon.aps.iva.kb0.e l = com.amazon.aps.iva.kb0.f.a(com.amazon.aps.iva.kb0.g.NONE, new d(this));
    public final com.amazon.aps.iva.ez.a m = new com.amazon.aps.iva.ez.a(l.class, new e(this), f.h);
    public final m n = com.amazon.aps.iva.kb0.f.b(new c());
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] p = {q.a(CrOwnershipVerificationActivity.class, "contentView", "getContentView()Landroid/view/ViewGroup;", 0), q.a(CrOwnershipVerificationActivity.class, "viewModel", "getViewModel()Lcom/crunchyroll/usermigration/verification/CrOwnershipVerificationViewModelImpl;", 0)};
    public static final a o = new a();

    /* compiled from: CrOwnershipVerificationActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: CrOwnershipVerificationActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xa0.f, com.amazon.aps.iva.kb0.q> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.xa0.f fVar) {
            com.amazon.aps.iva.xa0.f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(fVar2, "$this$applyInsetter");
            com.amazon.aps.iva.xa0.f.a(fVar2, true, false, false, false, com.crunchyroll.usermigration.verification.a.h, 254);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CrOwnershipVerificationActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.jo.e> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.jo.e invoke() {
            com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
            com.amazon.aps.iva.jo.b bVar = com.amazon.aps.iva.jo.b.h;
            com.amazon.aps.iva.yb0.j.f(bVar, "createTimer");
            com.amazon.aps.iva.jo.d dVar = new com.amazon.aps.iva.jo.d(cVar, bVar);
            a aVar = CrOwnershipVerificationActivity.o;
            CrOwnershipVerificationActivity crOwnershipVerificationActivity = CrOwnershipVerificationActivity.this;
            crOwnershipVerificationActivity.getClass();
            return new i(crOwnershipVerificationActivity, (l) crOwnershipVerificationActivity.m.getValue(crOwnershipVerificationActivity, CrOwnershipVerificationActivity.p[1]), new com.amazon.aps.iva.ho.b(crOwnershipVerificationActivity, null), new com.amazon.aps.iva.h70.d(crOwnershipVerificationActivity), dVar);
        }
    }

    /* compiled from: ActivityViewBindingDelegate.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.p000do.b> {
        public final /* synthetic */ com.amazon.aps.iva.k.c h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.amazon.aps.iva.k.c cVar) {
            super(0);
            this.h = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.p000do.b invoke() {
            LayoutInflater layoutInflater = this.h.getLayoutInflater();
            com.amazon.aps.iva.yb0.j.e(layoutInflater, "layoutInflater");
            View inflate = layoutInflater.inflate(R.layout.activity_cr_ownership_verification, (ViewGroup) null, false);
            int i = R.id.cr_ownership_step_title;
            if (((TextView) z.u(R.id.cr_ownership_step_title, inflate)) != null) {
                i = R.id.cr_ownership_verification_email;
                EmailInputView emailInputView = (EmailInputView) z.u(R.id.cr_ownership_verification_email, inflate);
                if (emailInputView != null) {
                    i = R.id.cr_ownership_verification_forgot_password;
                    TextView textView = (TextView) z.u(R.id.cr_ownership_verification_forgot_password, inflate);
                    if (textView != null) {
                        i = R.id.cr_ownership_verification_next_button;
                        DataInputButton dataInputButton = (DataInputButton) z.u(R.id.cr_ownership_verification_next_button, inflate);
                        if (dataInputButton != null) {
                            i = R.id.cr_ownership_verification_password;
                            PasswordInputView passwordInputView = (PasswordInputView) z.u(R.id.cr_ownership_verification_password, inflate);
                            if (passwordInputView != null) {
                                i = R.id.cr_ownership_verification_welcome_subtitle;
                                if (((TextView) z.u(R.id.cr_ownership_verification_welcome_subtitle, inflate)) != null) {
                                    i = R.id.cr_ownership_verification_welcome_title;
                                    if (((TextView) z.u(R.id.cr_ownership_verification_welcome_title, inflate)) != null) {
                                        i = R.id.progress_overlay;
                                        View u = z.u(R.id.progress_overlay, inflate);
                                        if (u != null) {
                                            RelativeLayout relativeLayout = (RelativeLayout) u;
                                            com.amazon.aps.iva.p000do.f fVar = new com.amazon.aps.iva.p000do.f(relativeLayout, relativeLayout, 0);
                                            i = R.id.scroll_container;
                                            ScrollView scrollView = (ScrollView) z.u(R.id.scroll_container, inflate);
                                            if (scrollView != null) {
                                                i = R.id.toolbar;
                                                Toolbar toolbar = (Toolbar) z.u(R.id.toolbar, inflate);
                                                if (toolbar != null) {
                                                    return new com.amazon.aps.iva.p000do.b((ConstraintLayout) inflate, emailInputView, textView, dataInputButton, passwordInputView, fVar, scrollView, toolbar);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<h> {
        public final /* synthetic */ h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final h invoke() {
            return this.h;
        }
    }

    /* compiled from: CrOwnershipVerificationActivity.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p, l> {
        public static final f h = new f();

        public f() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final l invoke(p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            int i = com.amazon.aps.iva.co.f.a;
            com.amazon.aps.iva.co.e eVar = f.a.a;
            if (eVar != null) {
                return new l(eVar.l());
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.jo.j
    public final void A1(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "emailText");
        com.amazon.aps.iva.co.e eVar = f.a.a;
        if (eVar != null) {
            eVar.j().invoke(this, str);
        } else {
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.jo.j
    public final void E1(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "emailText");
        mi().b.getEditText().setText(str);
    }

    @Override // com.amazon.aps.iva.jo.j
    public final void H1() {
        mi().b.requestFocus();
    }

    @Override // com.amazon.aps.iva.jo.j
    public final void U1() {
        Toolbar toolbar = this.f;
        com.amazon.aps.iva.yb0.j.c(toolbar);
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.setAlpha(255);
        }
        Toolbar toolbar2 = this.f;
        com.amazon.aps.iva.yb0.j.c(toolbar2);
        toolbar2.setNavigationOnClickListener(new com.amazon.aps.iva.fe.a(this, 4));
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.ni.q
    public final void a() {
        RelativeLayout relativeLayout = (RelativeLayout) mi().f.b;
        com.amazon.aps.iva.yb0.j.e(relativeLayout, "binding.progressOverlay.root");
        relativeLayout.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.ni.q
    public final void b() {
        RelativeLayout relativeLayout = (RelativeLayout) mi().f.b;
        com.amazon.aps.iva.yb0.j.e(relativeLayout, "binding.progressOverlay.root");
        relativeLayout.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.jo.j
    public final void f0() {
        setResult(-1);
    }

    @Override // com.amazon.aps.iva.jo.j
    public final void l0() {
        Toolbar toolbar = this.f;
        com.amazon.aps.iva.yb0.j.c(toolbar);
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.setAlpha(127);
        }
        Toolbar toolbar2 = this.f;
        com.amazon.aps.iva.yb0.j.c(toolbar2);
        toolbar2.setNavigationOnClickListener(null);
    }

    public final com.amazon.aps.iva.p000do.b mi() {
        return (com.amazon.aps.iva.p000do.b) this.l.getValue();
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ConstraintLayout constraintLayout = mi().a;
        com.amazon.aps.iva.yb0.j.e(constraintLayout, "binding.root");
        setContentView(constraintLayout);
        mi().h.setOnApplyWindowInsetsListener(new com.amazon.aps.iva.jo.a(0));
        ScrollView scrollView = mi().g;
        com.amazon.aps.iva.yb0.j.e(scrollView, "binding.scrollContainer");
        f1.i(scrollView, b.h);
        ((com.amazon.aps.iva.jo.e) this.n.getValue()).v(getIntent().getStringExtra("email_edit_text"));
        DataInputButton dataInputButton = mi().d;
        EmailInputView emailInputView = mi().b;
        com.amazon.aps.iva.yb0.j.e(emailInputView, "binding.crOwnershipVerificationEmail");
        PasswordInputView passwordInputView = mi().e;
        com.amazon.aps.iva.yb0.j.e(passwordInputView, "binding.crOwnershipVerificationPassword");
        dataInputButton.G(emailInputView, passwordInputView);
        mi().d.setOnClickListener(new com.amazon.aps.iva.ne.a(this, 8));
        mi().c.setOnClickListener(new com.amazon.aps.iva.c8.h(this, 9));
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H((com.amazon.aps.iva.jo.e) this.n.getValue());
    }

    @Override // com.amazon.aps.iva.jo.j
    public final void showSnackbar(com.amazon.aps.iva.u70.i iVar) {
        int i = com.amazon.aps.iva.u70.h.a;
        h.a.a((ViewGroup) this.k.getValue(this, p[0]), iVar);
    }
}
