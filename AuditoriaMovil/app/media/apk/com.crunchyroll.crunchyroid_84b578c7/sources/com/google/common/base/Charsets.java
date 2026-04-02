package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.segment.analytics.internal.Utils;
import java.nio.charset.Charset;
import org.apache.commons.codec.binary.Hex;
@GwtCompatible(emulated = Utils.DEFAULT_COLLECT_DEVICE_ID)
@ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public final class Charsets {
    @GwtIncompatible
    public static final Charset US_ASCII = Charset.forName("US-ASCII");
    public static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
    public static final Charset UTF_8 = Charset.forName(Hex.DEFAULT_CHARSET_NAME);
    @GwtIncompatible
    public static final Charset UTF_16BE = Charset.forName("UTF-16BE");
    @GwtIncompatible
    public static final Charset UTF_16LE = Charset.forName("UTF-16LE");
    @GwtIncompatible
    public static final Charset UTF_16 = Charset.forName("UTF-16");

    private Charsets() {
    }
}
