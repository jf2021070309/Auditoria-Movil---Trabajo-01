package com.google.firebase.installations.local;

import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.firebase.FirebaseApp;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import okhttp3.internal.http2.Http2;
import org.apache.commons.codec.binary.Hex;
/* loaded from: classes4.dex */
public class PersistedInstallation {
    private static final String AUTH_TOKEN_KEY = "AuthToken";
    private static final String EXPIRES_IN_SECONDS_KEY = "ExpiresInSecs";
    private static final String FIREBASE_INSTALLATION_ID_KEY = "Fid";
    private static final String FIS_ERROR_KEY = "FisError";
    private static final String PERSISTED_STATUS_KEY = "Status";
    private static final String REFRESH_TOKEN_KEY = "RefreshToken";
    private static final String SETTINGS_FILE_NAME_PREFIX = "PersistedInstallation";
    private static final String TOKEN_CREATION_TIME_IN_SECONDS_KEY = "TokenCreationEpochInSecs";
    private File dataFile;
    private final FirebaseApp firebaseApp;

    /* loaded from: classes4.dex */
    public enum RegistrationStatus {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public PersistedInstallation(FirebaseApp firebaseApp) {
        this.firebaseApp = firebaseApp;
    }

    private File getDataFile() {
        if (this.dataFile == null) {
            synchronized (this) {
                if (this.dataFile == null) {
                    File filesDir = this.firebaseApp.getApplicationContext().getFilesDir();
                    this.dataFile = new File(filesDir, "PersistedInstallation." + this.firebaseApp.getPersistenceKey() + ".json");
                }
            }
        }
        return this.dataFile;
    }

    private c readJSONFromFile() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
        try {
            FileInputStream fileInputStream = new FileInputStream(getDataFile());
            while (true) {
                int read = fileInputStream.read(bArr, 0, Http2.INITIAL_MAX_FRAME_SIZE);
                if (read < 0) {
                    c cVar = new c(byteArrayOutputStream.toString());
                    fileInputStream.close();
                    return cVar;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (b | IOException unused) {
            return new c();
        }
    }

    public void clearForTesting() {
        getDataFile().delete();
    }

    public PersistedInstallationEntry insertOrUpdatePersistedInstallationEntry(PersistedInstallationEntry persistedInstallationEntry) {
        File createTempFile;
        try {
            c cVar = new c();
            cVar.put(FIREBASE_INSTALLATION_ID_KEY, persistedInstallationEntry.getFirebaseInstallationId());
            cVar.put(PERSISTED_STATUS_KEY, persistedInstallationEntry.getRegistrationStatus().ordinal());
            cVar.put(AUTH_TOKEN_KEY, persistedInstallationEntry.getAuthToken());
            cVar.put(REFRESH_TOKEN_KEY, persistedInstallationEntry.getRefreshToken());
            cVar.put(TOKEN_CREATION_TIME_IN_SECONDS_KEY, persistedInstallationEntry.getTokenCreationEpochInSecs());
            cVar.put(EXPIRES_IN_SECONDS_KEY, persistedInstallationEntry.getExpiresInSecs());
            cVar.put(FIS_ERROR_KEY, persistedInstallationEntry.getFisError());
            createTempFile = File.createTempFile(SETTINGS_FILE_NAME_PREFIX, "tmp", this.firebaseApp.getApplicationContext().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(cVar.toString().getBytes(Hex.DEFAULT_CHARSET_NAME));
            fileOutputStream.close();
        } catch (b | IOException unused) {
        }
        if (!createTempFile.renameTo(getDataFile())) {
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        }
        return persistedInstallationEntry;
    }

    public PersistedInstallationEntry readPersistedInstallationEntryValue() {
        c readJSONFromFile = readJSONFromFile();
        String optString = readJSONFromFile.optString(FIREBASE_INSTALLATION_ID_KEY, null);
        int optInt = readJSONFromFile.optInt(PERSISTED_STATUS_KEY, RegistrationStatus.ATTEMPT_MIGRATION.ordinal());
        String optString2 = readJSONFromFile.optString(AUTH_TOKEN_KEY, null);
        String optString3 = readJSONFromFile.optString(REFRESH_TOKEN_KEY, null);
        long optLong = readJSONFromFile.optLong(TOKEN_CREATION_TIME_IN_SECONDS_KEY, 0L);
        long optLong2 = readJSONFromFile.optLong(EXPIRES_IN_SECONDS_KEY, 0L);
        return PersistedInstallationEntry.builder().setFirebaseInstallationId(optString).setRegistrationStatus(RegistrationStatus.values()[optInt]).setAuthToken(optString2).setRefreshToken(optString3).setTokenCreationEpochInSecs(optLong).setExpiresInSecs(optLong2).setFisError(readJSONFromFile.optString(FIS_ERROR_KEY, null)).build();
    }
}
