package com.google.android.gms.internal.ads;

import java.util.Map;
/* loaded from: classes.dex */
public final class zzbos implements zzbpr<Object> {
    private final zzbot zza;

    public zzbos(zzbot zzbotVar) {
        this.zza = zzbotVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("name");
        if (str == null) {
            zzcgt.zzi("App event with no name parameter.");
        } else {
            this.zza.zzbA(str, map.get("info"));
        }
    }
}
