package com.amazon.aps.iva.ws;

import com.amazon.aps.iva.kb0.h;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.presentation.browse.filtering.BrowseSubDubFilter;
import com.ellation.crunchyroll.presentation.browse.filtering.BrowseTypeFilter;
import com.google.firebase.crashlytics.internal.settings.model.AppSettingsData;
/* compiled from: BrowsePanelAnalyticsDataFactory.kt */
/* loaded from: classes2.dex */
public final class c {

    /* compiled from: BrowsePanelAnalyticsDataFactory.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.a00.b.values().length];
            try {
                iArr[com.amazon.aps.iva.a00.b.Popularity.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.amazon.aps.iva.a00.b.NewlyAdded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.amazon.aps.iva.a00.b.Alphabetical.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final String a(BrowseTypeFilter browseTypeFilter) {
        j.f(browseTypeFilter, "<this>");
        if (j.a(browseTypeFilter, BrowseTypeFilter.SeriesOnly.d)) {
            return "series";
        }
        if (j.a(browseTypeFilter, BrowseTypeFilter.MoviesOnly.d)) {
            return "movie";
        }
        if (j.a(browseTypeFilter, BrowseTypeFilter.Default.d)) {
            return "all";
        }
        throw new h();
    }

    public static final String b(com.amazon.aps.iva.a00.b bVar) {
        int i = a.a[bVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "alphabetical";
                }
                throw new h();
            }
            return AppSettingsData.STATUS_NEW;
        }
        return "popularity";
    }

    public static final String c(BrowseSubDubFilter browseSubDubFilter) {
        j.f(browseSubDubFilter, "<this>");
        if (j.a(browseSubDubFilter, BrowseSubDubFilter.SubtitledOnly.d)) {
            return "subtitled";
        }
        if (j.a(browseSubDubFilter, BrowseSubDubFilter.DubbedOnly.d)) {
            return "dubbed";
        }
        if (j.a(browseSubDubFilter, BrowseSubDubFilter.Default.d)) {
            return "all";
        }
        throw new h();
    }
}
