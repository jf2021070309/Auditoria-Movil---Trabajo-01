package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;
/* loaded from: classes.dex */
public final class zzzq implements Runnable {
    private zzzq() {
    }

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
