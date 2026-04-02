package com.crunchyroll.auth.screen;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.ce.i;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fe.h;
import com.amazon.aps.iva.fe.p;
import com.amazon.aps.iva.i70.k;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.mh.j;
import com.amazon.aps.iva.u70.h;
import com.amazon.aps.iva.vd.e;
import com.amazon.aps.iva.xw.m0;
import com.amazon.aps.iva.xw.r0;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.auth.otpview.OtpTextLayout;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.ui.databinding.LayoutErrorsBinding;
import com.ellation.widgets.input.datainputbutton.DataInputButton;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: OtpActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/crunchyroll/auth/screen/OtpActivity;", "Lcom/amazon/aps/iva/i60/b;", "Lcom/amazon/aps/iva/fe/p;", "<init>", "()V", "auth_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class OtpActivity extends com.amazon.aps.iva.i60.b implements p {
    public static final /* synthetic */ int n = 0;
    public final h k = new h(this);
    public final m l = f.b(new a());
    public final j m;

    /* compiled from: OtpActivity.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.xd.b> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.xd.b invoke() {
            View inflate = LayoutInflater.from(OtpActivity.this).inflate(R.layout.activity_otp, (ViewGroup) null, false);
            int i = R.id.continue_cta;
            DataInputButton dataInputButton = (DataInputButton) z.u(R.id.continue_cta, inflate);
            if (dataInputButton != null) {
                i = R.id.errors_layout;
                View u = z.u(R.id.errors_layout, inflate);
                if (u != null) {
                    LayoutErrorsBinding bind = LayoutErrorsBinding.bind(u);
                    i = R.id.otp_phone_number;
                    TextView textView = (TextView) z.u(R.id.otp_phone_number, inflate);
                    if (textView != null) {
                        i = R.id.otp_resend_code;
                        TextView textView2 = (TextView) z.u(R.id.otp_resend_code, inflate);
                        if (textView2 != null) {
                            i = R.id.otp_sign_up_tos;
                            TextView textView3 = (TextView) z.u(R.id.otp_sign_up_tos, inflate);
                            if (textView3 != null) {
                                i = R.id.otp_text_error;
                                TextView textView4 = (TextView) z.u(R.id.otp_text_error, inflate);
                                if (textView4 != null) {
                                    i = R.id.otp_text_input;
                                    OtpTextLayout otpTextLayout = (OtpTextLayout) z.u(R.id.otp_text_input, inflate);
                                    if (otpTextLayout != null) {
                                        i = R.id.progress_bar;
                                        ProgressBar progressBar = (ProgressBar) z.u(R.id.progress_bar, inflate);
                                        if (progressBar != null) {
                                            i = R.id.toolbar;
                                            if (((Toolbar) z.u(R.id.toolbar, inflate)) != null) {
                                                return new com.amazon.aps.iva.xd.b((ConstraintLayout) inflate, dataInputButton, bind, textView, textView2, textView3, textView4, otpTextLayout, progressBar);
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

    /* compiled from: OtpActivity.kt */
    /* loaded from: classes.dex */
    public static final class b implements com.amazon.aps.iva.wy.h {
    }

    /* compiled from: OtpActivity.kt */
    /* loaded from: classes.dex */
    public static final class c implements i {
        public c() {
        }

        @Override // com.amazon.aps.iva.ce.i
        public final void a(com.crunchyroll.auth.otpview.a aVar) {
            com.amazon.aps.iva.yb0.j.f(aVar, "otpTextState");
            ((com.amazon.aps.iva.fe.i) OtpActivity.this.k.e.getValue()).r1(aVar);
        }
    }

    /* compiled from: OtpActivity.kt */
    /* loaded from: classes.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.l<View, q> {
        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(View view) {
            com.amazon.aps.iva.yb0.j.f(view, "it");
            ((com.amazon.aps.iva.fe.i) OtpActivity.this.k.e.getValue()).H5();
            return q.a;
        }
    }

    public OtpActivity() {
        e eVar = l1.f;
        if (eVar != null) {
            this.m = eVar.e().invoke(this, new b(), com.amazon.aps.iva.ls.a.OTP_VALIDATION);
        } else {
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.fe.p
    public final void B1() {
        mi().b.Nf();
    }

    @Override // com.amazon.aps.iva.fe.p
    public final void J() {
        mi().b.Vb();
    }

    @Override // com.amazon.aps.iva.fe.p
    public final void Jh(int i) {
        String quantityString = getResources().getQuantityString(R.plurals.resend_otp_countdown_seconds, i, Integer.valueOf(i));
        com.amazon.aps.iva.yb0.j.e(quantityString, "resources.getQuantityStr…    secondsLeft\n        )");
        String string = getString(R.string.otp_send_again_format, quantityString);
        com.amazon.aps.iva.yb0.j.e(string, "getString(R.string.otp_s…d_again_format, greyPart)");
        TextView textView = mi().e;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.otpResendCode");
        r0.b(textView, new SpannableString(m0.b(com.amazon.aps.iva.d3.a.getColor(this, R.color.cr_silver_chalice), string, quantityString)));
    }

    @Override // com.amazon.aps.iva.fe.p
    public final void P3() {
        TextView textView = mi().f;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.otpSignUpTos");
        textView.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.fe.p
    public final void a0() {
        setResult(-1);
        finish();
    }

    @Override // com.amazon.aps.iva.fe.p
    public final void c() {
        int i = com.amazon.aps.iva.u70.h.a;
        FrameLayout frameLayout = mi().c.errorsLayout;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.errorsLayout.errorsLayout");
        h.a.a(frameLayout, com.amazon.aps.iva.bt.c.b);
    }

    @Override // com.amazon.aps.iva.fe.p
    public final void h5() {
        TextView textView = mi().g;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.otpTextError");
        textView.setVisibility(0);
        mi().h.setState(k.ERROR);
    }

    @Override // com.amazon.aps.iva.fe.p
    public final void i4() {
        TextView textView = mi().f;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.otpSignUpTos");
        textView.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.fe.p
    public final void i6() {
        TextView textView = mi().g;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.otpTextError");
        textView.setVisibility(8);
        mi().h.setState(k.DEFAULT);
    }

    @Override // com.amazon.aps.iva.fe.p
    public final void i7() {
        DataInputButton dataInputButton = mi().b;
        dataInputButton.setText(R.string.create_account);
        t0.h(dataInputButton, null, Integer.valueOf(t0.a(R.dimen.cta_button_sign_un_margin_top, dataInputButton)), null, null, 13);
    }

    @Override // com.amazon.aps.iva.fe.p
    public final void j() {
        ProgressBar progressBar = mi().i;
        com.amazon.aps.iva.yb0.j.e(progressBar, "binding.progressBar");
        progressBar.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.fe.p
    public final void l6(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "otp");
        OtpTextLayout otpTextLayout = mi().h;
        otpTextLayout.getClass();
        com.amazon.aps.iva.ce.j jVar = otpTextLayout.c;
        jVar.getClass();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            jVar.getView().Na(i2, String.valueOf(str.charAt(i)));
            i++;
            i2++;
        }
    }

    public final com.amazon.aps.iva.xd.b mi() {
        return (com.amazon.aps.iva.xd.b) this.l.getValue();
    }

    @Override // com.amazon.aps.iva.fe.p
    public final void nb(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "phoneNumber");
        mi().d.setText(str);
    }

    @Override // com.amazon.aps.iva.fe.p
    public final void o() {
        ProgressBar progressBar = mi().i;
        com.amazon.aps.iva.yb0.j.e(progressBar, "binding.progressBar");
        progressBar.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ConstraintLayout constraintLayout = mi().a;
        com.amazon.aps.iva.yb0.j.e(constraintLayout, "binding.root");
        setContentView(constraintLayout);
        w4();
        int color = com.amazon.aps.iva.d3.a.getColor(this, R.color.primary);
        String string = getString(R.string.password_terms);
        com.amazon.aps.iva.yb0.j.e(string, "getString(R.string.password_terms)");
        String string2 = getString(R.string.password_privacy_policy);
        com.amazon.aps.iva.yb0.j.e(string2, "getString(R.string.password_privacy_policy)");
        String string3 = getString(R.string.otp_sign_up_tos, string, string2);
        com.amazon.aps.iva.yb0.j.e(string3, "bindOtpSignUpTos$lambda$4");
        m0.b(color, string3, string);
        m0.b(color, string3, string2);
        TextView textView = mi().f;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.otpSignUpTos");
        SpannableString spannableString = new SpannableString(string3);
        m0.a(spannableString, string, false, new com.amazon.aps.iva.fe.b(this, string));
        m0.a(spannableString, string2, false, new com.amazon.aps.iva.fe.c(this, string2));
        r0.b(textView, spannableString);
        mi().b.setOnClickListener(new com.amazon.aps.iva.fe.a(this, 0));
        mi().h.setTextLayoutListener(new c());
    }

    @Override // com.amazon.aps.iva.fe.p
    public final void q() {
        DataInputButton dataInputButton = mi().b;
        com.amazon.aps.iva.yb0.j.e(dataInputButton, "binding.continueCta");
        dataInputButton.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.fe.i> setupPresenters() {
        return l1.H((com.amazon.aps.iva.fe.i) this.k.e.getValue());
    }

    @Override // com.amazon.aps.iva.fe.p
    public final void ue() {
        unregisterReceiver(this.k.f);
    }

    @Override // com.amazon.aps.iva.fe.p
    public final void w() {
        DataInputButton dataInputButton = mi().b;
        com.amazon.aps.iva.yb0.j.e(dataInputButton, "binding.continueCta");
        dataInputButton.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.fe.p
    public final void w4() {
        String string = getString(R.string.otp_send_again);
        com.amazon.aps.iva.yb0.j.e(string, "getString(R.string.otp_send_again)");
        String string2 = getString(R.string.otp_send_again_format, string);
        com.amazon.aps.iva.yb0.j.e(string2, "getString(R.string.otp_s…again_format, orangePart)");
        TextView textView = mi().e;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.otpResendCode");
        SpannableString spannableString = new SpannableString(m0.b(com.amazon.aps.iva.d3.a.getColor(this, R.color.primary), string2, string));
        m0.a(spannableString, string, false, new d());
        r0.b(textView, spannableString);
    }

    @Override // com.amazon.aps.iva.fe.p
    public final void xh() {
        DataInputButton dataInputButton = mi().b;
        dataInputButton.setText(R.string.opt_continue);
        t0.h(dataInputButton, null, Integer.valueOf(t0.a(R.dimen.cta_button_continue_margin_top, dataInputButton)), null, null, 13);
    }

    @Override // com.amazon.aps.iva.fe.p
    @SuppressLint({"UnspecifiedRegisterReceiverFlag"})
    public final void zf() {
        int i = Build.VERSION.SDK_INT;
        com.amazon.aps.iva.fe.h hVar = this.k;
        if (i >= 34) {
            registerReceiver(hVar.f, new IntentFilter(SmsRetriever.SMS_RETRIEVED_ACTION), 2);
        } else {
            registerReceiver(hVar.f, new IntentFilter(SmsRetriever.SMS_RETRIEVED_ACTION));
        }
        SmsRetriever.getClient((Activity) this).startSmsRetriever();
    }
}
