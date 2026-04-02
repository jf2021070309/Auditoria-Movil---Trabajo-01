package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108;
/* loaded from: classes.dex */
public class b {
    private static EnumC0029b b = EnumC0029b.OFF;
    private c a;

    /* renamed from: bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0029b {
        DEBUG,
        INFO,
        ERROR,
        OFF
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(String str, String str2);

        void b(String str, String str2);
    }

    /* loaded from: classes.dex */
    private static class d {
        private static final b a = new b();
    }

    private b() {
        this.a = new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.a();
    }

    public static void a(EnumC0029b enumC0029b) {
        synchronized (b.class) {
            b unused = d.a;
            b = enumC0029b;
        }
    }

    public static void a(String str, String str2) {
        b unused = d.a;
        if (b.compareTo(EnumC0029b.DEBUG) <= 0) {
            d.a.a.b(str, str2);
        }
    }

    public static boolean a() {
        return EnumC0029b.DEBUG == b;
    }

    public static void b(String str, String str2) {
        b unused = d.a;
        if (b.compareTo(EnumC0029b.ERROR) <= 0) {
            d.a.a.a(str, str2);
        }
    }
}
