package com.google.android.gms.internal.ads;

import e.a.d.a.a;
import java.nio.ByteBuffer;
import java.util.Date;
/* loaded from: classes.dex */
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
        StringBuilder y = a.y("MovieHeaderBox[creationTime=");
        y.append(this.zza);
        y.append(";modificationTime=");
        y.append(this.zzh);
        y.append(";timescale=");
        y.append(this.zzi);
        y.append(";duration=");
        y.append(this.zzj);
        y.append(";rate=");
        y.append(this.zzk);
        y.append(";volume=");
        y.append(this.zzl);
        y.append(";matrix=");
        y.append(this.zzm);
        y.append(";nextTrackId=");
        return a.q(y, this.zzn, "]");
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
        this.zzl = ((short) ((bArr[1] & 255) | ((short) ((bArr[0] << 8) & 65280)))) / 256.0f;
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
