package com.ellation.crunchyroll.presentation.download.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.amazon.aps.iva.b10.o;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.zv.b;
import com.ellation.crunchyroll.presentation.download.notification.b;
import kotlin.Metadata;
/* compiled from: NotificationDismissReceiver.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ellation/crunchyroll/presentation/download/notification/NotificationDismissReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "a", "downloading_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class NotificationDismissReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    /* compiled from: NotificationDismissReceiver.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static Intent a(Context context, String str) {
            j.f(context, "context");
            j.f(str, "notificationId");
            Intent putExtra = new Intent(context, NotificationDismissReceiver.class).putExtra("notification_id", str);
            j.e(putExtra, "Intent(context, Notifica…ATION_ID, notificationId)");
            return putExtra;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getStringExtra("notification_id");
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        Context context2 = b.a.a;
        if (context2 != null) {
            o oVar = b.a.a;
            if (oVar == null) {
                oVar = new o(context2);
                b.a.a = oVar;
            }
            oVar.c(str, false);
            return;
        }
        j.m("internalContext");
        throw null;
    }
}
