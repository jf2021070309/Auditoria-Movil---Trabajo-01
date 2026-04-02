package com.crunchyroll.emailverification.banner;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.c8.s;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.u70.i;
import com.amazon.aps.iva.xw.q;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.yg.c;
import com.amazon.aps.iva.yg.d;
import com.amazon.aps.iva.zg.e;
import com.amazon.aps.iva.zg.f;
import com.amazon.aps.iva.zg.g;
import com.amazon.aps.iva.zg.k;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.ui.animation.AnimationUtil;
import kotlin.Metadata;
/* compiled from: EmailVerificationBannerLayout.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002R\u001b\u0010\b\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/crunchyroll/emailverification/banner/EmailVerificationBannerLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/amazon/aps/iva/zg/k;", "Lcom/amazon/aps/iva/zg/f;", "b", "Lcom/amazon/aps/iva/kb0/e;", "getPresenter", "()Lcom/amazon/aps/iva/zg/f;", "presenter", "Landroidx/lifecycle/g;", "getLifecycle", "()Landroidx/lifecycle/g;", "lifecycle", "account-pending-state_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class EmailVerificationBannerLayout extends ConstraintLayout implements k {
    public final m b;
    public final com.amazon.aps.iva.ah.a c;

    /* compiled from: EmailVerificationBannerLayout.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<f> {
        public final /* synthetic */ Context i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.i = context;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final f invoke() {
            e eVar = c.a.a;
            if (eVar != null) {
                d dVar = c.a.b;
                if (dVar != null) {
                    com.amazon.aps.iva.xb0.l<Activity, Boolean> d = dVar.d();
                    Context context = this.i;
                    Activity a = q.a(context);
                    j.c(a);
                    boolean booleanValue = d.invoke(a).booleanValue();
                    j.d(context, "null cannot be cast to non-null type com.ellation.crunchyroll.analytics.AnalyticsScreenProvider");
                    com.amazon.aps.iva.yg.f fVar = new com.amazon.aps.iva.yg.f((com.amazon.aps.iva.us.a) context, com.amazon.aps.iva.ds.c.b);
                    EmailVerificationBannerLayout emailVerificationBannerLayout = EmailVerificationBannerLayout.this;
                    j.f(emailVerificationBannerLayout, "view");
                    return new g(emailVerificationBannerLayout, eVar, booleanValue, fVar);
                }
                j.m("dependencies");
                throw null;
            }
            j.m("emailVerificationBannerHandler");
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmailVerificationBannerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    public static void G(EmailVerificationBannerLayout emailVerificationBannerLayout, View view) {
        j.f(emailVerificationBannerLayout, "this$0");
        f presenter = emailVerificationBannerLayout.getPresenter();
        j.e(view, "it");
        presenter.j5(r.p(view, null));
    }

    public static void b1(EmailVerificationBannerLayout emailVerificationBannerLayout) {
        j.f(emailVerificationBannerLayout, "this$0");
        emailVerificationBannerLayout.getPresenter().T1();
    }

    private final f getPresenter() {
        return (f) this.b.getValue();
    }

    @Override // com.amazon.aps.iva.zg.k
    public final void H2(com.amazon.aps.iva.zg.j jVar) {
        j.f(jVar, "model");
        com.amazon.aps.iva.ah.a aVar = this.c;
        ((TextView) aVar.f).setText(jVar.a);
        ((TextView) aVar.e).setText(jVar.b);
        ((TextView) aVar.c).setText(jVar.c);
    }

    @Override // com.amazon.aps.iva.zg.k
    public final void O3() {
        TextView textView = (TextView) this.c.d;
        j.e(textView, "binding.emailVerificationBannerDismissButton");
        textView.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.zg.k
    public final void Pe() {
        AnimationUtil animationUtil = AnimationUtil.INSTANCE;
        ConstraintLayout a2 = this.c.a();
        j.e(a2, "binding.root");
        animationUtil.slideDown(a2, t0.a(R.dimen.email_verification_banner_height, this));
    }

    @Override // com.amazon.aps.iva.i5.o
    public androidx.lifecycle.g getLifecycle() {
        return t0.d(this).getLifecycle();
    }

    @Override // com.amazon.aps.iva.zg.k
    public final void hide() {
        ConstraintLayout a2 = this.c.a();
        j.e(a2, "binding.root");
        a2.setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.ellation.crunchyroll.mvp.lifecycle.a.a(getPresenter(), this);
        com.amazon.aps.iva.ah.a aVar = this.c;
        ((TextView) aVar.c).setOnClickListener(new s(this, 5));
        ((TextView) aVar.d).setOnClickListener(new com.amazon.aps.iva.c8.e(this, 2));
    }

    @Override // com.amazon.aps.iva.zg.k
    public final void pb() {
        AnimationUtil animationUtil = AnimationUtil.INSTANCE;
        ConstraintLayout a2 = this.c.a();
        j.e(a2, "binding.root");
        animationUtil.slideUp(a2);
    }

    @Override // com.amazon.aps.iva.zg.k
    public final void show() {
        ConstraintLayout a2 = this.c.a();
        j.e(a2, "binding.root");
        a2.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.zg.k
    public final void showSnackbar(i iVar) {
        j.f(iVar, "message");
        Context context = getContext();
        j.d(context, "null cannot be cast to non-null type com.ellation.widgets.snackbar.SnackbarMessageView");
        ((com.amazon.aps.iva.u70.j) context).showSnackbar(iVar);
    }

    @Override // com.amazon.aps.iva.zg.k
    public final void w5() {
        TextView textView = (TextView) this.c.d;
        j.e(textView, "binding.emailVerificationBannerDismissButton");
        textView.setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailVerificationBannerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.b = com.amazon.aps.iva.kb0.f.b(new a(context));
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_email_verification_banner, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.buttons_container;
        View u = z.u(R.id.buttons_container, inflate);
        if (u != null) {
            i2 = R.id.email_verification_banner_confirmation_button;
            TextView textView = (TextView) z.u(R.id.email_verification_banner_confirmation_button, inflate);
            if (textView != null) {
                i2 = R.id.email_verification_banner_dismiss_button;
                TextView textView2 = (TextView) z.u(R.id.email_verification_banner_dismiss_button, inflate);
                if (textView2 != null) {
                    i2 = R.id.email_verification_banner_space;
                    Space space = (Space) z.u(R.id.email_verification_banner_space, inflate);
                    if (space != null) {
                        i2 = R.id.email_verification_banner_subtitle;
                        TextView textView3 = (TextView) z.u(R.id.email_verification_banner_subtitle, inflate);
                        if (textView3 != null) {
                            i2 = R.id.email_verification_banner_title;
                            TextView textView4 = (TextView) z.u(R.id.email_verification_banner_title, inflate);
                            if (textView4 != null) {
                                this.c = new com.amazon.aps.iva.ah.a((ConstraintLayout) inflate, u, textView, textView2, space, textView3, textView4, (Flow) z.u(R.id.flow, inflate));
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
