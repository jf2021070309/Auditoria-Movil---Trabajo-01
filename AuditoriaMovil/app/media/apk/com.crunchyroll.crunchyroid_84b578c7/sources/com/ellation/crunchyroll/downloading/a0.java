package com.ellation.crunchyroll.downloading;

import com.amazon.aps.iva.mf0.a;
import com.amazon.aps.iva.sv.a2;
import com.amazon.aps.iva.sv.b2;
import com.amazon.aps.iva.sv.c2;
import com.ellation.crunchyroll.api.cms.model.Season;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.downloading.z;
import com.ellation.crunchyroll.model.Images;
import java.io.File;
import java.util.Iterator;
import java.util.List;
/* compiled from: ImageDownloader.kt */
/* loaded from: classes2.dex */
public final class a0 implements z {
    public final String a;
    public final com.amazon.aps.iva.wv.o b;
    public final a2<z.a> c;
    public final com.amazon.aps.iva.se0.g0 d;

    /* compiled from: ImageDownloader.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<z.a, com.amazon.aps.iva.kb0.q> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(z.a aVar) {
            z.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "it");
            a.C0515a c0515a = com.amazon.aps.iva.mf0.a.a;
            c0515a.a("Cancelled " + aVar2.c, new Object[0]);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ImageDownloader.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Images> {
        public final /* synthetic */ com.amazon.aps.iva.sw.b h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.sw.b bVar) {
            super(0);
            this.h = bVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Images invoke() {
            return this.h.b.getImages();
        }
    }

    /* compiled from: ImageDownloader.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<String> {
        public final /* synthetic */ com.amazon.aps.iva.sw.b h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.sw.b bVar) {
            super(0);
            this.h = bVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final String invoke() {
            return this.h.b.getId();
        }
    }

    /* compiled from: ImageDownloader.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Images> {
        public final /* synthetic */ com.amazon.aps.iva.sw.b h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.amazon.aps.iva.sw.b bVar) {
            super(0);
            this.h = bVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Images invoke() {
            return this.h.e.getImages();
        }
    }

    /* compiled from: ImageDownloader.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<String> {
        public final /* synthetic */ com.amazon.aps.iva.sw.b h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.amazon.aps.iva.sw.b bVar) {
            super(0);
            this.h = bVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final String invoke() {
            return this.h.e.getId();
        }
    }

    /* compiled from: ImageDownloader.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Images> {
        public final /* synthetic */ com.amazon.aps.iva.sw.b h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.amazon.aps.iva.sw.b bVar) {
            super(0);
            this.h = bVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Images invoke() {
            return this.h.f.getImages();
        }
    }

    /* compiled from: ImageDownloader.kt */
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<String> {
        public final /* synthetic */ com.amazon.aps.iva.sw.b h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.amazon.aps.iva.sw.b bVar) {
            super(0);
            this.h = bVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final String invoke() {
            return this.h.f.getId();
        }
    }

    public a0(String str, com.amazon.aps.iva.wv.p pVar, c2 c2Var, com.amazon.aps.iva.sv.d dVar) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadPath");
        this.a = str;
        this.b = pVar;
        this.c = c2Var;
        this.d = dVar;
    }

    public static Image f(List list) {
        Object obj;
        com.amazon.aps.iva.yb0.j.f(list, "<this>");
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            if (!it.hasNext()) {
                obj = next;
            } else {
                int width = ((Image) next).getWidth();
                do {
                    Object next2 = it.next();
                    int width2 = ((Image) next2).getWidth();
                    if (width < width2) {
                        next = next2;
                        width = width2;
                    }
                } while (it.hasNext());
                obj = next;
            }
        }
        return (Image) obj;
    }

    @Override // com.ellation.crunchyroll.downloading.z
    public final void a() {
        this.c.a();
        com.amazon.aps.iva.mf0.a.a.a("Cancelled all", new Object[0]);
    }

    @Override // com.ellation.crunchyroll.downloading.z
    public final void b() {
        a();
        com.amazon.aps.iva.vb0.f.L(new File(this.a));
        com.amazon.aps.iva.mf0.a.a.a("Removed all", new Object[0]);
    }

    @Override // com.ellation.crunchyroll.downloading.z
    public final void c(com.amazon.aps.iva.xb0.l<? super z.a, Boolean> lVar) {
        this.c.b(lVar, a.h);
    }

    @Override // com.ellation.crunchyroll.downloading.z
    public final void d(com.amazon.aps.iva.sw.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "toDownload");
        g(bVar, new b(bVar), new c(bVar));
        g(bVar, new d(bVar), new e(bVar));
        g(bVar, new f(bVar), new g(bVar));
    }

    @Override // com.ellation.crunchyroll.downloading.z
    public final void e(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "parentId");
        com.amazon.aps.iva.vb0.f.L(new File(com.amazon.aps.iva.n4.a.a(new StringBuilder(), this.a, "/", str)));
        com.amazon.aps.iva.mf0.a.a.a("Removed ".concat(str), new Object[0]);
    }

    public final void g(com.amazon.aps.iva.sw.b bVar, com.amazon.aps.iva.xb0.a<Images> aVar, com.amazon.aps.iva.xb0.a<String> aVar2) {
        String str;
        Images invoke = aVar.invoke();
        Iterator it = com.amazon.aps.iva.lb0.o.O(new Image[]{f(invoke.getPostersTall()), f(invoke.getPostersWide()), f(invoke.getChannelLogoMarkSimple()), f(invoke.getThumbnails())}).iterator();
        while (it.hasNext()) {
            Image image = (Image) it.next();
            com.amazon.aps.iva.yb0.j.f(bVar, "<this>");
            String id = bVar.e.getId();
            Season season = bVar.d;
            if (season != null) {
                str = season.getId();
            } else {
                str = null;
            }
            z.a aVar3 = new z.a(id, str, bVar.b.getId());
            String url = image.getUrl();
            com.amazon.aps.iva.yb0.j.c(url);
            String invoke2 = aVar2.invoke();
            String valueOf = String.valueOf(url.hashCode());
            com.amazon.aps.iva.yb0.j.f(invoke2, "parentId");
            File file = new File(com.amazon.aps.iva.n4.a.a(new StringBuilder(), this.a, "/", invoke2), valueOf);
            if (!file.exists()) {
                this.c.c(aVar3, url, file, new c0(this, valueOf, invoke2, file, aVar3, url), b2.h);
            }
        }
    }
}
