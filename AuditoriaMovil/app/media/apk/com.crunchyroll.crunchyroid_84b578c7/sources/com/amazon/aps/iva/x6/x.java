package com.amazon.aps.iva.x6;

import com.amazon.aps.iva.q5.f0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: GaplessInfoHolder.java */
/* loaded from: classes.dex */
public final class x {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i = com.amazon.aps.iva.t5.g0.a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.a = parseInt;
                    this.b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final void b(com.amazon.aps.iva.q5.f0 f0Var) {
        int i = 0;
        while (true) {
            f0.b[] bVarArr = f0Var.b;
            if (i < bVarArr.length) {
                f0.b bVar = bVarArr[i];
                if (bVar instanceof com.amazon.aps.iva.i7.e) {
                    com.amazon.aps.iva.i7.e eVar = (com.amazon.aps.iva.i7.e) bVar;
                    if ("iTunSMPB".equals(eVar.d) && a(eVar.e)) {
                        return;
                    }
                } else if (bVar instanceof com.amazon.aps.iva.i7.i) {
                    com.amazon.aps.iva.i7.i iVar = (com.amazon.aps.iva.i7.i) bVar;
                    if ("com.apple.iTunes".equals(iVar.c) && "iTunSMPB".equals(iVar.d) && a(iVar.e)) {
                        return;
                    }
                } else {
                    continue;
                }
                i++;
            } else {
                return;
            }
        }
    }
}
