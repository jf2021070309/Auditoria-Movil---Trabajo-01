package com.google.android.gms.ads.internal.util;

import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes.dex */
public class zzv extends zzu {
    @Override // com.google.android.gms.ads.internal.util.zzad
    public boolean zzg(View view) {
        return super.zzg(view) || view.getWindowId() != null;
    }

    @Override // com.google.android.gms.ads.internal.util.zzad
    public final int zzh() {
        return 14;
    }

    @Override // com.google.android.gms.ads.internal.util.zzad
    public final long zzi() {
        return new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
    }
}
