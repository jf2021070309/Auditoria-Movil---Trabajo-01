package com.ellation.crunchyroll.presentation.forgotpassword;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.h;
import androidx.lifecycle.p;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.k10.j;
import com.amazon.aps.iva.k10.l;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.u70.h;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.xw.r0;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.i;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.widgets.input.datainputbutton.DataInputButton;
import com.ellation.widgets.input.email.EmailInputView;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: ForgotPasswordActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/ellation/crunchyroll/presentation/forgotpassword/ForgotPasswordActivity;", "Lcom/amazon/aps/iva/i60/b;", "Lcom/amazon/aps/iva/k10/j;", "<init>", "()V", "a", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ForgotPasswordActivity extends com.amazon.aps.iva.i60.b implements j {
    public final v k = com.amazon.aps.iva.xw.g.d(this, R.id.email_input);
    public final v l = com.amazon.aps.iva.xw.g.d(this, R.id.submit_button);
    public final v m = com.amazon.aps.iva.xw.g.d(this, R.id.email_input_underline_text);
    public final v n = com.amazon.aps.iva.xw.g.d(this, R.id.password_reset_required_container);
    public final com.amazon.aps.iva.y30.b o = new com.amazon.aps.iva.y30.b(com.amazon.aps.iva.ds.c.b);
    public final com.amazon.aps.iva.ez.a p = new com.amazon.aps.iva.ez.a(l.class, new g(this), new b());
    public final com.amazon.aps.iva.xw.a q = com.amazon.aps.iva.xw.b.b(this, new c());
    public final m r = com.amazon.aps.iva.kb0.f.b(new f());
    public final int s = R.layout.activity_forgot_password;
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] u = {q.a(ForgotPasswordActivity.class, "emailInputView", "getEmailInputView()Lcom/ellation/widgets/input/email/EmailInputView;", 0), q.a(ForgotPasswordActivity.class, "submitButton", "getSubmitButton()Lcom/ellation/widgets/input/datainputbutton/DataInputButton;", 0), q.a(ForgotPasswordActivity.class, "emailUnderlineText", "getEmailUnderlineText()Landroid/widget/TextView;", 0), q.a(ForgotPasswordActivity.class, "passwordResetRequiredContainer", "getPasswordResetRequiredContainer()Landroid/view/View;", 0), q.a(ForgotPasswordActivity.class, "forgotPasswordViewModel", "getForgotPasswordViewModel()Lcom/ellation/crunchyroll/presentation/forgotpassword/ForgotPasswordViewModelImpl;", 0)};
    public static final a t = new a();

    /* compiled from: ForgotPasswordActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(Activity activity, String str, boolean z) {
            com.amazon.aps.iva.yb0.j.f(activity, "activity");
            Intent putExtra = new Intent(activity, ForgotPasswordActivity.class).putExtra("email_edit_text", str).putExtra("password_reset_required", z);
            com.amazon.aps.iva.yb0.j.e(putExtra, "Intent(activity, ForgotP… isPasswordResetRequired)");
            activity.startActivityForResult(putExtra, 10);
        }
    }

    /* compiled from: ForgotPasswordActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p, l> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final l invoke(p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            EtpAccountService accountService = com.ellation.crunchyroll.application.e.c().getAccountService();
            com.amazon.aps.iva.yb0.j.f(accountService, "accountService");
            return new l(new com.amazon.aps.iva.k10.b(accountService), ForgotPasswordActivity.this.o);
        }
    }

    /* compiled from: ForgotPasswordActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e.m, com.amazon.aps.iva.kb0.q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.e.m mVar) {
            com.amazon.aps.iva.e.m mVar2 = mVar;
            com.amazon.aps.iva.yb0.j.f(mVar2, "$this$onBackPressedCallback");
            a aVar = ForgotPasswordActivity.t;
            ForgotPasswordActivity forgotPasswordActivity = ForgotPasswordActivity.this;
            forgotPasswordActivity.ni().a();
            if (mVar2.isEnabled()) {
                mVar2.setEnabled(false);
            }
            forgotPasswordActivity.getOnBackPressedDispatcher().c();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ForgotPasswordActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            a aVar = ForgotPasswordActivity.t;
            ForgotPasswordActivity forgotPasswordActivity = ForgotPasswordActivity.this;
            r0.d(forgotPasswordActivity.mi().getEditText(), 2, new com.ellation.crunchyroll.presentation.forgotpassword.a(forgotPasswordActivity));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ForgotPasswordActivity.kt */
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

    /* compiled from: ForgotPasswordActivity.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.k10.c> {
        public f() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.k10.c invoke() {
            a aVar = ForgotPasswordActivity.t;
            ForgotPasswordActivity forgotPasswordActivity = ForgotPasswordActivity.this;
            forgotPasswordActivity.getClass();
            l lVar = (l) forgotPasswordActivity.p.getValue(forgotPasswordActivity, ForgotPasswordActivity.u[4]);
            com.amazon.aps.iva.k10.i iVar = new com.amazon.aps.iva.k10.i(forgotPasswordActivity);
            com.amazon.aps.iva.en.c cVar = new com.amazon.aps.iva.en.c(com.amazon.aps.iva.ds.c.b);
            com.amazon.aps.iva.y30.b bVar = forgotPasswordActivity.o;
            com.amazon.aps.iva.yb0.j.f(bVar, "forgotPasswordAnalytics");
            return new com.amazon.aps.iva.k10.g(forgotPasswordActivity, lVar, iVar, bVar, cVar);
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<h> {
        public final /* synthetic */ h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final h invoke() {
            return this.h;
        }
    }

    @Override // com.amazon.aps.iva.k10.j
    public final void E1(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "value");
        mi().setEmail(str);
    }

    @Override // com.amazon.aps.iva.k10.j
    public final void H1() {
        mi().requestFocus();
    }

    @Override // com.amazon.aps.iva.k10.j
    public final boolean If() {
        return mi().hasFocus();
    }

    @Override // com.amazon.aps.iva.k10.j
    public final void Y6() {
        com.amazon.aps.iva.fc0.l<?>[] lVarArr = u;
        ((View) this.n.getValue(this, lVarArr[3])).setVisibility(8);
        ((TextView) this.m.getValue(this, lVarArr[2])).setVisibility(0);
    }

    @Override // com.amazon.aps.iva.k10.j
    public final void a0() {
        setResult(-1);
        finish();
    }

    @Override // com.amazon.aps.iva.k10.j
    public final void ce() {
        com.amazon.aps.iva.fc0.l<?>[] lVarArr = u;
        ((View) this.n.getValue(this, lVarArr[3])).setVisibility(0);
        ((TextView) this.m.getValue(this, lVarArr[2])).setVisibility(8);
    }

    @Override // com.amazon.aps.iva.wy.c
    public final Integer ji() {
        return Integer.valueOf(this.s);
    }

    public final EmailInputView mi() {
        return (EmailInputView) this.k.getValue(this, u[0]);
    }

    public final com.amazon.aps.iva.k10.c ni() {
        return (com.amazon.aps.iva.k10.c) this.r.getValue();
    }

    public final DataInputButton oi() {
        return (DataInputButton) this.l.getValue(this, u[1]);
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ni().onCreate(bundle);
        com.amazon.aps.iva.xw.b.d(this, true);
        Toolbar toolbar = this.f;
        com.amazon.aps.iva.yb0.j.c(toolbar);
        toolbar.setOnApplyWindowInsetsListener(new com.amazon.aps.iva.jo.a(1));
        ni().U4(getIntent().getStringExtra("email_edit_text"), getIntent().getBooleanExtra("password_reset_required", false));
        oi().setOnClickListener(new com.amazon.aps.iva.fe.a(this, 10));
        oi().G(mi());
        oi().setOnEnabled(new d());
        oi().setOnDisabled(new e(mi().getEditText()));
        mi().getEditText().setImeOptions(2);
        getOnBackPressedDispatcher().a(this, this.q);
    }

    @Override // com.amazon.aps.iva.wy.c, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(bundle, "outState");
        super.onSaveInstanceState(bundle);
        ni().onSaveInstanceState(bundle);
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H(ni());
    }

    @Override // com.amazon.aps.iva.u70.j
    public final void showSnackbar(com.amazon.aps.iva.u70.i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "message");
        int i = com.amazon.aps.iva.u70.h.a;
        View findViewById = findViewById(16908290);
        com.amazon.aps.iva.yb0.j.e(findViewById, "findViewById(android.R.id.content)");
        h.a.a((ViewGroup) findViewById, iVar);
    }

    @Override // com.amazon.aps.iva.k10.j
    public final String t1() {
        return mi().getEmail();
    }
}
