package bo.app;
/* loaded from: classes.dex */
public final class z2 {
    public static final z2 a = new z2();

    private z2() {
    }

    public static final double a(double d, double d2, double d3, double d4) {
        double radians = Math.toRadians(d3 - d);
        double radians2 = Math.toRadians(d4 - d2);
        double d5 = 2;
        return Math.asin(Math.sqrt((Math.cos(Math.toRadians(d3)) * Math.cos(Math.toRadians(d)) * Math.pow(Math.sin(radians2 / d5), 2.0d)) + Math.pow(Math.sin(radians / d5), 2.0d))) * 1.2742E7d;
    }
}
