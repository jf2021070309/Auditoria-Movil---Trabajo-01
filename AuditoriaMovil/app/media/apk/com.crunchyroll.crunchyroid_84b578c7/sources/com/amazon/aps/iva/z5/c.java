package com.amazon.aps.iva.z5;

import android.media.MediaCodec;
import com.amazon.aps.iva.t5.g0;
/* compiled from: CryptoInfo.java */
/* loaded from: classes.dex */
public final class c {
    public byte[] a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec.CryptoInfo i;
    public final a j;

    /* compiled from: CryptoInfo.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final MediaCodec.CryptoInfo a;
        public final MediaCodec.CryptoInfo.Pattern b = new MediaCodec.CryptoInfo.Pattern(0, 0);

        public a(MediaCodec.CryptoInfo cryptoInfo) {
            this.a = cryptoInfo;
        }
    }

    public c() {
        a aVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        if (g0.a >= 24) {
            aVar = new a(cryptoInfo);
        } else {
            aVar = null;
        }
        this.j = aVar;
    }
}
