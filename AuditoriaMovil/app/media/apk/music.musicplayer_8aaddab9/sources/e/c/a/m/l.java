package e.c.a.m;

import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;
import java.util.Objects;
/* loaded from: classes.dex */
public final class l<T> {
    public static final b<Object> a = new a();

    /* renamed from: b  reason: collision with root package name */
    public final T f5555b;

    /* renamed from: c  reason: collision with root package name */
    public final b<T> f5556c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5557d;

    /* renamed from: e  reason: collision with root package name */
    public volatile byte[] f5558e;

    /* loaded from: classes.dex */
    public class a implements b<Object> {
        @Override // e.c.a.m.l.b
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* loaded from: classes.dex */
    public interface b<T> {
        void a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    public l(String str, T t, b<T> bVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f5557d = str;
        this.f5555b = t;
        Objects.requireNonNull(bVar, "Argument must not be null");
        this.f5556c = bVar;
    }

    public static <T> l<T> a(String str, T t) {
        return new l<>(str, t, a);
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f5557d.equals(((l) obj).f5557d);
        }
        return false;
    }

    public int hashCode() {
        return this.f5557d.hashCode();
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("Option{key='");
        y.append(this.f5557d);
        y.append(CoreConstants.SINGLE_QUOTE_CHAR);
        y.append('}');
        return y.toString();
    }
}
