package com.google.crypto.tink.internal;

import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.errorprone.annotations.Immutable;
import java.util.Objects;
@Immutable
/* loaded from: classes4.dex */
public final class LegacyProtoParameters extends Parameters {
    private final ProtoParametersSerialization serialization;

    /* renamed from: com.google.crypto.tink.internal.LegacyProtoParameters$1  reason: invalid class name */
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
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public LegacyProtoParameters(ProtoParametersSerialization protoParametersSerialization) {
        this.serialization = protoParametersSerialization;
    }

    private static String outputPrefixToString(OutputPrefixType outputPrefixType) {
        int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[outputPrefixType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "UNKNOWN";
                    }
                    return "CRUNCHY";
                }
                return "RAW";
            }
            return "LEGACY";
        }
        return "TINK";
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LegacyProtoParameters)) {
            return false;
        }
        ProtoParametersSerialization protoParametersSerialization = ((LegacyProtoParameters) obj).serialization;
        if (!this.serialization.getKeyTemplate().getOutputPrefixType().equals(protoParametersSerialization.getKeyTemplate().getOutputPrefixType()) || !this.serialization.getKeyTemplate().getTypeUrl().equals(protoParametersSerialization.getKeyTemplate().getTypeUrl()) || !this.serialization.getKeyTemplate().getValue().equals(protoParametersSerialization.getKeyTemplate().getValue())) {
            return false;
        }
        return true;
    }

    public ProtoParametersSerialization getSerialization() {
        return this.serialization;
    }

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
        if (this.serialization.getKeyTemplate().getOutputPrefixType() != OutputPrefixType.RAW) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.serialization.getKeyTemplate(), this.serialization.getObjectIdentifier());
    }

    public String toString() {
        return String.format("(typeUrl=%s, outputPrefixType=%s)", this.serialization.getKeyTemplate().getTypeUrl(), outputPrefixToString(this.serialization.getKeyTemplate().getOutputPrefixType()));
    }
}
