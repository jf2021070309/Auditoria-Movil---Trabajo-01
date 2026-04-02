package com.google.android.gms.internal.cast_tv;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.amazon.aps.iva.d3.a;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzbx extends a {
    @Deprecated
    public static Intent zza(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        int i;
        if (zzbw.zza()) {
            if (true != zzbw.zza()) {
                i = 0;
            } else {
                i = 2;
            }
            return context.registerReceiver(broadcastReceiver, intentFilter, null, handler, i);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, null, handler);
    }
}
