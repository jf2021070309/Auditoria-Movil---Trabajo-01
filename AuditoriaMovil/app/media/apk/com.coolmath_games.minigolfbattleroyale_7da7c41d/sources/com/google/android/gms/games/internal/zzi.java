package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.games.video.VideoCapabilities;
import com.google.android.gms.games.video.Videos;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes.dex */
public final class zzi extends zzf.zzaq<Videos.CaptureCapabilitiesResult> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzi(BaseImplementation.ResultHolder resultHolder) {
        super(resultHolder);
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
    public final void zza(int i, VideoCapabilities videoCapabilities) {
        setResult(new zzf.zze(new Status(i), videoCapabilities));
    }
}
