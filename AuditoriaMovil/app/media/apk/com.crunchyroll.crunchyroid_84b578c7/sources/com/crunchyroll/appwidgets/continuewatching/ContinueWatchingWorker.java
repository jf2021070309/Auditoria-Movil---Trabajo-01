package com.crunchyroll.appwidgets.continuewatching;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.dd.h;
import com.amazon.aps.iva.ec.f;
import com.amazon.aps.iva.ec.g;
import com.amazon.aps.iva.gd0.j;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.api.model.ContinueWatchingPanel;
import com.ellation.crunchyroll.model.Panel;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ContinueWatchingWorker.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/crunchyroll/appwidgets/continuewatching/ContinueWatchingWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "app-widgets_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ContinueWatchingWorker extends CoroutineWorker {
    public final Context e;
    public final m f;

    /* compiled from: ContinueWatchingWorker.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.appwidgets.continuewatching.ContinueWatchingWorker", f = "ContinueWatchingWorker.kt", l = {61, 63, 71, 77, 82, 73, 108, 116}, m = "doWork")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public ContinueWatchingWorker h;
        public List i;
        public Object j;
        public Object k;
        public ContinueWatchingPanel l;
        public Panel m;
        public String n;
        public String o;
        public ContinueWatchingWorker p;
        public List q;
        public Collection r;
        public /* synthetic */ Object s;
        public int u;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.s = obj;
            this.u |= Integer.MIN_VALUE;
            return ContinueWatchingWorker.this.a(this);
        }
    }

    /* compiled from: ContinueWatchingWorker.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.appwidgets.continuewatching.ContinueWatchingWorker$doWork$2$1$1", f = "ContinueWatchingWorker.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super File>, Object> {
        public final /* synthetic */ Panel i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Panel panel, com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
            this.i = panel;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(this.i, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super File> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            x.i0(obj);
            Context context = ContinueWatchingWorker.this.e;
            g b = com.bumptech.glide.a.b(context).b(context);
            b.getClass();
            f fVar = new f(b.b, b, File.class, b.c);
            if (h.B == null) {
                h s = new h().s(true);
                if (s.u && !s.w) {
                    throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
                }
                s.w = true;
                s.u = true;
                h.B = s;
            }
            f y = fVar.y(h.B);
            Image image = (Image) com.amazon.aps.iva.lb0.x.v0(this.i.getContinueWatchingImages());
            f E = y.E((image == null || (r0 = image.getUrl()) == null) ? "" : "");
            E.getClass();
            com.amazon.aps.iva.dd.f fVar2 = new com.amazon.aps.iva.dd.f();
            E.C(fVar2, fVar2, E, com.amazon.aps.iva.hd.e.b);
            return fVar2.get();
        }
    }

    /* compiled from: ContinueWatchingWorker.kt */
    /* loaded from: classes.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.td.a> {
        public static final c h = new c();

        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.td.a invoke() {
            com.amazon.aps.iva.rd.e eVar = j.e;
            if (eVar != null) {
                EtpContentService etpContentService = eVar.getEtpContentService();
                com.amazon.aps.iva.yb0.j.f(etpContentService, "etpContentService");
                return new com.amazon.aps.iva.td.b(etpContentService);
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: ContinueWatchingWorker.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.appwidgets.continuewatching.ContinueWatchingWorker", f = "ContinueWatchingWorker.kt", l = {123, 132}, m = "setWidgetState")
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.qb0.c {
        public ContinueWatchingWorker h;
        public com.crunchyroll.appwidgets.continuewatching.a i;
        public Iterator j;
        public /* synthetic */ Object k;
        public int m;

        public d(com.amazon.aps.iva.ob0.d<? super d> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.k = obj;
            this.m |= Integer.MIN_VALUE;
            return ContinueWatchingWorker.this.b(null, null, this);
        }
    }

    /* compiled from: ContinueWatchingWorker.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.appwidgets.continuewatching.ContinueWatchingWorker$setWidgetState$2$1", f = "ContinueWatchingWorker.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends i implements p<com.crunchyroll.appwidgets.continuewatching.a, com.amazon.aps.iva.ob0.d<? super com.crunchyroll.appwidgets.continuewatching.a>, Object> {
        public final /* synthetic */ com.crunchyroll.appwidgets.continuewatching.a h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.crunchyroll.appwidgets.continuewatching.a aVar, com.amazon.aps.iva.ob0.d<? super e> dVar) {
            super(2, dVar);
            this.h = aVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new e(this.h, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.crunchyroll.appwidgets.continuewatching.a aVar, com.amazon.aps.iva.ob0.d<? super com.crunchyroll.appwidgets.continuewatching.a> dVar) {
            return ((e) create(aVar, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            x.i0(obj);
            return this.h;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContinueWatchingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(workerParameters, "workerParameters");
        this.e = context;
        this.f = com.amazon.aps.iva.kb0.f.b(c.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0149 A[Catch: IOException -> 0x006e, TRY_LEAVE, TryCatch #3 {IOException -> 0x006e, blocks: (B:18:0x0065, B:54:0x0143, B:56:0x0149, B:82:0x020d, B:23:0x007f, B:53:0x012d), top: B:110:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020d A[Catch: IOException -> 0x006e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IOException -> 0x006e, blocks: (B:18:0x0065, B:54:0x0143, B:56:0x0149, B:82:0x020d, B:23:0x007f, B:53:0x012d), top: B:110:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0282  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0190 -> B:19:0x0068). Please submit an issue!!! */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.amazon.aps.iva.ob0.d<? super androidx.work.ListenableWorker.a> r29) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crunchyroll.appwidgets.continuewatching.ContinueWatchingWorker.a(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List<? extends com.amazon.aps.iva.p4.m> r11, com.crunchyroll.appwidgets.continuewatching.a r12, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.crunchyroll.appwidgets.continuewatching.ContinueWatchingWorker.d
            if (r0 == 0) goto L13
            r0 = r13
            com.crunchyroll.appwidgets.continuewatching.ContinueWatchingWorker$d r0 = (com.crunchyroll.appwidgets.continuewatching.ContinueWatchingWorker.d) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            com.crunchyroll.appwidgets.continuewatching.ContinueWatchingWorker$d r0 = new com.crunchyroll.appwidgets.continuewatching.ContinueWatchingWorker$d
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.k
            com.amazon.aps.iva.pb0.a r7 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r0.m
            r8 = 2
            r9 = 1
            if (r1 == 0) goto L3e
            if (r1 == r9) goto L33
            if (r1 != r8) goto L2b
            com.amazon.aps.iva.ab.x.i0(r13)
            goto La2
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            java.util.Iterator r11 = r0.j
            com.crunchyroll.appwidgets.continuewatching.a r12 = r0.i
            com.crunchyroll.appwidgets.continuewatching.ContinueWatchingWorker r1 = r0.h
            com.amazon.aps.iva.ab.x.i0(r13)
            r13 = r1
            goto L48
        L3e:
            com.amazon.aps.iva.ab.x.i0(r13)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r13 = r10
        L48:
            boolean r1 = r11.hasNext()
            r2 = 0
            if (r1 == 0) goto L8c
            java.lang.Object r1 = r11.next()
            com.amazon.aps.iva.p4.m r1 = (com.amazon.aps.iva.p4.m) r1
            android.content.Context r3 = r13.e
            com.crunchyroll.appwidgets.continuewatching.b r4 = com.crunchyroll.appwidgets.continuewatching.b.a
            com.crunchyroll.appwidgets.continuewatching.ContinueWatchingWorker$e r5 = new com.crunchyroll.appwidgets.continuewatching.ContinueWatchingWorker$e
            r5.<init>(r12, r2)
            r0.h = r13
            r0.i = r12
            r0.j = r11
            r0.m = r9
            boolean r2 = r1 instanceof com.amazon.aps.iva.r4.b
            if (r2 == 0) goto L80
            com.amazon.aps.iva.z4.a r2 = com.amazon.aps.iva.z4.a.a
            com.amazon.aps.iva.r4.b r1 = (com.amazon.aps.iva.r4.b) r1
            int r1 = r1.a
            java.lang.String r6 = defpackage.i.u(r1)
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r6
            r6 = r0
            java.lang.Object r1 = r1.d(r2, r3, r4, r5, r6)
            if (r1 != r7) goto L48
            return r7
        L80:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "The glance ID is not the one of an App Widget"
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L8c:
            com.crunchyroll.appwidgets.continuewatching.c r11 = new com.crunchyroll.appwidgets.continuewatching.c
            r11.<init>()
            android.content.Context r12 = r13.e
            r0.h = r2
            r0.i = r2
            r0.j = r2
            r0.m = r8
            java.lang.Object r11 = defpackage.i.K(r11, r12, r0)
            if (r11 != r7) goto La2
            return r7
        La2:
            com.amazon.aps.iva.kb0.q r11 = com.amazon.aps.iva.kb0.q.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crunchyroll.appwidgets.continuewatching.ContinueWatchingWorker.b(java.util.List, com.crunchyroll.appwidgets.continuewatching.a, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
