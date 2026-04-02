package com.bumptech.glide.gifdecoder;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes6.dex */
class GifFrame {
    static final int DISPOSAL_BACKGROUND = 2;
    static final int DISPOSAL_NONE = 1;
    static final int DISPOSAL_PREVIOUS = 3;
    static final int DISPOSAL_UNSPECIFIED = 0;
    int bufferFrameStart;
    int delay;
    int dispose;
    int ih;
    boolean interlace;
    int iw;
    int ix;
    int iy;
    int[] lct;
    int transIndex;
    boolean transparency;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    private @interface GifDisposalMethod {
    }
}
