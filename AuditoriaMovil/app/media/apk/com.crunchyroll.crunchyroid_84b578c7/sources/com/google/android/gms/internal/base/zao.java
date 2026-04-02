package com.google.android.gms.internal.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.amazon.aps.iva.d3.a;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes3.dex */
public final class zao extends a {
    @ResultIgnorabilityUnspecified
    @Deprecated
    public static Intent zaa(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i;
        if (zan.zaa()) {
            if (true != zan.zaa()) {
                i = 0;
            } else {
                i = 2;
            }
            return context.registerReceiver(broadcastReceiver, intentFilter, i);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
