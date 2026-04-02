package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzeke {
    private final Map<String, zzekg> zza = new HashMap();
    private final Map<String, zzeki> zzb = new HashMap();
    private final Map<String, Map<String, List<zzekg>>> zzc = new HashMap();
    private final Executor zzd;
    private JSONObject zze;

    public zzeke(Executor executor) {
        this.zzd = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzg */
    public final synchronized void zzf() {
        this.zzb.clear();
        this.zza.clear();
        zzi();
        zzh();
    }

    private final synchronized void zzh() {
        if (!zzblc.zze.zze().booleanValue()) {
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbh)).booleanValue()) {
                JSONObject zzg = com.google.android.gms.ads.internal.zzt.zzg().zzp().zzn().zzg();
                if (zzg == null) {
                    return;
                }
                try {
                    JSONArray jSONArray = zzg.getJSONArray("signal_adapters");
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i2);
                        Bundle zzl = zzl(jSONObject.optJSONObject("data"));
                        String optString = jSONObject.optString("adapter_class_name");
                        boolean optBoolean = jSONObject.optBoolean("render", false);
                        boolean optBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(optString)) {
                            this.zzb.put(optString, new zzeki(optString, optBoolean2, optBoolean, zzl));
                        }
                    }
                } catch (JSONException e2) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e2);
                }
            }
        }
    }

    private final synchronized void zzi() {
        JSONArray optJSONArray;
        JSONObject zzg = com.google.android.gms.ads.internal.zzt.zzg().zzp().zzn().zzg();
        if (zzg != null) {
            try {
                JSONArray optJSONArray2 = zzg.optJSONArray("ad_unit_id_settings");
                this.zze = zzg.optJSONObject("ad_unit_patterns");
                if (optJSONArray2 != null) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        JSONObject jSONObject = optJSONArray2.getJSONObject(i2);
                        String optString = jSONObject.optString("ad_unit_id", "");
                        String optString2 = jSONObject.optString("format", "");
                        ArrayList arrayList = new ArrayList();
                        JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                        if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ad_networks")) != null) {
                            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                                arrayList.addAll(zzj(optJSONArray.getJSONObject(i3), optString2));
                            }
                        }
                        zzk(optString2, optString, arrayList);
                    }
                }
            } catch (JSONException e2) {
                com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e2);
            }
        }
    }

    private final synchronized List<zzekg> zzj(JSONObject jSONObject, String str) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        Bundle zzl = zzl(jSONObject.optJSONObject("data"));
        JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
        if (optJSONArray == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            String optString = optJSONArray.optString(i2, "");
            if (!TextUtils.isEmpty(optString)) {
                arrayList2.add(optString);
            }
        }
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            String str2 = (String) arrayList2.get(i3);
            zzd(str2);
            if (this.zza.get(str2) != null) {
                arrayList.add(new zzekg(str2, str, zzl));
            }
        }
        return arrayList;
    }

    private final synchronized void zzk(String str, String str2, List<zzekg> list) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        Map<String, List<zzekg>> map = this.zzc.get(str);
        if (map == null) {
            map = new HashMap<>();
        }
        this.zzc.put(str, map);
        List<zzekg> list2 = map.get(str2);
        if (list2 == null) {
            list2 = new ArrayList<>();
        }
        list2.addAll(list);
        map.put(str2, list2);
    }

    private static final Bundle zzl(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final void zza() {
        com.google.android.gms.ads.internal.zzt.zzg().zzp().zzp(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzekb
            private final zzeke zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zze();
            }
        });
        this.zzd.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzekc
            private final zzeke zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzf();
            }
        });
    }

    public final synchronized Map<String, zzeki> zzb() {
        return zzfon.zzb(this.zzb);
    }

    public final synchronized Map<String, List<Bundle>> zzc(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Map<String, List<zzekg>> map = this.zzc.get(str);
            if (map == null) {
                return zzfon.zza();
            }
            List<zzekg> list = map.get(str2);
            if (list == null) {
                list = map.get(zzdtm.zza(this.zze, str2, str));
            }
            if (list == null) {
                return zzfon.zza();
            }
            HashMap hashMap = new HashMap();
            for (zzekg zzekgVar : list) {
                String str3 = zzekgVar.zza;
                if (!hashMap.containsKey(str3)) {
                    hashMap.put(str3, new ArrayList());
                }
                ((List) hashMap.get(str3)).add(zzekgVar.zzc);
            }
            return zzfon.zzb(hashMap);
        }
        return zzfon.zza();
    }

    public final synchronized void zzd(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.zza.containsKey(str)) {
            return;
        }
        this.zza.put(str, new zzekg(str, "", new Bundle()));
    }

    public final /* synthetic */ void zze() {
        this.zzd.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzekd
            private final zzeke zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzf();
            }
        });
    }
}
