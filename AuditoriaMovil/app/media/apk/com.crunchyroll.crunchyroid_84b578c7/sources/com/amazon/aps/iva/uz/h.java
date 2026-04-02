package com.amazon.aps.iva.uz;

import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.ui.pagination.PaginationAdapterItem;
/* compiled from: BrowseUiModel.kt */
/* loaded from: classes2.dex */
public abstract class h implements PaginationAdapterItem {
    public final String a = "";

    /* compiled from: BrowseUiModel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends h {
        public static final a b = new a();
    }

    /* compiled from: BrowseUiModel.kt */
    /* loaded from: classes2.dex */
    public static final class b extends h {
        public final int b;

        public b(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && this.b == ((b) obj).b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.e.f(new StringBuilder("HeaderBrowseUiModel(resId="), this.b, ")");
        }
    }

    /* compiled from: BrowseUiModel.kt */
    /* loaded from: classes2.dex */
    public static abstract class c extends h {
        public final Panel b;

        /* compiled from: BrowseUiModel.kt */
        /* loaded from: classes2.dex */
        public static final class a extends c {
            public final Panel c;

            static {
                int i = Panel.$stable;
            }

            public a(Panel panel) {
                super(panel);
                this.c = panel;
            }

            @Override // com.amazon.aps.iva.uz.h.c
            public final Panel a() {
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
                return "BigPanelBrowseUiModel(panel=" + this.c + ")";
            }
        }

        /* compiled from: BrowseUiModel.kt */
        /* loaded from: classes2.dex */
        public static final class b extends c {
            public final Panel c;

            static {
                int i = Panel.$stable;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Panel panel) {
                super(panel);
                com.amazon.aps.iva.yb0.j.f(panel, "panel");
                this.c = panel;
            }

            @Override // com.amazon.aps.iva.uz.h.c
            public final Panel a() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof b) && com.amazon.aps.iva.yb0.j.a(this.c, ((b) obj).c)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.c.hashCode();
            }

            public final String toString() {
                return "DateLabeledSmallPanelBrowseUiModel(panel=" + this.c + ")";
            }
        }

        /* compiled from: BrowseUiModel.kt */
        /* renamed from: com.amazon.aps.iva.uz.h$c$c  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0774c extends c {
            public final Panel c;

            static {
                int i = Panel.$stable;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0774c(Panel panel) {
                super(panel);
                com.amazon.aps.iva.yb0.j.f(panel, "panel");
                this.c = panel;
            }

            @Override // com.amazon.aps.iva.uz.h.c
            public final Panel a() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0774c) && com.amazon.aps.iva.yb0.j.a(this.c, ((C0774c) obj).c)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.c.hashCode();
            }

            public final String toString() {
                return "SmallPanelBrowseUiModel(panel=" + this.c + ")";
            }
        }

        static {
            int i = Panel.$stable;
        }

        public c(Panel panel) {
            this.b = panel;
        }

        public Panel a() {
            return this.b;
        }
    }

    /* compiled from: BrowseUiModel.kt */
    /* loaded from: classes2.dex */
    public static final class d extends h {
        public final String b;
        public final String c;

        public d(String str, String str2) {
            com.amazon.aps.iva.yb0.j.f(str, "prefix");
            com.amazon.aps.iva.yb0.j.f(str2, "title");
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.b, dVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, dVar.c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PrefixedHeaderBrowseUiModel(prefix=");
            sb.append(this.b);
            sb.append(", title=");
            return defpackage.b.c(sb, this.c, ")");
        }
    }

    @Override // com.ellation.crunchyroll.ui.pagination.PaginationAdapterItem
    public final String getAdapterId() {
        return this.a;
    }

    @Override // com.ellation.crunchyroll.ui.pagination.PaginationAdapterItem
    public final String getContentId() {
        return PaginationAdapterItem.DefaultImpls.getContentId(this);
    }
}
