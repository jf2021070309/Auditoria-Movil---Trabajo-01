package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.util.JsonReader;
import com.facebook.internal.NativeProtocol;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes.dex */
public final class zzah {
    public final String zza;
    public String zzb;
    public Bundle zzc = new Bundle();

    public zzah(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        char c;
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName = nextName == null ? "" : nextName;
            int hashCode = nextName.hashCode();
            if (hashCode != -995427962) {
                if (hashCode == -271442291 && nextName.equals("signal_dictionary")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (nextName.equals(NativeProtocol.WEB_DIALOG_PARAMS)) {
                    c = 0;
                }
                c = 65535;
            }
            if (c == 0) {
                str = jsonReader.nextString();
            } else if (c == 1) {
                hashMap = new HashMap();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    hashMap.put(jsonReader.nextName(), jsonReader.nextString());
                }
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        this.zza = str;
        jsonReader.endObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.zzc.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }
}
