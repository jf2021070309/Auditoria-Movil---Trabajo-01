package com.ellation.crunchyroll.presentation.multitiersubscription.subscriptionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e30.a;
import com.amazon.aps.iva.v60.j;
import com.amazon.aps.iva.wy.g;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.ui.button.ButtonTextProvider;
import kotlin.Metadata;
/* compiled from: CrPlusSubscriptionButton.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/ellation/crunchyroll/presentation/multitiersubscription/subscriptionbutton/CrPlusSubscriptionButton;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/ellation/crunchyroll/ui/button/ButtonTextProvider;", "Lcom/amazon/aps/iva/v60/j;", "b", "Lcom/amazon/aps/iva/v60/j;", "getBinding", "()Lcom/amazon/aps/iva/v60/j;", "binding", "Landroid/widget/TextView;", "getButtonTextView", "()Landroid/widget/TextView;", "buttonTextView", "multitier-subscription_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public class CrPlusSubscriptionButton extends g implements ButtonTextProvider {
    public final j b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CrPlusSubscriptionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        com.amazon.aps.iva.yb0.j.f(context, "context");
    }

    public final void b1(a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "uiModel");
        j jVar = this.b;
        jVar.b.setCompoundDrawablesRelativeWithIntrinsicBounds(com.amazon.aps.iva.d3.a.getDrawable(getContext(), aVar.a), (Drawable) null, (Drawable) null, (Drawable) null);
        jVar.b.setText(aVar.b);
    }

    public final j getBinding() {
        return this.b;
    }

    @Override // com.ellation.crunchyroll.ui.button.ButtonTextProvider
    public TextView getButtonTextView() {
        TextView textView = this.b.b;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.crPlusSubscriptionButtonTextView");
        return textView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrPlusSubscriptionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        com.amazon.aps.iva.yb0.j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_cr_plus_subscription_button, (ViewGroup) this, false);
        addView(inflate);
        TextView textView = (TextView) z.u(R.id.cr_plus_subscription_button_text_view, inflate);
        if (textView != null) {
            this.b = new j((FrameLayout) inflate, textView);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.u60.a.a, 0, 0);
            com.amazon.aps.iva.yb0.j.e(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
            x.g0(textView, obtainStyledAttributes, 0, R.string.go_premium);
            int resourceId = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId != 0) {
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(com.amazon.aps.iva.d3.a.getDrawable(context, resourceId), (Drawable) null, (Drawable) null, (Drawable) null);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.cr_plus_subscription_button_text_view)));
    }
}
