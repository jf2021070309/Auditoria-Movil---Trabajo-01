package com.facebook.places.internal;

import android.location.Location;
/* loaded from: classes2.dex */
public interface LocationScanner {
    Location getLocation();

    void initAndCheckEligibility();
}
