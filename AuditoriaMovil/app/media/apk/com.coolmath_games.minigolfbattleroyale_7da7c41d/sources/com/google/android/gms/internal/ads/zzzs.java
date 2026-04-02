package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzzs {
    static boolean zza;
    private static MessageDigest zzc;
    private static final Object zzd = new Object();
    private static final Object zze = new Object();
    static final CountDownLatch zzb = new CountDownLatch(1);

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
                for (int i = 0; i < size; i++) {
                    zza2.zza(zzgex.zzt(zzg(zzd2.get(i), str, false)));
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

    static Vector<byte[]> zzd(byte[] bArr, int i) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        int i2 = (length + 254) / 255;
        Vector<byte[]> vector = new Vector<>();
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

    /* JADX WARN: Code restructure failed: missing block: B:40:0x001d, code lost:
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
            zzb()     // Catch: java.lang.Throwable -> L33
            r1 = 0
            java.util.concurrent.CountDownLatch r2 = com.google.android.gms.internal.ads.zzzs.zzb     // Catch: java.lang.InterruptedException -> L1b java.lang.Throwable -> L33
            r3 = 2
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L1b java.lang.Throwable -> L33
            boolean r2 = r2.await(r3, r5)     // Catch: java.lang.InterruptedException -> L1b java.lang.Throwable -> L33
            if (r2 != 0) goto L14
            goto L1b
        L14:
            java.security.MessageDigest r2 = com.google.android.gms.internal.ads.zzzs.zzc     // Catch: java.lang.Throwable -> L33
            if (r2 != 0) goto L19
            goto L1b
        L19:
            java.security.MessageDigest r1 = com.google.android.gms.internal.ads.zzzs.zzc     // Catch: java.lang.Throwable -> L33
        L1b:
            if (r1 == 0) goto L2b
            r1.reset()     // Catch: java.lang.Throwable -> L33
            r1.update(r6)     // Catch: java.lang.Throwable -> L33
            java.security.MessageDigest r6 = com.google.android.gms.internal.ads.zzzs.zzc     // Catch: java.lang.Throwable -> L33
            byte[] r6 = r6.digest()     // Catch: java.lang.Throwable -> L33
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            return r6
        L2b:
            java.security.NoSuchAlgorithmException r6 = new java.security.NoSuchAlgorithmException     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = "Cannot compute hash"
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L33
            throw r6     // Catch: java.lang.Throwable -> L33
        L33:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzs.zze(byte[]):byte[]");
    }

    static zzyz zzf(int i) {
        zzyj zzi = zzyz.zzi();
        zzi.zzl(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
        return zzi.zzah();
    }

    private static byte[] zzg(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] array;
        int i = true != z ? 255 : 239;
        if (bArr.length > i) {
            bArr = zzf(4096).zzao();
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
            array = ByteBuffer.allocate(256).put(zze(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        zzzt[] zzztVarArr = new zzaah().zzcG;
        int length2 = zzztVarArr.length;
        for (int i2 = 0; i2 < 12; i2++) {
            zzztVarArr[i2].zza(array, bArr3);
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
