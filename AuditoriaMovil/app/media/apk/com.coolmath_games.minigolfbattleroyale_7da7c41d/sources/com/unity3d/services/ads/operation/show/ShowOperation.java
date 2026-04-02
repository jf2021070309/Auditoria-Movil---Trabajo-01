package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.AdOperation;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocation;
/* loaded from: classes2.dex */
public class ShowOperation extends AdOperation implements IShowOperation {
    private ShowOperationState showOperationState;

    public ShowOperation(ShowOperationState showOperationState, IWebViewBridgeInvocation iWebViewBridgeInvocation) {
        super(iWebViewBridgeInvocation, "show");
        this.showOperationState = showOperationState;
    }

    @Override // com.unity3d.services.ads.operation.show.IShowOperation
    public ShowOperationState getShowOperationState() {
        return this.showOperationState;
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowFailure(final String str, final UnityAds.UnityAdsShowError unityAdsShowError, final String str2) {
        ShowOperationState showOperationState = this.showOperationState;
        if (showOperationState == null || showOperationState.listener == null) {
            return;
        }
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.operation.show.ShowOperation.1
            @Override // java.lang.Runnable
            public void run() {
                ShowOperation.this.showOperationState.listener.onUnityAdsShowFailure(str, unityAdsShowError, str2);
            }
        });
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowStart(final String str) {
        ShowOperationState showOperationState = this.showOperationState;
        if (showOperationState == null || showOperationState.listener == null) {
            return;
        }
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.operation.show.ShowOperation.2
            @Override // java.lang.Runnable
            public void run() {
                ShowOperation.this.showOperationState.listener.onUnityAdsShowStart(str);
            }
        });
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowClick(final String str) {
        ShowOperationState showOperationState = this.showOperationState;
        if (showOperationState == null || showOperationState.listener == null) {
            return;
        }
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.operation.show.ShowOperation.3
            @Override // java.lang.Runnable
            public void run() {
                ShowOperation.this.showOperationState.listener.onUnityAdsShowClick(str);
            }
        });
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowComplete(final String str, final UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        ShowOperationState showOperationState = this.showOperationState;
        if (showOperationState == null || showOperationState.listener == null) {
            return;
        }
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.operation.show.ShowOperation.4
            @Override // java.lang.Runnable
            public void run() {
                ShowOperation.this.showOperationState.listener.onUnityAdsShowComplete(str, unityAdsShowCompletionState);
            }
        });
    }

    @Override // com.unity3d.services.core.webview.bridge.IWebViewSharedObject
    public String getId() {
        return this.showOperationState.id;
    }
}
