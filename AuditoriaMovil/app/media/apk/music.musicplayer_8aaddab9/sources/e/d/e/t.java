package e.d.e;

import java.math.BigInteger;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class t extends o {
    public final Object a;

    public t(Boolean bool) {
        Objects.requireNonNull(bool);
        this.a = bool;
    }

    public t(Number number) {
        Objects.requireNonNull(number);
        this.a = number;
    }

    public t(String str) {
        Objects.requireNonNull(str);
        this.a = str;
    }

    public static boolean e(t tVar) {
        Object obj = tVar.a;
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
        }
        return false;
    }

    public boolean b() {
        Object obj = this.a;
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(d());
    }

    public Number c() {
        Object obj = this.a;
        return obj instanceof String ? new e.d.e.c0.r((String) this.a) : (Number) obj;
    }

    public String d() {
        Object obj = this.a;
        return obj instanceof Number ? c().toString() : obj instanceof Boolean ? ((Boolean) obj).toString() : (String) obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        if (this.a == null) {
            return tVar.a == null;
        } else if (e(this) && e(tVar)) {
            return c().longValue() == tVar.c().longValue();
        } else {
            Object obj2 = this.a;
            if ((obj2 instanceof Number) && (tVar.a instanceof Number)) {
                double doubleValue = c().doubleValue();
                double doubleValue2 = tVar.c().doubleValue();
                if (doubleValue != doubleValue2) {
                    return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
                }
                return true;
            }
            return obj2.equals(tVar.a);
        }
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.a == null) {
            return 31;
        }
        if (e(this)) {
            doubleToLongBits = c().longValue();
        } else {
            Object obj = this.a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(c().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }
}
