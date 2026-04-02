package com.amazon.aps.iva.c3;

import android.app.Notification;
import android.os.Bundle;
/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class r extends w {
    public CharSequence a;

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static Notification.BigTextStyle a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
            return bigTextStyle.bigText(charSequence);
        }

        public static Notification.BigTextStyle b(Notification.Builder builder) {
            return new Notification.BigTextStyle(builder);
        }

        public static Notification.BigTextStyle c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
            return bigTextStyle.setBigContentTitle(charSequence);
        }

        public static Notification.BigTextStyle d(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
            return bigTextStyle.setSummaryText(charSequence);
        }
    }

    public final void a(CharSequence charSequence) {
        this.a = s.c(charSequence);
    }

    @Override // com.amazon.aps.iva.c3.w
    public final void addCompatExtras(Bundle bundle) {
        super.addCompatExtras(bundle);
    }

    @Override // com.amazon.aps.iva.c3.w
    public final void apply(m mVar) {
        Notification.BigTextStyle a2 = a.a(a.c(a.b(((x) mVar).b), this.mBigContentTitle), this.a);
        if (this.mSummaryTextSet) {
            a.d(a2, this.mSummaryText);
        }
    }

    public final void b(CharSequence charSequence) {
        this.mBigContentTitle = s.c(charSequence);
    }

    public final void c(CharSequence charSequence) {
        this.mSummaryText = s.c(charSequence);
        this.mSummaryTextSet = true;
    }

    @Override // com.amazon.aps.iva.c3.w
    public final String getClassName() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
