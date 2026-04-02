package com.amazon.aps.iva.dj;

import com.amazon.aps.iva.js.p;
import com.amazon.aps.iva.x50.t;
/* compiled from: MediaPropertyFactory.kt */
/* loaded from: classes.dex */
public final class c {

    /* compiled from: MediaPropertyFactory.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.MOVIE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.MOVIE_LISTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.MUSIC_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t.CONCERT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public static final p a(t tVar) {
        int i;
        if (tVar == null) {
            i = -1;
        } else {
            i = a.a[tVar.ordinal()];
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    return p.EPISODE;
                }
                return p.MUSIC_CONCERT;
            }
            return p.MUSIC_VIDEO;
        }
        return p.MOVIE;
    }
}
