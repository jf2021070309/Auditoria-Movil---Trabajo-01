package bo.app;

import com.braze.support.JsonUtils;
/* loaded from: classes.dex */
public final class v2 {
    public static final a h = new a(null);
    private final Integer a;
    private final Integer b;
    private final Integer c;
    private final Integer d;
    private final Integer e;
    private final Integer f;
    private final Integer g;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        private a() {
        }
    }

    private v2(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
        this.e = num5;
        this.f = num6;
        this.g = num7;
    }

    public final Integer a() {
        return this.a;
    }

    public final Integer b() {
        return this.c;
    }

    public final Integer c() {
        return this.g;
    }

    public final Integer d() {
        return this.f;
    }

    public final Integer e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, v2Var.a) && com.amazon.aps.iva.yb0.j.a(this.b, v2Var.b) && com.amazon.aps.iva.yb0.j.a(this.c, v2Var.c) && com.amazon.aps.iva.yb0.j.a(this.d, v2Var.d) && com.amazon.aps.iva.yb0.j.a(this.e, v2Var.e) && com.amazon.aps.iva.yb0.j.a(this.f, v2Var.f) && com.amazon.aps.iva.yb0.j.a(this.g, v2Var.g)) {
            return true;
        }
        return false;
    }

    public final Integer f() {
        return this.d;
    }

    public final Integer g() {
        return this.b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
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
        if (num3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Integer num4 = this.d;
        if (num4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Integer num5 = this.e;
        if (num5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        Integer num6 = this.f;
        if (num6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num6.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        Integer num7 = this.g;
        if (num7 != null) {
            i = num7.hashCode();
        }
        return i7 + i;
    }

    public String toString() {
        return "InAppMessageTheme(backgroundColor=" + this.a + ", textColor=" + this.b + ", closeButtonColor=" + this.c + ", iconColor=" + this.d + ", iconBackgroundColor=" + this.e + ", headerTextColor=" + this.f + ", frameColor=" + this.g + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v2(com.amazon.aps.iva.if0.c cVar) {
        this(JsonUtils.getColorIntegerOrNull(cVar, "bg_color"), JsonUtils.getColorIntegerOrNull(cVar, "text_color"), JsonUtils.getColorIntegerOrNull(cVar, "close_btn_color"), JsonUtils.getColorIntegerOrNull(cVar, "icon_color"), JsonUtils.getColorIntegerOrNull(cVar, "icon_bg_color"), JsonUtils.getColorIntegerOrNull(cVar, "header_text_color"), JsonUtils.getColorIntegerOrNull(cVar, "frame_color"));
        com.amazon.aps.iva.yb0.j.f(cVar, "messageThemeJson");
    }
}
