package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzany {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {2, 1, 2, 3, 3, 4, 4, 5};

    public static zzanm zza(zzaux zzauxVar, String str, String str2, zzapk zzapkVar) {
        int i = zzc[(zzauxVar.zzl() & 192) >> 6];
        int zzl = zzauxVar.zzl();
        int i2 = zzd[(zzl & 56) >> 3];
        if ((zzl & 4) != 0) {
            i2++;
        }
        return zzanm.zzb(str, "audio/ac3", null, -1, -1, i2, i, null, zzapkVar, 0, str2);
    }

    public static zzanm zzb(zzaux zzauxVar, String str, String str2, zzapk zzapkVar) {
        zzauxVar.zzj(2);
        int i = zzc[(zzauxVar.zzl() & 192) >> 6];
        int zzl = zzauxVar.zzl();
        int i2 = zzd[(zzl & 14) >> 1];
        if ((zzl & 1) != 0) {
            i2++;
        }
        return zzanm.zzb(str, "audio/eac3", null, -1, -1, i2, i, null, zzapkVar, 0, str2);
    }

    public static int zzc(ByteBuffer byteBuffer) {
        return (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? zzb[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
    }
}
