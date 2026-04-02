package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.ads.mediation.facebook.FacebookAdapter;
import java.net.URISyntaxException;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzbpq {
    public static final zzbpr<zzcml> zza = zzbov.zza;
    public static final zzbpr<zzcml> zzb = zzbow.zza;
    public static final zzbpr<zzcml> zzc = zzbox.zza;
    public static final zzbpr<zzcml> zzd = new zzbpi();
    public static final zzbpr<zzcml> zze = new zzbpj();
    public static final zzbpr<zzcml> zzf = zzbpc.zza;
    public static final zzbpr<Object> zzg = new zzbpk();
    public static final zzbpr<zzcml> zzh = new zzbpl();
    public static final zzbpr<zzcml> zzi = zzbpd.zza;
    public static final zzbpr<zzcml> zzj = new zzbpm();
    public static final zzbpr<zzcml> zzk = new zzbpn();
    public static final zzbpr<zzcjb> zzl = new zzcko();
    public static final zzbpr<zzcjb> zzm = new zzckp();
    public static final zzbpr<zzcml> zzn = new zzbou();
    public static final zzbqf zzo = new zzbqf();
    public static final zzbpr<zzcml> zzp = new zzbpo();
    public static final zzbpr<zzcml> zzq = new zzbpp();
    public static final zzbpr<zzcml> zzr = new zzbpe();
    public static final zzbpr<zzcml> zzs = new zzbpf();
    public static final zzbpr<zzcml> zzt = new zzbpg();

    public static zzfsm<String> zza(zzcml zzcmlVar, String str) {
        Uri parse = Uri.parse(str);
        try {
            zzaas zzU = zzcmlVar.zzU();
            if (zzU != null && zzU.zza(parse)) {
                parse = zzU.zze(parse, zzcmlVar.getContext(), zzcmlVar.zzH(), zzcmlVar.zzj());
            }
        } catch (zzaat unused) {
            zzcgt.zzi(str.length() != 0 ? "Unable to append parameter to URL: ".concat(str) : new String("Unable to append parameter to URL: "));
        }
        final String zzb2 = zzcfc.zzb(parse, zzcmlVar.getContext());
        long longValue = zzbkx.zze.zze().longValue();
        if (longValue <= 0 || longValue > 213806100) {
            return zzfsd.zza(zzb2);
        }
        zzfru zzw = zzfru.zzw((zzfsm) zzcmlVar.zzaE());
        zzfln zzflnVar = zzboy.zza;
        zzfsn zzfsnVar = zzchg.zzf;
        return zzfsd.zzf(zzfsd.zzj(zzfsd.zzf(zzw, Throwable.class, zzflnVar, zzfsnVar), new zzfln(zzb2) { // from class: com.google.android.gms.internal.ads.zzboz
            private final String zza;

            {
                this.zza = zzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzfln
            public final Object apply(Object obj) {
                String str2 = this.zza;
                String str3 = (String) obj;
                zzbpr<zzcml> zzbprVar = zzbpq.zza;
                if (str3 != null) {
                    if (zzbkx.zzf.zze().booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(str2).getHost();
                        for (int i2 = 0; i2 < 3; i2++) {
                            if (!host.endsWith(strArr[i2])) {
                            }
                        }
                    }
                    String zze2 = zzbkx.zza.zze();
                    String zze3 = zzbkx.zzb.zze();
                    if (!TextUtils.isEmpty(zze2)) {
                        str2 = str2.replace(zze2, str3);
                    }
                    if (!TextUtils.isEmpty(zze3)) {
                        Uri parse2 = Uri.parse(str2);
                        if (TextUtils.isEmpty(parse2.getQueryParameter(zze3))) {
                            return parse2.buildUpon().appendQueryParameter(zze3, str3).toString();
                        }
                    }
                }
                return str2;
            }
        }, zzfsnVar), Throwable.class, new zzfln(zzb2) { // from class: com.google.android.gms.internal.ads.zzbpa
            private final String zza;

            {
                this.zza = zzb2;
            }

            @Override // com.google.android.gms.internal.ads.zzfln
            public final Object apply(Object obj) {
                String str2 = this.zza;
                Throwable th = (Throwable) obj;
                zzbpr<zzcml> zzbprVar = zzbpq.zza;
                if (zzbkx.zzk.zze().booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzg().zzk(th, "prepareClickUrl.attestation2");
                }
                return str2;
            }
        }, zzfsnVar);
    }

    public static zzbpr<zzcml> zzb(final zzdio zzdioVar) {
        return new zzbpr(zzdioVar) { // from class: com.google.android.gms.internal.ads.zzbpb
            private final zzdio zza;

            {
                this.zza = zzdioVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbpr
            public final void zza(Object obj, Map map) {
                zzcml zzcmlVar = (zzcml) obj;
                zzbpq.zzc(map, this.zza);
                String str = (String) map.get("u");
                if (str == null) {
                    zzcgt.zzi("URL missing from click GMSG.");
                } else {
                    zzfsd.zzp(zzbpq.zza(zzcmlVar, str), new zzbph(zzcmlVar), zzchg.zza);
                }
            }
        };
    }

    public static void zzc(Map<String, String> map, zzdio zzdioVar) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzha)).booleanValue() && map.containsKey("sc") && map.get("sc").equals("1") && zzdioVar != null) {
            zzdioVar.zzb();
        }
    }

    public static final /* synthetic */ void zzd(zzcnn zzcnnVar, Map map) {
        PackageManager packageManager = zzcnnVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        String optString = jSONObject2.optString(FacebookAdapter.KEY_ID);
                        String optString2 = jSONObject2.optString("u");
                        String optString3 = jSONObject2.optString(IntegerTokenConverter.CONVERTER_KEY);
                        String optString4 = jSONObject2.optString("m");
                        String optString5 = jSONObject2.optString("p");
                        String optString6 = jSONObject2.optString("c");
                        String optString7 = jSONObject2.optString("intent_url");
                        Intent intent = null;
                        if (!TextUtils.isEmpty(optString7)) {
                            try {
                                intent = Intent.parseUri(optString7, 0);
                            } catch (URISyntaxException e2) {
                                String valueOf = String.valueOf(optString7);
                                zzcgt.zzg(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), e2);
                            }
                        }
                        if (intent == null) {
                            intent = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                intent.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                intent.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                intent.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    intent.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        try {
                            jSONObject.put(optString, packageManager.resolveActivity(intent, 65536) != null);
                        } catch (JSONException e3) {
                            zzcgt.zzg("Error constructing openable urls response.", e3);
                        }
                    } catch (JSONException e4) {
                        zzcgt.zzg("Error parsing the intent data.", e4);
                    }
                }
                ((zzbsi) zzcnnVar).zzd("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((zzbsi) zzcnnVar).zzd("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zzbsi) zzcnnVar).zzd("openableIntents", new JSONObject());
        }
    }
}
