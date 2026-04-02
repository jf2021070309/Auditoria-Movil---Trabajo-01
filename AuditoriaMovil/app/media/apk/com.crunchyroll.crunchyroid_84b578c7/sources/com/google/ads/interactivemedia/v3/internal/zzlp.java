package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzlp extends zzmh {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzlp(zzkt zzktVar, String str, String str2, zzaf zzafVar, int i, int i2) {
        super(zzktVar, "vTrDx0mzn79E6p7ud7P2bbbSIuj5Ro3e43BAhI8+YfMvUU/TNpO6nVUIT0BBDDcC", "3oeb8dzJX1hHAQUL8JEiKbyteGd7lWq0rzcDvs3S6mQ=", zzafVar, i, 22);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmh
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (Long) this.zzf.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzy(zzi.longValue());
        }
    }
}
