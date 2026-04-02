package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes.dex */
public final class AdView extends BaseAdView {
    public AdView(@RecentlyNonNull Context context) {
        super(context, 0);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public AdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public AdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2, 0);
    }

    @RecentlyNonNull
    public final VideoController zza() {
        return this.zza.zzw();
    }
}
