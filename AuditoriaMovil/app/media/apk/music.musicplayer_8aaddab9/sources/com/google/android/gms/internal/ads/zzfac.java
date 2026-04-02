package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
/* loaded from: classes.dex */
public final class zzfac {
    public final List<String> zza;
    public final String zzb;
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final long zzf;
    public final boolean zzg;
    public final String zzh;
    public final zzfab zzi;

    public zzfac(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List<String> emptyList = Collections.emptyList();
        jsonReader.beginObject();
        int i2 = 0;
        String str = "";
        long j2 = 0;
        zzfab zzfabVar = null;
        boolean z = false;
        String str2 = str;
        String str3 = str2;
        int i3 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("nofill_urls".equals(nextName)) {
                emptyList = com.google.android.gms.ads.internal.util.zzbx.zzb(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i2 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str2 = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str3 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i3 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j2 = jsonReader.nextLong();
            } else {
                if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfV)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    zzfabVar = new zzfab(jsonReader);
                } else if ("bidding_data".equals(nextName)) {
                    str = jsonReader.nextString();
                } else {
                    jsonReader.skipValue();
                }
            }
        }
        jsonReader.endObject();
        this.zza = emptyList;
        this.zzc = i2;
        this.zzb = str2;
        this.zzd = str3;
        this.zze = i3;
        this.zzf = j2;
        this.zzi = zzfabVar;
        this.zzg = z;
        this.zzh = str;
    }
}
