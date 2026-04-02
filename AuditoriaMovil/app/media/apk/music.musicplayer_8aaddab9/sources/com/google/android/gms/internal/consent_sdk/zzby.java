package com.google.android.gms.internal.consent_sdk;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class zzby {
    public String zzb;
    public String zzc;
    public String zzd;
    public int zza = zzbu.zzg;
    public List<String> zze = Collections.emptyList();
    public List<zzbx> zzf = Collections.emptyList();

    public static zzby zza(JsonReader jsonReader) throws IOException {
        zzby zzbyVar = new zzby();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c2 = 65535;
            switch (nextName.hashCode()) {
                case -2001388947:
                    if (nextName.equals("consent_signal")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1938755376:
                    if (nextName.equals("error_message")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1851537225:
                    if (nextName.equals("consent_form_base_url")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1161803523:
                    if (nextName.equals("actions")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -986806987:
                    if (nextName.equals("request_info_keys")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -790907624:
                    if (nextName.equals("consent_form_payload")) {
                        c2 = 5;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    zzbyVar.zza = zzbu.zzb(jsonReader);
                    break;
                case 1:
                    zzbyVar.zzd = jsonReader.nextString();
                    break;
                case 2:
                    zzbyVar.zzc = jsonReader.nextString();
                    break;
                case 3:
                    zzbyVar.zzf = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzbx zzbxVar = new zzbx();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            nextName2.hashCode();
                            if (nextName2.equals("args_json")) {
                                zzbxVar.zzb = jsonReader.nextString();
                            } else if (nextName2.equals("action_type")) {
                                zzbxVar.zza = zzbu.zza(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        zzbyVar.zzf.add(zzbxVar);
                    }
                    jsonReader.endArray();
                    break;
                case 4:
                    zzbyVar.zze = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzbyVar.zze.add(jsonReader.nextString());
                    }
                    jsonReader.endArray();
                    break;
                case 5:
                    zzbyVar.zzb = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return zzbyVar;
    }
}
