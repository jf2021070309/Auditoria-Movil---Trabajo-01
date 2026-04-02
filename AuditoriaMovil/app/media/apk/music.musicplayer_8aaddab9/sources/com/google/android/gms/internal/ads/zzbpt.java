package com.google.android.gms.internal.ads;

import java.util.Map;
/* loaded from: classes.dex */
public final class zzbpt implements zzbpr<zzcml> {
    private final zzbpu zza;

    public zzbpt(zzbpu zzbpuVar, byte[] bArr) {
        this.zza = zzbpuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final /* bridge */ /* synthetic */ void zza(zzcml zzcmlVar, Map map) {
        zzcml zzcmlVar2 = zzcmlVar;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f2 = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f2 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e2) {
            zzcgt.zzg("Fail to parse float", e2);
        }
        this.zza.zza(equals);
        this.zza.zzb(equals2, f2);
        zzcmlVar2.zzaD(equals);
    }
}
