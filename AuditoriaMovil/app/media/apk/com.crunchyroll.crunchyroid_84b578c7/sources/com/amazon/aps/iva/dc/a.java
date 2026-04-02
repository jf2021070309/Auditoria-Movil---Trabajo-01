package com.amazon.aps.iva.dc;

import android.view.View;
import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.braze.models.cards.BannerImageCard;
import com.braze.ui.widget.BannerImageCardView;
import com.ellation.crunchyroll.presentation.multitiersubscription.manage.cta.ManageMembershipCtaButton;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                BannerImageCardView.c((BannerImageCardView) obj2, (BannerImageCard) obj, view);
                return;
            default:
                p pVar = (p) obj2;
                ManageMembershipCtaButton manageMembershipCtaButton = (ManageMembershipCtaButton) obj;
                int i2 = ManageMembershipCtaButton.e;
                j.f(pVar, "$listener");
                j.f(manageMembershipCtaButton, "this$0");
                com.amazon.aps.iva.u20.c cVar = manageMembershipCtaButton.d;
                if (cVar != null) {
                    pVar.invoke(cVar, r.p(manageMembershipCtaButton.getButtonTextView(), null));
                    return;
                } else {
                    j.m("type");
                    throw null;
                }
        }
    }
}
