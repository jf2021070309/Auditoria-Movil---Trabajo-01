package com.google.ads.interactivemedia.v3.internal;

import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
enum zzvg implements zzvf {
    INSTANCE;
    
    private static final Set zzb = new CopyOnWriteArraySet();

    @Override // com.google.ads.interactivemedia.v3.internal.zzvf
    public final void zza(Class cls) {
        for (WeakReference weakReference : zzb) {
            if (cls.equals(weakReference.get())) {
                return;
            }
        }
        zzvi.zzb(cls);
        Set set = zzb;
        if (set.size() > 1000) {
            set.clear();
        }
        set.add(new WeakReference(cls));
    }
}
