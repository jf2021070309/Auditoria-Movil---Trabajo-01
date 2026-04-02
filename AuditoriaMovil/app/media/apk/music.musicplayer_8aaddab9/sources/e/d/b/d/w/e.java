package e.d.b.d.w;
/* loaded from: classes2.dex */
public class e extends d {
    @Override // e.d.b.d.w.d
    public void a(m mVar, float f2, float f3, float f4) {
        mVar.e(0.0f, f4 * f3, 180.0f, 180.0f - f2);
        double sin = Math.sin(Math.toRadians(f2));
        double d2 = f4;
        Double.isNaN(d2);
        double d3 = f3;
        Double.isNaN(d3);
        double sin2 = Math.sin(Math.toRadians(90.0f - f2));
        Double.isNaN(d2);
        Double.isNaN(d3);
        mVar.d((float) (sin * d2 * d3), (float) (sin2 * d2 * d3));
    }
}
