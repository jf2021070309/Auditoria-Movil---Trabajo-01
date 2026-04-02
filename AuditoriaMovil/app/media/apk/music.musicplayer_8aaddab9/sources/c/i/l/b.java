package c.i.l;

import android.os.Build;
/* loaded from: classes.dex */
public interface b {
    public static final boolean Q;

    static {
        Q = Build.VERSION.SDK_INT >= 27;
    }

    void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) throws IllegalArgumentException;
}
