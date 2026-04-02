package com.google.ads.interactivemedia.v3.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzjh implements Runnable {
    final /* synthetic */ zzji zza;

    public zzjh(zzji zzjiVar) {
        this.zza = zzjiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        zzoy zzoyVar;
        Object obj2;
        obj = this.zza.zzo;
        synchronized (obj) {
            z = this.zza.zzp;
            if (!z) {
                this.zza.zzp = true;
                try {
                    zzji.zzj(this.zza);
                } catch (Exception e) {
                    zzoyVar = this.zza.zzh;
                    zzoyVar.zzc(2023, -1L, e);
                }
                obj2 = this.zza.zzo;
                synchronized (obj2) {
                    this.zza.zzp = false;
                }
            }
        }
    }
}
