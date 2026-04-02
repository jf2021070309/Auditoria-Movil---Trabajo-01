package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzayx {
    private zzaym zza;
    private boolean zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzayx(Context context) {
        this.zzc = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzc(zzayx zzayxVar, boolean z) {
        zzayxVar.zzb = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Future<zzayz> zze(zzayn zzaynVar) {
        zzayr zzayrVar = new zzayr(this);
        zzayv zzayvVar = new zzayv(this, zzaynVar, zzayrVar);
        zzayw zzaywVar = new zzayw(this, zzayrVar);
        synchronized (this.zzd) {
            zzaym zzaymVar = new zzaym(this.zzc, com.google.android.gms.ads.internal.zzt.zzq().zza(), zzayvVar, zzaywVar);
            this.zza = zzaymVar;
            zzaymVar.checkAvailabilityAndConnect();
        }
        return zzayrVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzayx zzayxVar) {
        synchronized (zzayxVar.zzd) {
            zzaym zzaymVar = zzayxVar.zza;
            if (zzaymVar == null) {
                return;
            }
            zzaymVar.disconnect();
            zzayxVar.zza = null;
            Binder.flushPendingCommands();
        }
    }
}
