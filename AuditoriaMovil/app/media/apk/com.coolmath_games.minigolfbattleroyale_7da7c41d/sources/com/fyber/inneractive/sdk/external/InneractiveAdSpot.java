package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.d.g;
/* loaded from: classes.dex */
public interface InneractiveAdSpot {

    /* loaded from: classes.dex */
    public interface RequestListener {
        void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode);

        void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot);
    }

    void addUnitController(InneractiveUnitController inneractiveUnitController);

    void destroy();

    g getAdContent();

    InneractiveAdRequest getCurrentProcessedRequest();

    String getLocalUniqueId();

    InneractiveMediationName getMediationName();

    String getMediationNameString();

    String getMediationVersion();

    String getRequestedSpotId();

    InneractiveUnitController getSelectedUnitController();

    boolean isReady();

    void removeUnitController(InneractiveUnitController inneractiveUnitController);

    void requestAd(InneractiveAdRequest inneractiveAdRequest);

    void setMediationName(InneractiveMediationName inneractiveMediationName);

    void setMediationName(String str);

    void setMediationVersion(String str);

    void setRequestListener(RequestListener requestListener);

    /* loaded from: classes.dex */
    public static abstract class RequestListenerAdapter implements RequestListener {
        public abstract void onInneractiveAdRequestResult(InneractiveAdSpot inneractiveAdSpot, boolean z, InneractiveErrorCode inneractiveErrorCode);

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
            onInneractiveAdRequestResult(inneractiveAdSpot, false, inneractiveErrorCode);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
            onInneractiveAdRequestResult(inneractiveAdSpot, true, null);
        }
    }
}
