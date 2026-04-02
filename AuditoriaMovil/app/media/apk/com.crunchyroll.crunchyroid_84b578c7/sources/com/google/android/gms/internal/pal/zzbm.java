package com.google.android.gms.internal.pal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzbm implements Runnable {
    private zzbm() {
    }

    public /* synthetic */ zzbm(zzbl zzblVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzbn.zzc(MessageDigest.getInstance("MD5"));
            countDownLatch = zzbn.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzbn.zzb;
        } catch (Throwable th) {
            zzbn.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
