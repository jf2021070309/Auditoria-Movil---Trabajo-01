package com.ellation.crunchyroll.presentation.multitiersubscription.alternativeflow;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.d30.d;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.h20.f;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.p000do.e;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.xw.m0;
import com.amazon.aps.iva.xw.r0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* compiled from: CrPlusAlternativeFlowLayout.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/ellation/crunchyroll/presentation/multitiersubscription/alternativeflow/SubscriptionAlternativeFlowLayout;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/h20/f;", "Landroid/util/AttributeSet;", "b", "Landroid/util/AttributeSet;", "getAttrs", "()Landroid/util/AttributeSet;", "attrs", "multitier-subscription_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SubscriptionAlternativeFlowLayout extends g implements f {
    public static final /* synthetic */ int f = 0;
    public final AttributeSet b;
    public final e c;
    public final String d;
    public com.amazon.aps.iva.h20.g e;

    /* compiled from: CrPlusAlternativeFlowLayout.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<View, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(View view) {
            j.f(view, "it");
            com.amazon.aps.iva.h20.g gVar = SubscriptionAlternativeFlowLayout.this.e;
            if (gVar != null) {
                gVar.X();
                return q.a;
            }
            j.m("presenter");
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubscriptionAlternativeFlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    @Override // com.amazon.aps.iva.h20.f
    public final void D3() {
        setVisibility(8);
    }

    @Override // com.amazon.aps.iva.h20.f
    public final void Wf() {
        setVisibility(0);
    }

    public final void b1(d dVar, com.amazon.aps.iva.h20.e eVar) {
        j.f(dVar, "productsViewModel");
        j.f(eVar, "alternativeFlowRouter");
        Context context = getContext();
        j.e(context, "context");
        com.amazon.aps.iva.h20.d dVar2 = new com.amazon.aps.iva.h20.d(this, dVar, k.n(context), eVar);
        com.ellation.crunchyroll.mvp.lifecycle.a.b(dVar2, this);
        this.e = dVar2;
        ((ImageView) this.c.d).setOnClickListener(new com.amazon.aps.iva.c8.j(this, 15));
    }

    public final AttributeSet getAttrs() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.h20.f
    public final void j5() {
        try {
            getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getContext().getString(R.string.cr_plus_alternative_flow_message_link))));
        } catch (ActivityNotFoundException e) {
            com.amazon.aps.iva.mf0.a.a.d(e);
        }
    }

    @Override // com.amazon.aps.iva.h20.f
    public final void lg() {
        this.c.b.setText(getContext().getString(R.string.cr_plus_alternative_flow_message, this.d));
    }

    @Override // com.amazon.aps.iva.h20.f
    public final void sf() {
        TextView textView = this.c.b;
        j.e(textView, "binding.crPlusAlternativeMessage");
        Context context = getContext();
        String str = this.d;
        String string = context.getString(R.string.cr_plus_alternative_flow_message, str);
        j.e(string, "context.getString(\n     …inkText\n                )");
        Context context2 = getContext();
        j.e(context2, "context");
        SpannableString spannableString = new SpannableString(m0.b(com.amazon.aps.iva.d3.a.getColor(context2, R.color.primary), string, str));
        m0.a(spannableString, str, false, new a());
        r0.b(textView, spannableString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionAlternativeFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.b = attributeSet;
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_subscription_alternative_flow, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.cr_plus_alternative_close_button;
        ImageView imageView = (ImageView) z.u(R.id.cr_plus_alternative_close_button, inflate);
        if (imageView != null) {
            i2 = R.id.cr_plus_alternative_hime_image;
            ImageView imageView2 = (ImageView) z.u(R.id.cr_plus_alternative_hime_image, inflate);
            if (imageView2 != null) {
                i2 = R.id.cr_plus_alternative_message;
                TextView textView = (TextView) z.u(R.id.cr_plus_alternative_message, inflate);
                if (textView != null) {
                    i2 = R.id.cr_plus_alternative_title;
                    if (((TextView) z.u(R.id.cr_plus_alternative_title, inflate)) != null) {
                        this.c = new e(imageView, imageView2, textView, (ConstraintLayout) inflate);
                        String string = context.getString(R.string.cr_plus_alternative_flow_message_link_text);
                        j.e(string, "context.getString(R.stri…e_flow_message_link_text)");
                        this.d = string;
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
