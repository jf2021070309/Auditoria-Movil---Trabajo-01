package com.google.crypto.tink;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.KeysetInfo;
import com.google.crypto.tink.proto.OutputPrefixType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import org.apache.commons.codec.binary.Hex;
/* loaded from: classes4.dex */
final class Util {
    public static final Charset UTF_8 = Charset.forName(Hex.DEFAULT_CHARSET_NAME);

    private Util() {
    }

    public static KeysetInfo.KeyInfo getKeyInfo(Keyset.Key key) {
        return KeysetInfo.KeyInfo.newBuilder().setTypeUrl(key.getKeyData().getTypeUrl()).setStatus(key.getStatus()).setOutputPrefixType(key.getOutputPrefixType()).setKeyId(key.getKeyId()).build();
    }

    public static KeysetInfo getKeysetInfo(Keyset keyset) {
        KeysetInfo.Builder primaryKeyId = KeysetInfo.newBuilder().setPrimaryKeyId(keyset.getPrimaryKeyId());
        for (Keyset.Key key : keyset.getKeyList()) {
            primaryKeyId.addKeyInfo(getKeyInfo(key));
        }
        return primaryKeyId.build();
    }

    public static byte[] readAll(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static void validateKey(Keyset.Key key) throws GeneralSecurityException {
        if (key.hasKeyData()) {
            if (key.getOutputPrefixType() != OutputPrefixType.UNKNOWN_PREFIX) {
                if (key.getStatus() != KeyStatusType.UNKNOWN_STATUS) {
                    return;
                }
                throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(key.getKeyId())));
            }
            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(key.getKeyId())));
        }
        throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(key.getKeyId())));
    }

    public static void validateKeyset(Keyset keyset) throws GeneralSecurityException {
        int primaryKeyId = keyset.getPrimaryKeyId();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (Keyset.Key key : keyset.getKeyList()) {
            if (key.getStatus() == KeyStatusType.ENABLED) {
                validateKey(key);
                if (key.getKeyId() == primaryKeyId) {
                    if (!z) {
                        z = true;
                    } else {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                }
                if (key.getKeyData().getKeyMaterialType() != KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
                i++;
            }
        }
        if (i != 0) {
            if (!z && !z2) {
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
            return;
        }
        throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
    }
}
