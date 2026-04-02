package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzuc {
    public static /* synthetic */ boolean zza(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        boolean z;
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
                z = true;
            } else if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                z = false;
            } else {
                continue;
            }
            if (z) {
                return true;
            }
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
    }
}
