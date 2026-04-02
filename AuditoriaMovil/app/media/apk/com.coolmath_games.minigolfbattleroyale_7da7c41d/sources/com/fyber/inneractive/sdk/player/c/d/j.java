package com.fyber.inneractive.sdk.player.c.d;

import com.fyber.inneractive.sdk.player.c.f.a;
import com.fyber.inneractive.sdk.player.c.f.a.g;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class j {
    public static final g.a a = new g.a() { // from class: com.fyber.inneractive.sdk.player.c.d.j.1
        @Override // com.fyber.inneractive.sdk.player.c.f.a.g.a
        public final boolean a(int i, int i2, int i3, int i4, int i5) {
            if (i2 == 67 && i3 == 79 && i4 == 77) {
                return i5 == 77 || i == 2;
            }
            return false;
        }
    };
    private static final Pattern d = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int b = -1;
    public int c = -1;

    private boolean a(String str, String str2) {
        if ("iTunSMPB".equals(str)) {
            Matcher matcher = d.matcher(str2);
            if (matcher.find()) {
                try {
                    int parseInt = Integer.parseInt(matcher.group(1), 16);
                    int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                    if (parseInt > 0 || parseInt2 > 0) {
                        this.b = parseInt;
                        this.c = parseInt2;
                        return true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
            return false;
        }
        return false;
    }

    public final boolean a() {
        return (this.b == -1 || this.c == -1) ? false : true;
    }

    public final boolean a(com.fyber.inneractive.sdk.player.c.f.a aVar) {
        for (int i = 0; i < aVar.a.length; i++) {
            a.InterfaceC0060a interfaceC0060a = aVar.a[i];
            if (interfaceC0060a instanceof com.fyber.inneractive.sdk.player.c.f.a.e) {
                com.fyber.inneractive.sdk.player.c.f.a.e eVar = (com.fyber.inneractive.sdk.player.c.f.a.e) interfaceC0060a;
                if (a(eVar.b, eVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }
}
