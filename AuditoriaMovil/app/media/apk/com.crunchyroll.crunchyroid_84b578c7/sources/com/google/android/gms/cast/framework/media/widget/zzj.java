package com.google.android.gms.cast.framework.media.widget;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
final class zzj implements Runnable {
    final /* synthetic */ zzk zza;

    public zzj(zzk zzkVar) {
        this.zza = zzkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzk zzkVar = this.zza;
        zzkVar.zzb.zzm(zzkVar.zza);
    }
}
