package com.ellation.crunchyroll.eventdispatcher;

import android.os.Handler;
import com.amazon.aps.iva.c6.f;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
/* compiled from: EventDispatcher.kt */
/* loaded from: classes2.dex */
public interface EventDispatcher<T> {

    /* compiled from: EventDispatcher.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ellation/crunchyroll/eventdispatcher/EventDispatcher$EventDispatcherImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/ellation/crunchyroll/eventdispatcher/EventDispatcher;", "eventdispatcher_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class EventDispatcherImpl<T> implements EventDispatcher<T> {
        public final Handler b = null;
        public final CopyOnWriteArraySet<T> c = new CopyOnWriteArraySet<>();

        @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
        public final void addEventListener(T t) {
            this.c.add(t);
        }

        @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
        public final void clear() {
            this.c.clear();
        }

        @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
        public final int getListenerCount() {
            return this.c.size();
        }

        @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
        public final void notify(l<? super T, q> lVar) {
            j.f(lVar, "action");
            Iterator<T> it = this.c.iterator();
            while (it.hasNext()) {
                Object obj = (T) it.next();
                Handler handler = this.b;
                if (handler != null) {
                    handler.post(new f(6, lVar, obj));
                } else {
                    lVar.invoke(obj);
                }
            }
        }

        @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
        public final void removeEventListener(T t) {
            this.c.remove(t);
        }
    }

    void addEventListener(T t);

    void clear();

    int getListenerCount();

    void notify(l<? super T, q> lVar);

    void removeEventListener(T t);
}
