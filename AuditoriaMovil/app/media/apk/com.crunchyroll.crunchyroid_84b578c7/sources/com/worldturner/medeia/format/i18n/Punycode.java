package com.worldturner.medeia.format.i18n;

import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: Punycode.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/worldturner/medeia/format/i18n/Punycode;", "", "()V", "parameters", "Lcom/worldturner/medeia/format/i18n/BootstringParameters;", "getParameters", "()Lcom/worldturner/medeia/format/i18n/BootstringParameters;", "encode", "", "s", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class Punycode {
    public static final Punycode INSTANCE = new Punycode();
    private static final BootstringParameters parameters = new BootstringParameters(36, 1, 26, 38, 700, 72, 128, 45, "abcdefghijklmnopqrstuvwxyz0123456789");

    private Punycode() {
    }

    public final String encode(String str) {
        j.g(str, "s");
        return Bootstring.INSTANCE.encode(str, parameters);
    }

    public final BootstringParameters getParameters() {
        return parameters;
    }
}
