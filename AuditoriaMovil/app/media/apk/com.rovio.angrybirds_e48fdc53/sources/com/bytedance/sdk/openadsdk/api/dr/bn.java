package com.bytedance.sdk.openadsdk.api.dr;

import com.bykv.vk.openvk.api.proto.EventListener;
import com.ss.android.download.api.config.IDownloadButtonClickListener;
/* loaded from: classes.dex */
public class bn extends com.bytedance.sdk.openadsdk.api.dr implements IDownloadButtonClickListener {
    public bn(EventListener eventListener) {
        this.dr = eventListener;
    }

    @Override // com.ss.android.download.api.config.IDownloadButtonClickListener
    public void handleComplianceDialog(boolean z) {
        dr(223100, dr() ? null : com.bytedance.sdk.openadsdk.api.o.dr().dr(com.bytedance.sdk.openadsdk.api.g.dr().dr(223101, z).ge()).ge());
    }

    @Override // com.ss.android.download.api.config.IDownloadButtonClickListener
    public void handleMarketFailedComplianceDialog() {
        dr(223110);
    }
}
