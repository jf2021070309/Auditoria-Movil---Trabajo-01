package com.amazon.aps.iva.h7;

import com.amazon.aps.iva.q5.f0;
import com.google.common.base.Ascii;
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: IcyDecoder.java */
/* loaded from: classes.dex */
public final class a extends com.amazon.aps.iva.ab.a {
    public static final Pattern c = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder a = Charsets.UTF_8.newDecoder();
    public final CharsetDecoder b = Charsets.ISO_8859_1.newDecoder();

    @Override // com.amazon.aps.iva.ab.a
    public final f0 e(com.amazon.aps.iva.d7.b bVar, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.b;
        CharsetDecoder charsetDecoder2 = this.a;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new f0(new c(bArr, null, null));
        }
        Matcher matcher = c.matcher(str);
        String str3 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String lowerCase = Ascii.toLowerCase(group);
                lowerCase.getClass();
                if (!lowerCase.equals("streamurl")) {
                    if (lowerCase.equals("streamtitle")) {
                        str2 = group2;
                    }
                } else {
                    str3 = group2;
                }
            }
        }
        return new f0(new c(bArr, str2, str3));
    }
}
