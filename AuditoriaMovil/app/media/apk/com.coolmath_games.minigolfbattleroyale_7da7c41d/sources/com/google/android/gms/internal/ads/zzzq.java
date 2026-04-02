package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzzq implements Runnable {
    private zzzq() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzzq(zzzr zzzrVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzzs.zza(MessageDigest.getInstance("MD5"));
            countDownLatch = zzzs.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzzs.zzb;
        } catch (Throwable th) {
            zzzs.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
