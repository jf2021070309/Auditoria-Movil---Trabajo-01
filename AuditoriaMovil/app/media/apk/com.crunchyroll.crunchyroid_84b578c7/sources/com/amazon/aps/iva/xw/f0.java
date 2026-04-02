package com.amazon.aps.iva.xw;

import com.ellation.crunchyroll.model.Panel;
/* compiled from: PanelExtensions.kt */
/* loaded from: classes2.dex */
public final class f0 {

    /* compiled from: PanelExtensions.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.x50.t.values().length];
            try {
                iArr[com.amazon.aps.iva.x50.t.MOVIE_LISTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.amazon.aps.iva.x50.t.SERIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.amazon.aps.iva.x50.t.MOVIE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.amazon.aps.iva.x50.t.EPISODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public static final String a(Panel panel) {
        com.amazon.aps.iva.yb0.j.f(panel, "<this>");
        int i = a.a[panel.getResourceType().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i == 4) {
                    return panel.getEpisodeMetadata().getParentId();
                }
                com.amazon.aps.iva.x50.t resourceType = panel.getResourceType();
                throw new IllegalArgumentException("Unsupported Panel type " + resourceType);
            }
            return panel.getMovieMetadata().getParentId();
        }
        return panel.getId();
    }

    public static final com.amazon.aps.iva.x50.t b(com.amazon.aps.iva.x50.t tVar) {
        com.amazon.aps.iva.yb0.j.f(tVar, "<this>");
        int i = a.a[tVar.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i == 4) {
                    return com.amazon.aps.iva.x50.t.SERIES;
                }
                throw new IllegalArgumentException("Unsupported Panel type " + tVar);
            }
            return com.amazon.aps.iva.x50.t.MOVIE_LISTING;
        }
        return tVar;
    }

    public static final com.amazon.aps.iva.x50.t c(Panel panel) {
        com.amazon.aps.iva.yb0.j.f(panel, "<this>");
        return b(panel.getResourceType());
    }

    public static final String d(Panel panel) {
        com.amazon.aps.iva.yb0.j.f(panel, "<this>");
        int i = a.a[panel.getResourceType().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i == 4) {
                    return panel.getEpisodeMetadata().getParentTitle();
                }
                com.amazon.aps.iva.x50.t resourceType = panel.getResourceType();
                throw new IllegalArgumentException("Unsupported Panel type " + resourceType);
            }
            return panel.getMovieMetadata().getParentTitle();
        }
        return panel.getTitle();
    }
}
