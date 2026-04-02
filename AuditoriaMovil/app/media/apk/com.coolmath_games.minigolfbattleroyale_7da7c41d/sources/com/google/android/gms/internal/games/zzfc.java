package com.google.android.gms.internal.games;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzfc implements Runnable {
    private final /* synthetic */ zzfd zzgu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfc(zzfd zzfdVar) {
        this.zzgu = zzfdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzgu.zzbp();
    }
}
