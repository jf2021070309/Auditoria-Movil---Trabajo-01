package com.google.ads.interactivemedia.v3.internal;

import java.io.File;
import java.security.GeneralSecurityException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzjg implements zzqh {
    final /* synthetic */ zzot zza;

    public zzjg(zzji zzjiVar, zzot zzotVar) {
        this.zza = zzotVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzqh
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
