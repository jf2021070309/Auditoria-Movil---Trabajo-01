package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;
import java.nio.ByteBuffer;
import java.util.Date;
import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzxs extends zzgkj {
    private Date zza;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private zzgkt zzm;
    private long zzn;

    public zzxs() {
        super("mvhd");
        this.zzk = 1.0d;
        this.zzl = 1.0f;
        this.zzm = zzgkt.zzj;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.zza + ";modificationTime=" + this.zzh + ";timescale=" + this.zzi + ";duration=" + this.zzj + ";rate=" + this.zzk + ";volume=" + this.zzl + ";matrix=" + this.zzm + ";nextTrackId=" + this.zzn + "]";
    }

    public final long zzd() {
        return this.zzi;
    }

    public final long zze() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzgkh
    public final void zzf(ByteBuffer byteBuffer) {
        zzi(byteBuffer);
        if (zzh() == 1) {
            this.zza = zzgko.zza(zzxo.zzd(byteBuffer));
            this.zzh = zzgko.zza(zzxo.zzd(byteBuffer));
            this.zzi = zzxo.zza(byteBuffer);
            this.zzj = zzxo.zzd(byteBuffer);
        } else {
            this.zza = zzgko.zza(zzxo.zza(byteBuffer));
            this.zzh = zzgko.zza(zzxo.zza(byteBuffer));
            this.zzi = zzxo.zza(byteBuffer);
            this.zzj = zzxo.zza(byteBuffer);
        }
        this.zzk = zzxo.zze(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.zzl = ((short) ((bArr[1] & UByte.MAX_VALUE) | ((short) ((bArr[0] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK)))) / 256.0f;
        zzxo.zzb(byteBuffer);
        zzxo.zza(byteBuffer);
        zzxo.zza(byteBuffer);
        this.zzm = zzgkt.zza(byteBuffer);
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzxo.zza(byteBuffer);
    }
}
