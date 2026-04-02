package com.crunchyroll.usermigration.terms;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.c8.s;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.io.i;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.xw.m0;
import com.amazon.aps.iva.xw.r0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.usermigration.welcome.UserMigrationWelcomeActivity;
import com.ellation.widgets.input.datainputbutton.DataInputButton;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: AcceptTermsAndPrivacyPolicyActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/crunchyroll/usermigration/terms/AcceptTermsAndPrivacyPolicyActivity;", "Lcom/amazon/aps/iva/i60/b;", "Lcom/amazon/aps/iva/io/i;", "<init>", "()V", "user-migration_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class AcceptTermsAndPrivacyPolicyActivity extends com.amazon.aps.iva.i60.b implements i {
    public static final /* synthetic */ int n = 0;
    public final m k = f.b(new a());
    public final m l = f.b(new b());
    public final com.amazon.aps.iva.xw.a m = com.amazon.aps.iva.xw.b.b(this, new c());

    /* compiled from: AcceptTermsAndPrivacyPolicyActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.p000do.a> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.p000do.a invoke() {
            View inflate = AcceptTermsAndPrivacyPolicyActivity.this.getLayoutInflater().inflate(R.layout.activity_accept_terms_and_privacy_policy, (ViewGroup) null, false);
            int i = R.id.terms_checkbox;
            CheckBox checkBox = (CheckBox) z.u(R.id.terms_checkbox, inflate);
            if (checkBox != null) {
                i = R.id.terms_logo;
                if (((ImageView) z.u(R.id.terms_logo, inflate)) != null) {
                    i = R.id.terms_next_cta;
                    DataInputButton dataInputButton = (DataInputButton) z.u(R.id.terms_next_cta, inflate);
                    if (dataInputButton != null) {
                        i = R.id.terms_title;
                        if (((TextView) z.u(R.id.terms_title, inflate)) != null) {
                            i = R.id.toolbar;
                            if (((Toolbar) z.u(R.id.toolbar, inflate)) != null) {
                                return new com.amazon.aps.iva.p000do.a((ConstraintLayout) inflate, checkBox, dataInputButton);
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        }
    }

    /* compiled from: AcceptTermsAndPrivacyPolicyActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.io.e> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.io.e invoke() {
            int i = com.amazon.aps.iva.io.e.a;
            AcceptTermsAndPrivacyPolicyActivity acceptTermsAndPrivacyPolicyActivity = AcceptTermsAndPrivacyPolicyActivity.this;
            j.f(acceptTermsAndPrivacyPolicyActivity, "activity");
            return new com.amazon.aps.iva.io.f(acceptTermsAndPrivacyPolicyActivity);
        }
    }

    /* compiled from: AcceptTermsAndPrivacyPolicyActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e.m, q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.e.m mVar) {
            j.f(mVar, "$this$onBackPressedCallback");
            int i = AcceptTermsAndPrivacyPolicyActivity.n;
            AcceptTermsAndPrivacyPolicyActivity.this.mi().getPresenter().a();
            return q.a;
        }
    }

    /* compiled from: AcceptTermsAndPrivacyPolicyActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.l<View, q> {
        public final /* synthetic */ CheckBox i;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(CheckBox checkBox, String str) {
            super(1);
            this.i = checkBox;
            this.j = str;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(View view) {
            j.f(view, "it");
            int i = AcceptTermsAndPrivacyPolicyActivity.n;
            com.amazon.aps.iva.mh.j a = AcceptTermsAndPrivacyPolicyActivity.this.mi().a();
            CheckBox checkBox = this.i;
            j.e(checkBox, "invoke");
            a.C1(r.p(checkBox, this.j));
            return q.a;
        }
    }

    /* compiled from: AcceptTermsAndPrivacyPolicyActivity.kt */
    /* loaded from: classes2.dex */
    public static final class e extends l implements com.amazon.aps.iva.xb0.l<View, q> {
        public final /* synthetic */ CheckBox i;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(CheckBox checkBox, String str) {
            super(1);
            this.i = checkBox;
            this.j = str;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(View view) {
            j.f(view, "it");
            int i = AcceptTermsAndPrivacyPolicyActivity.n;
            com.amazon.aps.iva.mh.j a = AcceptTermsAndPrivacyPolicyActivity.this.mi().a();
            CheckBox checkBox = this.i;
            j.e(checkBox, "invoke");
            a.w5(r.p(checkBox, this.j));
            return q.a;
        }
    }

    @Override // com.amazon.aps.iva.io.i
    public final void Rf() {
        ((com.amazon.aps.iva.p000do.a) this.k.getValue()).c.Vb();
    }

    public final com.amazon.aps.iva.io.e mi() {
        return (com.amazon.aps.iva.io.e) this.l.getValue();
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m mVar = this.k;
        ConstraintLayout constraintLayout = ((com.amazon.aps.iva.p000do.a) mVar.getValue()).a;
        j.e(constraintLayout, "binding.root");
        setContentView(constraintLayout);
        com.amazon.aps.iva.p000do.a aVar = (com.amazon.aps.iva.p000do.a) mVar.getValue();
        aVar.c.setOnClickListener(new com.amazon.aps.iva.c8.r(this, 5));
        Toolbar toolbar = this.f;
        j.c(toolbar);
        toolbar.setNavigationOnClickListener(new s(this, 7));
        String string = getString(R.string.migration_terms_clickable_text);
        j.e(string, "getString(R.string.migration_terms_clickable_text)");
        String string2 = getString(R.string.migration_privacy_clickable_text);
        j.e(string2, "getString(R.string.migra…n_privacy_clickable_text)");
        com.amazon.aps.iva.io.d dVar = new com.amazon.aps.iva.io.d(this, 0);
        CheckBox checkBox = aVar.b;
        checkBox.setOnCheckedChangeListener(dVar);
        SpannableString spannableString = new SpannableString(getString(R.string.migration_fun_users_agree_to_terms));
        m0.a(spannableString, string, false, new d(checkBox, string));
        m0.a(spannableString, string2, false, new e(checkBox, string2));
        r0.b(checkBox, spannableString);
        getOnBackPressedDispatcher().a(this, this.m);
    }

    @Override // com.amazon.aps.iva.io.i
    public final void s5() {
        ((com.amazon.aps.iva.p000do.a) this.k.getValue()).c.Nf();
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.I(mi().getPresenter(), mi().a());
    }

    @Override // com.amazon.aps.iva.io.i
    public final void vb() {
        UserMigrationWelcomeActivity.n.getClass();
        Intent intent = new Intent(this, UserMigrationWelcomeActivity.class);
        intent.putExtra("show_steps_title", false);
        startActivity(intent);
    }
}
