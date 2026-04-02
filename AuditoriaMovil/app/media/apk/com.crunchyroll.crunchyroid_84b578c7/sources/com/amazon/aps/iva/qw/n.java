package com.amazon.aps.iva.qw;
/* compiled from: SubtitlesDownloader.kt */
/* loaded from: classes2.dex */
public final class n extends Exception {
    public n(IllegalAccessException illegalAccessException) {
        super("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", illegalAccessException);
    }

    public n() {
        super("Not found subtitles to save");
    }
}
