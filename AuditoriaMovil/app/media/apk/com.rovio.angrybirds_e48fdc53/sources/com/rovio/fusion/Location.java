package com.rovio.fusion;
/* loaded from: classes2.dex */
public class Location {

    /* loaded from: classes2.dex */
    public static class GeoCoordinate {
        static final /* synthetic */ boolean $assertionsDisabled;
        private double a;
        private double b;

        static {
            $assertionsDisabled = !Location.class.desiredAssertionStatus();
        }

        public GeoCoordinate(GeoCoordinate geoCoordinate) {
            setLatitude(geoCoordinate.getLatitude());
            setLongitude(geoCoordinate.getLongitude());
        }

        public GeoCoordinate(double d, double d2) {
            if (!$assertionsDisabled && (d < -90.0d || d > 90.0d)) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && (d2 < -180.0d || d2 > 180.0d)) {
                throw new AssertionError();
            }
            setLatitude(d);
            setLongitude(d2);
        }

        public double getLatitude() {
            return this.a;
        }

        public void setLatitude(double d) {
            if (!$assertionsDisabled && (d < -90.0d || d > 90.0d)) {
                throw new AssertionError();
            }
            this.a = d;
        }

        public double getLongitude() {
            return this.b;
        }

        public void setLongitude(double d) {
            if (!$assertionsDisabled && (d < -180.0d || d > 180.0d)) {
                throw new AssertionError();
            }
            this.b = d;
        }
    }

    /* loaded from: classes2.dex */
    public static class Region {
        public GeoCoordinate coord;
        public int informRadius;
        public long regionId;

        public Region(long j, GeoCoordinate geoCoordinate, int i) {
            this.regionId = j;
            this.coord = geoCoordinate;
            this.informRadius = i;
        }
    }

    /* loaded from: classes2.dex */
    public static class PlaceInfo {
        public String address;
        public String category;
        public String placename;
        public Region region;
        public int triggerRadius;

        public PlaceInfo(Region region, int i, String str, String str2, String str3) {
            this.region = region;
            this.triggerRadius = i;
            this.placename = str;
            this.address = str2;
            this.category = str3;
        }
    }
}
