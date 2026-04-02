package com.kwad.sdk.core.video.videoview;

import java.lang.ref.WeakReference;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class AdVideoPlayerViewCache {
    private HashMap<String, WeakReference<a>> Cc;

    /* loaded from: classes.dex */
    enum Holder {
        INSTANCE;
        
        private AdVideoPlayerViewCache mInstance = new AdVideoPlayerViewCache((byte) 0);

        Holder() {
        }

        final AdVideoPlayerViewCache getInstance() {
            return this.mInstance;
        }
    }

    private AdVideoPlayerViewCache() {
        this.Cc = new HashMap<>(1);
    }

    /* synthetic */ AdVideoPlayerViewCache(byte b) {
        this();
    }

    public static AdVideoPlayerViewCache getInstance() {
        return Holder.INSTANCE.getInstance();
    }

    public final void a(String str, a aVar) {
        this.Cc.put(str, new WeakReference<>(aVar));
    }

    public final a dJ(String str) {
        WeakReference<a> weakReference = this.Cc.get(str);
        if (weakReference != null) {
            a aVar = weakReference.get();
            if (aVar != null) {
                return aVar;
            }
            this.Cc.remove(str);
        }
        return null;
    }

    public final void remove(String str) {
        this.Cc.remove(str);
    }
}
