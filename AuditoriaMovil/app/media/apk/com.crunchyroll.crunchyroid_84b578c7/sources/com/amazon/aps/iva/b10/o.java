package com.amazon.aps.iva.b10;

import android.app.ForegroundServiceStartNotAllowedException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.ellation.crunchyroll.presentation.download.notification.NotificationsDismissService;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: NotificationsDismissServiceWrapper.kt */
/* loaded from: classes2.dex */
public final class o implements com.ellation.crunchyroll.presentation.download.notification.b {
    public final Context a;
    public final Map<String, l> b;
    public final com.amazon.aps.iva.x50.g c;
    public final com.amazon.aps.iva.x50.g d;

    public o(Context context) {
        Handler handler = new Handler(Looper.getMainLooper());
        com.amazon.aps.iva.yb0.j.f(context, "context");
        this.a = context;
        this.b = Collections.synchronizedMap(new LinkedHashMap());
        this.c = new com.amazon.aps.iva.x50.g(handler, new n(this));
        this.d = new com.amazon.aps.iva.x50.g(handler, new m(this));
    }

    public static final void d(o oVar) {
        int i = Build.VERSION.SDK_INT;
        Context context = oVar.a;
        if (i >= 31) {
            try {
                context.startForegroundService(new Intent(context, NotificationsDismissService.class));
                return;
            } catch (ForegroundServiceStartNotAllowedException e) {
                com.amazon.aps.iva.mf0.a.a.k(e, "Failed to start foreground service!", new Object[0]);
                return;
            }
        }
        context.startForegroundService(new Intent(context, NotificationsDismissService.class));
    }

    @Override // com.ellation.crunchyroll.presentation.download.notification.b
    public final void a(k kVar) {
        Map<String, l> map = this.b;
        if (map.isEmpty()) {
            this.d.b.setValue(com.amazon.aps.iva.kb0.q.a);
        }
        map.put(kVar.a, kVar.b);
    }

    @Override // com.ellation.crunchyroll.presentation.download.notification.b
    public final void b() {
        Map<String, l> map = this.b;
        map.clear();
        if (map.isEmpty()) {
            this.c.b.cancel();
            map.clear();
            Context context = this.a;
            context.stopService(new Intent(context, NotificationsDismissService.class));
        }
    }

    @Override // com.ellation.crunchyroll.presentation.download.notification.b
    public final void c(String str, boolean z) {
        com.amazon.aps.iva.yb0.j.f(str, "notificationId");
        Map<String, l> map = this.b;
        if (map.get(str) == l.DISMISSIBLE || z) {
            map.remove(str);
        }
        if (map.isEmpty()) {
            this.c.b.cancel();
            map.clear();
            Context context = this.a;
            context.stopService(new Intent(context, NotificationsDismissService.class));
        }
    }
}
