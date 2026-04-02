package com.amazon.aps.iva.n10;

import com.amazon.aps.iva.j0.j0;
import com.ellation.crunchyroll.model.categories.Category;
import com.ellation.crunchyroll.ui.pagination.PaginationAdapterItem;
import com.google.android.gms.cast.MediaTrack;
/* compiled from: GenreFeedAdapterItem.kt */
/* loaded from: classes2.dex */
public abstract class b implements PaginationAdapterItem {
    public final String a;
    public final String b;

    /* compiled from: GenreFeedAdapterItem.kt */
    /* loaded from: classes2.dex */
    public static final class a extends b {
        public final com.amazon.aps.iva.a00.b c;
        public final int d;

        public a(com.amazon.aps.iva.a00.b bVar) {
            com.amazon.aps.iva.yb0.j.f(bVar, "sortOption");
            this.c = bVar;
            this.d = 10;
        }
    }

    /* compiled from: GenreFeedAdapterItem.kt */
    /* renamed from: com.amazon.aps.iva.n10.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0524b extends b {
        public final int c = 10;
    }

    /* compiled from: GenreFeedAdapterItem.kt */
    /* loaded from: classes2.dex */
    public static abstract class c extends b {
        public final com.amazon.aps.iva.n10.a c;

        /* compiled from: GenreFeedAdapterItem.kt */
        /* loaded from: classes2.dex */
        public static final class a extends c {
            public final String d;
            public final com.amazon.aps.iva.a00.b e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, com.amazon.aps.iva.a00.b bVar, com.amazon.aps.iva.n10.a aVar) {
                super(str, String.valueOf(bVar.getTitle()), aVar);
                com.amazon.aps.iva.yb0.j.f(str, "adapterId");
                com.amazon.aps.iva.yb0.j.f(bVar, "sortOption");
                com.amazon.aps.iva.yb0.j.f(aVar, "browseContainer");
                this.d = str;
                this.e = bVar;
            }

            @Override // com.amazon.aps.iva.n10.b, com.ellation.crunchyroll.ui.pagination.PaginationAdapterItem
            public final String getAdapterId() {
                return this.d;
            }
        }

        /* compiled from: GenreFeedAdapterItem.kt */
        /* renamed from: com.amazon.aps.iva.n10.b$c$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0525b extends c {
            public final String d;
            public final String e;
            public final Category f;

            static {
                int i = Category.$stable;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0525b(String str, String str2, Category category, com.amazon.aps.iva.n10.a aVar) {
                super(str, str2, aVar);
                com.amazon.aps.iva.yb0.j.f(str, "adapterId");
                com.amazon.aps.iva.yb0.j.f(str2, "feedTitle");
                com.amazon.aps.iva.yb0.j.f(category, "category");
                com.amazon.aps.iva.yb0.j.f(aVar, "browseContainer");
                this.d = str;
                this.e = str2;
                this.f = category;
            }

            @Override // com.amazon.aps.iva.n10.b, com.ellation.crunchyroll.ui.pagination.PaginationAdapterItem
            public final String getAdapterId() {
                return this.d;
            }
        }

        public c(String str, String str2, com.amazon.aps.iva.n10.a aVar) {
            super(str, str2);
            this.c = aVar;
        }
    }

    /* compiled from: GenreFeedAdapterItem.kt */
    /* loaded from: classes2.dex */
    public static final class d extends b {
        public final String c;
        public final String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2) {
            super(str, str2);
            com.amazon.aps.iva.yb0.j.f(str2, MediaTrack.ROLE_DESCRIPTION);
            this.c = str;
            this.d = str2;
        }

        @Override // com.amazon.aps.iva.n10.b, com.ellation.crunchyroll.ui.pagination.PaginationAdapterItem
        public final String getAdapterId() {
            return this.c;
        }
    }

    public /* synthetic */ b() {
        this(j0.d("randomUUID().toString()"), "");
    }

    @Override // com.ellation.crunchyroll.ui.pagination.PaginationAdapterItem
    public String getAdapterId() {
        return this.a;
    }

    @Override // com.ellation.crunchyroll.ui.pagination.PaginationAdapterItem
    public final String getContentId() {
        return this.b;
    }

    public b(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
