package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Comparator;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzbdj implements Comparator {
    static final Comparator zza = new zzbdj();

    private zzbdj() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return RequestConfiguration.zza.indexOf((String) obj) - RequestConfiguration.zza.indexOf((String) obj2);
    }
}
