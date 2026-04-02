package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzlz extends zzmh {
    private final StackTraceElement[] zzi;

    public zzlz(zzkt zzktVar, String str, String str2, zzaf zzafVar, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(zzktVar, "c1kwIqDUt3eWAvCNkbABb9gMelky1LQri6Meuw58pR9sFDLpUMniqwXzwcy1jftP", "HqknIq5XGienhA1/6NdBPO+lKaPIpkMOC/sqE+FKLYc=", zzafVar, i, 45);
        this.zzi = stackTraceElementArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmh
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.zzi;
        if (stackTraceElementArr != null) {
            zzkk zzkkVar = new zzkk((String) this.zzf.invoke(null, stackTraceElementArr));
            synchronized (this.zze) {
                this.zze.zzF(zzkkVar.zza.longValue());
                if (zzkkVar.zzb.booleanValue()) {
                    zzaf zzafVar = this.zze;
                    int i = 1;
                    if (true != zzkkVar.zzc.booleanValue()) {
                        i = 2;
                    }
                    zzafVar.zzac(i);
                } else {
                    this.zze.zzac(3);
                }
            }
        }
    }
}
