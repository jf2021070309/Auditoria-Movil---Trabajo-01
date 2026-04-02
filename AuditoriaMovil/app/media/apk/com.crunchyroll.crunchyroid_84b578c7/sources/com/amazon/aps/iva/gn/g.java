package com.amazon.aps.iva.gn;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.MovieListing;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.model.Series;
import java.util.Arrays;
/* compiled from: ShareUrlGenerator.kt */
/* loaded from: classes2.dex */
public final class g implements f {
    public final String a;

    /* compiled from: ShareUrlGenerator.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.MUSIC_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.CONCERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public g(String str) {
        j.f(str, "shareLinkBaseUrl");
        this.a = str;
    }

    @Override // com.amazon.aps.iva.gn.f
    public final String a(String str) {
        j.f(str, "id");
        return k(str, "artist/%s");
    }

    @Override // com.amazon.aps.iva.gn.f
    public final String b(PlayableAsset playableAsset) {
        return k(playableAsset.getId(), "watch/%s");
    }

    @Override // com.amazon.aps.iva.gn.f
    public final String c(String str, t tVar) {
        String str2;
        j.f(str, "id");
        j.f(tVar, "musicAssetType");
        int i = a.a[tVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                str2 = "watch/concert/%s";
            } else {
                throw new IllegalArgumentException(tVar + " type is not supported");
            }
        } else {
            str2 = "watch/musicvideo/%s";
        }
        return j(str, str2);
    }

    @Override // com.amazon.aps.iva.gn.f
    public final String d(String str) {
        j.f(str, "id");
        return j(str, "artist/%s");
    }

    @Override // com.amazon.aps.iva.gn.f
    public final String e(ContentContainer contentContainer) {
        String str;
        String id = contentContainer.getId();
        if (contentContainer instanceof MovieListing) {
            str = "watch/%s";
        } else if (contentContainer instanceof Series) {
            str = "series/%s";
        } else {
            str = "";
        }
        return k(id, str);
    }

    @Override // com.amazon.aps.iva.gn.f
    public final String f(String str) {
        j.f(str, "id");
        return j(str, "watch/%s");
    }

    @Override // com.amazon.aps.iva.gn.f
    public final String g(ContentContainer contentContainer) {
        String str;
        String id = contentContainer.getId();
        if (contentContainer instanceof MovieListing) {
            str = "watch/%s";
        } else if (contentContainer instanceof Series) {
            str = "series/%s";
        } else {
            str = "";
        }
        return j(id, str);
    }

    @Override // com.amazon.aps.iva.gn.f
    public final String h(h hVar) {
        boolean z;
        String str;
        Panel panel = hVar.a;
        String id = panel.getId();
        if (panel.getResourceType() == t.SERIES) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "series/%s";
        } else {
            str = "watch/%s";
        }
        return j(id, str);
    }

    @Override // com.amazon.aps.iva.gn.f
    public final String i(PlayableAsset playableAsset) {
        return j(playableAsset.getId(), "watch/%s");
    }

    public final String j(String str, String str2) {
        String format = String.format(str2, Arrays.copyOf(new Object[]{str}, 1));
        j.e(format, "format(this, *args)");
        return defpackage.b.c(new StringBuilder(), this.a, format.concat(x.B0(f1.K("utm_medium=android", "utm_source=share"), "&", "?", null, null, 60)));
    }

    public final String k(String str, String str2) {
        String format = String.format(str2, Arrays.copyOf(new Object[]{str}, 1));
        j.e(format, "format(this, *args)");
        return defpackage.b.c(new StringBuilder(), this.a, format.concat(x.B0(f1.K("utm_medium=android", "utm_source=share_recents"), "&", "?", null, null, 60)));
    }
}
