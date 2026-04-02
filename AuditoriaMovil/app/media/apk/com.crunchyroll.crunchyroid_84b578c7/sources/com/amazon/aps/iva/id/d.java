package com.amazon.aps.iva.id;
/* compiled from: StateVerifier.java */
/* loaded from: classes.dex */
public abstract class d {

    /* compiled from: StateVerifier.java */
    /* loaded from: classes.dex */
    public static class a extends d {
        public volatile boolean a;

        public final void a() {
            if (!this.a) {
                return;
            }
            throw new IllegalStateException("Already released");
        }
    }
}
