package com.amazon.aps.iva.o00;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.jf0.a0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.wy.i;
import com.amazon.aps.iva.xb0.l;
import com.ellation.crunchyroll.api.etp.content.ContentApiResponse;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.model.Episode;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.model.UpNextPanel;
import java.util.List;
/* compiled from: NextAssetInteractor.kt */
/* loaded from: classes2.dex */
public final class d extends i implements c {
    public final EtpContentService b;
    public final com.amazon.aps.iva.wu.e<String, PlayableAsset> c = new com.amazon.aps.iva.wu.e<>();

    /* compiled from: NextAssetInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.content.upnext.NextEpisodeInteractorImpl$getNextAsset$2", f = "NextAssetInteractor.kt", l = {46, 47}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements l<com.amazon.aps.iva.ob0.d<? super PlayableAsset>, Object> {
        public int h;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(1, dVar);
            this.j = str;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Object invoke(com.amazon.aps.iva.ob0.d<? super PlayableAsset> dVar) {
            return ((a) create(dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            List data;
            UpNextPanel upNextPanel;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            d dVar = d.this;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        x.i0(obj);
                        return (Episode) com.amazon.aps.iva.lb0.x.t0(((ContentApiResponse) obj).getData());
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.i0(obj);
            } else {
                x.i0(obj);
                EtpContentService etpContentService = dVar.b;
                this.h = 1;
                obj = etpContentService.getNextEpisodePanel(this.j, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            ContentApiResponse contentApiResponse = (ContentApiResponse) ((a0) obj).b;
            if (contentApiResponse != null && (data = contentApiResponse.getData()) != null && (upNextPanel = (UpNextPanel) com.amazon.aps.iva.lb0.x.t0(data)) != null) {
                EtpContentService etpContentService2 = dVar.b;
                String id = upNextPanel.getPanel().getId();
                this.h = 2;
                obj = etpContentService2.getEpisode(id, this);
                if (obj == aVar) {
                    return aVar;
                }
                return (Episode) com.amazon.aps.iva.lb0.x.t0(((ContentApiResponse) obj).getData());
            }
            return null;
        }
    }

    public d(EtpContentService etpContentService) {
        this.b = etpContentService;
    }

    @Override // com.amazon.aps.iva.o00.c
    public final Object c(String str, com.amazon.aps.iva.ob0.d<? super PlayableAsset> dVar) {
        return this.c.a(str, dVar, new a(str, null));
    }
}
