package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzdwo extends zzbqo {
    private final zzdwr zza;
    private final zzdwm zzb;
    private final Map<Long, zzdwh> zzc = new HashMap();

    public zzdwo(zzdwr zzdwrVar, zzdwm zzdwmVar) {
        this.zza = zzdwrVar;
        this.zzb = zzdwmVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static zzbdg zzc(Map<String, String> map) {
        char c2;
        zzbdh zzbdhVar = new zzbdh();
        String str = map.get("ad_request");
        if (str == null) {
            return zzbdhVar.zza();
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                switch (nextName.hashCode()) {
                    case -1289032093:
                        if (nextName.equals("extras")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -839117230:
                        if (nextName.equals("isTestDevice")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -733436947:
                        if (nextName.equals("tagForUnderAgeOfConsent")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -99890337:
                        if (nextName.equals("httpTimeoutMillis")) {
                            c2 = 6;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 523149226:
                        if (nextName.equals("keywords")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 597632527:
                        if (nextName.equals("maxAdContentRating")) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1411582723:
                        if (nextName.equals("tagForChildDirectedTreatment")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                        jsonReader.beginObject();
                        Bundle bundle = new Bundle();
                        while (jsonReader.hasNext()) {
                            bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        zzbdhVar.zzb(bundle);
                        break;
                    case 1:
                        jsonReader.beginArray();
                        ArrayList arrayList = new ArrayList();
                        while (jsonReader.hasNext()) {
                            arrayList.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                        zzbdhVar.zzc(arrayList);
                        break;
                    case 2:
                        zzbdhVar.zzd(jsonReader.nextBoolean());
                        break;
                    case 3:
                        if (!jsonReader.nextBoolean()) {
                            zzbdhVar.zze(0);
                            break;
                        } else {
                            zzbdhVar.zze(1);
                            break;
                        }
                    case 4:
                        if (!jsonReader.nextBoolean()) {
                            zzbdhVar.zzf(0);
                            break;
                        } else {
                            zzbdhVar.zzf(1);
                            break;
                        }
                    case 5:
                        String nextString = jsonReader.nextString();
                        if (!RequestConfiguration.zza.contains(nextString)) {
                            break;
                        } else {
                            zzbdhVar.zzg(nextString);
                            break;
                        }
                    case 6:
                        zzbdhVar.zzh(jsonReader.nextInt());
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
            zzcgt.zzd("Ad Request json was malformed, parsing ended early.");
        }
        zzbdg zza = zzbdhVar.zza();
        Bundle bundle2 = zza.zzm.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 == null) {
            bundle2 = zza.zzc;
            zza.zzm.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle2);
        }
        return new zzbdg(zza.zza, zza.zzb, bundle2, zza.zzd, zza.zze, zza.zzf, zza.zzg, zza.zzh, zza.zzi, zza.zzj, zza.zzk, zza.zzl, zza.zzm, zza.zzn, zza.zzo, zza.zzp, zza.zzq, zza.zzr, zza.zzs, zza.zzt, zza.zzu, zza.zzv, zza.zzw, zza.zzx);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b0, code lost:
        if (r0.equals("create_interstitial_ad") != false) goto L29;
     */
    @Override // com.google.android.gms.internal.ads.zzbqp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zze(java.lang.String r12) throws android.os.RemoteException {
        /*
            Method dump skipped, instructions count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdwo.zze(java.lang.String):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbqp
    public final void zzf() {
        this.zzc.clear();
    }
}
