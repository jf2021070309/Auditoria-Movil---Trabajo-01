package com.amazon.aps.iva.js;
/* compiled from: PlayTypeProperty.kt */
/* loaded from: classes2.dex */
public abstract class y extends com.amazon.aps.iva.is.c {

    /* compiled from: PlayTypeProperty.kt */
    /* loaded from: classes2.dex */
    public static final class a extends y {
        public static final a a = new a();

        public a() {
            super("autoplay");
        }
    }

    /* compiled from: PlayTypeProperty.kt */
    /* loaded from: classes2.dex */
    public static final class b extends y {
        public static final b a = new b();

        public b() {
            super("play");
        }
    }

    /* compiled from: PlayTypeProperty.kt */
    /* loaded from: classes2.dex */
    public static final class c extends y {
        public static final c a = new c();

        public c() {
            super("skip");
        }
    }

    public y(String str) {
        super("playType", str);
    }
}
