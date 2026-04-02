package d.a.a.b.e;

import java.text.DateFormatSymbols;
/* loaded from: classes.dex */
public class b {
    public DateFormatSymbols a = DateFormatSymbols.getInstance();

    public final String a(String[] strArr) {
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        for (String str : strArr) {
            int length = str.length();
            if (length != 0) {
                i2 = Math.min(i2, length);
                i3 = Math.max(i3, length);
            }
        }
        int[] iArr = {i2, i3};
        StringBuilder y = e.a.d.a.a.y(".{");
        y.append(iArr[0]);
        y.append(",");
        return e.a.d.a.a.p(y, iArr[1], "}");
    }
}
