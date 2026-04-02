package com.ellation.crunchyroll.cast.session;

import com.amazon.aps.iva.ef.a;
import com.amazon.aps.iva.ye.j;
import com.ellation.crunchyroll.cast.CastMediaProvider;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.PlayableAsset;
import kotlin.Metadata;
/* compiled from: CastMediaLoaderImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/ellation/crunchyroll/cast/session/CastMediaLoaderInternal;", "Lcom/amazon/aps/iva/ef/a;", "Companion", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface CastMediaLoaderInternal extends a {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: CastMediaLoaderImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/ellation/crunchyroll/cast/session/CastMediaLoaderInternal$Companion;", "", "Lcom/ellation/crunchyroll/cast/CastMediaProvider;", "castMediaProvider", "Lcom/amazon/aps/iva/ye/j;", "sessionManagerProvider", "Lcom/ellation/crunchyroll/cast/session/CastMediaLoaderInternal;", "create", "<init>", "()V", "cast_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ CastMediaLoaderInternal create$default(Companion companion, CastMediaProvider castMediaProvider, j jVar, int i, Object obj) {
            if ((i & 2) != 0) {
                jVar = SessionManagerProviderHolder.get();
            }
            return companion.create(castMediaProvider, jVar);
        }

        public final CastMediaLoaderInternal create(CastMediaProvider castMediaProvider, j jVar) {
            com.amazon.aps.iva.yb0.j.f(castMediaProvider, "castMediaProvider");
            com.amazon.aps.iva.yb0.j.f(jVar, "sessionManagerProvider");
            return new CastMediaLoaderImpl(castMediaProvider, jVar);
        }
    }

    @Override // com.amazon.aps.iva.ef.a
    /* synthetic */ void load(ContentContainer contentContainer, PlayableAsset playableAsset, long j);
}
