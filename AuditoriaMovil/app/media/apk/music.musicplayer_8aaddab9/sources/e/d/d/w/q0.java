package e.d.d.w;

import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public final class q0 {
    public static final Pattern a = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: b  reason: collision with root package name */
    public final String f7697b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7698c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7699d;

    public q0(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str));
            str3 = str2.substring(8);
        }
        if (str3 == null || !a.matcher(str3).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str3, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        this.f7697b = str3;
        this.f7698c = str;
        this.f7699d = e.a.d.a.a.s(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length()), str, "!", str2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof q0) {
            q0 q0Var = (q0) obj;
            return this.f7697b.equals(q0Var.f7697b) && this.f7698c.equals(q0Var.f7698c);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f7698c, this.f7697b);
    }
}
