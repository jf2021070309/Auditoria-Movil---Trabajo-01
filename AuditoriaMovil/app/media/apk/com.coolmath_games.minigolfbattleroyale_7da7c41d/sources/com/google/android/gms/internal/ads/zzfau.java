package com.google.android.gms.internal.ads;

import com.facebook.share.internal.MessengerShareContentUtility;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfau {
    private final JSONObject zza;

    public zzfau(JSONObject jSONObject) {
        this.zza = jSONObject;
    }

    public final String zza() {
        if (zzb() - 1 != 1) {
            return "javascript";
        }
        return null;
    }

    public final int zzb() {
        int optInt = this.zza.optInt(MessengerShareContentUtility.MEDIA_TYPE, -1);
        if (optInt != 0) {
            return optInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
