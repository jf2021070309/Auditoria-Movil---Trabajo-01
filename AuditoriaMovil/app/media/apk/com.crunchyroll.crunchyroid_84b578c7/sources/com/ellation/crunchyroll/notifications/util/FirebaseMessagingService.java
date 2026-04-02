package com.ellation.crunchyroll.notifications.util;

import android.app.Application;
import com.amazon.aps.iva.fz.d;
import com.amazon.aps.iva.fz.f;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.iz.a;
import com.amazon.aps.iva.yb0.j;
import com.braze.Braze;
import com.braze.push.BrazeFirebaseMessagingService;
import kotlin.Metadata;
/* compiled from: FirebaseMessagingService.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ellation/crunchyroll/notifications/util/FirebaseMessagingService;", "Lcom/braze/push/BrazeFirebaseMessagingService;", "<init>", "()V", "notifications_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class FirebaseMessagingService extends BrazeFirebaseMessagingService {
    @Override // com.braze.push.BrazeFirebaseMessagingService, com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(String str) {
        j.f(str, "newToken");
        int i = d.a;
        j.e(getApplicationContext(), "applicationContext");
        Braze.Companion companion = Braze.Companion;
        Application application = f.c;
        if (application != null) {
            companion.getInstance(application).setRegisteredPushToken(str);
            v<String> vVar = a.a;
            a.a.i(str);
            return;
        }
        j.m("appContext");
        throw null;
    }
}
