package com.rovio.fusion;

import android.content.Context;
import android.location.Criteria;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import com.facebook.places.model.PlaceFields;
import com.rovio.fusion.Location;
import java.util.List;
/* loaded from: classes2.dex */
public class LocationWrapper implements LocationListener {
    public static final String KEY_EXTRA_REGION_ID = "com.rovio.fusion.RegionId";
    public static final int MAX_MONITORED_REGIONS = 15;
    public static final String PROX_ALERT_INTENT = "com.rovio.fusion.LOCATION_PROXIMITY_ALERT";
    private static final String TAG = "FUSION";
    private static LocationWrapper sm_instance;
    private Context a;
    private LocationManager b;
    private Criteria c;
    private long d;
    private long e;
    private float f;
    private int g = 0;
    private String h = null;
    private boolean i = false;
    private Object j;

    /* JADX INFO: Access modifiers changed from: private */
    public native void locationChangedCallback(long j, double d, double d2, double d3, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public native void providerDisabledCallback(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native void providerEnabledCallback(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native void statusChangedCallback(long j, String str, int i);

    public LocationWrapper(long j, long j2, float f) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = 0L;
        this.e = 0L;
        this.f = 0.0f;
        this.j = null;
        this.a = Globals.getActivity().getApplicationContext();
        this.d = j;
        this.e = j2;
        this.f = f;
        this.b = (LocationManager) this.a.getSystemService(PlaceFields.LOCATION);
        this.c = new Criteria();
        this.j = new Object();
        sm_instance = this;
    }

    public static LocationWrapper getInstance() {
        return sm_instance;
    }

    public void startUpdating(final int i, final float f) {
        runOnUiThread(new Runnable() { // from class: com.rovio.fusion.LocationWrapper.1
            @Override // java.lang.Runnable
            public void run() {
                switch (i) {
                    case 0:
                        LocationWrapper.this.g = 2;
                        break;
                    case 1:
                        LocationWrapper.this.g = 2;
                        break;
                    case 2:
                        LocationWrapper.this.g = 1;
                        break;
                    default:
                        LocationWrapper.this.g = 2;
                        break;
                }
                LocationWrapper.this.c.setAccuracy(LocationWrapper.this.g);
                LocationWrapper.this.f = f;
                LocationWrapper.this.b.removeUpdates(LocationWrapper.this);
                LocationWrapper.this.h = LocationWrapper.this.b.getBestProvider(LocationWrapper.this.c, false);
                if (LocationWrapper.this.h != null) {
                    LocationWrapper.this.b.requestLocationUpdates(LocationWrapper.this.h, LocationWrapper.this.e, LocationWrapper.this.f, LocationWrapper.this);
                    if (LocationWrapper.this.h.equals("gps")) {
                        List<String> allProviders = LocationWrapper.this.b.getAllProviders();
                        for (int i2 = 0; i2 < allProviders.size(); i2++) {
                            if (!LocationWrapper.this.h.equals(allProviders.get(i2)) && LocationWrapper.this.b.isProviderEnabled(allProviders.get(i2))) {
                                LocationWrapper.this.b.requestLocationUpdates(allProviders.get(i2), LocationWrapper.this.e, LocationWrapper.this.f, LocationWrapper.this);
                            }
                        }
                    }
                    android.location.Location a = LocationWrapper.this.a(LocationWrapper.this.h);
                    if (a != null) {
                        LocationWrapper.this.onLocationChanged(a);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public android.location.Location a(String str) {
        android.location.Location lastKnownLocation = this.b.getLastKnownLocation(str);
        if (lastKnownLocation == null) {
            android.location.Location location = lastKnownLocation;
            for (String str2 : this.b.getAllProviders()) {
                if (!str.equals(str2) && this.b.isProviderEnabled(str2)) {
                    android.location.Location lastKnownLocation2 = this.b.getLastKnownLocation(str2);
                    if (lastKnownLocation2 == null || (location != null && lastKnownLocation2.getTime() <= location.getTime())) {
                        lastKnownLocation2 = location;
                    }
                    location = lastKnownLocation2;
                }
            }
            return location;
        }
        return lastKnownLocation;
    }

    public void stopUpdating() {
        runOnUiThread(new Runnable() { // from class: com.rovio.fusion.LocationWrapper.2
            @Override // java.lang.Runnable
            public void run() {
                LocationWrapper.this.b.removeUpdates(this);
            }
        });
    }

    public static boolean isSupported() {
        List<String> providers;
        LocationManager locationManager = (LocationManager) Globals.getActivity().getApplicationContext().getSystemService(PlaceFields.LOCATION);
        return (locationManager == null || (providers = locationManager.getProviders(true)) == null || providers.size() <= 0) ? false : true;
    }

    public static boolean isGpsAvailable() {
        LocationManager locationManager = (LocationManager) Globals.getActivity().getApplicationContext().getSystemService(PlaceFields.LOCATION);
        if (locationManager != null) {
            return locationManager.getAllProviders().contains("gps");
        }
        return false;
    }

    public void startMonitoringForRegions(Location.Region[] regionArr) {
        synchronized (this.j) {
            Location.Region[] regionArr2 = new Location.Region[Math.min(15, regionArr.length)];
            System.arraycopy(regionArr, 0, regionArr2, 0, regionArr2.length);
            LocationSharedPreferencesUtils.defineRegions(this.a, regionArr);
            LocationBroadcastSubscription.startListening(this.a, "network");
        }
    }

    public void stopMonitoringAllRegions() {
        synchronized (this.j) {
            LocationSharedPreferencesUtils.defineRegions(this.a, null);
            LocationBroadcastSubscription.stopListening(this.a);
        }
    }

    public static int maxNumOfMonitoredRegions() {
        return 15;
    }

    public int numOfMonitoredRegions() {
        int monitoredRegionsCount;
        synchronized (this.j) {
            monitoredRegionsCount = LocationSharedPreferencesUtils.getMonitoredRegionsCount(this.a);
        }
        return monitoredRegionsCount;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(final android.location.Location location) {
        runOnGLThread(new Runnable() { // from class: com.rovio.fusion.LocationWrapper.3
            @Override // java.lang.Runnable
            public void run() {
                if (location.getProvider().equals(LocationWrapper.this.h)) {
                    LocationWrapper.this.i = true;
                }
                if (!LocationWrapper.this.i || location.getProvider().equals(LocationWrapper.this.h)) {
                    LocationWrapper.this.locationChangedCallback(LocationWrapper.this.d, location.getLatitude(), location.getLongitude(), location.getAltitude(), location.getAccuracy());
                }
            }
        });
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(final String str) {
        runOnGLThread(new Runnable() { // from class: com.rovio.fusion.LocationWrapper.4
            @Override // java.lang.Runnable
            public void run() {
                if (LocationWrapper.this.h.equals(str)) {
                    LocationWrapper.this.providerDisabledCallback(LocationWrapper.this.d, str);
                }
            }
        });
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(final String str) {
        runOnGLThread(new Runnable() { // from class: com.rovio.fusion.LocationWrapper.5
            @Override // java.lang.Runnable
            public void run() {
                if (LocationWrapper.this.h.equals(str)) {
                    LocationWrapper.this.providerEnabledCallback(LocationWrapper.this.d, str);
                }
            }
        });
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(final String str, final int i, Bundle bundle) {
        runOnGLThread(new Runnable() { // from class: com.rovio.fusion.LocationWrapper.6
            @Override // java.lang.Runnable
            public void run() {
                if (LocationWrapper.this.h.equals(str)) {
                    LocationWrapper.this.statusChangedCallback(LocationWrapper.this.d, str, i);
                }
            }
        });
    }

    public void updateCurrentLocation() {
        android.location.Location a = a("gps");
        if (a != null) {
            locationChangedCallback(this.d, a.getLatitude(), a.getLongitude(), a.getAltitude(), a.getAccuracy());
        }
    }

    protected void runOnGLThread(Runnable runnable) {
        Globals.runOnGLThread(runnable);
    }

    protected void runOnUiThread(Runnable runnable) {
        Globals.getActivity().runOnUiThread(runnable);
    }
}
