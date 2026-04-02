package com.google.android.gms.internal.pal;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.binary.Hex;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzff {
    protected static final String zza = "zzff";
    private final zzdu zzb;
    private final String zzc;
    private final String zzd;
    private final Class[] zzf;
    private volatile Method zze = null;
    private final CountDownLatch zzg = new CountDownLatch(1);

    public zzff(zzdu zzduVar, String str, String str2, Class... clsArr) {
        this.zzb = zzduVar;
        this.zzc = str;
        this.zzd = str2;
        this.zzf = clsArr;
        zzduVar.zzk().submit(new zzfe(this));
    }

    public static /* bridge */ /* synthetic */ void zzb(zzff zzffVar) {
        CountDownLatch countDownLatch;
        Class<?> loadClass;
        try {
            zzdu zzduVar = zzffVar.zzb;
            loadClass = zzduVar.zzi().loadClass(zzffVar.zzc(zzduVar.zzu(), zzffVar.zzc));
        } catch (zzda | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException unused) {
        } catch (NullPointerException unused2) {
            countDownLatch = zzffVar.zzg;
        } catch (Throwable th) {
            zzffVar.zzg.countDown();
            throw th;
        }
        if (loadClass == null) {
            countDownLatch = zzffVar.zzg;
        } else {
            zzffVar.zze = loadClass.getMethod(zzffVar.zzc(zzffVar.zzb.zzu(), zzffVar.zzd), zzffVar.zzf);
            if (zzffVar.zze == null) {
                countDownLatch = zzffVar.zzg;
            }
            countDownLatch = zzffVar.zzg;
        }
        countDownLatch.countDown();
    }

    private final String zzc(byte[] bArr, String str) throws zzda, UnsupportedEncodingException {
        return new String(this.zzb.zze().zzb(bArr, str), Hex.DEFAULT_CHARSET_NAME);
    }

    public final Method zza() {
        if (this.zze != null) {
            return this.zze;
        }
        try {
            if (!this.zzg.await(2L, TimeUnit.SECONDS)) {
                return null;
            }
            return this.zze;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
