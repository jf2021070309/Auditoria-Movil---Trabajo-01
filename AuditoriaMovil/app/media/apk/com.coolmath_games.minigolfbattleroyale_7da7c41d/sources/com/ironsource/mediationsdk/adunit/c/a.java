package com.ironsource.mediationsdk.adunit.c;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
/* loaded from: classes2.dex */
public final class a {
    IronSource.AD_UNIT a;
    String b;
    List<NetworkSettings> c;
    com.ironsource.mediationsdk.utils.b d;
    int e;
    int f;
    int g;
    com.ironsource.mediationsdk.adunit.c.b.a h;
    int i;

    public a(IronSource.AD_UNIT ad_unit, String str, List<NetworkSettings> list, com.ironsource.mediationsdk.utils.b bVar, int i, int i2, int i3, int i4, com.ironsource.mediationsdk.adunit.c.b.a aVar) {
        this.a = ad_unit;
        this.b = str;
        this.c = list;
        this.d = bVar;
        this.e = i;
        this.g = i2;
        this.f = i3;
        this.h = aVar;
        this.i = i4;
    }

    public final NetworkSettings a(String str) {
        for (NetworkSettings networkSettings : this.c) {
            if (networkSettings.getProviderInstanceName().equals(str)) {
                return networkSettings;
            }
        }
        return null;
    }

    public final boolean a() {
        return this.d.e > 0;
    }
}
