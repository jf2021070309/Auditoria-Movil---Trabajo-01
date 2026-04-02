package com.ellation.crunchyroll.cast.sessionmanagerlistener;

import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.ye.b;
import com.ellation.crunchyroll.cast.session.CastSessionWrapperInternal;
import kotlin.Metadata;
/* compiled from: SimpleSessionManagerListener.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0015"}, d2 = {"Lcom/ellation/crunchyroll/cast/sessionmanagerlistener/SimpleSessionManagerListener;", "", "Lcom/amazon/aps/iva/ye/b;", "session", "Lcom/amazon/aps/iva/kb0/q;", "onSessionStarting", "Lcom/ellation/crunchyroll/cast/session/CastSessionWrapperInternal;", "", "s", "onSessionStarted", "", "i", "onSessionStartFailed", "onSessionEnding", "onSessionEnded", "onSessionResuming", "", "b", "onSessionResumed", "onSessionResumeFailed", "onSessionSuspended", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface SimpleSessionManagerListener {

    /* compiled from: SimpleSessionManagerListener.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static void onSessionEnded(SimpleSessionManagerListener simpleSessionManagerListener, b bVar, int i) {
            j.f(bVar, "session");
        }

        public static void onSessionEnding(SimpleSessionManagerListener simpleSessionManagerListener, b bVar) {
            j.f(bVar, "session");
        }

        public static void onSessionResumeFailed(SimpleSessionManagerListener simpleSessionManagerListener, b bVar, int i) {
            j.f(bVar, "session");
        }

        public static void onSessionResumed(SimpleSessionManagerListener simpleSessionManagerListener, b bVar, boolean z) {
            j.f(bVar, "session");
        }

        public static void onSessionResuming(SimpleSessionManagerListener simpleSessionManagerListener, b bVar, String str) {
            j.f(bVar, "session");
            j.f(str, "s");
        }

        public static void onSessionStartFailed(SimpleSessionManagerListener simpleSessionManagerListener, b bVar, int i) {
            j.f(bVar, "session");
        }

        public static void onSessionStarted(SimpleSessionManagerListener simpleSessionManagerListener, CastSessionWrapperInternal castSessionWrapperInternal, String str) {
            j.f(castSessionWrapperInternal, "session");
            j.f(str, "s");
        }

        public static void onSessionStarting(SimpleSessionManagerListener simpleSessionManagerListener, b bVar) {
            j.f(bVar, "session");
        }

        public static void onSessionSuspended(SimpleSessionManagerListener simpleSessionManagerListener, b bVar, int i) {
            j.f(bVar, "session");
        }
    }

    void onSessionEnded(b bVar, int i);

    void onSessionEnding(b bVar);

    void onSessionResumeFailed(b bVar, int i);

    void onSessionResumed(b bVar, boolean z);

    void onSessionResuming(b bVar, String str);

    void onSessionStartFailed(b bVar, int i);

    void onSessionStarted(CastSessionWrapperInternal castSessionWrapperInternal, String str);

    void onSessionStarting(b bVar);

    void onSessionSuspended(b bVar, int i);
}
