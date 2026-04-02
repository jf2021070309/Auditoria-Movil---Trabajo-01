package com.flurry.sdk;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.places.model.PlaceFields;
import com.flurry.sdk.ls;
import com.kuaishou.weapon.p0.g;
/* loaded from: classes2.dex */
public class jr implements ls.a {
    private static final String a = jr.class.getSimpleName();
    private static int b = -1;
    private static int c = -1;
    private static int d = -1;
    private static jr e;
    private boolean f;
    private Location g;
    private Location k;
    private long h = 0;
    private boolean l = false;
    private int m = 0;
    private kj<lu> n = new kj<lu>() { // from class: com.flurry.sdk.jr.1
        @Override // com.flurry.sdk.kj
        public final /* synthetic */ void a(lu luVar) {
            if (jr.this.h <= 0 || jr.this.h >= System.currentTimeMillis()) {
                return;
            }
            ko.a(4, jr.a, "No location received in 90 seconds , stopping LocationManager");
            jr.this.i();
        }
    };
    private LocationManager i = (LocationManager) ka.a().a.getSystemService(PlaceFields.LOCATION);
    private a j = new a();

    static /* synthetic */ int c(jr jrVar) {
        int i = jrVar.m + 1;
        jrVar.m = i;
        return i;
    }

    private jr() {
        lr a2 = lr.a();
        this.f = ((Boolean) a2.a("ReportLocation")).booleanValue();
        a2.a("ReportLocation", (ls.a) this);
        ko.a(4, a, "initSettings, ReportLocation = " + this.f);
        this.g = (Location) a2.a("ExplicitLocation");
        a2.a("ExplicitLocation", (ls.a) this);
        ko.a(4, a, "initSettings, ExplicitLocation = " + this.g);
    }

    public static synchronized jr a() {
        jr jrVar;
        synchronized (jr.class) {
            if (e == null) {
                e = new jr();
            }
            jrVar = e;
        }
        return jrVar;
    }

    public static int b() {
        return b;
    }

    public static int c() {
        return c;
    }

    public static int d() {
        return d;
    }

    public final synchronized void e() {
        ko.a(4, a, "Location update requested");
        if (this.m < 3 && !this.l && this.f && this.g == null) {
            Context context = ka.a().a;
            if (context.checkCallingOrSelfPermission(g.g) == 0 || context.checkCallingOrSelfPermission(g.h) == 0) {
                this.m = 0;
                String str = null;
                if (!a(context)) {
                    if (b(context)) {
                        str = "network";
                    }
                } else {
                    str = "passive";
                }
                if (!TextUtils.isEmpty(str)) {
                    this.i.requestLocationUpdates(str, 10000L, 0.0f, this.j, Looper.getMainLooper());
                }
                this.k = a(str);
                this.h = System.currentTimeMillis() + 90000;
                ko.a(4, a, "Register location timer");
                lv.a().a(this.n);
                this.l = true;
                ko.a(4, a, "LocationProvider started");
            }
        }
    }

    private static boolean a(Context context) {
        return context.checkCallingOrSelfPermission(g.g) == 0;
    }

    private static boolean b(Context context) {
        return context.checkCallingOrSelfPermission(g.h) == 0;
    }

    private Location a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.i.getLastKnownLocation(str);
    }

    public final synchronized void f() {
        ko.a(4, a, "Stop update location requested");
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.l) {
            this.i.removeUpdates(this.j);
            this.m = 0;
            this.h = 0L;
            ko.a(4, a, "Unregister location timer");
            lv.a().b(this.n);
            this.l = false;
            ko.a(4, a, "LocationProvider stopped");
        }
    }

    public final Location g() {
        String str;
        Location location = null;
        if (this.g != null) {
            return this.g;
        }
        if (this.f) {
            Context context = ka.a().a;
            if (!a(context) && !b(context)) {
                return null;
            }
            if (a(context)) {
                str = "passive";
            } else {
                str = b(context) ? "network" : null;
            }
            if (str != null) {
                Location a2 = a(str);
                if (a2 != null) {
                    this.k = a2;
                }
                location = this.k;
            }
        }
        ko.a(4, a, "getLocation() = " + location);
        return location;
    }

    @Override // com.flurry.sdk.ls.a
    public final void a(String str, Object obj) {
        char c2 = 65535;
        switch (str.hashCode()) {
            case -864112343:
                if (str.equals("ReportLocation")) {
                    c2 = 0;
                    break;
                }
                break;
            case -300729815:
                if (str.equals("ExplicitLocation")) {
                    c2 = 1;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.f = ((Boolean) obj).booleanValue();
                ko.a(4, a, "onSettingUpdate, ReportLocation = " + this.f);
                return;
            case 1:
                this.g = (Location) obj;
                ko.a(4, a, "onSettingUpdate, ExplicitLocation = " + this.g);
                return;
            default:
                ko.a(6, a, "LocationProvider internal error! Had to be LocationCriteria, ReportLocation or ExplicitLocation key.");
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements LocationListener {
        public a() {
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            if (location != null) {
                jr.this.k = location;
            }
            if (jr.c(jr.this) >= 3) {
                ko.a(4, jr.a, "Max location reports reached, stopping");
                jr.this.i();
            }
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i, Bundle bundle) {
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
        }
    }
}
