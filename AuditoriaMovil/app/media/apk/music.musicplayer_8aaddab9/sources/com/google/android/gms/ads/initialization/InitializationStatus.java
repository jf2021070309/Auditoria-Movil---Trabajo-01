package com.google.android.gms.ads.initialization;

import androidx.annotation.RecentlyNonNull;
import java.util.Map;
/* loaded from: classes.dex */
public interface InitializationStatus {
    @RecentlyNonNull
    Map<String, AdapterStatus> getAdapterStatusMap();
}
