package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzamb extends BroadcastReceiver {
    final /* synthetic */ zzamd zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzamb(zzamd zzamdVar, zzama zzamaVar) {
        this.zza = zzamdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r10, android.content.Intent r11) {
        /*
            r9 = this;
            java.lang.String r11 = "connectivity"
            java.lang.Object r11 = r10.getSystemService(r11)
            android.net.ConnectivityManager r11 = (android.net.ConnectivityManager) r11
            r0 = 2
            r1 = 9
            r2 = 6
            r3 = 4
            r4 = 29
            r5 = 1
            r6 = 0
            r7 = 5
            if (r11 != 0) goto L16
        L14:
            r0 = r6
            goto L4e
        L16:
            android.net.NetworkInfo r11 = r11.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L14
            if (r11 == 0) goto L4d
            boolean r8 = r11.isConnected()
            if (r8 != 0) goto L23
            goto L4d
        L23:
            int r8 = r11.getType()
            if (r8 == 0) goto L3a
            if (r8 == r5) goto L4e
            if (r8 == r3) goto L3a
            if (r8 == r7) goto L3a
            if (r8 == r2) goto L38
            if (r8 == r1) goto L36
            r0 = 8
            goto L4e
        L36:
            r0 = 7
            goto L4e
        L38:
            r0 = r7
            goto L4e
        L3a:
            int r11 = r11.getSubtype()
            switch(r11) {
                case 1: goto L4b;
                case 2: goto L4b;
                case 3: goto L49;
                case 4: goto L49;
                case 5: goto L49;
                case 6: goto L49;
                case 7: goto L49;
                case 8: goto L49;
                case 9: goto L49;
                case 10: goto L49;
                case 11: goto L49;
                case 12: goto L49;
                case 13: goto L38;
                case 14: goto L49;
                case 15: goto L49;
                case 16: goto L41;
                case 17: goto L49;
                case 18: goto L4e;
                case 19: goto L41;
                case 20: goto L43;
                default: goto L41;
            }
        L41:
            r0 = r2
            goto L4e
        L43:
            int r11 = com.google.android.gms.internal.ads.zzamq.zza
            if (r11 < r4) goto L14
            r0 = r1
            goto L4e
        L49:
            r0 = r3
            goto L4e
        L4b:
            r0 = 3
            goto L4e
        L4d:
            r0 = r5
        L4e:
            int r11 = com.google.android.gms.internal.ads.zzamq.zza
            if (r11 < r4) goto L7d
            com.google.android.gms.internal.ads.zzaly.zza()
            if (r0 != r7) goto L7d
            java.lang.String r11 = "phone"
            java.lang.Object r10 = r10.getSystemService(r11)     // Catch: java.lang.RuntimeException -> L7e
            android.telephony.TelephonyManager r10 = (android.telephony.TelephonyManager) r10     // Catch: java.lang.RuntimeException -> L7e
            r11 = 0
            if (r10 == 0) goto L7c
            com.google.android.gms.internal.ads.zzamc r0 = new com.google.android.gms.internal.ads.zzamc     // Catch: java.lang.RuntimeException -> L7e
            com.google.android.gms.internal.ads.zzamd r1 = r9.zza     // Catch: java.lang.RuntimeException -> L7e
            r0.<init>(r1, r11)     // Catch: java.lang.RuntimeException -> L7e
            int r11 = com.google.android.gms.internal.ads.zzamq.zza     // Catch: java.lang.RuntimeException -> L7e
            r1 = 31
            if (r11 >= r1) goto L73
            r10.listen(r0, r5)     // Catch: java.lang.RuntimeException -> L7e
            goto L78
        L73:
            r11 = 1048576(0x100000, float:1.469368E-39)
            r10.listen(r0, r11)     // Catch: java.lang.RuntimeException -> L7e
        L78:
            r10.listen(r0, r6)     // Catch: java.lang.RuntimeException -> L7e
            return
        L7c:
            throw r11     // Catch: java.lang.RuntimeException -> L7e
        L7d:
            r7 = r0
        L7e:
            com.google.android.gms.internal.ads.zzamd r10 = r9.zza
            com.google.android.gms.internal.ads.zzamd.zzd(r10, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamb.onReceive(android.content.Context, android.content.Intent):void");
    }
}
