package com.amazon.aps.iva.cg;

import com.ellation.crunchyroll.api.cms.model.Season;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.music.Artist;
import com.ellation.crunchyroll.model.music.MusicAsset;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: DeepLinkInput.kt */
/* loaded from: classes.dex */
public abstract class p {
    public final com.amazon.aps.iva.dg.a a;

    /* compiled from: DeepLinkInput.kt */
    /* loaded from: classes.dex */
    public static final class a extends p {
        public final com.amazon.aps.iva.dg.a b;
        public final Artist c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.dg.a aVar, Artist artist) {
            super(aVar);
            com.amazon.aps.iva.yb0.j.f(aVar, "uri");
            com.amazon.aps.iva.yb0.j.f(artist, "artist");
            this.b = aVar;
            this.c = artist;
        }

        @Override // com.amazon.aps.iva.cg.p
        public final com.amazon.aps.iva.dg.a a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.b, aVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, aVar.c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "ArtistDeepLinkInput(uri=" + this.b + ", artist=" + this.c + ")";
        }
    }

    /* compiled from: DeepLinkInput.kt */
    /* loaded from: classes.dex */
    public static abstract class b extends p {
        public final com.amazon.aps.iva.cg.c b;

        /* compiled from: DeepLinkInput.kt */
        /* loaded from: classes.dex */
        public static final class a extends b {
            public final com.amazon.aps.iva.dg.a c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.amazon.aps.iva.dg.a aVar) {
                super(aVar, com.amazon.aps.iva.cg.c.POPULAR);
                com.amazon.aps.iva.yb0.j.f(aVar, "uri");
                this.c = aVar;
            }

            @Override // com.amazon.aps.iva.cg.p
            public final com.amazon.aps.iva.dg.a a() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof a) && com.amazon.aps.iva.yb0.j.a(this.c, ((a) obj).c)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.c.hashCode();
            }

            public final String toString() {
                return "BrowseAllPopularDeepLinkInput(uri=" + this.c + ")";
            }
        }

        /* compiled from: DeepLinkInput.kt */
        /* renamed from: com.amazon.aps.iva.cg.p$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0172b extends b {
            public final com.amazon.aps.iva.dg.a c;
            public final String d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0172b(com.amazon.aps.iva.dg.a aVar, String str) {
                super(aVar, com.amazon.aps.iva.cg.c.GENRES);
                com.amazon.aps.iva.yb0.j.f(aVar, "uri");
                com.amazon.aps.iva.yb0.j.f(str, "genreId");
                this.c = aVar;
                this.d = str;
            }

            @Override // com.amazon.aps.iva.cg.p
            public final com.amazon.aps.iva.dg.a a() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0172b)) {
                    return false;
                }
                C0172b c0172b = (C0172b) obj;
                if (com.amazon.aps.iva.yb0.j.a(this.c, c0172b.c) && com.amazon.aps.iva.yb0.j.a(this.d, c0172b.d)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.d.hashCode() + (this.c.hashCode() * 31);
            }

            public final String toString() {
                return "BrowseGenreDeepLinkInput(uri=" + this.c + ", genreId=" + this.d + ")";
            }
        }

        /* compiled from: DeepLinkInput.kt */
        /* loaded from: classes.dex */
        public static final class c extends b {
            public final com.amazon.aps.iva.dg.a c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(com.amazon.aps.iva.dg.a aVar) {
                super(aVar, com.amazon.aps.iva.cg.c.SIMULCAST);
                com.amazon.aps.iva.yb0.j.f(aVar, "uri");
                this.c = aVar;
            }

            @Override // com.amazon.aps.iva.cg.p
            public final com.amazon.aps.iva.dg.a a() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof c) && com.amazon.aps.iva.yb0.j.a(this.c, ((c) obj).c)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.c.hashCode();
            }

            public final String toString() {
                return "BrowseSimulcastsDeepLinkInput(uri=" + this.c + ")";
            }
        }

        public b(com.amazon.aps.iva.dg.a aVar, com.amazon.aps.iva.cg.c cVar) {
            super(aVar);
            this.b = cVar;
        }
    }

    /* compiled from: DeepLinkInput.kt */
    /* loaded from: classes.dex */
    public static final class c extends p {
        public final com.amazon.aps.iva.dg.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.dg.a aVar) {
            super(aVar);
            com.amazon.aps.iva.yb0.j.f(aVar, "uri");
            this.b = aVar;
        }

        @Override // com.amazon.aps.iva.cg.p
        public final com.amazon.aps.iva.dg.a a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && com.amazon.aps.iva.yb0.j.a(this.b, ((c) obj).b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "CrunchylistDeepLink(uri=" + this.b + ")";
        }
    }

    /* compiled from: DeepLinkInput.kt */
    /* loaded from: classes.dex */
    public static abstract class d extends p {

        /* compiled from: DeepLinkInput.kt */
        /* loaded from: classes.dex */
        public static final class a extends d {
            public final String b;

            public a(String str) {
                com.amazon.aps.iva.yb0.j.f(str, "mediaId");
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof a) && com.amazon.aps.iva.yb0.j.a(this.b, ((a) obj).b)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return defpackage.b.c(new StringBuilder("ContentUnavailableDeepLink(mediaId="), this.b, ")");
            }
        }

        /* compiled from: DeepLinkInput.kt */
        /* loaded from: classes.dex */
        public static final class b extends d {
            public static final b b = new b();
        }

        public d() {
            super(new com.amazon.aps.iva.dg.a(0));
        }
    }

    /* compiled from: DeepLinkInput.kt */
    /* loaded from: classes.dex */
    public static final class e extends p {
        public final com.amazon.aps.iva.dg.a b;
        public final y c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.amazon.aps.iva.dg.a aVar, y yVar) {
            super(aVar);
            com.amazon.aps.iva.yb0.j.f(aVar, "uri");
            this.b = aVar;
            this.c = yVar;
        }

        @Override // com.amazon.aps.iva.cg.p
        public final com.amazon.aps.iva.dg.a a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.b, eVar.b) && this.c == eVar.c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = this.b.hashCode() * 31;
            y yVar = this.c;
            if (yVar == null) {
                hashCode = 0;
            } else {
                hashCode = yVar.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public final String toString() {
            return "HomeDeepLink(uri=" + this.b + ", carousel=" + this.c + ")";
        }
    }

    /* compiled from: DeepLinkInput.kt */
    /* loaded from: classes.dex */
    public static abstract class f extends p {
        public final com.amazon.aps.iva.dg.a b;
        public final Panel c;

        /* compiled from: DeepLinkInput.kt */
        /* loaded from: classes.dex */
        public static final class a extends f {
            public final com.amazon.aps.iva.dg.a d;
            public final Panel e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.amazon.aps.iva.dg.a aVar, Panel panel) {
                super(aVar, panel);
                com.amazon.aps.iva.yb0.j.f(aVar, "uri");
                this.d = aVar;
                this.e = panel;
            }

            @Override // com.amazon.aps.iva.cg.p.f, com.amazon.aps.iva.cg.p
            public final com.amazon.aps.iva.dg.a a() {
                return this.d;
            }

            @Override // com.amazon.aps.iva.cg.p.f
            public final Panel b() {
                return this.e;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                if (com.amazon.aps.iva.yb0.j.a(this.d, aVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, aVar.e)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.e.hashCode() + (this.d.hashCode() * 31);
            }

            public final String toString() {
                return "ShowPageDeepLinkInput(uri=" + this.d + ", panel=" + this.e + ")";
            }
        }

        /* compiled from: DeepLinkInput.kt */
        /* loaded from: classes.dex */
        public static final class b extends f {
            public final com.amazon.aps.iva.dg.a d;
            public final Panel e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(com.amazon.aps.iva.dg.a aVar, Panel panel) {
                super(aVar, panel);
                com.amazon.aps.iva.yb0.j.f(aVar, "uri");
                this.d = aVar;
                this.e = panel;
            }

            @Override // com.amazon.aps.iva.cg.p.f, com.amazon.aps.iva.cg.p
            public final com.amazon.aps.iva.dg.a a() {
                return this.d;
            }

            @Override // com.amazon.aps.iva.cg.p.f
            public final Panel b() {
                return this.e;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                if (com.amazon.aps.iva.yb0.j.a(this.d, bVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, bVar.e)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.e.hashCode() + (this.d.hashCode() * 31);
            }

            public final String toString() {
                return "WatchScreenDeepLinkInput(uri=" + this.d + ", panel=" + this.e + ")";
            }
        }

        public f(com.amazon.aps.iva.dg.a aVar, Panel panel) {
            super(aVar);
            this.b = aVar;
            this.c = panel;
        }

        @Override // com.amazon.aps.iva.cg.p
        public com.amazon.aps.iva.dg.a a() {
            return this.b;
        }

        public Panel b() {
            return this.c;
        }
    }

    /* compiled from: DeepLinkInput.kt */
    /* loaded from: classes.dex */
    public static final class g extends p {
        public final com.amazon.aps.iva.dg.a b;
        public final MusicAsset c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.amazon.aps.iva.dg.a aVar, MusicAsset musicAsset) {
            super(aVar);
            com.amazon.aps.iva.yb0.j.f(aVar, "uri");
            com.amazon.aps.iva.yb0.j.f(musicAsset, "musicAsset");
            this.b = aVar;
            this.c = musicAsset;
        }

        @Override // com.amazon.aps.iva.cg.p
        public final com.amazon.aps.iva.dg.a a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.b, gVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, gVar.c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "MusicAssetDeepLinkInput(uri=" + this.b + ", musicAsset=" + this.c + ")";
        }
    }

    /* compiled from: DeepLinkInput.kt */
    /* loaded from: classes.dex */
    public static final class h extends p {
        public final com.amazon.aps.iva.dg.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(com.amazon.aps.iva.dg.a aVar) {
            super(aVar);
            com.amazon.aps.iva.yb0.j.f(aVar, "uri");
            this.b = aVar;
        }

        @Override // com.amazon.aps.iva.cg.p
        public final com.amazon.aps.iva.dg.a a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof h) && com.amazon.aps.iva.yb0.j.a(this.b, ((h) obj).b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OfflineLibraryDeepLink(uri=" + this.b + ")";
        }
    }

    /* compiled from: DeepLinkInput.kt */
    /* loaded from: classes.dex */
    public static final class i extends p {
        public final com.amazon.aps.iva.dg.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(com.amazon.aps.iva.dg.a aVar) {
            super(aVar);
            com.amazon.aps.iva.yb0.j.f(aVar, "uri");
            this.b = aVar;
        }

        @Override // com.amazon.aps.iva.cg.p
        public final com.amazon.aps.iva.dg.a a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof i) && com.amazon.aps.iva.yb0.j.a(this.b, ((i) obj).b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SearchDeepLink(uri=" + this.b + ")";
        }
    }

    /* compiled from: DeepLinkInput.kt */
    /* loaded from: classes.dex */
    public static final class j extends p {
        public final com.amazon.aps.iva.dg.a b;
        public final Season c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(com.amazon.aps.iva.dg.a aVar, Season season) {
            super(aVar);
            com.amazon.aps.iva.yb0.j.f(aVar, "uri");
            com.amazon.aps.iva.yb0.j.f(season, "season");
            this.b = aVar;
            this.c = season;
        }

        @Override // com.amazon.aps.iva.cg.p
        public final com.amazon.aps.iva.dg.a a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.b, jVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, jVar.c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "SeasonDeepLinkInput(uri=" + this.b + ", season=" + this.c + ")";
        }
    }

    /* compiled from: DeepLinkInput.kt */
    /* loaded from: classes.dex */
    public static final class k extends p {
        public final com.amazon.aps.iva.dg.a b;
        public final d0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(com.amazon.aps.iva.dg.a aVar, d0 d0Var) {
            super(aVar);
            com.amazon.aps.iva.yb0.j.f(aVar, "uri");
            com.amazon.aps.iva.yb0.j.f(d0Var, FirebaseAnalytics.Param.DESTINATION);
            this.b = aVar;
            this.c = d0Var;
        }

        @Override // com.amazon.aps.iva.cg.p
        public final com.amazon.aps.iva.dg.a a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.b, kVar.b) && this.c == kVar.c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "SettingsDeepLinkInput(uri=" + this.b + ", destination=" + this.c + ")";
        }
    }

    /* compiled from: DeepLinkInput.kt */
    /* loaded from: classes.dex */
    public static final class l extends p {
        public final com.amazon.aps.iva.dg.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(com.amazon.aps.iva.dg.a aVar) {
            super(aVar);
            com.amazon.aps.iva.yb0.j.f(aVar, "uri");
            this.b = aVar;
        }

        @Override // com.amazon.aps.iva.cg.p
        public final com.amazon.aps.iva.dg.a a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof l) && com.amazon.aps.iva.yb0.j.a(this.b, ((l) obj).b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SignInDeepLink(uri=" + this.b + ")";
        }
    }

    /* compiled from: DeepLinkInput.kt */
    /* loaded from: classes.dex */
    public static final class m extends p {
        public final com.amazon.aps.iva.dg.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(com.amazon.aps.iva.dg.a aVar) {
            super(aVar);
            com.amazon.aps.iva.yb0.j.f(aVar, "uri");
            this.b = aVar;
        }

        @Override // com.amazon.aps.iva.cg.p
        public final com.amazon.aps.iva.dg.a a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof m) && com.amazon.aps.iva.yb0.j.a(this.b, ((m) obj).b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SignUpDeepLink(uri=" + this.b + ")";
        }
    }

    /* compiled from: DeepLinkInput.kt */
    /* loaded from: classes.dex */
    public static final class n extends p {
        public final com.amazon.aps.iva.dg.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(com.amazon.aps.iva.dg.a aVar) {
            super(aVar);
            com.amazon.aps.iva.yb0.j.f(aVar, "uri");
            this.b = aVar;
        }

        @Override // com.amazon.aps.iva.cg.p
        public final com.amazon.aps.iva.dg.a a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof n) && com.amazon.aps.iva.yb0.j.a(this.b, ((n) obj).b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SimulcastDeepLink(uri=" + this.b + ")";
        }
    }

    /* compiled from: DeepLinkInput.kt */
    /* loaded from: classes.dex */
    public static final class o extends p {
        public final com.amazon.aps.iva.dg.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(com.amazon.aps.iva.dg.a aVar) {
            super(aVar);
            com.amazon.aps.iva.yb0.j.f(aVar, "uri");
            this.b = aVar;
        }

        @Override // com.amazon.aps.iva.cg.p
        public final com.amazon.aps.iva.dg.a a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof o) && com.amazon.aps.iva.yb0.j.a(this.b, ((o) obj).b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpgradeMenuDeeplink(uri=" + this.b + ")";
        }
    }

    /* compiled from: DeepLinkInput.kt */
    /* renamed from: com.amazon.aps.iva.cg.p$p  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0173p extends p {
        public final com.amazon.aps.iva.dg.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0173p(com.amazon.aps.iva.dg.a aVar) {
            super(aVar);
            com.amazon.aps.iva.yb0.j.f(aVar, "uri");
            this.b = aVar;
        }

        @Override // com.amazon.aps.iva.cg.p
        public final com.amazon.aps.iva.dg.a a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0173p) && com.amazon.aps.iva.yb0.j.a(this.b, ((C0173p) obj).b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpsellMenuDeepLink(uri=" + this.b + ")";
        }
    }

    /* compiled from: DeepLinkInput.kt */
    /* loaded from: classes.dex */
    public static final class q extends p {
        public final com.amazon.aps.iva.dg.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(com.amazon.aps.iva.dg.a aVar) {
            super(aVar);
            com.amazon.aps.iva.yb0.j.f(aVar, "uri");
            this.b = aVar;
        }

        @Override // com.amazon.aps.iva.cg.p
        public final com.amazon.aps.iva.dg.a a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof q) && com.amazon.aps.iva.yb0.j.a(this.b, ((q) obj).b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "WatchlistDeepLink(uri=" + this.b + ")";
        }
    }

    public p(com.amazon.aps.iva.dg.a aVar) {
        this.a = aVar;
    }

    public com.amazon.aps.iva.dg.a a() {
        return this.a;
    }
}
