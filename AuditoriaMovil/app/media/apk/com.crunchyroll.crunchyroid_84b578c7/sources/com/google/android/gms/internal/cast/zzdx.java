package com.google.android.gms.internal.cast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.amazon.aps.iva.d3.a;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzdx extends a {
    @Deprecated
    public static Intent zza(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i;
        if (zzdw.zza()) {
            if (true != zzdw.zza()) {
                i = 0;
            } else {
                i = 2;
            }
            return context.registerReceiver(broadcastReceiver, intentFilter, i);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
