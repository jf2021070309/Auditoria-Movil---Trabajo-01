package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class zzxl implements zzxm {
    private static final Logger zzb = Logger.getLogger(zzxl.class.getName());
    public final ThreadLocal<ByteBuffer> zza = new zzxk(this);

    public abstract zzxp zza(String str, byte[] bArr, String str2);

    @Override // com.google.android.gms.internal.ads.zzxm
    public final zzxp zzb(zzgkm zzgkmVar, zzxq zzxqVar) throws IOException {
        int zza;
        long zzb2;
        long zzc = zzgkmVar.zzc();
        this.zza.get().rewind().limit(8);
        do {
            zza = zzgkmVar.zza(this.zza.get());
            if (zza == 8) {
                this.zza.get().rewind();
                long zza2 = zzxo.zza(this.zza.get());
                byte[] bArr = null;
                if (zza2 < 8 && zza2 > 1) {
                    Logger logger = zzb;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(zza2);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                this.zza.get().get(bArr2);
                try {
                    String str = new String(bArr2, "ISO-8859-1");
                    if (zza2 == 1) {
                        this.zza.get().limit(16);
                        zzgkmVar.zza(this.zza.get());
                        this.zza.get().position(8);
                        zzb2 = zzxo.zzd(this.zza.get()) - 16;
                    } else {
                        zzb2 = zza2 == 0 ? zzgkmVar.zzb() - zzgkmVar.zzc() : zza2 - 8;
                    }
                    if ("uuid".equals(str)) {
                        this.zza.get().limit(this.zza.get().limit() + 16);
                        zzgkmVar.zza(this.zza.get());
                        bArr = new byte[16];
                        for (int position = this.zza.get().position() - 16; position < this.zza.get().position(); position++) {
                            bArr[position - (this.zza.get().position() - 16)] = this.zza.get().get(position);
                        }
                        zzb2 -= 16;
                    }
                    long j2 = zzb2;
                    zzxp zza3 = zza(str, bArr, zzxqVar instanceof zzxp ? ((zzxp) zzxqVar).zzb() : "");
                    zza3.zza(zzxqVar);
                    this.zza.get().rewind();
                    zza3.zzc(zzgkmVar, this.zza.get(), j2, this);
                    return zza3;
                } catch (UnsupportedEncodingException e2) {
                    throw new RuntimeException(e2);
                }
            }
        } while (zza >= 0);
        zzgkmVar.zzd(zzc);
        throw new EOFException();
    }
}
