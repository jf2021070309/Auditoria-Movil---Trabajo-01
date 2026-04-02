package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzdqo implements zzblt {
    final /* synthetic */ zzdqp zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdqo(zzdqp zzdqpVar) {
        this.zza = zzdqpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblt
    public final void zza() {
        zzdmh zzdmhVar;
        zzdmh zzdmhVar2;
        zzdmhVar = this.zza.zzd;
        if (zzdmhVar != null) {
            zzdmhVar2 = this.zza.zzd;
            zzdmhVar2.zzc("_videoMediaView");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblt
    public final void zzb(MotionEvent motionEvent) {
    }

    @Override // com.google.android.gms.internal.ads.zzblt
    public final JSONObject zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzblt
    public final JSONObject zzd() {
        return null;
    }
}
