package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes2.dex */
public final class o {
    private static o b;
    private ArrayList<NetworkSettings> a = new ArrayList<>();

    private o() {
    }

    public static synchronized o a() {
        o oVar;
        synchronized (o.class) {
            if (b == null) {
                b = new o();
            }
            oVar = b;
        }
        return oVar;
    }

    public final NetworkSettings a(String str) {
        Iterator<NetworkSettings> it = this.a.iterator();
        while (it.hasNext()) {
            NetworkSettings next = it.next();
            if (next.getProviderName().equals(str)) {
                return next;
            }
        }
        NetworkSettings networkSettings = new NetworkSettings(str);
        a(networkSettings);
        return networkSettings;
    }

    public final void a(NetworkSettings networkSettings) {
        this.a.add(networkSettings);
    }

    public final void b() {
        Iterator<NetworkSettings> it = this.a.iterator();
        while (it.hasNext()) {
            NetworkSettings next = it.next();
            if (next.isMultipleInstances() && !TextUtils.isEmpty(next.getProviderTypeForReflection())) {
                NetworkSettings a = a(next.getProviderDefaultInstance());
                next.setApplicationSettings(IronSourceUtils.mergeJsons(next.getApplicationSettings(), a.getApplicationSettings()));
                next.setInterstitialSettings(IronSourceUtils.mergeJsons(next.getInterstitialSettings(), a.getInterstitialSettings()));
                next.setRewardedVideoSettings(IronSourceUtils.mergeJsons(next.getRewardedVideoSettings(), a.getRewardedVideoSettings()));
                next.setBannerSettings(IronSourceUtils.mergeJsons(next.getBannerSettings(), a.getBannerSettings()));
            }
        }
    }

    public final boolean b(String str) {
        Iterator<NetworkSettings> it = this.a.iterator();
        while (it.hasNext()) {
            if (it.next().getProviderName().equals(str)) {
                return true;
            }
        }
        return false;
    }
}
