package com.amazon.aps.iva.metrics.types;

import com.amazon.aps.iva.types.EnvironmentData;
/* loaded from: classes.dex */
public interface Event {
    void decorateEvent(EnvironmentData environmentData);

    Severity getSeverity();
}
