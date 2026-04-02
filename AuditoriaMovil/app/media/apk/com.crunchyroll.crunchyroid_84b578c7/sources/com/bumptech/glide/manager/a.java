package com.bumptech.glide.manager;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.amazon.aps.iva.ad.h;
import com.amazon.aps.iva.ad.j;
import com.amazon.aps.iva.ec.g;
import com.amazon.aps.iva.hd.l;
import com.bumptech.glide.manager.b;
import java.util.HashMap;
/* compiled from: LifecycleRequestManagerRetriever.java */
/* loaded from: classes.dex */
public final class a {
    public final HashMap a = new HashMap();
    public final b.InterfaceC0948b b;

    /* compiled from: LifecycleRequestManagerRetriever.java */
    /* loaded from: classes.dex */
    public final class b implements j {
        public b(a aVar, FragmentManager fragmentManager) {
        }
    }

    public a(b.InterfaceC0948b interfaceC0948b) {
        this.b = interfaceC0948b;
    }

    public final g a(Context context, com.bumptech.glide.a aVar, androidx.lifecycle.g gVar, FragmentManager fragmentManager, boolean z) {
        l.a();
        l.a();
        HashMap hashMap = this.a;
        g gVar2 = (g) hashMap.get(gVar);
        if (gVar2 == null) {
            LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(gVar);
            b bVar = new b(this, fragmentManager);
            ((b.a) this.b).getClass();
            g gVar3 = new g(aVar, lifecycleLifecycle, bVar, context);
            hashMap.put(gVar, gVar3);
            lifecycleLifecycle.a(new C0947a(gVar));
            if (z) {
                gVar3.onStart();
            }
            return gVar3;
        }
        return gVar2;
    }

    /* compiled from: LifecycleRequestManagerRetriever.java */
    /* renamed from: com.bumptech.glide.manager.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0947a implements h {
        public final /* synthetic */ androidx.lifecycle.g b;

        public C0947a(androidx.lifecycle.g gVar) {
            this.b = gVar;
        }

        @Override // com.amazon.aps.iva.ad.h
        public final void onDestroy() {
            a.this.a.remove(this.b);
        }

        @Override // com.amazon.aps.iva.ad.h
        public final void onStart() {
        }

        @Override // com.amazon.aps.iva.ad.h
        public final void onStop() {
        }
    }
}
