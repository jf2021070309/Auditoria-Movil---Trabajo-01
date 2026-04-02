package com.bytedance.msdk.api.v2.ad.draw;

import android.view.View;
/* loaded from: classes.dex */
public interface GMDrawExpressAdListener extends GMDrawAdListener {
    void onRenderFail(View view, String str, int i);

    void onRenderSuccess(float f, float f2);
}
