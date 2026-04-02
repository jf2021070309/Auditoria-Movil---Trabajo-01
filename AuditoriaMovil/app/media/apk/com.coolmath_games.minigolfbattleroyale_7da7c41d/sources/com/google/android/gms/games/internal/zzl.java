package com.google.android.gms.games.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.games.video.CaptureState;
import com.google.android.gms.games.video.Videos;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes.dex */
public final class zzl extends zzf.zzaq<Videos.CaptureStateResult> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzl(BaseImplementation.ResultHolder resultHolder) {
        super(resultHolder);
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
    public final void zze(int i, Bundle bundle) {
        setResult(new zzf.zzh(new Status(i), CaptureState.zza(bundle)));
    }
}
