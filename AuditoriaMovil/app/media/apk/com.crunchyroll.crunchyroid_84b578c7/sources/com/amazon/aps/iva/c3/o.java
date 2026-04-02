package com.amazon.aps.iva.c3;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: NotificationChannelGroupCompat.java */
/* loaded from: classes.dex */
public final class o {
    public final String a;
    public final CharSequence b;
    public final String c;
    public final List<n> d;

    /* compiled from: NotificationChannelGroupCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static NotificationChannelGroup a(String str, CharSequence charSequence) {
            return new NotificationChannelGroup(str, charSequence);
        }

        public static List<NotificationChannel> b(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getChannels();
        }

        public static String c(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        public static String d(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        public static CharSequence e(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getName();
        }
    }

    /* compiled from: NotificationChannelGroupCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static String a(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getDescription();
        }

        public static boolean b(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.isBlocked();
        }

        public static void c(NotificationChannelGroup notificationChannelGroup, String str) {
            notificationChannelGroup.setDescription(str);
        }
    }

    public o(NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.emptyList());
    }

    public final ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NotificationChannel notificationChannel = (NotificationChannel) it.next();
            if (this.a.equals(a.c(notificationChannel))) {
                arrayList.add(new n(notificationChannel));
            }
        }
        return arrayList;
    }

    public o(NotificationChannelGroup notificationChannelGroup, List<NotificationChannel> list) {
        String d = a.d(notificationChannelGroup);
        this.d = Collections.emptyList();
        d.getClass();
        this.a = d;
        this.b = a.e(notificationChannelGroup);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.c = b.a(notificationChannelGroup);
        }
        if (i >= 28) {
            b.b(notificationChannelGroup);
            this.d = a(a.b(notificationChannelGroup));
            return;
        }
        this.d = a(list);
    }
}
