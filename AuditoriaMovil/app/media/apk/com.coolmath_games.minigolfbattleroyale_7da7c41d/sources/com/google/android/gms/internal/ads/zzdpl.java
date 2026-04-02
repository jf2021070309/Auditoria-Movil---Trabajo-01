package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.games.GamesStatusCodes;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vungle.warren.analytics.AnalyticsEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdpl {
    private final Context zza;
    private final zzdou zzb;
    private final zzaas zzc;
    private final zzcgz zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzazb zzf;
    private final Executor zzg;
    private final zzblv zzh;
    private final zzdqd zzi;
    private final zzdss zzj;
    private final ScheduledExecutorService zzk;
    private final zzdrn zzl;
    private final zzdvi zzm;
    private final zzffc zzn;
    private final zzffu zzo;
    private final zzedq zzp;

    public zzdpl(Context context, zzdou zzdouVar, zzaas zzaasVar, zzcgz zzcgzVar, com.google.android.gms.ads.internal.zza zzaVar, zzazb zzazbVar, Executor executor, zzfar zzfarVar, zzdqd zzdqdVar, zzdss zzdssVar, ScheduledExecutorService scheduledExecutorService, zzdvi zzdviVar, zzffc zzffcVar, zzffu zzffuVar, zzedq zzedqVar, zzdrn zzdrnVar) {
        this.zza = context;
        this.zzb = zzdouVar;
        this.zzc = zzaasVar;
        this.zzd = zzcgzVar;
        this.zze = zzaVar;
        this.zzf = zzazbVar;
        this.zzg = executor;
        this.zzh = zzfarVar.zzi;
        this.zzi = zzdqdVar;
        this.zzj = zzdssVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdviVar;
        this.zzn = zzffcVar;
        this.zzo = zzffuVar;
        this.zzp = zzedqVar;
        this.zzl = zzdrnVar;
    }

    public static final zzbhu zzi(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject(AnalyticsEvent.Ad.mute);
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzr(optJSONObject);
    }

    public static final List<zzbhu> zzj(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(AnalyticsEvent.Ad.mute);
        if (optJSONObject == null) {
            return zzfoj.zzi();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzfoj.zzi();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            zzbhu zzr = zzr(optJSONArray.optJSONObject(i));
            if (zzr != null) {
                arrayList.add(zzr);
            }
        }
        return zzfoj.zzp(arrayList);
    }

    private final zzfsm<List<zzblr>> zzk(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzfsd.zza(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(zzl(jSONArray.optJSONObject(i), z));
        }
        return zzfsd.zzj(zzfsd.zzk(arrayList), zzdpa.zza, this.zzg);
    }

    private final zzfsm<zzblr> zzl(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return zzfsd.zza(null);
        }
        final String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return zzfsd.zza(null);
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, -1);
        final int optInt2 = jSONObject.optInt(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, -1);
        if (z) {
            return zzfsd.zza(new zzblr(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return zzp(jSONObject.optBoolean("require"), zzfsd.zzj(this.zzb.zza(optString, optDouble, optBoolean), new zzfln(optString, optDouble, optInt, optInt2) { // from class: com.google.android.gms.internal.ads.zzdpc
            private final String zza;
            private final double zzb;
            private final int zzc;
            private final int zzd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = optString;
                this.zzb = optDouble;
                this.zzc = optInt;
                this.zzd = optInt2;
            }

            @Override // com.google.android.gms.internal.ads.zzfln
            public final Object apply(Object obj) {
                String str = this.zza;
                return new zzblr(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), this.zzb, this.zzc, this.zzd);
            }
        }, this.zzg), null);
    }

    private static Integer zzm(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private final zzfsm<zzcml> zzn(JSONObject jSONObject, zzezz zzezzVar, zzfac zzfacVar) {
        final zzfsm<zzcml> zzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzezzVar, zzfacVar, zzq(jSONObject.optInt(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, 0), jSONObject.optInt(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, 0)));
        return zzfsd.zzi(zzb, new zzfrk(zzb) { // from class: com.google.android.gms.internal.ads.zzdph
            private final zzfsm zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzb;
            }

            @Override // com.google.android.gms.internal.ads.zzfrk
            public final zzfsm zza(Object obj) {
                zzfsm zzfsmVar = this.zza;
                zzcml zzcmlVar = (zzcml) obj;
                if (zzcmlVar == null || zzcmlVar.zzh() == null) {
                    throw new zzehs(1, "Retrieve video view in html5 ad response failed.");
                }
                return zzfsmVar;
            }
        }, zzchg.zzf);
    }

    private static <T> zzfsm<T> zzo(zzfsm<T> zzfsmVar, T t) {
        return zzfsd.zzg(zzfsmVar, Exception.class, new zzfrk(null) { // from class: com.google.android.gms.internal.ads.zzdpi
            @Override // com.google.android.gms.internal.ads.zzfrk
            public final zzfsm zza(Object obj) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (Exception) obj);
                return zzfsd.zza(null);
            }
        }, zzchg.zzf);
    }

    private static <T> zzfsm<T> zzp(boolean z, final zzfsm<T> zzfsmVar, T t) {
        if (z) {
            return zzfsd.zzi(zzfsmVar, new zzfrk(zzfsmVar) { // from class: com.google.android.gms.internal.ads.zzdpj
                private final zzfsm zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzfsmVar;
                }

                @Override // com.google.android.gms.internal.ads.zzfrk
                public final zzfsm zza(Object obj) {
                    return obj != null ? this.zza : zzfsd.zzc(new zzehs(1, "Retrieve required value in native ad response failed."));
                }
            }, zzchg.zzf);
        }
        return zzo(zzfsmVar, null);
    }

    private static final zzbhu zzr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString(IronSourceConstants.EVENTS_ERROR_REASON);
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new zzbhu(optString, optString2);
    }

    public final zzfsm<zzblr> zza(JSONObject jSONObject, String str) {
        return zzl(jSONObject.optJSONObject(str), this.zzh.zzb);
    }

    public final zzfsm<List<zzblr>> zzb(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        zzblv zzblvVar = this.zzh;
        return zzk(optJSONArray, zzblvVar.zzb, zzblvVar.zzd);
    }

    public final zzfsm<zzcml> zzc(JSONObject jSONObject, String str, final zzezz zzezzVar, final zzfac zzfacVar) {
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzgO)).booleanValue()) {
            return zzfsd.zza(null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzfsd.zza(null);
        }
        JSONObject optJSONObject = optJSONArray.optJSONObject(0);
        if (optJSONObject == null) {
            return zzfsd.zza(null);
        }
        final String optString = optJSONObject.optString("base_url");
        final String optString2 = optJSONObject.optString("html");
        final zzbdl zzq = zzq(optJSONObject.optInt(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, 0), optJSONObject.optInt(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, 0));
        if (!TextUtils.isEmpty(optString2)) {
            final zzfsm zzi = zzfsd.zzi(zzfsd.zza(null), new zzfrk(this, zzq, zzezzVar, zzfacVar, optString, optString2) { // from class: com.google.android.gms.internal.ads.zzdpd
                private final zzdpl zza;
                private final zzbdl zzb;
                private final zzezz zzc;
                private final zzfac zzd;
                private final String zze;
                private final String zzf;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = zzq;
                    this.zzc = zzezzVar;
                    this.zzd = zzfacVar;
                    this.zze = optString;
                    this.zzf = optString2;
                }

                @Override // com.google.android.gms.internal.ads.zzfrk
                public final zzfsm zza(Object obj) {
                    return this.zza.zzh(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, obj);
                }
            }, zzchg.zze);
            return zzfsd.zzi(zzi, new zzfrk(zzi) { // from class: com.google.android.gms.internal.ads.zzdpe
                private final zzfsm zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzi;
                }

                @Override // com.google.android.gms.internal.ads.zzfrk
                public final zzfsm zza(Object obj) {
                    zzfsm zzfsmVar = this.zza;
                    if (((zzcml) obj) != null) {
                        return zzfsmVar;
                    }
                    throw new zzehs(1, "Retrieve Web View from image ad response failed.");
                }
            }, zzchg.zzf);
        }
        return zzfsd.zza(null);
    }

    public final zzfsm<zzblo> zzd(JSONObject jSONObject, String str) {
        final JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzfsd.zza(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zzp(optJSONObject.optBoolean("require"), zzfsd.zzj(zzk(optJSONArray, false, true), new zzfln(this, optJSONObject) { // from class: com.google.android.gms.internal.ads.zzdpf
            private final zzdpl zza;
            private final JSONObject zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = optJSONObject;
            }

            @Override // com.google.android.gms.internal.ads.zzfln
            public final Object apply(Object obj) {
                return this.zza.zzg(this.zzb, (List) obj);
            }
        }, this.zzg), null);
    }

    public final zzfsm<zzcml> zze(JSONObject jSONObject, zzezz zzezzVar, zzfac zzfacVar) {
        zzfsm<zzcml> zza;
        JSONObject zzh = com.google.android.gms.ads.internal.util.zzbx.zzh(jSONObject, "html_containers", "instream");
        if (zzh == null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video");
            if (optJSONObject == null) {
                return zzfsd.zza(null);
            }
            String optString = optJSONObject.optString("vast_xml");
            boolean z = false;
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgN)).booleanValue() && optJSONObject.has("html")) {
                z = true;
            }
            if (TextUtils.isEmpty(optString)) {
                if (!z) {
                    com.google.android.gms.ads.internal.util.zze.zzi("Required field 'vast_xml' or 'html' is missing");
                    return zzfsd.zza(null);
                }
            } else if (!z) {
                zza = this.zzi.zza(optJSONObject);
                return zzo(zzfsd.zzh(zza, ((Integer) zzbet.zzc().zzc(zzbjl.zzcl)).intValue(), TimeUnit.SECONDS, this.zzk), null);
            }
            zza = zzn(optJSONObject, zzezzVar, zzfacVar);
            return zzo(zzfsd.zzh(zza, ((Integer) zzbet.zzc().zzc(zzbjl.zzcl)).intValue(), TimeUnit.SECONDS, this.zzk), null);
        }
        return zzn(zzh, zzezzVar, zzfacVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfsm zzf(String str, Object obj) throws Exception {
        com.google.android.gms.ads.internal.zzt.zzd();
        zzcml zza = zzcmx.zza(this.zza, zzcob.zzb(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null);
        final zzchk zza2 = zzchk.zza(zza);
        zza.zzR().zzy(new zzcnx(zza2) { // from class: com.google.android.gms.internal.ads.zzdpk
            private final zzchk zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zza2;
            }

            @Override // com.google.android.gms.internal.ads.zzcnx
            public final void zza(boolean z) {
                this.zza.zzb();
            }
        });
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdx)).booleanValue()) {
            zza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            zza.loadData(str, "text/html", "UTF-8");
        }
        return zza2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzblo zzg(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer zzm = zzm(jSONObject, "bg_color");
        Integer zzm2 = zzm(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzblo(optString, list, zzm, zzm2, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("presentation_ms", GamesStatusCodes.STATUS_SNAPSHOT_NOT_FOUND) + optInt2, this.zzh.zze, optBoolean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfsm zzh(zzbdl zzbdlVar, zzezz zzezzVar, zzfac zzfacVar, String str, String str2, Object obj) throws Exception {
        zzcml zzb = this.zzj.zzb(zzbdlVar, zzezzVar, zzfacVar);
        final zzchk zza = zzchk.zza(zzb);
        zzdrk zzb2 = this.zzl.zzb();
        zzb.zzR().zzL(zzb2, zzb2, zzb2, zzb2, zzb2, false, null, new com.google.android.gms.ads.internal.zzb(this.zza, null, null), null, null, this.zzp, this.zzo, this.zzm, this.zzn, null, zzb2);
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzck)).booleanValue()) {
            zzb.zzab("/getNativeAdViewSignals", zzbpq.zzs);
        }
        zzb.zzab("/getNativeClickMeta", zzbpq.zzt);
        zzb.zzR().zzy(new zzcnx(zza) { // from class: com.google.android.gms.internal.ads.zzdpb
            private final zzchk zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zza;
            }

            @Override // com.google.android.gms.internal.ads.zzcnx
            public final void zza(boolean z) {
                zzchk zzchkVar = this.zza;
                if (z) {
                    zzchkVar.zzb();
                } else {
                    zzchkVar.zzd(new zzehs(1, "Image Web View failed to load."));
                }
            }
        });
        zzb.zzat(str, str2, null);
        return zza;
    }

    private final zzbdl zzq(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return zzbdl.zzb();
            }
            i = 0;
        }
        return new zzbdl(this.zza, new AdSize(i, i2));
    }
}
