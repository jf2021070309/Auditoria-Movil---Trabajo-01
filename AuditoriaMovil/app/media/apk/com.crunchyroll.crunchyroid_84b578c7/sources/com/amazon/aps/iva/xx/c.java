package com.amazon.aps.iva.xx;

import com.ellation.crunchyroll.api.model.HomeFeedItemRaw;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.UpNext;
/* compiled from: HomeFeedItem.kt */
/* loaded from: classes2.dex */
public abstract class c extends h {
    public final Panel e;

    /* compiled from: HomeFeedItem.kt */
    /* loaded from: classes2.dex */
    public static final class a extends c {
        public final Panel f;
        public final HomeFeedItemRaw g;
        public final k h;
        public final UpNext i;

        static {
            int i = UpNext.$stable;
            int i2 = HomeFeedItemRaw.$stable;
            int i3 = Panel.$stable;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Panel panel, HomeFeedItemRaw homeFeedItemRaw, k kVar, UpNext upNext) {
            super(panel, homeFeedItemRaw);
            com.amazon.aps.iva.yb0.j.f(panel, "panel");
            com.amazon.aps.iva.yb0.j.f(homeFeedItemRaw, "raw");
            com.amazon.aps.iva.yb0.j.f(kVar, "feedPositionState");
            this.f = panel;
            this.g = homeFeedItemRaw;
            this.h = kVar;
            this.i = upNext;
        }

        public static a c(a aVar, Panel panel, UpNext upNext, int i) {
            HomeFeedItemRaw homeFeedItemRaw;
            if ((i & 1) != 0) {
                panel = aVar.f;
            }
            k kVar = null;
            if ((i & 2) != 0) {
                homeFeedItemRaw = aVar.g;
            } else {
                homeFeedItemRaw = null;
            }
            if ((i & 4) != 0) {
                kVar = aVar.h;
            }
            if ((i & 8) != 0) {
                upNext = aVar.i;
            }
            aVar.getClass();
            com.amazon.aps.iva.yb0.j.f(panel, "panel");
            com.amazon.aps.iva.yb0.j.f(homeFeedItemRaw, "raw");
            com.amazon.aps.iva.yb0.j.f(kVar, "feedPositionState");
            return new a(panel, homeFeedItemRaw, kVar, upNext);
        }

        @Override // com.amazon.aps.iva.xx.c
        public final Panel b() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.f, aVar.f) && com.amazon.aps.iva.yb0.j.a(this.g, aVar.g) && this.h == aVar.h && com.amazon.aps.iva.yb0.j.a(this.i, aVar.i)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = this.g.hashCode();
            int hashCode3 = (this.h.hashCode() + ((hashCode2 + (this.f.hashCode() * 31)) * 31)) * 31;
            UpNext upNext = this.i;
            if (upNext == null) {
                hashCode = 0;
            } else {
                hashCode = upNext.hashCode();
            }
            return hashCode3 + hashCode;
        }

        public final String toString() {
            return "ContainerPanelItem(panel=" + this.f + ", raw=" + this.g + ", feedPositionState=" + this.h + ", upNext=" + this.i + ")";
        }
    }

    /* compiled from: HomeFeedItem.kt */
    /* loaded from: classes2.dex */
    public static final class b extends c {
        public final Panel f;
        public final HomeFeedItemRaw g;
        public final k h;

        static {
            int i = HomeFeedItemRaw.$stable;
            int i2 = Panel.$stable;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Panel panel, HomeFeedItemRaw homeFeedItemRaw, k kVar) {
            super(panel, homeFeedItemRaw);
            com.amazon.aps.iva.yb0.j.f(panel, "panel");
            com.amazon.aps.iva.yb0.j.f(homeFeedItemRaw, "raw");
            com.amazon.aps.iva.yb0.j.f(kVar, "feedPositionState");
            this.f = panel;
            this.g = homeFeedItemRaw;
            this.h = kVar;
        }

        @Override // com.amazon.aps.iva.xx.c
        public final Panel b() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.f, bVar.f) && com.amazon.aps.iva.yb0.j.a(this.g, bVar.g) && this.h == bVar.h) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.g.hashCode();
            return this.h.hashCode() + ((hashCode + (this.f.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "EpisodePanelItem(panel=" + this.f + ", raw=" + this.g + ", feedPositionState=" + this.h + ")";
        }
    }

    /* compiled from: HomeFeedItem.kt */
    /* renamed from: com.amazon.aps.iva.xx.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0868c extends c {
        public final Panel f;
        public final HomeFeedItemRaw g;

        static {
            int i = HomeFeedItemRaw.$stable;
            int i2 = Panel.$stable;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0868c(Panel panel, HomeFeedItemRaw homeFeedItemRaw) {
            super(panel, homeFeedItemRaw);
            com.amazon.aps.iva.yb0.j.f(panel, "panel");
            com.amazon.aps.iva.yb0.j.f(homeFeedItemRaw, "raw");
            this.f = panel;
            this.g = homeFeedItemRaw;
        }

        @Override // com.amazon.aps.iva.xx.c
        public final Panel b() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0868c)) {
                return false;
            }
            C0868c c0868c = (C0868c) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.f, c0868c.f) && com.amazon.aps.iva.yb0.j.a(this.g, c0868c.g)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.g.hashCode() + (this.f.hashCode() * 31);
        }

        public final String toString() {
            return "HeroItem(panel=" + this.f + ", raw=" + this.g + ")";
        }
    }

    public c(Panel panel, HomeFeedItemRaw homeFeedItemRaw) {
        super(homeFeedItemRaw);
        this.e = panel;
    }

    public Panel b() {
        return this.e;
    }
}
