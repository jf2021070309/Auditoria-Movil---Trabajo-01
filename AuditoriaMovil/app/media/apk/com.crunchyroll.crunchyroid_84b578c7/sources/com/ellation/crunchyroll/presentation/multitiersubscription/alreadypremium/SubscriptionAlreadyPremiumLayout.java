package com.ellation.crunchyroll.presentation.multitiersubscription.alreadypremium;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.f20.i;
import com.amazon.aps.iva.g20.b;
import com.amazon.aps.iva.g20.c;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.v60.l;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.account.model.ProfileApiModel;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: SubscriptionAlreadyPremiumLayout.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/ellation/crunchyroll/presentation/multitiersubscription/alreadypremium/SubscriptionAlreadyPremiumLayout;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/g20/c;", "", "username", "Lcom/amazon/aps/iva/kb0/q;", "setTitleWithUsername", "Landroid/util/AttributeSet;", "b", "Landroid/util/AttributeSet;", "getAttrs", "()Landroid/util/AttributeSet;", "attrs", "Lcom/amazon/aps/iva/g20/a;", "c", "Lcom/amazon/aps/iva/kb0/e;", "getPresenter", "()Lcom/amazon/aps/iva/g20/a;", "presenter", "multitier-subscription_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SubscriptionAlreadyPremiumLayout extends g implements c {
    public final AttributeSet b;
    public final m c;
    public final l d;

    /* compiled from: SubscriptionAlreadyPremiumLayout.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.g20.a> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.g20.a invoke() {
            i iVar = i.a.a;
            String str = null;
            if (iVar != null) {
                ProfileApiModel j0 = iVar.d().invoke().j0();
                if (j0 != null) {
                    str = j0.getUsername();
                }
                SubscriptionAlreadyPremiumLayout subscriptionAlreadyPremiumLayout = SubscriptionAlreadyPremiumLayout.this;
                j.f(subscriptionAlreadyPremiumLayout, "view");
                return new b(subscriptionAlreadyPremiumLayout, str);
            }
            j.m("dependencies");
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubscriptionAlreadyPremiumLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    public static void b1(SubscriptionAlreadyPremiumLayout subscriptionAlreadyPremiumLayout) {
        j.f(subscriptionAlreadyPremiumLayout, "this$0");
        subscriptionAlreadyPremiumLayout.getPresenter().e();
    }

    private final com.amazon.aps.iva.g20.a getPresenter() {
        return (com.amazon.aps.iva.g20.a) this.c.getValue();
    }

    @Override // com.amazon.aps.iva.g20.c
    public final void M0() {
        Context context = getContext();
        j.d(context, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.multitiersubscription.closeablescreen.CrPlusCloseableScreenView");
        ((com.amazon.aps.iva.p20.a) context).M0();
    }

    public final AttributeSet getAttrs() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.g20.c
    public final void q7() {
        this.d.b.setText(getContext().getString(R.string.dialog_cr_plus_already_premium_default_title));
    }

    @Override // com.amazon.aps.iva.g20.c
    public void setTitleWithUsername(String str) {
        j.f(str, "username");
        this.d.b.setText(getContext().getString(R.string.dialog_cr_plus_already_premium_title_format, str));
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H(getPresenter());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionAlreadyPremiumLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.b = attributeSet;
        this.c = f.b(new a());
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_subscription_already_premium, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.cr_plus_already_premium_close_button;
        ImageView imageView = (ImageView) z.u(R.id.cr_plus_already_premium_close_button, inflate);
        if (imageView != null) {
            i2 = R.id.cr_plus_already_premium_subtitle;
            if (((TextView) z.u(R.id.cr_plus_already_premium_subtitle, inflate)) != null) {
                i2 = R.id.cr_plus_already_premium_title;
                TextView textView = (TextView) z.u(R.id.cr_plus_already_premium_title, inflate);
                if (textView != null) {
                    i2 = R.id.cr_plus_alternative_hime_image;
                    if (((ImageView) z.u(R.id.cr_plus_alternative_hime_image, inflate)) != null) {
                        this.d = new l(imageView, textView, (ConstraintLayout) inflate);
                        imageView.setOnClickListener(new com.amazon.aps.iva.fe.a(this, 13));
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
