package c.b.c;
/* loaded from: classes.dex */
public class z {
    public static z a;

    /* renamed from: b  reason: collision with root package name */
    public long f870b;

    /* renamed from: c  reason: collision with root package name */
    public long f871c;

    /* renamed from: d  reason: collision with root package name */
    public int f872d;

    public void a(long j2, double d2, double d3) {
        float f2;
        float f3 = ((float) (j2 - 946728000000L)) / 8.64E7f;
        double d4 = (0.01720197f * f3) + 6.24006f;
        Double.isNaN(d4);
        double sin = (Math.sin(f2 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f2) * 3.4906598739326E-4d) + (Math.sin(d4) * 0.03341960161924362d) + d4 + 1.796593063d + 3.141592653589793d;
        double d5 = (-d3) / 360.0d;
        double d6 = f3 - 9.0E-4f;
        Double.isNaN(d6);
        double round = ((float) Math.round(d6 - d5)) + 9.0E-4f;
        Double.isNaN(round);
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d4) * 0.0053d) + round + d5;
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d7 = 0.01745329238474369d * d2;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d7))) / (Math.cos(asin) * Math.cos(d7));
        if (sin3 >= 1.0d) {
            this.f872d = 1;
            this.f870b = -1L;
            this.f871c = -1L;
        } else if (sin3 <= -1.0d) {
            this.f872d = 0;
            this.f870b = -1L;
            this.f871c = -1L;
        } else {
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            Double.isNaN(acos);
            this.f870b = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            Double.isNaN(acos);
            long round2 = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f871c = round2;
            if (round2 >= j2 || this.f870b <= j2) {
                this.f872d = 1;
            } else {
                this.f872d = 0;
            }
        }
    }
}
