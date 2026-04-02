package com.kwad.framework.filedownloader.event;

import com.kwad.framework.filedownloader.f.d;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class a {
    private final Executor adJ = com.kwad.framework.filedownloader.f.b.j(10, "EventPool");
    private final HashMap<String, LinkedList<c>> adK = new HashMap<>();

    private static void a(LinkedList<c> linkedList, b bVar) {
        Object[] array;
        for (Object obj : linkedList.toArray()) {
            if (obj != null) {
                ((c) obj).a(bVar);
            }
        }
        if (bVar.adP != null) {
            bVar.adP.run();
        }
    }

    public final boolean a(String str, c cVar) {
        boolean add;
        if (d.aeU) {
            d.e(this, "setListener %s", str);
        }
        if (cVar != null) {
            LinkedList<c> linkedList = this.adK.get(str);
            if (linkedList == null) {
                synchronized (str.intern()) {
                    linkedList = this.adK.get(str);
                    if (linkedList == null) {
                        HashMap<String, LinkedList<c>> hashMap = this.adK;
                        LinkedList<c> linkedList2 = new LinkedList<>();
                        hashMap.put(str, linkedList2);
                        linkedList = linkedList2;
                    }
                }
            }
            synchronized (str.intern()) {
                add = linkedList.add(cVar);
            }
            return add;
        }
        throw new IllegalArgumentException("listener must not be null!");
    }

    public final boolean b(b bVar) {
        if (d.aeU) {
            d.e(this, "publish %s", bVar.getId());
        }
        if (bVar != null) {
            String id = bVar.getId();
            LinkedList<c> linkedList = this.adK.get(id);
            if (linkedList == null) {
                synchronized (id.intern()) {
                    linkedList = this.adK.get(id);
                    if (linkedList == null) {
                        if (d.aeU) {
                            d.c(this, "No listener for this event %s", id);
                        }
                        return false;
                    }
                }
            }
            a(linkedList, bVar);
            return true;
        }
        throw new IllegalArgumentException("event must not be null!");
    }

    public final void c(final b bVar) {
        if (d.aeU) {
            d.e(this, "asyncPublishInNewThread %s", bVar.getId());
        }
        this.adJ.execute(new Runnable() { // from class: com.kwad.framework.filedownloader.event.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    a.this.b(bVar);
                } catch (Exception e) {
                }
            }
        });
    }
}
