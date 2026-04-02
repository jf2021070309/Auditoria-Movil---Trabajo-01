package com.amazon.aps.iva.js;

import com.google.android.gms.common.internal.ImagesContract;
/* compiled from: PlaybackSourceProperty.kt */
/* loaded from: classes2.dex */
public abstract class z extends com.amazon.aps.iva.is.c {

    /* compiled from: PlaybackSourceProperty.kt */
    /* loaded from: classes2.dex */
    public static final class a extends z {
        public static final a a = new a();

        public a() {
            super(ImagesContract.LOCAL);
        }
    }

    /* compiled from: PlaybackSourceProperty.kt */
    /* loaded from: classes2.dex */
    public static final class b extends z {
        public static final b a = new b();

        public b() {
            super("network");
        }
    }

    public z(String str) {
        super("playbackSource", str);
    }
}
