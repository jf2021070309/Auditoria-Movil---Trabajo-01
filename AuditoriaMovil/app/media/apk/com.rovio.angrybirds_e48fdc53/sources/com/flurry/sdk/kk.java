package com.flurry.sdk;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public final class kk {
    private static kk a = null;
    private final kf<String, kx<kj<?>>> b = new kf<>();
    private final kf<kx<kj<?>>, String> c = new kf<>();

    private kk() {
    }

    public static synchronized kk a() {
        kk kkVar;
        synchronized (kk.class) {
            if (a == null) {
                a = new kk();
            }
            kkVar = a;
        }
        return kkVar;
    }

    public final synchronized void a(String str, kj<?> kjVar) {
        synchronized (this) {
            if (!TextUtils.isEmpty(str) && kjVar != null) {
                kx<kj<?>> kxVar = new kx<>(kjVar);
                List<kx<kj<?>>> a2 = this.b.a((kf<String, kx<kj<?>>>) str, false);
                if (!(a2 != null ? a2.contains(kxVar) : false)) {
                    this.b.a((kf<String, kx<kj<?>>>) str, (String) kxVar);
                    this.c.a((kf<kx<kj<?>>, String>) kxVar, (kx<kj<?>>) str);
                }
            }
        }
    }

    public final synchronized void b(String str, kj<?> kjVar) {
        if (!TextUtils.isEmpty(str)) {
            kx<kj<?>> kxVar = new kx<>(kjVar);
            this.b.b(str, kxVar);
            this.c.b(kxVar, str);
        }
    }

    public final synchronized void a(kj<?> kjVar) {
        if (kjVar != null) {
            kx<kj<?>> kxVar = new kx<>(kjVar);
            for (String str : this.c.a((kf<kx<kj<?>>, String>) kxVar)) {
                this.b.b(str, kxVar);
            }
            this.c.b(kxVar);
        }
    }

    public final synchronized int a(String str) {
        return TextUtils.isEmpty(str) ? 0 : this.b.a((kf<String, kx<kj<?>>>) str).size();
    }

    public final void a(final ki kiVar) {
        if (kiVar != null) {
            for (final kj<?> kjVar : b(kiVar.a())) {
                ka.a().b(new mc() { // from class: com.flurry.sdk.kk.1
                    @Override // com.flurry.sdk.mc
                    public final void a() {
                        kjVar.a(kiVar);
                    }
                });
            }
        }
    }

    private synchronized List<kj<?>> b(String str) {
        List<kj<?>> list;
        if (TextUtils.isEmpty(str)) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<kx<kj<?>>> it = this.b.a((kf<String, kx<kj<?>>>) str).iterator();
            while (it.hasNext()) {
                kj kjVar = (kj) it.next().get();
                if (kjVar == null) {
                    it.remove();
                } else {
                    arrayList.add(kjVar);
                }
            }
            list = arrayList;
        }
        return list;
    }
}
