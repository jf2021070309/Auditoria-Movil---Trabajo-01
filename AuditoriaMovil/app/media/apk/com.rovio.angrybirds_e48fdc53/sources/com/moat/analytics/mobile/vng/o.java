package com.moat.analytics.mobile.vng;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.content.ContextCompat;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.facebook.places.model.PlaceFields;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class o implements LocationListener {
    private static o a = null;
    private ScheduledExecutorService b;
    private ScheduledFuture<?> c;
    private ScheduledFuture<?> d;
    private LocationManager e;
    private boolean f;
    private Location g;
    private boolean h;

    private o() {
        try {
            this.f = ((k) MoatAnalytics.getInstance()).c;
            if (this.f) {
                p.a(3, "LocationManager", this, "Moat location services disabled");
            } else {
                this.b = Executors.newScheduledThreadPool(1);
                this.e = (LocationManager) a.a().getSystemService(PlaceFields.LOCATION);
                if (this.e.getAllProviders().size() == 0) {
                    p.a(3, "LocationManager", this, "Device has no location providers");
                } else {
                    e();
                }
            }
        } catch (Exception e) {
            m.a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o a() {
        if (a == null) {
            a = new o();
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        try {
            p.a(3, "LocationManager", this, "stopping location fetch");
            h();
            i();
            if (z) {
                k();
            } else {
                j();
            }
        } catch (Exception e) {
            m.a(e);
        }
    }

    private static boolean a(Location location) {
        if (location == null) {
            return false;
        }
        return !(location.getLatitude() == PangleAdapterUtils.CPM_DEFLAUT_VALUE && location.getLongitude() == PangleAdapterUtils.CPM_DEFLAUT_VALUE) && location.getAccuracy() >= 0.0f && b(location) < 600.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Location location, Location location2) {
        if (location == location2) {
            return true;
        }
        return (location == null || location2 == null || location.getTime() != location2.getTime()) ? false : true;
    }

    private static boolean a(String str) {
        return ContextCompat.checkSelfPermission(a.a().getApplicationContext(), str) == 0;
    }

    private static float b(Location location) {
        return (float) ((System.currentTimeMillis() - location.getTime()) / 1000);
    }

    private static Location b(Location location, Location location2) {
        boolean a2 = a(location);
        boolean a3 = a(location2);
        if (a2) {
            return (!a3 || location.getAccuracy() < location.getAccuracy()) ? location : location2;
        } else if (a3) {
            return location2;
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            if (this.f || this.e == null) {
                return;
            }
            if (this.h) {
                p.a(3, "LocationManager", this, "already updating location");
            }
            p.a(3, "LocationManager", this, "starting location fetch");
            Location b = b();
            if (b == null) {
                g();
                return;
            }
            p.a(3, "LocationManager", this, "Have a valid location, won't fetch = " + b.toString());
            k();
        } catch (Exception e) {
            m.a(e);
        }
    }

    private Location f() {
        Location location = null;
        try {
            boolean l = l();
            boolean m = m();
            if (l && m) {
                location = b(this.e.getLastKnownLocation("gps"), this.e.getLastKnownLocation("network"));
            } else if (l) {
                location = this.e.getLastKnownLocation("gps");
            } else if (m) {
                location = this.e.getLastKnownLocation("network");
            }
        } catch (SecurityException e) {
            m.a(e);
        }
        return location;
    }

    private void g() {
        try {
            if (this.h) {
                return;
            }
            p.a(3, "LocationManager", this, "Attempting to start update");
            if (l()) {
                p.a(3, "LocationManager", this, "start updating gps location");
                this.e.requestLocationUpdates("gps", 0L, 0.0f, this, Looper.getMainLooper());
                this.h = true;
            }
            if (m()) {
                p.a(3, "LocationManager", this, "start updating network location");
                this.e.requestLocationUpdates("network", 0L, 0.0f, this, Looper.getMainLooper());
                this.h = true;
            }
            if (this.h) {
                i();
                this.d = this.b.schedule(new Runnable() { // from class: com.moat.analytics.mobile.vng.o.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            p.a(3, "LocationManager", this, "fetchTimedOut");
                            o.this.a(true);
                        } catch (Exception e) {
                            m.a(e);
                        }
                    }
                }, 60L, TimeUnit.SECONDS);
            }
        } catch (SecurityException e) {
            m.a(e);
        }
    }

    private void h() {
        try {
            p.a(3, "LocationManager", this, "Stopping to update location");
            if (!n() || this.e == null) {
                return;
            }
            this.e.removeUpdates(this);
            this.h = false;
        } catch (SecurityException e) {
            m.a(e);
        }
    }

    private void i() {
        if (this.d == null || this.d.isCancelled()) {
            return;
        }
        this.d.cancel(true);
        this.d = null;
    }

    private void j() {
        if (this.c == null || this.c.isCancelled()) {
            return;
        }
        this.c.cancel(true);
        this.c = null;
    }

    private void k() {
        p.a(3, "LocationManager", this, "Resetting fetch timer");
        j();
        Location b = b();
        this.c = this.b.schedule(new Runnable() { // from class: com.moat.analytics.mobile.vng.o.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    p.a(3, "LocationManager", this, "fetchTimerCompleted");
                    o.this.e();
                } catch (Exception e) {
                    m.a(e);
                }
            }
        }, b != null ? Math.max(600.0f - b(b), 0.0f) : 600.0f, TimeUnit.SECONDS);
    }

    private boolean l() {
        return a(com.kuaishou.weapon.p0.g.g) && this.e.getProvider("gps") != null && this.e.isProviderEnabled("gps");
    }

    private boolean m() {
        return n() && this.e.getProvider("network") != null && this.e.isProviderEnabled("network");
    }

    private static boolean n() {
        return a(com.kuaishou.weapon.p0.g.g) || a(com.kuaishou.weapon.p0.g.h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Location b() {
        if (this.f || this.e == null) {
            return null;
        }
        try {
            this.g = b(this.g, f());
            return this.g;
        } catch (Exception e) {
            m.a(e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        a(false);
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        try {
            p.a(3, "LocationManager", this, "Received an updated location = " + location.toString());
            float b = b(location);
            if (!location.hasAccuracy() || location.getAccuracy() > 100.0f || b >= 600.0f) {
                return;
            }
            this.g = b(this.g, location);
            p.a(3, "LocationManager", this, "fetchCompleted");
            a(true);
        } catch (Exception e) {
            m.a(e);
        }
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
