package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.ThreadHelper;
import com.facebook.places.model.PlaceFields;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class f {
    private static long a = 1800000;
    private static Handler b = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ LocationManager b;

        a(Context context, LocationManager locationManager) {
            this.a = context;
            this.b = locationManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.b(this.a, this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b implements LocationListener {
        final /* synthetic */ Context a;
        final /* synthetic */ LocationManager b;

        b(Context context, LocationManager locationManager) {
            this.a = context;
            this.b = locationManager;
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            if (location != null && f.b(location)) {
                f.b(this.a, location);
            }
            f.b(this.b, this);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c implements Runnable {
        final /* synthetic */ LocationManager a;
        final /* synthetic */ LocationListener b;

        c(LocationManager locationManager, LocationListener locationListener) {
            this.a = locationManager;
            this.b = locationListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.b(this.a, this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d implements Callable<Location> {
        private LocationManager a;
        private String b;

        public d(LocationManager locationManager, String str) {
            this.a = locationManager;
            this.b = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Location call() throws Exception {
            long currentTimeMillis = System.currentTimeMillis();
            Location lastKnownLocation = this.a.getLastKnownLocation(this.b);
            long currentTimeMillis2 = System.currentTimeMillis();
            Logger.d("AdLocationUtils", "location:" + lastKnownLocation + ",getLastKnownLocation use time :" + (currentTimeMillis2 - currentTimeMillis));
            return lastKnownLocation;
        }
    }

    private static Location a(LocationManager locationManager) {
        Location a2 = a(locationManager, "gps");
        if (a2 == null) {
            a2 = a(locationManager, "network");
        }
        return a2 == null ? a(locationManager, "passive") : a2;
    }

    private static Location a(LocationManager locationManager, String str) {
        try {
            FutureTask futureTask = new FutureTask(new d(locationManager, str));
            ThreadHelper.runOnThreadPool(futureTask);
            Location location = (Location) futureTask.get(1L, TimeUnit.SECONDS);
            Logger.d("AdLocationUtils", "location:" + location);
            return location;
        } catch (Throwable th) {
            return null;
        }
    }

    private static e a(Context context) {
        f0 a2 = f0.a((String) null, context);
        float a3 = a2.a("latitude", -1.0f);
        float a4 = a2.a("longitude", -1.0f);
        if (a3 == -1.0f || a4 == -1.0f) {
            return null;
        }
        return new e(a3, a4);
    }

    public static e b(Context context) {
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().s().isCanUseLocation()) {
            Context d2 = context == null ? bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d() : context.getApplicationContext();
            if (d2 != null) {
                e a2 = a(d2);
                if (!c(d2)) {
                    return a2;
                }
                int a3 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_long108.c.a(d2, com.kuaishou.weapon.p0.g.g);
                int a4 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_long108.c.a(d2, com.kuaishou.weapon.p0.g.h);
                if (a3 == 0 || a4 == 0) {
                    return d(d2);
                }
            }
        }
        return null;
    }

    private static String b(LocationManager locationManager) {
        if (locationManager.isProviderEnabled("gps")) {
            return "gps";
        }
        if (locationManager.isProviderEnabled("network")) {
            return "network";
        }
        if (locationManager.isProviderEnabled("passive")) {
            return "passive";
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, Location location) {
        if (b(location)) {
            f0 a2 = f0.a((String) null, context);
            a2.b("latitude", (float) location.getLatitude());
            a2.b("longitude", (float) location.getLongitude());
            a2.b("lbstime", System.currentTimeMillis());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, LocationManager locationManager) {
        if (context == null || locationManager == null) {
            return;
        }
        b bVar = new b(context, locationManager);
        try {
            String b2 = b(locationManager);
            if (TextUtils.isEmpty(b2)) {
                return;
            }
            locationManager.requestSingleUpdate(b2, bVar, Looper.getMainLooper());
            b.postDelayed(new c(locationManager, bVar), 30000L);
        } catch (Throwable th) {
            if (Logger.isDebug()) {
                th.printStackTrace();
            }
            b(locationManager, bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(LocationManager locationManager, LocationListener locationListener) {
        if (locationManager == null || locationListener == null) {
            return;
        }
        try {
            locationManager.removeUpdates(locationListener);
        } catch (Throwable th) {
            if (Logger.isDebug()) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Location location) {
        return (location.getLatitude() == PangleAdapterUtils.CPM_DEFLAUT_VALUE || location.getLongitude() == PangleAdapterUtils.CPM_DEFLAUT_VALUE) ? false : true;
    }

    private static boolean c(Context context) {
        long a2 = f0.a((String) null, context).a("lbstime", -1L);
        return a2 == -1 || System.currentTimeMillis() - a2 > a;
    }

    private static e d(Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService(PlaceFields.LOCATION);
        e eVar = null;
        if (locationManager != null) {
            try {
                Location a2 = a(locationManager);
                if (a2 != null && b(a2)) {
                    b(context, a2);
                    eVar = new e((float) a2.getLatitude(), (float) a2.getLongitude());
                }
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    new Handler(Looper.getMainLooper()).post(new a(context, locationManager));
                } else {
                    b(context, locationManager);
                }
            } catch (Throwable th) {
                if (Logger.isDebug()) {
                    th.printStackTrace();
                }
            }
        }
        return eVar;
    }
}
