package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzwa implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzwc zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzwa(zzwc zzwcVar, String str, long j) {
        this.zzc = zzwcVar;
        this.zza = str;
        this.zzb = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzwn zzwnVar;
        zzwn zzwnVar2;
        zzwnVar = this.zzc.zza;
        zzwnVar.zza(this.zza, this.zzb);
        zzwnVar2 = this.zzc.zza;
        zzwnVar2.zzb(this.zzc.toString());
    }
}
