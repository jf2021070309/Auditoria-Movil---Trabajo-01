package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzabw implements Runnable {
    final /* synthetic */ zzaby zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzabw(zzaby zzabyVar) {
        this.zza = zzabyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzg();
    }
}
