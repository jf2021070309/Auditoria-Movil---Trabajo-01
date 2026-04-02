package com.facebook.places.internal;

import java.util.List;
/* loaded from: classes2.dex */
public interface WifiScanner {
    WifiScanResult getConnectedWifi();

    List<WifiScanResult> getWifiScans();

    void initAndCheckEligibility();

    boolean isWifiScanningEnabled();
}
