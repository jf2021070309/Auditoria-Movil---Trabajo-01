package com.google.firebase.crashlytics.internal.common;

import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.codec.binary.Hex;
/* loaded from: classes4.dex */
class MetaDataStore {
    private static final String INTERNAL_KEYDATA_FILENAME = "internal-keys";
    private static final String KEYDATA_FILENAME = "keys";
    private static final String KEY_USER_ID = "userId";
    private static final String USERDATA_FILENAME = "user-data";
    private static final Charset UTF_8 = Charset.forName(Hex.DEFAULT_CHARSET_NAME);
    private final FileStore fileStore;

    public MetaDataStore(FileStore fileStore) {
        this.fileStore = fileStore;
    }

    private static Map<String, String> jsonToKeysData(String str) throws b {
        c cVar = new c(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = cVar.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, valueOrNull(cVar, next));
        }
        return hashMap;
    }

    private static UserMetadata jsonToUserData(String str) throws b {
        c cVar = new c(str);
        UserMetadata userMetadata = new UserMetadata();
        userMetadata.setUserId(valueOrNull(cVar, KEY_USER_ID));
        return userMetadata;
    }

    private static String keysDataToJson(Map<String, String> map) throws b {
        return new c((Map<?, ?>) map).toString();
    }

    private static String userDataToJson(UserMetadata userMetadata) throws b {
        return new c() { // from class: com.google.firebase.crashlytics.internal.common.MetaDataStore.1
            {
                put(MetaDataStore.KEY_USER_ID, UserMetadata.this.getUserId());
            }
        }.toString();
    }

    private static String valueOrNull(c cVar, String str) {
        if (cVar.isNull(str)) {
            return null;
        }
        return cVar.optString(str, null);
    }

    public File getInternalKeysFileForSession(String str) {
        return this.fileStore.getSessionFile(str, INTERNAL_KEYDATA_FILENAME);
    }

    public File getKeysFileForSession(String str) {
        return this.fileStore.getSessionFile(str, KEYDATA_FILENAME);
    }

    public File getUserDataFileForSession(String str) {
        return this.fileStore.getSessionFile(str, USERDATA_FILENAME);
    }

    public Map<String, String> readKeyData(String str) {
        return readKeyData(str, false);
    }

    public UserMetadata readUserData(String str) {
        FileInputStream fileInputStream;
        File userDataFileForSession = getUserDataFileForSession(str);
        if (!userDataFileForSession.exists()) {
            return new UserMetadata();
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(userDataFileForSession);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            UserMetadata jsonToUserData = jsonToUserData(CommonUtils.streamToString(fileInputStream));
            CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
            return jsonToUserData;
        } catch (Exception e2) {
            e = e2;
            fileInputStream2 = fileInputStream;
            Logger.getLogger().e("Error deserializing user metadata.", e);
            CommonUtils.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
            return new UserMetadata();
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            CommonUtils.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public void writeKeyData(String str, Map<String, String> map) {
        writeKeyData(str, map, false);
    }

    public void writeUserData(String str, UserMetadata userMetadata) {
        String userDataToJson;
        BufferedWriter bufferedWriter;
        File userDataFileForSession = getUserDataFileForSession(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                userDataToJson = userDataToJson(userMetadata);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(userDataFileForSession), UTF_8));
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(userDataToJson);
            bufferedWriter.flush();
            CommonUtils.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e2) {
            e = e2;
            bufferedWriter2 = bufferedWriter;
            Logger.getLogger().e("Error serializing user metadata.", e);
            CommonUtils.closeOrLog(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            CommonUtils.closeOrLog(bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public Map<String, String> readKeyData(String str, boolean z) {
        FileInputStream fileInputStream;
        File internalKeysFileForSession = z ? getInternalKeysFileForSession(str) : getKeysFileForSession(str);
        if (!internalKeysFileForSession.exists()) {
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(internalKeysFileForSession);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            Map<String, String> jsonToKeysData = jsonToKeysData(CommonUtils.streamToString(fileInputStream));
            CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
            return jsonToKeysData;
        } catch (Exception e2) {
            e = e2;
            fileInputStream2 = fileInputStream;
            Logger.getLogger().e("Error deserializing user metadata.", e);
            CommonUtils.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
            return Collections.emptyMap();
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            CommonUtils.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public void writeKeyData(String str, Map<String, String> map, boolean z) {
        String keysDataToJson;
        BufferedWriter bufferedWriter;
        File internalKeysFileForSession = z ? getInternalKeysFileForSession(str) : getKeysFileForSession(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                keysDataToJson = keysDataToJson(map);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(internalKeysFileForSession), UTF_8));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            bufferedWriter.write(keysDataToJson);
            bufferedWriter.flush();
            CommonUtils.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e2) {
            e = e2;
            bufferedWriter2 = bufferedWriter;
            Logger.getLogger().e("Error serializing key/value metadata.", e);
            CommonUtils.closeOrLog(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            CommonUtils.closeOrLog(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }
}
