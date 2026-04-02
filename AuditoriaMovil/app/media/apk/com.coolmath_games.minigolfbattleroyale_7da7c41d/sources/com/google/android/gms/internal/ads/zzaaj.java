package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzaaj implements zzfkd {
    final /* synthetic */ zzfie zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaaj(zzaal zzaalVar, zzfie zzfieVar) {
        this.zza = zzfieVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfkd
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
