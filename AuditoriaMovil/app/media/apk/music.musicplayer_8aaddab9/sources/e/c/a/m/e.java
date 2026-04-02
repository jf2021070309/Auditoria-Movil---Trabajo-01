package e.c.a.m;

import java.io.IOException;
/* loaded from: classes.dex */
public final class e extends IOException {
    public e(int i2) {
        super(e.a.d.a.a.e("Http request failed with status code: ", i2), null);
    }

    public e(String str) {
        super(str, null);
    }

    public e(String str, int i2) {
        super(str, null);
    }
}
