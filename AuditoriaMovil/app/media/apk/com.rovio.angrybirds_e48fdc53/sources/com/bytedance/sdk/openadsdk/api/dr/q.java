package com.bytedance.sdk.openadsdk.api.dr;

import com.bykv.vk.openvk.api.proto.EventListener;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.download.DownloadStatusChangeListener;
import com.ss.android.download.api.model.DownloadShortInfo;
/* loaded from: classes.dex */
public class q extends com.bytedance.sdk.openadsdk.api.dr implements DownloadStatusChangeListener {
    public q(EventListener eventListener) {
        this.dr = eventListener;
    }

    @Override // com.ss.android.download.api.download.DownloadStatusChangeListener
    public void onIdle() {
        dr(223600);
    }

    @Override // com.ss.android.download.api.download.DownloadStatusChangeListener
    public void onDownloadStart(DownloadModel downloadModel, DownloadController downloadController) {
        dr(223601, dr() ? null : com.bytedance.sdk.openadsdk.api.o.dr().dr(com.bytedance.sdk.openadsdk.api.g.dr().dr(223201, new o(downloadModel)).dr(223203, new dr(downloadController)).ge()).ge());
    }

    @Override // com.ss.android.download.api.download.DownloadStatusChangeListener
    public void onDownloadActive(DownloadShortInfo downloadShortInfo, int i) {
        dr(223602, dr() ? null : com.bytedance.sdk.openadsdk.api.o.dr().dr(com.bytedance.sdk.openadsdk.api.g.dr().dr(223607, new g(downloadShortInfo)).dr(223608, i).ge()).ge());
    }

    @Override // com.ss.android.download.api.download.DownloadStatusChangeListener
    public void onDownloadPaused(DownloadShortInfo downloadShortInfo, int i) {
        dr(223603, dr() ? null : com.bytedance.sdk.openadsdk.api.o.dr().dr(com.bytedance.sdk.openadsdk.api.g.dr().dr(223607, new g(downloadShortInfo)).dr(223608, i).ge()).ge());
    }

    @Override // com.ss.android.download.api.download.DownloadStatusChangeListener
    public void onDownloadFailed(DownloadShortInfo downloadShortInfo) {
        dr(223604, dr() ? null : com.bytedance.sdk.openadsdk.api.o.dr().dr(com.bytedance.sdk.openadsdk.api.g.dr().dr(223607, new g(downloadShortInfo)).ge()).ge());
    }

    @Override // com.ss.android.download.api.download.DownloadStatusChangeListener
    public void onInstalled(DownloadShortInfo downloadShortInfo) {
        dr(223605, dr() ? null : com.bytedance.sdk.openadsdk.api.o.dr().dr(com.bytedance.sdk.openadsdk.api.g.dr().dr(223607, new g(downloadShortInfo)).ge()).ge());
    }

    @Override // com.ss.android.download.api.download.DownloadStatusChangeListener
    public void onDownloadFinished(DownloadShortInfo downloadShortInfo) {
        dr(223606, dr() ? null : com.bytedance.sdk.openadsdk.api.o.dr().dr(com.bytedance.sdk.openadsdk.api.g.dr().dr(223607, new g(downloadShortInfo)).ge()).ge());
    }
}
