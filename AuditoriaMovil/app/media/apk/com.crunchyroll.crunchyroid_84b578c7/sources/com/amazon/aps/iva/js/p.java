package com.amazon.aps.iva.js;
/* compiled from: MediaTypeProperty.kt */
/* loaded from: classes2.dex */
public enum p {
    MOVIE("movie"),
    SERIES("series"),
    SEASON("season"),
    EPISODE("episode"),
    EXTRA_VIDEO_MOVIE("extra_video_movie"),
    EXTRA_VIDEO_SERIES("extra_video_series"),
    MUSIC_ARTIST("musicArtist"),
    MUSIC_VIDEO("musicVideo"),
    MUSIC_CONCERT("musicConcert"),
    GAME("game");
    
    private final String value;

    p(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
