package com.kwad.components.core.t;

import android.content.Context;
import com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener;
import com.kwad.sdk.utils.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class a {
    private static volatile a Rh;
    private com.kwad.sdk.utils.h Rd;
    private List<WeakReference<OfflineOnAudioConflictListener>> Re = new ArrayList();
    private boolean Rf = false;
    private boolean Rg = false;

    private a(Context context) {
        init(context);
    }

    static /* synthetic */ boolean a(a aVar, boolean z) {
        aVar.Rg = true;
        return true;
    }

    public static a ak(Context context) {
        if (Rh == null) {
            synchronized (a.class) {
                if (Rh == null) {
                    Rh = new a(context.getApplicationContext());
                }
            }
        }
        return Rh;
    }

    private void init(Context context) {
        this.Rf = false;
        com.kwad.sdk.utils.h hVar = new com.kwad.sdk.utils.h(context);
        this.Rd = hVar;
        hVar.c(new h.a() { // from class: com.kwad.components.core.t.a.1
            @Override // com.kwad.sdk.utils.h.a
            public final void onAudioBeOccupied() {
                OfflineOnAudioConflictListener offlineOnAudioConflictListener;
                Iterator it = a.this.Re.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    if (weakReference == null || (offlineOnAudioConflictListener = (OfflineOnAudioConflictListener) weakReference.get()) == null) {
                        it.remove();
                    } else {
                        offlineOnAudioConflictListener.onAudioBeOccupied();
                    }
                }
                a.a(a.this, true);
            }

            @Override // com.kwad.sdk.utils.h.a
            public final void onAudioBeReleased() {
                OfflineOnAudioConflictListener offlineOnAudioConflictListener;
                Iterator it = a.this.Re.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    if (weakReference == null || (offlineOnAudioConflictListener = (OfflineOnAudioConflictListener) weakReference.get()) == null) {
                        it.remove();
                    } else {
                        offlineOnAudioConflictListener.onAudioBeReleased();
                    }
                }
            }
        });
    }

    public final void a(OfflineOnAudioConflictListener offlineOnAudioConflictListener) {
        this.Re.add(new WeakReference<>(offlineOnAudioConflictListener));
    }

    public final boolean aI(boolean z) {
        com.kwad.sdk.utils.h hVar = this.Rd;
        if (hVar == null) {
            return false;
        }
        if (z || !this.Rf) {
            this.Rf = true;
            this.Rg = false;
            return hVar.HQ();
        }
        return false;
    }

    public final void b(OfflineOnAudioConflictListener offlineOnAudioConflictListener) {
        Iterator<WeakReference<OfflineOnAudioConflictListener>> it = this.Re.iterator();
        while (it.hasNext()) {
            WeakReference<OfflineOnAudioConflictListener> next = it.next();
            if (next == null || next.get() == offlineOnAudioConflictListener) {
                it.remove();
            }
        }
    }

    public final boolean qj() {
        return this.Rg;
    }

    public final boolean qk() {
        return this.Rf;
    }
}
