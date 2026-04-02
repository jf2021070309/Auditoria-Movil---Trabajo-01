package com.google.android.gms.internal.ads;

import com.google.ads.mediation.facebook.FacebookAdapter;
import java.util.UUID;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzbus<I, O> implements zzfrk<I, O> {
    private final zzbty<O> zza;
    private final zzbtz<I> zzb;
    private final String zzc = "google.afma.activeView.handleUpdate";
    private final zzfsm<zzbtt> zzd;

    public zzbus(zzfsm<zzbtt> zzfsmVar, String str, zzbtz<I> zzbtzVar, zzbty<O> zzbtyVar) {
        this.zzd = zzfsmVar;
        this.zzb = zzbtzVar;
        this.zza = zzbtyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrk
    public final zzfsm<O> zza(I i2) throws Exception {
        return zzb(i2);
    }

    public final zzfsm<O> zzb(final I i2) {
        return zzfsd.zzi(this.zzd, new zzfrk(this, i2) { // from class: com.google.android.gms.internal.ads.zzbuq
            private final zzbus zza;
            private final Object zzb;

            {
                this.zza = this;
                this.zzb = i2;
            }

            @Override // com.google.android.gms.internal.ads.zzfrk
            public final zzfsm zza(Object obj) {
                return this.zza.zzc(this.zzb, (zzbtt) obj);
            }
        }, zzchg.zzf);
    }

    public final /* synthetic */ zzfsm zzc(Object obj, zzbtt zzbttVar) throws Exception {
        zzchl zzchlVar = new zzchl();
        com.google.android.gms.ads.internal.zzt.zzc();
        String uuid = UUID.randomUUID().toString();
        zzbpq.zzo.zzb(uuid, new zzbur(this, zzchlVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FacebookAdapter.KEY_ID, uuid);
        jSONObject.put("args", (JSONObject) obj);
        zzbttVar.zzr(this.zzc, jSONObject);
        return zzchlVar;
    }
}
