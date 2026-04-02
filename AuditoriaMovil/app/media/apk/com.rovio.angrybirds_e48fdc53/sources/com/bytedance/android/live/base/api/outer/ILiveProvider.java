package com.bytedance.android.live.base.api.outer;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.live.base.api.outer.ILivePreviewLayout;
import com.bytedance.android.live.base.api.outer.data.RoomInfo;
import java.util.List;
/* loaded from: classes.dex */
public interface ILiveProvider {
    ILivePreviewLayout getILivePreviewLayout(ILivePreviewLayout.Builder builder);

    String getIdentity();

    ILiveView getLiveView(Context context, int i, String str, boolean z, Bundle bundle);

    List<RoomInfo> getRoomInfoList(int i, int i2, int i3);

    IStandalonePreviewView makeStandalonePreviewView(Context context, int i, Bundle bundle);

    void startLive(Context context, int i, String str, Bundle bundle);
}
