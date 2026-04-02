package com.amazon.aps.iva.c3;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
/* compiled from: NotificationChannelCompat.java */
/* loaded from: classes.dex */
public final class n {
    public final String a;
    public final CharSequence b;
    public final int c;
    public final String d;
    public final String e;
    public final boolean f;
    public final Uri g;
    public final AudioAttributes h;
    public final boolean i;
    public final int j;
    public final boolean k;
    public final long[] l;
    public final String m;
    public final String n;

    /* compiled from: NotificationChannelCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(NotificationChannel notificationChannel) {
            return notificationChannel.canBypassDnd();
        }

        public static boolean b(NotificationChannel notificationChannel) {
            return notificationChannel.canShowBadge();
        }

        public static NotificationChannel c(String str, CharSequence charSequence, int i) {
            return new NotificationChannel(str, charSequence, i);
        }

        public static void d(NotificationChannel notificationChannel, boolean z) {
            notificationChannel.enableLights(z);
        }

        public static void e(NotificationChannel notificationChannel, boolean z) {
            notificationChannel.enableVibration(z);
        }

        public static AudioAttributes f(NotificationChannel notificationChannel) {
            return notificationChannel.getAudioAttributes();
        }

        public static String g(NotificationChannel notificationChannel) {
            return notificationChannel.getDescription();
        }

        public static String h(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        public static String i(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        public static int j(NotificationChannel notificationChannel) {
            return notificationChannel.getImportance();
        }

        public static int k(NotificationChannel notificationChannel) {
            return notificationChannel.getLightColor();
        }

        public static int l(NotificationChannel notificationChannel) {
            return notificationChannel.getLockscreenVisibility();
        }

        public static CharSequence m(NotificationChannel notificationChannel) {
            return notificationChannel.getName();
        }

        public static Uri n(NotificationChannel notificationChannel) {
            return notificationChannel.getSound();
        }

        public static long[] o(NotificationChannel notificationChannel) {
            return notificationChannel.getVibrationPattern();
        }

        public static void p(NotificationChannel notificationChannel, String str) {
            notificationChannel.setDescription(str);
        }

        public static void q(NotificationChannel notificationChannel, String str) {
            notificationChannel.setGroup(str);
        }

        public static void r(NotificationChannel notificationChannel, int i) {
            notificationChannel.setLightColor(i);
        }

        public static void s(NotificationChannel notificationChannel, boolean z) {
            notificationChannel.setShowBadge(z);
        }

        public static void t(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
            notificationChannel.setSound(uri, audioAttributes);
        }

        public static void u(NotificationChannel notificationChannel, long[] jArr) {
            notificationChannel.setVibrationPattern(jArr);
        }

        public static boolean v(NotificationChannel notificationChannel) {
            return notificationChannel.shouldShowLights();
        }

        public static boolean w(NotificationChannel notificationChannel) {
            return notificationChannel.shouldVibrate();
        }
    }

    /* compiled from: NotificationChannelCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static boolean a(NotificationChannel notificationChannel) {
            return notificationChannel.canBubble();
        }
    }

    /* compiled from: NotificationChannelCompat.java */
    /* loaded from: classes.dex */
    public static class c {
        public static String a(NotificationChannel notificationChannel) {
            return notificationChannel.getConversationId();
        }

        public static String b(NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }

        public static boolean c(NotificationChannel notificationChannel) {
            return notificationChannel.isImportantConversation();
        }

        public static void d(NotificationChannel notificationChannel, String str, String str2) {
            notificationChannel.setConversationId(str, str2);
        }
    }

    public n(NotificationChannel notificationChannel) {
        String i = a.i(notificationChannel);
        int j = a.j(notificationChannel);
        this.f = true;
        this.g = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.j = 0;
        i.getClass();
        this.a = i;
        this.c = j;
        this.h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
        this.b = a.m(notificationChannel);
        this.d = a.g(notificationChannel);
        this.e = a.h(notificationChannel);
        this.f = a.b(notificationChannel);
        this.g = a.n(notificationChannel);
        this.h = a.f(notificationChannel);
        this.i = a.v(notificationChannel);
        this.j = a.k(notificationChannel);
        this.k = a.w(notificationChannel);
        this.l = a.o(notificationChannel);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.m = c.b(notificationChannel);
            this.n = c.a(notificationChannel);
        }
        a.a(notificationChannel);
        a.l(notificationChannel);
        if (i2 >= 29) {
            b.a(notificationChannel);
        }
        if (i2 >= 30) {
            c.c(notificationChannel);
        }
    }

    public final NotificationChannel a() {
        String str;
        String str2;
        int i = Build.VERSION.SDK_INT;
        NotificationChannel c2 = a.c(this.a, this.b, this.c);
        a.p(c2, this.d);
        a.q(c2, this.e);
        a.s(c2, this.f);
        a.t(c2, this.g, this.h);
        a.d(c2, this.i);
        a.r(c2, this.j);
        a.u(c2, this.l);
        a.e(c2, this.k);
        if (i >= 30 && (str = this.m) != null && (str2 = this.n) != null) {
            c.d(c2, str, str2);
        }
        return c2;
    }
}
