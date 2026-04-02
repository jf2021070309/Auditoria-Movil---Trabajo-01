package c.r;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;
import java.util.Objects;
/* loaded from: classes.dex */
public final class a {
    public c a;

    public a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String packageName = remoteUserInfo.getPackageName();
        Objects.requireNonNull(packageName, "package shouldn't be null");
        if (TextUtils.isEmpty(packageName)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        this.a = new b(remoteUserInfo);
    }

    public a(String str, int i2, int i3) {
        Objects.requireNonNull(str, "package shouldn't be null");
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.a = new b(str, i2, i3);
        } else {
            this.a = new c(str, i2, i3);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.a.equals(((a) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
