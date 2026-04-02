package com.google.android.gms.ads.formats;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepName;
/* loaded from: classes.dex */
public interface ShouldDelayBannerRenderingListener {
    @KeepName
    boolean shouldDelayBannerRendering(@RecentlyNonNull Runnable runnable);
}
