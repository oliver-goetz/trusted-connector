package de.fhg.aisec.ids.idscp2.drivers.interfaces;

import de.fhg.aisec.ids.idscp2.idscp_core.finite_state_machine.FsmListener;

/**
 * An interface for the remote attestation verifier driver that is used for verifying provers system sate
 *
 * @author Leon Beckmann (leon.beckmann@aisec.fraunhofer.de)
 */
public interface RatVerifierDriver {
    RatVerifierInstance start(FsmListener fsmListener);
}