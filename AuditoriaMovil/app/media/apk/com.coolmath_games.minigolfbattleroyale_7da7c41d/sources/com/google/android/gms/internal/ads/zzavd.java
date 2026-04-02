package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzavd implements ThreadFactory {
    final /* synthetic */ String zza = "Loader:ExtractorMediaPeriod";

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzavd(String str) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.zza);
    }
}
