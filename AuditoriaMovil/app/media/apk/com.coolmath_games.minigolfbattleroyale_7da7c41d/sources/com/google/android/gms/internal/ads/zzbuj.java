package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbuj implements zzbqe {
    final /* synthetic */ zzbuk zza;
    private final zzbtm zzb;
    private final zzchl zzc;

    public zzbuj(zzbuk zzbukVar, zzbtm zzbtmVar, zzchl zzchlVar) {
        this.zza = zzbukVar;
        this.zzb = zzbtmVar;
        this.zzc = zzchlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqe
    public final void zza(JSONObject jSONObject) {
        zzbtm zzbtmVar;
        zzbty zzbtyVar;
        try {
            try {
                zzchl zzchlVar = this.zzc;
                zzbtyVar = this.zza.zza;
                zzchlVar.zzc(zzbtyVar.zza(jSONObject));
                zzbtmVar = this.zzb;
            } catch (IllegalStateException unused) {
                zzbtmVar = this.zzb;
            } catch (JSONException e) {
                this.zzc.zzd(e);
                zzbtmVar = this.zzb;
            }
            zzbtmVar.zzb();
        } catch (Throwable th) {
            this.zzb.zzb();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqe
    public final void zzb(String str) {
        zzbtm zzbtmVar;
        try {
            if (str == null) {
                this.zzc.zzd(new zzbtv());
            } else {
                this.zzc.zzd(new zzbtv(str));
            }
            zzbtmVar = this.zzb;
        } catch (IllegalStateException unused) {
            zzbtmVar = this.zzb;
        } catch (Throwable th) {
            this.zzb.zzb();
            throw th;
        }
        zzbtmVar.zzb();
    }
}
