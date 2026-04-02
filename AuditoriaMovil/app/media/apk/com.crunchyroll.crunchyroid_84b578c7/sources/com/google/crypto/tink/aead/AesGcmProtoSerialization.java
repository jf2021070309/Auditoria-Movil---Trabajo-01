package com.google.crypto.tink.aead;

import com.google.crypto.tink.AccessesPartialKey;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.aead.AesGcmParameters;
import com.google.crypto.tink.internal.KeyParser;
import com.google.crypto.tink.internal.KeySerializer;
import com.google.crypto.tink.internal.MutableSerializationRegistry;
import com.google.crypto.tink.internal.ParametersParser;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.proto.AesGcmKeyFormat;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.util.Bytes;
import com.google.crypto.tink.util.SecretBytes;
import java.security.GeneralSecurityException;
/* JADX INFO: Access modifiers changed from: package-private */
@AccessesPartialKey
/* loaded from: classes4.dex */
public final class AesGcmProtoSerialization {
    private static final KeyParser<ProtoKeySerialization> KEY_PARSER;
    private static final KeySerializer<AesGcmKey, ProtoKeySerialization> KEY_SERIALIZER;
    private static final ParametersParser<ProtoParametersSerialization> PARAMETERS_PARSER;
    private static final ParametersSerializer<AesGcmParameters, ProtoParametersSerialization> PARAMETERS_SERIALIZER;
    private static final String TYPE_URL = "type.googleapis.com/google.crypto.tink.AesGcmKey";
    private static final Bytes TYPE_URL_BYTES;

    /* renamed from: com.google.crypto.tink.aead.AesGcmProtoSerialization$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = iArr;
            try {
                iArr[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        Bytes bytesFromPrintableAscii = Util.toBytesFromPrintableAscii(TYPE_URL);
        TYPE_URL_BYTES = bytesFromPrintableAscii;
        PARAMETERS_SERIALIZER = ParametersSerializer.create(new e(), AesGcmParameters.class, ProtoParametersSerialization.class);
        PARAMETERS_PARSER = ParametersParser.create(new f(), bytesFromPrintableAscii, ProtoParametersSerialization.class);
        KEY_SERIALIZER = KeySerializer.create(new g(), AesGcmKey.class, ProtoKeySerialization.class);
        KEY_PARSER = KeyParser.create(new h(), bytesFromPrintableAscii, ProtoKeySerialization.class);
    }

    private AesGcmProtoSerialization() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AesGcmKey parseKey(ProtoKeySerialization protoKeySerialization, SecretKeyAccess secretKeyAccess) throws GeneralSecurityException {
        if (protoKeySerialization.getTypeUrl().equals(TYPE_URL)) {
            try {
                com.google.crypto.tink.proto.AesGcmKey parseFrom = com.google.crypto.tink.proto.AesGcmKey.parseFrom(protoKeySerialization.getValue(), ExtensionRegistryLite.getEmptyRegistry());
                if (parseFrom.getVersion() == 0) {
                    return AesGcmKey.builder().setParameters(AesGcmParameters.builder().setKeySizeBytes(parseFrom.getKeyValue().size()).setIvSizeBytes(12).setTagSizeBytes(16).setVariant(toVariant(protoKeySerialization.getOutputPrefixType())).build()).setKeyBytes(SecretBytes.copyFrom(parseFrom.getKeyValue().toByteArray(), SecretKeyAccess.requireAccess(secretKeyAccess))).setIdRequirement(protoKeySerialization.getIdRequirementOrNull()).build();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (InvalidProtocolBufferException unused) {
                throw new GeneralSecurityException("Parsing AesGcmKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AesGcmParameters parseParameters(ProtoParametersSerialization protoParametersSerialization) throws GeneralSecurityException {
        if (protoParametersSerialization.getKeyTemplate().getTypeUrl().equals(TYPE_URL)) {
            try {
                return AesGcmParameters.builder().setKeySizeBytes(AesGcmKeyFormat.parseFrom(protoParametersSerialization.getKeyTemplate().getValue(), ExtensionRegistryLite.getEmptyRegistry()).getKeySize()).setIvSizeBytes(12).setTagSizeBytes(16).setVariant(toVariant(protoParametersSerialization.getKeyTemplate().getOutputPrefixType())).build();
            } catch (InvalidProtocolBufferException e) {
                throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters: " + protoParametersSerialization.getKeyTemplate().getTypeUrl());
    }

    public static void register() throws GeneralSecurityException {
        register(MutableSerializationRegistry.globalInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ProtoKeySerialization serializeKey(AesGcmKey aesGcmKey, SecretKeyAccess secretKeyAccess) throws GeneralSecurityException {
        validateParameters(aesGcmKey.getParameters());
        return ProtoKeySerialization.create(TYPE_URL, com.google.crypto.tink.proto.AesGcmKey.newBuilder().setKeyValue(ByteString.copyFrom(aesGcmKey.getKeyBytes().toByteArray(SecretKeyAccess.requireAccess(secretKeyAccess)))).build().toByteString(), KeyData.KeyMaterialType.SYMMETRIC, toProtoOutputPrefixType(aesGcmKey.getParameters().getVariant()), aesGcmKey.getIdRequirementOrNull());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ProtoParametersSerialization serializeParameters(AesGcmParameters aesGcmParameters) throws GeneralSecurityException {
        validateParameters(aesGcmParameters);
        return ProtoParametersSerialization.create(KeyTemplate.newBuilder().setTypeUrl(TYPE_URL).setValue(AesGcmKeyFormat.newBuilder().setKeySize(aesGcmParameters.getKeySizeBytes()).build().toByteString()).setOutputPrefixType(toProtoOutputPrefixType(aesGcmParameters.getVariant())).build());
    }

    private static OutputPrefixType toProtoOutputPrefixType(AesGcmParameters.Variant variant) throws GeneralSecurityException {
        if (AesGcmParameters.Variant.TINK.equals(variant)) {
            return OutputPrefixType.TINK;
        }
        if (AesGcmParameters.Variant.CRUNCHY.equals(variant)) {
            return OutputPrefixType.CRUNCHY;
        }
        if (AesGcmParameters.Variant.NO_PREFIX.equals(variant)) {
            return OutputPrefixType.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + variant);
    }

    private static AesGcmParameters.Variant toVariant(OutputPrefixType outputPrefixType) throws GeneralSecurityException {
        int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[outputPrefixType.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i == 4) {
                    return AesGcmParameters.Variant.NO_PREFIX;
                }
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
            }
            return AesGcmParameters.Variant.CRUNCHY;
        }
        return AesGcmParameters.Variant.TINK;
    }

    private static void validateParameters(AesGcmParameters aesGcmParameters) throws GeneralSecurityException {
        if (aesGcmParameters.getTagSizeBytes() == 16) {
            if (aesGcmParameters.getIvSizeBytes() == 12) {
                return;
            }
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(aesGcmParameters.getIvSizeBytes())));
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(aesGcmParameters.getTagSizeBytes())));
    }

    public static void register(MutableSerializationRegistry mutableSerializationRegistry) throws GeneralSecurityException {
        mutableSerializationRegistry.registerParametersSerializer(PARAMETERS_SERIALIZER);
        mutableSerializationRegistry.registerParametersParser(PARAMETERS_PARSER);
        mutableSerializationRegistry.registerKeySerializer(KEY_SERIALIZER);
        mutableSerializationRegistry.registerKeyParser(KEY_PARSER);
    }
}
