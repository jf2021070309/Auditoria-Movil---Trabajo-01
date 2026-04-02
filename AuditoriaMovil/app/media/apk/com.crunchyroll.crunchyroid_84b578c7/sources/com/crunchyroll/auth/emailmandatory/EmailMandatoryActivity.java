package com.crunchyroll.auth.emailmandatory;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.c8.s;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.mh.j;
import com.amazon.aps.iva.u70.h;
import com.amazon.aps.iva.wy.h;
import com.amazon.aps.iva.xw.m0;
import com.amazon.aps.iva.xw.r0;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.yd.k;
import com.amazon.aps.iva.yd.w;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.ui.databinding.LayoutErrorsBinding;
import com.ellation.widgets.input.datainputbutton.DataInputButton;
import com.ellation.widgets.input.email.EmailInputView;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: EmailMandatoryActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/crunchyroll/auth/emailmandatory/EmailMandatoryActivity;", "Lcom/amazon/aps/iva/i60/b;", "Lcom/amazon/aps/iva/yd/w;", "<init>", "()V", "auth_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class EmailMandatoryActivity extends com.amazon.aps.iva.i60.b implements w {
    public static final /* synthetic */ int o = 0;
    public final k k = new k(this);
    public final m l = f.b(new a());
    public final com.amazon.aps.iva.xw.a m = com.amazon.aps.iva.xw.b.b(this, new c());
    public final j n;

    /* compiled from: EmailMandatoryActivity.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.xd.a> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.xd.a invoke() {
            View inflate = LayoutInflater.from(EmailMandatoryActivity.this).inflate(R.layout.activity_email_mandatory, (ViewGroup) null, false);
            int i = R.id.continue_cta;
            DataInputButton dataInputButton = (DataInputButton) z.u(R.id.continue_cta, inflate);
            if (dataInputButton != null) {
                i = R.id.email_input;
                EmailInputView emailInputView = (EmailInputView) z.u(R.id.email_input, inflate);
                if (emailInputView != null) {
                    i = R.id.email_required_header_text;
                    if (((TextView) z.u(R.id.email_required_header_text, inflate)) != null) {
                        i = R.id.email_required_opt_in_marketing_notifications_checkbox;
                        CheckBox checkBox = (CheckBox) z.u(R.id.email_required_opt_in_marketing_notifications_checkbox, inflate);
                        if (checkBox != null) {
                            i = R.id.email_required_subheader_text;
                            if (((TextView) z.u(R.id.email_required_subheader_text, inflate)) != null) {
                                i = R.id.errors_layout;
                                View u = z.u(R.id.errors_layout, inflate);
                                if (u != null) {
                                    LayoutErrorsBinding bind = LayoutErrorsBinding.bind(u);
                                    i = R.id.progress_bar;
                                    ProgressBar progressBar = (ProgressBar) z.u(R.id.progress_bar, inflate);
                                    if (progressBar != null) {
                                        i = R.id.toolbar;
                                        Toolbar toolbar = (Toolbar) z.u(R.id.toolbar, inflate);
                                        if (toolbar != null) {
                                            return new com.amazon.aps.iva.xd.a((ConstraintLayout) inflate, dataInputButton, emailInputView, checkBox, bind, progressBar, toolbar);
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

    /* compiled from: EmailMandatoryActivity.kt */
    /* loaded from: classes.dex */
    public static final class b implements h {
    }

    /* compiled from: EmailMandatoryActivity.kt */
    /* loaded from: classes.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e.m, q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.e.m mVar) {
            com.amazon.aps.iva.yb0.j.f(mVar, "$this$onBackPressedCallback");
            EmailMandatoryActivity.this.k.a().a();
            return q.a;
        }
    }

    /* compiled from: EmailMandatoryActivity.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class d extends i implements com.amazon.aps.iva.xb0.a<q> {
        public d(EditText editText) {
            super(0, editText, r0.class, "clearKeyboardActionListener", "clearKeyboardActionListener(Landroid/widget/EditText;)V", 1);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            r0.a((EditText) this.receiver);
            return q.a;
        }
    }

    /* compiled from: EmailMandatoryActivity.kt */
    /* loaded from: classes.dex */
    public static final class e extends l implements com.amazon.aps.iva.xb0.a<q> {
        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            int i = EmailMandatoryActivity.o;
            r0.d(EmailMandatoryActivity.this.mi().c.getEditText(), 2, com.crunchyroll.auth.emailmandatory.a.h);
            return q.a;
        }
    }

    public EmailMandatoryActivity() {
        com.amazon.aps.iva.vd.e eVar = l1.f;
        if (eVar != null) {
            this.n = eVar.e().invoke(this, new b(), com.amazon.aps.iva.ls.a.EMAIL_ADDRESS_NEEDED);
        } else {
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.yd.w
    public final void J() {
        mi().b.Vb();
    }

    @Override // com.amazon.aps.iva.yd.w
    public final void a0() {
        setResult(-1);
        finish();
    }

    @Override // com.amazon.aps.iva.yd.w
    public final void b0() {
        new MaterialAlertDialogBuilder(this).setTitle(R.string.email_mandatory_dialog_title).setMessage(R.string.email_mandatory_dialog_subtitle).setPositiveButton(R.string.email_required_dialog_positive_button, (DialogInterface.OnClickListener) new com.amazon.aps.iva.yd.a(this, 0)).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) new com.amazon.aps.iva.yd.b()).show();
    }

    @Override // com.amazon.aps.iva.yd.w
    public final void c() {
        int i = com.amazon.aps.iva.u70.h.a;
        FrameLayout frameLayout = mi().e.errorsLayout;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.errorsLayout.errorsLayout");
        h.a.a(frameLayout, com.amazon.aps.iva.bt.c.b);
    }

    @Override // com.amazon.aps.iva.yd.w
    public final void j() {
        ProgressBar progressBar = mi().f;
        com.amazon.aps.iva.yb0.j.e(progressBar, "binding.progressBar");
        progressBar.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.yd.w
    public final void j2(boolean z) {
        mi().d.setChecked(z);
    }

    public final com.amazon.aps.iva.xd.a mi() {
        return (com.amazon.aps.iva.xd.a) this.l.getValue();
    }

    @Override // com.amazon.aps.iva.yd.w
    public final void o() {
        ProgressBar progressBar = mi().f;
        com.amazon.aps.iva.yb0.j.e(progressBar, "binding.progressBar");
        progressBar.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ConstraintLayout constraintLayout = mi().a;
        com.amazon.aps.iva.yb0.j.e(constraintLayout, "binding.root");
        setContentView(constraintLayout);
        String string = getString(R.string.password_privacy_policy);
        com.amazon.aps.iva.yb0.j.e(string, "getString(R.string.password_privacy_policy)");
        String string2 = getString(R.string.email_input_opt_in_marketing_notifications, string);
        com.amazon.aps.iva.yb0.j.e(string2, "getString(\n            R…ivacyPolicyText\n        )");
        SpannableStringBuilder b2 = m0.b(com.amazon.aps.iva.d3.a.getColor(this, R.color.primary), string2, string);
        CheckBox checkBox = mi().d;
        com.amazon.aps.iva.yb0.j.e(checkBox, "binding.emailRequiredOpt…tingNotificationsCheckbox");
        SpannableString spannableString = new SpannableString(b2);
        m0.a(spannableString, string, false, new com.amazon.aps.iva.yd.c(this, string));
        r0.b(checkBox, spannableString);
        DataInputButton dataInputButton = mi().b;
        EmailInputView emailInputView = mi().c;
        com.amazon.aps.iva.yb0.j.e(emailInputView, "binding.emailInput");
        dataInputButton.G(emailInputView);
        dataInputButton.setOnClickListener(new s(this, 2));
        dataInputButton.setOnDisabled(new d(mi().c.getEditText()));
        dataInputButton.setOnEnabled(new e());
        mi().g.setNavigationOnClickListener(new com.amazon.aps.iva.c8.e(this, 1));
        DataInputButton dataInputButton2 = mi().b;
        EmailInputView emailInputView2 = mi().c;
        com.amazon.aps.iva.yb0.j.e(emailInputView2, "binding.emailInput");
        dataInputButton2.G(emailInputView2);
        getOnBackPressedDispatcher().a(this, this.m);
    }

    @Override // com.amazon.aps.iva.yd.w
    public final void q() {
        DataInputButton dataInputButton = mi().b;
        com.amazon.aps.iva.yb0.j.e(dataInputButton, "binding.continueCta");
        dataInputButton.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.yd.l> setupPresenters() {
        return l1.H(this.k.a());
    }

    @Override // com.amazon.aps.iva.yd.w
    public final void w() {
        DataInputButton dataInputButton = mi().b;
        com.amazon.aps.iva.yb0.j.e(dataInputButton, "binding.continueCta");
        dataInputButton.setVisibility(0);
    }
}
