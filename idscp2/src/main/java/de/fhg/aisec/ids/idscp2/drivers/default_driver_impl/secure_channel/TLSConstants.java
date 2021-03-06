package de.fhg.aisec.ids.idscp2.drivers.default_driver_impl.secure_channel;

/**
 * TLS Constants
 *
 * @author Leon Beckmann (leon.beckmann@aisec.fraunhofer.de)
 */
public final class TLSConstants {

    // Used TLS version
    public static final String TLS_INSTANCE = "TLSv1.3";

    // Enabled encryption protocols
    public static final String[] TLS_ENABLED_PROTOCOLS = { TLS_INSTANCE };

    // Acceptable TLS ciphers
    public static final String[] TLS_ENABLED_CIPHERS = {
//            "TLS_AES_128_GCM_SHA256",
            "TLS_AES_256_GCM_SHA384",
            "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384",
//            "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256",
            "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384",
//            "TLS_RSA_WITH_AES_256_GCM_SHA384",
//            "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384",
//            "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384",
            "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384",
//            "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384",
//            "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256",
//            "TLS_RSA_WITH_AES_128_GCM_SHA256",
//            "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256",
//            "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256",
//            "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256",
//            "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256",
//            "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384",
//            "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384",
//            "TLS_RSA_WITH_AES_256_CBC_SHA256",
//            "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384",
//            "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384",
//            "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256",
//            "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256",
//            "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA",
//            "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA",
//            "TLS_RSA_WITH_AES_256_CBC_SHA",
//            "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA",
//            "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA",
//            "TLS_DHE_RSA_WITH_AES_256_CBC_SHA",
//            "TLS_DHE_DSS_WITH_AES_256_CBC_SHA",
//            "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256",
//            "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256",
//            "TLS_RSA_WITH_AES_128_CBC_SHA256",
//            "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256",
//            "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256",
//            "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256",
//            "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256",
//            "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA",
//            "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA",
//            "TLS_RSA_WITH_AES_128_CBC_SHA",
//            "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA",
//            "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA",
//            "TLS_DHE_RSA_WITH_AES_128_CBC_SHA",
//            "TLS_DHE_DSS_WITH_AES_128_CBC_SHA",
//            "TLS_EMPTY_RENEGOTIATION_INFO_SCSV"
    };

    private TLSConstants() {
    }
}
