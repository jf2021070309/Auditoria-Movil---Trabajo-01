package e.d.d.u.q;

import e.d.d.g;
import e.d.d.u.q.a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class c {
    public final File a;

    /* renamed from: b  reason: collision with root package name */
    public final g f7608b;

    /* loaded from: classes2.dex */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public c(g gVar) {
        gVar.a();
        File filesDir = gVar.f7040d.getFilesDir();
        StringBuilder y = e.a.d.a.a.y("PersistedInstallation.");
        y.append(gVar.d());
        y.append(".json");
        this.a = new File(filesDir, y.toString());
        this.f7608b = gVar;
    }

    public d a(d dVar) {
        File createTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", dVar.c());
            jSONObject.put("Status", dVar.f().ordinal());
            jSONObject.put("AuthToken", dVar.a());
            jSONObject.put("RefreshToken", dVar.e());
            jSONObject.put("TokenCreationEpochInSecs", dVar.g());
            jSONObject.put("ExpiresInSecs", dVar.b());
            jSONObject.put("FisError", dVar.d());
            g gVar = this.f7608b;
            gVar.a();
            createTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.f7040d.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (createTempFile.renameTo(this.a)) {
            return dVar;
        }
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    }

    public d b() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(this.a);
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        a aVar = a.ATTEMPT_MIGRATION;
        int optInt = jSONObject.optInt("Status", aVar.ordinal());
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i2 = d.a;
        a.b bVar = new a.b();
        bVar.d(0L);
        bVar.b(aVar);
        bVar.c(0L);
        bVar.a = optString;
        bVar.b(a.values()[optInt]);
        bVar.f7601c = optString2;
        bVar.f7602d = optString3;
        bVar.d(optLong);
        bVar.c(optLong2);
        bVar.f7605g = optString4;
        return bVar.a();
    }
}
