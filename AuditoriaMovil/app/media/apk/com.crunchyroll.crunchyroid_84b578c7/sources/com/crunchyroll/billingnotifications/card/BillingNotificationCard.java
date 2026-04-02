package com.crunchyroll.billingnotifications.card;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.f3.f;
import com.amazon.aps.iva.k50.m;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.t50.c;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xw.m0;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.billingnotifications.card.c;
import com.crunchyroll.crunchyroid.R;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: BillingNotificationCard.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/crunchyroll/billingnotifications/card/BillingNotificationCard;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/oe/c;", "billing-notifications_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BillingNotificationCard extends g implements com.amazon.aps.iva.oe.c {
    public static final /* synthetic */ int e = 0;
    public final b b;
    public final com.amazon.aps.iva.pe.d c;
    public l<? super Boolean, q> d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BillingNotificationCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    @Override // com.amazon.aps.iva.oe.c
    public final void Df(c cVar) {
        c.f a = cVar.a();
        j.d(a, "null cannot be cast to non-null type com.crunchyroll.billingnotifications.card.BillingNotificationCardUiModel.MonthsWithDays");
        c.e eVar = (c.e) a;
        Resources resources = getResources();
        long j = eVar.g;
        String quantityString = resources.getQuantityString(eVar.h, (int) j, Long.valueOf(j));
        j.e(quantityString, "resources.getQuantityStr…el.numberOfDays\n        )");
        Resources resources2 = getResources();
        long j2 = eVar.f;
        int i = (int) j2;
        String quantityString2 = resources2.getQuantityString(eVar.d, i, Long.valueOf(j2), quantityString);
        j.e(quantityString2, "resources.getQuantityStr…   daysAppendix\n        )");
        String quantityString3 = getResources().getQuantityString(eVar.e, i, Long.valueOf(j2), quantityString);
        j.e(quantityString3, "resources.getQuantityStr…   daysAppendix\n        )");
        b1(cVar.a, quantityString3, quantityString2);
        com.amazon.aps.iva.pe.d dVar = this.c;
        ((TextView) dVar.d).setText(cVar.b);
        ((ImageView) dVar.c).setImageDrawable(com.amazon.aps.iva.d3.a.getDrawable(getContext(), cVar.c));
    }

    @Override // com.amazon.aps.iva.oe.c
    public final void L3(c cVar) {
        c.f a = cVar.a();
        boolean z = a instanceof c.b;
        int i = cVar.a;
        if (z) {
            String string = getResources().getString(a.a());
            j.e(string, "resources.getString(timeLeftUiModel.textToInsert)");
            String string2 = getResources().getString(a.b());
            j.e(string2, "resources.getString(time…ftUiModel.textToStylized)");
            b1(i, string, string2);
        } else if (a instanceof c.g) {
            long c = ((c.g) a).c();
            int i2 = (int) c;
            String quantityString = getResources().getQuantityString(a.b(), i2, Long.valueOf(c));
            j.e(quantityString, "resources.getQuantityStr…     number\n            )");
            String quantityString2 = getResources().getQuantityString(a.a(), i2, Long.valueOf(c));
            j.e(quantityString2, "resources.getQuantityStr…     number\n            )");
            b1(i, quantityString2, quantityString);
        }
        com.amazon.aps.iva.pe.d dVar = this.c;
        ((TextView) dVar.d).setText(cVar.b);
        ((ImageView) dVar.c).setImageDrawable(com.amazon.aps.iva.d3.a.getDrawable(getContext(), cVar.c));
    }

    public final void b1(int i, String str, String str2) {
        CharSequence charSequence;
        TextView textView = (TextView) this.c.e;
        String string = getContext().getString(i, str);
        Typeface a = f.a(R.font.lato_heavy, getContext());
        if (a != null) {
            j.e(string, "text");
            charSequence = m0.e(string, str2, com.amazon.aps.iva.d3.a.getColor(getContext(), R.color.color_white), a);
        } else {
            j.e(string, "text");
            charSequence = string;
        }
        textView.setText(charSequence);
    }

    @Override // com.amazon.aps.iva.oe.c
    public final void hide() {
        ConstraintLayout a = this.c.a();
        j.e(a, "binding.root");
        a.setVisibility(8);
        l<? super Boolean, q> lVar = this.d;
        if (lVar != null) {
            lVar.invoke(Boolean.FALSE);
        }
    }

    @Override // com.amazon.aps.iva.wy.g, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((TextView) this.c.d).setOnClickListener(new com.amazon.aps.iva.c8.j(this, 1));
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H(this.b);
    }

    @Override // com.amazon.aps.iva.oe.c
    public final void show() {
        ConstraintLayout a = this.c.a();
        j.e(a, "binding.root");
        a.setVisibility(0);
        l<? super Boolean, q> lVar = this.d;
        if (lVar != null) {
            lVar.invoke(Boolean.TRUE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingNotificationCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
        com.amazon.aps.iva.me.b bVar = com.amazon.aps.iva.a60.b.b;
        if (bVar != null) {
            com.amazon.aps.iva.me.j e2 = bVar.e();
            j.f(e2, "experiment");
            com.amazon.aps.iva.oe.b bVar2 = new com.amazon.aps.iva.oe.b(e2);
            com.amazon.aps.iva.me.c cVar2 = com.amazon.aps.iva.a60.b.c;
            if (cVar2 != null) {
                com.amazon.aps.iva.ve.e f = cVar2.f();
                com.amazon.aps.iva.me.b bVar3 = com.amazon.aps.iva.a60.b.b;
                if (bVar3 != null) {
                    com.amazon.aps.iva.me.j e3 = bVar3.e();
                    m mVar = new m(context);
                    com.amazon.aps.iva.we.b bVar4 = new com.amazon.aps.iva.we.b();
                    c.b bVar5 = c.b.a;
                    j.f(f, "billingStatusStorage");
                    j.f(e3, "billingNotificationsConfig");
                    this.b = new b(e3, bVar2, this, f, bVar4, mVar, bVar5);
                    View inflate = LayoutInflater.from(context).inflate(R.layout.layout_billing_notification_card, (ViewGroup) this, false);
                    addView(inflate);
                    int i2 = R.id.billing_card_cta;
                    TextView textView = (TextView) z.u(R.id.billing_card_cta, inflate);
                    if (textView != null) {
                        i2 = R.id.billing_card_icon;
                        ImageView imageView = (ImageView) z.u(R.id.billing_card_icon, inflate);
                        if (imageView != null) {
                            i2 = R.id.billing_card_title;
                            TextView textView2 = (TextView) z.u(R.id.billing_card_title, inflate);
                            if (textView2 != null) {
                                this.c = new com.amazon.aps.iva.pe.d((ConstraintLayout) inflate, textView, imageView, textView2);
                                return;
                            }
                        }
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                }
                j.m("dependencies");
                throw null;
            }
            j.m("instance");
            throw null;
        }
        j.m("dependencies");
        throw null;
    }
}
