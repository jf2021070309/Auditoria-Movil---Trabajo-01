package com.kwad.components.ad.feed;

import android.content.Context;
import android.os.Vibrator;
import com.kwad.sdk.utils.bj;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class d {
    private static com.kwad.sdk.core.g.d dO;
    private static Vibrator dP;
    private static List<a> dQ = new CopyOnWriteArrayList();

    /* loaded from: classes.dex */
    public static class a {
        private b dS;
        private Context mContext;

        public a(b bVar, Context context) {
            this.dS = bVar;
            this.mContext = context;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean b(double d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Vibrator F(Context context) {
        if (dP == null) {
            dP = (Vibrator) context.getSystemService("vibrator");
        }
        return dP;
    }

    private static void a(float f, Context context) {
        dO = new com.kwad.sdk.core.g.d(f);
        dQ = new CopyOnWriteArrayList();
        dO.a(new com.kwad.sdk.core.g.b() { // from class: com.kwad.components.ad.feed.d.1
            @Override // com.kwad.sdk.core.g.b
            public final void a(double d) {
                if (d.dQ != null) {
                    Iterator it = d.dQ.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        a aVar = (a) it.next();
                        if (aVar.dS != null && aVar.dS.b(d)) {
                            bj.a(aVar.mContext, d.F(aVar.mContext));
                            break;
                        }
                    }
                    bj.a(new Runnable() { // from class: com.kwad.components.ad.feed.d.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.kwad.sdk.core.e.c.d("KSFeedShakeManager", "onShakeEvent openGate2");
                            d.dO.CF();
                        }
                    }, null, 500L);
                }
            }

            @Override // com.kwad.sdk.core.g.b
            public final void aT() {
            }
        });
        dO.e(f);
        dO.bi(context);
    }

    public static void a(float f, Context context, b bVar) {
        if (dO == null) {
            a(f, context);
        }
        dQ.add(new a(bVar, context));
    }

    public static void a(b bVar) {
        for (a aVar : dQ) {
            if (aVar.dS == bVar) {
                dQ.remove(aVar);
            }
        }
        com.kwad.sdk.core.e.c.d("KSFeedShakeManager", "sShakeItems size " + dQ.size());
    }
}
