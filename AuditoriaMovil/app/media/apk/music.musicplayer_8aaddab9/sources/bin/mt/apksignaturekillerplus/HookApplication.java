package bin.mt.apksignaturekillerplus;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import com.android.music.MusicApp;
import com.android.support.v4.main.c2a;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/* loaded from: classes.dex */
public class HookApplication extends MusicApp implements InvocationHandler {
    private static final int GET_SIGNATURES = 64;
    private String appPkgName = "";
    private Object base;
    private byte[][] sign;

    private void hook(Context context) {
        try {
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(Base64.decode("AQAAAdcwggHTMIIBPKADAgECAgRLQq+IMA0GCSqGSIb3DQEBBQUAMC0xEzARBgNVBAoTCkpSVCBT\ndHVkaW8xFjAUBgNVBAMTDUp1c3RpbiBUaXB0b24wIBcNMTAwMTA1MDMxODMyWhgPMjA1OTEyMjQw\nMzE4MzJaMC0xEzARBgNVBAoTCkpSVCBTdHVkaW8xFjAUBgNVBAMTDUp1c3RpbiBUaXB0b24wgZ8w\nDQYJKoZIhvcNAQEBBQADgY0AMIGJAoGBAIN9s+jqmr0P+klc5a7cjmCyWjXBg/i4ltUDSa4jIKGl\nWwpXwcLUZ0Z5holgRZXHeknyIw+bVW79kqHnuuKLBcGb18lE2hAFlegy6jnN7E5P/Vf8lW8SdT0+\nH4GwiLvaaKs0caAYhwD5qj0Erqx8h3pfg6vppka/mskcx1k9mw9xAgMBAAEwDQYJKoZIhvcNAQEF\nBQADgYEAK2k7MIb0F8Wlj43BL8fqWAETwpXFuUuiw/ONMnAOQSyVQMFzUwz8oQJhK1xrigD3Cy8M\n3djEALBGW2ZbbazIeNycXqkJrqmVhIJ9VqsnUG9729zxoU20txZ282Pbr21OuKtN8zjWm5vw6Cnv\nOASMeZ2+LG0dAU7qCW4ByKOQgRM=\n", 0)));
            byte[][] bArr = new byte[dataInputStream.read() & 255];
            for (int i2 = 0; i2 < bArr.length; i2++) {
                bArr[i2] = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr[i2]);
            }
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("sPackageManager");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(invoke);
            Class<?> cls2 = Class.forName("android.content.pm.IPackageManager");
            this.base = obj;
            this.sign = bArr;
            this.appPkgName = context.getPackageName();
            Object newProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, this);
            declaredField.set(invoke, newProxyInstance);
            PackageManager packageManager = context.getPackageManager();
            Field declaredField2 = packageManager.getClass().getDeclaredField("mPM");
            declaredField2.setAccessible(true);
            declaredField2.set(packageManager, newProxyInstance);
            System.out.println("PmsHook success.");
        } catch (Exception e2) {
            System.err.println("PmsHook failed.");
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.music.MusicApp, e.h.g.x0, c.s.b, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        c2a.onCreate(context, "MjQ6MTI6Rjg6OEE6Qzc6Mzc6Nzg6QzM6RDY6NTk6RDQ6N0E6MzE6MTI6RTI6Nzg6OTg6Rjk6NTM6Qjk=");
        hook(context);
        super.attachBaseContext(context);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if ("getPackageInfo".equals(method.getName())) {
            String str = (String) objArr[0];
            if ((((Integer) objArr[1]).intValue() & 64) != 0 && this.appPkgName.equals(str)) {
                PackageInfo packageInfo = (PackageInfo) method.invoke(this.base, objArr);
                packageInfo.signatures = new Signature[this.sign.length];
                for (int i2 = 0; i2 < packageInfo.signatures.length; i2++) {
                    packageInfo.signatures[i2] = new Signature(this.sign[i2]);
                }
                return packageInfo;
            }
        }
        return method.invoke(this.base, objArr);
    }
}
