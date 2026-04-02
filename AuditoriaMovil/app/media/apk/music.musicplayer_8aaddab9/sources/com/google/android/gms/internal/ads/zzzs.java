package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
/* loaded from: classes.dex */
public final class zzzs {
    public static boolean zza;
    private static MessageDigest zzc;
    private static final Object zzd = new Object();
    private static final Object zze = new Object();
    public static final CountDownLatch zzb = new CountDownLatch(1);

    public static void zzb() {
        synchronized (zze) {
            if (!zza) {
                zza = true;
                new Thread(new zzzq(null)).start();
            }
        }
    }

    public static String zzc(zzyz zzyzVar, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] zzg;
        byte[] zzao = zzyzVar.zzao();
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbR)).booleanValue()) {
            Vector<byte[]> zzd2 = zzd(zzao, 255);
            if (zzd2 == null || zzd2.size() == 0) {
                zzg = zzg(zzf(4096).zzao(), str, true);
            } else {
                zzzl zza2 = zzzm.zza();
                int size = zzd2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    zza2.zza(zzgex.zzt(zzg(zzd2.get(i2), str, false)));
                }
                zza2.zzb(zzgex.zzt(zze(zzao)));
                zzg = zza2.zzah().zzao();
            }
        } else if (zzabs.zza == null) {
            throw new GeneralSecurityException();
        } else {
            byte[] zza3 = zzabs.zza.zza(zzao, str != null ? str.getBytes() : new byte[0]);
            zzzl zza4 = zzzm.zza();
            zza4.zza(zzgex.zzt(zza3));
            zza4.zzc(3);
            zzg = zza4.zzah().zzao();
        }
        return zzzo.zza(zzg, true);
    }

    public static Vector<byte[]> zzd(byte[] bArr, int i2) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        int i3 = (length + 254) / 255;
        Vector<byte[]> vector = new Vector<>();
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i4 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i5 > 255) {
                    length2 = i5 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i5, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x001e, code lost:
        r1.reset();
        r1.update(r6);
        r6 = com.google.android.gms.internal.ads.zzzs.zzc.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] zze(byte[] r6) throws java.security.NoSuchAlgorithmException {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzzs.zzd
            monitor-enter(r0)
            zzb()     // Catch: java.lang.Throwable -> L34
            r1 = 0
            java.util.concurrent.CountDownLatch r2 = com.google.android.gms.internal.ads.zzzs.zzb     // Catch: java.lang.InterruptedException -> L1b java.lang.Throwable -> L34
            r3 = 2
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L1b java.lang.Throwable -> L34
            boolean r2 = r2.await(r3, r5)     // Catch: java.lang.InterruptedException -> L1b java.lang.Throwable -> L34
            if (r2 != 0) goto L14
            goto L1c
        L14:
            java.security.MessageDigest r2 = com.google.android.gms.internal.ads.zzzs.zzc     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto L19
            goto L1c
        L19:
            r1 = r2
            goto L1c
        L1b:
        L1c:
            if (r1 == 0) goto L2c
            r1.reset()     // Catch: java.lang.Throwable -> L34
            r1.update(r6)     // Catch: java.lang.Throwable -> L34
            java.security.MessageDigest r6 = com.google.android.gms.internal.ads.zzzs.zzc     // Catch: java.lang.Throwable -> L34
            byte[] r6 = r6.digest()     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return r6
        L2c:
            java.security.NoSuchAlgorithmException r6 = new java.security.NoSuchAlgorithmException     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "Cannot compute hash"
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L34
            throw r6     // Catch: java.lang.Throwable -> L34
        L34:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzs.zze(byte[]):byte[]");
    }

    public static zzyz zzf(int i2) {
        zzyj zzi = zzyz.zzi();
        zzi.zzl(4096L);
        return zzi.zzah();
    }

    private static byte[] zzg(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] array;
        int i2 = true != z ? 255 : 239;
        if (bArr.length > i2) {
            bArr = zzf(4096).zzao();
        }
        int length = bArr.length;
        if (length < i2) {
            byte[] bArr2 = new byte[i2 - length];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i2 + 1).put((byte) length).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i2 + 1).put((byte) length).put(bArr).array();
        }
        if (z) {
            array = ByteBuffer.allocate(256).put(zze(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        zzzt[] zzztVarArr = new zzaah().zzcG;
        int length2 = zzztVarArr.length;
        for (int i3 = 0; i3 < 12; i3++) {
            zzztVarArr[i3].zza(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzgee(str.getBytes("UTF-8")).zza(bArr3);
        }
        return bArr3;
    }
}
