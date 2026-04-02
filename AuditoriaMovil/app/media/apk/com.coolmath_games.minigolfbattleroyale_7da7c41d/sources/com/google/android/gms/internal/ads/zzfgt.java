package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfgt {
    private static final zzfgt zza = new zzfgt();
    private Context zzb;
    private BroadcastReceiver zzc;
    private boolean zzd;
    private boolean zze;
    private zzfgy zzf;

    private zzfgt() {
    }

    public static zzfgt zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzfgt zzfgtVar, boolean z) {
        if (zzfgtVar.zze != z) {
            zzfgtVar.zze = z;
            if (zzfgtVar.zzd) {
                zzfgtVar.zzh();
                if (zzfgtVar.zzf != null) {
                    if (zzfgtVar.zze()) {
                        zzfhu.zzf().zzg();
                    } else {
                        zzfhu.zzf().zzi();
                    }
                }
            }
        }
    }

    private final void zzh() {
        boolean z = this.zze;
        for (zzfgg zzfggVar : zzfgr.zza().zze()) {
            zzfhe zzg = zzfggVar.zzg();
            if (zzg.zze()) {
                zzfgx.zza().zzg(zzg.zzd(), "setState", true != z ? "foregrounded" : "backgrounded");
            }
        }
    }

    public final void zzb(Context context) {
        this.zzb = context.getApplicationContext();
    }

    public final void zzc() {
        this.zzc = new zzfgs(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.zzb.registerReceiver(this.zzc, intentFilter);
        this.zzd = true;
        zzh();
    }

    public final void zzd() {
        BroadcastReceiver broadcastReceiver;
        Context context = this.zzb;
        if (context != null && (broadcastReceiver = this.zzc) != null) {
            context.unregisterReceiver(broadcastReceiver);
            this.zzc = null;
        }
        this.zzd = false;
        this.zze = false;
        this.zzf = null;
    }

    public final boolean zze() {
        return !this.zze;
    }

    public final void zzg(zzfgy zzfgyVar) {
        this.zzf = zzfgyVar;
    }
}
