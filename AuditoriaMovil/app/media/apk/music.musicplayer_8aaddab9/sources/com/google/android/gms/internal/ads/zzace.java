package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* loaded from: classes.dex */
public final class zzace extends zzacz {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzace(zzabr zzabrVar, String str, String str2, zzyj zzyjVar, int i2, int i3) {
        super(zzabrVar, "BZSpo1ki7Qq4VpNbKNY5xp3ObP5b46iKtLhMqj95i84Sl1pKZG1hW1hXSXh30EEu", "LLuZlwuRYspGUGo7OZU51ciMYYFQ89K2r1TLDzvNq9k=", zzyjVar, i2, 44);
    }

    @Override // com.google.android.gms.internal.ads.zzacz
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (Long) this.zzf.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzB(zzi.longValue());
        }
    }
}
