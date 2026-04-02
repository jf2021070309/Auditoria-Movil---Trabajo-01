package com.google.android.gms.internal.auth;

import android.net.Uri;
import java.util.Map;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class zzco {
    private final Map<String, Map<String, String>> zza;

    public zzco(Map<String, Map<String, String>> map) {
        this.zza = map;
    }

    @Nullable
    public final String zza(@Nullable Uri uri, @Nullable String str, @Nullable String str2, String str3) {
        if (uri != null) {
            Map<String, String> map = this.zza.get(uri.toString());
            if (map == null) {
                return null;
            }
            String valueOf = String.valueOf(str3);
            return map.get(valueOf.length() != 0 ? "".concat(valueOf) : new String(""));
        }
        return null;
    }
}
