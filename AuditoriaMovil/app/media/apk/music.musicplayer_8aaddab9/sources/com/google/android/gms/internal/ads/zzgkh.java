package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public abstract class zzgkh implements zzxp {
    private static final zzgks zza = zzgks.zzb(zzgkh.class);
    public final String zzb;
    public long zze;
    public zzgkm zzg;
    private zzxq zzh;
    private ByteBuffer zzi;
    public long zzf = -1;
    private ByteBuffer zzj = null;
    public boolean zzd = true;
    public boolean zzc = true;

    public zzgkh(String str) {
        this.zzb = str;
    }

    private final synchronized void zzd() {
        if (this.zzd) {
            return;
        }
        try {
            zzgks zzgksVar = zza;
            String str = this.zzb;
            zzgksVar.zza(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
            this.zzi = this.zzg.zze(this.zze, this.zzf);
            this.zzd = true;
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxp
    public final void zza(zzxq zzxqVar) {
        this.zzh = zzxqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxp
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzxp
    public final void zzc(zzgkm zzgkmVar, ByteBuffer byteBuffer, long j2, zzxm zzxmVar) throws IOException {
        this.zze = zzgkmVar.zzc();
        byteBuffer.remaining();
        this.zzf = j2;
        this.zzg = zzgkmVar;
        zzgkmVar.zzd(zzgkmVar.zzc() + j2);
        this.zzd = false;
        this.zzc = false;
        zzg();
    }

    public abstract void zzf(ByteBuffer byteBuffer);

    public final synchronized void zzg() {
        zzd();
        zzgks zzgksVar = zza;
        String str = this.zzb;
        zzgksVar.zza(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
        ByteBuffer byteBuffer = this.zzi;
        if (byteBuffer != null) {
            this.zzc = true;
            byteBuffer.rewind();
            zzf(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.zzj = byteBuffer.slice();
            }
            this.zzi = null;
        }
    }
}
