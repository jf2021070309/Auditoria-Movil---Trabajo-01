package com.bytedance.msdk.api.v2.ad.banner;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.msdk.api.v2.GMAdDislike;
import com.bytedance.msdk.api.v2.ad.nativeAd.GMNativeAdAppInfo;
import com.bytedance.msdk.api.v2.ad.nativeAd.GMViewBinder;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public interface GMNativeAdInfo {
    String getActionText();

    int getAdImageMode();

    String getDescription();

    GMAdDislike getDislikeDialog(Activity activity);

    GMAdDislike getDislikeDialog(Activity activity, Map<String, Object> map);

    String getIconUrl();

    List<String> getImageList();

    String getImageUrl();

    int getInteractionType();

    GMNativeAdAppInfo getNativeAdAppInfo();

    String getSource();

    double getStarRating();

    String getTitle();

    boolean hasDislike();

    void registerView(Activity activity, ViewGroup viewGroup, List<View> list, List<View> list2, GMViewBinder gMViewBinder);
}
