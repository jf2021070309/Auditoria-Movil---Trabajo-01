package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import e.a.d.a.a;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzdoy {
    private final zzfsn zza;
    private final zzdpl zzb;
    private final zzdpq zzc;

    public zzdoy(zzfsn zzfsnVar, zzdpl zzdplVar, zzdpq zzdpqVar) {
        this.zza = zzfsnVar;
        this.zzb = zzdplVar;
        this.zzc = zzdpqVar;
    }

    public final zzfsm<zzdmm> zza(final zzfal zzfalVar, final zzezz zzezzVar, final JSONObject jSONObject) {
        zzfsm zza;
        final zzfsm zzb = this.zza.zzb(new Callable(this, zzfalVar, zzezzVar, jSONObject) { // from class: com.google.android.gms.internal.ads.zzdow
            private final zzdoy zza;
            private final zzfal zzb;
            private final zzezz zzc;
            private final JSONObject zzd;

            {
                this.zza = this;
                this.zzb = zzfalVar;
                this.zzc = zzezzVar;
                this.zzd = jSONObject;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfal zzfalVar2 = this.zzb;
                zzezz zzezzVar2 = this.zzc;
                JSONObject jSONObject2 = this.zzd;
                zzdmm zzdmmVar = new zzdmm();
                zzdmmVar.zza(jSONObject2.optInt("template_id", -1));
                zzdmmVar.zzl(jSONObject2.optString("custom_template_id"));
                JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
                zzdmmVar.zzt(optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null);
                zzfar zzfarVar = zzfalVar2.zza.zza;
                if (zzfarVar.zzg.contains(Integer.toString(zzdmmVar.zzv()))) {
                    if (zzdmmVar.zzv() == 3) {
                        if (zzdmmVar.zzQ() == null) {
                            throw new zzehs(1, "No custom template id for custom template ad response.");
                        }
                        if (!zzfarVar.zzh.contains(zzdmmVar.zzQ())) {
                            throw new zzehs(1, "Unexpected custom template id in the response.");
                        }
                    }
                    zzdmmVar.zzi(jSONObject2.optDouble("rating", -1.0d));
                    String optString = jSONObject2.optString("headline", null);
                    if (zzezzVar2.zzI) {
                        com.google.android.gms.ads.internal.zzt.zzc();
                        String zzC = com.google.android.gms.ads.internal.util.zzs.zzC();
                        optString = a.s(new StringBuilder(String.valueOf(zzC).length() + 3 + String.valueOf(optString).length()), zzC, " : ", optString);
                    }
                    zzdmmVar.zzq("headline", optString);
                    zzdmmVar.zzq("body", jSONObject2.optString("body", null));
                    zzdmmVar.zzq("call_to_action", jSONObject2.optString("call_to_action", null));
                    zzdmmVar.zzq("store", jSONObject2.optString("store", null));
                    zzdmmVar.zzq("price", jSONObject2.optString("price", null));
                    zzdmmVar.zzq("advertiser", jSONObject2.optString("advertiser", null));
                    return zzdmmVar;
                }
                throw new zzehs(1, a.R(32, "Invalid template ID: ", zzdmmVar.zzv()));
            }
        });
        final zzfsm<List<zzblr>> zzb2 = this.zzb.zzb(jSONObject, "images");
        final zzfsm<zzcml> zzc = this.zzb.zzc(jSONObject, "images", zzezzVar, zzfalVar.zzb.zzb);
        final zzfsm<zzblr> zza2 = this.zzb.zza(jSONObject, "secondary_image");
        final zzfsm<zzblr> zza3 = this.zzb.zza(jSONObject, "app_icon");
        final zzfsm<zzblo> zzd = this.zzb.zzd(jSONObject, "attribution");
        final zzfsm<zzcml> zze = this.zzb.zze(jSONObject, zzezzVar, zzfalVar.zzb.zzb);
        final zzdpl zzdplVar = this.zzb;
        if (jSONObject.optBoolean("enable_omid")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
            if (optJSONObject == null) {
                zza = zzfsd.zza(null);
            } else {
                final String optString = optJSONObject.optString("omid_html");
                zza = TextUtils.isEmpty(optString) ? zzfsd.zza(null) : zzfsd.zzi(zzfsd.zza(null), new zzfrk(zzdplVar, optString) { // from class: com.google.android.gms.internal.ads.zzdpg
                    private final zzdpl zza;
                    private final String zzb;

                    {
                        this.zza = zzdplVar;
                        this.zzb = optString;
                    }

                    @Override // com.google.android.gms.internal.ads.zzfrk
                    public final zzfsm zza(Object obj) {
                        return this.zza.zzf(this.zzb, obj);
                    }
                }, zzchg.zze);
            }
        } else {
            zza = zzfsd.zza(null);
        }
        final zzfsm zzfsmVar = zza;
        final zzfsm<List<zzdpp>> zza4 = this.zzc.zza(jSONObject, "custom_assets");
        return zzfsd.zzl(zzb, zzb2, zzc, zza2, zza3, zzd, zze, zzfsmVar, zza4).zza(new Callable(this, zzb, zzb2, zza3, zza2, zzd, jSONObject, zze, zzc, zzfsmVar, zza4) { // from class: com.google.android.gms.internal.ads.zzdox
            private final zzdoy zza;
            private final zzfsm zzb;
            private final zzfsm zzc;
            private final zzfsm zzd;
            private final zzfsm zze;
            private final zzfsm zzf;
            private final JSONObject zzg;
            private final zzfsm zzh;
            private final zzfsm zzi;
            private final zzfsm zzj;
            private final zzfsm zzk;

            {
                this.zza = this;
                this.zzb = zzb;
                this.zzc = zzb2;
                this.zzd = zza3;
                this.zze = zza2;
                this.zzf = zzd;
                this.zzg = jSONObject;
                this.zzh = zze;
                this.zzi = zzc;
                this.zzj = zzfsmVar;
                this.zzk = zza4;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfsm zzfsmVar2 = this.zzb;
                zzfsm zzfsmVar3 = this.zzc;
                zzfsm zzfsmVar4 = this.zzd;
                zzfsm zzfsmVar5 = this.zze;
                zzfsm zzfsmVar6 = this.zzf;
                JSONObject jSONObject2 = this.zzg;
                zzfsm zzfsmVar7 = this.zzh;
                zzfsm zzfsmVar8 = this.zzi;
                zzfsm zzfsmVar9 = this.zzj;
                zzfsm zzfsmVar10 = this.zzk;
                zzdmm zzdmmVar = (zzdmm) zzfsmVar2.get();
                zzdmmVar.zzd((List) zzfsmVar3.get());
                zzdmmVar.zzj((zzbmh) zzfsmVar4.get());
                zzdmmVar.zzk((zzbmh) zzfsmVar5.get());
                zzdmmVar.zzc((zzblz) zzfsmVar6.get());
                zzdmmVar.zze(zzdpl.zzj(jSONObject2));
                zzdmmVar.zzf(zzdpl.zzi(jSONObject2));
                zzcml zzcmlVar = (zzcml) zzfsmVar7.get();
                if (zzcmlVar != null) {
                    zzdmmVar.zzm(zzcmlVar);
                    zzdmmVar.zzg(zzcmlVar.zzH());
                    zzdmmVar.zzb(zzcmlVar.zzh());
                }
                zzcml zzcmlVar2 = (zzcml) zzfsmVar8.get();
                if (zzcmlVar2 != null) {
                    zzdmmVar.zzn(zzcmlVar2);
                    zzdmmVar.zzh(zzcmlVar2.zzH());
                }
                zzcml zzcmlVar3 = (zzcml) zzfsmVar9.get();
                if (zzcmlVar3 != null) {
                    zzdmmVar.zzo(zzcmlVar3);
                }
                for (zzdpp zzdppVar : (List) zzfsmVar10.get()) {
                    if (zzdppVar.zza != 1) {
                        zzdmmVar.zzr(zzdppVar.zzb, zzdppVar.zzd);
                    } else {
                        zzdmmVar.zzq(zzdppVar.zzb, zzdppVar.zzc);
                    }
                }
                return zzdmmVar;
            }
        }, this.zza);
    }
}
