package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class zzggn extends InputStream {
    private Iterator<ByteBuffer> zza;
    private ByteBuffer zzb;
    private int zzc = 0;
    private int zzd;
    private int zze;
    private boolean zzf;
    private byte[] zzg;
    private int zzh;
    private long zzi;

    public zzggn(Iterable<ByteBuffer> iterable) {
        this.zza = iterable.iterator();
        for (ByteBuffer byteBuffer : iterable) {
            this.zzc++;
        }
        this.zzd = -1;
        if (zza()) {
            return;
        }
        this.zzb = zzggk.zzd;
        this.zzd = 0;
        this.zze = 0;
        this.zzi = 0L;
    }

    private final boolean zza() {
        this.zzd++;
        if (this.zza.hasNext()) {
            ByteBuffer next = this.zza.next();
            this.zzb = next;
            this.zze = next.position();
            if (this.zzb.hasArray()) {
                this.zzf = true;
                this.zzg = this.zzb.array();
                this.zzh = this.zzb.arrayOffset();
            } else {
                this.zzf = false;
                this.zzi = zzgiy.zzs(this.zzb);
                this.zzg = null;
            }
            return true;
        }
        return false;
    }

    private final void zzb(int i2) {
        int i3 = this.zze + i2;
        this.zze = i3;
        if (i3 == this.zzb.limit()) {
            zza();
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte zzr;
        if (this.zzd == this.zzc) {
            return -1;
        }
        if (this.zzf) {
            zzr = this.zzg[this.zze + this.zzh];
            zzb(1);
        } else {
            zzr = zzgiy.zzr(this.zze + this.zzi);
            zzb(1);
        }
        return zzr & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        if (this.zzd == this.zzc) {
            return -1;
        }
        int limit = this.zzb.limit();
        int i4 = this.zze;
        int i5 = limit - i4;
        if (i3 > i5) {
            i3 = i5;
        }
        if (this.zzf) {
            System.arraycopy(this.zzg, i4 + this.zzh, bArr, i2, i3);
            zzb(i3);
        } else {
            int position = this.zzb.position();
            ByteBuffer byteBuffer = (ByteBuffer) this.zzb.position(this.zze);
            this.zzb.get(bArr, i2, i3);
            ByteBuffer byteBuffer2 = (ByteBuffer) this.zzb.position(position);
            zzb(i3);
        }
        return i3;
    }
}
