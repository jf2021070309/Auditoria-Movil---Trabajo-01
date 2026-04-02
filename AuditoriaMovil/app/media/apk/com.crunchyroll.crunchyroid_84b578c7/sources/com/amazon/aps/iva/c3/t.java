package com.amazon.aps.iva.c3;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class t extends w {

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        public static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }
    }

    @Override // com.amazon.aps.iva.c3.w
    public final void addCompatExtras(Bundle bundle) {
        super.addCompatExtras(bundle);
        bundle.putInt("android.callType", 0);
        bundle.putBoolean("android.callIsVideo", false);
        bundle.putCharSequence("android.verificationText", null);
        bundle.putParcelable("android.answerIntent", null);
        bundle.putParcelable("android.declineIntent", null);
        bundle.putParcelable("android.hangUpIntent", null);
    }

    @Override // com.amazon.aps.iva.c3.w
    public final void apply(m mVar) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 31) {
            if (Log.isLoggable("NotifCompat", 3)) {
                String.valueOf(0);
                return;
            }
            return;
        }
        Notification.Builder builder = ((x) mVar).b;
        CharSequence charSequence2 = null;
        builder.setContentTitle(null);
        Bundle bundle = this.mBuilder.u;
        if (bundle != null && bundle.containsKey("android.text")) {
            charSequence = this.mBuilder.u.getCharSequence("android.text");
        } else {
            charSequence = null;
        }
        if (charSequence != null) {
            charSequence2 = charSequence;
        }
        builder.setContentText(charSequence2);
        a.b(builder, "call");
    }

    @Override // com.amazon.aps.iva.c3.w
    public final String getClassName() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }
}
