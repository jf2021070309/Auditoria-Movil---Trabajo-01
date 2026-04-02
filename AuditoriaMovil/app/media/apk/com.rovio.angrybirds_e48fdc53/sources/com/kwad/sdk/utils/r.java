package com.kwad.sdk.utils;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.content.ContextCompat;
import com.facebook.places.model.PlaceFields;
import com.kwad.sdk.service.ServiceProvider;
/* loaded from: classes3.dex */
public final class r {
    private static boolean aIJ;
    private static Location aIK;

    private static Location a(Context context, LocationManager locationManager) {
        try {
            if (ContextCompat.checkSelfPermission(context, com.kuaishou.weapon.p0.g.g) == 0) {
                Location lastKnownLocation = locationManager.getLastKnownLocation("gps");
                if (lastKnownLocation == null) {
                    aIJ = true;
                }
                return lastKnownLocation;
            }
            return null;
        } catch (Exception e) {
            aIJ = true;
            com.kwad.sdk.core.e.c.printStackTraceOnly(e);
            return null;
        }
    }

    private static Location b(Context context, LocationManager locationManager) {
        try {
            if (ContextCompat.checkSelfPermission(context, com.kuaishou.weapon.p0.g.g) == 0 || ContextCompat.checkSelfPermission(context, com.kuaishou.weapon.p0.g.h) == 0) {
                Location lastKnownLocation = locationManager.getLastKnownLocation("network");
                if (lastKnownLocation == null) {
                    aIJ = true;
                }
                return lastKnownLocation;
            }
            return null;
        } catch (Exception e) {
            aIJ = true;
            com.kwad.sdk.core.e.c.printStackTraceOnly(e);
            return null;
        }
    }

    public static Location bW(Context context) {
        if (!at.IT() || at.IU() == null) {
            if (aIJ || aIK != null || context == null) {
                return aIK;
            }
            if (!at.IT() && !((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).Q(64L)) {
                try {
                    LocationManager locationManager = (LocationManager) context.getSystemService(PlaceFields.LOCATION);
                    if (locationManager.isProviderEnabled("gps")) {
                        aIK = a(context, locationManager);
                    }
                    if (aIK == null && locationManager.isProviderEnabled("network")) {
                        aIK = b(context, locationManager);
                    }
                    if (aIK == null && locationManager.isProviderEnabled("passive")) {
                        aIK = c(context, locationManager);
                    }
                    return aIK;
                } catch (Exception e) {
                    aIJ = true;
                    com.kwad.sdk.core.e.c.printStackTraceOnly(e);
                }
            }
            return null;
        }
        return at.IU();
    }

    private static Location c(Context context, LocationManager locationManager) {
        try {
            if (ContextCompat.checkSelfPermission(context, com.kuaishou.weapon.p0.g.h) == 0) {
                Location lastKnownLocation = locationManager.getLastKnownLocation("passive");
                if (lastKnownLocation == null) {
                    aIJ = true;
                }
                return lastKnownLocation;
            }
            return null;
        } catch (Exception e) {
            aIJ = true;
            com.kwad.sdk.core.e.c.printStackTraceOnly(e);
            return null;
        }
    }
}
