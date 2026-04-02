package com.google.android.gms.internal.ads;

import com.google.ads.mediation.facebook.FacebookAdapter;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbuk<I, O> implements zzbtw<I, O> {
    private final zzbty<O> zza;
    private final zzbtz<I> zzb;
    private final zzbts zzc;
    private final String zzd;

    public zzbuk(zzbts zzbtsVar, String str, zzbtz<I> zzbtzVar, zzbty<O> zzbtyVar) {
        this.zzc = zzbtsVar;
        this.zzd = str;
        this.zzb = zzbtzVar;
        this.zza = zzbtyVar;
    }

    public static /* synthetic */ void zzd(zzbuk zzbukVar, zzbtm zzbtmVar, zzbtt zzbttVar, Object obj, zzchl zzchlVar) {
        try {
            com.google.android.gms.ads.internal.zzt.zzc();
            String uuid = UUID.randomUUID().toString();
            zzbpq.zzo.zzb(uuid, new zzbuj(zzbukVar, zzbtmVar, zzchlVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FacebookAdapter.KEY_ID, uuid);
            jSONObject.put("args", zzbukVar.zzb.zzb(obj));
            zzbttVar.zzr(zzbukVar.zzd, jSONObject);
        } catch (Exception e2) {
            try {
                zzchlVar.zzd(e2);
                zzcgt.zzg("Unable to invokeJavascript", e2);
            } finally {
                zzbtmVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrk
    public final zzfsm<O> zza(I i2) throws Exception {
        return zzb(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final zzfsm<O> zzb(I i2) {
        zzchl zzchlVar = new zzchl();
        zzbtm zzg = this.zzc.zzg(null);
        zzg.zzf(new zzbuh(this, zzg, i2, zzchlVar), new zzbui(this, zzchlVar, zzg));
        return zzchlVar;
    }
}
