package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzffm {
    private final String zza = zzbkt.zzb.zze();

    public final String zza(Map<String, String> map) {
        Uri.Builder buildUpon = Uri.parse(this.zza).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return buildUpon.build().toString();
    }
}
