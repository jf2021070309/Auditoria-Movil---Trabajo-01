package com.google.android.gms.internal.pal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import org.apache.commons.codec.binary.Hex;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzlh {
    public static final Charset zza = Charset.forName(Hex.DEFAULT_CHARSET_NAME);

    public static zzwg zza(zzwb zzwbVar) {
        zzwd zza2 = zzwg.zza();
        zza2.zzb(zzwbVar.zzc());
        for (zzwa zzwaVar : zzwbVar.zzg()) {
            zzwe zza3 = zzwf.zza();
            zza3.zzb(zzwaVar.zzc().zzg());
            zza3.zzd(zzwaVar.zzi());
            zza3.zzc(zzwaVar.zzj());
            zza3.zza(zzwaVar.zza());
            zza2.zza((zzwf) zza3.zzan());
        }
        return (zzwg) zza2.zzan();
    }

    public static void zzb(zzwb zzwbVar) throws GeneralSecurityException {
        boolean z;
        int zzc = zzwbVar.zzc();
        int i = 0;
        boolean z2 = false;
        boolean z3 = true;
        for (zzwa zzwaVar : zzwbVar.zzg()) {
            if (zzwaVar.zzi() == 3) {
                if (zzwaVar.zzh()) {
                    if (zzwaVar.zzj() != 2) {
                        if (zzwaVar.zzi() != 2) {
                            if (zzwaVar.zza() == zzc) {
                                if (!z2) {
                                    z2 = true;
                                } else {
                                    throw new GeneralSecurityException("keyset contains multiple primary keys");
                                }
                            }
                            if (zzwaVar.zzc().zzc() != zzvn.ASYMMETRIC_PUBLIC) {
                                z = false;
                            } else {
                                z = true;
                            }
                            z3 &= z;
                            i++;
                        } else {
                            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzwaVar.zza())));
                        }
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzwaVar.zza())));
                    }
                } else {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzwaVar.zza())));
                }
            }
        }
        if (i != 0) {
            if (!z2 && !z3) {
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
            return;
        }
        throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
    }

    public static byte[] zzc(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }
}
