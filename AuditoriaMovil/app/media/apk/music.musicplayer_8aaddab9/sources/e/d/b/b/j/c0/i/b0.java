package e.d.b.b.j.c0.i;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import com.google.auto.value.AutoValue;
@AutoValue
/* loaded from: classes.dex */
public abstract class b0 {
    public static final b0 a;

    static {
        Long valueOf = Long.valueOf((long) SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
        Integer num = 200;
        Integer num2 = 10000;
        Long valueOf2 = Long.valueOf((long) CoreConstants.MILLIS_IN_ONE_WEEK);
        Integer num3 = 81920;
        String str = valueOf == null ? " maxStorageSizeInBytes" : "";
        if (num == null) {
            str = e.a.d.a.a.k(str, " loadBatchSize");
        }
        if (num2 == null) {
            str = e.a.d.a.a.k(str, " criticalSectionEnterTimeoutMs");
        }
        if (valueOf2 == null) {
            str = e.a.d.a.a.k(str, " eventCleanUpAge");
        }
        if (num3 == null) {
            str = e.a.d.a.a.k(str, " maxBlobByteSizePerRow");
        }
        if (!str.isEmpty()) {
            throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str));
        }
        a = new x(valueOf.longValue(), num.intValue(), num2.intValue(), valueOf2.longValue(), num3.intValue(), null);
    }

    public abstract int a();

    public abstract long b();

    public abstract int c();

    public abstract int d();

    public abstract long e();
}
