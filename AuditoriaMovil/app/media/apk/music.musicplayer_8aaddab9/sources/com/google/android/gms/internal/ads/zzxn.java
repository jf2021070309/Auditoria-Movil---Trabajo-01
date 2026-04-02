package com.google.android.gms.internal.ads;

import e.a.d.a.a;
import java.io.Closeable;
import java.io.IOException;
/* loaded from: classes.dex */
public final class zzxn extends zzgkl implements Closeable {
    private static final zzgks zza = zzgks.zzb(zzxn.class);

    public zzxn(zzgkm zzgkmVar, zzxm zzxmVar) throws IOException {
        zze(zzgkmVar, zzgkmVar.zzb(), zzxmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgkl, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzgkl
    public final String toString() {
        String obj = this.zzd.toString();
        return a.s(new StringBuilder(String.valueOf(obj).length() + 7), "model(", obj, ")");
    }
}
