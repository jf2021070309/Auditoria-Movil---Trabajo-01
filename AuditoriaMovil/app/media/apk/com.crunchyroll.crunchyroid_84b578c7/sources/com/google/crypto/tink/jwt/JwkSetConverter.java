package com.google.crypto.tink.jwt;

import com.amazon.aps.iva.c.b;
import com.amazon.aps.iva.c80.a;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.KeyStatus;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.internal.LegacyProtoKey;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.proto.JwtEcdsaAlgorithm;
import com.google.crypto.tink.proto.JwtEcdsaPublicKey;
import com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm;
import com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey;
import com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm;
import com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.Base64;
import com.google.crypto.tink.tinkkey.KeyAccess;
import com.google.errorprone.annotations.InlineMe;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Optional;
/* loaded from: classes4.dex */
public final class JwkSetConverter {
    private static final String JWT_ECDSA_PUBLIC_KEY_URL = "type.googleapis.com/google.crypto.tink.JwtEcdsaPublicKey";
    private static final String JWT_RSA_SSA_PKCS1_PUBLIC_KEY_URL = "type.googleapis.com/google.crypto.tink.JwtRsaSsaPkcs1PublicKey";
    private static final String JWT_RSA_SSA_PSS_PUBLIC_KEY_URL = "type.googleapis.com/google.crypto.tink.JwtRsaSsaPssPublicKey";

    /* renamed from: com.google.crypto.tink.jwt.JwkSetConverter$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPkcs1Algorithm;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm;

        static {
            int[] iArr = new int[JwtRsaSsaPssAlgorithm.values().length];
            $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm = iArr;
            try {
                iArr[JwtRsaSsaPssAlgorithm.PS256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm[JwtRsaSsaPssAlgorithm.PS384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm[JwtRsaSsaPssAlgorithm.PS512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[JwtRsaSsaPkcs1Algorithm.values().length];
            $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPkcs1Algorithm = iArr2;
            try {
                iArr2[JwtRsaSsaPkcs1Algorithm.RS256.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPkcs1Algorithm[JwtRsaSsaPkcs1Algorithm.RS384.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPkcs1Algorithm[JwtRsaSsaPkcs1Algorithm.RS512.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[JwtEcdsaAlgorithm.values().length];
            $SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm = iArr3;
            try {
                iArr3[JwtEcdsaAlgorithm.ES256.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm[JwtEcdsaAlgorithm.ES384.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm[JwtEcdsaAlgorithm.ES512.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    private JwkSetConverter() {
    }

    private static JsonObject convertJwtEcdsaKey(ProtoKeySerialization protoKeySerialization) throws GeneralSecurityException {
        String str;
        String str2;
        try {
            JwtEcdsaPublicKey parseFrom = JwtEcdsaPublicKey.parseFrom(protoKeySerialization.getValue(), ExtensionRegistryLite.getEmptyRegistry());
            int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm[parseFrom.getAlgorithm().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        str = "ES512";
                        str2 = "P-521";
                    } else {
                        throw new GeneralSecurityException("unknown algorithm");
                    }
                } else {
                    str = "ES384";
                    str2 = "P-384";
                }
            } else {
                str = "ES256";
                str2 = "P-256";
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("kty", "EC");
            jsonObject.addProperty("crv", str2);
            jsonObject.addProperty("x", Base64.urlSafeEncode(parseFrom.getX().toByteArray()));
            jsonObject.addProperty("y", Base64.urlSafeEncode(parseFrom.getY().toByteArray()));
            jsonObject.addProperty("use", "sig");
            jsonObject.addProperty("alg", str);
            JsonArray jsonArray = new JsonArray();
            jsonArray.add("verify");
            jsonObject.add("key_ops", jsonArray);
            Optional<String> kid = getKid(protoKeySerialization.getIdRequirementOrNull());
            if (kid.isPresent()) {
                jsonObject.addProperty("kid", kid.get());
            } else if (parseFrom.hasCustomKid()) {
                jsonObject.addProperty("kid", parseFrom.getCustomKid().getValue());
            }
            return jsonObject;
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("failed to parse value as JwtEcdsaPublicKey proto", e);
        }
    }

    private static JsonObject convertJwtRsaSsaPkcs1(ProtoKeySerialization protoKeySerialization) throws GeneralSecurityException {
        String str;
        try {
            JwtRsaSsaPkcs1PublicKey parseFrom = JwtRsaSsaPkcs1PublicKey.parseFrom(protoKeySerialization.getValue(), ExtensionRegistryLite.getEmptyRegistry());
            int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPkcs1Algorithm[parseFrom.getAlgorithm().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        str = "RS512";
                    } else {
                        throw new GeneralSecurityException("unknown algorithm");
                    }
                } else {
                    str = "RS384";
                }
            } else {
                str = "RS256";
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("kty", "RSA");
            jsonObject.addProperty("n", Base64.urlSafeEncode(parseFrom.getN().toByteArray()));
            jsonObject.addProperty("e", Base64.urlSafeEncode(parseFrom.getE().toByteArray()));
            jsonObject.addProperty("use", "sig");
            jsonObject.addProperty("alg", str);
            JsonArray jsonArray = new JsonArray();
            jsonArray.add("verify");
            jsonObject.add("key_ops", jsonArray);
            Optional<String> kid = getKid(protoKeySerialization.getIdRequirementOrNull());
            if (kid.isPresent()) {
                jsonObject.addProperty("kid", kid.get());
            } else if (parseFrom.hasCustomKid()) {
                jsonObject.addProperty("kid", parseFrom.getCustomKid().getValue());
            }
            return jsonObject;
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("failed to parse value as JwtRsaSsaPkcs1PublicKey proto", e);
        }
    }

    private static JsonObject convertJwtRsaSsaPss(ProtoKeySerialization protoKeySerialization) throws GeneralSecurityException {
        String str;
        try {
            JwtRsaSsaPssPublicKey parseFrom = JwtRsaSsaPssPublicKey.parseFrom(protoKeySerialization.getValue(), ExtensionRegistryLite.getEmptyRegistry());
            int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm[parseFrom.getAlgorithm().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        str = "PS512";
                    } else {
                        throw new GeneralSecurityException("unknown algorithm");
                    }
                } else {
                    str = "PS384";
                }
            } else {
                str = "PS256";
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("kty", "RSA");
            jsonObject.addProperty("n", Base64.urlSafeEncode(parseFrom.getN().toByteArray()));
            jsonObject.addProperty("e", Base64.urlSafeEncode(parseFrom.getE().toByteArray()));
            jsonObject.addProperty("use", "sig");
            jsonObject.addProperty("alg", str);
            JsonArray jsonArray = new JsonArray();
            jsonArray.add("verify");
            jsonObject.add("key_ops", jsonArray);
            Optional<String> kid = getKid(protoKeySerialization.getIdRequirementOrNull());
            if (kid.isPresent()) {
                jsonObject.addProperty("kid", kid.get());
            } else if (parseFrom.hasCustomKid()) {
                jsonObject.addProperty("kid", parseFrom.getCustomKid().getValue());
            }
            return jsonObject;
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("failed to parse value as JwtRsaSsaPssPublicKey proto", e);
        }
    }

    private static ProtoKeySerialization convertToEcdsaKey(JsonObject jsonObject) throws GeneralSecurityException {
        JwtEcdsaAlgorithm jwtEcdsaAlgorithm;
        String stringItem = getStringItem(jsonObject, "alg");
        stringItem.getClass();
        char c = 65535;
        switch (stringItem.hashCode()) {
            case 66245349:
                if (stringItem.equals("ES256")) {
                    c = 0;
                    break;
                }
                break;
            case 66246401:
                if (stringItem.equals("ES384")) {
                    c = 1;
                    break;
                }
                break;
            case 66248104:
                if (stringItem.equals("ES512")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                expectStringItem(jsonObject, "crv", "P-256");
                jwtEcdsaAlgorithm = JwtEcdsaAlgorithm.ES256;
                break;
            case 1:
                expectStringItem(jsonObject, "crv", "P-384");
                jwtEcdsaAlgorithm = JwtEcdsaAlgorithm.ES384;
                break;
            case 2:
                expectStringItem(jsonObject, "crv", "P-521");
                jwtEcdsaAlgorithm = JwtEcdsaAlgorithm.ES512;
                break;
            default:
                throw new GeneralSecurityException("Unknown Ecdsa Algorithm: " + getStringItem(jsonObject, "alg"));
        }
        if (!jsonObject.has("d")) {
            expectStringItem(jsonObject, "kty", "EC");
            validateUseIsSig(jsonObject);
            validateKeyOpsIsVerify(jsonObject);
            JwtEcdsaPublicKey.Builder y = JwtEcdsaPublicKey.newBuilder().setVersion(0).setAlgorithm(jwtEcdsaAlgorithm).setX(ByteString.copyFrom(Base64.urlSafeDecode(getStringItem(jsonObject, "x")))).setY(ByteString.copyFrom(Base64.urlSafeDecode(getStringItem(jsonObject, "y"))));
            if (jsonObject.has("kid")) {
                y.setCustomKid(JwtEcdsaPublicKey.CustomKid.newBuilder().setValue(getStringItem(jsonObject, "kid")).build());
            }
            return ProtoKeySerialization.create(JWT_ECDSA_PUBLIC_KEY_URL, y.build().toByteString(), KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, OutputPrefixType.RAW, null);
        }
        throw new UnsupportedOperationException("importing ECDSA private keys is not implemented");
    }

    private static ProtoKeySerialization convertToRsaSsaPkcs1Key(JsonObject jsonObject) throws GeneralSecurityException {
        JwtRsaSsaPkcs1Algorithm jwtRsaSsaPkcs1Algorithm;
        String stringItem = getStringItem(jsonObject, "alg");
        stringItem.getClass();
        char c = 65535;
        switch (stringItem.hashCode()) {
            case 78251122:
                if (stringItem.equals("RS256")) {
                    c = 0;
                    break;
                }
                break;
            case 78252174:
                if (stringItem.equals("RS384")) {
                    c = 1;
                    break;
                }
                break;
            case 78253877:
                if (stringItem.equals("RS512")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                jwtRsaSsaPkcs1Algorithm = JwtRsaSsaPkcs1Algorithm.RS256;
                break;
            case 1:
                jwtRsaSsaPkcs1Algorithm = JwtRsaSsaPkcs1Algorithm.RS384;
                break;
            case 2:
                jwtRsaSsaPkcs1Algorithm = JwtRsaSsaPkcs1Algorithm.RS512;
                break;
            default:
                throw new GeneralSecurityException("Unknown Rsa Algorithm: " + getStringItem(jsonObject, "alg"));
        }
        if (!jsonObject.has("p") && !jsonObject.has("q") && !jsonObject.has("dp") && !jsonObject.has("dq") && !jsonObject.has("d") && !jsonObject.has("qi")) {
            expectStringItem(jsonObject, "kty", "RSA");
            validateUseIsSig(jsonObject);
            validateKeyOpsIsVerify(jsonObject);
            JwtRsaSsaPkcs1PublicKey.Builder n = JwtRsaSsaPkcs1PublicKey.newBuilder().setVersion(0).setAlgorithm(jwtRsaSsaPkcs1Algorithm).setE(ByteString.copyFrom(Base64.urlSafeDecode(getStringItem(jsonObject, "e")))).setN(ByteString.copyFrom(Base64.urlSafeDecode(getStringItem(jsonObject, "n"))));
            if (jsonObject.has("kid")) {
                n.setCustomKid(JwtRsaSsaPkcs1PublicKey.CustomKid.newBuilder().setValue(getStringItem(jsonObject, "kid")).build());
            }
            return ProtoKeySerialization.create(JWT_RSA_SSA_PKCS1_PUBLIC_KEY_URL, n.build().toByteString(), KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, OutputPrefixType.RAW, null);
        }
        throw new UnsupportedOperationException("importing RSA private keys is not implemented");
    }

    private static ProtoKeySerialization convertToRsaSsaPssKey(JsonObject jsonObject) throws GeneralSecurityException {
        JwtRsaSsaPssAlgorithm jwtRsaSsaPssAlgorithm;
        String stringItem = getStringItem(jsonObject, "alg");
        stringItem.getClass();
        char c = 65535;
        switch (stringItem.hashCode()) {
            case 76404080:
                if (stringItem.equals("PS256")) {
                    c = 0;
                    break;
                }
                break;
            case 76405132:
                if (stringItem.equals("PS384")) {
                    c = 1;
                    break;
                }
                break;
            case 76406835:
                if (stringItem.equals("PS512")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                jwtRsaSsaPssAlgorithm = JwtRsaSsaPssAlgorithm.PS256;
                break;
            case 1:
                jwtRsaSsaPssAlgorithm = JwtRsaSsaPssAlgorithm.PS384;
                break;
            case 2:
                jwtRsaSsaPssAlgorithm = JwtRsaSsaPssAlgorithm.PS512;
                break;
            default:
                throw new GeneralSecurityException("Unknown Rsa Algorithm: " + getStringItem(jsonObject, "alg"));
        }
        if (!jsonObject.has("p") && !jsonObject.has("q") && !jsonObject.has("dq") && !jsonObject.has("dq") && !jsonObject.has("d") && !jsonObject.has("qi")) {
            expectStringItem(jsonObject, "kty", "RSA");
            validateUseIsSig(jsonObject);
            validateKeyOpsIsVerify(jsonObject);
            JwtRsaSsaPssPublicKey.Builder n = JwtRsaSsaPssPublicKey.newBuilder().setVersion(0).setAlgorithm(jwtRsaSsaPssAlgorithm).setE(ByteString.copyFrom(Base64.urlSafeDecode(getStringItem(jsonObject, "e")))).setN(ByteString.copyFrom(Base64.urlSafeDecode(getStringItem(jsonObject, "n"))));
            if (jsonObject.has("kid")) {
                n.setCustomKid(JwtRsaSsaPssPublicKey.CustomKid.newBuilder().setValue(getStringItem(jsonObject, "kid")).build());
            }
            return ProtoKeySerialization.create(JWT_RSA_SSA_PSS_PUBLIC_KEY_URL, n.build().toByteString(), KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, OutputPrefixType.RAW, null);
        }
        throw new UnsupportedOperationException("importing RSA private keys is not implemented");
    }

    private static void expectStringItem(JsonObject jsonObject, String str, String str2) throws GeneralSecurityException {
        String stringItem = getStringItem(jsonObject, str);
        if (stringItem.equals(str2)) {
            return;
        }
        throw new GeneralSecurityException(b.a("unexpected ", str, " value: ", stringItem));
    }

    @InlineMe(imports = {"com.google.crypto.tink.jwt.JwkSetConverter"}, replacement = "JwkSetConverter.fromPublicKeysetHandle(handle)")
    @Deprecated
    public static String fromKeysetHandle(KeysetHandle keysetHandle, KeyAccess keyAccess) throws IOException, GeneralSecurityException {
        return fromPublicKeysetHandle(keysetHandle);
    }

    public static String fromPublicKeysetHandle(KeysetHandle keysetHandle) throws IOException, GeneralSecurityException {
        JsonArray jsonArray = new JsonArray();
        for (int i = 0; i < keysetHandle.size(); i++) {
            KeysetHandle.Entry at = keysetHandle.getAt(i);
            if (at.getStatus() == KeyStatus.ENABLED) {
                Key key = at.getKey();
                if (key instanceof LegacyProtoKey) {
                    ProtoKeySerialization serialization = ((LegacyProtoKey) key).getSerialization(null);
                    if (serialization.getOutputPrefixType() != OutputPrefixType.RAW && serialization.getOutputPrefixType() != OutputPrefixType.TINK) {
                        throw new GeneralSecurityException("only OutputPrefixType RAW and TINK are supported");
                    }
                    if (serialization.getKeyMaterialType() == KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC) {
                        String typeUrl = serialization.getTypeUrl();
                        typeUrl.getClass();
                        char c = 65535;
                        switch (typeUrl.hashCode()) {
                            case -1204668709:
                                if (typeUrl.equals(JWT_ECDSA_PUBLIC_KEY_URL)) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 516334794:
                                if (typeUrl.equals(JWT_RSA_SSA_PKCS1_PUBLIC_KEY_URL)) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 1174255008:
                                if (typeUrl.equals(JWT_RSA_SSA_PSS_PUBLIC_KEY_URL)) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        switch (c) {
                            case 0:
                                jsonArray.add(convertJwtEcdsaKey(serialization));
                                continue;
                            case 1:
                                jsonArray.add(convertJwtRsaSsaPkcs1(serialization));
                                continue;
                            case 2:
                                jsonArray.add(convertJwtRsaSsaPss(serialization));
                                continue;
                            default:
                                throw new GeneralSecurityException(String.format("key type %s is not supported", serialization.getTypeUrl()));
                        }
                    } else {
                        throw new GeneralSecurityException("only public keys can be converted");
                    }
                } else {
                    throw new GeneralSecurityException("only LegacyProtoKey is currently supported");
                }
            }
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("keys", jsonArray);
        return jsonObject.toString();
    }

    private static Optional<String> getKid(Integer num) {
        if (num == null) {
            return Optional.empty();
        }
        return Optional.of(Base64.urlSafeEncode(ByteBuffer.allocate(4).putInt(num.intValue()).array()));
    }

    private static String getStringItem(JsonObject jsonObject, String str) throws GeneralSecurityException {
        if (jsonObject.has(str)) {
            if (jsonObject.get(str).isJsonPrimitive() && jsonObject.get(str).getAsJsonPrimitive().isString()) {
                return jsonObject.get(str).getAsString();
            }
            throw new GeneralSecurityException(a.f(str, " is not a string"));
        }
        throw new GeneralSecurityException(a.f(str, " not found"));
    }

    @InlineMe(imports = {"com.google.crypto.tink.jwt.JwkSetConverter"}, replacement = "JwkSetConverter.toPublicKeysetHandle(jwkSet)")
    @Deprecated
    public static KeysetHandle toKeysetHandle(String str, KeyAccess keyAccess) throws IOException, GeneralSecurityException {
        return toPublicKeysetHandle(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0056, code lost:
        if (r4.equals("RS") == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.crypto.tink.KeysetHandle toPublicKeysetHandle(java.lang.String r8) throws java.io.IOException, java.security.GeneralSecurityException {
        /*
            com.google.gson.stream.JsonReader r0 = new com.google.gson.stream.JsonReader     // Catch: java.lang.StackOverflowError -> Lc4 com.google.gson.JsonParseException -> Lc6 java.lang.IllegalStateException -> Lc8
            java.io.StringReader r1 = new java.io.StringReader     // Catch: java.lang.StackOverflowError -> Lc4 com.google.gson.JsonParseException -> Lc6 java.lang.IllegalStateException -> Lc8
            r1.<init>(r8)     // Catch: java.lang.StackOverflowError -> Lc4 com.google.gson.JsonParseException -> Lc6 java.lang.IllegalStateException -> Lc8
            r0.<init>(r1)     // Catch: java.lang.StackOverflowError -> Lc4 com.google.gson.JsonParseException -> Lc6 java.lang.IllegalStateException -> Lc8
            r8 = 0
            r0.setLenient(r8)     // Catch: java.lang.StackOverflowError -> Lc4 com.google.gson.JsonParseException -> Lc6 java.lang.IllegalStateException -> Lc8
            com.google.gson.JsonElement r0 = com.google.gson.internal.Streams.parse(r0)     // Catch: java.lang.StackOverflowError -> Lc4 com.google.gson.JsonParseException -> Lc6 java.lang.IllegalStateException -> Lc8
            com.google.gson.JsonObject r0 = r0.getAsJsonObject()     // Catch: java.lang.StackOverflowError -> Lc4 com.google.gson.JsonParseException -> Lc6 java.lang.IllegalStateException -> Lc8
            com.google.crypto.tink.KeysetHandle$Builder r1 = com.google.crypto.tink.KeysetHandle.newBuilder()
            java.lang.String r2 = "keys"
            com.google.gson.JsonElement r0 = r0.get(r2)
            com.google.gson.JsonArray r0 = r0.getAsJsonArray()
            java.util.Iterator r0 = r0.iterator()
        L28:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Laa
            java.lang.Object r2 = r0.next()
            com.google.gson.JsonElement r2 = (com.google.gson.JsonElement) r2
            com.google.gson.JsonObject r2 = r2.getAsJsonObject()
            java.lang.String r3 = "alg"
            java.lang.String r4 = getStringItem(r2, r3)
            r5 = 2
            java.lang.String r4 = r4.substring(r8, r5)
            r4.getClass()
            int r6 = r4.hashCode()
            r7 = -1
            switch(r6) {
                case 2222: goto L64;
                case 2563: goto L59;
                case 2625: goto L50;
                default: goto L4e;
            }
        L4e:
            r5 = r7
            goto L6e
        L50:
            java.lang.String r6 = "RS"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L6e
            goto L4e
        L59:
            java.lang.String r5 = "PS"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L62
            goto L4e
        L62:
            r5 = 1
            goto L6e
        L64:
            java.lang.String r5 = "ES"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L6d
            goto L4e
        L6d:
            r5 = r8
        L6e:
            switch(r5) {
                case 0: goto L93;
                case 1: goto L8e;
                case 2: goto L89;
                default: goto L71;
            }
        L71:
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unexpected alg value: "
            r0.<init>(r1)
            java.lang.String r1 = getStringItem(r2, r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L89:
            com.google.crypto.tink.internal.ProtoKeySerialization r2 = convertToRsaSsaPkcs1Key(r2)
            goto L97
        L8e:
            com.google.crypto.tink.internal.ProtoKeySerialization r2 = convertToRsaSsaPssKey(r2)
            goto L97
        L93:
            com.google.crypto.tink.internal.ProtoKeySerialization r2 = convertToEcdsaKey(r2)
        L97:
            com.google.crypto.tink.internal.LegacyProtoKey r3 = new com.google.crypto.tink.internal.LegacyProtoKey
            r4 = 0
            r3.<init>(r2, r4)
            com.google.crypto.tink.KeysetHandle$Builder$Entry r2 = com.google.crypto.tink.KeysetHandle.importKey(r3)
            com.google.crypto.tink.KeysetHandle$Builder$Entry r2 = r2.withRandomId()
            r1.addEntry(r2)
            goto L28
        Laa:
            int r0 = r1.size()
            if (r0 <= 0) goto Lbc
            com.google.crypto.tink.KeysetHandle$Builder$Entry r8 = r1.getAt(r8)
            r8.makePrimary()
            com.google.crypto.tink.KeysetHandle r8 = r1.build()
            return r8
        Lbc:
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
            java.lang.String r0 = "empty keyset"
            r8.<init>(r0)
            throw r8
        Lc4:
            r8 = move-exception
            goto Lc9
        Lc6:
            r8 = move-exception
            goto Lc9
        Lc8:
            r8 = move-exception
        Lc9:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "JWK set is invalid JSON"
            r0.<init>(r1, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.jwt.JwkSetConverter.toPublicKeysetHandle(java.lang.String):com.google.crypto.tink.KeysetHandle");
    }

    private static void validateKeyOpsIsVerify(JsonObject jsonObject) throws GeneralSecurityException {
        if (!jsonObject.has("key_ops")) {
            return;
        }
        if (jsonObject.get("key_ops").isJsonArray()) {
            JsonArray asJsonArray = jsonObject.get("key_ops").getAsJsonArray();
            if (asJsonArray.size() == 1) {
                if (asJsonArray.get(0).isJsonPrimitive() && asJsonArray.get(0).getAsJsonPrimitive().isString()) {
                    if (asJsonArray.get(0).getAsString().equals("verify")) {
                        return;
                    }
                    throw new GeneralSecurityException("unexpected keyOps value: " + asJsonArray.get(0).getAsString());
                }
                throw new GeneralSecurityException("key_ops is not a string");
            }
            throw new GeneralSecurityException("key_ops must contain exactly one element");
        }
        throw new GeneralSecurityException("key_ops is not an array");
    }

    private static void validateUseIsSig(JsonObject jsonObject) throws GeneralSecurityException {
        if (!jsonObject.has("use")) {
            return;
        }
        expectStringItem(jsonObject, "use", "sig");
    }
}
