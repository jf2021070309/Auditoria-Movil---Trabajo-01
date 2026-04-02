package com.amazon.aps.iva.qz;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.f00.b0;
import com.amazon.aps.iva.f00.r;
import com.amazon.aps.iva.f00.y;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.l40.t1;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.lb0.o;
import com.amazon.aps.iva.lb0.u;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.c2;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.ue0.h;
import com.amazon.aps.iva.ue0.s;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.downloading.presentation.download.button.DownloadButtonState;
import com.ellation.crunchyroll.api.cms.model.Season;
import com.ellation.crunchyroll.model.Episode;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: AssetListViewModel.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.ez.b implements com.amazon.aps.iva.qz.b {
    public final r b;
    public final com.amazon.aps.iva.o40.c c;
    public final v<g<com.amazon.aps.iva.qz.a>> d;
    public com.amazon.aps.iva.i00.a e;
    public c2 f;
    public c2 g;
    public final com.amazon.aps.iva.ue0.a h;

    /* compiled from: AssetListViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.assets.AssetListViewModelImpl$1", f = "AssetListViewModel.kt", l = {271}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public c h;
        public s i;
        public h j;
        public int k;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0042 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0053 A[Catch: all -> 0x0082, TryCatch #1 {all -> 0x0082, blocks: (B:18:0x004a, B:20:0x0053, B:22:0x005f, B:24:0x0069, B:26:0x006d, B:28:0x0071), top: B:42:0x004a }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
        /* JADX WARN: Type inference failed for: r1v6, types: [com.amazon.aps.iva.ue0.h] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0043 -> B:42:0x004a). Please submit an issue!!! */
        @Override // com.amazon.aps.iva.qb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r1 = r13.k
                r2 = 1
                if (r1 == 0) goto L23
                if (r1 != r2) goto L1b
                com.amazon.aps.iva.ue0.h r1 = r13.j
                com.amazon.aps.iva.ue0.s r3 = r13.i
                com.amazon.aps.iva.qz.c r4 = r13.h
                com.amazon.aps.iva.ab.x.i0(r14)     // Catch: java.lang.Throwable -> L18
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r13
                goto L4a
            L18:
                r14 = move-exception
                goto L90
            L1b:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L23:
                com.amazon.aps.iva.ab.x.i0(r14)
                com.amazon.aps.iva.qz.c r14 = com.amazon.aps.iva.qz.c.this
                com.amazon.aps.iva.ue0.a r3 = r14.h
                r3.getClass()     // Catch: java.lang.Throwable -> L18
                com.amazon.aps.iva.ue0.a$a r1 = new com.amazon.aps.iva.ue0.a$a     // Catch: java.lang.Throwable -> L18
                r1.<init>(r3)     // Catch: java.lang.Throwable -> L18
                r4 = r14
                r14 = r13
            L34:
                r14.h = r4     // Catch: java.lang.Throwable -> L18
                r14.i = r3     // Catch: java.lang.Throwable -> L18
                r14.j = r1     // Catch: java.lang.Throwable -> L18
                r14.k = r2     // Catch: java.lang.Throwable -> L18
                java.lang.Object r5 = r1.a(r14)     // Catch: java.lang.Throwable -> L18
                if (r5 != r0) goto L43
                return r0
            L43:
                r12 = r0
                r0 = r14
                r14 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r12
            L4a:
                java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch: java.lang.Throwable -> L82
                boolean r14 = r14.booleanValue()     // Catch: java.lang.Throwable -> L82
                r6 = 0
                if (r14 == 0) goto L8a
                java.lang.Object r14 = r3.next()     // Catch: java.lang.Throwable -> L82
                java.util.List r14 = (java.util.List) r14     // Catch: java.lang.Throwable -> L82
                com.amazon.aps.iva.qz.a r7 = r5.Q8()     // Catch: java.lang.Throwable -> L82
                if (r7 == 0) goto L84
                com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.qz.a>> r8 = r5.d     // Catch: java.lang.Throwable -> L82
                com.amazon.aps.iva.ez.g$c r9 = new com.amazon.aps.iva.ez.g$c     // Catch: java.lang.Throwable -> L82
                com.amazon.aps.iva.qz.a r10 = r5.Q8()     // Catch: java.lang.Throwable -> L82
                if (r10 == 0) goto L70
                com.amazon.aps.iva.e00.a r10 = r10.a     // Catch: java.lang.Throwable -> L82
                if (r10 == 0) goto L70
                java.util.List<com.ellation.crunchyroll.model.PlayableAsset> r10 = r10.a     // Catch: java.lang.Throwable -> L82
                goto L71
            L70:
                r10 = r6
            L71:
                java.util.List<com.amazon.aps.iva.f00.a> r11 = r7.b     // Catch: java.lang.Throwable -> L82
                java.util.ArrayList r14 = com.amazon.aps.iva.gr.n.G(r11, r14, r10)     // Catch: java.lang.Throwable -> L82
                com.amazon.aps.iva.qz.a r14 = com.amazon.aps.iva.qz.a.a(r7, r14)     // Catch: java.lang.Throwable -> L82
                r9.<init>(r14, r6)     // Catch: java.lang.Throwable -> L82
                r8.k(r9)     // Catch: java.lang.Throwable -> L82
                goto L84
            L82:
                r14 = move-exception
                goto L91
            L84:
                r14 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L34
            L8a:
                com.amazon.aps.iva.ee0.f1.n(r4, r6)
                com.amazon.aps.iva.kb0.q r14 = com.amazon.aps.iva.kb0.q.a
                return r14
            L90:
                r4 = r3
            L91:
                throw r14     // Catch: java.lang.Throwable -> L92
            L92:
                r0 = move-exception
                com.amazon.aps.iva.ee0.f1.n(r4, r14)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.qz.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: AssetListViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.assets.AssetListViewModelImpl", f = "AssetListViewModel.kt", l = {162}, m = "applyEmptyCards")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.c {
        public v h;
        public /* synthetic */ Object i;
        public int k;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return c.this.P8(this);
        }
    }

    /* compiled from: AssetListViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.assets.AssetListViewModelImpl$loadAssets$1", f = "AssetListViewModel.kt", l = {128, 131, 134, 139}, m = "invokeSuspend")
    /* renamed from: com.amazon.aps.iva.qz.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0658c extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public v h;
        public int i;
        public /* synthetic */ Object j;
        public final /* synthetic */ boolean l;
        public final /* synthetic */ Season m;
        public final /* synthetic */ boolean n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0658c(boolean z, Season season, boolean z2, com.amazon.aps.iva.ob0.d<? super C0658c> dVar) {
            super(2, dVar);
            this.l = z;
            this.m = season;
            this.n = z2;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            C0658c c0658c = new C0658c(this.l, this.m, this.n, dVar);
            c0658c.j = obj;
            return c0658c;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((C0658c) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:1|(1:(1:(1:(1:(8:7|8|9|10|11|(1:17)|18|19)(2:24|25))(7:26|27|28|29|(1:31)|32|(1:34)(6:35|10|11|(3:13|15|17)|18|19)))(5:39|40|41|42|(1:44)(5:45|29|(0)|32|(0)(0))))(1:49))(2:55|(2:57|(1:59)))|50|(2:52|(1:54))|40|41|42|(0)(0)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00c1, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00c2, code lost:
            r0 = r10;
            r10 = r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0085 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0099 A[Catch: all -> 0x0036, TryCatch #2 {all -> 0x0036, blocks: (B:16:0x0032, B:37:0x0089, B:39:0x0099, B:40:0x009c), top: B:62:0x0032 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00b5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00d1  */
        @Override // com.amazon.aps.iva.qb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 238
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.qz.c.C0658c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: AssetListViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.assets.AssetListViewModelImpl$onAssetDownloadStateUpdated$1", f = "AssetListViewModel.kt", l = {117}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public final /* synthetic */ com.amazon.aps.iva.qg.b[] j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.amazon.aps.iva.qg.b[] bVarArr, com.amazon.aps.iva.ob0.d<? super d> dVar) {
            super(2, dVar);
            this.j = bVarArr;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new d(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((d) create(g0Var, dVar)).invokeSuspend(q.a);
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
                com.amazon.aps.iva.ue0.a aVar2 = c.this.h;
                List b0 = o.b0(this.j);
                this.h = 1;
                if (aVar2.g(b0, this) == aVar) {
                    return aVar;
                }
            }
            return q.a;
        }
    }

    /* compiled from: AssetListViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.assets.AssetListViewModelImpl$onBulkDownloadUpdate$1", f = "AssetListViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public final /* synthetic */ com.amazon.aps.iva.hg.c i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.amazon.aps.iva.hg.c cVar, com.amazon.aps.iva.ob0.d<? super e> dVar) {
            super(2, dVar);
            this.i = cVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new e(this.i, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((e) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            x.i0(obj);
            c cVar = c.this;
            com.amazon.aps.iva.qz.a Q8 = cVar.Q8();
            if (Q8 != null) {
                v<g<com.amazon.aps.iva.qz.a>> vVar = cVar.d;
                List<com.amazon.aps.iva.f00.a> list = Q8.b;
                j.f(list, "<this>");
                List<com.amazon.aps.iva.f00.a> list2 = list;
                ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
                for (com.amazon.aps.iva.f00.a aVar2 : list2) {
                    if (aVar2 instanceof com.amazon.aps.iva.f00.b) {
                        String str = ((com.amazon.aps.iva.f00.b) aVar2).c;
                        j.f(str, "adapterId");
                        aVar2 = new com.amazon.aps.iva.f00.b(this.i, str);
                    }
                    arrayList.add(aVar2);
                }
                vVar.k(new g.c(com.amazon.aps.iva.qz.a.a(Q8, arrayList), null));
            }
            return q.a;
        }
    }

    /* compiled from: AssetListViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.assets.AssetListViewModelImpl$onSortSelected$1", f = "AssetListViewModel.kt", l = {184}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;

        public f(com.amazon.aps.iva.ob0.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new f(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((f) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            boolean z;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            c cVar = c.this;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                c2 c2Var = cVar.f;
                if (c2Var != null) {
                    this.h = 1;
                    if (c2Var.N(this) == aVar) {
                        return aVar;
                    }
                }
            }
            com.amazon.aps.iva.qz.a Q8 = cVar.Q8();
            if (Q8 != null) {
                v<g<com.amazon.aps.iva.qz.a>> vVar = cVar.d;
                List<com.amazon.aps.iva.f00.a> list = Q8.b;
                j.f(list, "<this>");
                ArrayList C = l1.C(list);
                List<com.amazon.aps.iva.f00.a> list2 = list;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    com.amazon.aps.iva.f00.a aVar2 = (com.amazon.aps.iva.f00.a) obj2;
                    if (!(aVar2 instanceof com.amazon.aps.iva.f00.g) && !(aVar2 instanceof com.amazon.aps.iva.f00.b) && !(aVar2 instanceof com.amazon.aps.iva.f00.v) && !(aVar2 instanceof y) && !(aVar2 instanceof b0)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList L0 = com.amazon.aps.iva.lb0.x.L0(com.amazon.aps.iva.lb0.x.N0(arrayList), C);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    if (obj3 instanceof y) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList L02 = com.amazon.aps.iva.lb0.x.L0(arrayList2, L0);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list2) {
                    if (obj4 instanceof b0) {
                        arrayList3.add(obj4);
                    }
                }
                vVar.k(new g.c(com.amazon.aps.iva.qz.a.a(Q8, com.amazon.aps.iva.lb0.x.L0(arrayList3, L02)), null));
            }
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r rVar, com.amazon.aps.iva.o40.c cVar) {
        super(cVar);
        j.f(rVar, "assetUiModelFactory");
        j.f(cVar, "showContentInteractor");
        this.b = rVar;
        this.c = cVar;
        this.d = new v<>();
        this.e = com.amazon.aps.iva.i00.a.OLDEST;
        this.h = com.amazon.aps.iva.dg.b.c(0, null, 7);
        com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new a(null), 3);
    }

    public static final ArrayList N8(c cVar, List list, List list2) {
        cVar.getClass();
        ArrayList j0 = u.j0(list2, com.amazon.aps.iva.f00.q.class);
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(j0));
        Iterator it = j0.iterator();
        while (it.hasNext()) {
            com.amazon.aps.iva.f00.q qVar = (com.amazon.aps.iva.f00.q) it.next();
            arrayList.add(new com.amazon.aps.iva.kb0.j(qVar.b, qVar.p));
        }
        Map Z = i0.Z(arrayList);
        List<com.amazon.aps.iva.f00.a> list3 = list;
        ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list3));
        for (com.amazon.aps.iva.f00.a aVar : list3) {
            if (aVar instanceof com.amazon.aps.iva.f00.q) {
                com.amazon.aps.iva.f00.q qVar2 = (com.amazon.aps.iva.f00.q) aVar;
                DownloadButtonState downloadButtonState = (DownloadButtonState) Z.get(qVar2.b);
                if (downloadButtonState == null) {
                    downloadButtonState = DownloadButtonState.NotStarted.c;
                }
                j.f(downloadButtonState, "<set-?>");
                qVar2.p = downloadButtonState;
            }
            arrayList2.add(aVar);
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O8(com.amazon.aps.iva.qz.c r6, com.ellation.crunchyroll.api.cms.model.Season r7, com.amazon.aps.iva.ob0.d r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof com.amazon.aps.iva.qz.d
            if (r0 == 0) goto L16
            r0 = r8
            com.amazon.aps.iva.qz.d r0 = (com.amazon.aps.iva.qz.d) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.l = r1
            goto L1b
        L16:
            com.amazon.aps.iva.qz.d r0 = new com.amazon.aps.iva.qz.d
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            goto L35
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L7f
        L39:
            com.ellation.crunchyroll.api.cms.model.Season r7 = r0.i
            com.amazon.aps.iva.qz.c r6 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L53
        L41:
            com.amazon.aps.iva.ab.x.i0(r8)
            r0.h = r6
            r0.i = r7
            r0.l = r5
            com.amazon.aps.iva.o40.c r8 = r6.c
            java.io.Serializable r8 = r8.f(r0)
            if (r8 != r1) goto L53
            goto L87
        L53:
            com.ellation.crunchyroll.model.ContentContainer r8 = (com.ellation.crunchyroll.model.ContentContainer) r8
            boolean r2 = r8 instanceof com.ellation.crunchyroll.model.Series
            r5 = 0
            if (r2 == 0) goto L6c
            com.amazon.aps.iva.o40.c r6 = r6.c
            com.amazon.aps.iva.yb0.j.c(r7)
            r0.h = r5
            r0.i = r5
            r0.l = r4
            java.lang.Object r8 = r6.b1(r7, r0)
            if (r8 != r1) goto L7f
            goto L87
        L6c:
            boolean r7 = r8 instanceof com.ellation.crunchyroll.model.MovieListing
            if (r7 == 0) goto L81
            com.amazon.aps.iva.o40.c r6 = r6.c
            r0.h = r5
            r0.i = r5
            r0.l = r3
            java.lang.Object r8 = r6.g(r8, r0)
            if (r8 != r1) goto L7f
            goto L87
        L7f:
            r1 = r8
            goto L87
        L81:
            com.amazon.aps.iva.e00.a r1 = new com.amazon.aps.iva.e00.a
            r6 = 7
            r1.<init>(r5, r5, r6)
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.qz.c.O8(com.amazon.aps.iva.qz.c, com.ellation.crunchyroll.api.cms.model.Season, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.qg.a
    public final void G2(String str) {
        j.f(str, "assetId");
    }

    @Override // com.amazon.aps.iva.qz.b
    public final com.amazon.aps.iva.i00.a I() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.qz.b
    public final void L4(com.amazon.aps.iva.qz.a aVar) {
        j.f(aVar, "currentListModel");
        this.d.k(new g.c(aVar, null));
    }

    @Override // com.amazon.aps.iva.qz.b
    public final com.amazon.aps.iva.hg.g P() {
        List list;
        Map map;
        Episode episode;
        g.c<com.amazon.aps.iva.qz.a> a2;
        com.amazon.aps.iva.qz.a aVar;
        com.amazon.aps.iva.e00.a aVar2;
        g.c<com.amazon.aps.iva.qz.a> a3;
        com.amazon.aps.iva.qz.a aVar3;
        com.amazon.aps.iva.e00.a aVar4;
        v<g<com.amazon.aps.iva.qz.a>> vVar = this.d;
        g<com.amazon.aps.iva.qz.a> d2 = vVar.d();
        if (d2 == null || (a3 = d2.a()) == null || (aVar3 = a3.a) == null || (aVar4 = aVar3.a) == null || (list = aVar4.a) == null) {
            list = z.b;
        }
        g<com.amazon.aps.iva.qz.a> d3 = vVar.d();
        if (d3 == null || (a2 = d3.a()) == null || (aVar = a2.a) == null || (aVar2 = aVar.a) == null || (map = aVar2.b) == null) {
            map = a0.b;
        }
        String str = null;
        if (list.isEmpty()) {
            return null;
        }
        String parentId = ((PlayableAsset) com.amazon.aps.iva.lb0.x.t0(list)).getParentId();
        Object v0 = com.amazon.aps.iva.lb0.x.v0(list);
        if (v0 instanceof Episode) {
            episode = (Episode) v0;
        } else {
            episode = null;
        }
        if (episode != null) {
            str = episode.getSeasonId();
        }
        return new com.amazon.aps.iva.hg.g(parentId, str, list, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P8(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.amazon.aps.iva.qz.c.b
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.aps.iva.qz.c$b r0 = (com.amazon.aps.iva.qz.c.b) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.qz.c$b r0 = new com.amazon.aps.iva.qz.c$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.amazon.aps.iva.i5.v r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L4a
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            com.amazon.aps.iva.ab.x.i0(r8)
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.qz.a>> r8 = r7.d
            com.amazon.aps.iva.lb0.z r2 = com.amazon.aps.iva.lb0.z.b
            com.amazon.aps.iva.lb0.a0 r4 = com.amazon.aps.iva.lb0.a0.b
            r0.h = r8
            r0.k = r3
            com.amazon.aps.iva.f00.r r5 = r7.b
            java.lang.Object r0 = r5.d(r2, r4, r4, r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r6 = r0
            r0 = r8
            r8 = r6
        L4a:
            java.util.List r8 = (java.util.List) r8
            com.amazon.aps.iva.qz.a r1 = new com.amazon.aps.iva.qz.a
            r1.<init>(r8, r3)
            com.amazon.aps.iva.ez.g$c r8 = new com.amazon.aps.iva.ez.g$c
            r2 = 0
            r8.<init>(r1, r2)
            r0.k(r8)
            com.amazon.aps.iva.kb0.q r8 = com.amazon.aps.iva.kb0.q.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.qz.c.P8(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    public final com.amazon.aps.iva.qz.a Q8() {
        g.c<com.amazon.aps.iva.qz.a> a2;
        g<com.amazon.aps.iva.qz.a> d2 = this.d.d();
        if (d2 != null && (a2 = d2.a()) != null) {
            return a2.a;
        }
        return null;
    }

    @Override // com.amazon.aps.iva.qg.a
    public final void X6(com.amazon.aps.iva.qg.b... bVarArr) {
        j.f(bVarArr, "states");
        com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new d(bVarArr, null), 3);
    }

    @Override // com.amazon.aps.iva.qz.b
    public final void Y(com.amazon.aps.iva.hg.c cVar) {
        j.f(cVar, "status");
        this.g = com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new e(cVar, null), 3);
    }

    @Override // com.amazon.aps.iva.qz.b
    public final Object e3(t1 t1Var) {
        Object P8 = P8(t1Var);
        if (P8 != com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return q.a;
        }
        return P8;
    }

    @Override // com.amazon.aps.iva.qz.b
    public final v o6() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.qz.b
    public final void q(com.amazon.aps.iva.i00.a aVar) {
        if (this.e == aVar) {
            return;
        }
        this.e = aVar;
        com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new f(null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    @Override // com.amazon.aps.iva.qz.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q8(java.util.ArrayList r10, com.amazon.aps.iva.l40.w1 r11, com.amazon.aps.iva.l40.x1 r12) {
        /*
            r9 = this;
            com.amazon.aps.iva.qz.a r0 = r9.Q8()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L42
            com.amazon.aps.iva.e00.a r0 = r0.a
            if (r0 == 0) goto L42
            java.util.List<com.ellation.crunchyroll.model.PlayableAsset> r0 = r0.a
            if (r0 == 0) goto L42
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = com.amazon.aps.iva.lb0.r.Y(r0)
            r3.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L1f:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L33
            java.lang.Object r4 = r0.next()
            com.ellation.crunchyroll.model.PlayableAsset r4 = (com.ellation.crunchyroll.model.PlayableAsset) r4
            java.lang.String r4 = r4.getId()
            r3.add(r4)
            goto L1f
        L33:
            java.util.Set r0 = com.amazon.aps.iva.lb0.x.y0(r3, r10)
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r2
            if (r0 != r2) goto L42
            r0 = r2
            goto L43
        L42:
            r0 = r1
        L43:
            com.amazon.aps.iva.qz.a r3 = r9.Q8()
            if (r3 == 0) goto La9
            com.amazon.aps.iva.e00.a r3 = r3.a
            if (r3 == 0) goto La9
            java.util.List<com.ellation.crunchyroll.model.PlayableAsset> r3 = r3.a
            if (r3 == 0) goto La9
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L5c:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L9b
            java.lang.Object r5 = r3.next()
            com.ellation.crunchyroll.model.PlayableAsset r5 = (com.ellation.crunchyroll.model.PlayableAsset) r5
            java.util.List r6 = r5.getVersions()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = com.amazon.aps.iva.lb0.r.Y(r6)
            r7.<init>(r8)
            java.util.Iterator r6 = r6.iterator()
        L7b:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L8f
            java.lang.Object r8 = r6.next()
            com.ellation.crunchyroll.model.PlayableAssetVersion r8 = (com.ellation.crunchyroll.model.PlayableAssetVersion) r8
            java.lang.String r8 = r8.getAssetId()
            r7.add(r8)
            goto L7b
        L8f:
            java.lang.String r5 = r5.getId()
            java.util.ArrayList r5 = com.amazon.aps.iva.lb0.x.G0(r7, r5)
            com.amazon.aps.iva.lb0.t.d0(r4, r5)
            goto L5c
        L9b:
            java.util.Set r10 = com.amazon.aps.iva.lb0.x.y0(r4, r10)
            java.util.Collection r10 = (java.util.Collection) r10
            boolean r10 = r10.isEmpty()
            r10 = r10 ^ r2
            if (r10 != r2) goto La9
            r1 = r2
        La9:
            if (r0 == 0) goto Lbd
            com.amazon.aps.iva.se0.g0 r10 = com.amazon.aps.iva.e.w.D(r9)
            com.amazon.aps.iva.qz.e r12 = new com.amazon.aps.iva.qz.e
            r0 = 0
            r12.<init>(r9, r0)
            r1 = 3
            com.amazon.aps.iva.se0.i.d(r10, r0, r0, r12, r1)
            r11.invoke()
            goto Lc2
        Lbd:
            if (r1 == 0) goto Lc2
            r12.invoke()
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.qz.c.q8(java.util.ArrayList, com.amazon.aps.iva.l40.w1, com.amazon.aps.iva.l40.x1):void");
    }

    @Override // com.amazon.aps.iva.qz.b
    public final void r1(Season season, boolean z, boolean z2) {
        c2 c2Var = this.f;
        if (c2Var != null) {
            c2Var.a(null);
        }
        this.f = com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new C0658c(z, season, z2, null), 3);
    }
}
