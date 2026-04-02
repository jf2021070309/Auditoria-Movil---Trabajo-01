package com.amazon.aps.iva.x50;

import com.google.android.gms.ads.AdError;
import java.io.Serializable;
/* compiled from: ResourceType.kt */
/* loaded from: classes2.dex */
public enum t implements Serializable {
    SERIES("series"),
    MOVIE_LISTING("movie_listing"),
    EPISODE("episode"),
    MOVIE("movie"),
    SEASON("season"),
    MUSIC_VIDEO("musicVideo"),
    CONCERT("musicConcert"),
    UNDEFINED(AdError.UNDEFINED_DOMAIN);
    
    public static final a Companion = new a();
    private final String type;

    /* compiled from: ResourceType.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static t a(String str) {
            t tVar;
            t[] values = t.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    tVar = values[i];
                    if (tVar.equalsName(str)) {
                        break;
                    }
                    i++;
                } else {
                    tVar = null;
                    break;
                }
            }
            if (tVar == null) {
                return t.UNDEFINED;
            }
            return tVar;
        }
    }

    t(String str) {
        this.type = str;
    }

    public final boolean equalsName(String str) {
        return com.amazon.aps.iva.oe0.m.Z(this.type, str);
    }

    public final boolean isAsset() {
        if (this != EPISODE && this != MOVIE) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.type;
    }
}
