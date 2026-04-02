package com.amazon.aps.iva.fe;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.amazon.aps.iva.fe.a0;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.api.Status;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: SMSCodeBroadcastReceiver.kt */
/* loaded from: classes.dex */
public final class z extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Status status;
        Bundle extras;
        String string;
        Parcelable parcelable;
        Object parcelable2;
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(intent, "intent");
        if (com.amazon.aps.iva.yb0.j.a(SmsRetriever.SMS_RETRIEVED_ACTION, intent.getAction())) {
            Bundle extras2 = intent.getExtras();
            Integer num = null;
            if (extras2 != null) {
                if (Build.VERSION.SDK_INT >= 34) {
                    parcelable2 = extras2.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_STATUS", Status.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    parcelable = (Status) extras2.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
                }
                status = (Status) parcelable;
            } else {
                status = null;
            }
            if (!(status instanceof Status)) {
                status = null;
            }
            if (status != null) {
                num = Integer.valueOf(status.getStatusCode());
            }
            if (num != null && num.intValue() == 0 && (extras = intent.getExtras()) != null && (string = extras.getString(SmsRetriever.EXTRA_SMS_MESSAGE)) != null) {
                Pattern compile = Pattern.compile("\\d{6}");
                com.amazon.aps.iva.yb0.j.e(compile, "compile(pattern)");
                Matcher matcher = compile.matcher(string);
                com.amazon.aps.iva.yb0.j.e(matcher, "nativePattern.matcher(input)");
                com.amazon.aps.iva.oe0.e h = com.amazon.aps.iva.a60.b.h(matcher, 0, string);
                if (h != null) {
                    String value = h.getValue();
                    a0.a.getClass();
                    a0.a.b.b.i(new com.amazon.aps.iva.ez.d<>(value));
                }
            }
        }
    }
}
