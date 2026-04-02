package com.applovin.impl.sdk;

import android.annotation.SuppressLint;
import android.location.Location;
import android.location.LocationManager;
import android.provider.Settings;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class u {
    private final m a;

    /* renamed from: b  reason: collision with root package name */
    private final LocationManager f4289b;

    /* renamed from: c  reason: collision with root package name */
    private t f4290c;

    public u(m mVar) {
        this.a = mVar;
        this.f4289b = (LocationManager) mVar.L().getSystemService("location");
    }

    @SuppressLint({"MissingPermission"})
    private Location a(String str, String str2) {
        v B;
        StringBuilder A;
        String str3;
        if (com.applovin.impl.sdk.utils.g.a(str2, this.a.L())) {
            try {
                return this.f4289b.getLastKnownLocation(str);
            } catch (IllegalArgumentException e2) {
                e = e2;
                B = this.a.B();
                A = e.a.d.a.a.A("Failed to retrieve location from ", str);
                str3 = ": device does not support this location provider.";
                A.append(str3);
                B.b("LocationManager", A.toString(), e);
                return null;
            } catch (NullPointerException e3) {
                e = e3;
                B = this.a.B();
                A = e.a.d.a.a.A("Failed to retrieve location from ", str);
                str3 = ": location provider is not available.";
                A.append(str3);
                B.b("LocationManager", A.toString(), e);
                return null;
            } catch (SecurityException e4) {
                e = e4;
                B = this.a.B();
                A = e.a.d.a.a.A("Failed to retrieve location from ", str);
                str3 = ": access denied.";
                A.append(str3);
                B.b("LocationManager", A.toString(), e);
                return null;
            } catch (Throwable th) {
                e = th;
                B = this.a.B();
                A = e.a.d.a.a.A("Failed to retrieve location from ", str);
                str3 = ".";
                A.append(str3);
                B.b("LocationManager", A.toString(), e);
                return null;
            }
        }
        return null;
    }

    public boolean a() {
        return com.applovin.impl.sdk.utils.g.a("android.permission.ACCESS_COARSE_LOCATION", this.a.L());
    }

    public boolean b() {
        return com.applovin.impl.sdk.utils.g.g() ? this.f4289b.isLocationEnabled() : (com.applovin.impl.sdk.utils.g.c() && Settings.Secure.getInt(this.a.L().getContentResolver(), "location_mode", 0) == 0) ? false : true;
    }

    public t c() {
        if (this.a.p().isLocationCollectionEnabled() && ((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dZ)).booleanValue()) {
            long millis = TimeUnit.MINUTES.toMillis(((Long) this.a.a(com.applovin.impl.sdk.c.b.ea)).longValue());
            if (this.f4290c == null || System.currentTimeMillis() - this.f4290c.c() >= millis) {
                Location a = a("gps", "android.permission.ACCESS_FINE_LOCATION");
                if (a == null) {
                    a = a("network", "android.permission.ACCESS_COARSE_LOCATION");
                }
                if (a != null) {
                    this.f4290c = new t(a.getLatitude(), a.getLongitude(), System.currentTimeMillis());
                }
                return this.f4290c;
            }
            return this.f4290c;
        }
        return null;
    }
}
