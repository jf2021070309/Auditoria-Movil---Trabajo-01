package ch.qos.logback.core.net.ssl;

import ch.qos.logback.core.spi.ContextAware;
import e.a.d.a.a;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
/* loaded from: classes.dex */
public class SSLContextFactoryBean {
    private static final String JSSE_KEY_STORE_PROPERTY = "javax.net.ssl.keyStore";
    private static final String JSSE_TRUST_STORE_PROPERTY = "javax.net.ssl.trustStore";
    private KeyManagerFactoryFactoryBean keyManagerFactory;
    private KeyStoreFactoryBean keyStore;
    private String protocol;
    private String provider;
    private SecureRandomFactoryBean secureRandom;
    private TrustManagerFactoryFactoryBean trustManagerFactory;
    private KeyStoreFactoryBean trustStore;

    private KeyManager[] createKeyManagers(ContextAware contextAware) throws NoSuchProviderException, NoSuchAlgorithmException, UnrecoverableKeyException, KeyStoreException {
        if (getKeyStore() == null) {
            return null;
        }
        KeyStore createKeyStore = getKeyStore().createKeyStore();
        StringBuilder y = a.y("key store of type '");
        y.append(createKeyStore.getType());
        y.append("' provider '");
        y.append(createKeyStore.getProvider());
        y.append("': ");
        y.append(getKeyStore().getLocation());
        contextAware.addInfo(y.toString());
        KeyManagerFactory createKeyManagerFactory = getKeyManagerFactory().createKeyManagerFactory();
        StringBuilder y2 = a.y("key manager algorithm '");
        y2.append(createKeyManagerFactory.getAlgorithm());
        y2.append("' provider '");
        y2.append(createKeyManagerFactory.getProvider());
        y2.append("'");
        contextAware.addInfo(y2.toString());
        createKeyManagerFactory.init(createKeyStore, getKeyStore().getPassword().toCharArray());
        return createKeyManagerFactory.getKeyManagers();
    }

    private SecureRandom createSecureRandom(ContextAware contextAware) throws NoSuchProviderException, NoSuchAlgorithmException {
        SecureRandom createSecureRandom = getSecureRandom().createSecureRandom();
        StringBuilder y = a.y("secure random algorithm '");
        y.append(createSecureRandom.getAlgorithm());
        y.append("' provider '");
        y.append(createSecureRandom.getProvider());
        y.append("'");
        contextAware.addInfo(y.toString());
        return createSecureRandom;
    }

    private TrustManager[] createTrustManagers(ContextAware contextAware) throws NoSuchProviderException, NoSuchAlgorithmException, KeyStoreException {
        if (getTrustStore() == null) {
            return null;
        }
        KeyStore createKeyStore = getTrustStore().createKeyStore();
        StringBuilder y = a.y("trust store of type '");
        y.append(createKeyStore.getType());
        y.append("' provider '");
        y.append(createKeyStore.getProvider());
        y.append("': ");
        y.append(getTrustStore().getLocation());
        contextAware.addInfo(y.toString());
        TrustManagerFactory createTrustManagerFactory = getTrustManagerFactory().createTrustManagerFactory();
        StringBuilder y2 = a.y("trust manager algorithm '");
        y2.append(createTrustManagerFactory.getAlgorithm());
        y2.append("' provider '");
        y2.append(createTrustManagerFactory.getProvider());
        y2.append("'");
        contextAware.addInfo(y2.toString());
        createTrustManagerFactory.init(createKeyStore);
        return createTrustManagerFactory.getTrustManagers();
    }

    private KeyStoreFactoryBean keyStoreFromSystemProperties(String str) {
        if (System.getProperty(str) == null) {
            return null;
        }
        KeyStoreFactoryBean keyStoreFactoryBean = new KeyStoreFactoryBean();
        keyStoreFactoryBean.setLocation(locationFromSystemProperty(str));
        keyStoreFactoryBean.setProvider(System.getProperty(str + "Provider"));
        keyStoreFactoryBean.setPassword(System.getProperty(str + "Password"));
        keyStoreFactoryBean.setType(System.getProperty(str + "Type"));
        return keyStoreFactoryBean;
    }

    private String locationFromSystemProperty(String str) {
        String property = System.getProperty(str);
        return (property == null || property.startsWith("file:")) ? property : a.k("file:", property);
    }

    public SSLContext createContext(ContextAware contextAware) throws NoSuchProviderException, NoSuchAlgorithmException, KeyManagementException, UnrecoverableKeyException, KeyStoreException, CertificateException {
        SSLContext sSLContext = getProvider() != null ? SSLContext.getInstance(getProtocol(), getProvider()) : SSLContext.getInstance(getProtocol());
        StringBuilder y = a.y("SSL protocol '");
        y.append(sSLContext.getProtocol());
        y.append("' provider '");
        y.append(sSLContext.getProvider());
        y.append("'");
        contextAware.addInfo(y.toString());
        sSLContext.init(createKeyManagers(contextAware), createTrustManagers(contextAware), createSecureRandom(contextAware));
        return sSLContext;
    }

    public KeyManagerFactoryFactoryBean getKeyManagerFactory() {
        KeyManagerFactoryFactoryBean keyManagerFactoryFactoryBean = this.keyManagerFactory;
        return keyManagerFactoryFactoryBean == null ? new KeyManagerFactoryFactoryBean() : keyManagerFactoryFactoryBean;
    }

    public KeyStoreFactoryBean getKeyStore() {
        if (this.keyStore == null) {
            this.keyStore = keyStoreFromSystemProperties(JSSE_KEY_STORE_PROPERTY);
        }
        return this.keyStore;
    }

    public String getProtocol() {
        String str = this.protocol;
        return str == null ? SSL.DEFAULT_PROTOCOL : str;
    }

    public String getProvider() {
        return this.provider;
    }

    public SecureRandomFactoryBean getSecureRandom() {
        SecureRandomFactoryBean secureRandomFactoryBean = this.secureRandom;
        return secureRandomFactoryBean == null ? new SecureRandomFactoryBean() : secureRandomFactoryBean;
    }

    public TrustManagerFactoryFactoryBean getTrustManagerFactory() {
        TrustManagerFactoryFactoryBean trustManagerFactoryFactoryBean = this.trustManagerFactory;
        return trustManagerFactoryFactoryBean == null ? new TrustManagerFactoryFactoryBean() : trustManagerFactoryFactoryBean;
    }

    public KeyStoreFactoryBean getTrustStore() {
        if (this.trustStore == null) {
            this.trustStore = keyStoreFromSystemProperties(JSSE_TRUST_STORE_PROPERTY);
        }
        return this.trustStore;
    }

    public void setKeyManagerFactory(KeyManagerFactoryFactoryBean keyManagerFactoryFactoryBean) {
        this.keyManagerFactory = keyManagerFactoryFactoryBean;
    }

    public void setKeyStore(KeyStoreFactoryBean keyStoreFactoryBean) {
        this.keyStore = keyStoreFactoryBean;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setProvider(String str) {
        this.provider = str;
    }

    public void setSecureRandom(SecureRandomFactoryBean secureRandomFactoryBean) {
        this.secureRandom = secureRandomFactoryBean;
    }

    public void setTrustManagerFactory(TrustManagerFactoryFactoryBean trustManagerFactoryFactoryBean) {
        this.trustManagerFactory = trustManagerFactoryFactoryBean;
    }

    public void setTrustStore(KeyStoreFactoryBean keyStoreFactoryBean) {
        this.trustStore = keyStoreFactoryBean;
    }
}
