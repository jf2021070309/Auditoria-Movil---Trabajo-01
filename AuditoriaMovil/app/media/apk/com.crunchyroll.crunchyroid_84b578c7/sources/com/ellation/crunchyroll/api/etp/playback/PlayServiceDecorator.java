package com.ellation.crunchyroll.api.etp.playback;

import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.playback.store.PlaybackSessionsStore;
import kotlin.Metadata;
/* compiled from: PlayServiceDecorator.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/playback/PlayServiceDecorator;", "Lcom/ellation/crunchyroll/api/etp/playback/PlayService;", "", "ignoreFailures", "Lcom/amazon/aps/iva/kb0/q;", "deleteAllCachedSessions", "(ZLcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Companion", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface PlayServiceDecorator extends PlayService {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: PlayServiceDecorator.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¨\u0006\f"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/playback/PlayServiceDecorator$Companion;", "", "Lcom/ellation/crunchyroll/api/etp/playback/PlayService;", "playService", "Lcom/amazon/aps/iva/se0/g0;", "coroutineScope", "Lcom/ellation/crunchyroll/api/etp/playback/store/PlaybackSessionsStore;", "store", "Lcom/ellation/crunchyroll/api/etp/playback/PlayServiceDecorator;", "create", "<init>", "()V", "cr-android_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ PlayServiceDecorator create$default(Companion companion, PlayService playService, g0 g0Var, PlaybackSessionsStore playbackSessionsStore, int i, Object obj) {
            if ((i & 2) != 0) {
                g0Var = z.j();
            }
            if ((i & 4) != 0) {
                playbackSessionsStore = PlaybackSessionsStore.Companion.create$default(PlaybackSessionsStore.Companion, null, null, 3, null);
            }
            return companion.create(playService, g0Var, playbackSessionsStore);
        }

        public final PlayServiceDecorator create(PlayService playService, g0 g0Var, PlaybackSessionsStore playbackSessionsStore) {
            j.f(playService, "playService");
            j.f(g0Var, "coroutineScope");
            j.f(playbackSessionsStore, "store");
            return new PlayServiceDecoratorImpl(playService, g0Var, playbackSessionsStore);
        }
    }

    Object deleteAllCachedSessions(boolean z, d<? super q> dVar);
}
