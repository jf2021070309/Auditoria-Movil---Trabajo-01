package com.amazon.aps.iva.va;

import android.os.Build;
import com.amazon.aps.iva.metrics.types.DeviceInfo;
/* compiled from: DeviceInfoFactory.java */
/* loaded from: classes.dex */
public final class c {
    public static c b;
    public DeviceInfo a;

    public static c b() {
        if (b == null) {
            b = new c();
        }
        return b;
    }

    public final DeviceInfo a() {
        if (this.a == null) {
            this.a = DeviceInfo.builder().model(Build.MODEL).device(Build.DEVICE).osSdkVersion(Build.VERSION.SDK_INT).os(Build.VERSION.RELEASE).build();
        }
        return this.a;
    }
}
