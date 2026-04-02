package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
/* renamed from: com.facebook.ads.redexgen.X.b2  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1174b2 implements LN {
    @Override // com.facebook.ads.redexgen.X.LN
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Window.Callback callback = activity.getWindow() != null ? activity.getWindow().getCallback() : null;
        if (callback != null) {
            LJ lj = new LJ(callback, activity);
            LJ.A00(new C1175b3(this));
            activity.getWindow().setCallback(lj);
        }
    }
}
