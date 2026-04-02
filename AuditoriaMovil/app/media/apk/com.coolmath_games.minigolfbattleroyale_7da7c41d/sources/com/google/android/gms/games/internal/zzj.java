package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.games.snapshot.Snapshots;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes.dex */
public final class zzj extends zzf.zzaq<Snapshots.DeleteSnapshotResult> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzj(BaseImplementation.ResultHolder resultHolder) {
        super(resultHolder);
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
    public final void zze(int i, String str) {
        setResult(new zzf.zzl(i, str));
    }
}
