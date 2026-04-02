package com.google.android.gms.ads.nativead;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.CommonStatusCodes;
/* loaded from: classes.dex */
public class AdChoicesView extends RelativeLayout {
    public AdChoicesView(@RecentlyNonNull Context context) {
        super(context);
    }

    public AdChoicesView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AdChoicesView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    @TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    public AdChoicesView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }
}
