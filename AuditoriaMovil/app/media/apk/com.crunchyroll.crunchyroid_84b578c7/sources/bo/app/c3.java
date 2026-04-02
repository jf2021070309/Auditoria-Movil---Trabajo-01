package bo.app;

import com.braze.support.JsonUtils;
/* loaded from: classes.dex */
public final class c3 {
    public static final a d = new a(null);
    private final Integer a;
    private final Integer b;
    private final Integer c;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        private a() {
        }
    }

    private c3(Integer num, Integer num2, Integer num3) {
        this.a = num;
        this.b = num2;
        this.c = num3;
    }

    public final Integer a() {
        return this.a;
    }

    public final Integer b() {
        return this.c;
    }

    public final Integer c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3)) {
            return false;
        }
        c3 c3Var = (c3) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, c3Var.a) && com.amazon.aps.iva.yb0.j.a(this.b, c3Var.b) && com.amazon.aps.iva.yb0.j.a(this.c, c3Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Integer num = this.a;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
        Integer num2 = this.b;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Integer num3 = this.c;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        return "MessageButtonTheme(backgroundColor=" + this.a + ", textColor=" + this.b + ", borderColor=" + this.c + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c3(com.amazon.aps.iva.if0.c cVar) {
        this(JsonUtils.getColorIntegerOrNull(cVar, "bg_color"), JsonUtils.getColorIntegerOrNull(cVar, "text_color"), JsonUtils.getColorIntegerOrNull(cVar, "border_color"));
        com.amazon.aps.iva.yb0.j.f(cVar, "buttonThemeJson");
    }
}
