package com.kwad.framework.filedownloader;

import com.kwad.framework.filedownloader.a;
import com.kwad.framework.filedownloader.message.MessageSnapshot;
import com.kwad.framework.filedownloader.message.e;
import java.util.List;
/* loaded from: classes.dex */
public final class aa implements e.b {
    private static boolean a(List<a.InterfaceC0227a> list, MessageSnapshot messageSnapshot) {
        if (list.size() > 1 && messageSnapshot.ta() == -3) {
            for (a.InterfaceC0227a interfaceC0227a : list) {
                if (interfaceC0227a.tj().c(messageSnapshot)) {
                    return true;
                }
            }
        }
        for (a.InterfaceC0227a interfaceC0227a2 : list) {
            if (interfaceC0227a2.tj().b(messageSnapshot)) {
                return true;
            }
        }
        if (-4 == messageSnapshot.ta()) {
            for (a.InterfaceC0227a interfaceC0227a3 : list) {
                if (interfaceC0227a3.tj().d(messageSnapshot)) {
                    return true;
                }
            }
        }
        if (list.size() == 1) {
            return list.get(0).tj().a(messageSnapshot);
        }
        return false;
    }

    @Override // com.kwad.framework.filedownloader.message.e.b
    public final void r(MessageSnapshot messageSnapshot) {
        synchronized (Integer.toString(messageSnapshot.getId()).intern()) {
            List<a.InterfaceC0227a> aV = h.tG().aV(messageSnapshot.getId());
            if (aV.size() > 0) {
                a ti = aV.get(0).ti();
                if (com.kwad.framework.filedownloader.f.d.aeU) {
                    com.kwad.framework.filedownloader.f.d.c(this, "~~~callback %s old[%s] new[%s] %d", Integer.valueOf(messageSnapshot.getId()), Byte.valueOf(ti.ta()), Byte.valueOf(messageSnapshot.ta()), Integer.valueOf(aV.size()));
                }
                if (!a(aV, messageSnapshot)) {
                    StringBuilder sb = new StringBuilder("The event isn't consumed, id:" + messageSnapshot.getId() + " status:" + ((int) messageSnapshot.ta()) + " task-count:" + aV.size());
                    for (a.InterfaceC0227a interfaceC0227a : aV) {
                        sb.append(" | ");
                        sb.append((int) interfaceC0227a.ti().ta());
                    }
                    com.kwad.framework.filedownloader.f.d.b(this, sb.toString(), new Object[0]);
                }
            } else {
                com.kwad.framework.filedownloader.f.d.b(this, "Receive the event %d, but there isn't any running task in the upper layer", Byte.valueOf(messageSnapshot.ta()));
            }
        }
    }
}
