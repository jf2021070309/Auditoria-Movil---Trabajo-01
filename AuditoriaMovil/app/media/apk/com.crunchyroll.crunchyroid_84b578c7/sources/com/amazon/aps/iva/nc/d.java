package com.amazon.aps.iva.nc;
/* compiled from: CallbackException.java */
/* loaded from: classes.dex */
public final class d extends RuntimeException {
    public d(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}
