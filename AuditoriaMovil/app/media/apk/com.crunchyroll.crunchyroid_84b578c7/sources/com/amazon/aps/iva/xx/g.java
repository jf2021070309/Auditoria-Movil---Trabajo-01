package com.amazon.aps.iva.xx;

import com.ellation.crunchyroll.api.model.HomeFeedItemRaw;
import com.ellation.crunchyroll.model.Panel;
import java.util.ArrayList;
import java.util.List;
/* compiled from: HomeFeedItem.kt */
/* loaded from: classes2.dex */
public abstract class g extends h {
    public final List<Panel> e;
    public final HomeFeedItemRaw f;
    public final int g;

    /* compiled from: HomeFeedItem.kt */
    /* loaded from: classes2.dex */
    public static final class a extends g {
        public final List<Panel> h;
        public final HomeFeedItemRaw i;
        public final int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<Panel> list, HomeFeedItemRaw homeFeedItemRaw, int i) {
            super(list, homeFeedItemRaw, i);
            com.amazon.aps.iva.yb0.j.f(list, "panels");
            com.amazon.aps.iva.yb0.j.f(homeFeedItemRaw, "raw");
            this.h = list;
            this.i = homeFeedItemRaw;
            this.j = i;
        }

        @Override // com.amazon.aps.iva.xx.g
        public final List<Panel> b() {
            return this.h;
        }

        @Override // com.amazon.aps.iva.xx.g
        public final int c() {
            return this.j;
        }

        @Override // com.amazon.aps.iva.xx.g
        public final HomeFeedItemRaw d() {
            return this.i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.h, aVar.h) && com.amazon.aps.iva.yb0.j.a(this.i, aVar.i) && this.j == aVar.j) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.i.hashCode();
            return Integer.hashCode(this.j) + ((hashCode + (this.h.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShortCollectionItem(panels=");
            sb.append(this.h);
            sb.append(", raw=");
            sb.append(this.i);
            sb.append(", positionInFeed=");
            return defpackage.e.f(sb, this.j, ")");
        }
    }

    /* compiled from: HomeFeedItem.kt */
    /* loaded from: classes2.dex */
    public static final class b extends g {
        public final List<Panel> h;
        public final HomeFeedItemRaw i;
        public final int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<Panel> list, HomeFeedItemRaw homeFeedItemRaw, int i) {
            super(list, homeFeedItemRaw, i);
            com.amazon.aps.iva.yb0.j.f(list, "panels");
            com.amazon.aps.iva.yb0.j.f(homeFeedItemRaw, "raw");
            this.h = list;
            this.i = homeFeedItemRaw;
            this.j = i;
        }

        @Override // com.amazon.aps.iva.xx.g
        public final List<Panel> b() {
            return this.h;
        }

        @Override // com.amazon.aps.iva.xx.g
        public final int c() {
            return this.j;
        }

        @Override // com.amazon.aps.iva.xx.g
        public final HomeFeedItemRaw d() {
            return this.i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.h, bVar.h) && com.amazon.aps.iva.yb0.j.a(this.i, bVar.i) && this.j == bVar.j) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.i.hashCode();
            return Integer.hashCode(this.j) + ((hashCode + (this.h.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TallCollectionItem(panels=");
            sb.append(this.h);
            sb.append(", raw=");
            sb.append(this.i);
            sb.append(", positionInFeed=");
            return defpackage.e.f(sb, this.j, ")");
        }
    }

    /* compiled from: HomeFeedItem.kt */
    /* loaded from: classes2.dex */
    public static abstract class c extends g {
        public final List<Panel> h;

        /* compiled from: HomeFeedItem.kt */
        /* loaded from: classes2.dex */
        public static final class a extends c {
            public final List<com.amazon.aps.iva.yx.g> i;
            public final HomeFeedItemRaw j;
            public final int k;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public a(java.util.ArrayList r4, com.ellation.crunchyroll.api.model.HomeFeedItemRaw r5, int r6) {
                /*
                    r3 = this;
                    java.lang.String r0 = "raw"
                    com.amazon.aps.iva.yb0.j.f(r5, r0)
                    java.util.ArrayList r0 = new java.util.ArrayList
                    int r1 = com.amazon.aps.iva.lb0.r.Y(r4)
                    r0.<init>(r1)
                    java.util.Iterator r1 = r4.iterator()
                L12:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L24
                    java.lang.Object r2 = r1.next()
                    com.amazon.aps.iva.yx.g r2 = (com.amazon.aps.iva.yx.g) r2
                    com.ellation.crunchyroll.model.Panel r2 = r2.a
                    r0.add(r2)
                    goto L12
                L24:
                    r3.<init>(r0, r5, r6)
                    r3.i = r4
                    r3.j = r5
                    r3.k = r6
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.xx.g.c.a.<init>(java.util.ArrayList, com.ellation.crunchyroll.api.model.HomeFeedItemRaw, int):void");
            }

            @Override // com.amazon.aps.iva.xx.g
            public final int c() {
                return this.k;
            }

            @Override // com.amazon.aps.iva.xx.g
            public final HomeFeedItemRaw d() {
                return this.j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                if (com.amazon.aps.iva.yb0.j.a(this.i, aVar.i) && com.amazon.aps.iva.yb0.j.a(this.j, aVar.j) && this.k == aVar.k) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                int hashCode = this.j.hashCode();
                return Integer.hashCode(this.k) + ((hashCode + (this.i.hashCode() * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ContinueWatchingItem(continueWatchingPanels=");
                sb.append(this.i);
                sb.append(", raw=");
                sb.append(this.j);
                sb.append(", positionInFeed=");
                return defpackage.e.f(sb, this.k, ")");
            }
        }

        /* compiled from: HomeFeedItem.kt */
        /* loaded from: classes2.dex */
        public static final class b extends c {
            public final HomeFeedItemRaw i;
            public final List<com.amazon.aps.iva.b60.k> j;
            public final boolean k;
            public final int l;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public b(com.ellation.crunchyroll.api.model.HomeFeedItemRaw r4, java.util.ArrayList r5, boolean r6, int r7) {
                /*
                    r3 = this;
                    java.util.ArrayList r0 = new java.util.ArrayList
                    int r1 = com.amazon.aps.iva.lb0.r.Y(r5)
                    r0.<init>(r1)
                    java.util.Iterator r1 = r5.iterator()
                Ld:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L1f
                    java.lang.Object r2 = r1.next()
                    com.amazon.aps.iva.b60.k r2 = (com.amazon.aps.iva.b60.k) r2
                    com.ellation.crunchyroll.model.Panel r2 = r2.g
                    r0.add(r2)
                    goto Ld
                L1f:
                    r3.<init>(r0, r4, r7)
                    r3.i = r4
                    r3.j = r5
                    r3.k = r6
                    r3.l = r7
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.xx.g.c.b.<init>(com.ellation.crunchyroll.api.model.HomeFeedItemRaw, java.util.ArrayList, boolean, int):void");
            }

            @Override // com.amazon.aps.iva.xx.g
            public final int c() {
                return this.l;
            }

            @Override // com.amazon.aps.iva.xx.g
            public final HomeFeedItemRaw d() {
                return this.i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                if (com.amazon.aps.iva.yb0.j.a(this.i, bVar.i) && com.amazon.aps.iva.yb0.j.a(this.j, bVar.j) && this.k == bVar.k && this.l == bVar.l) {
                    return true;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final int hashCode() {
                int a = defpackage.a.a(this.j, this.i.hashCode() * 31, 31);
                boolean z = this.k;
                int i = z;
                if (z != 0) {
                    i = 1;
                }
                return Integer.hashCode(this.l) + ((a + i) * 31);
            }

            public final String toString() {
                return "WatchlistItem(raw=" + this.i + ", watchlistPanels=" + this.j + ", hasMoreItems=" + this.k + ", positionInFeed=" + this.l + ")";
            }
        }

        public c(ArrayList arrayList, HomeFeedItemRaw homeFeedItemRaw, int i) {
            super(arrayList, homeFeedItemRaw, i);
            this.h = arrayList;
        }

        @Override // com.amazon.aps.iva.xx.g
        public final List<Panel> b() {
            return this.h;
        }
    }

    public g() {
        throw null;
    }

    public g(List list, HomeFeedItemRaw homeFeedItemRaw, int i) {
        super(homeFeedItemRaw);
        this.e = list;
        this.f = homeFeedItemRaw;
        this.g = i;
    }

    public List<Panel> b() {
        return this.e;
    }

    public int c() {
        return this.g;
    }

    public HomeFeedItemRaw d() {
        return this.f;
    }
}
