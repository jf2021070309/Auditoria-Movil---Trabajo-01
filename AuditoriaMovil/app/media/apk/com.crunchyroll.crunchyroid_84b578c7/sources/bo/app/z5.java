package bo.app;

import android.util.Base64;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
/* loaded from: classes.dex */
public abstract class z5 implements l2 {
    private static final String d = BrazeLogger.getBrazeLogTag(z5.class);
    private final long a;
    private final long b;
    private p1 c;

    public z5() {
        long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        this.b = nowInMilliseconds;
        this.a = nowInMilliseconds / 1000;
    }

    @Override // bo.app.l2
    public p1 a() {
        return this.c;
    }

    @Override // bo.app.l2
    public long b() {
        return this.a;
    }

    @Override // bo.app.l2
    public long e() {
        return this.b;
    }

    public String a(String str) {
        if (StringUtils.isNullOrBlank(str)) {
            return null;
        }
        try {
            return new String(Base64.decode(str, 0)).split("_")[0];
        } catch (Exception e) {
            String str2 = d;
            BrazeLogger.e(str2, "Unexpected error decoding Base64 encoded campaign Id " + str, e);
            return null;
        }
    }

    public z5(p1 p1Var) {
        this();
        this.c = p1Var;
    }
}
