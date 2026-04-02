package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
/* loaded from: classes.dex */
public final class zzgt implements zzhq {
    private final zzai zza;
    private final SparseArray<zzhq> zzb;
    private final int[] zzc;

    public zzgt(Context context, zzoa zzoaVar) {
        zzks zzksVar = new zzks(context);
        this.zza = zzksVar;
        SparseArray<zzhq> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, (zzhq) Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(zzhq.class).getConstructor(zzai.class).newInstance(zzksVar));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (zzhq) Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(zzhq.class).getConstructor(zzai.class).newInstance(zzksVar));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (zzhq) Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(zzhq.class).getConstructor(zzai.class).newInstance(zzksVar));
        } catch (Exception unused3) {
        }
        try {
            sparseArray.put(3, (zzhq) Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(zzhq.class).getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Exception unused4) {
        }
        sparseArray.put(4, new zzij(zzksVar, zzoaVar));
        this.zzb = sparseArray;
        this.zzc = new int[sparseArray.size()];
        for (int i2 = 0; i2 < this.zzb.size(); i2++) {
            this.zzc[i2] = this.zzb.keyAt(i2);
        }
    }
}
