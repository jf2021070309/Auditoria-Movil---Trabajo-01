package com.google.android.gms.internal.ads;

import com.facebook.appevents.AppEventsConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdqc {
    private final Executor zza;
    private final zzcua zzb;
    private final zzdij zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdqc(Executor executor, zzcua zzcuaVar, zzdij zzdijVar) {
        this.zza = executor;
        this.zzc = zzdijVar;
        this.zzb = zzcuaVar;
    }

    public final void zza(final zzcml zzcmlVar) {
        if (zzcmlVar == null) {
            return;
        }
        this.zzc.zza(zzcmlVar.zzH());
        this.zzc.zzi(new zzawd(zzcmlVar) { // from class: com.google.android.gms.internal.ads.zzdpy
            private final zzcml zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzcmlVar;
            }

            @Override // com.google.android.gms.internal.ads.zzawd
            public final void zzc(zzawc zzawcVar) {
                this.zza.zzR().zza(zzawcVar.zzd.left, zzawcVar.zzd.top, false);
            }
        }, this.zza);
        this.zzc.zzi(new zzawd(zzcmlVar) { // from class: com.google.android.gms.internal.ads.zzdpz
            private final zzcml zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzcmlVar;
            }

            @Override // com.google.android.gms.internal.ads.zzawd
            public final void zzc(zzawc zzawcVar) {
                zzcml zzcmlVar2 = this.zza;
                HashMap hashMap = new HashMap();
                hashMap.put("isVisible", true != zzawcVar.zzj ? AppEventsConstants.EVENT_PARAM_VALUE_NO : "1");
                zzcmlVar2.zze("onAdVisibilityChanged", hashMap);
            }
        }, this.zza);
        this.zzc.zzi(this.zzb, this.zza);
        this.zzb.zza(zzcmlVar);
        zzcmlVar.zzab("/trackActiveViewUnit", new zzbpr(this) { // from class: com.google.android.gms.internal.ads.zzdqa
            private final zzdqc zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbpr
            public final void zza(Object obj, Map map) {
                this.zza.zzc((zzcml) obj, map);
            }
        });
        zzcmlVar.zzab("/untrackActiveViewUnit", new zzbpr(this) { // from class: com.google.android.gms.internal.ads.zzdqb
            private final zzdqc zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbpr
            public final void zza(Object obj, Map map) {
                this.zza.zzb((zzcml) obj, map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzcml zzcmlVar, Map map) {
        this.zzb.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzcml zzcmlVar, Map map) {
        this.zzb.zzd();
    }
}
