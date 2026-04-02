package com.ellation.crunchyroll.api.etp.playback.store;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.pb0.a;
import com.amazon.aps.iva.t50.c;
import com.amazon.aps.iva.xe.b;
import com.amazon.aps.iva.yb0.j;
import java.util.List;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PlaybackSessionsStore.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0015¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ\u001d\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/playback/store/PlaybackSessionsStoreImpl;", "Lcom/ellation/crunchyroll/api/etp/playback/store/PlaybackSessionsStore;", "", "contentId", "token", "", "sessionExpirationSec", "Lcom/amazon/aps/iva/kb0/q;", "saveItem", "(Ljava/lang/String;Ljava/lang/String;ILcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "deleteItem", "(Ljava/lang/String;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "", "Lcom/ellation/crunchyroll/api/etp/playback/store/PlaybackSessionData;", "readAllItems", "(Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "deleteAllExpiredItems", "readItem", "Lcom/amazon/aps/iva/t50/c;", "timeProvider", "Lcom/amazon/aps/iva/t50/c;", "Lcom/amazon/aps/iva/xe/b;", "dataStore", "Lcom/amazon/aps/iva/xe/b;", "<init>", "(Lcom/amazon/aps/iva/t50/c;Lcom/amazon/aps/iva/xe/b;)V", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PlaybackSessionsStoreImpl implements PlaybackSessionsStore {
    private final b<PlaybackSessionData> dataStore;
    private final c timeProvider;

    public PlaybackSessionsStoreImpl(c cVar, b<PlaybackSessionData> bVar) {
        j.f(cVar, "timeProvider");
        j.f(bVar, "dataStore");
        this.timeProvider = cVar;
        this.dataStore = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    @Override // com.ellation.crunchyroll.api.etp.playback.store.PlaybackSessionsStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object deleteAllExpiredItems(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.ellation.crunchyroll.api.etp.playback.store.PlaybackSessionsStoreImpl$deleteAllExpiredItems$1
            if (r0 == 0) goto L13
            r0 = r7
            com.ellation.crunchyroll.api.etp.playback.store.PlaybackSessionsStoreImpl$deleteAllExpiredItems$1 r0 = (com.ellation.crunchyroll.api.etp.playback.store.PlaybackSessionsStoreImpl$deleteAllExpiredItems$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.ellation.crunchyroll.api.etp.playback.store.PlaybackSessionsStoreImpl$deleteAllExpiredItems$1 r0 = new com.ellation.crunchyroll.api.etp.playback.store.PlaybackSessionsStoreImpl$deleteAllExpiredItems$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r2 = r0.L$1
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.L$0
            com.ellation.crunchyroll.api.etp.playback.store.PlaybackSessionsStoreImpl r4 = (com.ellation.crunchyroll.api.etp.playback.store.PlaybackSessionsStoreImpl) r4
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L5b
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3a:
            java.lang.Object r2 = r0.L$0
            com.ellation.crunchyroll.api.etp.playback.store.PlaybackSessionsStoreImpl r2 = (com.ellation.crunchyroll.api.etp.playback.store.PlaybackSessionsStoreImpl) r2
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L53
        L42:
            com.amazon.aps.iva.ab.x.i0(r7)
            com.amazon.aps.iva.xe.b<com.ellation.crunchyroll.api.etp.playback.store.PlaybackSessionData> r7 = r6.dataStore
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r7.readAllItems(r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r2 = r6
        L53:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r4 = r2
            r2 = r7
        L5b:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L7e
            java.lang.Object r7 = r2.next()
            com.ellation.crunchyroll.api.etp.playback.store.PlaybackSessionData r7 = (com.ellation.crunchyroll.api.etp.playback.store.PlaybackSessionData) r7
            boolean r5 = r7.isExpired()
            if (r5 == 0) goto L5b
            java.lang.String r7 = r7.getContentId()
            r0.L$0 = r4
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r7 = r4.deleteItem(r7, r0)
            if (r7 != r1) goto L5b
            return r1
        L7e:
            com.amazon.aps.iva.kb0.q r7 = com.amazon.aps.iva.kb0.q.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.api.etp.playback.store.PlaybackSessionsStoreImpl.deleteAllExpiredItems(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.ellation.crunchyroll.api.etp.playback.store.PlaybackSessionsStore
    public Object deleteItem(String str, d<? super q> dVar) {
        Object deleteItem = this.dataStore.deleteItem(str, dVar);
        if (deleteItem == a.COROUTINE_SUSPENDED) {
            return deleteItem;
        }
        return q.a;
    }

    @Override // com.ellation.crunchyroll.api.etp.playback.store.PlaybackSessionsStore
    public Object readAllItems(d<? super List<PlaybackSessionData>> dVar) {
        return this.dataStore.readAllItems(dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.playback.store.PlaybackSessionsStore
    public Object readItem(String str, d<? super PlaybackSessionData> dVar) {
        return this.dataStore.readItem(str, dVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.playback.store.PlaybackSessionsStore
    public Object saveItem(String str, String str2, int i, d<? super q> dVar) {
        Object saveItem = this.dataStore.saveItem(new PlaybackSessionData(str, str2, this.timeProvider.a() + (i * 1000)), dVar);
        if (saveItem == a.COROUTINE_SUSPENDED) {
            return saveItem;
        }
        return q.a;
    }
}
