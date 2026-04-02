package com.amazon.aps.iva.jm;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.jm.d;
import com.amazon.aps.iva.jm.r;
import com.amazon.aps.iva.se0.g0;
import com.ellation.crunchyroll.api.etp.assets.model.AvatarAsset;
import com.ellation.crunchyroll.api.etp.assets.model.AvatarCollection;
import com.google.android.gms.cast.MediaError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
/* compiled from: AvatarSelectionViewModel.kt */
/* loaded from: classes2.dex */
public final class q extends com.amazon.aps.iva.ez.b implements p {
    public final y b;
    public final e c;
    public final com.amazon.aps.iva.pm.b d;
    public final com.amazon.aps.iva.i5.v e;
    public final com.amazon.aps.iva.i5.v f;
    public final com.amazon.aps.iva.i5.v<String> g;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<List<d>>> h;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.kb0.q>> i;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.kb0.q>> j;

    /* compiled from: AvatarSelectionViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.profiles.presentation.avatar.AvatarSelectionViewModelImpl$loadAvatars$1", f = "AvatarSelectionViewModel.kt", l = {55}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            Object j1;
            String uuid;
            String uuid2;
            List<r> b;
            r rVar;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            q qVar = q.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        com.amazon.aps.iva.ab.x.i0(obj);
                        j1 = obj;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    e eVar = qVar.c;
                    this.h = 1;
                    j1 = eVar.j1(this);
                    if (j1 == aVar) {
                        return aVar;
                    }
                }
                com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<List<d>>> vVar = qVar.h;
                List list = (List) j1;
                ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list));
                int i2 = 0;
                for (Object obj2 : list) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        AvatarCollection avatarCollection = (AvatarCollection) obj2;
                        d dVar = (d) com.amazon.aps.iva.lb0.x.w0(i2, qVar.c.j());
                        if (dVar == null || (uuid = dVar.a()) == null) {
                            uuid = UUID.randomUUID().toString();
                            com.amazon.aps.iva.yb0.j.e(uuid, "randomUUID().toString()");
                        }
                        String title = avatarCollection.getTitle();
                        List<AvatarAsset> assets = avatarCollection.getAssets();
                        ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(assets));
                        int i4 = 0;
                        for (Object obj3 : assets) {
                            int i5 = i4 + 1;
                            if (i4 >= 0) {
                                String m = qVar.b.m(((AvatarAsset) obj3).getId());
                                if (dVar == null || (b = dVar.b()) == null || (rVar = (r) com.amazon.aps.iva.lb0.x.w0(i4, b)) == null || (uuid2 = rVar.a()) == null) {
                                    uuid2 = UUID.randomUUID().toString();
                                    com.amazon.aps.iva.yb0.j.e(uuid2, "randomUUID().toString()");
                                }
                                arrayList2.add(new r.b(uuid2, m, com.amazon.aps.iva.yb0.j.a(m, qVar.f.d())));
                                i4 = i5;
                            } else {
                                f1.S();
                                throw null;
                            }
                        }
                        arrayList.add(new d.b(title, uuid, arrayList2));
                        i2 = i3;
                    } else {
                        f1.S();
                        throw null;
                    }
                }
                vVar.k(new g.c(arrayList, null));
            } catch (IOException e) {
                com.amazon.aps.iva.e4.e.g(null, e, qVar.h);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AvatarSelectionViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.profiles.presentation.avatar.AvatarSelectionViewModelImpl$updateAvatar$1", f = "AvatarSelectionViewModel.kt", l = {MediaError.DetailedErrorCode.MEDIA_DECODE, MediaError.DetailedErrorCode.MEDIA_NETWORK}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
            this.j = str;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            q qVar = q.this;
            try {
            } catch (IOException e) {
                com.amazon.aps.iva.e4.e.g(null, e, qVar.i);
                qVar.j.k(new com.amazon.aps.iva.ez.d<>(com.amazon.aps.iva.kb0.q.a));
            }
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        com.amazon.aps.iva.ab.x.i0(obj);
                        qVar.i.k(new g.c(com.amazon.aps.iva.kb0.q.a, null));
                        return com.amazon.aps.iva.kb0.q.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                e eVar = qVar.c;
                String str = this.j;
                this.h = 1;
                if (eVar.W(str, this) == aVar) {
                    return aVar;
                }
            }
            com.amazon.aps.iva.pm.b bVar = qVar.d;
            this.h = 2;
            if (bVar.r1(this) == aVar) {
                return aVar;
            }
            qVar.i.k(new g.c(com.amazon.aps.iva.kb0.q.a, null));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(y yVar, String str, e eVar, com.amazon.aps.iva.pm.c cVar) {
        super(eVar, cVar);
        com.amazon.aps.iva.yb0.j.f(yVar, "userAssetsProvider");
        com.amazon.aps.iva.yb0.j.f(eVar, "avatarSelectionInteractor");
        this.b = yVar;
        this.c = eVar;
        this.d = cVar;
        this.e = new com.amazon.aps.iva.i5.v(str);
        this.f = new com.amazon.aps.iva.i5.v(yVar.v());
        this.g = new com.amazon.aps.iva.i5.v<>();
        this.h = new com.amazon.aps.iva.i5.v<>();
        this.i = new com.amazon.aps.iva.i5.v<>();
        this.j = new com.amazon.aps.iva.i5.v<>();
        w3();
    }

    @Override // com.amazon.aps.iva.jm.p
    public final com.amazon.aps.iva.i5.v F2() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.jm.p
    public final void G0(String str) {
        com.amazon.aps.iva.ez.h.c(this.i, null);
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new b(str, null), 3);
    }

    @Override // com.amazon.aps.iva.jm.p
    public final com.amazon.aps.iva.i5.v J8() {
        return this.j;
    }

    @Override // com.amazon.aps.iva.jm.p
    public final void K(String str) {
        g.c<List<d>> a2;
        List<d> list;
        com.amazon.aps.iva.yb0.j.f(str, "selectedAvatarUrl");
        this.g.k(str);
        com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<List<d>>> vVar = this.h;
        com.amazon.aps.iva.ez.g<List<d>> d = vVar.d();
        if (d != null && (a2 = d.a()) != null && (list = a2.a) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof d.b) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(arrayList));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                d.b bVar = (d.b) it.next();
                List<r.b> list2 = bVar.e;
                ArrayList arrayList3 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
                for (r.b bVar2 : list2) {
                    boolean a3 = com.amazon.aps.iva.yb0.j.a(bVar2.c, str);
                    String str2 = bVar2.b;
                    com.amazon.aps.iva.yb0.j.f(str2, "adapterId");
                    String str3 = bVar2.c;
                    com.amazon.aps.iva.yb0.j.f(str3, "avatarUrl");
                    arrayList3.add(new r.b(str2, str3, a3));
                }
                String str4 = bVar.c;
                com.amazon.aps.iva.yb0.j.f(str4, "title");
                String str5 = bVar.d;
                com.amazon.aps.iva.yb0.j.f(str5, "adapterId");
                arrayList2.add(new d.b(str4, str5, arrayList3));
            }
            vVar.k(new g.c(arrayList2, null));
        }
    }

    @Override // com.amazon.aps.iva.jm.p
    public final com.amazon.aps.iva.i5.v L7() {
        return this.i;
    }

    @Override // com.amazon.aps.iva.jm.p
    public final com.amazon.aps.iva.i5.v c0() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.jm.p
    public final com.amazon.aps.iva.i5.v u1() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.jm.p
    public final com.amazon.aps.iva.i5.v v() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.jm.p
    public final void w3() {
        com.amazon.aps.iva.ez.h.c(this.h, this.c.j());
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new a(null), 3);
    }
}
