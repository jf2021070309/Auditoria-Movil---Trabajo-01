package com.amazon.aps.iva.qd0;
/* compiled from: ExternalOverridabilityCondition.java */
/* loaded from: classes4.dex */
public interface j {

    /* compiled from: ExternalOverridabilityCondition.java */
    /* loaded from: classes4.dex */
    public enum a {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    /* compiled from: ExternalOverridabilityCondition.java */
    /* loaded from: classes4.dex */
    public enum b {
        OVERRIDABLE,
        CONFLICT,
        INCOMPATIBLE,
        UNKNOWN
    }

    b a(com.amazon.aps.iva.oc0.a aVar, com.amazon.aps.iva.oc0.a aVar2, com.amazon.aps.iva.oc0.e eVar);

    a b();
}
