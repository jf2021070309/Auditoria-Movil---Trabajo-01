package ch.qos.logback.core.net.ssl;

import e.a.d.a.a;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
/* loaded from: classes.dex */
public class SecureRandomFactoryBean {
    private String algorithm;
    private String provider;

    public SecureRandom createSecureRandom() throws NoSuchProviderException, NoSuchAlgorithmException {
        try {
            return getProvider() != null ? SecureRandom.getInstance(getAlgorithm(), getProvider()) : SecureRandom.getInstance(getAlgorithm());
        } catch (NoSuchAlgorithmException unused) {
            StringBuilder y = a.y("no such secure random algorithm: ");
            y.append(getAlgorithm());
            throw new NoSuchAlgorithmException(y.toString());
        } catch (NoSuchProviderException unused2) {
            StringBuilder y2 = a.y("no such secure random provider: ");
            y2.append(getProvider());
            throw new NoSuchProviderException(y2.toString());
        }
    }

    public String getAlgorithm() {
        String str = this.algorithm;
        return str == null ? SSL.DEFAULT_SECURE_RANDOM_ALGORITHM : str;
    }

    public String getProvider() {
        return this.provider;
    }

    public void setAlgorithm(String str) {
        this.algorithm = str;
    }

    public void setProvider(String str) {
        this.provider = str;
    }
}
