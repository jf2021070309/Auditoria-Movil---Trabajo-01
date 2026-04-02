package com.amazon.aps.iva.s3;

import android.view.inputmethod.InputContentInfo;
/* compiled from: InputContentInfoCompat.java */
/* loaded from: classes.dex */
public final class d {
    public final b a;

    /* compiled from: InputContentInfoCompat.java */
    /* loaded from: classes.dex */
    public static final class a implements b {
        public final InputContentInfo a;

        public a(Object obj) {
            this.a = (InputContentInfo) obj;
        }

        public final Object a() {
            return this.a;
        }

        public final void b() {
            this.a.requestPermission();
        }
    }

    /* compiled from: InputContentInfoCompat.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    public d(a aVar) {
        this.a = aVar;
    }
}
