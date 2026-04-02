package com.amazon.aps.iva.vo;

import com.amazon.aps.iva.x50.t;
/* compiled from: WatchScreenAssetsInteractor.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class d {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[t.values().length];
        try {
            iArr[t.SERIES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[t.EPISODE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[t.MOVIE_LISTING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[t.MOVIE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[t.SEASON.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
