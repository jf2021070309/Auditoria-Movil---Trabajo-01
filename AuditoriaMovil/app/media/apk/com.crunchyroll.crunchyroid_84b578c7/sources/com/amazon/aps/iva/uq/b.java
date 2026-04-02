package com.amazon.aps.iva.uq;
/* compiled from: ANRException.kt */
/* loaded from: classes2.dex */
public final class b extends Exception {
    public b(Thread thread) {
        setStackTrace(thread.getStackTrace());
    }

    public b(String str, ClassCastException classCastException) {
        super(str, classCastException);
    }
}
