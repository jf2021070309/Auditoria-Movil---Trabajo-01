package com.ellation.crunchyroll.presentation.multitiersubscription.manage.cta;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.f20.i;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.rs.q;
import com.amazon.aps.iva.u20.b;
import com.amazon.aps.iva.u20.c;
import com.amazon.aps.iva.u20.d;
import com.amazon.aps.iva.v60.k;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.ui.button.ButtonTextProvider;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: ManageMembershipCtaButton.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J \u0010\t\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004R\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/ellation/crunchyroll/presentation/multitiersubscription/manage/cta/ManageMembershipCtaButton;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/ellation/crunchyroll/ui/button/ButtonTextProvider;", "Lcom/amazon/aps/iva/u20/d;", "Lkotlin/Function2;", "Lcom/amazon/aps/iva/u20/c;", "Lcom/amazon/aps/iva/fs/b;", "Lcom/amazon/aps/iva/kb0/q;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnClickListener", "Lcom/amazon/aps/iva/u20/a;", "c", "Lcom/amazon/aps/iva/kb0/e;", "getPresenter", "()Lcom/amazon/aps/iva/u20/a;", "presenter", "Landroid/widget/TextView;", "getButtonTextView", "()Landroid/widget/TextView;", "buttonTextView", "multitier-subscription_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ManageMembershipCtaButton extends g implements ButtonTextProvider, d {
    public static final /* synthetic */ int e = 0;
    public final k b;
    public final m c;
    public c d;

    /* compiled from: ManageMembershipCtaButton.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.u20.a> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.u20.a invoke() {
            i iVar = i.a.a;
            if (iVar != null) {
                q invoke = iVar.f().invoke();
                ManageMembershipCtaButton manageMembershipCtaButton = ManageMembershipCtaButton.this;
                j.f(manageMembershipCtaButton, "view");
                j.f(invoke, "billingStatusProvider");
                return new b(manageMembershipCtaButton, invoke);
            }
            j.m("dependencies");
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ManageMembershipCtaButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    private final com.amazon.aps.iva.u20.a getPresenter() {
        return (com.amazon.aps.iva.u20.a) this.c.getValue();
    }

    @Override // com.amazon.aps.iva.u20.d
    public final void Aa() {
        this.d = c.CANCEL;
        getButtonTextView().setText(R.string.manage_membership_cancel_subscription);
        getButtonTextView().setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        getButtonTextView().setTextColor(com.amazon.aps.iva.d3.a.getColor(getContext(), R.color.color_white));
        this.b.a.setBackgroundColor(com.amazon.aps.iva.d3.a.getColor(getContext(), R.color.transparent));
    }

    @Override // com.amazon.aps.iva.u20.d
    public final void H7(String str) {
        j.f(str, "selectedSku");
        this.d = c.UPGRADE;
        getButtonTextView().setText(R.string.manage_membership_upgrade_subscription);
        getButtonTextView().setCompoundDrawablesRelativeWithIntrinsicBounds(com.amazon.aps.iva.d3.a.getDrawable(getContext(), w.x(str)), (Drawable) null, (Drawable) null, (Drawable) null);
        getButtonTextView().setTextColor(com.amazon.aps.iva.d3.a.getColor(getContext(), R.color.cr_black_pearl));
        this.b.a.setBackgroundColor(com.amazon.aps.iva.d3.a.getColor(getContext(), R.color.cr_honey_gold));
    }

    @Override // com.amazon.aps.iva.u20.d
    public final void Ya() {
        this.d = c.RENEW;
        getButtonTextView().setText(R.string.manage_membership_renew_subscription);
        getButtonTextView().setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        getButtonTextView().setTextColor(com.amazon.aps.iva.d3.a.getColor(getContext(), R.color.primary));
        this.b.a.setBackgroundColor(com.amazon.aps.iva.d3.a.getColor(getContext(), R.color.transparent));
    }

    public final void b1(String str, String str2) {
        j.f(str, "selectedSku");
        j.f(str2, "activeSubscriptionSku");
        getPresenter().M1(str, str2);
    }

    @Override // com.amazon.aps.iva.u20.d
    public final void g9() {
        setVisibility(0);
    }

    @Override // com.ellation.crunchyroll.ui.button.ButtonTextProvider
    public TextView getButtonTextView() {
        TextView textView = this.b.b;
        j.e(textView, "binding.manageMembershipButtonTextView");
        return textView;
    }

    @Override // com.amazon.aps.iva.u20.d
    public final void p1() {
        setVisibility(8);
    }

    public final void setOnClickListener(p<? super c, ? super com.amazon.aps.iva.fs.b, com.amazon.aps.iva.kb0.q> pVar) {
        j.f(pVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.b.a.setOnClickListener(new com.amazon.aps.iva.dc.a(1, pVar, this));
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.u20.a> setupPresenters() {
        return l1.H(getPresenter());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManageMembershipCtaButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_manage_membership_cta_button, (ViewGroup) this, false);
        addView(inflate);
        TextView textView = (TextView) z.u(R.id.manage_membership_button_text_view, inflate);
        if (textView != null) {
            this.b = new k((FrameLayout) inflate, textView);
            this.c = f.b(new a());
            return;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.manage_membership_button_text_view)));
    }
}
