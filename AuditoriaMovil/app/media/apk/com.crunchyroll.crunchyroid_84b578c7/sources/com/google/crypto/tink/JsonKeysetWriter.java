package com.google.crypto.tink;

import com.google.crypto.tink.proto.EncryptedKeyset;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.KeysetInfo;
import com.google.crypto.tink.subtle.Base64;
import com.google.errorprone.annotations.InlineMe;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.file.Path;
import org.apache.commons.codec.binary.Hex;
/* loaded from: classes4.dex */
public final class JsonKeysetWriter implements KeysetWriter {
    private static final Charset UTF_8 = Charset.forName(Hex.DEFAULT_CHARSET_NAME);
    private final OutputStream outputStream;

    private JsonKeysetWriter(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    private JsonObject toJson(Keyset keyset) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("primaryKeyId", Long.valueOf(toUnsignedLong(keyset.getPrimaryKeyId())));
        JsonArray jsonArray = new JsonArray();
        for (Keyset.Key key : keyset.getKeyList()) {
            jsonArray.add(toJson(key));
        }
        jsonObject.add("key", jsonArray);
        return jsonObject;
    }

    private long toUnsignedLong(int i) {
        return i & 4294967295L;
    }

    @InlineMe(imports = {"com.google.crypto.tink.JsonKeysetWriter", "java.io.FileOutputStream"}, replacement = "JsonKeysetWriter.withOutputStream(new FileOutputStream(file))")
    @Deprecated
    public static KeysetWriter withFile(File file) throws IOException {
        return withOutputStream(new FileOutputStream(file));
    }

    public static KeysetWriter withOutputStream(OutputStream outputStream) {
        return new JsonKeysetWriter(outputStream);
    }

    @InlineMe(imports = {"com.google.crypto.tink.JsonKeysetWriter", "java.io.File", "java.io.FileOutputStream"}, replacement = "JsonKeysetWriter.withOutputStream(new FileOutputStream(new File(path)))")
    @Deprecated
    public static KeysetWriter withPath(String str) throws IOException {
        return withOutputStream(new FileOutputStream(new File(str)));
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public void write(Keyset keyset) throws IOException {
        try {
            try {
                OutputStream outputStream = this.outputStream;
                String jsonElement = toJson(keyset).toString();
                Charset charset = UTF_8;
                outputStream.write(jsonElement.getBytes(charset));
                this.outputStream.write(System.lineSeparator().getBytes(charset));
            } catch (JsonParseException e) {
                throw new IOException(e);
            }
        } finally {
            this.outputStream.close();
        }
    }

    @InlineMe(imports = {"com.google.crypto.tink.JsonKeysetWriter", "java.io.FileOutputStream"}, replacement = "JsonKeysetWriter.withOutputStream(new FileOutputStream(path.toFile()))")
    @Deprecated
    public static KeysetWriter withPath(Path path) throws IOException {
        return withOutputStream(new FileOutputStream(path.toFile()));
    }

    private JsonObject toJson(Keyset.Key key) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("keyData", toJson(key.getKeyData()));
        jsonObject.addProperty("status", key.getStatus().name());
        jsonObject.addProperty("keyId", Long.valueOf(toUnsignedLong(key.getKeyId())));
        jsonObject.addProperty("outputPrefixType", key.getOutputPrefixType().name());
        return jsonObject;
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public void write(EncryptedKeyset encryptedKeyset) throws IOException {
        OutputStream outputStream = this.outputStream;
        String jsonElement = toJson(encryptedKeyset).toString();
        Charset charset = UTF_8;
        outputStream.write(jsonElement.getBytes(charset));
        this.outputStream.write(System.lineSeparator().getBytes(charset));
        this.outputStream.close();
    }

    private JsonObject toJson(KeyData keyData) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("typeUrl", keyData.getTypeUrl());
        jsonObject.addProperty("value", Base64.encode(keyData.getValue().toByteArray()));
        jsonObject.addProperty("keyMaterialType", keyData.getKeyMaterialType().name());
        return jsonObject;
    }

    private JsonObject toJson(EncryptedKeyset encryptedKeyset) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("encryptedKeyset", Base64.encode(encryptedKeyset.getEncryptedKeyset().toByteArray()));
        jsonObject.add("keysetInfo", toJson(encryptedKeyset.getKeysetInfo()));
        return jsonObject;
    }

    private JsonObject toJson(KeysetInfo keysetInfo) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("primaryKeyId", Long.valueOf(toUnsignedLong(keysetInfo.getPrimaryKeyId())));
        JsonArray jsonArray = new JsonArray();
        for (KeysetInfo.KeyInfo keyInfo : keysetInfo.getKeyInfoList()) {
            jsonArray.add(toJson(keyInfo));
        }
        jsonObject.add("keyInfo", jsonArray);
        return jsonObject;
    }

    private JsonObject toJson(KeysetInfo.KeyInfo keyInfo) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("typeUrl", keyInfo.getTypeUrl());
        jsonObject.addProperty("status", keyInfo.getStatus().name());
        jsonObject.addProperty("keyId", Long.valueOf(toUnsignedLong(keyInfo.getKeyId())));
        jsonObject.addProperty("outputPrefixType", keyInfo.getOutputPrefixType().name());
        return jsonObject;
    }
}
