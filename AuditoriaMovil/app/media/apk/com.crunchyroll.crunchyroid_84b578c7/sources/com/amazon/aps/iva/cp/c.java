package com.amazon.aps.iva.cp;

import com.amazon.aps.iva.yb0.j;
import java.io.Serializable;
/* compiled from: LanguageUnavailableDialogUiModel.kt */
/* loaded from: classes2.dex */
public final class c<T> implements Serializable {
    public final String b;
    public final String c;
    public final String d;
    public final T e;

    public c(String str, String str2, String str3, T t) {
        j.f(str, "imageUrl");
        j.f(str2, "currentLanguageTag");
        j.f(str3, "fallbackLanguageTag");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (j.a(this.b, cVar.b) && j.a(this.c, cVar.c) && j.a(this.d, cVar.d) && j.a(this.e, cVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int b = com.amazon.aps.iva.c80.a.b(this.d, com.amazon.aps.iva.c80.a.b(this.c, this.b.hashCode() * 31, 31), 31);
        T t = this.e;
        if (t == null) {
            hashCode = 0;
        } else {
            hashCode = t.hashCode();
        }
        return b + hashCode;
    }

    public final String toString() {
        return "LanguageUnavailableDialogUiModel(imageUrl=" + this.b + ", currentLanguageTag=" + this.c + ", fallbackLanguageTag=" + this.d + ", data=" + this.e + ")";
    }
}
