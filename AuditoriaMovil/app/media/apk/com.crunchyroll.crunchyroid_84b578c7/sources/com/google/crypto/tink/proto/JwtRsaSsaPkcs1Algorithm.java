package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;
/* loaded from: classes4.dex */
public enum JwtRsaSsaPkcs1Algorithm implements Internal.EnumLite {
    RS_UNKNOWN(0),
    RS256(1),
    RS384(2),
    RS512(3),
    UNRECOGNIZED(-1);
    
    public static final int RS256_VALUE = 1;
    public static final int RS384_VALUE = 2;
    public static final int RS512_VALUE = 3;
    public static final int RS_UNKNOWN_VALUE = 0;
    private static final Internal.EnumLiteMap<JwtRsaSsaPkcs1Algorithm> internalValueMap = new Internal.EnumLiteMap<JwtRsaSsaPkcs1Algorithm>() { // from class: com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public JwtRsaSsaPkcs1Algorithm findValueByNumber(int i) {
            return JwtRsaSsaPkcs1Algorithm.forNumber(i);
        }
    };
    private final int value;

    /* loaded from: classes4.dex */
    public static final class JwtRsaSsaPkcs1AlgorithmVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new JwtRsaSsaPkcs1AlgorithmVerifier();

        private JwtRsaSsaPkcs1AlgorithmVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            if (JwtRsaSsaPkcs1Algorithm.forNumber(i) != null) {
                return true;
            }
            return false;
        }
    }

    JwtRsaSsaPkcs1Algorithm(int i) {
        this.value = i;
    }

    public static JwtRsaSsaPkcs1Algorithm forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return RS512;
                }
                return RS384;
            }
            return RS256;
        }
        return RS_UNKNOWN;
    }

    public static Internal.EnumLiteMap<JwtRsaSsaPkcs1Algorithm> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return JwtRsaSsaPkcs1AlgorithmVerifier.INSTANCE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static JwtRsaSsaPkcs1Algorithm valueOf(int i) {
        return forNumber(i);
    }
}
