package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final /* synthetic */ class zzfu implements zzgd {
    public static final zzgd zza = new zzfu();

    private zzfu() {
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final int zza(Object obj) {
        int i2 = zzge.zza;
        String str = ((zzfo) obj).zza;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (zzamq.zza >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
