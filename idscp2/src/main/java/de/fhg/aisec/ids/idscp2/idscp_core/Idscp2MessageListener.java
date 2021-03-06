package de.fhg.aisec.ids.idscp2.idscp_core;

/**
 * An interface for an IDSCP message listener
 */
public interface Idscp2MessageListener {

    /*
     * notify the listener about new data
     */
    void onMessage(Idscp2Connection connection, String type, byte[] data);
}
