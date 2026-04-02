package com.bytedance.sdk.openadsdk.api.dr;

import com.bykv.vk.openvk.api.proto.EventListener;
import com.ss.android.download.api.config.OnItemClickListener;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
/* loaded from: classes.dex */
public class rb extends com.bytedance.sdk.openadsdk.api.dr implements OnItemClickListener {
    public rb(EventListener eventListener) {
        this.dr = eventListener;
    }

    @Override // com.ss.android.download.api.config.OnItemClickListener
    public void onItemClick(DownloadModel downloadModel, DownloadEventConfig downloadEventConfig, DownloadController downloadController) {
        dr(223200, dr() ? null : com.bytedance.sdk.openadsdk.api.o.dr().dr(com.bytedance.sdk.openadsdk.api.g.dr().dr(223201, new o(downloadModel)).dr(223202, new ge(downloadEventConfig)).dr(223203, new dr(downloadController)).ge()).ge());
    }
}
