package com.amazon.aps.iva.ks;
/* compiled from: PanelContextProperty.kt */
/* loaded from: classes2.dex */
public abstract class n extends com.amazon.aps.iva.is.a {

    /* compiled from: PanelContextProperty.kt */
    /* loaded from: classes2.dex */
    public static final class a extends n {
        private final String browseType = "browseAll";
        private final String contentCategoryFilteredBy;
        private final e contentMediaProperty;
        private final String sortedBy;
        private final String subbedDubbedFilteredBy;

        public a(e eVar, String str, String str2, String str3) {
            this.contentMediaProperty = eVar;
            this.contentCategoryFilteredBy = str;
            this.subbedDubbedFilteredBy = str2;
            this.sortedBy = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.contentMediaProperty, aVar.contentMediaProperty) && com.amazon.aps.iva.yb0.j.a(this.browseType, aVar.browseType) && com.amazon.aps.iva.yb0.j.a(this.contentCategoryFilteredBy, aVar.contentCategoryFilteredBy) && com.amazon.aps.iva.yb0.j.a(this.subbedDubbedFilteredBy, aVar.subbedDubbedFilteredBy) && com.amazon.aps.iva.yb0.j.a(this.sortedBy, aVar.sortedBy)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.sortedBy.hashCode() + com.amazon.aps.iva.c80.a.b(this.subbedDubbedFilteredBy, com.amazon.aps.iva.c80.a.b(this.contentCategoryFilteredBy, com.amazon.aps.iva.c80.a.b(this.browseType, this.contentMediaProperty.hashCode() * 31, 31), 31), 31);
        }

        public final String toString() {
            e eVar = this.contentMediaProperty;
            String str = this.browseType;
            String str2 = this.contentCategoryFilteredBy;
            String str3 = this.subbedDubbedFilteredBy;
            String str4 = this.sortedBy;
            StringBuilder sb = new StringBuilder("BrowseAllPanelContextProperty(contentMediaProperty=");
            sb.append(eVar);
            sb.append(", browseType=");
            sb.append(str);
            sb.append(", contentCategoryFilteredBy=");
            com.amazon.aps.iva.m80.a.c(sb, str2, ", subbedDubbedFilteredBy=", str3, ", sortedBy=");
            return defpackage.b.c(sb, str4, ")");
        }
    }

    /* compiled from: PanelContextProperty.kt */
    /* loaded from: classes2.dex */
    public static final class b extends n {
        private final String browseType;
        private final e contentMediaProperty;
        private final String genre;
        private final String subGenre;

        public b(e eVar, String str, String str2) {
            com.amazon.aps.iva.yb0.j.f(str, "genre");
            com.amazon.aps.iva.yb0.j.f(str2, "subGenre");
            this.contentMediaProperty = eVar;
            this.browseType = "browse";
            this.genre = str;
            this.subGenre = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.contentMediaProperty, bVar.contentMediaProperty) && com.amazon.aps.iva.yb0.j.a(this.browseType, bVar.browseType) && com.amazon.aps.iva.yb0.j.a(this.genre, bVar.genre) && com.amazon.aps.iva.yb0.j.a(this.subGenre, bVar.subGenre)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.subGenre.hashCode() + com.amazon.aps.iva.c80.a.b(this.genre, com.amazon.aps.iva.c80.a.b(this.browseType, this.contentMediaProperty.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            e eVar = this.contentMediaProperty;
            String str = this.browseType;
            String str2 = this.genre;
            String str3 = this.subGenre;
            StringBuilder sb = new StringBuilder("GenrePanelContextProperty(contentMediaProperty=");
            sb.append(eVar);
            sb.append(", browseType=");
            sb.append(str);
            sb.append(", genre=");
            return com.amazon.aps.iva.ab.f.a(sb, str2, ", subGenre=", str3, ")");
        }
    }

    /* compiled from: PanelContextProperty.kt */
    /* loaded from: classes2.dex */
    public static final class c extends n {
        private final e contentMediaProperty;
        private final String simulcastSeason;

        public c(e eVar, String str) {
            com.amazon.aps.iva.yb0.j.f(str, "simulcastSeason");
            this.contentMediaProperty = eVar;
            this.simulcastSeason = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.contentMediaProperty, cVar.contentMediaProperty) && com.amazon.aps.iva.yb0.j.a(this.simulcastSeason, cVar.simulcastSeason)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.simulcastSeason.hashCode() + (this.contentMediaProperty.hashCode() * 31);
        }

        public final String toString() {
            e eVar = this.contentMediaProperty;
            String str = this.simulcastSeason;
            return "SimulcastPanelContextProperty(contentMediaProperty=" + eVar + ", simulcastSeason=" + str + ")";
        }
    }

    /* compiled from: PanelContextProperty.kt */
    /* loaded from: classes2.dex */
    public static final class d extends n {
        private final String browseType;
        private final String contentCategoryFilteredBy;
        private final e contentMediaProperty;
        private final String dateGroupedBy;
        private final String genre;
        private final String sortedBy;
        private final String subGenre;
        private final String subbedDubbedFilteredBy;

        public d(e eVar, String str, String str2, String str3, String str4, String str5, String str6) {
            com.amazon.aps.iva.yb0.j.f(str, "genre");
            this.contentMediaProperty = eVar;
            this.browseType = "subgenre";
            this.genre = str;
            this.subGenre = str2;
            this.contentCategoryFilteredBy = str3;
            this.subbedDubbedFilteredBy = str4;
            this.sortedBy = str5;
            this.dateGroupedBy = str6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.contentMediaProperty, dVar.contentMediaProperty) && com.amazon.aps.iva.yb0.j.a(this.browseType, dVar.browseType) && com.amazon.aps.iva.yb0.j.a(this.genre, dVar.genre) && com.amazon.aps.iva.yb0.j.a(this.subGenre, dVar.subGenre) && com.amazon.aps.iva.yb0.j.a(this.contentCategoryFilteredBy, dVar.contentCategoryFilteredBy) && com.amazon.aps.iva.yb0.j.a(this.subbedDubbedFilteredBy, dVar.subbedDubbedFilteredBy) && com.amazon.aps.iva.yb0.j.a(this.sortedBy, dVar.sortedBy) && com.amazon.aps.iva.yb0.j.a(this.dateGroupedBy, dVar.dateGroupedBy)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int b = com.amazon.aps.iva.c80.a.b(this.subbedDubbedFilteredBy, com.amazon.aps.iva.c80.a.b(this.contentCategoryFilteredBy, com.amazon.aps.iva.c80.a.b(this.subGenre, com.amazon.aps.iva.c80.a.b(this.genre, com.amazon.aps.iva.c80.a.b(this.browseType, this.contentMediaProperty.hashCode() * 31, 31), 31), 31), 31), 31);
            String str = this.sortedBy;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (b + hashCode) * 31;
            String str2 = this.dateGroupedBy;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return i2 + i;
        }

        public final String toString() {
            e eVar = this.contentMediaProperty;
            String str = this.browseType;
            String str2 = this.genre;
            String str3 = this.subGenre;
            String str4 = this.contentCategoryFilteredBy;
            String str5 = this.subbedDubbedFilteredBy;
            String str6 = this.sortedBy;
            String str7 = this.dateGroupedBy;
            StringBuilder sb = new StringBuilder("SubgenrePanelContextProperty(contentMediaProperty=");
            sb.append(eVar);
            sb.append(", browseType=");
            sb.append(str);
            sb.append(", genre=");
            com.amazon.aps.iva.m80.a.c(sb, str2, ", subGenre=", str3, ", contentCategoryFilteredBy=");
            com.amazon.aps.iva.m80.a.c(sb, str4, ", subbedDubbedFilteredBy=", str5, ", sortedBy=");
            return com.amazon.aps.iva.ab.f.a(sb, str6, ", dateGroupedBy=", str7, ")");
        }
    }
}
