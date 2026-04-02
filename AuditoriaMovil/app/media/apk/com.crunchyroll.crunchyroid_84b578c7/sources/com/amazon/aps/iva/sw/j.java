package com.amazon.aps.iva.sw;

import com.amazon.aps.iva.ab.t;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.d2;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.api.cms.model.streams.Stream;
import com.ellation.crunchyroll.api.cms.model.streams.Streams;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: ToDownloadInteractor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.todownload.ToDownloadInteractorImpl$prepareStreams$1", f = "ToDownloadInteractor.kt", l = {140}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public int h;
    public final /* synthetic */ e i;
    public final /* synthetic */ PlayableAsset j;
    public final /* synthetic */ l<Throwable, q> k;
    public final /* synthetic */ com.amazon.aps.iva.xb0.q<PlayableAsset, Streams, Stream, q> l;

    /* compiled from: ToDownloadInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.todownload.ToDownloadInteractorImpl$prepareStreams$1$1", f = "ToDownloadInteractor.kt", l = {142, 143, 164}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public PlayableAsset h;
        public int i;
        public final /* synthetic */ e j;
        public final /* synthetic */ PlayableAsset k;
        public final /* synthetic */ l<Throwable, q> l;
        public final /* synthetic */ com.amazon.aps.iva.xb0.q<PlayableAsset, Streams, Stream, q> m;

        /* compiled from: ToDownloadInteractor.kt */
        /* renamed from: com.amazon.aps.iva.sw.j$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0720a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
            public final /* synthetic */ e h;
            public final /* synthetic */ PlayableAsset i;
            public final /* synthetic */ Streams j;
            public final /* synthetic */ l<Throwable, q> k;
            public final /* synthetic */ com.amazon.aps.iva.xb0.q<PlayableAsset, Streams, Stream, q> l;
            public final /* synthetic */ Stream m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0720a(e eVar, PlayableAsset playableAsset, Streams streams, l<? super Throwable, q> lVar, com.amazon.aps.iva.xb0.q<? super PlayableAsset, ? super Streams, ? super Stream, q> qVar, Stream stream) {
                super(0);
                this.h = eVar;
                this.i = playableAsset;
                this.j = streams;
                this.k = lVar;
                this.l = qVar;
                this.m = stream;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final q invoke() {
                com.amazon.aps.iva.qw.g gVar = this.h.d;
                com.amazon.aps.iva.xb0.q<PlayableAsset, Streams, Stream, q> qVar = this.l;
                PlayableAsset playableAsset = this.i;
                Streams streams = this.j;
                gVar.e(playableAsset, streams, new i(qVar, playableAsset, streams, this.m), this.k);
                return q.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e eVar, PlayableAsset playableAsset, l<? super Throwable, q> lVar, com.amazon.aps.iva.xb0.q<? super PlayableAsset, ? super Streams, ? super Stream, q> qVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = eVar;
            this.k = playableAsset;
            this.l = lVar;
            this.m = qVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.j, this.k, this.l, this.m, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x00cc  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00d3 A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #2 {all -> 0x00c4, blocks: (B:35:0x00c1, B:42:0x00d3, B:32:0x00a7), top: B:56:0x00a7 }] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.amazon.aps.iva.qb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 234
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sw.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(e eVar, PlayableAsset playableAsset, l<? super Throwable, q> lVar, com.amazon.aps.iva.xb0.q<? super PlayableAsset, ? super Streams, ? super Stream, q> qVar, com.amazon.aps.iva.ob0.d<? super j> dVar) {
        super(2, dVar);
        this.i = eVar;
        this.j = playableAsset;
        this.k = lVar;
        this.l = qVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new j(this.i, this.j, this.k, this.l, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((j) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i == 1) {
                x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            x.i0(obj);
            a aVar2 = new a(this.i, this.j, this.k, this.l, null);
            this.h = 1;
            d2 d2Var = new d2(getContext(), this, 0);
            if (t.u(d2Var, d2Var, aVar2) == aVar) {
                return aVar;
            }
        }
        return q.a;
    }
}
