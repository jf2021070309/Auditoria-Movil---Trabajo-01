package com.fyber.inneractive.sdk.player.c.b;

import android.media.MediaCodec;
import com.fyber.inneractive.sdk.player.c.k.t;
/* loaded from: classes.dex */
public final class b {
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

    public b() {
        this.i = t.a >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.j = t.a >= 24 ? new a(this.i, (byte) 0) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {
        public final MediaCodec.CryptoInfo a;
        public final MediaCodec.CryptoInfo.Pattern b;

        /* synthetic */ a(MediaCodec.CryptoInfo cryptoInfo, byte b) {
            this(cryptoInfo);
        }

        private a(MediaCodec.CryptoInfo cryptoInfo) {
            this.a = cryptoInfo;
            this.b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }
}
