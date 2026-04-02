package com.google.android.gms.internal.pal;

import com.google.android.gms.cast.MediaStatus;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import org.apache.commons.codec.binary.Hex;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzbn {
    static boolean zza;
    private static MessageDigest zzc;
    private static final Object zzd = new Object();
    private static final Object zze = new Object();
    static final CountDownLatch zzb = new CountDownLatch(1);

    public static String zza(zzaf zzafVar, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] zzh;
        byte[] bArr;
        byte[] zzas = zzafVar.zzas();
        if (!((Boolean) zzfv.zzc().zzb(zzgk.zzcw)).booleanValue()) {
            if (zzdv.zza != null) {
                if (str != null) {
                    bArr = str.getBytes();
                } else {
                    bArr = new byte[0];
                }
                byte[] zza2 = zzdv.zza.zza(zzas, bArr);
                zzat zza3 = zzau.zza();
                zza3.zza(zzaby.zzn(zza2));
                zza3.zzc(3);
                zzh = ((zzau) zza3.zzan()).zzas();
            } else {
                throw new GeneralSecurityException();
            }
        } else {
            Vector zzb2 = zzb(zzas, 255);
            if (zzb2 != null && zzb2.size() != 0) {
                zzat zza4 = zzau.zza();
                int size = zzb2.size();
                for (int i = 0; i < size; i++) {
                    zza4.zza(zzaby.zzn(zzh((byte[]) zzb2.get(i), str, false)));
                }
                zza4.zzb(zzaby.zzn(zzf(zzas)));
                zzh = ((zzau) zza4.zzan()).zzas();
            } else {
                zzh = zzh(zzg(4096).zzas(), str, true);
            }
        }
        return zzbj.zza(zzh, true);
    }

    public static Vector zzb(byte[] bArr, int i) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        int i2 = (length + 254) / 255;
        Vector vector = new Vector();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i4 > 255) {
                    length2 = i4 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i4, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    public static void zzd() {
        synchronized (zze) {
            if (!zza) {
                zza = true;
                new Thread(new zzbm(null)).start();
            }
        }
    }

    public static byte[] zze(String str, String str2, boolean z) {
        byte[] zzb2;
        byte[] zzb3;
        zzai zza2 = zzaj.zza();
        try {
            if (str.length() < 3) {
                zzb2 = str.getBytes("ISO-8859-1");
            } else {
                zzb2 = zzbj.zzb(str, true);
            }
            zza2.zzb(zzaby.zzn(zzb2));
            if (str2.length() < 3) {
                zzb3 = str2.getBytes("ISO-8859-1");
            } else {
                zzb3 = zzbj.zzb(str2, true);
            }
            zza2.zza(zzaby.zzn(zzb3));
            return ((zzaj) zza2.zzan()).zzas();
        } catch (UnsupportedEncodingException | GeneralSecurityException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x001c, code lost:
        r1.reset();
        r1.update(r6);
        r6 = com.google.android.gms.internal.pal.zzbn.zzc.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] zzf(byte[] r6) throws java.security.NoSuchAlgorithmException {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.pal.zzbn.zzd
            monitor-enter(r0)
            zzd()     // Catch: java.lang.Throwable -> L32
            r1 = 0
            java.util.concurrent.CountDownLatch r2 = com.google.android.gms.internal.pal.zzbn.zzb     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L32
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L32
            r4 = 2
            boolean r2 = r2.await(r4, r3)     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L32
            if (r2 != 0) goto L14
            goto L1a
        L14:
            java.security.MessageDigest r2 = com.google.android.gms.internal.pal.zzbn.zzc     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L19
            goto L1a
        L19:
            r1 = r2
        L1a:
            if (r1 == 0) goto L2a
            r1.reset()     // Catch: java.lang.Throwable -> L32
            r1.update(r6)     // Catch: java.lang.Throwable -> L32
            java.security.MessageDigest r6 = com.google.android.gms.internal.pal.zzbn.zzc     // Catch: java.lang.Throwable -> L32
            byte[] r6 = r6.digest()     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r6
        L2a:
            java.security.NoSuchAlgorithmException r6 = new java.security.NoSuchAlgorithmException     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "Cannot compute hash"
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L32
            throw r6     // Catch: java.lang.Throwable -> L32
        L32:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pal.zzbn.zzf(byte[]):byte[]");
    }

    public static zzaf zzg(int i) {
        zzr zza2 = zzaf.zza();
        zza2.zzD(MediaStatus.COMMAND_EDIT_TRACKS);
        return (zzaf) zza2.zzan();
    }

    private static byte[] zzh(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        int i;
        byte[] array;
        if (true != z) {
            i = 255;
        } else {
            i = 239;
        }
        if (bArr.length > i) {
            bArr = zzg(4096).zzas();
        }
        int length = bArr.length;
        if (length < i) {
            byte[] bArr2 = new byte[i - length];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr).array();
        }
        if (z) {
            array = ByteBuffer.allocate(256).put(zzf(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        zzbo[] zzboVarArr = new zzcn().zzcG;
        int length2 = zzboVarArr.length;
        for (int i2 = 0; i2 < 12; i2++) {
            zzboVarArr[i2].zza(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzabg(str.getBytes(Hex.DEFAULT_CHARSET_NAME)).zza(bArr3);
        }
        return bArr3;
    }
}
