package c.r;

import android.text.TextUtils;
import java.util.Objects;
/* loaded from: classes.dex */
public class c {
    public String a;

    /* renamed from: b  reason: collision with root package name */
    public int f2499b;

    /* renamed from: c  reason: collision with root package name */
    public int f2500c;

    public c(String str, int i2, int i3) {
        this.a = str;
        this.f2499b = i2;
        this.f2500c = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return (this.f2499b < 0 || cVar.f2499b < 0) ? TextUtils.equals(this.a, cVar.a) && this.f2500c == cVar.f2500c : TextUtils.equals(this.a, cVar.a) && this.f2499b == cVar.f2499b && this.f2500c == cVar.f2500c;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.f2500c));
    }
}
