package com.amazon.aps.iva.bi;

import android.os.Bundle;
import android.view.View;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.lb0.b0;
import com.amazon.aps.iva.w70.i;
import com.amazon.aps.iva.wy.e;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.xw.g;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yh.f;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.content.ContentApiResponse;
import com.ellation.crunchyroll.api.etp.content.EmptyMeta;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.model.HomeFeedItemRaw;
import com.ellation.crunchyroll.api.model.HomeFeedItemResponseType;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: BrowseMusicFragment.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/amazon/aps/iva/bi/b;", "Lcom/amazon/aps/iva/wy/e;", "", "Lcom/amazon/aps/iva/bh/c;", "Lcom/amazon/aps/iva/w70/i;", "<init>", "()V", "a", "music_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class b extends e implements com.amazon.aps.iva.bh.c, i {
    public final v c;
    public static final /* synthetic */ l<Object>[] e = {q.a(b.class, "feedLayout", "getFeedLayout()Lcom/crunchyroll/feed/BaseFeedLayout;", 0)};
    public static final a d = new a();

    /* compiled from: BrowseMusicFragment.kt */
    /* loaded from: classes.dex */
    public static final class a {
    }

    /* compiled from: BrowseMusicFragment.kt */
    /* renamed from: com.amazon.aps.iva.bi.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0143b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Boolean> {
        public static final C0143b h = new C0143b();

        public C0143b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* compiled from: BrowseMusicFragment.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Boolean> {
        public static final c h = new c();

        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* compiled from: BrowseMusicFragment.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.music.browsemusic.BrowseMusicFragment$onViewCreated$3", f = "BrowseMusicFragment.kt", l = {43}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.q<Integer, Integer, com.amazon.aps.iva.ob0.d<? super ContentApiResponse<HomeFeedItemRaw, EmptyMeta>>, Object> {
        public int h;
        public /* synthetic */ int i;
        public /* synthetic */ int j;

        public d(com.amazon.aps.iva.ob0.d<? super d> dVar) {
            super(3, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final Object invoke(Integer num, Integer num2, com.amazon.aps.iva.ob0.d<? super ContentApiResponse<HomeFeedItemRaw, EmptyMeta>> dVar) {
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            d dVar2 = new d(dVar);
            dVar2.i = intValue;
            dVar2.j = intValue2;
            return dVar2.invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                int i2 = this.i;
                int i3 = this.j;
                com.amazon.aps.iva.yh.i iVar = f.a.a;
                if (iVar != null) {
                    EtpContentService etpContentService = iVar.getEtpContentService();
                    Integer num = new Integer(i2);
                    Integer num2 = new Integer(i3);
                    this.h = 1;
                    obj = etpContentService.getMusicLandingFeed(num, num2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    j.m("dependencies");
                    throw null;
                }
            }
            return obj;
        }
    }

    public b() {
        super(R.layout.fragment_browse_music);
        this.c = g.f(this, R.id.home_feed);
    }

    @Override // com.amazon.aps.iva.w70.i
    public final int G() {
        return 0;
    }

    @Override // com.amazon.aps.iva.w70.i
    public final int H6() {
        return R.string.browse_music_tab_name;
    }

    @Override // com.amazon.aps.iva.bh.c
    public final void e(String str, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar2) {
        j.f(aVar2, "onUndoClicked");
    }

    @Override // com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.f(view, "view");
        super.onViewCreated(view, bundle);
        l<?>[] lVarArr = e;
        l<?> lVar = lVarArr[0];
        v vVar = this.c;
        ((com.amazon.aps.iva.bh.a) vVar.getValue(this, lVar)).U2(this, C0143b.h, c.h, new d(null), f1.K(HomeFeedItemResponseType.MUSIC_VIDEO, HomeFeedItemResponseType.CONCERT, HomeFeedItemResponseType.ARTIST, HomeFeedItemResponseType.MUSIC_MEDIA_MIXED, HomeFeedItemResponseType.UNDEFINED), false, true, com.amazon.aps.iva.ls.a.MUSIC_LANDING);
        ((com.amazon.aps.iva.bh.a) vVar.getValue(this, lVarArr[0])).b1();
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return b0.b;
    }
}
