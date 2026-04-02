package com.google.android.gms.internal.ads;

import android.content.Context;
import android.provider.Settings;
import android.util.JsonWriter;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
/* loaded from: classes.dex */
public final class zzcgs {
    public static final /* synthetic */ int zza = 0;
    private static boolean zzc;
    private static boolean zzd;
    private final List<String> zzg;
    private static final Object zzb = new Object();
    private static final Clock zze = DefaultClock.getInstance();
    private static final Set<String> zzf = new HashSet(Arrays.asList(new String[0]));

    public zzcgs() {
        this(null);
    }

    public zzcgs(String str) {
        List<String> asList;
        if (zzj()) {
            String[] strArr = new String[1];
            String valueOf = String.valueOf(UUID.randomUUID().toString());
            strArr[0] = valueOf.length() != 0 ? "network_request_".concat(valueOf) : new String("network_request_");
            asList = Arrays.asList(strArr);
        } else {
            asList = new ArrayList<>();
        }
        this.zzg = asList;
    }

    public static void zzg() {
        synchronized (zzb) {
            zzc = false;
            zzd = false;
            zzcgt.zzi("Ad debug logging enablement is out of date.");
        }
    }

    public static void zzh(boolean z) {
        synchronized (zzb) {
            zzc = true;
            zzd = z;
        }
    }

    public static boolean zzi() {
        boolean z;
        synchronized (zzb) {
            z = zzc;
        }
        return z;
    }

    public static boolean zzj() {
        boolean z;
        synchronized (zzb) {
            z = false;
            if (zzc && zzd) {
                z = true;
            }
        }
        return z;
    }

    public static boolean zzk(Context context) {
        if (zzbkv.zza.zze().booleanValue()) {
            try {
                return Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
            } catch (Exception e2) {
                zzcgt.zzj("Fail to determine debug setting.", e2);
                return false;
            }
        }
        return false;
    }

    public static final /* synthetic */ void zzl(int i2, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i2);
        jsonWriter.endObject();
        zzq(jsonWriter, map);
        jsonWriter.endObject();
    }

    public static final /* synthetic */ void zzm(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        zzq(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64Utils.encode(bArr));
        }
        jsonWriter.endObject();
    }

    private final void zzn(final String str, final String str2, final Map<String, ?> map, final byte[] bArr) {
        zzr("onNetworkRequest", new zzcgr(str, str2, map, bArr) { // from class: com.google.android.gms.internal.ads.zzcgn
            private final String zza;
            private final String zzb;
            private final Map zzc;
            private final byte[] zzd;

            {
                this.zza = str;
                this.zzb = str2;
                this.zzc = map;
                this.zzd = bArr;
            }

            @Override // com.google.android.gms.internal.ads.zzcgr
            public final void zza(JsonWriter jsonWriter) {
                zzcgs.zzm(this.zza, this.zzb, this.zzc, this.zzd, jsonWriter);
            }
        });
    }

    private final void zzo(final Map<String, ?> map, final int i2) {
        zzr("onNetworkResponse", new zzcgr(i2, map) { // from class: com.google.android.gms.internal.ads.zzcgo
            private final int zza;
            private final Map zzb;

            {
                this.zza = i2;
                this.zzb = map;
            }

            @Override // com.google.android.gms.internal.ads.zzcgr
            public final void zza(JsonWriter jsonWriter) {
                zzcgs.zzl(this.zza, this.zzb, jsonWriter);
            }
        });
    }

    private final void zzp(final String str) {
        zzr("onNetworkRequestError", new zzcgr(str) { // from class: com.google.android.gms.internal.ads.zzcgq
            private final String zza;

            {
                this.zza = str;
            }

            @Override // com.google.android.gms.internal.ads.zzcgr
            public final void zza(JsonWriter jsonWriter) {
                String str2 = this.zza;
                int i2 = zzcgs.zza;
                jsonWriter.name("params").beginObject();
                if (str2 != null) {
                    jsonWriter.name("error_description").value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    private static void zzq(JsonWriter jsonWriter, Map<String, ?> map) throws IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it.next();
            String key = next.getKey();
            if (!zzf.contains(key)) {
                if (!(next.getValue() instanceof List)) {
                    if (!(next.getValue() instanceof String)) {
                        zzcgt.zzf("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(key);
                    jsonWriter.name("value").value((String) next.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str : (List) next.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(key);
                        jsonWriter.name("value").value(str);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    private final void zzr(String str, zzcgr zzcgrVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(zze.currentTimeMillis());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            for (String str2 : this.zzg) {
                jsonWriter.value(str2);
            }
            jsonWriter.endArray();
            zzcgrVar.zza(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e2) {
            zzcgt.zzg("unable to log", e2);
        }
        zzs(stringWriter.toString());
    }

    private static synchronized void zzs(String str) {
        synchronized (zzcgs.class) {
            zzcgt.zzh("GMA Debug BEGIN");
            int i2 = 0;
            while (i2 < str.length()) {
                int i3 = i2 + 4000;
                String valueOf = String.valueOf(str.substring(i2, Math.min(i3, str.length())));
                zzcgt.zzh(valueOf.length() != 0 ? "GMA Debug CONTENT ".concat(valueOf) : new String("GMA Debug CONTENT "));
                i2 = i3;
            }
            zzcgt.zzh("GMA Debug FINISH");
        }
    }

    public final void zza(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (zzj()) {
            zzn(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void zzb(String str, String str2, Map<String, ?> map, byte[] bArr) {
        if (zzj()) {
            zzn(str, "GET", map, bArr);
        }
    }

    public final void zzc(HttpURLConnection httpURLConnection, int i2) {
        if (zzj()) {
            String str = null;
            zzo(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i2);
            if (i2 < 200 || i2 >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e2) {
                    String valueOf = String.valueOf(e2.getMessage());
                    zzcgt.zzi(valueOf.length() != 0 ? "Can not get error message from error HttpURLConnection\n".concat(valueOf) : new String("Can not get error message from error HttpURLConnection\n"));
                }
                zzp(str);
            }
        }
    }

    public final void zzd(Map<String, ?> map, int i2) {
        if (zzj()) {
            zzo(map, i2);
            if (i2 < 200 || i2 >= 300) {
                zzp(null);
            }
        }
    }

    public final void zze(String str) {
        if (zzj() && str != null) {
            zzf(str.getBytes());
        }
    }

    public final void zzf(final byte[] bArr) {
        zzr("onNetworkResponseBody", new zzcgr(bArr) { // from class: com.google.android.gms.internal.ads.zzcgp
            private final byte[] zza;

            {
                this.zza = bArr;
            }

            @Override // com.google.android.gms.internal.ads.zzcgr
            public final void zza(JsonWriter jsonWriter) {
                byte[] bArr2 = this.zza;
                int i2 = zzcgs.zza;
                jsonWriter.name("params").beginObject();
                int length = bArr2.length;
                String encode = Base64Utils.encode(bArr2);
                if (length < 10000) {
                    jsonWriter.name("body").value(encode);
                } else {
                    String zzd2 = zzcgm.zzd(encode);
                    if (zzd2 != null) {
                        jsonWriter.name("bodydigest").value(zzd2);
                    }
                }
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }
}
