package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.os.Environment;
import android.os.StatFs;
import android.view.View;
import ch.qos.logback.core.util.FileSize;
import com.google.android.gms.common.ConnectionResult;
@TargetApi(ConnectionResult.SERVICE_UPDATING)
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
        return new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / FileSize.KB_COEFFICIENT;
    }
}
