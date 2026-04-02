package com.google.android.gms.cast.tv.auth;

import com.google.android.gms.cast.tv.zzf;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.tasks.Task;
import java.net.URL;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public class CastDeviceAuthManager {
    private final zzf zza;

    public CastDeviceAuthManager(zzf zzfVar) {
        this.zza = zzfVar;
    }

    @KeepForSdk
    public Task<Map<String, String>> getCastDeviceHeadersForUrl(URL url) {
        Preconditions.checkNotNull(url, "url must not be null");
        return zzf.zza(url);
    }
}
