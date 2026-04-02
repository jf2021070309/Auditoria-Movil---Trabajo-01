package com.google.android.gms.internal.cast_tv;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzhh {
    static final zzhh zza = new zzhh(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc;
    private final Map zzd;

    public zzhh() {
        this.zzd = new HashMap();
    }

    public static zzhh zza() {
        return zza;
    }

    public final zzhs zzb(zzjc zzjcVar, int i) {
        return (zzhs) this.zzd.get(new zzhg(zzjcVar, i));
    }

    public zzhh(boolean z) {
        this.zzd = Collections.emptyMap();
    }
}
