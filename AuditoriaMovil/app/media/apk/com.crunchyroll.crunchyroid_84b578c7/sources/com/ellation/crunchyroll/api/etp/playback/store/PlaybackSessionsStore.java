package com.ellation.crunchyroll.api.etp.playback.store;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.t50.c;
import com.amazon.aps.iva.xe.b;
import com.amazon.aps.iva.yb0.j;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PlaybackSessionsStore.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000bJ\u0013\u0010\u0011\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/playback/store/PlaybackSessionsStore;", "", "", "contentId", "token", "", "sessionExpirationSec", "Lcom/amazon/aps/iva/kb0/q;", "saveItem", "(Ljava/lang/String;Ljava/lang/String;ILcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "deleteItem", "(Ljava/lang/String;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "", "Lcom/ellation/crunchyroll/api/etp/playback/store/PlaybackSessionData;", "readAllItems", "(Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "readItem", "deleteAllExpiredItems", "Companion", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface PlaybackSessionsStore {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: PlaybackSessionsStore.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u000b"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/playback/store/PlaybackSessionsStore$Companion;", "", "Lcom/amazon/aps/iva/t50/c;", "timeProvider", "Lcom/amazon/aps/iva/xe/b;", "Lcom/ellation/crunchyroll/api/etp/playback/store/PlaybackSessionData;", "dataStore", "Lcom/ellation/crunchyroll/api/etp/playback/store/PlaybackSessionsStore;", "create", "<init>", "()V", "cr-android_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PlaybackSessionsStore create$default(Companion companion, c cVar, b bVar, int i, Object obj) {
            if ((i & 1) != 0) {
                cVar = c.b.a;
            }
            if ((i & 2) != 0) {
                bVar = PlaybackSessionDataStore.INSTANCE;
            }
            return companion.create(cVar, bVar);
        }

        public final PlaybackSessionsStore create(c cVar, b<PlaybackSessionData> bVar) {
            j.f(cVar, "timeProvider");
            j.f(bVar, "dataStore");
            return new PlaybackSessionsStoreImpl(cVar, bVar);
        }
    }

    Object deleteAllExpiredItems(d<? super q> dVar);

    Object deleteItem(String str, d<? super q> dVar);

    Object readAllItems(d<? super List<PlaybackSessionData>> dVar);

    Object readItem(String str, d<? super PlaybackSessionData> dVar);

    Object saveItem(String str, String str2, int i, d<? super q> dVar);
}
