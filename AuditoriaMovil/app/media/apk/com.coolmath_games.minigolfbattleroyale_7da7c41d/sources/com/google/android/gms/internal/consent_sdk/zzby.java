package com.google.android.gms.internal.consent_sdk;

import android.util.JsonReader;
import com.facebook.share.internal.ShareConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.ump:user-messaging-platform@@1.0.0 */
/* loaded from: classes2.dex */
public final class zzby {
    public String zzb;
    public String zzc;
    public String zzd;
    public int zza = zzbu.zzg;
    public List<String> zze = Collections.emptyList();
    public List<zzbx> zzf = Collections.emptyList();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzby zza(JsonReader jsonReader) throws IOException {
        boolean z;
        boolean z2;
        zzby zzbyVar = new zzby();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            switch (nextName.hashCode()) {
                case -2001388947:
                    if (nextName.equals("consent_signal")) {
                        z = false;
                        break;
                    }
                    z = true;
                    break;
                case -1938755376:
                    if (nextName.equals("error_message")) {
                        z = true;
                        break;
                    }
                    z = true;
                    break;
                case -1851537225:
                    if (nextName.equals("consent_form_base_url")) {
                        z = true;
                        break;
                    }
                    z = true;
                    break;
                case -1161803523:
                    if (nextName.equals("actions")) {
                        z = true;
                        break;
                    }
                    z = true;
                    break;
                case -986806987:
                    if (nextName.equals("request_info_keys")) {
                        z = true;
                        break;
                    }
                    z = true;
                    break;
                case -790907624:
                    if (nextName.equals("consent_form_payload")) {
                        z = true;
                        break;
                    }
                    z = true;
                    break;
                default:
                    z = true;
                    break;
            }
            if (!z) {
                zzbyVar.zza = zzbu.zzb(jsonReader);
            } else if (z) {
                zzbyVar.zzb = jsonReader.nextString();
            } else if (z) {
                zzbyVar.zzc = jsonReader.nextString();
            } else if (z) {
                zzbyVar.zzd = jsonReader.nextString();
            } else if (z) {
                zzbyVar.zze = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    zzbyVar.zze.add(jsonReader.nextString());
                }
                jsonReader.endArray();
            } else if (z) {
                zzbyVar.zzf = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    zzbx zzbxVar = new zzbx();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        int hashCode = nextName2.hashCode();
                        if (hashCode != -2105551094) {
                            if (hashCode == 1583758243 && nextName2.equals(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE)) {
                                z2 = false;
                            }
                            z2 = true;
                        } else {
                            if (nextName2.equals("args_json")) {
                                z2 = true;
                            }
                            z2 = true;
                        }
                        if (!z2) {
                            zzbxVar.zza = zzbu.zza(jsonReader);
                        } else if (z2) {
                            zzbxVar.zzb = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    zzbyVar.zzf.add(zzbxVar);
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return zzbyVar;
    }
}
