package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.Mg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0757Mg implements View.OnClickListener {
    public final /* synthetic */ C1U A00;
    public final /* synthetic */ C0692Jo A01;
    public final /* synthetic */ C0758Mh A02;
    public final /* synthetic */ InterfaceC0761Mk A03;
    public final /* synthetic */ String A04;

    public View$OnClickListenerC0757Mg(C0758Mh c0758Mh, C0692Jo c0692Jo, InterfaceC0761Mk interfaceC0761Mk, String str, C1U c1u) {
        this.A02 = c0758Mh;
        this.A01 = c0692Jo;
        this.A03 = interfaceC0761Mk;
        this.A04 = str;
        this.A00 = c1u;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2D c2d;
        C1046Xo c1046Xo;
        C1046Xo c1046Xo2;
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            this.A01.A02(EnumC0691Jn.A0A, null);
            c2d = this.A02.A02;
            c1046Xo = this.A02.A03;
            if (c2d.A0O(c1046Xo.A00(), true)) {
                this.A03.A8j(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                LV lv = new LV();
                c1046Xo2 = this.A02.A03;
                LV.A0A(lv, c1046Xo2, Uri.parse(this.A00.A00()), this.A04);
            }
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
