package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfgs extends BroadcastReceiver {
    final /* synthetic */ zzfgt zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfgs(zzfgt zzfgtVar) {
        this.zza = zzfgtVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        KeyguardManager keyguardManager;
        if (intent == null) {
            return;
        }
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            zzfgt.zzf(this.zza, true);
        } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            zzfgt.zzf(this.zza, false);
        } else if (!"android.intent.action.SCREEN_ON".equals(intent.getAction()) || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null || keyguardManager.inKeyguardRestrictedInputMode()) {
        } else {
            zzfgt.zzf(this.zza, false);
        }
    }
}
