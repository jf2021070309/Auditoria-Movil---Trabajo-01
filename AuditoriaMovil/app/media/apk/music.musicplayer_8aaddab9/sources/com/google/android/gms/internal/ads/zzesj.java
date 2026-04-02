package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class zzesj implements zzery<zzesh> {
    private final zzfsn zza;
    private final Context zzb;

    public zzesj(zzfsn zzfsnVar, Context context) {
        this.zza = zzfsnVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzesh> zza() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzesi
            private final zzesj zza;

            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzesh zzb() throws java.lang.Exception {
        /*
            r9 = this;
            android.content.Context r0 = r9.zzb
            java.lang.String r1 = "phone"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r2 = r0.getNetworkOperator()
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.isAtLeastR()
            r3 = 0
            if (r1 == 0) goto L29
            com.google.android.gms.internal.ads.zzbjd<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.zzbjl.zzgd
            com.google.android.gms.internal.ads.zzbjj r4 = com.google.android.gms.internal.ads.zzbet.zzc()
            java.lang.Object r1 = r4.zzc(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L29
            r4 = 0
            goto L2e
        L29:
            int r1 = r0.getNetworkType()
            r4 = r1
        L2e:
            int r5 = r0.getPhoneType()
            com.google.android.gms.ads.internal.zzt.zzc()
            android.content.Context r0 = r9.zzb
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r0 = com.google.android.gms.ads.internal.util.zzs.zzE(r0, r1)
            r1 = -1
            if (r0 == 0) goto L68
            android.content.Context r0 = r9.zzb
            java.lang.String r3 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r3 = r0.getActiveNetworkInfo()
            if (r3 == 0) goto L60
            int r1 = r3.getType()
            android.net.NetworkInfo$DetailedState r3 = r3.getDetailedState()
            int r3 = r3.ordinal()
            r8 = r3
            r3 = r1
            r1 = r8
            goto L61
        L60:
            r3 = -1
        L61:
            boolean r0 = r0.isActiveNetworkMetered()
            r6 = r0
            r7 = r1
            goto L6c
        L68:
            r0 = -2
            r3 = -2
            r6 = 0
            r7 = -1
        L6c:
            com.google.android.gms.internal.ads.zzesh r0 = new com.google.android.gms.internal.ads.zzesh
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzesj.zzb():com.google.android.gms.internal.ads.zzesh");
    }
}
