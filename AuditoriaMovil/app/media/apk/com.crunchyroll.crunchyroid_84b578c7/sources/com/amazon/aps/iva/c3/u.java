package com.amazon.aps.iva.c3;

import android.app.Notification;
import android.widget.RemoteViews;
/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class u extends w {

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static Notification.Builder a(Notification.Builder builder, Object obj) {
            return builder.setStyle((Notification.Style) obj);
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static Notification.DecoratedCustomViewStyle a() {
            return new Notification.DecoratedCustomViewStyle();
        }
    }

    @Override // com.amazon.aps.iva.c3.w
    public final void apply(m mVar) {
        a.a(((x) mVar).b, b.a());
    }

    @Override // com.amazon.aps.iva.c3.w
    public final String getClassName() {
        return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
    }

    @Override // com.amazon.aps.iva.c3.w
    public final RemoteViews makeBigContentView(m mVar) {
        return null;
    }

    @Override // com.amazon.aps.iva.c3.w
    public final RemoteViews makeContentView(m mVar) {
        return null;
    }

    @Override // com.amazon.aps.iva.c3.w
    public final RemoteViews makeHeadsUpContentView(m mVar) {
        return null;
    }
}
