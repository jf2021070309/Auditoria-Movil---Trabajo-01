package c.c0;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class e {
    public final Set<a> a = new HashSet();

    /* loaded from: classes.dex */
    public static final class a {
        public final Uri a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f1598b;

        public a(Uri uri, boolean z) {
            this.a = uri;
            this.f1598b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f1598b == aVar.f1598b && this.a.equals(aVar.a);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + (this.f1598b ? 1 : 0);
        }
    }

    public int a() {
        return this.a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((e) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
