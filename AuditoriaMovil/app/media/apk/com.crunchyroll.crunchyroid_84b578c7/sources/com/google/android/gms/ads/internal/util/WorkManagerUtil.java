package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.work.a;
import com.amazon.aps.iva.k9.c;
import com.amazon.aps.iva.k9.n;
import com.amazon.aps.iva.k9.o;
import com.amazon.aps.iva.l9.k;
import com.amazon.aps.iva.t9.p;
import com.amazon.aps.iva.w9.b;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbzo;
import java.util.Collections;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class WorkManagerUtil extends zzbq {
    private static void zzb(Context context) {
        try {
            k.d(context.getApplicationContext(), new a(new a.C0061a()));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final void zze(IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        try {
            k c = k.c(context);
            c.getClass();
            ((b) c.d).a(new com.amazon.aps.iva.u9.b(c, "offline_ping_sender_work"));
            c.a aVar = new c.a();
            aVar.a = n.CONNECTED;
            c cVar = new c(aVar);
            o.a aVar2 = new o.a(OfflinePingSender.class);
            aVar2.b.j = cVar;
            aVar2.c.add("offline_ping_sender_work");
            c.a(Collections.singletonList(aVar2.a()));
        } catch (IllegalStateException e) {
            zzbzo.zzk("Failed to instantiate WorkManager.", e);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzf(IObjectWrapper iObjectWrapper, String str, String str2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        c.a aVar = new c.a();
        aVar.a = n.CONNECTED;
        c cVar = new c(aVar);
        HashMap hashMap = new HashMap();
        hashMap.put("uri", str);
        hashMap.put("gws_query_id", str2);
        androidx.work.b bVar = new androidx.work.b(hashMap);
        androidx.work.b.b(bVar);
        o.a aVar2 = new o.a(OfflineNotificationPoster.class);
        p pVar = aVar2.b;
        pVar.j = cVar;
        pVar.e = bVar;
        aVar2.c.add("offline_notification_work");
        o a = aVar2.a();
        try {
            k c = k.c(context);
            c.getClass();
            c.a(Collections.singletonList(a));
            return true;
        } catch (IllegalStateException e) {
            zzbzo.zzk("Failed to instantiate WorkManager.", e);
            return false;
        }
    }
}
