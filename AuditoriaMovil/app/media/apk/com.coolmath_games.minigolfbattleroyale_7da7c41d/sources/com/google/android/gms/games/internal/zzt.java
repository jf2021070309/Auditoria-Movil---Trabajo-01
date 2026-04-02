package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.games.leaderboard.Leaderboards;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes.dex */
public final class zzt extends zzf.zzaq<Leaderboards.LoadPlayerScoreResult> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzt(BaseImplementation.ResultHolder resultHolder) {
        super(resultHolder);
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
    public final void zzac(DataHolder dataHolder) {
        setResult(new zzf.zzad(dataHolder));
    }
}
