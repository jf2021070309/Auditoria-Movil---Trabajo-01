package com.bytedance.msdk.api.v2;
/* loaded from: classes.dex */
public interface GMDislikeCallback {
    void onCancel();

    void onRefuse();

    void onSelected(int i, String str);

    void onShow();
}
