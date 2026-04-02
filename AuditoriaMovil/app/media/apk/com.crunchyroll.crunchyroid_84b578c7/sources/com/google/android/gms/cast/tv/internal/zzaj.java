package com.google.android.gms.cast.tv.internal;

import android.os.Handler;
import android.os.Looper;
import com.amazon.aps.iva.if0.a;
import com.google.android.gms.internal.cast_tv.zzby;
import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzaj {
    public static final /* synthetic */ int zza = 0;
    private static final zzby zzb = new zzby(Looper.getMainLooper());

    public static Handler zza() {
        return zzb;
    }

    public static a zzb(List list) {
        if (list == null) {
            return null;
        }
        a aVar = new a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num != null) {
                aVar.put(num);
            }
        }
        return aVar;
    }
}
