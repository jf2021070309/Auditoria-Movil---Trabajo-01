package com.google.android.gms.ads.formats;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.common.api.CommonStatusCodes;
@Deprecated
/* loaded from: classes.dex */
public class MediaView extends FrameLayout {
    private MediaContent zza;
    private ImageView.ScaleType zzb;

    public MediaView(@RecentlyNonNull Context context) {
        super(context);
    }

    public MediaView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    @TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    public MediaView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    public void setImageScaleType(@RecentlyNonNull ImageView.ScaleType scaleType) {
        this.zzb = scaleType;
    }

    public void setMediaContent(@RecentlyNonNull MediaContent mediaContent) {
        this.zza = mediaContent;
    }
}
