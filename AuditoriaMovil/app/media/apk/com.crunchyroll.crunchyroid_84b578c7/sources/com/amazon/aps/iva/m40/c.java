package com.amazon.aps.iva.m40;

import com.amazon.aps.iva.yb0.j;
/* compiled from: ShowPageCtaUiModel.kt */
/* loaded from: classes2.dex */
public final class c {
    public final String a;

    public c(String str) {
        j.f(str, "text");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && j.a(this.a, ((c) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return defpackage.b.c(new StringBuilder("ShowPageCtaUiModel(text="), this.a, ")");
    }
}
