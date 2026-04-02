package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.api.Status;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
final class zzbi implements com.google.android.gms.cast.internal.zzas {
    final /* synthetic */ zzbk zza;

    public zzbi(zzbk zzbkVar) {
        this.zza = zzbkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004e A[LOOP:0: B:22:0x0048->B:24:0x004e, LOOP_END] */
    @Override // com.google.android.gms.cast.internal.zzas
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(java.lang.String r15, long r16, int r18, java.lang.Object r19, long r20, long r22) {
        /*
            r14 = this;
            r1 = r14
            com.google.android.gms.cast.framework.media.zzbk r0 = r1.zza     // Catch: java.lang.IllegalStateException -> L2d
            com.google.android.gms.cast.framework.media.zzbl r2 = new com.google.android.gms.cast.framework.media.zzbl     // Catch: java.lang.IllegalStateException -> L2d
            com.google.android.gms.common.api.Status r3 = new com.google.android.gms.common.api.Status     // Catch: java.lang.IllegalStateException -> L2d
            r13 = r18
            r3.<init>(r13)     // Catch: java.lang.IllegalStateException -> L2b
            r4 = 1
            r5 = r19
            boolean r6 = r5 instanceof com.google.android.gms.cast.internal.zzap
            r7 = 0
            if (r4 == r6) goto L15
            r5 = r7
        L15:
            if (r5 == 0) goto L1d
            r4 = r5
            com.google.android.gms.cast.internal.zzap r4 = (com.google.android.gms.cast.internal.zzap) r4     // Catch: java.lang.IllegalStateException -> L2b
            com.amazon.aps.iva.if0.c r4 = r4.zza     // Catch: java.lang.IllegalStateException -> L2b
            goto L1e
        L1d:
            r4 = r7
        L1e:
            if (r5 == 0) goto L24
            com.google.android.gms.cast.internal.zzap r5 = (com.google.android.gms.cast.internal.zzap) r5     // Catch: java.lang.IllegalStateException -> L2b
            com.google.android.gms.cast.MediaError r7 = r5.zzb     // Catch: java.lang.IllegalStateException -> L2b
        L24:
            r2.<init>(r3, r4, r7)     // Catch: java.lang.IllegalStateException -> L2b
            r0.setResult(r2)     // Catch: java.lang.IllegalStateException -> L2b
            goto L3c
        L2b:
            r0 = move-exception
            goto L30
        L2d:
            r0 = move-exception
            r13 = r18
        L30:
            com.google.android.gms.cast.internal.Logger r2 = com.google.android.gms.cast.framework.media.RemoteMediaClient.zzd()
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "Result already set when calling onRequestCompleted"
            r2.e(r0, r4, r3)
        L3c:
            com.google.android.gms.cast.framework.media.zzbk r0 = r1.zza
            com.google.android.gms.cast.framework.media.RemoteMediaClient r0 = r0.zzg
            java.util.List r0 = com.google.android.gms.cast.framework.media.RemoteMediaClient.zzm(r0)
            java.util.Iterator r0 = r0.iterator()
        L48:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L62
            java.lang.Object r2 = r0.next()
            r4 = r2
            com.google.android.gms.cast.framework.media.RemoteMediaClient$Callback r4 = (com.google.android.gms.cast.framework.media.RemoteMediaClient.Callback) r4
            r5 = r15
            r6 = r16
            r8 = r18
            r9 = r20
            r11 = r22
            r4.zza(r5, r6, r8, r9, r11)
            goto L48
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.zzbi.zza(java.lang.String, long, int, java.lang.Object, long, long):void");
    }

    @Override // com.google.android.gms.cast.internal.zzas
    public final void zzb(String str, long j, long j2, long j3) {
        Logger logger;
        List<RemoteMediaClient.Callback> list;
        try {
            zzbk zzbkVar = this.zza;
            zzbkVar.setResult(new zzbj(zzbkVar, new Status(2103)));
        } catch (IllegalStateException e) {
            logger = RemoteMediaClient.zza;
            logger.e(e, "Result already set when calling onRequestReplaced", new Object[0]);
        }
        list = this.zza.zzg.zzj;
        for (RemoteMediaClient.Callback callback : list) {
            callback.zza(str, j, 2103, j2, j3);
        }
    }
}
