package bo.app;

import com.braze.models.IPutIntoJson;
/* loaded from: classes.dex */
public interface p1 extends IPutIntoJson {
    public static final a a = a.a;

    /* loaded from: classes.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }
    }

    void a(e5 e5Var);

    void a(String str);

    a1 c();

    default String f() {
        String cVar = ((com.amazon.aps.iva.if0.c) forJsonPut()).toString();
        com.amazon.aps.iva.yb0.j.e(cVar, "forJsonPut().toString()");
        return cVar;
    }

    boolean m();

    com.amazon.aps.iva.if0.c q();

    e5 s();

    String t();
}
