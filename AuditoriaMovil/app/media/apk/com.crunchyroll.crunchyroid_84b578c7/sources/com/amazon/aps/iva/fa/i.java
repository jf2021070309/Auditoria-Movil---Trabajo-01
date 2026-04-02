package com.amazon.aps.iva.fa;

import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.auth.CountryCodeProvider;
/* compiled from: MutablePair.java */
/* loaded from: classes.dex */
public final class i {
    public final /* synthetic */ int a = 0;
    public Object b;
    public Object c;

    public i() {
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                if (!(obj instanceof com.amazon.aps.iva.o3.c)) {
                    return false;
                }
                com.amazon.aps.iva.o3.c cVar = (com.amazon.aps.iva.o3.c) obj;
                Object obj2 = cVar.a;
                Object obj3 = this.b;
                if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    return false;
                }
                Object obj4 = this.c;
                Object obj5 = cVar.b;
                if (obj5 != obj4 && (obj5 == null || !obj5.equals(obj4))) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    return false;
                }
                return true;
            default:
                return super.equals(obj);
        }
    }

    public final int hashCode() {
        int hashCode;
        switch (this.a) {
            case 0:
                Object obj = this.b;
                int i = 0;
                if (obj == null) {
                    hashCode = 0;
                } else {
                    hashCode = obj.hashCode();
                }
                Object obj2 = this.c;
                if (obj2 != null) {
                    i = obj2.hashCode();
                }
                return hashCode ^ i;
            default:
                return super.hashCode();
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "Pair{" + this.b + " " + this.c + "}";
            default:
                return super.toString();
        }
    }

    public i(CountryCodeProvider countryCodeProvider, com.amazon.aps.iva.vd.d dVar) {
        j.f(countryCodeProvider, "countryProvider");
        this.b = countryCodeProvider;
        this.c = dVar;
    }
}
