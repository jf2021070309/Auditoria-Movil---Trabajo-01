package com.amazon.aps.iva.nd0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
/* compiled from: FqName.java */
/* loaded from: classes4.dex */
public final class c {
    public static final c c = new c("");
    public final d a;
    public transient c b;

    public c(String str) {
        if (str != null) {
            this.a = new d(str, this);
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
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            case 8:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
                objArr[2] = "startsWith";
                break;
            case 13:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(format);
            case 8:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static c j(f fVar) {
        if (fVar != null) {
            if (fVar != null) {
                return new c(new d(fVar.b(), c.i(), fVar));
            }
            d.a(16);
            throw null;
        }
        a(13);
        throw null;
    }

    public final String b() {
        String str = this.a.a;
        if (str != null) {
            return str;
        }
        d.a(4);
        throw null;
    }

    public final c c(f fVar) {
        if (fVar != null) {
            return new c(this.a.b(fVar), this);
        }
        a(8);
        throw null;
    }

    public final boolean d() {
        return this.a.d();
    }

    public final c e() {
        c cVar = this.b;
        if (cVar != null) {
            if (cVar != null) {
                return cVar;
            }
            a(6);
            throw null;
        } else if (!d()) {
            d dVar = this.a;
            d dVar2 = dVar.c;
            if (dVar2 == null) {
                if (!dVar.d()) {
                    dVar.c();
                    dVar2 = dVar.c;
                    if (dVar2 == null) {
                        d.a(8);
                        throw null;
                    }
                } else {
                    throw new IllegalStateException("root");
                }
            }
            c cVar2 = new c(dVar2);
            this.b = cVar2;
            return cVar2;
        } else {
            throw new IllegalStateException("root");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && this.a.equals(((c) obj).a)) {
            return true;
        }
        return false;
    }

    public final f f() {
        f g = this.a.g();
        if (g != null) {
            return g;
        }
        a(9);
        throw null;
    }

    public final f g() {
        f g;
        d dVar = this.a;
        if (dVar.d()) {
            g = d.e;
            if (g == null) {
                d.a(12);
                throw null;
            }
        } else {
            g = dVar.g();
            if (g == null) {
                d.a(13);
                throw null;
            }
        }
        return g;
    }

    public final boolean h(f fVar) {
        if (fVar != null) {
            d dVar = this.a;
            if (dVar.d()) {
                return false;
            }
            String str = dVar.a;
            int indexOf = str.indexOf(46);
            String b = fVar.b();
            if (indexOf == -1) {
                indexOf = Math.max(str.length(), b.length());
            }
            return str.regionMatches(0, b, 0, indexOf);
        }
        a(12);
        throw null;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final d i() {
        d dVar = this.a;
        if (dVar != null) {
            return dVar;
        }
        a(5);
        throw null;
    }

    public final String toString() {
        return this.a.toString();
    }

    public c(d dVar) {
        if (dVar != null) {
            this.a = dVar;
        } else {
            a(2);
            throw null;
        }
    }

    public c(d dVar, c cVar) {
        this.a = dVar;
        this.b = cVar;
    }
}
