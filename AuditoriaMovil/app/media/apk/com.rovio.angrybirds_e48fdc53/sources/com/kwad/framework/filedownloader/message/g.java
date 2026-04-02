package com.kwad.framework.filedownloader.message;

import com.kwad.framework.filedownloader.message.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class g {
    private final e.b aeb;
    private final List<a> aed = new ArrayList();

    /* loaded from: classes.dex */
    public class a {
        private final List<Integer> aee = new ArrayList();
        private final Executor aef;

        public a(int i) {
            this.aef = com.kwad.framework.filedownloader.f.b.j(1, "Flow-" + i);
        }

        public final void bw(int i) {
            this.aee.add(Integer.valueOf(i));
        }

        public final void u(final MessageSnapshot messageSnapshot) {
            this.aef.execute(new Runnable() { // from class: com.kwad.framework.filedownloader.message.g.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    g.this.aeb.r(messageSnapshot);
                    try {
                        a.this.aee.remove(Integer.valueOf(messageSnapshot.getId()));
                    } catch (Exception e) {
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(int i, e.b bVar) {
        this.aeb = bVar;
        for (int i2 = 0; i2 < 5; i2++) {
            this.aed.add(new a(i2));
        }
    }

    public final void u(MessageSnapshot messageSnapshot) {
        a aVar = null;
        try {
            synchronized (this.aed) {
                int id = messageSnapshot.getId();
                Iterator<a> it = this.aed.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    a next = it.next();
                    if (next.aee.contains(Integer.valueOf(id))) {
                        aVar = next;
                        break;
                    }
                }
                if (aVar == null) {
                    int i = 0;
                    Iterator<a> it2 = this.aed.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        a next2 = it2.next();
                        if (next2.aee.size() <= 0) {
                            aVar = next2;
                            break;
                        } else if (i == 0 || next2.aee.size() < i) {
                            i = next2.aee.size();
                            aVar = next2;
                        }
                    }
                }
                if (aVar != null) {
                    aVar.bw(id);
                }
            }
        } finally {
            if (aVar != null) {
                aVar.u(messageSnapshot);
            }
        }
    }
}
