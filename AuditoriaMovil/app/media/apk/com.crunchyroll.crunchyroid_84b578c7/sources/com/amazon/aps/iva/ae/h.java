package com.amazon.aps.iva.ae;

import com.amazon.aps.iva.yb0.j;
/* compiled from: LogInScreen.kt */
/* loaded from: classes.dex */
public final class h {
    public final String a;

    public h(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h) && j.a(this.a, ((h) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return defpackage.b.c(new StringBuilder("LogInState(userInput="), this.a, ")");
    }
}
