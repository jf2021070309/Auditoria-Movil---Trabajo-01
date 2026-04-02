package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import c.c0.c;
import c.c0.d;
import c.c0.d0.l;
import c.c0.d0.s.p;
import c.c0.d0.t.t.b;
import c.c0.f;
import c.c0.s;
import c.c0.t;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzcgt;
import java.util.HashMap;
import java.util.Objects;
@KeepForSdk
/* loaded from: classes.dex */
public class WorkManagerUtil extends zzbt {
    private static void zzb(Context context) {
        try {
            l.d(context.getApplicationContext(), new c(new c.a()));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbu
    public final boolean zze(@RecentlyNonNull IObjectWrapper iObjectWrapper, @RecentlyNonNull String str, @RecentlyNonNull String str2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        d.a aVar = new d.a();
        aVar.a = s.CONNECTED;
        d dVar = new d(aVar);
        HashMap hashMap = new HashMap();
        hashMap.put("uri", str);
        hashMap.put("gws_query_id", str2);
        f fVar = new f(hashMap);
        f.c(fVar);
        t.a aVar2 = new t.a(OfflineNotificationPoster.class);
        p pVar = aVar2.f1314b;
        pVar.f1515j = dVar;
        pVar.f1510e = fVar;
        aVar2.f1315c.add("offline_notification_work");
        try {
            l.c(context).a(aVar2.a());
            return true;
        } catch (IllegalStateException e2) {
            zzcgt.zzj("Failed to instantiate WorkManager.", e2);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbu
    public final void zzf(@RecentlyNonNull IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        try {
            l c2 = l.c(context);
            Objects.requireNonNull(c2);
            ((b) c2.f1373g).a.execute(new c.c0.d0.t.b(c2, "offline_ping_sender_work"));
            d.a aVar = new d.a();
            aVar.a = s.CONNECTED;
            d dVar = new d(aVar);
            t.a aVar2 = new t.a(OfflinePingSender.class);
            aVar2.f1314b.f1515j = dVar;
            aVar2.f1315c.add("offline_ping_sender_work");
            c2.a(aVar2.a());
        } catch (IllegalStateException e2) {
            zzcgt.zzj("Failed to instantiate WorkManager.", e2);
        }
    }
}
