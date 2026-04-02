package com.amazon.aps.iva.fe;

import android.view.View;
import com.crunchyroll.auth.screen.OtpActivity;
/* compiled from: OtpActivity.kt */
/* loaded from: classes.dex */
public final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ OtpActivity h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(OtpActivity otpActivity, String str) {
        super(1);
        this.h = otpActivity;
        this.i = str;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(View view) {
        View view2 = view;
        com.amazon.aps.iva.yb0.j.f(view2, "view");
        this.h.m.w5(com.amazon.aps.iva.ab.r.p(view2, this.i));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
