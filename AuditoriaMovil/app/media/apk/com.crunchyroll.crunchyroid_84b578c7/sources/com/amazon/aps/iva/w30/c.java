package com.amazon.aps.iva.w30;

import com.amazon.aps.iva.kb0.h;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.model.search.SearchItemsContainerType;
/* compiled from: SearchResultHeaderPresenter.kt */
/* loaded from: classes2.dex */
public final class c {

    /* compiled from: SearchResultHeaderPresenter.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SearchItemsContainerType.values().length];
            try {
                iArr[SearchItemsContainerType.TOP_RESULTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchItemsContainerType.SERIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchItemsContainerType.MOVIE_LISTINGS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SearchItemsContainerType.EPISODES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SearchItemsContainerType.MUSIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    public static final int a(SearchItemsContainerType searchItemsContainerType) {
        j.f(searchItemsContainerType, "<this>");
        int i = a.a[searchItemsContainerType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return R.string.search_category_music;
                        }
                        throw new h();
                    }
                    return R.string.search_category_episodes;
                }
                return R.string.search_category_movies;
            }
            return R.string.search_category_series;
        }
        return R.string.top_results_label;
    }
}
