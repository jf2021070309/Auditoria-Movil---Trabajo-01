package com.bytedance.msdk.api.v2;

import com.bytedance.msdk.api.AdError;
import java.util.List;
/* loaded from: classes.dex */
public interface GMConfigCallback {
    void onConfigLoadFail(AdError adError);

    void onConfigLoaded(List<String> list);
}
