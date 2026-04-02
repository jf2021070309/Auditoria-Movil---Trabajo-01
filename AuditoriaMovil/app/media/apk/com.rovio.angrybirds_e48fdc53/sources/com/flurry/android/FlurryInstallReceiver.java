package com.flurry.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.flurry.sdk.ht;
import com.flurry.sdk.ko;
import com.flurry.sdk.ma;
/* loaded from: classes2.dex */
public final class FlurryInstallReceiver extends BroadcastReceiver {
    private static final String a = FlurryInstallReceiver.class.getSimpleName();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ko.a(4, a, "Received an Install notification of " + intent.getAction());
        String string = intent.getExtras().getString("referrer");
        ko.a(4, a, "Received an Install referrer of " + string);
        if (string == null || !"com.android.vending.INSTALL_REFERRER".equals(intent.getAction())) {
            ko.a(5, a, "referrer is null");
            return;
        }
        if (!string.contains("=")) {
            ko.a(4, a, "referrer is before decoding: " + string);
            string = ma.h(string);
            ko.a(4, a, "referrer is: " + string);
        }
        new ht(context).a(string);
    }
}
