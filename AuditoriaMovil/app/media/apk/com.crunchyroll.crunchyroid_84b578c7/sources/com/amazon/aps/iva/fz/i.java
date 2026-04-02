package com.amazon.aps.iva.fz;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import com.amazon.aps.iva.ee0.f1;
import com.crunchyroll.crunchyroid.R;
import java.util.List;
/* compiled from: NotificationFeature.kt */
/* loaded from: classes2.dex */
public final class i {
    public final o a = new o();

    public final void a(Context context) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        h hVar = new h(context, new com.amazon.aps.iva.a0.k());
        String a = hVar.a(R.string.channel_id_content_updates);
        String a2 = hVar.a(R.string.channel_name_content_updates);
        g gVar = hVar.b;
        List<NotificationChannel> K = f1.K(gVar.d(a, a2), gVar.d(hVar.a(R.string.channel_id_general_updates), hVar.a(R.string.channel_name_general_updates)), gVar.d(hVar.a(R.string.channel_id_promo_updates), hVar.a(R.string.channel_name_promotional_updates)));
        NotificationManager notificationManager = hVar.c;
        notificationManager.createNotificationChannels(K);
        notificationManager.createNotificationChannel(gVar.d(hVar.a(R.string.channel_id_syncing), hVar.a(R.string.channel_name_syncing)));
    }
}
