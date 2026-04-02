package com.amazon.aps.iva.se0;

import java.util.concurrent.CancellationException;
/* compiled from: Exceptions.kt */
/* loaded from: classes4.dex */
public final class k1 extends CancellationException {
    public final transient j1 b;

    public k1(String str, Throwable th, j1 j1Var) {
        super(str);
        this.b = j1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof k1) {
                k1 k1Var = (k1) obj;
                if (!com.amazon.aps.iva.yb0.j.a(k1Var.getMessage(), getMessage()) || !com.amazon.aps.iva.yb0.j.a(k1Var.b, this.b) || !com.amazon.aps.iva.yb0.j.a(k1Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int i;
        String message = getMessage();
        com.amazon.aps.iva.yb0.j.c(message);
        int hashCode = (this.b.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i = cause.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.b;
    }
}
