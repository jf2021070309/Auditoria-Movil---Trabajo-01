package com.ellation.crunchyroll.downloading;

import com.amazon.aps.iva.qw.g;
import com.ellation.crunchyroll.downloading.a;
import com.ellation.crunchyroll.downloading.queue.LocalVideosManagerQueue;
import com.ellation.crunchyroll.downloading.z;
import com.ellation.crunchyroll.model.Episode;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.ArrayList;
import java.util.List;
/* compiled from: InternalDownloadsManager.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsManagerImpl$removeSeason$1", f = "InternalDownloadsManager.kt", l = {374, 380}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class q extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public List h;
    public int i;
    public final /* synthetic */ DownloadsManagerImpl j;
    public final /* synthetic */ String k;
    public final /* synthetic */ String l;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> m;

    /* compiled from: InternalDownloadsManager.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<g0, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ List<PlayableAsset> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends PlayableAsset> list) {
            super(1);
            this.h = list;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(g0 g0Var) {
            g0 g0Var2 = g0Var;
            com.amazon.aps.iva.yb0.j.f(g0Var2, "$this$notify");
            g0Var2.z1(this.h);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: InternalDownloadsManager.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<z.a, Boolean> {
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.h = str;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(z.a aVar) {
            z.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "it");
            return Boolean.valueOf(com.amazon.aps.iva.yb0.j.a(aVar2.b, this.h));
        }
    }

    /* compiled from: InternalDownloadsManager.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<g.a, Boolean> {
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.h = str;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(g.a aVar) {
            g.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "it");
            return Boolean.valueOf(com.amazon.aps.iva.yb0.j.a(aVar2.b, this.h));
        }
    }

    /* compiled from: InternalDownloadsManager.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<g.a, Boolean> {
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(1);
            this.h = str;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(g.a aVar) {
            g.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "it");
            return Boolean.valueOf(com.amazon.aps.iva.yb0.j.a(aVar2.b, this.h));
        }
    }

    /* compiled from: InternalDownloadsManager.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<a.C0962a, Boolean> {
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(1);
            this.h = str;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(a.C0962a c0962a) {
            a.C0962a c0962a2 = c0962a;
            com.amazon.aps.iva.yb0.j.f(c0962a2, "it");
            return Boolean.valueOf(com.amazon.aps.iva.yb0.j.a(c0962a2.c, this.h));
        }
    }

    /* compiled from: InternalDownloadsManager.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Episode, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ DownloadsManagerImpl h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(DownloadsManagerImpl downloadsManagerImpl) {
            super(1);
            this.h = downloadsManagerImpl;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Episode episode) {
            Episode episode2 = episode;
            com.amazon.aps.iva.yb0.j.f(episode2, "it");
            this.h.z(episode2.getId());
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: InternalDownloadsManager.kt */
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Episode, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ DownloadsManagerImpl h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(DownloadsManagerImpl downloadsManagerImpl) {
            super(1);
            this.h = downloadsManagerImpl;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Episode episode) {
            Episode episode2 = episode;
            com.amazon.aps.iva.yb0.j.f(episode2, "it");
            DownloadsManagerImpl.i(this.h, episode2.getId());
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: InternalDownloadsManager.kt */
    /* loaded from: classes2.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<String, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ DownloadsManagerImpl h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(DownloadsManagerImpl downloadsManagerImpl) {
            super(1);
            this.h = downloadsManagerImpl;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(String str) {
            String str2 = str;
            com.amazon.aps.iva.yb0.j.f(str2, "it");
            this.h.z(str2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: InternalDownloadsManager.kt */
    /* loaded from: classes2.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<String, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ DownloadsManagerImpl h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(DownloadsManagerImpl downloadsManagerImpl) {
            super(1);
            this.h = downloadsManagerImpl;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(String str) {
            String str2 = str;
            com.amazon.aps.iva.yb0.j.f(str2, "it");
            DownloadsManagerImpl.i(this.h, str2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(DownloadsManagerImpl downloadsManagerImpl, String str, String str2, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        super(2, dVar);
        this.j = downloadsManagerImpl;
        this.k = str;
        this.l = str2;
        this.m = aVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new q(this.j, this.k, this.l, this.m, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((q) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        List list;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i2 = this.i;
        String str = this.l;
        DownloadsManagerImpl downloadsManagerImpl = this.j;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    list = this.h;
                    com.amazon.aps.iva.ab.x.i0(obj);
                    downloadsManagerImpl.l.F1(str, new h(downloadsManagerImpl), new i(downloadsManagerImpl));
                    this.m.invoke();
                    downloadsManagerImpl.notify(new a(list));
                    return com.amazon.aps.iva.kb0.q.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.amazon.aps.iva.ab.x.i0(obj);
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            this.i = 1;
            obj = downloadsManagerImpl.C(this.k, str, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        List list2 = (List) obj;
        LocalVideosManagerQueue localVideosManagerQueue = downloadsManagerImpl.l;
        List<PlayableAsset> list3 = list2;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list3));
        for (PlayableAsset playableAsset : list3) {
            arrayList.add(playableAsset.getId());
        }
        localVideosManagerQueue.p1(arrayList);
        downloadsManagerImpl.i.c(new b(str));
        downloadsManagerImpl.f.d(new c(str));
        downloadsManagerImpl.g.d(new d(str));
        downloadsManagerImpl.h.d(new e(str));
        f fVar = new f(downloadsManagerImpl);
        g gVar = new g(downloadsManagerImpl);
        this.h = list2;
        this.i = 2;
        if (downloadsManagerImpl.b.A(str, fVar, gVar, this) == aVar) {
            return aVar;
        }
        list = list2;
        downloadsManagerImpl.l.F1(str, new h(downloadsManagerImpl), new i(downloadsManagerImpl));
        this.m.invoke();
        downloadsManagerImpl.notify(new a(list));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
