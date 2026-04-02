package e.d.b.b.j;

import com.google.auto.value.AutoValue;
import e.d.b.b.j.i;
import java.util.HashMap;
import java.util.Map;
@AutoValue
/* loaded from: classes.dex */
public abstract class n {

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class a {
        public final a a(String str, String str2) {
            c().put(str, str2);
            return this;
        }

        public abstract n b();

        public abstract Map<String, String> c();

        public abstract a d(m mVar);

        public abstract a e(long j2);

        public abstract a f(String str);

        public abstract a g(long j2);
    }

    public static a a() {
        i.b bVar = new i.b();
        bVar.f6263f = new HashMap();
        return bVar;
    }

    public final String b(String str) {
        String str2 = c().get(str);
        return str2 == null ? "" : str2;
    }

    public abstract Map<String, String> c();

    public abstract Integer d();

    public abstract m e();

    public abstract long f();

    public final int g(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public abstract String h();

    public abstract long i();

    public a j() {
        i.b bVar = new i.b();
        bVar.f(h());
        bVar.f6259b = d();
        bVar.d(e());
        bVar.e(f());
        bVar.g(i());
        bVar.f6263f = new HashMap(c());
        return bVar;
    }
}
