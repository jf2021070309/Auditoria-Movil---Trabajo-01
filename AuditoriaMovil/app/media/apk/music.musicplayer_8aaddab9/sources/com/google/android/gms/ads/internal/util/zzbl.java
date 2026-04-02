package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzcgs;
import com.google.android.gms.internal.ads.zzvk;
import com.google.android.gms.internal.ads.zzwg;
import com.google.android.gms.internal.ads.zzwh;
import com.google.android.gms.internal.ads.zzxh;
import java.util.Collections;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzbl extends zzxh {
    public final /* synthetic */ byte[] zza;
    public final /* synthetic */ Map zzb;
    public final /* synthetic */ zzcgs zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbl(zzbr zzbrVar, int i2, String str, zzwh zzwhVar, zzwg zzwgVar, byte[] bArr, Map map, zzcgs zzcgsVar) {
        super(i2, str, zzwhVar, zzwgVar);
        this.zza = bArr;
        this.zzb = map;
        this.zzc = zzcgsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwc
    public final Map<String, String> zzn() throws zzvk {
        Map<String, String> map = this.zzb;
        return map == null ? Collections.emptyMap() : map;
    }

    @Override // com.google.android.gms.internal.ads.zzwc
    public final byte[] zzo() throws zzvk {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzxh, com.google.android.gms.internal.ads.zzwc
    /* renamed from: zzz */
    public final void zzt(String str) {
        this.zzc.zze(str);
        super.zzt(str);
    }
}
