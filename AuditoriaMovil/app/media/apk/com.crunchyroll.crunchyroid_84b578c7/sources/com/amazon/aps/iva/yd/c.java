package com.amazon.aps.iva.yd;

import android.view.View;
import com.crunchyroll.auth.emailmandatory.EmailMandatoryActivity;
/* compiled from: EmailMandatoryActivity.kt */
/* loaded from: classes.dex */
public final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ EmailMandatoryActivity h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EmailMandatoryActivity emailMandatoryActivity, String str) {
        super(1);
        this.h = emailMandatoryActivity;
        this.i = str;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(View view) {
        View view2 = view;
        com.amazon.aps.iva.yb0.j.f(view2, "view");
        this.h.n.w5(com.amazon.aps.iva.ab.r.p(view2, this.i));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
