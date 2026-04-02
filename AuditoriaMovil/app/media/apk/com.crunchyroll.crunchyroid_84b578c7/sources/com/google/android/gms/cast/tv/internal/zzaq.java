package com.google.android.gms.cast.tv.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.cast.tv.CastReceiverContext;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzaq extends BroadcastReceiver {
    final CastReceiverContext zza;

    public zzaq(CastReceiverContext castReceiverContext) {
        this.zza = castReceiverContext;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (TextUtils.equals(intent.getAction(), "com.google.android.gms.cast.tv.ACTION_WARG_STARTED")) {
            this.zza.zzm();
        }
    }
}
