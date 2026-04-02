package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import com.fyber.inneractive.sdk.util.h;
import com.google.firebase.analytics.FirebaseAnalytics;
/* loaded from: classes.dex */
public final class s {
    public Context a;
    Location b;
    public h.a c;
    Runnable d;
    public LocationListener e;
    public LocationListener f;
    long g;

    /* synthetic */ s(byte b) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {
        private static s a = new s((byte) 0);

        public static /* synthetic */ s a() {
            return a;
        }
    }

    private s() {
        this.b = null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:6|(1:8)(2:77|(1:79)(2:80|81))|9|(3:69|70|(5:72|(1:74)|12|13|(11:15|(1:17)|18|19|20|21|(1:25)|(3:27|(1:29)(1:33)|30)|34|(1:36)(7:37|(2:39|(5:62|44|(2:46|(2:50|(4:52|(1:54)|55|(1:57))))(1:59)|58|(0)))(1:63)|43|44|(0)(0)|58|(0))|32)(11:66|67|18|19|20|21|(2:23|25)|(0)|34|(0)(0)|32))(1:75))|11|12|13|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x014d, code lost:
        if (r7 == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c A[Catch: all -> 0x00be, TryCatch #2 {all -> 0x00be, blocks: (B:21:0x0086, B:23:0x008c, B:25:0x009d, B:26:0x00b5), top: B:81:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5 A[Catch: all -> 0x00be, TRY_LEAVE, TryCatch #2 {all -> 0x00be, blocks: (B:21:0x0086, B:23:0x008c, B:25:0x009d, B:26:0x00b5), top: B:81:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.location.Location a() {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.s.a():android.location.Location");
    }

    public final void b() {
        if (this.d != null) {
            m.a().removeCallbacks(this.d);
        }
    }

    public final void a(LocationListener locationListener) {
        if (locationListener != null) {
            IAlog.b("%sunregistering location listener: %s", "Location Manager: ", locationListener);
            Context context = this.a;
            if (context == null) {
                IAlog.b("%sunregisterFromLocationUpdates called, but context is null!", "Location Manager: ");
            } else if (locationListener != null) {
                try {
                    ((LocationManager) context.getSystemService(FirebaseAnalytics.Param.LOCATION)).removeUpdates(locationListener);
                } catch (Exception unused) {
                    IAlog.b("%sError retrieved when trying to stop location updates - updates were already paused.", "Location Manager: ");
                }
            }
        }
    }

    private void a(String str, LocationListener locationListener) {
        Context context = this.a;
        if (context == null) {
            IAlog.b("%sregisterForASingleLocationUpdate called, but context is null!", "Location Manager: ");
            return;
        }
        try {
            ((LocationManager) context.getSystemService(FirebaseAnalytics.Param.LOCATION)).requestLocationUpdates(str, 0L, 0.0f, locationListener, this.a.getMainLooper());
            IAlog.b("%sSuccessfully registered for %s location update", "Location Manager: ", str);
        } catch (IllegalArgumentException unused) {
            IAlog.b("%sError retrieved when trying to get the network location - device has no network provider.", "Location Manager: ");
        } catch (NullPointerException unused2) {
            IAlog.b("%sError retrieved when trying to get the network location - NPE.", "Location Manager: ");
        } catch (SecurityException unused3) {
            IAlog.b("%sError retrieved when trying to get the network location - access appears to be disabled.", "Location Manager: ");
        }
    }

    private static Location a(Location location, Location location2) {
        if (location == null && location2 == null) {
            return null;
        }
        return (location == null || location2 == null) ? location != null ? location : location2 : location.getTime() > location2.getTime() ? location : location2;
    }
}
