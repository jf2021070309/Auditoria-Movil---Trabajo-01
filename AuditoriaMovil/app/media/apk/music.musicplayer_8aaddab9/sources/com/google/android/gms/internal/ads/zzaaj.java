package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class zzaaj implements zzfkd {
    public final /* synthetic */ zzfie zza;

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
