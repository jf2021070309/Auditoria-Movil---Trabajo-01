package com.kwad.components.core.n.b.a;

import android.content.Context;
import android.os.Vibrator;
import com.kwad.components.offline.api.core.api.IVibratorUtil;
import com.kwad.sdk.utils.bj;
/* loaded from: classes.dex */
public final class k implements IVibratorUtil {
    @Override // com.kwad.components.offline.api.core.api.IVibratorUtil
    public final void cancelVibrate(Context context, Vibrator vibrator) {
        bj.b(context, vibrator);
    }

    @Override // com.kwad.components.offline.api.core.api.IVibratorUtil
    public final void vibrate(Context context, Vibrator vibrator, long j) {
        bj.vibrate(context, vibrator, j);
    }
}
