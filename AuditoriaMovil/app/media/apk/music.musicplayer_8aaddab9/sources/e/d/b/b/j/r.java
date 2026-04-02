package e.d.b.b.j;

import android.util.Base64;
import com.google.auto.value.AutoValue;
import e.d.b.b.j.j;
@AutoValue
/* loaded from: classes.dex */
public abstract class r {

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract r a();

        public abstract a b(String str);

        public abstract a c(e.d.b.b.d dVar);
    }

    public static a a() {
        j.b bVar = new j.b();
        bVar.c(e.d.b.b.d.DEFAULT);
        return bVar;
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract e.d.b.b.d d();

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? "" : Base64.encodeToString(c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
