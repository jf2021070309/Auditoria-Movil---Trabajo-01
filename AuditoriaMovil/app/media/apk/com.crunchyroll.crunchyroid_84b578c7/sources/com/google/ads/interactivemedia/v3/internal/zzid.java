package com.google.ads.interactivemedia.v3.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzid implements Runnable {
    private zzid() {
    }

    public /* synthetic */ zzid(zzic zzicVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzie.zzc(MessageDigest.getInstance("MD5"));
            countDownLatch = zzie.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzie.zzb;
        } catch (Throwable th) {
            zzie.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
