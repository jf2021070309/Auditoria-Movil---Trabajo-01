package com.google.crypto.tink.jwt;

import com.amazon.aps.iva.b6.x;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.subtle.Base64;
import com.google.gson.JsonObject;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Optional;
/* loaded from: classes4.dex */
final class JwtFormat {

    /* loaded from: classes4.dex */
    public static class Parts {
        String header;
        String payload;
        byte[] signatureOrMac;
        String unsignedCompact;

        public Parts(String str, byte[] bArr, String str2, String str3) {
            this.unsignedCompact = str;
            this.signatureOrMac = bArr;
            this.header = str2;
            this.payload = str3;
        }
    }

    private JwtFormat() {
    }

    public static String createHeader(String str, Optional<String> optional, Optional<String> optional2) throws InvalidAlgorithmParameterException {
        validateAlgorithm(str);
        JsonObject jsonObject = new JsonObject();
        if (optional2.isPresent()) {
            jsonObject.addProperty("kid", optional2.get());
        }
        jsonObject.addProperty("alg", str);
        if (optional.isPresent()) {
            jsonObject.addProperty("typ", optional.get());
        }
        return Base64.urlSafeEncode(jsonObject.toString().getBytes(Util.UTF_8));
    }

    public static String createSignedCompact(String str, byte[] bArr) {
        StringBuilder b = x.b(str, ".");
        b.append(encodeSignature(bArr));
        return b.toString();
    }

    public static String createUnsignedCompact(String str, Optional<String> optional, RawJwt rawJwt) throws InvalidAlgorithmParameterException, JwtInvalidException {
        Optional empty;
        String jsonPayload = rawJwt.getJsonPayload();
        if (rawJwt.hasTypeHeader()) {
            empty = Optional.of(rawJwt.getTypeHeader());
        } else {
            empty = Optional.empty();
        }
        return createHeader(str, empty, optional) + "." + encodePayload(jsonPayload);
    }

    public static String decodeHeader(String str) throws JwtInvalidException {
        byte[] strictUrlSafeDecode = strictUrlSafeDecode(str);
        validateUtf8(strictUrlSafeDecode);
        return new String(strictUrlSafeDecode, Util.UTF_8);
    }

    public static String decodePayload(String str) throws JwtInvalidException {
        byte[] strictUrlSafeDecode = strictUrlSafeDecode(str);
        validateUtf8(strictUrlSafeDecode);
        return new String(strictUrlSafeDecode, Util.UTF_8);
    }

    public static byte[] decodeSignature(String str) throws JwtInvalidException {
        return strictUrlSafeDecode(str);
    }

    public static String encodePayload(String str) {
        return Base64.urlSafeEncode(str.getBytes(Util.UTF_8));
    }

    public static String encodeSignature(byte[] bArr) {
        return Base64.urlSafeEncode(bArr);
    }

    public static Optional<Integer> getKeyId(String str) {
        byte[] urlSafeDecode = Base64.urlSafeDecode(str);
        if (urlSafeDecode.length != 4) {
            return Optional.empty();
        }
        return Optional.of(Integer.valueOf(ByteBuffer.wrap(urlSafeDecode).getInt()));
    }

    public static Optional<String> getKid(int i, OutputPrefixType outputPrefixType) throws JwtInvalidException {
        if (outputPrefixType == OutputPrefixType.RAW) {
            return Optional.empty();
        }
        if (outputPrefixType == OutputPrefixType.TINK) {
            return Optional.of(Base64.urlSafeEncode(ByteBuffer.allocate(4).putInt(i).array()));
        }
        throw new JwtInvalidException("unsupported output prefix type");
    }

    private static String getStringHeader(JsonObject jsonObject, String str) throws JwtInvalidException {
        if (jsonObject.has(str)) {
            if (jsonObject.get(str).isJsonPrimitive() && jsonObject.get(str).getAsJsonPrimitive().isString()) {
                return jsonObject.get(str).getAsString();
            }
            throw new JwtInvalidException(e.e("header ", str, " is not a string"));
        }
        throw new JwtInvalidException(e.e("header ", str, " does not exist"));
    }

    public static Optional<String> getTypeHeader(JsonObject jsonObject) throws JwtInvalidException {
        if (jsonObject.has("typ")) {
            return Optional.of(getStringHeader(jsonObject, "typ"));
        }
        return Optional.empty();
    }

    public static boolean isValidUrlsafeBase64Char(char c) {
        if ((c < 'a' || c > 'z') && ((c < 'A' || c > 'Z') && ((c < '0' || c > '9') && c != '-' && c != '_'))) {
            return false;
        }
        return true;
    }

    public static Parts splitSignedCompact(String str) throws JwtInvalidException {
        validateASCII(str);
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String substring = str.substring(0, lastIndexOf);
            byte[] decodeSignature = decodeSignature(str.substring(lastIndexOf + 1));
            int indexOf = substring.indexOf(46);
            if (indexOf >= 0) {
                String substring2 = substring.substring(0, indexOf);
                String substring3 = substring.substring(indexOf + 1);
                if (substring3.indexOf(46) <= 0) {
                    return new Parts(substring, decodeSignature, decodeHeader(substring2), decodePayload(substring3));
                }
                throw new JwtInvalidException("only tokens in JWS compact serialization format are supported");
            }
            throw new JwtInvalidException("only tokens in JWS compact serialization format are supported");
        }
        throw new JwtInvalidException("only tokens in JWS compact serialization format are supported");
    }

    public static byte[] strictUrlSafeDecode(String str) throws JwtInvalidException {
        for (int i = 0; i < str.length(); i++) {
            if (!isValidUrlsafeBase64Char(str.charAt(i))) {
                throw new JwtInvalidException("invalid encoding");
            }
        }
        try {
            return Base64.urlSafeDecode(str);
        } catch (IllegalArgumentException e) {
            throw new JwtInvalidException("invalid encoding: " + e);
        }
    }

    public static void validateASCII(String str) throws JwtInvalidException {
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) & 128) > 0) {
                throw new JwtInvalidException("Non ascii character");
            }
        }
    }

    private static void validateAlgorithm(String str) throws InvalidAlgorithmParameterException {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 66245349:
                if (str.equals("ES256")) {
                    c = 0;
                    break;
                }
                break;
            case 66246401:
                if (str.equals("ES384")) {
                    c = 1;
                    break;
                }
                break;
            case 66248104:
                if (str.equals("ES512")) {
                    c = 2;
                    break;
                }
                break;
            case 69015912:
                if (str.equals("HS256")) {
                    c = 3;
                    break;
                }
                break;
            case 69016964:
                if (str.equals("HS384")) {
                    c = 4;
                    break;
                }
                break;
            case 69018667:
                if (str.equals("HS512")) {
                    c = 5;
                    break;
                }
                break;
            case 76404080:
                if (str.equals("PS256")) {
                    c = 6;
                    break;
                }
                break;
            case 76405132:
                if (str.equals("PS384")) {
                    c = 7;
                    break;
                }
                break;
            case 76406835:
                if (str.equals("PS512")) {
                    c = '\b';
                    break;
                }
                break;
            case 78251122:
                if (str.equals("RS256")) {
                    c = '\t';
                    break;
                }
                break;
            case 78252174:
                if (str.equals("RS384")) {
                    c = '\n';
                    break;
                }
                break;
            case 78253877:
                if (str.equals("RS512")) {
                    c = 11;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
                return;
            default:
                throw new InvalidAlgorithmParameterException("invalid algorithm: ".concat(str));
        }
    }

    public static void validateHeader(String str, Optional<String> optional, Optional<String> optional2, JsonObject jsonObject) throws InvalidAlgorithmParameterException, JwtInvalidException {
        validateAlgorithm(str);
        String stringHeader = getStringHeader(jsonObject, "alg");
        if (stringHeader.equals(str)) {
            if (!jsonObject.has("crit")) {
                if (optional.isPresent() && optional2.isPresent()) {
                    throw new JwtInvalidException("custom_kid can only be set for RAW keys.");
                }
                boolean has = jsonObject.has("kid");
                if (optional.isPresent()) {
                    if (has) {
                        validateKidInHeader(optional.get(), jsonObject);
                    } else {
                        throw new JwtInvalidException("missing kid in header");
                    }
                }
                if (optional2.isPresent() && has) {
                    validateKidInHeader(optional2.get(), jsonObject);
                    return;
                }
                return;
            }
            throw new JwtInvalidException("all tokens with crit headers are rejected");
        }
        throw new InvalidAlgorithmParameterException(String.format("invalid algorithm; expected %s, got %s", str, stringHeader));
    }

    private static void validateKidInHeader(String str, JsonObject jsonObject) throws JwtInvalidException {
        if (getStringHeader(jsonObject, "kid").equals(str)) {
            return;
        }
        throw new JwtInvalidException("invalid kid in header");
    }

    public static void validateUtf8(byte[] bArr) throws JwtInvalidException {
        try {
            Util.UTF_8.newDecoder().decode(ByteBuffer.wrap(bArr));
        } catch (CharacterCodingException e) {
            throw new JwtInvalidException(e.getMessage());
        }
    }
}
