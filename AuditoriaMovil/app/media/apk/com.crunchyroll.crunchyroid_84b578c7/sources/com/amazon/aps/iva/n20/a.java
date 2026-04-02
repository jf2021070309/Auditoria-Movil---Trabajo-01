package com.amazon.aps.iva.n20;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.v60.m;
import com.amazon.aps.iva.xw.q;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.List;
import java.util.Locale;
import java.util.Set;
/* compiled from: UpsellTierLayout.kt */
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.wy.g implements g {
    public final m b;
    public final d c;
    public final FrameLayout d;
    public final ConstraintLayout e;
    public final TextView f;

    public a(Context context) {
        super(context, null, 0, 6, null);
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_upsell_tier_item, (ViewGroup) this, false);
        addView(inflate);
        int i = R.id.tier_billing_period;
        TextView textView = (TextView) z.u(R.id.tier_billing_period, inflate);
        if (textView != null) {
            z.u(R.id.tier_details_divider, inflate);
            i = R.id.tier_header_image;
            ImageView imageView = (ImageView) z.u(R.id.tier_header_image, inflate);
            if (imageView != null) {
                i = R.id.tier_label;
                TextView textView2 = (TextView) z.u(R.id.tier_label, inflate);
                if (textView2 != null) {
                    i = R.id.tier_label_middle;
                    if (z.u(R.id.tier_label_middle, inflate) != null) {
                        i = R.id.tier_perks;
                        LinearLayout linearLayout = (LinearLayout) z.u(R.id.tier_perks, inflate);
                        if (linearLayout != null) {
                            i = R.id.tier_price;
                            TextView textView3 = (TextView) z.u(R.id.tier_price, inflate);
                            if (textView3 != null) {
                                i = R.id.tier_price_subtitle;
                                TextView textView4 = (TextView) z.u(R.id.tier_price_subtitle, inflate);
                                if (textView4 != null) {
                                    i = R.id.tier_title;
                                    TextView textView5 = (TextView) z.u(R.id.tier_title, inflate);
                                    if (textView5 != null) {
                                        i = R.id.upsell_tier_item_container;
                                        FrameLayout frameLayout = (FrameLayout) z.u(R.id.upsell_tier_item_container, inflate);
                                        if (frameLayout != null) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) z.u(R.id.upsell_tier_item_content, inflate);
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) z.u(R.id.upsell_tier_item_content, inflate);
                                            this.b = new m((ConstraintLayout) inflate, textView, imageView, textView2, linearLayout, textView3, textView4, textView5, frameLayout, constraintLayout);
                                            this.c = new d(this, k.n(context).c());
                                            this.d = frameLayout;
                                            j.d(constraintLayout, "null cannot be cast to non-null type android.view.View");
                                            this.e = constraintLayout;
                                            this.f = textView2;
                                            return;
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

    @Override // com.amazon.aps.iva.n20.g
    public final void Ab(int i, com.amazon.aps.iva.ss.b bVar) {
        String string;
        j.f(bVar, "billingPeriod");
        int i2 = bVar.b * i;
        String quantityString = getResources().getQuantityString(com.amazon.aps.iva.c30.b.a(bVar), i2, Integer.valueOf(i2));
        j.e(quantityString, "resources.getQuantityStr…ount, count\n            )");
        if (i > 1) {
            string = getResources().getString(R.string.upsell_tier_offer_price_title_recurrent, getResources().getString(bVar.c.getResId()), quantityString);
            j.e(string, "{\n            resources.…t\n            )\n        }");
        } else {
            string = getResources().getString(R.string.upsell_tier_offer_price_title, quantityString);
            j.e(string, "{\n            resources.…le, periodText)\n        }");
        }
        this.b.b.setText(string);
    }

    @Override // com.amazon.aps.iva.n20.g
    public final void Ac() {
        TextView textView = this.b.g;
        j.e(textView, "binding.tierPriceSubtitle");
        textView.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.n20.g
    public final void F6(int i, com.amazon.aps.iva.ss.b bVar) {
        j.f(bVar, "billingPeriod");
        int i2 = i * bVar.b;
        String quantityString = getResources().getQuantityString(com.amazon.aps.iva.c30.b.a(bVar), i2, Integer.valueOf(i2));
        j.e(quantityString, "resources.getQuantityStr…odPlural(), count, count)");
        String quantityString2 = getResources().getQuantityString(R.plurals.upsell_tier_promo_offer_label, i2, quantityString);
        j.e(quantityString2, "resources.getQuantityStr…label, count, periodText)");
        this.b.d.setText(quantityString2);
    }

    @Override // com.amazon.aps.iva.n20.g
    public final void I4(int i, com.amazon.aps.iva.ss.b bVar) {
        j.f(bVar, "billingPeriod");
        int i2 = i * bVar.b;
        String quantityString = getResources().getQuantityString(com.amazon.aps.iva.c30.b.a(bVar), i2, Integer.valueOf(i2));
        j.e(quantityString, "resources.getQuantityStr…odPlural(), count, count)");
        String quantityString2 = getResources().getQuantityString(R.plurals.upsell_tier_extended_free_trial_offer_label, i2, quantityString);
        j.e(quantityString2, "resources.getQuantityStr… periodText\n            )");
        this.b.d.setText(quantityString2);
    }

    @Override // com.amazon.aps.iva.n20.g
    public final void M4() {
        TextView textView = this.b.g;
        j.e(textView, "binding.tierPriceSubtitle");
        textView.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.n20.g
    public final void O8() {
        this.b.e.removeAllViews();
    }

    @Override // com.amazon.aps.iva.n20.g
    public final void Og() {
        this.b.b.setText(getResources().getString(R.string.upsell_tier_price_month));
    }

    @Override // com.amazon.aps.iva.n20.g
    public final void W6(int i, int i2, com.amazon.aps.iva.ss.b bVar) {
        j.f(bVar, "billingPeriod");
        int i3 = i2 * bVar.b;
        String quantityString = getResources().getQuantityString(com.amazon.aps.iva.c30.b.a(bVar), i3, Integer.valueOf(i3));
        j.e(quantityString, "resources.getQuantityStr…odPlural(), count, count)");
        Resources resources = getResources();
        String string = resources.getString(R.string.upsell_tier_offer_price_label, i + "%", quantityString);
        j.e(string, "resources.getString(R.st…\"$discount%\", periodText)");
        this.b.d.setText(string);
    }

    @Override // com.amazon.aps.iva.n20.g
    public final void bh() {
        ViewGroup.LayoutParams layoutParams = this.b.a.getLayoutParams();
        Context context = getContext();
        j.e(context, "context");
        layoutParams.width = q.e(context) - (getContext().getResources().getDimensionPixelSize(R.dimen.tier_horizontal_spacing) * 2);
    }

    public final TextView getBadge() {
        return this.f;
    }

    public final View getItemContainer() {
        return this.d;
    }

    public final View getItemContent() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.n20.g
    public final void mb() {
        TextView textView = this.b.d;
        j.e(textView, "binding.tierLabel");
        textView.setVisibility(4);
    }

    @Override // com.amazon.aps.iva.n20.g
    public final void ra() {
        this.b.b.setText(getResources().getString(R.string.upsell_tier_price_year));
    }

    @Override // com.amazon.aps.iva.n20.g
    public void setHeaderImage(int i) {
        this.b.c.setImageResource(i);
    }

    @Override // com.amazon.aps.iva.n20.g
    public void setPerks(List<com.amazon.aps.iva.o20.c> list) {
        j.f(list, "perks");
        for (com.amazon.aps.iva.o20.c cVar : list) {
            LinearLayout linearLayout = this.b.e;
            Context context = getContext();
            j.e(context, "context");
            linearLayout.addView(new com.amazon.aps.iva.o20.a(context, cVar));
        }
    }

    @Override // com.amazon.aps.iva.n20.g
    public void setPrice(String str) {
        j.f(str, FirebaseAnalytics.Param.PRICE);
        this.b.f.setText(str);
    }

    @Override // com.amazon.aps.iva.n20.g
    public void setTierLabel(int i) {
        this.b.d.setText(i);
    }

    @Override // com.amazon.aps.iva.n20.g
    public void setTitle(String str) {
        j.f(str, "title");
        this.b.h.setText(str);
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H(this.c);
    }

    @Override // com.amazon.aps.iva.n20.g
    public final void u8() {
        TextView textView = this.b.d;
        j.e(textView, "binding.tierLabel");
        textView.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.n20.g
    public final void xa(String str) {
        j.f(str, "currencyCode");
        Currency currency = Currency.getInstance(str);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.US);
        currencyInstance.setCurrency(currency);
        this.b.f.setText(currencyInstance.format(0.0d));
    }

    @Override // com.amazon.aps.iva.n20.g
    public final void xc(String str, int i, com.amazon.aps.iva.ss.b bVar) {
        j.f(str, FirebaseAnalytics.Param.PRICE);
        j.f(bVar, "billingPeriod");
        int i2 = i * bVar.b;
        String quantityString = getResources().getQuantityString(com.amazon.aps.iva.c30.b.a(bVar), i2, Integer.valueOf(i2));
        j.e(quantityString, "resources.getQuantityStr…ount, count\n            )");
        String string = getResources().getString(R.string.upsell_tier_offer_price_subtitle, str, quantityString);
        j.e(string, "resources.getString(R.st…title, price, periodText)");
        this.b.g.setText(string);
    }
}
