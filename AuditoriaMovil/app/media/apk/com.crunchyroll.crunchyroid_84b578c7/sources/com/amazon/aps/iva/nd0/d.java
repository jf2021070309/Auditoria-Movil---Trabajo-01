package com.amazon.aps.iva.nd0;

import com.amazon.aps.iva.xb0.l;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
/* compiled from: FqNameUnsafe.java */
/* loaded from: classes4.dex */
public final class d {
    public static final f e = f.j("<root>");
    public static final Pattern f = Pattern.compile("\\.");
    public static final a g = new a();
    public final String a;
    public transient c b;
    public transient d c;
    public transient f d;

    /* compiled from: FqNameUnsafe.java */
    /* loaded from: classes4.dex */
    public static class a implements l<String, f> {
        @Override // com.amazon.aps.iva.xb0.l
        public final f invoke(String str) {
            return f.f(str);
        }
    }

    public d(String str, c cVar) {
        if (str == null) {
            a(0);
            throw null;
        } else if (cVar != null) {
            this.a = str;
            this.b = cVar;
        } else {
            a(1);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                i2 = 2;
                break;
            case 9:
            case 15:
            case 16:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        if (i != 1) {
            switch (i) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 17:
                objArr[1] = "toString";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
                objArr[2] = "startsWith";
                break;
            case 16:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                throw new IllegalStateException(format);
            case 9:
            case 15:
            case 16:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public final d b(f fVar) {
        String str;
        if (fVar != null) {
            if (d()) {
                str = fVar.b();
            } else {
                str = this.a + "." + fVar.b();
            }
            return new d(str, this, fVar);
        }
        a(9);
        throw null;
    }

    public final void c() {
        String str = this.a;
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.d = f.f(str.substring(lastIndexOf + 1));
            this.c = new d(str.substring(0, lastIndexOf));
            return;
        }
        this.d = f.f(str);
        this.c = c.c.i();
    }

    public final boolean d() {
        return this.a.isEmpty();
    }

    public final boolean e() {
        if (this.b == null) {
            String str = this.a;
            if (str != null) {
                if (str.indexOf(60) >= 0) {
                    return false;
                }
            } else {
                a(4);
                throw null;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && this.a.equals(((d) obj).a)) {
            return true;
        }
        return false;
    }

    public final List<f> f() {
        List<f> list;
        if (d()) {
            list = Collections.emptyList();
        } else {
            String[] split = f.split(this.a);
            com.amazon.aps.iva.yb0.j.f(split, "<this>");
            a aVar = g;
            com.amazon.aps.iva.yb0.j.f(aVar, "transform");
            ArrayList arrayList = new ArrayList(split.length);
            for (String str : split) {
                arrayList.add(aVar.invoke(str));
            }
            list = arrayList;
        }
        if (list != null) {
            return list;
        }
        a(14);
        throw null;
    }

    public final f g() {
        f fVar = this.d;
        if (fVar != null) {
            if (fVar != null) {
                return fVar;
            }
            a(10);
            throw null;
        } else if (!d()) {
            c();
            f fVar2 = this.d;
            if (fVar2 != null) {
                return fVar2;
            }
            a(11);
            throw null;
        } else {
            throw new IllegalStateException("root");
        }
    }

    public final c h() {
        c cVar = this.b;
        if (cVar != null) {
            if (cVar != null) {
                return cVar;
            }
            a(5);
            throw null;
        }
        c cVar2 = new c(this);
        this.b = cVar2;
        return cVar2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str;
        if (d()) {
            str = e.b();
        } else {
            str = this.a;
        }
        if (str != null) {
            return str;
        }
        a(17);
        throw null;
    }

    public d(String str) {
        if (str != null) {
            this.a = str;
        } else {
            a(2);
            throw null;
        }
    }

    public d(String str, d dVar, f fVar) {
        if (str != null) {
            this.a = str;
            this.c = dVar;
            this.d = fVar;
            return;
        }
        a(3);
        throw null;
    }
}
