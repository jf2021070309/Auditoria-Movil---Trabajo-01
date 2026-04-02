package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10;
/* loaded from: classes.dex */
public class i {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private Object i;
    private int j;

    public String a() {
        return this.h;
    }

    public void a(int i) {
    }

    public void a(Object obj) {
        this.i = obj;
    }

    public void a(String str) {
        this.h = str;
    }

    public String b() {
        return this.d;
    }

    public void b(int i) {
        this.j = i;
    }

    public void b(String str) {
        this.d = str;
    }

    public String c() {
        return this.g;
    }

    public void c(String str) {
    }

    public Object d() {
        return this.i;
    }

    public void d(String str) {
        this.g = str;
    }

    public String e() {
        return this.c;
    }

    public void e(String str) {
    }

    public String f() {
        return this.f;
    }

    public void f(String str) {
        this.c = str;
    }

    public String g() {
        return this.e;
    }

    public void g(String str) {
        this.f = str;
    }

    public int h() {
        int i = this.j;
        while (true) {
            char c = '^';
            char c2 = 'K';
            while (true) {
                if (c == '\\') {
                    switch (c2) {
                        case 22:
                        case 23:
                            c = ']';
                            c2 = ']';
                    }
                } else if (c != ']') {
                    c = ']';
                    c2 = ']';
                }
            }
            while (true) {
                switch (c2) {
                    case '[':
                        break;
                    case '\\':
                    case ']':
                        break;
                    default:
                        c2 = '[';
                }
            }
        }
        return i;
    }

    public void h(String str) {
        this.e = str;
    }

    public String i() {
        return this.a;
    }

    public void i(String str) {
        this.a = str;
    }

    public String j() {
        return this.b;
    }

    public void j(String str) {
        this.b = str;
    }
}
