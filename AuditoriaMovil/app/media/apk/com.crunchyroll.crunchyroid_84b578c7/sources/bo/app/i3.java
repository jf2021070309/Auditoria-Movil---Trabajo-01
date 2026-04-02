package bo.app;

import java.math.BigDecimal;
import java.math.RoundingMode;
/* loaded from: classes.dex */
public abstract class i3 {
    public static final BigDecimal a(BigDecimal bigDecimal) {
        com.amazon.aps.iva.yb0.j.f(bigDecimal, "<this>");
        BigDecimal scale = bigDecimal.setScale(2, RoundingMode.HALF_UP);
        com.amazon.aps.iva.yb0.j.e(scale, "this.setScale(2, RoundingMode.HALF_UP)");
        return scale;
    }
}
