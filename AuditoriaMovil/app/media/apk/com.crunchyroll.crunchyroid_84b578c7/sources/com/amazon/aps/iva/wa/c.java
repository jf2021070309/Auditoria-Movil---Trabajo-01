package com.amazon.aps.iva.wa;

import com.amazon.aiondec.api.model.payload.DeviceCapabilityResponsePayload;
import java.util.LinkedList;
/* compiled from: ApsIAdsWebviewManager.java */
/* loaded from: classes.dex */
public final class c extends LinkedList<DeviceCapabilityResponsePayload.Capability> {
    public c() {
        add(DeviceCapabilityResponsePayload.Capability.INTERACTIVE_ADS_ENABLED);
    }
}
